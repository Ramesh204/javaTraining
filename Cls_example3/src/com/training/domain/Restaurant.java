package com.training.domain;

public class Restaurant  implements Comparable<Restaurant>{

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return restaurantName + "," + Location + "," + phoneNumber + "," + rating;
	}
	private String restaurantName;
	private String Location;
	private long phoneNumber;
	private int rating;
	/**
	 * @return the restaurantName
	 */
	public String getRestaurantName() {
		return restaurantName;
	}
	/**
	 * @param restaurantName the restaurantName to set
	 */
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return Location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		Location = location;
	}
	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Restaurant(String restaurantName, String location, long phoneNumber, int rating) {
		super();
		this.restaurantName = restaurantName;
		Location = location;
		this.phoneNumber = phoneNumber;
		this.rating = rating;
	}
	@Override
	public int compareTo(Restaurant o) {
		// TODO Auto-generated method stub
	if(this.getRating()>o.getRating()) return -1;
	if(this.getRating()<o.getRating()) return 1;
		return 0;
	}
	
}
