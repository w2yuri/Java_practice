public class Person43 {
    private String name;

    public Person43(String name){
        //thisは二行目のnameを指している
        this.name = name;
    }
    public void display(){
        System.out.println("名前" + name);
    }
}
