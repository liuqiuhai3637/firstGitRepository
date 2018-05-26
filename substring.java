题目描述:

  书写一个类，类名为Itheima;

  类中有一个方法，方法名has12;

  给定一个整型数组，如果数组中有1元素, 并且在1元素后面的元素中还有2元素,
则返回true, 否则返回false.

思路:
1,循环的查找有没有1,如果找到了1,那么从当前位置往后面找有没有2的情况
如果有返回true

代码1:
public class Itheima{
	public boolean has12(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1){
				for (int j = i; j < arr.length; j++) {//注意j=i,目的就是为了从当前位置查找后面有没有2
					if(arr[j]==2){	
						return true;
					}
				}
			}
		}
		return false;
	}
}

代码2:
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