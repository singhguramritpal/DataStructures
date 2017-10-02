package practice.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MinimumEditDistance {
	
	public int minimumEditDitanceDP(String s1, String s2){
		int n = s1.length();
		int m = s2.length();
		int arr[][] = new int[n+1][m+1];
		for(int i=0;i<n+1; i++){
			arr[i][0]=i;
		}
		for(int i=0;i<m+1; i++){
			arr[0][i]=i;
		}
		for(int i=1; i<=n; i++){
			for(int j=1; j<=m; j++){
				int score = 0;
				if(s1.charAt(i-1) != s2.charAt(j-1)){
					score=2;
				}
				int score1 = arr[i-1][j]+1;
				int score2 = arr[i][j-1]+1;
				int score3 = arr[i-1][j-1]+score;
				int temp = Math.min(score1, score2);
				arr[i][j] = Math.min(score3,temp);
			}
		}
		String word = "";
		List<String> list = new ArrayList<String>();
		int i=n;
		int j =m;
		for(j=m; j>0&&i>0;){
			System.out.println(s1.charAt(i-1));
			System.out.println(s2.charAt(j-1));
			System.out.println();
			System.out.println();
			if(s2.charAt(j-1) == s1.charAt(i-1)){
				word+=s2.charAt(j-1);
				i--;
				j--;
				list.add("Similar: "+ s2.charAt(j));
			} else {
				word+=s2.charAt(j-1);
				//word+="|"+s1.charAt(i-1);
				int score1 = arr[i][j];
				int score2 = arr[i-1][j-1];
				int score3 = arr[i-1][j];
				int score4 = arr[i][j-1];
				if(score1-score2 == 2){
					i--;
					j--;
					list.add("Substituting: "+ s1.charAt(i)+" with: "+s2.charAt(j));
				} else if(Math.abs(score1-score3)<Math.abs(score1-score4)){
					i--;
					list.add("delting: "+s1.charAt(i));
				} else if(Math.abs(score1-score3)>=Math.abs(score1-score4)){
					j--;
					list.add("inserting: "+s2.charAt(j));
				}
			}
			word+=" ";
		}
		if(i>0){
			word+=s1.substring(0,i);
		} else if(j>0){
			word+=s2.substring(0,j);
		}
		for(String str:list){
			System.out.println(str);
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(word);
		return arr[n][m];
	}
}
