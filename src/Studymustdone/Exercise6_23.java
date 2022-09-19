package Studymustdone;

public class Exercise6_23 {
	
	static int[] max(int[] data) {
		int max=data[0];
				
		for(int i =1; i<data.length; i++) {
			
			if(data[i]>max) {
				max=data[0];
			}else  {
				System.out.println(-999999);
			}
			
		}
		
		return data;
	}

	public static void main(String[] args) {
		
		
		int[] data = {3,2,9,4,7};
		
		System.out.println();
		System.out.println("최대값:"+max(data));
//		System.out.println("최대값:"+max(null));
//		System.out.println("최대값:"+max(new int[] {}));//크기가 0인 배열
		}
	}

