package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Entity.Mobiles;
@Repository
public interface MobilesRepo extends JpaRepository<Mobiles, Long>
{

}
