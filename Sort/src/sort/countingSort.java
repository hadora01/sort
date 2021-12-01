package sort;

public class countingSort {
	public static void main(String[] args) {
		int[] array=new int[100]; //������ ���� ���� 
		int[] counting=new int[31]; //���� ���� 
		int[] result= new int[100]; //���ĵ� �迭 
		
		//������ �迭 ����� 
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*31); //0~30
		} 
		
		//counting sort ���� 1 -> ���� ���� �迭���� �����ϱ� 
		for(int i=0; i<array.length; i++) {
			counting[array[i]]++;
		}
		//����2
		for(int i=1; i<counting.length; i++) {
			//������ ���ϱ� 
			counting[i]+=counting[i-1];
		}
		//����3  i��° ���Ҹ� �ε����� �ϴ� counting �迭�� 1��������, counting�迭�� ���� �ε����Ͽ�result�� value�� ����
		for (int i = array.length - 1; i>=0; i--) {
			int value=array[i];
			counting[value]--;
			result[counting[value]]=value;
		}
		
		//�ʱ� �迭
		System.out.println("array[]");
		for (int i = 0; i < array.length; i++) {
			if(i%10 ==0) System.out.println();
			System.out.println(array[i]+"\t");
		}System.out.println("\n\n");
		
		//counting �迭
		System.out.println("counting[]");
		for (int i = 0; i < counting.length; i++) {
			if(i%10 ==0) System.out.println();
			System.out.println(counting[i]+"\t");
		}System.out.println("\n\n");
		
		//���ĵ� �迭
		System.out.println("result[]");
		for (int i = 0; i < result.length; i++) {
			if(i%10 ==0) System.out.println();
			System.out.println(result[i]+"\t");
		}System.out.println("\n\n");
		
		
	}
}
