package com.omni.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omni.project.entity.Mobiles;
@Repository
public interface MobilesRepo extends JpaRepository<Mobiles, Long>
{

}

