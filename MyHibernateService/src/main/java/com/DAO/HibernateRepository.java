package com.DAO;

import com.DTO.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.sql.DataSource;

public interface HibernateRepository extends JpaRepository<UserDetails,Integer> {

@Query(value = "select * from User_Details u where u.user_ID = ?1",nativeQuery = true)
    UserDetails findById(int userId);

}
