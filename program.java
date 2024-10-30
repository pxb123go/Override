class parent{
    void display(){
        System.out.println("Hello");
    }
}
class child extends parent{
    void display(){
        System.out.println("Hi");
    }
}

 class program {
public static void main(String[] args) {
    child ch=new child();
    ch.display();
}
    
}