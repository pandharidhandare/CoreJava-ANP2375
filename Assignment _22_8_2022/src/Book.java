
public class Book extends WrittenItem {
 void infoLibrary() {
	
 }

 public static void main(String [] args) {
	 Book book1 = new Book();
	 book1.itemInfo(2018033700,"Lashmikant",5);
    book1.setAuthorName("DR.ABDUL KALAM ");
System.out.println( book1.getAuthorName());
JournnalPaper j1 = new JournnalPaper();
j1.setYearOfPublis(2005);
System.out.println(j1.getYearOfPublis());
}
}