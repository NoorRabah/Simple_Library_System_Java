package librarysystemm;

import java.util.Random;
import java.util.Scanner;

public class LibrarySystemm {

    
    public static void main(String[] args) { 
       Random r=new Random();
       Scanner ob=new Scanner(System.in);
       Library l=new Library();
       Book bb=new Book();
       Book bb1=new Book();
      for(int i=0;i<l.s;i++){
         l. arr[i]=new Book();
      }
      
      for(int i=0;i<l.s;i++){
          l.arr[i].setBookTitle("Book"+i);
           l.arr[i].setBookTitle("yazeed"+i);
          l.arr[i].setISBN(r.nextInt());
          l.arr[i].setAvS(r.nextBoolean());
      }
      l.addBook(bb);
      l.addBook(bb1);
      l.search(ob.next());
      l.searchh(ob.next());
    }
}

