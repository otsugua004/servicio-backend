package com.otsuguasoft.serviciobackend.service;

import com.otsuguasoft.serviciobackend.dto.InformacionDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsultaService {

    @Value("${otsuguasoft.servicio-bdd.url}")
    private String servicioBddUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public InformacionDTO consultarPorId(Long id) {
        String url = servicioBddUrl + id;
        return restTemplate.getForObject(url, InformacionDTO.class);
    }
}
