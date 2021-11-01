package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Application;

@Repository
public interface ApplicationDao extends JpaRepository<Application, Integer> {

}
