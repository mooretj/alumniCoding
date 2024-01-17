package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class FractionTest {
    @Test
    public void tostring_to_print_1_half() {
        //Arrange
        Fraction fraction = new Fraction();
        fraction.setNumerator(1);
        fraction.setDenomenator(2);

        //Act
        fraction.toString();

        //Assert

    }
}
