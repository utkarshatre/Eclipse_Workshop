package JavaBeanClass;

public class Solution {
private int ab=0;
private int bc;


public int getAb() {
	return ab;
}


public void setAb(int ab) {
	this.ab = ab;
}


public int getBc() {
	return bc;
}


public void setBc(int bc) {
	this.bc = bc;
}


public static void main(String[] args) {
	Solution s = new Solution();
	s.setAb(10);
	System.out.println(s.getAb());
}
}
