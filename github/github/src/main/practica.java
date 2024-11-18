package main;

public class practica {

public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] sumArray = {4,36,4,23,867};
			int[] subArray = {785675, 56, 5675, 56544, 234};
			int[] prodArray = {6, 8, 20, 23, 12};
			
			// User 1 fer la suma dels elements de sumArray (Jan)
			int resultadoSuma = 0;
		    for (int numero : sumArray) {
			resultadoSuma += numero;
		    }
		    System.out.println("El resultado de la suma es " + resultadoSuma );
		
			// User 2 fer la resta dels elements de subArray
			int resultadoResta = subArray[0];
			for (int i = 1; i < subArray.length; i++){
				resultadoResta -= subArray[i];
			}
			System.out.println("El resultado de la resta es " + resultadoResta);

			// User 3 fer la multiplicació dels elements de prodArray
			int resultadoMultiplicacion =1;
			for (int numero : prodArray) {
				resultadoMultiplicacion *= numero;
			}
			System.out.println("Resultado Multiplicacion" + resultadoMultiplicacion);
		}

	}
