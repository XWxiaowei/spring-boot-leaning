package com.jay.spring.domain.primary;

import com.jay.spring.model.UserRep;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xiang.wei
 * @create 2018/6/14 18:48
 */
public interface UserPrimaryRepository extends JpaRepository<UserRep, Long> {
    UserRep findByUserName(String userName);
    UserRep findByUserNameOrEmail(String username, String email);
}
