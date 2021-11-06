/*=================================================================
| Author: Oleg Savelev
| File Name: RandomNumArray.java
| Purpose: To print all the double random numbers from 0 to 100 from
|	the array of the user defined size.
| Documentation: This Java program reads an integer from user, creates 
|	a new double array with a size of that integer, then assigns a double
|	random numbers from 0 to 100, then prints all the array values,
|	sum of the value and the max value. It uses "prnitf" to print a 
|	value with two floating point
|
| Revision History:
| Date               Name                  Revision
| --------------     -----------------     ---------------------
| 2021-11-05         Oleg Savelev          created
|
|==================================================================*/

//import Java.util.scanner;


public class RandomNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arraySize = 0;
		double sumVal = 0;
		
		java.util.Scanner scannerObj = new java.util.Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		arraySize = scannerObj.nextInt();
		
		System.out.println("Displaying all the array values: ");
		
		double[] arrayRandom = new double[arraySize];
		for(int i = 0; i < arrayRandom.length; i++) {
			arrayRandom[i] = Math.random() *100;
			System.out.printf("%.2f\n", arrayRandom[i]);
			sumVal += arrayRandom[i];
		}
		
		System.out.printf("Sum of the values: %.2f\n", sumVal);
		
		double maxVal = arrayRandom[0];
		for (int i = 0; i < arrayRandom.length; i++) {
			if(arrayRandom[i] > maxVal) maxVal = arrayRandom[i];
		}
		
		System.out.printf("Max value: %.2f\n", maxVal);
		
		scannerObj.close();		
	}
}
