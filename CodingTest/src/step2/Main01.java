package step2;

import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short a, b;
		a = sc.nextShort();
		b = sc.nextShort();
		
		if(a < b) {
			System.out.println("<");
		}else if (a > b) {
			System.out.println(">");
		}else if (a == b) {
			System.out.println("==");
		
			sc.close();
				}
			}
		}
