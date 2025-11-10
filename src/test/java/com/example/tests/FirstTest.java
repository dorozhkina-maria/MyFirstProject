package com.example.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Наш первый тестовый класс в JUnit 5
 * Демонстрирует базовые концепции написания тестов
 */
public class FirstTest {

    /**
     * Простейший тест, демонстрирующий базовую структуру
     * Аннотация @Test указывает JUnit, что это тестовый метод
     */
    @Test
    void myFirstTest() {
        // Arrange (Подготовка) - подготавливаем данные
        int numberA = 2;
        int numberB = 3;

        // Act (Действие) - выполняем тестируемое действие
        int actualResult = numberA + numberB;

        // Assert (Проверка) - проверяем результат
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult,
                "Сумма 2 + 2 должна быть равна 4");
    }
}