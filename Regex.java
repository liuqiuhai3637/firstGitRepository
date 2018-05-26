题目描述:

  书写一个类，类名为Itheima;

  类中有一个方法，方法名countTriple;

  “三元组”是指一个连续出现的三次的字符，返回给定字符串中三元组的个数，
“三元组”是可以重叠的：“AAAA”包含两个三元组

思路:
1,计数器思想

代码1:
public class Itheima{
	public int countTriple(String str){
		int count=0;
		for (int i = 0; i < str.length()-2; i++) {
			if(str.charAt(i)==str.charAt(i+1) && str.charAt(i+1)==str.charAt(i+2)){
				count++;
			}
		}
		return count;
	}
}

代码2:
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Itheima{
	public int countTriple(String str){
		int count=0;
		String regex = "(.)\\1{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		while(m.find()){
			count+=m.group().length()-2;
		}
		return count;
	}
}