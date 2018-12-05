import javax.swing.*;

public class Vehicle
{
    private double weight;
    private int power;
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String printName()
    {
        return name;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void calculatePower()
    {
        JOptionPane.showMessageDialog(null, "Die Kraft in PS für "+name+"="+1.36*power);
    }
}
