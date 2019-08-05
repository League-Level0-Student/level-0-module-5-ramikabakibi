package _06_for_loop_gauntlet;

public class ForLoopGauntlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//finished all codes up to this one but forgot to save
		
//#2 in Nested For Loops: 
		for(int x=1;x<10;x++) {
			System.out.print(x+" ");
			if(x%3==0) {
				System.out.print("\n");
			}
		}
		
//#3 in Nested For Loops:
		for(int k=0;k<100;k+=10) {
		for(int j=k+1;j<=k+10;j++) {
			System.out.print(j+" ");
			
			
		}
		System.out.print("\n");
		}
//#4 in Nested For Loops:
		String i="*";
	
	for(int k=0;k<=6;k++) {
		for(int l=0;l<k;l++)
			System.out.print(i);
		System.out.print("\n");
			
	}
		
	}

}
