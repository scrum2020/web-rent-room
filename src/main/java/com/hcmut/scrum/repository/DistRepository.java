package com.hcmut.scrum.repository;

import com.hcmut.scrum.model.Dist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistRepository extends JpaRepository<Dist, Long> {

}