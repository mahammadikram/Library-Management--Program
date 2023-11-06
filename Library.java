import java.util.*;
class BookList {
     static List<Integer> list=new ArrayList<>();
    static  List<String> list1=new ArrayList<>();
     static  List<String> list2=new ArrayList<>();
    static List<Integer> list3=new ArrayList<>();
            static  void addBook(int Id, String Name, String  Author ,int price ){
                int i=0;
                list.add(Id);
                list1.add(Name);
                list2.add(Author);
                list3.add(price);
                    System.out.println("Book added Successfully");
                    System.out.println(" ID:"+list.get(i)+ " " + "Name: "+list1.get(i)+ "   Author: "+list2.get(i) +"   Price:"+ list3.get(i) +" ");
                    i++;
            }
            static  void  searchBook_byID(int Id ){
                if(list.size()==0){
                    System.out.println("No books is available");
                }
                for(int i=0;i<list.size();i++){
                    if(Id==list.get(i)){
                        System.out.println(" ID:"+list.get(i)+ " " + "Name: "+list1.get(i)+ "   Author: "+list2.get(i) +"   Price:"+ list3.get(i) +" ");
                    }
                }
              }
            static void searchBook_byName(String Name ){
                 if(list1.size()==0){
                    System.out.println("No books is available");
                }
                for(int  i=0;i<list1.size();i++){
                    if(Name.equals(list1.get(i))){   
                        System.out.println(" ID:"+list.get(i)+ " " + "Name: "+list1.get(i)+ "   Author: "+list2.get(i) +"   Price:"+ list3.get(i) +" ");
                    }
                } 
            }
          static   void searchBook_byAuthor(String Author ){
                if(list2.size()==0){
                    System.out.println("No books is available");
                }
                 for(int  i=0;i<list2.size();i++){
                    if(Author.equals(list2.get(i))){   
                    System.out.println(" ID:"+list.get(i)+ " " + "Name: "+list1.get(i)+ "   Author: "+list2.get(i) +"   Price:"+ list3.get(i) +" ");
                    }
                } 
            }
            static void bookList(){
                if(list.size()==0){
                System.out.println("No books are available in the list");
                }
            for(int i=0;i<list.size();i++){
                System.out.println("ID :"+list.get(i)+"    "+"Name :"+list1.get(i)+"     "+"Author :"+list2.get(i)+"        "+"        "+"Price :"+list3.get(i));
            }
        }
    }
public class Library{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcom to My Library!.. ");
        System.out.println("_______________________________________________________");
        while(true){
            System.out.println(" Enter the Choice \n 1: For adding a book\n 2:Search for book\n 3:List of book\n 4:Exit");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter the book details");
                System.out.println("Enter the Book id");
                int b_id=sc.nextInt();
                System.out.println("Enter the name of the book ");
                String b_name=sc.next();
                System.out.println("enter the Author name");
                String b_author=sc.next();
                System.out.println("Enter the price of the Book");
                int b_price=sc.nextInt();
                BookList.addBook(b_id, b_name, b_author, b_price);
                break;
                case 2:
                System.out.println("1:Search by Id \n 2: Search by Name\n 3: Search by Author");
                int n=sc.nextInt();
                    switch(n){
                        case 1:
                        System.out.println("enter the Id number ");
                        int ID=sc.nextInt();
                         BookList.searchBook_byID(ID);
                         break;
                        case 2:
                        System.out.println("enter the Name of Book");
                        String NAME=sc.next();
                        BookList.searchBook_byName(NAME);
                        break;
                        case 3:
                        System.out.println("Enter  the Author Name");
                        String AUTHOR =sc.next();
                        BookList.searchBook_byAuthor(AUTHOR);
                        break;
                        default:
                        System.out.println("Sorry this Book not available ");
                    }
                break;
            case 3:
                BookList.bookList();
                break;
            case 4:
                System.out.println("Thank you Visit again");
                System.exit(0);
            default:
                    System.out.println("Sorry Invalid search found");
            } 
        }
    }
}