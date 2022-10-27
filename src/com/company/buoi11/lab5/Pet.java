package com.company.buoi11.lab5;

public class Pet {

   private String id,name,species,age,sex,description,images;
   private TYPE type;

    public Pet(String id, String name, String species, String age, String sex, String description, String images, TYPE type) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.sex = sex;
        this.description = description;
        this.images = images;
        this.type = type;
    }

    public Pet() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                ", images='" + images + '\'' +
                ", type=" + type +
                '}';
    }
}
