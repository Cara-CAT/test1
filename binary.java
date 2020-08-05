/*import java.util.*;
public class binary {
	public static void main(String args[]){
		
		byte[] randomBytes=new byte[32];
		Random rand=new Random();
		for(int i=0;i<32;i++){
			rand.nextBytes(randomBytes[i]);
			System.out.print(randomBytes[i]);
			for(int m=0;m<i;m++){
				if(randomBytes[i]==randomBytes[m]){
					i--;
					break;
				}
				System.out.println(randomBytes[m]);
		}
			ArrayList<Byte> b=new ArrayList<Byte>();
			Iterator e=b.iterator();
			while(e.hasNext())
				System.out.println(e.next());
		
		}
	}
}*/
public class binary {
	public static void main(String[] args){
		for(int i = 0; i <32; i++){			
			int copy = i , n = 0 , c;
			int[] stack = new int[5];
			while((c = copy%2)!=0||copy/2!=0){
				stack[n++] = c;
				copy = (int)(copy/2);
			}
				for(n=4;n>=0;n--)	
					System.out.print(stack[n]);
			System.out.print('\n');
		}
	}
}
