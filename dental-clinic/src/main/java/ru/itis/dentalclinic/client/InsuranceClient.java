package ru.itis.dentalclinic.client;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RequiredArgsConstructor
@Component
public class InsuranceClient {

    private final RestTemplate restTemplate;

    @Value("${client.insuranceApi.url}")
    private String url;

    public boolean checkInsurance(String insurance){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(
                "http://localhost:8088" + "/insurance?insuranceName="+ insurance, String.class,
                Map.of("insurance", insurance));
        return responseEntity.getStatusCode().is2xxSuccessful();
    }
}
