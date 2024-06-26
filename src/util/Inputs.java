import java.util.Scanner;

public class Inputs{
    private Scanner leitor;

    public Inputs (){
        leitor = new Scanner(System.in);
    }

    public String getStringInput(){
        return leitor.nextLine();
    }

    public int getIntInput(){
        return Integer.parseInt(leitor.nextLine());
    }

    public double getDoubleInput(){
        return Double.parseDouble(leitor.nextLine());
    }
}