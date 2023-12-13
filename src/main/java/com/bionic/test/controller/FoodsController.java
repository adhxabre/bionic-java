package com.bionic.test.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bionic.test.dto.FoodsDTO;
import com.bionic.test.model.Foods;
import com.bionic.test.repository.FoodsRepository;
import com.bionic.test.service.FoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin("*")
@RestController
public class FoodsController {

    @Autowired
    private FoodsService foodsService;

    @Autowired
    private FoodsRepository foodsRepository;

    @GetMapping("/foods")
    public List<FoodsDTO> findAll() {
        return foodsService.findAll();
    }

    @GetMapping("/foods/{id}")
    public FoodsDTO findOne(@PathVariable("id") UUID id) {
        return foodsService.findOne(id);
    }

    @PostMapping("/foods")
    public FoodsDTO save(@RequestBody FoodsDTO foods) {
        return foodsService.save(foods);
    }

    @PatchMapping("/foods/{id}")
    public ResponseEntity<FoodsDTO> findById(@PathVariable("id") UUID id, @RequestBody Foods foods) {
        FoodsDTO getFoods = foodsRepository.findById(id).orElse(null);

        getFoods.setName(foods.getName());
        getFoods.setTutorialLink(foods.getTutorialLink());
        getFoods.setIngredients(foods.getIngredients());
        getFoods.setArea(foods.getArea());
        getFoods.setDescriptions(foods.getDescriptions());

        FoodsDTO updateFoods = foodsRepository.save(getFoods);
        return ResponseEntity.ok().body(updateFoods);
    }

    @DeleteMapping("/foods/{id}")
    public void removeOne(@PathVariable("id") UUID id) {
        foodsService.removeOne(id);
    }
}
