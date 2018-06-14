package com.jay.spring.domain;

import com.jay.spring.model.UserRep;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xiang.wei
 * @create 2018/6/14 12:29
 */
public interface UserRepository extends JpaRepository<UserRep, Long> {
    UserRep findByUserName(String userName);

    UserRep findByUserNameOrEmail(String userName, String email);

}
