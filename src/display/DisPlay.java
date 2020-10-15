package display;

import model.PhoneBook;
import service.PhoneBookService;

import java.util.List;
import java.util.Scanner;

public class DisPlay {
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("Menu: ");
        System.out.println("1: add");
        System.out.println("2: update");
        System.out.println("3: delete");
        System.out.println("4: find number");
        System.out.println("5: đọc file");
        System.out.println("6: save file");
        System.out.println("8: Exit");
    }

    PhoneBookService phoneBookService = new PhoneBookService();

    public void displayList() {
        List<PhoneBook> products = phoneBookService.findAll();
        phoneBookService.disPlay(products);
        menu();
    }

    public void add() {
        System.out.println("==ADD==");
        System.out.println("ban muon them bao số vào danh bạ: ");
        int newProduct = scanner.nextInt();
        for (int i = 0; i < newProduct; i++) {
            System.out.println("input ten :");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("input number: ");
            String numberPhone = scanner.nextLine();
            System.out.println("input Address: ");
            String address = scanner.nextLine();
            System.out.println("input Email:");
            String email = scanner.nextLine();
            PhoneBook food = new PhoneBook(name, numberPhone, address, email);
            phoneBookService.add(food);
        }
    }

    public void update() {
        System.out.println("===update===");
        System.out.println("input number muon update: ");
        String number = scanner.nextLine();
        System.out.println("input newName: ");
        String newName = scanner.nextLine();
        System.out.println("input newNumber: ");
        String newNumber = scanner.nextLine();
        System.out.println("input new address");
        String newAddress = scanner.nextLine();
        System.out.println("input new address");
        String newEmail = scanner.nextLine();
        PhoneBook phoneBook = new PhoneBook(newName, newNumber, newAddress, newEmail);
        phoneBookService.update(number, phoneBook);

    }

    public void delete() {
        System.out.println("===delete===");
        System.out.println("input number muon xoa : ");
        String numberDelete = scanner.nextLine();
        phoneBookService.delete(numberDelete);
    }

    public void findName() {
        System.out.println("====findName");
        System.out.println("input name muốn tìm");
        String nameFind = scanner.nextLine();
        System.out.println(phoneBookService.findName(nameFind));
        System.out.println("====List====");
    }

    }
