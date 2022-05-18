package L21_Objects_and_Classes;

class Circle {
    private double radius;
    private double area;

    Circle(double rad) {
        this.radius = rad;
        this.area = Math.PI * radius * radius;
    }

    String getInfo() {
        return "Circle (R=" + this.radius + ", A=:" + this.area + ")";
    }

    void setRadius(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }
}