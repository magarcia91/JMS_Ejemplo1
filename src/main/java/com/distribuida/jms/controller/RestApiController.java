package com.distribuida.jms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.jms.artemis.ArtemisProductor;

public class RestApiController {

	
	@Autowired
	ArtemisProductor productor;
	
	@RequestMapping(value="/operacion")
	public String produce(@RequestParam("msg")String msg){
		productor.send(msg);
		return "Realizado....";
	}
}
