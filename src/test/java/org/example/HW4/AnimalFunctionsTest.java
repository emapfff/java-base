package org.example.HW4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalFunctionsTest {
    private final AnimalFunctions animalFunctions = new AnimalFunctions();
    private final List<Animal> animals = new ArrayList<>();

    @BeforeEach
    void setUp() {
        animals.add(new Animal("Whiskers", Animal.Type.CAT, Animal.Sex.F, 3, 25, 4, false));       // CAT, F
        animals.add(new Animal("Buddy", Animal.Type.DOG, Animal.Sex.M, 5, 101, 20, true));          // DOG, M
        animals.add(new Animal("Tweety", Animal.Type.BIRD, Animal.Sex.F, 2, 10, 5, false));      // BIRD, F
        animals.add(new Animal("Nemo", Animal.Type.FISH, Animal.Sex.M, 1, 5, 2, false));         // FISH, M
        animals.add(new Animal("Charlotte", Animal.Type.SPIDER, Animal.Sex.F, 1, 1, 1, true));  // SPIDER, F
        animals.add(new Animal("Max", Animal.Type.DOG, Animal.Sex.M, 7, 60, 25, true));            // DOG, M
        animals.add(new Animal("Garfield", Animal.Type.CAT, Animal.Sex.M, 6, 35, 8, false));       // CAT, M
        animals.add(new Animal("Sylvester", Animal.Type.CAT, Animal.Sex.M, 4, 30, 5, true));       // CAT, M
        animals.add(new Animal("Polly Bi", Animal.Type.BIRD, Animal.Sex.F, 3, 15, 7, false));       // BIRD, F
        animals.add(new Animal("Goldie A Sec", Animal.Type.FISH, Animal.Sex.F, 2, 4, 3, false));       // FISH, F
        animals.add(new Animal("Rex E", Animal.Type.DOG, Animal.Sex.M, 8, 55, 22, true));            // DOG, M
        animals.add(new Animal("Tiny Tim Junior", Animal.Type.SPIDER, Animal.Sex.M, 1, 2, 2, true));

    }

    @Test
    void sortByHeightTest() {
        List<Animal> ans = animalFunctions.sortByHeight(animals);
    }

    @Test
    void sortByWeightTest() {
        animalFunctions.sortByWeight(animals).forEach(animal -> {
            System.out.println(animal.name() + " " + animal.weight());
        });
    }

    @Test
    void countByTypeTest() {
        animalFunctions.countByType(animals).forEach((a, b) -> System.out.println(a + " " + b));
    }

    @Test
    void findLongerNameTest() {
        assertEquals(animalFunctions.findLongerName(animals).name(), "Tiny Tim Junior");
    }

    @Test
    void mostFrequentSexTest() {
        assertEquals(animalFunctions.mostFrequentSex(animals), Animal.Sex.M);
    }

    @Test
    void mostHeaviestAnimalTest() {
        animalFunctions.heaviestAnimal(animals).forEach((type, animal) -> System.out.println(type + " " + animal.weight()));
    }

    @Test
    void oldestAnimalTest() {
        assertEquals(animalFunctions.oldestAnimal(animals).age(), 8);
    }

    @Test
    void heaviestAnimalUnderKHeightTest() {
        assertEquals(animalFunctions.heaviestAnimalUnderKHeight(animals, 56).get().weight(), 22);
        assertEquals(animalFunctions.heaviestAnimalUnderKHeight(animals, 61).get().weight(), 25);
    }

    @Test
    void sumPawsAllAnimals() {
        assertEquals(animalFunctions.sumPawsAllAnimals(animals), 44);
    }

    @Test
    void animalsAgeNotMatchPaws() {
        animalFunctions.animalsAgeNotMatchPaws(animals).forEach(animal -> System.out.println(animal.paws() + " " + animal.type() + " " + animal.age()));
    }

    @Test
    void getCanBiteAndHeightGreater100Test() {
        assertEquals(animalFunctions.getCanBiteAndHeightGreater100(animals).getFirst().name(), "Buddy");
    }

    @Test
    void weightGreaterHeightTest() {
        assertEquals(animalFunctions.weightGreaterHeight(animals), 0);
    }

    @Test
    void moreTwoWordsNameTest() {
        animalFunctions.moreTwoWordsName(animals).forEach(animal -> System.out.println(animal.name()));
    }

    @Test
    void existDogHeightGraterKTest() {
        assertEquals(animalFunctions.existDogHeightGreaterK(animals, 60), true);
    }

    @Test
    void sumWeightsAnimalsFromKtoLAgeTest() {
        animalFunctions.sumWeightsAnimalsFromKtoLAge(animals, 3, 8).forEach((a, b) -> System.out.println(a + " " + b));
    }

    @Test
    void sortByTypeSexNameTest() {
        animalFunctions.sortByTypeSexName(animals).forEach(System.out::println);
    }

    @Test
    void mostBittenSpiderTest() {
        assertEquals(animalFunctions.mostBittenSpider(animals), false);
    }

    @Test
    void mostHeaviestFishTest() {
        List<Animal> animals2 = new ArrayList<>();
        animals2.add(new Animal("Omen", Animal.Type.FISH, Animal.Sex.M, 1, 5, 5, false));
        List<Animal> animals3 = new ArrayList<>();
        animals2.add(new Animal("Gover", Animal.Type.FISH, Animal.Sex.M, 1, 7, 10, false));

        assertEquals(animalFunctions.findHeaviestFish(animals, animals2, animals3).name(), "Gover");
    }

    @Test
    void errorAnimalTest() {
        List<Animal> errorsAnimal = new ArrayList<>();
        errorsAnimal.add(new Animal("Vor", Animal.Type.SPIDER, Animal.Sex.M, 1, -1, -1, false));
        errorsAnimal.add(new Animal("Ema", Animal.Type.DOG, Animal.Sex.M, -1, 5, 5, false));
        errorsAnimal.add(new Animal("Pff", Animal.Type.CAT, Animal.Sex.M, 1, 5, 5, false));

        Map<String, Set<ValidationError>> map = animalFunctions.errorAnimal(errorsAnimal);
        System.out.println(map);
    }

    @Test
    void errorAnimalDeluxeTest() {
        List<Animal> errorsAnimal = new ArrayList<>();
        errorsAnimal.add(new Animal("Vor", Animal.Type.SPIDER, Animal.Sex.M, 1, -1, -1, false));
        errorsAnimal.add(new Animal("Ema", Animal.Type.DOG, Animal.Sex.M, -1, 5, 5, false));
        errorsAnimal.add(new Animal("Pff", Animal.Type.CAT, Animal.Sex.M, 1, 5, 5, false));

        animalFunctions.errorAnimalDeluxe(errorsAnimal).forEach((a, b) -> System.out.println(a + " " + b));
    }
}