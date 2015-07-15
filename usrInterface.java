
// Jeancarlo Barrios 14652
// Dereck Olson 13207
// Cristian Del Carmen 12961
// userInterface

import java.util.Scanner;
public class usrInterface{

	 public static void main(String[] args){
		 // we create an instance of the radio 
		 RADIO mainRadio = new radio();
		 Scanner in = new Scanner(System.in);
		 System.out.println("El Radio Esta Apagado");
		 boolean ESTADO = false;
		 String state = "";
		 int amFm = 1;
		 // while loop fo the menu
		 while(true){
			 System.out.println("Ingrese la opcion de menu");
			 System.out.println("Opcion 1 On/Off");
			 System.out.println("Opcion 2 AM/FM FM/AM");
			 System.out.println("Opcion 3 para avanzar frequencia Maximo 150.0 minimo 80.0");
			 System.out.println("Opcion 4 para regresar frequencia Maximo 150.0 minimo 80.0");
			 System.out.println("Opcion 5 guarda estacion presente en pociocion de memoria 1-10");
			 System.out.println("Opcion 6 sintonzar estacion en pocicion de memoria 1-10");
			 System.out.println("Opcion 7 Quit");
			 System.out.println("Recordarse que hay que ensender el	radio antes de usar sus funciones");		 
			 System.out.println("");
			 
			 String usr_input = in.nextLine();
			 // if usser chooses 1 it chechs the previous state of estado and cahnges it to the oposite
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
			 // if usser chooses 2 check the freq modulation and changes to the other one 0 being
			 // 0 being AM 1 being FM
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
			
			// if the user chooses 3 it will move the frequency up by sending the parameter true
		    if (usr_input.equals("3") && ESTADO==true){
		       		
			       mainRadio.Sintonizar(true);
			       double freq = mainRadio.getEmisora();
				System.out.println("La frequencia es: " + freq );			
		       }
		    // if the user chooses 4 does the same as treu but it send a false
			if (usr_input.equals("4") && ESTADO==true){
		       		
				mainRadio.Sintonizar(false);
		        	double freq = mainRadio.getEmisora();
				System.out.println("La frequencia es: " + freq );			
		       }
				
			// 5 saves the current frequenxy in a memory position
			// then it displays what i did calling the frequency from radio
		    if (usr_input.equals("5") && ESTADO==true){
		       		System.out.println("Ingrese el numero de posicion de memoria");
				System.out.println("para guardar frequencia actual posiciones de memoria 1-10");	
				int pos = in.nextInt();
				mainRadio.Guardar(pos);
				double freq = mainRadio.getEmisora();
				System.out.println("La frequencua " + freq + " en la pocicion " + pos);				
		       }
      		
		    // 6 pulls from a postion in the array the frequency it posses
		    if (usr_input.equals("6") && ESTADO==true){
		       		System.out.println("Ingrese el numero de posicion de memoria");
				System.out.println("que desea escuchar");	
				int pos = in.nextInt();
				mainRadio.Memoria(pos);
				double freq = mainRadio.getEmisora();
				System.out.println("La frequencua " + freq + " de la pocicion " + pos);				
		       }

		    // Quits the program 
			if (usr_input.equals("7")){
				System.out.println("Program Terminated");
				break;
			}

			System.out.println("\n\n");

		 }
	 
	 }
}
