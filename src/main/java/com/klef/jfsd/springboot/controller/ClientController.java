package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.service.CustomerService;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class ClientController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public ModelAndView cusreg()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("cusreg");
		return mv;
	}
	@GetMapping("/login")
	public ModelAndView cuslog()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	@GetMapping("/contact")
	public ModelAndView contact()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Contact");
		return mv;
	}
	@GetMapping("/home")
	public ModelAndView cushome()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	@GetMapping("/portfolio")
	public ModelAndView hovercard()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Hovercard");
		return mv;
	}
	@GetMapping("/Ourcontent")
	public ModelAndView video()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("video");
		return mv;
	}
	
	@PostMapping("cuslogin")
	  public ModelAndView cuslogin(HttpServletRequest request)
	  {
	    ModelAndView mv=new ModelAndView();
	    
	    String msg=null;
	    
	      
	      String email = request.getParameter("Email");
	      String Password=request.getParameter("pass");

	      Customer cus=customerService.checkcuslogin(email, Password);

	    if(cus!=null)
	    {
	    	HttpSession session=request.getSession();
	    	session.setAttribute("eid", cus.getId());
	    	session.setAttribute("eid", cus.getUsername());
	    	mv.addObject("message",msg);
	    	mv.setViewName("home");
	    	
	    }
	    else {
	    	mv.setViewName("login");
	    	mv.addObject("message", "Loggedin Failed");
	    }
	     	      
	     
	    return mv;
	    
	   
	  }
	
	@PostMapping("insertcus")
	  public ModelAndView insert(HttpServletRequest request, HttpServletResponse response)
	  {
	    ModelAndView mv=new ModelAndView();
	    
	    String msg=null;
	    try
	    {
	      String username = request.getParameter("UserName");
	      String email = request.getParameter("Email");
	      String dob = request.getParameter("DOB");
	      String Address=request.getParameter("Adress");
	      String Gender=request.getParameter("sex");
	      String phno=request.getParameter("phnmbr");
	      String Password=request.getParameter("pass");


	      
	      	      
	      Customer customer=new Customer();
	      customer.setUsername(username);
	      customer.setEmail(email);
	      customer.setDob(dob);
	      customer.setAddress(Address);
	      customer.setGender(Gender);
	      customer.setPassword(Password);
	      customer.setPhno(phno);
	      
	     msg= customerService.addCustomer(customer);
	      
	      mv.setViewName("login");
	      mv.addObject("message",msg);
	    }
	    catch(Exception e)
	    {
	      msg=e.getMessage();
	      mv.setViewName("displayerror");
	      mv.addObject("message",msg);
	    }
	    return mv;
	  }
	//videos
	@GetMapping("/example")
    public ResponseEntity<Resource> getExampleVideo() {
        Resource videoFile = new ClassPathResource("static/video.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("video.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/signbg")
    public ResponseEntity<Resource> getExampleVide() {
        Resource videoFile = new ClassPathResource("static/birdfly.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("birdfly.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/vid1")
    public ResponseEntity<Resource> vid1() {
        Resource videoFile = new ClassPathResource("static/vid1.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid1.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/vid2")
    public ResponseEntity<Resource> vid2() {
        Resource videoFile = new ClassPathResource("static/vid2.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid2.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/vid3")
    public ResponseEntity<Resource> vid3() {
        Resource videoFile = new ClassPathResource("static/vid3.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid3.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/vid4")
    public ResponseEntity<Resource> vid4() {
        Resource videoFile = new ClassPathResource("static/vid4.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid4.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/vid5")
    public ResponseEntity<Resource> vid5() {
        Resource videoFile = new ClassPathResource("static/vid5.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid5.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/vid6")
    public ResponseEntity<Resource> vid6() {
        Resource videoFile = new ClassPathResource("static/vid6.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid6.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/vid7")
    public ResponseEntity<Resource> vid7() {
        Resource videoFile = new ClassPathResource("static/vid7.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid7.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/vid8")
    public ResponseEntity<Resource> vid8() {
        Resource videoFile = new ClassPathResource("static/vid8.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid8.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/vid9")
    public ResponseEntity<Resource> vid9() {
        Resource videoFile = new ClassPathResource("static/vid9.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid9.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/vid10")
    public ResponseEntity<Resource> vid10() {
        Resource videoFile = new ClassPathResource("static/vid10.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid10.mp4/mp4"))
                .body(videoFile);
    }

	@GetMapping("/vid11")
    public ResponseEntity<Resource> vid11() {
        Resource videoFile = new ClassPathResource("static/vid11.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid11.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/vid12")
    public ResponseEntity<Resource> vid12() {
        Resource videoFile = new ClassPathResource("static/vid12.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid12.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/vid13")
    public ResponseEntity<Resource> vid13() {
        Resource videoFile = new ClassPathResource("static/vid13.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid13.mp4/mp4"))
                .body(videoFile);
    }
	@GetMapping("/vid14")
    public ResponseEntity<Resource> vid14() {
        Resource videoFile = new ClassPathResource("static/vid14.mp4");

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("vid14.mp4/mp4"))
                .body(videoFile);
    }
	
}
