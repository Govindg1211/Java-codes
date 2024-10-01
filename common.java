import java.util.Arrays;
class common{
    public static void main(String[] args) {
        String[] arr={"Flower","Flow","Flight"};
        Arrays.sort(arr);
        String str1=arr[0];
        String str2=arr[arr.length-1];
        String str3="";
        for(int i=0;i<str1.length();i++){
            if(str1.substring(0,i).equals(str2.substring(0,i))){
                str3=str1.substring(0,i);
            }
            else{
                break;
            }
        }
        System.out.println(str3);
        for(String s: arr){
            System.out.println(s);
        }
    }
}