package com.tuychiboev.SpringCore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("intel")
@Primary
public class Inteli5 implements Processor {

	public String strength() {
		return "2.5 HZ up to 4.3 HZ";
	}

}
