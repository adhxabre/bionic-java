package com.bionic.test.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bionic.test.dto.FoodsDTO;
import com.bionic.test.repository.FoodsRepository;

@Service
public class FoodsService {

    @Autowired
    private FoodsRepository foodsRepository;

    public FoodsDTO save(FoodsDTO foods) {
        return foodsRepository.save(foods);
    }

    public List<FoodsDTO> findAll() {
        return (List<FoodsDTO>) foodsRepository.findAll();
    }

    public FoodsDTO findOne(UUID id) {
        return foodsRepository.findById(id).orElse(null);
    }

    public void removeOne(UUID id) {
        foodsRepository.deleteById(id);
    }
}