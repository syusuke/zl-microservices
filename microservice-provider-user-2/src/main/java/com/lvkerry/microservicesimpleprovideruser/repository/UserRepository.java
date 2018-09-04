package com.lvkerry.microservicesimpleprovideruser.repository;

import com.lvkerry.microservicesimpleprovideruser.enitty.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Kerry on 18/04/09
 */

public interface UserRepository extends JpaRepository<User, Long> {
}
