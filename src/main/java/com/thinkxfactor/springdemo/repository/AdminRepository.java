package com.thinkxfactor.springdemo.repository;

import com.thinkxfactor.springdemo.entity.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
