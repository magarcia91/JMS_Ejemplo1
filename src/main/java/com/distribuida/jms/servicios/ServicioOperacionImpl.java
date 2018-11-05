package com.distribuida.jms.servicios;

import org.springframework.stereotype.Component;


@Component(value="servicioOp")
public class ServicioOperacionImpl implements ServicioOperacion{

		@Override
		public int sumar(int x, int y) {
			return x + y;
		}
}
