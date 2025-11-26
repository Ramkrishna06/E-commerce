package car.autowiring.type;

public class Specification {
    String make;
    String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        System.out.println("setter iis callerd 1 t ");
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        System.out.println("setter iis callerd 2 t");
        this.make = make;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
