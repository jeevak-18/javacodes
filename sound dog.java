interface Animal{
    void Sound();
    
}
class Dog implements Animal{
    public void Sound(){
        System.out.println("Dog barks");
        }
}
public class Main{
    public static void main(String[] args){
        Dog d =new Dog();
        d.Sound();
        
    }
}
