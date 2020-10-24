package com.capgemini.cabinvoicegenerator;
import java.util.*;

public class RideRepository {
	Map<String, ArrayList<Ride>> userRides = null;

	public RideRepository() {
		userRides = new HashMap<>();
	}

	public void addRides(String userId, Ride[] rides) {
		ArrayList<Ride> rideList = this.userRides.get(userId);
		if (rideList == null) {
			rideList = new ArrayList<>(Arrays.asList(rides));
			this.userRides.put(userId, rideList);
		}
	}

	public Ride[] getRides(String userId) {
		return this.userRides.get(userId).toArray(new Ride[0]);
	}
}
