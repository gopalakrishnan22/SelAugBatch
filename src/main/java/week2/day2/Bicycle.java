package week2.day2;

public class Bicycle {

	//Method Signature

	//accessModifier return_type methodName(arg)
	public void applyBrake(){

	}

	public void changeGear(int gear){

	}
//Method OverLoading
	public String getColor(){
		return "Red";
	}
		
	public String getColor(String brand){
		if(brand.equals("BSA")){
			return "black";
		}else{
			return "Red";
		}
	}
	
	public String getColor(int type){		
			return "Red";	
	}
	
	public String getColor(String brand, int type){
		if(brand.equals("BSA")){
			return "black";
		}else{
			return "Red";
		}
	}

}










