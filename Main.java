import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double height,height2,weight,weight2;
                System.out.print("�P�l�ڂ̐g��:");
                height = s.nextDouble();
                System.out.print("�P�l�ڂ̑̏d:");
                weight = s.nextDouble();
		iSystem.out.print("�Q�l�ڂ̐g��:");
                height2 = s.nextDouble();
                System.out.print("�Q�l�ڂ̑̏d:");
                weight2 = s.nextDouble();
                double bmi = weight / (height * height);
                String bmi1 = String.format("%.2f",bmi);
                double BMI = Double.parseDouble(bmi1);
		double bmi2 = weight2 / (height2 * height2);
		String bmi3 = String.format("%.2f",bmi2);
		double BMI1 = Double.parseDouble(bmi3);
                System.out.println(BMI);
	        System.out.println(BMI1);
    }
}
