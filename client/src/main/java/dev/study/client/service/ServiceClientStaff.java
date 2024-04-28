package dev.study.client.service;

import dev.study.client.repository.ApiStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClientStaff {

    @Autowired
    public static ApiStaffRepository apiStaffRepository = new ApiStaffRepository();

    public String getStaff(){
        return apiStaffRepository.getStaff();
    }
}
