
public class Main { 
	static int	ugcount = 0 ;
   static int	pgcount = 0;
	static int	degreecount = 0;
 void countObject(Degree ...obj1) {
	for(Degree obj : obj1) { 
		
		         if 
		        	(obj instanceof PostGraduate) {
		           pgcount++;
		        }
		        else if 
		        (obj instanceof UnderGraduate ) {
		        	ugcount++;}
		        else if(obj instanceof Degree) {
			degreecount++;
				}
		}
	
		System.out.println("number of object in Degree  "+degreecount);
		System.out.println("number of object in PostGradute "+ugcount);
		System.out.println("number of object in UnderGraduate "+pgcount);
	
 }
	
	public static void main(String[] args) {
		Main main1 = new Main();
		PostGraduate pg1 = new PostGraduate();
		PostGraduate pg2 = new PostGraduate();
		PostGraduate pg3 = new PostGraduate();
		Degree degree1 = new Degree();
		Degree degree2 = new Degree();
		Degree degree3 = new Degree();
		UnderGraduate ug1 = new UnderGraduate();
		UnderGraduate ug2 = new UnderGraduate();
		UnderGraduate ug3 = new UnderGraduate();
		main1.countObject(pg1,pg2,pg3,ug1,ug2,ug3,degree1,degree2,degree3);
	}

}
