
public class AvgTotalMarks {

	public static void main(String[] args) {
		
		int totalA , totalB , totalC , totalSub1 , totalSub2 , totalSub3 ;
		float avgA , avgB, avgC , avgSub1 , avgSub2 , avgSub3 ;
		
		// Subject wise marks for student 1 :-
		
		int a1=95 , b1=65 , c1=75 ;
		int a2=60 , b2=75 , c2=80 ;
		int a3=91 , b3=87 , c3=70 ;
		
		totalA=a1+a2+a3;
		totalB=b1+b2+b3;
		totalC=c1+c2+c3;
		
		System.out.println("Total marks of each subject :- \n Subject-A : "+totalA+" , Subject-B : "+totalB+" , Subject-C : "+totalC);
		
		avgA=totalA/3;
		avgB=totalB/3;
		avgC=totalC/3;
		
		System.out.println();
		System.out.println("Average marks of each subject :- \n Subject-A : "+avgA+" , Subject-B : "+avgB+" , Subject-C : "+avgC);
		
		totalSub1=a1+b1+c1;
		totalSub2=a2+b2+c2;
		totalSub3=a3+b3+c3;
		
		System.out.println();
		System.out.println("Total marks of each Student :- \n Student-1 : "+totalSub1+" , Student-2 : "+totalSub2+" , Student-3 : "+totalSub3);
		
		avgSub1=totalSub1/3;
		avgSub2=totalSub2/3;
		avgSub3=totalSub3/3;
		
		System.out.println();
		System.out.println("Average of each Student :- \n Student-1 : "+avgSub1+" , Student-2 : "+avgSub2+" , Student-3 : "+avgSub3);
		
		

	}

}
