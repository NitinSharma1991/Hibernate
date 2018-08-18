package com.Service;

import com.DAO.HibernateRepository;
import com.DAO.VechileDao;
import com.DTO.UserDetails;
import com.DTO.Vechile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HibernateService {
@Autowired
private HibernateRepository hibernateRepository;
@Autowired
private VechileDao vechileDao;
    public void addUserDetails(UserDetails userDetails) {
        userDetails.setUserDate(new Date());
        hibernateRepository.save(userDetails);
      //  System.out.println((hibernateRepository.findById(2).get().getUserName()));
    }

    public List<UserDetails> getUserDetails() {
        return  hibernateRepository.findAll();
    }

    public void addVechile(Vechile vechile) {

        vechileDao.save(vechile);
    }

   public UserDetails findById(int userId) {
        return hibernateRepository.findById(userId);

    }


}
