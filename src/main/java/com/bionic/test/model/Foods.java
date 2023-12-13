package com.bionic.test.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "foods")
public class Foods {
    
    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", nullable = false, unique = false)
    private String name;

    @Column(name = "tutorial_link", nullable = false, unique = false)
    private String tutorialLink;

    @ElementCollection
    @CollectionTable(name = "food_ingredients", joinColumns = @JoinColumn(name = "food_id"))
    @Column(name = "ingredients", nullable = false, unique = false)
    private List<Ingredients> ingredients;

    @Column(name = "area", nullable = true, unique = false)
    private String area;

    @Column(name = "descriptions", nullable = true, unique = false)
    private String descriptions;

    public Foods() {}

    public Foods(UUID id, String name, String tutorialLink, List<Ingredients> ingredients, String area, String descriptions) {
        this.id = id;
        this.name = name;
        this.tutorialLink = tutorialLink;
        this.ingredients = ingredients;
        this.area = area;
        this.descriptions = descriptions;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTutorialLink() {
        return tutorialLink;
    }

    public void setTutorialLink(String tutorialLink) {
        this.tutorialLink = tutorialLink;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Embeddable
    public class Ingredients {
        private String name;
        private Integer amount;
        private String unit;

        public Ingredients() {}

        public Ingredients(String name, Integer amount, String unit) {
            this.name = name;
            this.amount = amount;
            this.unit = unit;
        }

        public String getName() {
            return name;            
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }
    }

}
