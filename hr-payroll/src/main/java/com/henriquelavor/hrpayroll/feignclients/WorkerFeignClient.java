package com.henriquelavor.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.henriquelavor.hrpayroll.entities.Worker;


@Component  //Componente gerenciado pelo Spring para ser injetado em outras classes	
@FeignClient(name = "hr-worker",path = "/workers")
public interface WorkerFeignClient {
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id);

}
