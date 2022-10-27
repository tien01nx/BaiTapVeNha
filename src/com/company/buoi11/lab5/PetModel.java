package com.company.buoi11.lab5;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class PetModel {
    ArrayList<Pet> pets = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void enterPet() {
        pets.add(new Pet("id1", "name2", "species4", "age5", "nam", "description1", "images7", TYPE.DOG));
        pets.add(new Pet("id2", "name3", "species5", "age6", "nu", "description2", "images4", TYPE.CAT));
        pets.add(new Pet("id3", "name4", "species6", "age7", "nu", "description4", "images74", TYPE.DOG));
        pets.add(new Pet("id4", "name5", "species7", "age8", "nu", "description5", "images71", TYPE.DOG));
        pets.add(new Pet("id5", "name6", "species8", "age9", "nam", "description6", "images5", TYPE.CAT));
        pets.add(new Pet("id6", "name7", "species9", "age10", "nam", "description9", "images3", TYPE.DOG));
        pets.add(new Pet("id7", "name8", "species10", "age4", "nu", "description11", "images2", TYPE.CAT));


//        private String id,name,species,age,sex,description,images;
        System.out.print("id: ");
        String id = sc.nextLine();
        System.out.print("name: ");
        String name = sc.nextLine();
        System.out.print("species: ");
        String species = sc.nextLine();
        System.out.print("age: ");
        String age = sc.nextLine();
        System.out.print("sex: ");
        String sex = sc.nextLine();
        System.out.print("description: ");
        String description = sc.nextLine();
        System.out.print("images: ");
        String images = sc.nextLine();
        System.out.println("1. DOG 2. CAT");
        int n = sc.nextInt();
        String TYPE;
        switch (n) {
            case 1:
                TYPE = "DOG";
                break;
            case 2:
                TYPE = "CAT";
                break;
            default:
                System.out.println("nhap sai vui long nhap lai");
        }
        if (n == 1)
            pets.add(new Pet(id, name, species, age, sex, description, images, com.company.buoi11.lab5.TYPE.DOG));
        else

            pets.add(new Pet(id, name, species, age, sex, description, images, com.company.buoi11.lab5.TYPE.CAT));
        System.out.println(pets);

    }

    public void match() {
        System.out.println("Hiển thị thông tin 1 pet ngẫu nhiên (phải cùng TYPE && khác sex) trong");
        boolean check = true;

//        ListIterator litr = pets.listIterator();
//        litr = pets.listIterator();
//        while (litr.hasNext()) {
//            Object element = litr.next();
//            if (pet.getSex().equals(element)) {
//                litr.remove();
//            }
//        }
//        Pet pet = pets.get(pets.size() - 1);
//        for (int i = 0; i < pets.size(); i++) {
//            if (!pet.getSex().equals(pets.get(i).getSex()) && pet.getType().equals(pets.get(i).getType())) {
//
//            }
//
//        }

        do {

            Random r = new Random();
            int randomInt = r.nextInt(pets.size());
            Pet pet = pets.get(pets.size() - 1);
            while (check) {
                if (!pet.getSex().equals(pets.get(randomInt).getSex()) && pet.getType().equals(pets.get(randomInt).getType())) {
                    System.out.println(pets.get(randomInt).toString());
                    check = true;
                    break;
                } else check = false;

            }

            System.out.println("ban muon tim pet khac ko 1. Yes 2. No");
            sc.nextLine();
            int n = sc.nextInt();
            if (n == 1) {
                check = true;
            } else {
                check = false;
            }


        } while (check);


    }
}
