package com.SignupFormJenkins.Service;

import com.SignupFormJenkins.DAO.EmpDao;
import com.SignupFormJenkins.Entity.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServ {
    @Autowired
    EmpDao empDao;

    public void saveData(Employe employe)
    {
        empDao.save(employe);
    }
}
