/**
 * 
 */

/**
 * @author developer
 *
 */
public class BoxDriver {
	private double leight;
	private double height;
	private double weigth;

	/**
	 * 
	 */
	public BoxDriver(double leight, double height, double weigth) {
		this.leight=leight;
		this.height=height;
		this.weigth=weigth;
	}

	public double getLeight() {
		return leight;
	}

	public void setLeight(double leight) {
		this.leight = leight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BoxDriver box1;
		box1= new  BoxDriver(5.0,6.0,7.0);
		System.out.println("Box 1 length is "+box1.getLeight());
		System.out.println("Box 1 weigth is "+box1.getWeigth());
		System.out.println("Box 1 Height is "+box1.getHeight());

		BoxDriver box2;
		box2=new  BoxDriver(10.0,10.0,10.0);
		System.out.println("Box 1 length is"+box2.getLeight());
		System.out.println("Box 1 weigth is"+box2.getWeigth());
		System.out.println("Box 1 Height is"+box2.getHeight());
	}

}
