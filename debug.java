import java.util.Scanner;
class debug{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        StringBuffer sb=new StringBuffer(name.charAt(0));
        for (int i=0;i<name.length();i++){
            if ((""+name.charAt(i))=="") sb.append(name.charAt(i+1));
        }
        System.out.println(sb);
    }
}
// HashSet<Integer> Set = new HashSet<>();
// for(i=0;i<n;i++)
// {
//     if(Set.contains(Sum-a[i])){
//         return True;
//     }
//     Set add(ar[i]);

// }
// return False;