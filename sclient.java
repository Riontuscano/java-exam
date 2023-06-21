 abstract  class dynamic {
    public abstract void voice();
}
class cat extends dynamic{
    @Override
    public void voice() {
        System.out.println("Cat does meow meow");
    }
}
 class dog extends dynamic{
    @Override
    public void voice() {
        System.out.println("Dog does bow bow");
    }
}
public class sclient{
public static void main(String[] args) {
    dynamic a;
    cat c= new cat();
    dog d=new dog();
    a=c;
    a.voice();;
    a=d;
    a.voice();    
}
}