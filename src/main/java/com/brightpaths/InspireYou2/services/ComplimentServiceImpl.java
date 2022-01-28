package com.brightpaths.InspireYou2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class ComplimentServiceImpl implements ComplimentService {

    @Autowired
    EntityManager entityManager;

    //Is this where should I put the logic for retrieving my compliments?

    @Override
    public String randomCompliment() {
        int min = 1;
        int max = 5;
        //Generate a random int value from 1 to 5
        int randomIndex = (int)Math.floor(Math.random()*(max-min+1)+min);
        List<String> randomComplimentList = entityManager.createNativeQuery("SELECT compliment FROM compliments c WHERE c.id=?1").setParameter(1,randomIndex).getResultList();
        return randomComplimentList.get(0);
    }



}
