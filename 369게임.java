public class kjhkjh {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int 박수=0;
		int 언제까지 = sc.nextInt();
        for(int i=1; i<=언제까지; i++) {
        	
        	num = i;
        	
        	while(true) {
        		System.out.println(num);
        		if(num%10==3 || num%10==6 || num%10==9) {
        			System.out.println(num+": 짝");
        			박수++;
        		}
        		num = num / 10;
        		if(num==0) {
        			break;
        		}
        	}
        }
        System.out.printf("1~%d까지의 총 박수: %d ",언제까지, 박수);
	}
}
