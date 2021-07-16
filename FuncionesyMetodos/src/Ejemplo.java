import java.util.Scanner;

public class Ejemplo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Ingresa Primer numero");
		a= sc.nextInt();
		System.out.println("Ingresa Primer numero");
		b= sc.nextInt();
		System.out.println("Ingresa Primer numero");
		c= sc.nextInt();
		System.out.println(Comparando(a, b, c));
		sc.close();
	}
	public static String Comparando(int a, int b, int c) {
		String ordenar = null;
		if(a>b && a>c) {
			ordenar ="El mayor es "+a+" De mayor a menor "+ a;
			if(b>c) {
				ordenar= ordenar+ ", " + b
						+ ", " + c
						+ " de menor a mayor " + c +", "
						+b+ ", "+ a;
			}else {
				ordenar= ordenar+ ", " + c
						+ ", " + b
						+ " de menor a mayor " + b +", "
						+c+ ", "+ a;
			}
		}else if(b>a && b>c) {
			ordenar = "El mayor es "+b+ " De mayor a menor "+ b;
			if(a>c) {
				ordenar= ordenar+ ", " + a
						+ ", " + c
						+ " de menor a mayor " + c +", "
						+a+ ", "+ b;
			}else {
				ordenar= ordenar+ ", " + c
						+ ", " + a
						+ " de menor a mayor " + a +", "
						+c+ ", "+ b;
			}
		}else {
			ordenar ="El mayor es "+c+ " De mayor a menor "+ c;
			if(a>b) {
				ordenar= ordenar+ ", " + a
						+ ", " + b
						+ " de menor a mayor " + b +", "
						+a+ ", "+ c;
			}else {
				ordenar= ordenar+ ", " + b
						+ ", " + a
						+ " de menor a mayor " + a +", "
						+b+ " "+ c;
			}
		}
			
		
		return ordenar;
	}
}
