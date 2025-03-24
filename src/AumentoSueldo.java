
import java.util.Scanner;

public class AumentoSueldo {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        
	        // Pedir tipo de empleado
	        System.out.print("Introduce tu tipo de empleado (programador, analista, comercial): ");
	        String tipoEmpleado = scanner.next().toLowerCase();
	        
	        // Determinar el sueldo base según el tipo de empleado
	        double sueldo;
	        switch (tipoEmpleado) {
	            case "programador":
	                sueldo = 1500;
	                break;
	            case "analista":
	                sueldo = 1700;
	                break;
	            case "comercial":
	                sueldo = 1400;
	                break;
	            default:
				String error = "Tipo de empleado no válido.";
				System.out.println(error);
	                scanner.close();
	                return;
	        }
	        
	        // Pedir años en la empresa
	        System.out.print("Introduce tus años en la empresa: ");
	        int tiempoEnLaEmpresa = scanner.nextInt();
	        
	        // Determinar el porcentaje de aumento según el tipo de empleado
	        double aumento = 0;
	        if (tipoEmpleado.equals("programador")) {
	            if (tiempoEnLaEmpresa > 5 && tiempoEnLaEmpresa < 10) {
	                aumento = 0.05;
	            } else if (tiempoEnLaEmpresa >= 10 && tiempoEnLaEmpresa < 15) {
	                aumento = 0.10;
	            } else if (tiempoEnLaEmpresa >= 15) {
	                aumento = 0.15;
	            }
	        } else if (tipoEmpleado.equals("analista")) {
	            if (tiempoEnLaEmpresa > 5 && tiempoEnLaEmpresa < 10) {
	                aumento = 0.06;
	            } else if (tiempoEnLaEmpresa >= 10 && tiempoEnLaEmpresa < 15) {
	                aumento = 0.12;
	            } else if (tiempoEnLaEmpresa >= 15) {
	                aumento = 0.18;
	            }
	        } else if (tipoEmpleado.equals("comercial")) {
	            if (tiempoEnLaEmpresa > 5 && tiempoEnLaEmpresa < 10) {
	                aumento = 0.04;
	            } else if (tiempoEnLaEmpresa >= 10 && tiempoEnLaEmpresa < 15) {
	                aumento = 0.08;
	            } else if (tiempoEnLaEmpresa >= 15) {
	                aumento = 0.12;
	            }
	        }
	        
	        // Calcular el nuevo sueldo
	        double nuevoSueldo = sueldo + (sueldo * aumento);
	        
	        // Mostrar el resultado
	        System.out.println("Tipo de empleado: " + tipoEmpleado);
	        System.out.println("Sueldo base: " + sueldo + " €");
	        System.out.println("Tu nuevo sueldo será: " + nuevoSueldo + " €");
	        
	        scanner.close();
	    }
	}