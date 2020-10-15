import display.DisPlay;
import model.PhoneBook;
import service.PhoneBookService;
import service.ReadFile;
import service.Write;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===List===");
        DisPlay display = new DisPlay();
        display.displayList();
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                int select;
                System.out.println("select: ");
                select = scanner.nextInt();
                switch (select) {
                    case 1:
                        display.add();
                        display.displayList();
                        break;
                    case 2:
                        display.update();
                        display.displayList();
                        break;
                    case 3:
                        display.delete();
                        display.displayList();
                        break;
                    case 4:
                        display.findName();
                        display.displayList();
                        break;
                    case 5:
//                        ReadFile readFile = new ReadFile();
                        ReadFile.readFile();
                        break;
                    case 6:
                        Write.write();
                        break;
                    case 8:
                        System.exit(0);
                    default:
                        System.out.println("khong co trong menu, nhap lai: ");
                }
            }

        } catch (Exception e) {
            System.out.println("vui lòng nhập Đúng");
        }
    }
}
