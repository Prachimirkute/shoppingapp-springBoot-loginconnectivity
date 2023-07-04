package com.prachi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prachi.Repository.AlienRepository;
@Service
public class AlienService {
 @Autowired
 private AlienRepository repo;
 public Aliens saveAliens(Aliens aliens) {
	 return repo.save(aliens);
 }
// public Aliens fetchAliensByEmailId(String email) {
//	 return repo.findByEmailId(email);
// }
// public Aliens fetchAliensByEmailIAndPassword(String email, String password) {
//	 return repo.fetchAliensByEmailAndPassword(email, password); 
// }
}
