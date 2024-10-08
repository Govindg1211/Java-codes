import java.util.Scanner;
class operation
{
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.print("Enter a number : ");
        double x=sc.nextDouble();
        int y=(int) Math.ceil(x);
        System.out.println(y);
        binarynum(y);

    }
    void binarynum(int no)
    {
        int binary[] = new int[32];
        int reversebinary[]=new int[32];
        int id = 0;
        while (no > 0) {
            binary[id++] = no % 2;
            no = no / 2;
        } 
        System.out.print("\nBinary Representation: ");
        for (int i = id - 1; i >= 0; i--)
        {
            System.out.print(binary[i] + "");
            
        }
        System.out.print("");
        for (int i = 0; i < id; i++)
        {
            reversebinary[i] = binary[id - 1 - i]; // Reverse assignment
        }
    compliment(reversebinary,id);

    }

    void compliment(int reversebinary[],int id)
    {
        for(int i=0;i<id;i++)
        {
            
            if( reversebinary[i]==0)
            {
                reversebinary[i]=1;
            }
            else if( reversebinary[i]==1)
            {
                reversebinary[i]=0;
            }    
        }
    
        System.out.print("\nComplimented Binary Number (One's Complement): ");
        for(int i=0;i<id;i++)
        {
            System.out.print(reversebinary[i] + "");
        }
        System.out.print("");
        //int compliment=Integer.valueOf(reversebinary)+1;
         for (int i = id - 1; i >= 0; i--) {
            if (reversebinary[i] == 0) {
                reversebinary[i] = 1; // Set current bit to 1 and break
                break;
            } else {
                reversebinary[i] = 0; // Set current bit to 0 and carry over
            }
        }

        // Print the complemented binary number
        System.out.print("\nComplimented Binary Number (Two's Complement): ");
        for (int i = 0; i < id; i++) { // Print in correct order
            System.out.print(reversebinary[i]);
        }
        System.out.println();
    }
}

class Ques3 extends operation
{ 
    public static void main(String args[])
    {
        operation obj=new operation();
        obj.input();
    }
}