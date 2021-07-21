package DurgaSoft;

@FunctionalInterface
public interface Vehicle {
	
	double getSpeed();
	
    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
        
    default void getSpeedInKMH(double speed) {
        System.out.println("Speed in KMH");      
     }
}
