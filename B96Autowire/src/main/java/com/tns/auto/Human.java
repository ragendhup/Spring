package com.tns.auto;

public class Human {
// creating the reference of heart class in human
	private Heart heart;

	public Heart getHeart() {
		return heart;
	}
//@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Human() {
		super();
	}
//@Autowired	
	public void startPumping() {
		if(heart!=null) {
		   heart.pump();
		   
		}
		else {
			System.out.println("dead");
		}
	}

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
}
