package dmit2015.model;

public class BMI {
    public int height;

    public int weight;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BMI() {
    }

    public BMI(int height, int weight) {
        setHeight(height);
        setWeight(weight);
    }


    public double bmi() {
        return Math.round(703 * weight) / Math.round(height * height);
    }


    public String bmiCategory() {
        String bmiCat = "";

        if (bmi() <= 30) {
            if (bmi() < 18.5) {
                bmiCat = "underweight";
            }
            if (bmi() >= 18.5 && bmi() <= 24.9) {
                bmiCat = "normal";
            }
            if (bmi() >= 25 && bmi() <= 29.9) {
                bmiCat = "overweight";
            }
        } else {
            bmiCat = "obese";
        }
        return bmiCat;
    }

}
