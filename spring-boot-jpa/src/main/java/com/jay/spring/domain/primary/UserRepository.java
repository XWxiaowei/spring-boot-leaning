package com.jay.spring.domain.primary;

import com.jay.spring.model.UserRep;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author xiang.wei
 * @create 2018/6/14 12:29
 */
public interface UserRepository extends JpaRepository<UserRep, Long> {
    UserRep findByUserName(String userName);

    UserRep findByUserNameOrEmail(String userName, String email);

    @Override
    @Query("SELECT u FROM UserRep u")
    Page<UserRep> findAll(Pageable pageable);

    Page<UserRep> findByNickName(String nickName, Pageable pageable);

    /**
     * 限制查询
     *
     * @return
     */
    UserRep findFirstByOrderByLastNameAsc();

    UserRep findTopByOrderByAgeDesc();

    Page<UserRep> queryFirst10ByLastName(String lastName, Pageable pageable);

    @Transactional
    @Modifying
    @Query("update UserRep SET userName=?1 where id=?2")
    int modifyById(String userName, Long id);

    @Transactional
    @Modifying
    @Query("delete from UserRep where id = ?1")
    void deleteById(Long id);

    @Query("select u from UserRep u where u.email = ?1")
    UserRep findByEmail(String email);

    @Query("select u.userName,u.email,d.address,d.hobby from UserRep u,UserDetail d" +
            " where u.id=d.userId AND d.hobby=?1")
    List<UserInfo> findUserInfo(String hobby);

}
