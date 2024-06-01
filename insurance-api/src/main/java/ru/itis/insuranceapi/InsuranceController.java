package ru.itis.insuranceapi;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.http.ResponseEntity.status;

@RestController
public class InsuranceController {

    @GetMapping("/insurance")
    public ResponseEntity<String> processInsurance(@RequestParam("insuranceName") String name) {
        System.out.println(name);
        return name != null && name.length() < 20 ?  ok("Accepted") :
                status(HttpStatusCode.valueOf(403)).build();
    }
}
