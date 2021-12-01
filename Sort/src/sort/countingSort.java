package sort;

public class countingSort {
	public static void main(String[] args) {
		int[] array=new int[100]; //수열의 원소 개수 
		int[] counting=new int[31]; //수의 범위 
		int[] result= new int[100]; //정렬된 배열 
		
		//임의의 배열 만들기 
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*31); //0~30
		} 
		
		//counting sort 과정 1 -> 값에 따른 배열원소 증가하기 
		for(int i=0; i<array.length; i++) {
			counting[array[i]]++;
		}
		//과정2
		for(int i=1; i<counting.length; i++) {
			//누적합 구하기 
			counting[i]+=counting[i-1];
		}
		//과정3  i번째 원소를 인덱스로 하는 counting 배열을 1감소한후, counting배열의 값을 인덱스하여result에 value값 저장
		for (int i = array.length - 1; i>=0; i--) {
			int value=array[i];
			counting[value]--;
			result[counting[value]]=value;
		}
		
		//초기 배열
		System.out.println("array[]");
		for (int i = 0; i < array.length; i++) {
			if(i%10 ==0) System.out.println();
			System.out.println(array[i]+"\t");
		}System.out.println("\n\n");
		
		//counting 배열
		System.out.println("counting[]");
		for (int i = 0; i < counting.length; i++) {
			if(i%10 ==0) System.out.println();
			System.out.println(counting[i]+"\t");
		}System.out.println("\n\n");
		
		//정렬된 배열
		System.out.println("result[]");
		for (int i = 0; i < result.length; i++) {
			if(i%10 ==0) System.out.println();
			System.out.println(result[i]+"\t");
		}System.out.println("\n\n");
		
		
	}
}
