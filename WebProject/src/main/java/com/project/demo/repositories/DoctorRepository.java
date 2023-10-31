package com.project.demo.repositories;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.model.Doctor;



@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {
}

