
public class sort{

	public static void main(String[] args) {

		//��argsת��Ϊint����
		int[] arr = new int[args.length];
		for(int i=0; i<args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		
		//��int���������������
		int tmp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.println(arr[i]);
		}
	}

}
