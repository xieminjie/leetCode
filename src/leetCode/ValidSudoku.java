package leetCode;

import java.util.Hashtable;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		Hashtable<Character, Integer> hashtable = new Hashtable();
		for(int i=0;i<9;i++){
			hashtable.clear();
			for(int j=0;j<9;j++){
				if(board[i][j]!='.'){
					if(hashtable.containsKey(board[i][j])){
						return false;
					}
					hashtable.put(board[i][j],j);
				}
			}
		}
		for(int i=0;i<9;i++){
			hashtable.clear();
			for(int j=0;j<9;j++){
				if(board[j][i]!='.'){
					if(hashtable.containsKey(board[j][i])){
						return false;
					}
					hashtable.put(board[j][i],i);
				}
			}
		}
		for(int m=0;m<=6;m+=3){
			for(int n=0;n<=6;n+=3){
				hashtable.clear();
				for(int i=m;i<m+3;i++)
					for(int j=n;j<n+3;j++){
						if(board[i][j]!='.'){
							if(hashtable.containsKey(board[i][j])){
								return false;
							}
							hashtable.put(board[i][j],j);
						}
					}
			}
		}
		return true;  
    }
}
