
public class WolfPractice {
	public static void main(String[] args) {
		Wolf billy = new Wolf(17, "billy");
		System.out.println(billy.getNumTeeth());
		billy.setNumTeeth(3);
		System.out.println(billy);
		Wolf.setPackLeader(billy);
		Wolf suzy = new Wolf(18, "sally");
		System.out.println(suzy);
	}
}
