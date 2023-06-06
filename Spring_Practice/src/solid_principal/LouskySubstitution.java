package solid_principal;
interface TwoWheeler{
	void tyre();
}
interface Gear extends TwoWheeler{
	@Override
	public default void tyre() {
		System.out.println("2 tyre vehicle with large dia");
	}
	public void gears();
}
class Sport_Type_Bike implements Gear{
	@Override
	public void gears() {
		System.out.println(" 4 stroke gear with one side");
	}
}
class Scooty implements TwoWheeler{
	@Override
	public void tyre() {
		System.out.println("2 tyre vehicle with small dia");
	}
}
public class LouskySubstitution {
	public static void main(String[] args) {
	TwoWheeler t1 = new Scooty();
	t1.tyre();
	TwoWheeler t2 = new Sport_Type_Bike();
	t2.tyre();
	}
}
