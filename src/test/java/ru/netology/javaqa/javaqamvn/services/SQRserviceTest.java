package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRserviceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/result.csv")

    public void shouldCalculateTheNumbersOFSquaresTest1(int expected, int begin, int end) {
        SQRservice service = new SQRservice();

        int actual = service.calculate(begin, end);
        Assertions.assertEquals(expected, actual);

    }

}
