package trial.MyDetails.EntityClasses;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api")
public class MyDetailsController {

	@Autowired
	private DaoInterface repo;
	
	@GetMapping("/welcome")
	public String greeting()
	{
		return "Welcome Page";
	}
	
	@GetMapping("/all")
	public List<MyDetails> getAllMessages()
	{
		return repo.findAll();	
	}
	
	@GetMapping("/all/{id}")
	public Optional<MyDetails> getMessagebyId(@PathVariable int id)
	{
		return repo.findById(id);
	}
	
	@PostMapping("/myDetails")
	public MyDetails createMessage(@RequestBody MyDetails myDet)
	{
		repo.save(myDet);
		return myDet;
	}
	
	@PutMapping("/myDetails/{id}")
	public MyDetails updateMessage(@PathVariable("id") Integer id, @RequestBody MyDetails myDet)
	
	{
		myDet.setId(id);
		 repo.save(myDet);
		 return myDet;
		
	}
	
}
