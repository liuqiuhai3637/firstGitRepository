import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Repeat{
	public static void main (String[] args){

/* ����:�ظ����ֺ�����ַ�count��,countΪ���ֵĴ�С,���ֵ�ȡֵ��Χ��1-9
����:
1.¼��һ���ַ���
2.�ж�¼����ַ����Ƿ�Ϸ�
3.���Ϸ�����һ�����ֵ�����̨
4.�Ϸ����û�ȡ����n�ͷ�����s����ɵ��ַ���ns
5.��s�ظ�n��,�õ��ַ���repeats
6.��������ַ���������̨ */
		System.out.println("�������ַ���:�����ҵ�san����������branch���޸�java�ļ�");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();//�õ�������ַ���,��str�洢		String newStr = "";//����һ�������������ַ����Ŀ��ַ���		System.out.println("��������ַ�����"+str);
		char[] arr = str.toCharArray();//���ַ���д���ַ�����		for(int i = 0 ; i<arr.length ; i++){//ѭ���ж������е�Ԫ���Ƿ�Ϊ��������һ��Ԫ�ز�������			if((i<arr.length -1)&&Character.isDigit(arr[i])&&arr[i]!='0'&&(!Character.isDigit(arr[i+1]))){				//���Ԫ���������Ҳ�Ϊ0,���ظ�				// int count = Integer.parseInt(arr[i]+"") ;				for(int j = 0 ;j < Integer.parseInt(arr[i]+"")-1 ; j++){					newStr += arr[i+1];				}			}else{				newStr += arr[i];			}		}		System.out.println("�õ������ַ�����"+newStr);
	}
}