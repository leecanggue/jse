package cmm04.array;

public class No02_StringArrayDemoVO {
	
	void StringArray(){
		String[] juso = new String[3];
		juso[0] = "서울";
		juso[1] = "종로";
		juso[2] = "광화문";

		/*출력하세요*/
		for(String string : juso){
		System.out.println(string);
		}
	}
}
