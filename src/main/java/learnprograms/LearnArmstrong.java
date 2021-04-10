package learnprograms;

public class LearnArmstrong {

	public static void main(String[] args) {
		int a=370, sum=0, s, tmp=a;
		while(a>0){
			s=a%10;
			sum=sum+(s*s*s);
			a=a/10;
			}
			if(tmp==sum){
			System.out.println("Armstrong");
			}else{
			System.out.println("Not Armstrong");
			}

	}

}
