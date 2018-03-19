package com.michelon.microservico1.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "microservico-2", fallback = WorldFallback.class)
public interface WorldClient {

    @GetMapping("world")
    ResponseEntity<Data> getData();

}
