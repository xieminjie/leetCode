package leetCode;
/*The string "PAYPALISHIRING" is written in a 
 * zigzag pattern on a given number of rows 
 * like this: (you may want to display this 
 * pattern in a fixed font for better legibility)*/
public class ZigZagConversion {
	public String convert(String s, int numRows) {
		StringBuilder sb = new StringBuilder();
		char[] charArray = s.toCharArray();
		int count = 2*numRows-2;
		int number = 0;
		if(s.length()%count!=0){
			number = (s.length()/count)+1;
		}else{
			number = s.length()/count;
		}
		for(int i=0;i<numRows;i++){
			int pointer = 0;
			for(int j=0;j<number;j++){
				if(i==0){
					sb.append(charArray[pointer]);
				}else if(i==numRows-1){
					if(pointer+numRows-1<s.length()){
						sb.append(charArray[pointer+numRows-1]);
					}else{
						j++;
					}
				}else{
					if(pointer+i<s.length()){
						sb.append(charArray[pointer+i]);
					}else{
						j++;
					}
					if(pointer+2*numRows-1-i<s.length()){
						sb.append(sb.append(charArray[pointer+2*numRows-1-i]));
					}else{
						j++;
					}
				}
				if(pointer+count<s.length()){
					pointer+=count;
				}
			}
		}
		String str = sb.toString();
		return str;
	}
}
