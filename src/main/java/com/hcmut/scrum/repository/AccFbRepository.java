package com.hcmut.scrum.repository;

import com.hcmut.scrum.model.AccFb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccFbRepository extends JpaRepository<AccFb, Long> {

}