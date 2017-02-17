
public class inbreaka {
	
	public static void main(String args[]){
		
		for(int i=0; i<3;i++){
			//*jeżeli tu umieścimy breaka to nie wyświetli pary 2 0, 
			//*ponieważ przy obrocie dla 2 natknie się na break
			for(int j=0;j<3;j++){
				System.out.println(i+" "+j);
				if (i==2) break;
				//*wyświetli 2 0 ponieważ break jest w pętli wewnętrznej
				//* zdoła wykonać obrót dla 20
			}
		}
	}

}
