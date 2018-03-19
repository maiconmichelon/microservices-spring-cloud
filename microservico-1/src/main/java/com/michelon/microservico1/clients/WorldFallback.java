package com.michelon.microservico1.clients;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class WorldFallback implements WorldClient {

    @Override
    public ResponseEntity<Data> getData() {
        Data data = new Data();
        data.setInfo("World (Fallback)");
        return ResponseEntity.ok(data);
    }

}
