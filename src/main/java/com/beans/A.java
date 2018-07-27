package com.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.beans.A;
@Component
public class A {
	@Autowired
	B b1;
	public B getB() {
		return b1;
	}
	public void setB(B b) {
		this.b1 = b;
	}
	
	public void m1()
	{
		b1.m2();
	}

}
