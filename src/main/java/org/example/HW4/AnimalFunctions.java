package org.example.HW4;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class AnimalFunctions {

    public List<Animal> sortByHeight(@NotNull List<Animal> animals) {
        return animals.stream()
                .sorted(Comparator.comparing(Animal::height))
                .collect(Collectors.toList());
    }

    public List<Animal> sortByWeight(@NotNull List<Animal> animals) {
        return animals.stream()
                .sorted(Comparator.comparing(Animal::weight))
                .collect(Collectors.toList());
    }

    public Map<Animal.Type, Integer> countByType(@NotNull List<Animal> animals) {
        return animals.stream()
                .collect(
                        Collectors.groupingBy(
                                Animal::type, Collectors.collectingAndThen(counting(), Long::intValue)
                        )
                );
    }

    public Animal findLongerName(@NotNull List<Animal> animals) {
        return animals.stream()
                .max(Comparator.comparingInt(a -> a.name().length()))
                .get();
    }

    public Animal.Sex mostFrequentSex(@NotNull List<Animal> animals) {
        return animals.stream()
                .collect(Collectors.groupingBy(
                        Animal::sex, counting()
                ))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .limit(1)
                .findFirst()
                .orElse(null);
    }

    public Map<Animal.Type, Animal> heaviestAnimal(@NotNull List<Animal> animals) {
        return animals.stream()
                .collect(Collectors.toMap(
                        Animal::type, Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(Animal::weight))
                ));
    }

    public Animal oldestAnimal(@NotNull List<Animal> animals) {
        return animals.stream()
                .max(Comparator.comparingInt(Animal::age))
                .get();
    }

    public Optional<Animal> heaviestAnimalUnderKHeight(@NotNull List<Animal> animals, int k) {
        return animals.stream()
                .filter(animal -> animal.height() < k)
                .max(Comparator.comparingInt(Animal::weight));
    }

    public Integer sumPawsAllAnimals(@NotNull List<Animal> animals) {
        return animals.stream()
                .mapToInt(Animal::paws)
                .sum();
    }

    public List<Animal> animalsAgeNotMatchPaws(@NotNull List<Animal> animals) {
        return animals.stream()
                .filter(animal -> animal.age() != animal.paws())
                .collect(Collectors.toList());
    }

    public List<Animal> getCanBiteAndHeightGreater100(@NotNull List<Animal> animals) {
        return animals.stream()
                .filter(animal -> animal.height() > 100 && animal.bites())
                .collect(Collectors.toList());
    }

    public Integer weightGreaterHeight(@NotNull List<Animal> animals) {

        return animals.stream()
                .filter(animal -> animal.weight() > animal.height())
                .collect(Collectors.collectingAndThen(counting(), Long::intValue));
    }

    public List<Animal> moreTwoWordsName(@NotNull List<Animal> animals) {
        return animals.stream()
                .filter(x -> x.name().split(" ").length > 2)
                .collect(Collectors.toList());
    }

    public Boolean existDogHeightGreaterK(@NotNull List<Animal> animals, int k) {
        return animals.stream()
                .anyMatch(x -> x.type().equals(Animal.Type.DOG) && x.height() > k);
    }

    public Map<Animal.Type, Integer> sumWeightsAnimalsFromKtoLAge(@NotNull List<Animal> animals, int k, int l) {
        return animals.stream()
                .filter(x -> x.age() >= k && x.age() <= l)
                .collect(Collectors.groupingBy(
                                Animal::type, Collectors.summingInt(Animal::weight)
                        )
                );
    }

    public List<Animal> sortByTypeSexName(@NotNull List<Animal> animals) {
        return animals.stream()
                .sorted(Comparator.comparing(Animal::type)
                        .thenComparing(Animal::sex)
                        .thenComparing(Animal::name))
                .collect(Collectors.toList());
    }

    public Boolean mostBittenSpider(@NotNull List<Animal> animals) {
        var map = animals.stream()
                .filter(x -> x.type().equals(Animal.Type.DOG) || x.type().equals(Animal.Type.SPIDER))
                .filter(Animal::bites)
                .collect(Collectors.groupingBy(
                        Animal::type, counting()
                ));
        return map.get(Animal.Type.SPIDER) > map.get(Animal.Type.DOG);
    }

    @SafeVarargs
    public final Animal findHeaviestFish(@NotNull List<Animal> @NotNull ... animals) {
        return Arrays.stream(animals)
                .flatMap(List::parallelStream)
                .filter(x -> x.type().equals(Animal.Type.FISH))
                .max(Comparator.comparing(Animal::weight))
                .get();
    }

    public Map<String, Set<ValidationError>> errorAnimal(@NotNull List<Animal> animals) {
        return animals.stream()
                .collect(Collectors.toMap(
                        Animal::name,
                        ValidationError::getValidationError
                ));
    }

    public Map<String, String> errorAnimalDeluxe(@NotNull List<Animal> animals) {
        return animals.stream()
                .collect(Collectors.toMap(
                        Animal::name,
                        animal -> ValidationError.getValidationError(animal).stream()
                                .map(ValidationError::message)
                                .collect(Collectors.joining(", "))
                        )
                );

    }

}
