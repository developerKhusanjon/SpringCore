package com.tuychiboev.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Acer implements Laptop{
	@Autowired
	private Processor cpu;
	
	public Processor getCpu() {
		return cpu;
	}

	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}

	public void spec() {
		System.out.println("Acer Nitro 5 with "+cpu.strength());
	}
}
