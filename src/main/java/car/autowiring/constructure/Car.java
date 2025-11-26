package car.autowiring.constructure;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        System.out.println("constructue is called");
        this.specification = specification;
    }
    // this is setter we need constructure;
//    public void setSpecification(Specification specification) {
//        System.out.println("car setter is called 3 constructure");
//        this.specification = specification;
//    }


    public void displaymethod(){
        System.out.println(specification.toString());
    }



}
