package src;

import java.util.Scanner;

public class Trivia {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc,change;
		String resp;
		char a='s';
		String pregunta_config;
		String preguntas_posibles[] = new String [4];
		
		//Crear objetos de clases
		
		Scanner sc = new Scanner (System.in);
		
		while(a=='s') {
		System.out.printf ("\n      	Juego de Trivia      ");
		System.out.printf ("\n[1].  Configuracion");
		System.out.printf ("\n[2].  Juego");
		System.out.printf ("\n[3].  Consulta de puntaje obtenido");
		System.out.printf ("\n[4].  Salir\n");
		
		opc = sc.nextInt();
		switch (opc) {
			case 1:
				System.out.printf ("\n      	Configuraci�n     ");
				System.out.printf ("\nIngrese la pregunta: ");
				pregunta_config = sc.nextLine();
				System.out.printf ("\nIngrese las posibles respuestas: "); 
				for(int i=0;i<preguntas_posibles.length;i++) {
					preguntas_posibles[i] = sc.nextLine();
					}
				System.out.printf ("\nIngrese la respuesta correcta: ");
				System.out.printf ("\nIngrese el puntaje de la respuesta correcta: ");
				break;
			case 2:
				System.out.printf ("\n      Hasta la proximaaaaaaaas	:v     ");
			case 3:
				System.out.printf ("\n     Rip	:v     ");

				
		}
	     
		System.out.printf ("\n1. �A�o en que se descubre America? "); 
		System.out.printf ("\n2. �Cual es la cabecera de la provincia de Cocl�? "); 
		System.out.printf ("\n3. �Cual es raiz cuadrada de 3600? "); 
		System.out.printf ("\n4. Panam� limita al norte con "); 
		System.out.printf ("\n5. �Cantidad de Comarcas indigenas que tiene Panam�? "); 
		System.out.printf ("\n6. �Cuantos distritos tiene la provincia? "); 
		System.out.printf ("\n7.  Panam� limita con Colombia al"); 
		System.out.printf ("\n8.  El itsmo de Panam� fue visitado por primera vez por  "); 
		System.out.printf("\n9. �A�o en que fue fundado la ciudad de Panam�?");
		System.out.printf("\n10. �Fue el primer europeo en division el oceano Pacifico?");
		
	
		change = sc.nextInt();
		switch(change) {
		case 1: 
			System.out.printf ("\n1. �A�o en que se descubre America? "); 
			System.out.printf ("\n a) 1492 "); 
			System.out.printf ("\n b) 1512 "); 
			System.out.printf ("\n c)1903 "); 
			System.out.printf ("\n d)2016 "); 
			System.out.printf ("\n Seleccione la respuesta correcta"); 
			resp=sc.next();
			System.out.printf ("\n Seleccione la respuesta correcta"); 
			
			
		case 2:
			
			System.out.printf ("\n1. C�al es la cabecera de la provincia de Cocl�?"); 
			System.out.printf ("\n Aguadulce  "); 
			System.out.printf ("\n Penonom�  "); 
			System.out.printf ("\n Anton "); 
			System.out.printf ("\n Nata "); 
			System.out.printf ("\nSeleccione la respuesta correcta "); 
		    resp=sc.next();
			System.out.printf ("\n Seleccione la respuesta correcta "); 
		
		case 3: 
			System.out.printf ("\n3. �Cual es raiz cuadrada de 3600? "); 
			System.out.printf ("\n  600"); 
			System.out.printf ("\n 6 "); 
			System.out.printf ("\n 60 "); 
			System.out.printf ("\n 6000 "); 
			System.out.printf ("\nSeleccione la respuesta correcta "); 
			resp=sc.next();
			
		case 4: 
			System.out.printf ("\n4. Panam� limita al norte con "); 
			System.out.printf ("\n Panam� limita al norte con "); 
			System.out.printf ("\n Panam� limita al norte con "); 
			System.out.printf ("\n Panam� limita al norte con "); 
			System.out.printf ("\n Panam� limita al norte con "); 
			System.out.printf ("\nSeleccione la respuesta correcta ");
			resp=sc.next();
		
		case 5:
			System.out.printf ("\n5. �Cantidad de Comarcas indigenas que tiene Panam�? "); 
			System.out.printf ("\n 1 "); 
			System.out.printf ("\n 5 "); 
			System.out.printf ("\n 3 "); 
			System.out.printf ("\n 6 "); 
			System.out.printf ("\nSeleccione la respuesta correcta "); 
			resp=sc.next();
			
		case 6:
			System.out.printf ("\n �Cuantos distritos tiene la provincia? "); 
			System.out.printf ("\n 78 "); 
			System.out.printf ("\n58 "); 
			System.out.printf ("\n 68"); 
			System.out.printf ("\n 48 "); 
			System.out.printf ("\nSeleccione la respuesta correcta "); 
			resp=sc.next();
			
		case 7:
			System.out.printf ("\n7.  Panam� limita con Colombia al"); 
			System.out.printf ("\n Norte"); 
			System.out.printf ("\n Sur"); 
			System.out.printf ("\n  Este"); 
			System.out.printf ("\n Oeste"); 
			System.out.printf ("\nSeleccione la respuesta correcta "); 
			resp=sc.next();
		
		case 8:
			System.out.printf ("\n8.  El itsmo de Panam� fue visitado por primera vez por  "); 
			System.out.printf ("\n Vasco N��ez de Balboa"); 
			System.out.printf ("\n Rodrigo de Bastidas  "); 
			System.out.printf ("\n  Diego de nicueza  "); 
			System.out.printf ("\n Cristobal Col�n  "); 
			System.out.printf ("\nSeleccione la respuesta correcta "); 
			resp=sc.next();
		
		case 9:
			System.out.printf("\n9. �A�o en que fue fundado la ciudad de Panam�?");
			System.out.printf("\n 1519");
			System.out.printf("\n 1529");
			System.out.printf("\n 1512");
			System.out.printf("\n 1509");
			System.out.printf ("\nSeleccione la respuesta correcta "); 
			resp=sc.next();
		
		case 10:
			System.out.printf("\n10. �Fue el primer europeo en division el oceano Pacifico?");
			System.out.printf("\n Cristobal Col�n");
			System.out.printf("\n Vazvo Nu�ez de Balboa ");
			System.out.printf("\n Rodrigo de Bastidas");
			System.out.printf("\nDiego de Nicueza");
			System.out.printf ("\nSeleccione la respuesta correcta "); 
			resp=sc.next();
		}
	}
}


			
			
			
			


}