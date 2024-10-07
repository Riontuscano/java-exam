import java.util.*;

public class maxele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> v = new Vector<>();
        Vector<Integer> v1 = new Vector<>();
        v.add(30);
        v.add(20);
        v.add(50);
        v.add(60);
        v1.add(70);
        v1.add(40);
        v1.add(10);
        v1.add(10);
        v1.add(10);
        v1.add(10);
        v1.add(10);
        System.out.println(v);
        System.out.println(Collections.max(v));
        Collections.sort(v,Collections.reverseOrder());
        System.out.println(v1);

        v.addAll(v1);
        System.out.println(v);

        if(v.contains(90)){
            System.out.println("Tu chutiya hai");
        }else{
            System.out.println("Tu normal hai");
        }
        Collections.reverse(v);
        System.out.println(v);
        int find = sc.nextInt();
        int f = Collections.frequency(v,find);
        System.out.println("Frequency:"+f);
    }
}
