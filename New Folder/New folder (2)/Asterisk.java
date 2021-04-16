public class Asterisk{

public static int printAsterisks(int n){

if(n==0){

return n;

}

System.out.print("*");

return printAsterisks(n-1);

}
}