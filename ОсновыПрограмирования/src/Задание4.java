import java.util.Scanner;
public class �������4 
{
	public static void main(String[] args) {
		final String login="Admin", password="Admin", user="�����";
		String u_login, u_password;
		Scanner input = new Scanner(System.in);
		System.out.println("������� �����: ");
			u_login = input.nextLine();
		System.out.println("������� ������: ");
			u_password = input.nextLine();
	if(u_login.equals(login) && u_password.equals(password))
		System.out.println("����� ���������� " + user);
	else
		System.out.println("���� ��������");
	}
}