package com.mustafa.july18.comparable.comparetor;

import java.util.Comparator;

public record Trainer(Integer id,String name,Double salary,Integer Experience) 
implements Comparable<Trainer>{

	@Override
	public int compareTo(Trainer o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.Experience(),o.Experience());
	}

	/*
	 * @Override public int compareTo(Trainer o) {
	 * 
	 * return 0; }
	 */
	
	/*
	 * @Override public int compareTo(Trainer t2) {
	 * 
	 * return Integer.compare(this.id(),t2.id());
	 * 
	 * 
	 * //return String.compare(this.name(),t2.name()) ;
	 * 
	 * }
	 */

	
	

}
