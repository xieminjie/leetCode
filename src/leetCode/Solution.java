package leetCode;

import java.util.Hashtable;


public class Solution { 
	 public int romanToInt(String s) {
		 int number = 0;
		 char[] charArray = s.toCharArray();
		 for(int i=0;i<s.length();i++){
			 if(charArray[i]=='I'){
				 if(++i<s.length()){
					 if(charArray[i]=='V'){
						 number = number+4;
					 }else if(charArray[i]=='X'){
						 number = number+9;
					 }else{
						 number = number+1;
						 --i;
					 }
				 }else{
					 number = number+1;
					 --i;
				 }
			 }else if(charArray[i]=='V'){
				 number = number+5;
			 }else if(charArray[i]=='X'){
				 if(++i<s.length()){
					 if(charArray[i]=='L'){
						 number = number+40;
					 }else if(charArray[i]=='C'){
						 number = number+90;
					 }else{
						 number = number+10;
						 --i;
					 }
				 }else{
					 number = number+10;
					 --i;
				 }
			 }else if(charArray[i]=='L'){
				 number = number +50;
			 }else if(charArray[i]=='C'){
				 if(++i<s.length()){
					 if(charArray[i]=='D'){
						 number = number+400;
					 }else if(charArray[i]=='M'){
						 number = number+900;
					 }else{
						 number = number+100;
						 --i;
					 }
				 }else{
					 number = number+100;
					 --i;
				 }

			 }else if (charArray[i]=='D'){
				 number = number +500;
			 }else{
				 number = number +1000;
			 }
		 }
		 return number;
	 }
}
