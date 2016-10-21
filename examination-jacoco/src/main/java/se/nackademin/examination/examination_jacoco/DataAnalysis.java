package se.nackademin.examination.examination_jacoco;

import java.util.ArrayList;

public class DataAnalysis {
	
	
	public String buildFinalString(ArrayList<String> values){
		String	resultString = "#####################-- ANALYSIS OF THE INPUT DATA --#####################\n";	
		resultString += getResultStringNamesAndAge(values);
		resultString+="\n";
		resultString += getResulStringHomecityAndAge(values);
		
		return resultString;
	}	
	
	
	public String getResultStringNamesAndAge(ArrayList<String> values){
		Game game = new Game();
		System.out.println("values.get(1).length nnn"+values.get(1).length());
		System.out.println("values.get(2).length nnn"+values.get(2).length());
		System.out.println("game.getAgeFromInputValues(values)"+game.getAgeFromInputValues(values));
		if (values.get(1).length()<=values.get(2).length() && game.getAgeFromInputValues(values)<=30){
			return "The first name is smaller or equals in size to the last name and the participant is 30 or younger";
		} if (values.get(1).length()>values.get(2).length() && game.getAgeFromInputValues(values)>30){
			return "The first name is greater or equals in size to the last name and the participant older than 30";
		}
		
		return "No analysis was performed";
	}
	
	public String getResulStringHomecityAndAge(ArrayList<String> values){
		Game game = new Game();
		System.out.println("4game.getAgeFromInputValues(values) "+game.getAgeFromInputValues(values));
		System.out.println("4values.get(5) "+values.get(5));
		
		if (values.get(5).length()<5){
			
			if (game.getAgeFromInputValues(values)>=30){
				return "The name of the homecity is small and the participant is 30 or older";
			}else{
				return "The name of the homecity is small and the participant is younger than 30";
			}
		}else{
			
			if (game.getAgeFromInputValues(values)>=30){
				return "The name of the homecity is big and the participant is 30 or older";
			}else{
				return "The name of the homecity is big and the participant is younger than 30";
			}
			
		}
		
		
	}
	

}
