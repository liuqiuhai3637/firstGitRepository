��Ŀ����:

  ��дһ���࣬����ΪItheima;

  ������һ��������������has12;

  ����һ���������飬�����������1Ԫ��, ������1Ԫ�غ����Ԫ���л���2Ԫ��,
�򷵻�true, ���򷵻�false.

˼·:
1,ѭ���Ĳ�����û��1,����ҵ���1,��ô�ӵ�ǰλ������������û��2�����
����з���true

����1:
public class Itheima{
	public boolean has12(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1){
				for (int j = i; j < arr.length; j++) {//ע��j=i,Ŀ�ľ���Ϊ�˴ӵ�ǰλ�ò��Һ�����û��2
					if(arr[j]==2){	
						return true;
					}
				}
			}
		}
		return false;
	}
}

����2:
public class Itheima{
	public boolean has12(int[] arr){
		String str = "";
		for (int i : arr) {
			str+=i;
		}
		int index = str.indexOf("1");
		if(index!=-1){
			return str.substring(index).contains("2");
		}
		return false;
	}
}