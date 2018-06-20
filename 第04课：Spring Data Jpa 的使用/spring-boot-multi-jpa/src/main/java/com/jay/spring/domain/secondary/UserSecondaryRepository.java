package com.jay.spring.domain.secondary;

import com.jay.spring.model.UserRep;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xiang.wei
 * @create 2018/6/14 18:49
 */
public interface UserSecondaryRepository extends JpaRepository<UserRep, Long> {
    UserRep findByUserName(String userName);
    UserRep findByUserNameOrEmail(String username, String email);
}
