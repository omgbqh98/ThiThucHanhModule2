package display;

import model.PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class BookPhoneList {
    public static List<PhoneBook> listBookPhone;
    static{
        listBookPhone = new ArrayList<>();
        listBookPhone.add(new PhoneBook("Bùi Quang Huỳnh", "0986550039", "HN", "omgbqh@gmail.com"));
        listBookPhone.add(new PhoneBook("Nguyễn Văn A", "0324569087", "HN", "ahihi@gmail.com"));
        listBookPhone.add(new PhoneBook("Bui Thị B", "0954287566", "HN", "bhaha@gmail.com"));
    }
}
