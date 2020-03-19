package prob2;

import java.util.*;

public class MilesCounter {
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		
		for(Object o: vehicleArray) {
			if(o instanceof Vehicle) {
				Vehicle vehicle = (Vehicle) o;
				vehicleList.add(vehicle);
			}
		}
		return vehicleList;
	}
	
	
	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		int totalMiles = 0;
		
		for(Vehicle v: vehicleList) {
			totalMiles += v.getMilesUsedToday();
		}
		return totalMiles;
	}
}