package demo3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入姓名:");
		String name = input.next();
		System.out.println("您输入的姓名是:"+name);
		System.out.print("请输入年龄:");
		int age = input.nextInt();
		System.out.println("您输入的年龄是:"+age);
	}
}
