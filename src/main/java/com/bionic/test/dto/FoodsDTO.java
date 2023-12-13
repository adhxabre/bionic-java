package com.bionic.test.dto;

import java.util.List;
import java.util.UUID;

import com.bionic.test.model.Foods.Ingredients;

import lombok.Data;

@Data
public class FoodsDTO {
    private UUID id;
    private String name;
    private String tutorialLink;
    private List<Ingredients> ingredients;
    private String area;
    private String descriptions;
}
