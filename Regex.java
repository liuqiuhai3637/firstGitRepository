��Ŀ����:

  ��дһ���࣬����ΪItheima;

  ������һ��������������countTriple;

  ����Ԫ�顱��ָһ���������ֵ����ε��ַ������ظ����ַ�������Ԫ��ĸ�����
����Ԫ�顱�ǿ����ص��ģ���AAAA������������Ԫ��

˼·:
1,������˼��

����1:
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

����2:
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