package dev.study.client.repository;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiStaffRepository {
    private static final String EXTERNAL_SERVICE_URL = "http://localhost:8080";

    public String getStaff() {

        RestTemplate restTemplate = new RestTemplate();
        String url = EXTERNAL_SERVICE_URL + "/staff";
        return restTemplate.getForObject(url, String.class);

    }

}
