package com.knoldus.springboot.repository;

import com.knoldus.springboot.bean.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,String> {


}