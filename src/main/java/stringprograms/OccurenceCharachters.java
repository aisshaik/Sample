package stringprograms;

public class OccurenceCharachters {

	public static void main(String[] args){
		String s="aisha";
		int count=0;
		for(int i=0;i<s.length();i++){
		for(int j=i+1;j<s.length();j++){
		if(s.charAt(i)==s.charAt(j))
		count++;
		}
		if(count>1){
		System.out.println(s.charAt(i)+" is repeated for: "+ count);
		}else{
		System.out.println(s.charAt(i)+" is repeated for: "+ count);
		}
		}
		}

}
