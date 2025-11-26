package car.example.bean;

public class Mybean {

    private String message;

    public Mybean(){
    }

    public String getMessage () {
       return message;
    }
    void showmessage(){
        System.out.println("hhelo this works");
    }
    public String setMessage (String message) {
        return message;
    }

    @Override
    public String toString() {
        return "MyBean{" + "message=" + message + "}";
    }

}
