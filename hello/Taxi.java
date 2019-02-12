import java.util.Scanner;

public class Taxi {
	public static void main(String[] args) {
		System.out.println("Input KM:");//вывод на косноль текста
		//создание объекта типа Scanner для считывания
		//из консоли
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cost = n * 30;
		//условный оператор
		if (cost > 300) {
			//если условие выполнено, то выполнить след. строчку
			cost = cost - 50;//делаем скидку
		}
		System.out.println(cost);//вывод результата на экран
	}
}



