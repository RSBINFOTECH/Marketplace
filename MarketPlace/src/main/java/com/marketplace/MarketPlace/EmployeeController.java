package com.marketplace.MarketPlace;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.lang.NonNull;
@RestController
@Validated

public class EmployeeController {
	
	@GetMapping("/message/{msg}")
	public ResponseEntity<String> getmessage( @Valid @PathVariable(name = "msg", required = false) String msg)
	{
		//name = "param", required = true
		String msg1="Hello World"+msg;
		return new ResponseEntity<String>(msg1, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/valid-name/{name}")
	public String  createUsername(@PathVariable("name") @NotBlank @Size(max = 10) String username) {
	    
		
		System.out.println("nooo");
		
		
		return username;
		
	}
	
	
	  @GetMapping("/{id}")
	    public int validatedPath(@PathVariable("id") @Max(9) int id) 
	  {
	        return id;
	        
	    }
	    @ExceptionHandler
	    public String constraintViolationHandler(ConstraintViolationException ex) {
	        
	    	return ex.getConstraintViolations().iterator().next().getMessage();
	    }
	    
	    @GetMapping(value = "/api/{someInt}")
	    	public ResponseEntity<String> someRestApiMethod(@PathVariable @Valid @Min(0) @Digits(integer=10, fraction=0) int someInt) {

	    	    //...

	    	    return new ResponseEntity<String>("sample:"+someInt, HttpStatus.OK);
	    	}
	    
	  
	    
	@PostMapping("/post")
	public ResponseEntity<Employee> Postmessage(@RequestBody Employee employee )
	{
		
		Employee  employee2 = new Employee();
		employee2.setDept(employee.getDept());
		employee2.setName(employee.getName());
		employee2.setId(employee.getId());
		return new ResponseEntity<Employee>(employee2, HttpStatus.CREATED);
		
	}
}
