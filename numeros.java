import java.util.Scanner;

public class numeros {


	static Scanner lector=new  Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		int cadena[] = new int[5];
		
		System.out.println("Mete los numeros");
		for(int i=0;i<cadena.length;i++){
			cadena[i]=lector.nextInt();
		}
		
		for(int i=0;i<cadena.length-1;i++){
			for(int j=i+1;j<cadena.length;j++){
				if(cadena[i]<cadena[j]){
					int temporali=cadena[i];
					int temporalj=cadena[j];
					cadena[i]=temporalj;
					cadena[j]=temporali;
				
				}
			}
		}
		
		System.out.println(cadena[4]);

	
	}

}
