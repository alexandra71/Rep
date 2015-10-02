package laba1_calc;
import java.util.Scanner;

/**
 * �����������
 * @author Andreeva
 */
public class SmallInteger extends calculation {


	
	public static int funcForLab3() {
		return 0;
	}
	
	/**
	 * ������� ����� ���������. ��������� ��������� �����, � ����� ������� �� ����� 
	 �� �����, ��������, ������������ � �������, �������������� ��� ������ ������� 
	 {@link #add(int, int) ��������}, {@link #sub(int, int) ���������}, 
	 {@link #mult(int, int) ���������}, {@link #div(int, int) �������}
	 * @param args - ��������� ��������� ������
	 * @exception ArithmeticException ��� ������� �� 0.
	 */
	public static void main(String[] args) {
		/** �������� - ������ �����*/
		int var1 = 0;
		/** �������� - ������ �����*/
		int var2 = 0;	
		/** �������� - ���� ������*/
		boolean bError = true;			
		Scanner in = new Scanner(System.in); // ������ ������ ������ Scanner
		System.out.println ("������� ������ �����, �� ������������� �� ����������� �������� 10000:");
		while (bError) {//���� ������������ ������ � ����� �����, ����� ���������� ��������� � ��������� ������� �����
			if (in.hasNextInt()){ // ���������� ������� ���� � ������ ����� ����� ������� ����� �����
	            var1 = in.nextInt(); // ��������� ����� ����� � ������ ����� � ��������� � ����������
	            while (Math.abs(var1)>10000){//���� ��������� ����� ��������� �� ������ 10000, ����� ���������� ��������������� ���������
		        	System.out.println ("������� �����, �� ������������� �� ����������� �������� 10000:");
	        		if (in.hasNextInt()){	        			
	        			var1 = in.nextInt();
	        		}
	        		else {
	    	        	in.next(); //������� � ���������� ��������� �����
	    	            continue;
	    	        }
	        	}
	        }
	        else {
	        	System.out.println ("������� �����:");
	        	in.next();
	            continue;
	        }
	        bError = false;
	    }	    
	    bError = true;	    
	    System.out.println ("������� ������ �����, �� ������������� �� ����������� �������� 10000:");
	    while (bError) {
	        if (in.hasNextInt()){
	            var2 = in.nextInt();
	            while (Math.abs(var2)>10000){
	        		System.out.println ("������� �����, �� ������������� �� ����������� �������� 10000:");
	        		if (in.hasNextInt()){	        			
	        			var2 = in.nextInt();
	        		}
	        		else {
	    	        	in.next();
	    	            continue;
	    	        }
	        	}
	        }
	        else {
	        	System.out.println ("������� ������ �����, �� ������������� �� ����������� �������� 10000:");
	        	in.next();
	            continue;
	        }
	        bError = false;
	    }	    
	    in.close(); // ��������� Scanner
	    add(var1,var2);
		sub(var1,var2);
		mult(var1,var2);	
		try{
				div(var1,var2);
			}
		catch (ArithmeticException e){
			System.out.print ("������� �� 0!");
			}
	}
}
