package com.prachi.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.prachi.Aliens;

public interface AlienRepository extends JpaRepository<Aliens, Integer>{

//	public Aliens findByEmailId(String emailid);
//	public Aliens fetchAliensByEmailAndPassword(String emailid , String password);
}