package com.prachi;
//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.prachi.Repository.AlienRepository;
//import com.prachi.DTO.AliensDTO;

@RestController

//@RequestMapping("/aliens")
public class AlienResource {
	@Autowired
	private AlienService service;
	
	@GetMapping("/singupAlien")
	@CrossOrigin(origins ="http://localhost:4200")
	public Aliens signupAliens(@RequestBody Aliens aliens) throws Exception{
	String tempEmailId = aliens.getEmailid();
//	if(tempEmailId!= null && !"".equals(tempEmailId)) {
//		Aliens Aliensobj = service.fetchAliensByEmailId(tempEmailId);
//		if(Aliensobj != null) {
//			throw new Exception("User with "+ tempEmailId+ " is already exist");
//		}
//	}
	Aliens AliensObj= null;
	AliensObj = service.saveAliens(aliens);
	return AliensObj;
}
	@PostMapping("/login")
	@CrossOrigin(origins ="http://localhost:4200")
	public Aliens loginAliens(@RequestBody Aliens aliens) throws Exception{
		String tempEmailId = aliens.getEmailid();
		String tempPass = aliens.getPassword();
		Aliens AliensObj= null;
//		if(tempEmailId!= null && tempPass!= null ) {
//			 AliensObj = service.fetchAliensByEmailIAndPassword(tempEmailId, tempPass);
//		}
		if(AliensObj==null) {
			throw new Exception("Bad credentials");
		}
		return AliensObj;
	}
}
//	@Autowired
//	AlienRepository Repo;
//   public List<Aliens> getAliens(){
//		List<Aliens> aliens = (List<Aliens>) Repo.findAll();
//	   List<Aliens> aliens = new ArrayList<>();
//	   Aliens a1 = new Aliens();
//	   a1.setName("Prachi");
//	   a1.setPoints(101);
//	   a1.setId(1);
//	   
//	   Aliens a2 = new Aliens();
//	   a2.setName("Prasad");
//	   a2.setPoints(102);
//	   a2.setId(2);
	   
//	   aliens.add(a1);
//	   aliens.add(a2);
	   
//	   return aliens;
//   }

