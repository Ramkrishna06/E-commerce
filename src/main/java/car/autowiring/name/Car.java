package car.autowiring.name;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        System.out.println("car setter is called 3");
        this.specification = specification;
    }


    public void displaymethod(){
        System.out.println(specification.toString());
    }



}
