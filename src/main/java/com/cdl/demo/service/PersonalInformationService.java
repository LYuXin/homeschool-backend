package com.cdl.demo.service;

import com.cdl.demo.domain.PersonalInformation;

import java.util.Map;

public interface PersonalInformationService {
    PersonalInformation getInformationByUserId(Integer userId);
    boolean changeJianjie(Integer userId, String jianjie);
    boolean changeAddress(Integer userId, String jianjie);
    boolean changePhone(Integer userId, String jianjie);
    boolean changeInterest(Integer userId, String jianjie);
    boolean changeWork(Integer userId, String jianjie);

    Map<String,Object> getPersonalByUserId(int userId, int classId);
}
