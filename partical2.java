public class partical2 {
public static void main(String[] args) {
    int[] a={97,2,3,4,50}; 
/*for(int i=1;i<=50;++i)
{
    System.out.println(i);
}
*/
for (int p : a) {
    if (a[p]%2==0) {
        System.out.println(a[p]);
    }
}
int i=50;
while(i!=0)
{
  System.out.println( i );
  --i;
}
}   
} 