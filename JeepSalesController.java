package com.promineotech.jeep.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
@RequestMapping("/jeeps")


@OpenAPIDefinition(info = @Info(title = "Jeep Sales Service"), servers = {
		@Server(url = "http://localhost:8080", description = "Local server.")})


public interface JeepSalesController {
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	

	
	List<Jeep> fetchJeeps(@RequestParam JeepModel model, @RequestParam String trim);
	
	// @formatter:off
		@Operation( 
			summary = "Returns a list of Jeeps",
			description = "Returns a list of Jeeps given an optional model and/or trim",
			responses = {
					@ApiResponse(responseCode = "200", description = "A list of Jeeps is returned", content = @Content(mediatype = "aaplication/json", schema = @Schema(implementation = Jeep.class))),
					@ApiResponse(responseCode = "400", description = "The request parameters are invalid", content = @Content(mediatype = "aaplication/json))," )),
					@ApiResponse(responseCode = "404", description = "No Jeeps were found in the input criteria", content = @Content(mediatype = "aaplication/json))," )),
					@ApiResponse(responseCode = "500", description = "An unplanned error occurred", content = @Content(mediatype = "aaplication/json))," )),
					
					
			},
			
				parameters = {
			
				@Parameter(
				name = "model",
				allowEmptyValue = false,
				required = false,
				description = "The model name(i.e., 'WRANGLER')"),
				
				@Parameter(
				name = "trim",
				allowEmptyValue = false,
				required = false,
				description = "The trim level (i.e., 'Sport'"),
				
			
			
			
			
		
				
}
		
}

			),

		//  @formatter:on
	
	
}

