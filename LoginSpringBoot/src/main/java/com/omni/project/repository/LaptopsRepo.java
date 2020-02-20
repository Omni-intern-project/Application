package com.omni.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omni.project.entity.Laptops;

@Repository
public interface LaptopsRepo extends JpaRepository<Laptops, Long>
{

}

