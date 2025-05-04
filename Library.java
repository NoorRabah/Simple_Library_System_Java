
package librarysystemm;

public class Library {
  int s=0;  
  Book arr[]=new Book[1000];
    public Library() {
     
    }
    void addBook(Book b){
        arr[s]=b;
        s++;
    }
    void search(String title){
        for(int i=0;i<arr.length;i++)
            if(arr[i].getBookTitle().equals(title)) 
            {
                arr[i].setAvS(true);
                System.out.println(arr[i].toString());
            }
                else {
                arr[i].setAvS(false);
                System.out.println(arr[i].toString());
    }
    }
         void searchh(String author){
        for(int i=0;i<arr.length;i++)
            if( arr[i].getAuthor().equals(author)) 
            {
                arr[i].setAvS(true);
                System.out.println( arr[i].toString());
            }
                else {
                arr[i].setAvS(false);
                System.out.println(arr[i].toString());
    }
    }
    void display(){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i].toString());
    }
    
}