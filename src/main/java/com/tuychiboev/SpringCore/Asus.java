package com.tuychiboev.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Asus implements Laptop {

	@Autowired
	@Qualifier("ryzen")
	private Processor cpu;
	
	public Processor getCpu() {
		return cpu;
	}

	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}
	
	public void spec() {
		System.out.println("Asus TUF Gaming with "+cpu.strength());
	}

}
