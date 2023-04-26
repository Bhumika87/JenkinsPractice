package com.SignupFormJenkins.DAO;

import com.SignupFormJenkins.Entity.Employe;
import org.springframework.data.repository.CrudRepository;

public interface EmpDao extends CrudRepository<Employe,Integer> {

}
