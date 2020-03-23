import java.util.Scanner;

public class CountCharAppearanceTimes {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap chuoi bat ky : ");
        String str = input.nextLine();

        System.out.print("Nhap vao ky tu muon tim : ");
        char character = input.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(character == str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
