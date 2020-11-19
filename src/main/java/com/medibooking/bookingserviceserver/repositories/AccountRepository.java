package com.medibooking.bookingserviceserver.repositories;

import com.medibooking.bookingserviceserver.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query("select a from Account a join fetch a.authorities auths where a.username=:username")
    Account findByUsername(@Param("username") String username);

}
