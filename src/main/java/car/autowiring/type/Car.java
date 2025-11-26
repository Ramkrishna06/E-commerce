package car.autowiring.type;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        System.out.println("car setter is called 3 t");
        this.specification = specification;
    }


    public void displaymethod(){
        System.out.println(specification.toString());
    }



}
