package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Entity.Laptops;

@Repository
public interface LaptopsRepo extends JpaRepository<Laptops, Long>
{

}
