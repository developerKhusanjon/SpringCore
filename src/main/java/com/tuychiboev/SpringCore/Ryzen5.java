package com.tuychiboev.SpringCore;

import org.springframework.stereotype.Component;

@Component("ryzen")
public class Ryzen5 implements Processor {

	public String strength() {
		return "3.1 HZ up to 4.8 HZ";
	}

}
