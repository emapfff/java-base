package org.example.HW4;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public record ValidationError(String message) {
    private static final ValidationError MISSING_TYPE = new ValidationError("Отсутсвует тип");
    private static final ValidationError INVALID_AGE = new ValidationError("Неправильно указан возраст");
    private static final ValidationError INVALID_WEIGHT = new ValidationError("Неверно указан вес");
    private static final ValidationError INVALID_HEIGHT = new ValidationError("Неверно указан рост");

    public static @NotNull Set<ValidationError> getValidationError(@NotNull Animal animal) {
        Set<ValidationError> validationErrorSet = new HashSet<>();
        if (animal.age() <= 0) {
            validationErrorSet.add(INVALID_AGE);
        }
        if (animal.type() == null) {
            validationErrorSet.add(MISSING_TYPE);
        }
        if (animal.weight() < 0) {
            validationErrorSet.add(INVALID_WEIGHT);
        }
        if (animal.height() < 0) {
            validationErrorSet.add(INVALID_HEIGHT);
        }
        return validationErrorSet;
    }

    public static String getMessage(@NotNull ValidationError error) {
        return error.message();
    }
}