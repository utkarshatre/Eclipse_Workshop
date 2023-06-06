package com;

public class Hotel implements Comparable<Hotel>{
	String name;
	Double ratings;   //Wrapper class Declaration
	public Hotel(String name,Double ratings ) {
		this.name=name;
		this.ratings=ratings;
	}
	@Override
	public String toString() {
		return "name :"+ name+ " "+ratings;
	}
	@Override
	public int compareTo(Hotel h) {
		return this.name.compareTo(h.name);
	}
}
/*this object is inserted , h is already existing object
 * to compare string objvct &doble object we r taking the help
 * compraeTo() of String clas and double class
 * 1) String Comparison name
 *     Assending order 
 *        return this.name.compareTo(h.name)
 *     Dessending order
 *        return h.name.compareTo(this.name);
 * 2) Double Comparison rating
 *       Assending order 
 *        return this.rating.compareTo(h.rating)
 *     Dessending order
 *        return h.rating.compareTo(this.rating);
 */
