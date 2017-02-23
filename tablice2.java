public class tablice2{
	public static void main(String args[]){
		
		boolean tablica[]=new boolean[20];
		int i=0;
		for(;i<tablica.length;i++){
			if(i%2==0){
				tablica[i]=true;
				 System.out.println("Tablica nr["+ i + "] =" + tablica[i] );
			}
			
			else{
				tablica[i]=false; 
				System.out.println("Tablica nr["+i+"]=" +tablica[i]);		
			}
		}
	
		
	}
	
}