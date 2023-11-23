public class RoundAndRound {
	 public static void main(String[] args) {
	        Circle circle1 = new Circle();
	        circle1.radius = 5.1;
	        circle1.diameter = circle1.radius*2;
			circle1.circumference = Math.PI*circle1.diameter;
			circle1.area = Math.PI*Math.pow(circle1.radius,2);
	        // calculate the remaining attributes for circle1 here

	        Circle circle2 = new Circle();
	        circle2.radius = 17.5;
	        circle2.diameter = circle2.radius*2;
			circle2.circumference = Math.PI*circle2.diameter;
			circle2.area = Math.PI*Math.pow(circle2.radius,2);
	        // calculate the remaining attributes for circle2 here
	        double a = 1000.0;
	        System.out.println("circle1.radius = " + circle1.radius);
	        System.out.println("circle1.diameter = " + Math.round(circle1.diameter *1000)/a);
			System.out.println("circle1.circumference = " + Math.round(circle1.circumference *1000)/a);
			System.out.println("circle1.area = " + Math.round(circle1.area *1000)/a);
			System.out.println("circle2.radius = " + circle2.radius);
	        System.out.println("circle2.diameter = " + Math.round(circle2.diameter*1000)/a);
			System.out.println("circle2.circumference = " + Math.round(circle2.circumference*1000)/a);
			System.out.println("circle2.area = " + Math.round(circle2.area*1000)/a);
	        // add more output-commands here
			Cone cone1 = new Cone();
			Cone cone2 = new Cone();
			cone1.base = circle1;
			cone1.height = 10.3;
			cone1.volume = (Math.PI*Math.pow(circle1.radius,2)*cone1.height)/3;
			cone1.surfaceArea = Math.PI*Math.pow(circle1.radius,2) + Math.PI*circle1.radius*cone1.height;
			cone2.base = circle2;
			cone2.height = 10.3;
			cone2.volume = (Math.PI*Math.pow(circle2.radius,2)*cone2.height)/3;
			cone2.surfaceArea = Math.PI*Math.pow(circle2.radius,2) + Math.PI*circle2.radius*cone2.height;
			System.out.println("cone1.volume = " + Math.round(cone1.volume*1000)/a);
			System.out.println("cone1.surfaceArea = " + Math.round(cone1.surfaceArea*1000)/a);
			System.out.println("cone2.volume = " + Math.round(cone2.volume*1000)/a);
			System.out.println("cone2.surfaceArea = " + Math.round(cone2.surfaceArea*1000)/a);
	 }
}
