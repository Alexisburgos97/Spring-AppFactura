package com.bolsadeideas.springboot.web.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bolsadeideas.springboot.web.app.domains.ItemFactura;
import com.bolsadeideas.springboot.web.app.domains.Producto;

@Configuration
public class AppConfig {
	
	@Bean("ItemFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Notebook Samsung",1000);
		Producto producto2 = new Producto("Escritorio Oficina",500);
		
		ItemFactura lista1 = new ItemFactura(producto1,3);
		ItemFactura lista2 = new ItemFactura(producto2,3);
		
		return Arrays.asList(lista1,lista2);
	}

}
