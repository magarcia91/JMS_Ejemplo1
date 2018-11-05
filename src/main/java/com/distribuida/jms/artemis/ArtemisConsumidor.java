package com.distribuida.jms.artemis;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ArtemisConsumidor {

	@JmsListener(destination = "${jms.queue.destination}")
	public void receive(String msg){
		System.out.println("Recieved Message: " + msg);
	}
	
}
