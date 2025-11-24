import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = null;
		
		String marca;
		String gama;
		float precio;
		int stock, indice, menuPrin, subMenu;
		
		Celulares celular;
		
		List<Celulares> lista = new ArrayList<Celulares>();
		
		System.out.println("Pruebas de GitHub");
		System.out.println("actualizacion, modificacion proyecto");
		
		float numer1=20, numero=50;
		System.out.println("El resultado es "+ numer1*numero);
		
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1--AGREGAR");
			System.out.println("2--MOSTRAR");
			System.out.println("3--BUSCAR");
			System.out.println("4--EDITAR");
			System.out.println("5--ELIMINAR");
			System.out.println("6--BUSCAR POR MARCA");
			System.out.println("7--BUSCAR POR GAMA");
			System.out.println("8--CALCULAR DINERO INVERTIDO");
			System.out.println("9--ELIMINAR BUSCANDO POR MARCA");
			System.out.println("10--SALIR");
			
			lectura = new Scanner(System.in);
			menuPrin=lectura.nextInt();
			
			switch (menuPrin) {
			case 1:
				try {
					System.out.println("Ingrese la marca del cel");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();

					System.out.println("Ingrese la gama del celular");
					lectura = new Scanner(System.in);
					gama = lectura.nextLine();

					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					System.out.println("Ingrese el stock");
					lectura = new Scanner(System.in);
					stock = lectura.nextInt();
					
					//crear el objeto 
					celular = new Celulares(marca, gama, precio, stock);
					
					//agregar a la lista
					lista.add(celular);
					System.out.println("Se agrego con exito");
			
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al agregar el registo " + e.getMessage());
				}
				break;
			case 2:
				if (lista.size()>0) 
			        System.out.println(lista);
			     else 
			        System.out.println("No hay registros en la lista");			        			        			   
				break;
			case 3:
				if (lista.size() > 0) {
				    try {
				        System.out.println("Ingrese el indice del registro a buscar");
				        lectura = new Scanner(System.in);
				        indice = lectura.nextInt();

				        // Buscar
				        celular = lista.get(indice);
				        System.out.println("Se encontro el registro " + celular);

				    } catch (Exception e) {
				        // TODO: handle exception
				        System.out.println("No existe ese indice");
				    }
			
				}else 
			        System.out.println("No hay registros para buscar");
				break;
			case 4:  
			    if (lista.size() > 0) {
			        try {
			            System.out.println("Ingrese el indice del registro a editar");
			            lectura = new Scanner(System.in);
			            indice = lectura.nextInt();

			            // Buscar
			            celular = lista.get(indice);
			            System.out.println("Se encontro " + celular.getMarca());
			            
			         // gama y el precio
			            do {
			                System.out.println("SUBMENU PARA EDITAR");
			                System.out.println("1---GAMA");
			                System.out.println("2---PRECIO");
			                System.out.println("3---REGRESAR");

			                lectura = new Scanner(System.in);
			                subMenu = lectura.nextInt();

			                switch (subMenu) {
			                case 1:
			                    System.out.println("Ingrese la nueva gama");
			                    lectura = new Scanner(System.in);
			                    gama = lectura.nextLine();

			                    // Actualizar el objeto
			                    celular.setGama(gama);
			                    System.out.println("Se edito");
			                    break;
			                case 2:
			                    System.out.println("Ingrese el nuevo precio");
			                    lectura = new Scanner(System.in);
			                    precio = lectura.nextFloat();

			                    // Atualizacion
			                    celular.setPrecio(precio);
			                    System.out.println("Se edito");
			                    break;
			                case 3:
			                    break;
			                }
			            } while (subMenu < 3);
			            
			            
			        } catch (Exception e) {
			            // TODO: handle exception
			            System.out.println("No existe ese indice para editar");
			        }
			    } else
			        System.out.println("No hay registros para editar");
			
				break;
			case 5:
				try {
				    System.out.println("Ingrese el indice del registro a eliminar");
				    lectura = new Scanner(System.in);
				    indice = lectura.nextInt();

				    // Eliminar
				    lista.remove(indice);
				    System.out.println("Se elimino");
				} catch (Exception e) {
				    // TODO: handle exception
				    System.out.println("No existe ese indice para eliminar");
				}
				break;
			case 6:
				//Algoritmo
				/*Buscar por marca
				 * 1-- pedir al usuario la marca
				 * 2-- empezar a buscar
				 *  2.1 en la lista
				 *  2.2 recorrer la lista
				 *  2.3 comparacion
				 *  
				 * BAndera - robot es una variable boleana*/
				
				boolean bandera=false;
				
				System.out.println("Ingresa la marca a buscar");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();
				
				for (int i=0; i<lista.size(); i++) {
					if(marca.equals(lista.get(i).getMarca())) {
						System.out.println(lista.get(i));
						bandera =true;
						break; //detener ciclo
					}
				}
				// !bandera es igual a bandera==false
				if (bandera==false)
					System.out.println("No existe esa marca de celular");
				
				break;
			
			case 7:
				
				bandera=false;
				System.out.println("Ingresa la gama a buscar");
				lectura = new Scanner(System.in);
				gama = lectura.nextLine();
				
				for (int i=0; i<lista.size(); i++) {
					if(gama.equals(lista.get(i).getGama())) {
						System.out.println(lista.get(i));
						bandera =true;
						//eliminar break porque debe seguir mostrando; //detener ciclo
					}
				}
				// !bandera es igual a bandera==false
				if (bandera==false)
					System.out.println("No existe esa gama de celular");
				
				break;
			case 8:
				float resultado=0;
				for (Celulares cel : lista) {
					//otra forma ---- resultado = resultado+ cel.getPrecio()*cel.getStock();
					resultado += cel.getPrecio()*cel.getStock();
				}
				System.out.println("Total de dinero invertido " + resultado);
				break;
			case 9:
				System.out.println("Ingrese la marca del registro a eliminar");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();
				boolean bandera2=false;
				
				for(int i=0; i<lista.size(); i++) {
					Celulares cel = lista.get(i);
					
					if (marca.equals(cel.getMarca())){
						// eliminar por indice
						lista.remove(i);
						bandera2=true;
						// lista.remove(cel); ---eliminar por objeto
						System.out.println("Se elimino");										
						break;
						
					}
				}

				if (!bandera2)
					System.out.println("No existe ese registro para eliminar");
				break;
			case 10:
				break;
		
			}
			
			
			
		} while (menuPrin < 10);
		
		lectura.close();

	}

}
