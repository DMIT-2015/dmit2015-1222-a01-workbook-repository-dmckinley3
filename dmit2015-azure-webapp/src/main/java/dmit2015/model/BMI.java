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


    public BMI() {
    }

    public BMI(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double bmi() {
        return (703 * weight) / (height * height);
    }


    public String bmiCategory() {
        String bmiCat = "";
        if (this.bmi() <= 30) {
            if (this.bmi() < 18.5) {
                bmiCat = "underweight";
            }
            if (this.bmi() >= 18.5 && bmi() <= 24.9) {
                bmiCat = "normal";
            }
            if (this.bmi() >= 25 && bmi() <= 29.9) {
                bmiCat = "overweight";
            }
        } else {
            bmiCat = "obese";
        }
        return bmiCat;
    }

}
