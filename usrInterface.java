// Dereck Olson 13207
import java.util.Scanner;
public class usrInterface{

	 public static void main(String[] args){
		 
		 RADIO mainRadio = new radio();
		 Scanner in = new Scanner(System.in);
		 System.out.println("El Radio Esta Apagado");
		 boolean ESTADO = false;
		 String state = "";
		 int amFm = 1;
		 while(true){
			 System.out.println("Ingrese la opcion de menu");
			 System.out.println("Opcion 1 On/Off");
			 System.out.println("Opcion 2 AM/FM FM/AM");
			 System.out.println("Opcion 3 para avanzar frequencia Maximo 150.0 minimo 80.0");
			 String usr_input = in.nextLine();
			 
			 if (usr_input.equals("1")){
				 if (ESTADO==true){
					ESTADO = false;
					state = "apagado";
				 }
				 else{
					 ESTADO = true;
					 state = "prendido";
				 }
				 System.out.println("El radio esta " + state );
				 mainRadio.setESTADO(ESTADO);
				 
			 }
			if (usr_input.equals("2") && ESTADO==true){
				amFm = mainRadio.getAMFM();
				if (amFm==1){
					amFm--;
					System.out.println("Radio sintonizando AM");
				}
				else {
					amFm++;
					System.out.println("Radio sintonizando FM");
				}
				mainRadio.setAMFM(amFm);
				

			}	
			
		       if (usr_input.equals("3") && ESTADO==true){
		       		
			       mainRadio.Sintonizar(true);
			       double freq = mainRadio.getEmisora();
				System.out.println("La frequencia es: " + freq );			
		       }
			if (usr_input.equals("4") && ESTADO==true){
		       		
				mainRadio.Sintonizar(false);
		        	double freq = mainRadio.getEmisora();
				System.out.println("La frequencia es: " + freq );			
		       }

		       if (usr_input.equals("5") && ESTADO==true){
		       		System.out.println("Ingrese el numero de posicion de memoria");
				System.out.println("para guardar frequencia actual posiciones de memoria 1-10");	
				int pos = in.nextInt();
				mainRadio.Guardar(pos);
				double freq = mainRadio.getEmisora();
				System.out.println("La frequencua " + freq + " en la pocicion " + pos);				
		       }
       

		 }
	 
	 }
}
