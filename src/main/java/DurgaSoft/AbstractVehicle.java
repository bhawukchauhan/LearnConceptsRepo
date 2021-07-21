package DurgaSoft;

public abstract class AbstractVehicle {
	double speed = 0;
	
	AbstractVehicle(){
		this.speed = 100;
	}
	//double getSpeed();//throws compilation error
	abstract double getSpeed(); //need to explicitly write abstract
	
    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
        
    static void getSpeedInKMH(double speed) {
        System.out.println("Speed in KMH");      
     }
}
