package GitBranchApp;

public class MainApp {

	public static void main(String[] args) {
		//�o�O�Ĥ@�Ӫ���
		System.out.print("1st Version");
		//�o�O�@�ӷs�W�ƾǹB�⪺����
		Math cMath = new Math();
		
		System.out.println();
		System.out.print(cMath.add(10, 5));
		
	}

}
class Math{
	int add(int a, int c) {
		return a+c;
	}
}