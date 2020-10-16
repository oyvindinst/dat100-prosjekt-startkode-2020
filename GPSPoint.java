package no.hvl.dat100ptc.oppgave1;

import no.hvl.dat100ptc.TODO;

public class GPSPoint {

	// TODO - objektvariable
	private int time;
	private double latitude;
	private double longtitude;
	private double elevation;
	
	public GPSPoint(int time, double latitude, double longitude, double elevation) {

		// TODO - konstruktur
		this.time = time;
		this.latitude = latitude;
		this.longtitude = longitude;
		this.elevation = elevation;
	}

	// TODO - get/set metoder X
	public int getTime() {
		
		return time;
		
	}

	public void setTime(int time) {
				
		this.time = ((time >= 0)?time:0);

	}

	public double getLatitude() {
		
		return latitude;
		
	}

	public void setLatitude(double latitude) {
		
		this.latitude = ((latitude >= 0)?latitude:0);
		
	}

	public double getLongitude() {
		
		return longtitude;
		
	}

	public void setLongitude(double longtitude) {
		
		this.longtitude = ((longtitude >= 0)?longtitude:0);
		
	}

	public double getElevation() {
		
		return elevation;
		
	}

	public void setElevation(double elevation) {
		
		this.elevation = ((elevation >= 0)?elevation:0);
		
	}
	
	public String toString() {
		
		String str;
		
		// TODO - start

		throw new UnsupportedOperationException(TODO.method());

		// TODO - slutt
		
	}
}
