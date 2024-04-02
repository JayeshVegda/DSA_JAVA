import java.util.Scanner;
public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Cost of Pen : ");
        float pen = sc.nextFloat();
        System.out.print("Cost of Pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Cost of Eraser : ");
        float Eraser = sc.nextFloat();
        System.out.println();
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Cost of Pen : " + pen);
        System.out.println("Cost of Pencil : " + pencil);
        System.out.println("Cost of Eraser : " + Eraser);
        System.out.println("Total Cost  : " + (pen + pencil + Eraser));
        System.out.println("Total 18% Gst  : " + (pen + pencil + Eraser) * (0.18));
        System.out.println("Final Price   : " + (((pen + pencil + Eraser) *(0.18)) + (pen+ pencil + Eraser)));
    }
}
