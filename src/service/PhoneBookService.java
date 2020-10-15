package service;

import display.BookPhoneList;
import model.PhoneBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PhoneBookService implements IPhoneBook<PhoneBook> {

    @Override
    public void add(PhoneBook object) {
        for (int i = 0; i < BookPhoneList.listBookPhone.size(); i++) {
            if (object.getPhoneNumber().equals(BookPhoneList.listBookPhone.get(i).getPhoneNumber())) {
                System.out.println("numberPhone đã tồn tại");
                break;
            }else {
                BookPhoneList.listBookPhone.add(object);
                break;
            }
        }
    }

@Override
    public void update(String numberPhone, PhoneBook newPhoneBook) {
        for (int i = 0; i < BookPhoneList.listBookPhone.size(); i++) {
            if (numberPhone.equals(BookPhoneList.listBookPhone.get(i).getPhoneNumber())) {
                BookPhoneList.listBookPhone.set(i, newPhoneBook);
            } else {
                System.out.println("không tìm thấy số trên");
            }
        }
    }

   @Override
    public void delete(String numberPhone) {
        for (int i = 0; i < BookPhoneList.listBookPhone.size(); i++) {
            if (numberPhone.equals(BookPhoneList.listBookPhone.get(i).getPhoneNumber())) {
                BookPhoneList.listBookPhone.remove(i);
            } else {
                System.out.println("ko tìm thấy số");
            }
        }
    }

    @Override
    public List<PhoneBook> findName(String name) {
        List<PhoneBook> listName = new LinkedList<>();
        for (int i = 0; i < BookPhoneList.listBookPhone.size(); i++) {
            if (name.equals(BookPhoneList.listBookPhone.get(i).getName()) ) {
                listName.add(BookPhoneList.listBookPhone.get(i));
            }
        }
        return listName;
    }

    @Override
    public List<PhoneBook> findAll() {
        List<PhoneBook> listAll = new ArrayList<>();
        Iterator<PhoneBook> iterator = BookPhoneList.listBookPhone.iterator();
        while (iterator.hasNext())
            listAll.add(iterator.next());
        return listAll;
    }

    public void disPlay(List<PhoneBook> productList) {
        Iterator<PhoneBook> iterator = productList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
