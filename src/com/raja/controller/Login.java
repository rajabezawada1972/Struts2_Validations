package com.raja.controller;
import com.opensymphony.xwork2.ActionSupport;
public class Login extends ActionSupport{	
	private static final long serialVersionUID = 1L;
	
	private String uname;
	private String pass;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String execute()
	{		
		return "success";
	}
	
	public void validate() {
        if (getUname().length() == 0) {
            addFieldError("uname", "User Name is required");
        } 
        if (getPass().length() == 0) {
            addFieldError("pass", "password is required");
        }
        else if (!(getUname().equals("raja") & getPass().equals("1234"))) {
        	 this.addActionError("Invalid User Name or Password");
        }
        
    }
	
	
}
