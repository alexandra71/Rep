package laba1_calc;

public class calculation {

	/**
	 * �����
	 * @param a - ������ ���������
	 * @param b - ������ ���������
	 */
	public static void add(int a, int b) {
		System.out.print ("�����:");
		System.out.println (a + b);
	}

	/**
	 * ��������
	 * @param a - �����������
	 * @param b - ����������
	 */
	public static void sub(int a, int b) {
		System.out.print ("���������:");
		System.out.println (a - b);
	}

	/**
	 * ���������
	 * @param a - ������ ���������
	 * @param b - ������ ���������
	 */
	public static void mult(int a, int b) {
		System.out.print ("���������:");
		System.out.println (a * b);
	}

	/**
	 * �������
	 * @param a - �������
	 * @param b - ��������
	 */
	public static void div(int a, int b) {
		System.out.print ("�������:");
		System.out.println (a / b);
	}

	public calculation() {
		super();
	}

}