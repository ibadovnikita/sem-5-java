import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collections;



public class homework_5 {
    public static void main(String[] args) {
        /*Реализуйте структуру телефонной книги 
        с помощью HashMap.

        Программа также должна учитывать, что во входной структуре 
        будут повторяющиеся имена с разными телефонами, 
        их необходимо считать, как одного человека 
        с разными телефонами. Вывод должен быть 
        отсортирован по убыванию числа телефонов. */
        Phone phone = new Phone();
        phone.add("9117252774", "Suren");
        phone.add("911", "Suren");
        phone.add("123456", "Vache");
        phone.add("987654321", "<Maria>");

        phone.print(phone);



    }

    
}


