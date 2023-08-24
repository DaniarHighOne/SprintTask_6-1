package com.example.SprintTaskORM.service;

import com.example.SprintTaskORM.models.ApplicationRequest;
import com.example.SprintTaskORM.repo.ApplicationRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationRequestService {

    @Autowired
    private ApplicationRequestRepository appReqRepository;
    public void addAppRequest(ApplicationRequest appReq){
        appReq.setHandled(false);
        appReqRepository.save(appReq);


    }

    public List<ApplicationRequest> getAppRequests() {
        return appReqRepository.findAll();
    }

    public ApplicationRequest getAppReqById(Long id) {
        return appReqRepository.findById(id).orElseThrow();
    }
}
