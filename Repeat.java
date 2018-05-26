import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Repeat{
	public static void main (String[] args){

/* 需求:重复数字后面的字符count次,count为数字的大小,数字的取值范围是1-9
分析:
1.录入一个字符串
2.判断录入的字符串是否合法
3.不合法返回一段文字到控制台
4.合法就用获取数字n和非数字s的组成的字符串ns
5.把s重复n次,得到字符串repeats
6.返回最后到字符串到控制台 */
		System.out.println("请输入字符串:这是我第san次用张三的branch来修改java文件");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();//得到输入的字符串,用str存储		String newStr = "";//定义一个用来接收新字符串的空字符串		System.out.println("您输入的字符串是"+str);
		char[] arr = str.toCharArray();//把字符串写进字符数组		for(int i = 0 ; i<arr.length ; i++){//循环判断数组中的元素是否为数字且下一个元素不是数字			if((i<arr.length -1)&&Character.isDigit(arr[i])&&arr[i]!='0'&&(!Character.isDigit(arr[i+1]))){				//如果元素是数字且不为0,就重复				// int count = Integer.parseInt(arr[i]+"") ;				for(int j = 0 ;j < Integer.parseInt(arr[i]+"")-1 ; j++){					newStr += arr[i+1];				}			}else{				newStr += arr[i];			}		}		System.out.println("得到的新字符串是"+newStr);
	}
}