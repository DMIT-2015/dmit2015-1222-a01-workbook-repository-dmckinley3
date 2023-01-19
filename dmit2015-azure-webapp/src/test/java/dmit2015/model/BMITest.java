package dmit2015.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BMITest {

    @ParameterizedTest(name = "weight = {0}, height = {1}, expected category = {2} ")
    @CsvSource({
            "100,66,underweight",
            "140,66,normal",
            "175,66,overweight",
            "200,66,obese"
    })
    void bmiCategory_DifferentCategory_ReturnsCorrectResults(int weight, int height, String expectedCat) {
// Arrange
        BMI person = new BMI();
// Act
        person.setWeight(weight);
        person.setHeight(height);
// Assert
        assertEquals(expectedCat, person.bmiCategory());

    }
}