package com.otsuguasoft.serviciobackend.controller;

import com.otsuguasoft.serviciobackend.dto.InfoResponse;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/info")
public class InfoController {

    @GetMapping("/{id}")
    public InfoResponse getInfoById(@PathVariable("id") String id) {
        return new InfoResponse("Información recibida para el ID: " + id);
    }

}