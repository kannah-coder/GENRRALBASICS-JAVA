public class operators {
    public static void main(String[] args) {
        //assingment operators
        int x=1;
        int y=x++; // if you write ++x then y value is 2 
        System.out.println(y); //1
        System.out.println(x); //2
        // like thesee x--,x+=3,x/=2,x%=5 ...like these we can use 


        // arthametic operators
        int a=10;
        int b=14;
        int result=a+b; // use +,-,/,%,* to perform diff operations 
        System.out.println(result); 

        // comparision operators 
        long c=10;  //implicit so i dont keep l :)
        int d=90;
        boolean k=c>d; // use <,>,<=,>=,!=,==...
        System.out.println(k);

        //logical operators
        int g=12;
        int n=24;
        int o=54;
        System.out.println(g>n && o>n); //logical AND
        System.out.println(g>n || o>n); //logical OR
        System.out.println(!(g>n)); // logical NOT
        //ternary operator 
        System.out.println("ternary operator: "+ (10>20? "true" : "False"));
        
        //bitwise &-And,|-or,^-xor,~-not,<<-left shift,>>-right shift

    }
}
