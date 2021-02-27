package sk.ivanmolcan.exception;

public class Name {

    private String name;
    private int age;

    public Name(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) throws AgeException {
        Name name = new Name("Pet", 16);

        if(name.getName().length() > 4){
            throw new NameException("Error meno je prilis dlhe");
        } else {
            System.out.println("Meno je v pohode");
        }

        if(name.getAge() < 18){
            throw new AgeException("Error2 vek je prilis maly");
        } else {
            System.out.println(("Vek je OK"));
        }
    }

}
