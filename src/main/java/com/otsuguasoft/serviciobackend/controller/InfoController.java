package com.otsuguasoft.serviciobackend.controller;

import com.otsuguasoft.serviciobackend.dto.InfoResponse;
import com.otsuguasoft.serviciobackend.dto.InformacionDTO;
import com.otsuguasoft.serviciobackend.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/info")
public class InfoController {

    private final ConsultaService consultaService;

    public InfoController(ConsultaService consultaService) {
        this.consultaService = consultaService;
    }

    @GetMapping("/{id}")
    public InformacionDTO getInfoById(@PathVariable("id") Long id) {
        return consultaService.consultarPorId(id);
    }

}