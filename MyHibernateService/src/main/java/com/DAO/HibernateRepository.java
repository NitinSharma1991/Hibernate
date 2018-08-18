package com.DAO;

import com.DTO.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HibernateRepository extends JpaRepository<UserDetails,Integer> {
@Query(value = "select u from UserDetails u where u.userID = :userId",nativeQuery = true)
    UserDetails findById(int userId);

}
