package inheritance;
	
	abstract class Shape{
		int base;
		int height;
		int side;
		
		public Shape(int base,int height) {
			this.base = base;
			this.height = height;
		}
		public Shape(int side) {
			this.side=side;
		}
		
		abstract double area();
		abstract double perimeter();	
		abstract void name();
		
		public void display(){
			System.out.print("Shape: ");
			name();
			System.out.printf("Area: %.2f%n", area());
			System.out.printf("Perimeter: %.2f%n", perimeter());
			System.out.println("_____________________________________");
		}
	}
	
	class Circle extends Shape{
		
		public Circle(int r) {
			super(r);
		}
		@Override
		public void name() {
			System.out.println("Circle");
		}
		
		@Override
		public double area() {
			return 3.14*side*side;
		}
		@Override
		public double perimeter() {
			return 2*3.14*side;
		}
	}
	
	class Rectangle extends Shape{
		
		public Rectangle(int l, int w) {
			super(l,w);
		}
		
		@Override
		public void name() {
			System.out.println();;
		}
		@Override
		public double area() {
			return base*height;
		}
		
		@Override
		public double perimeter() {
			return 2*base + 2*height;
		}
	}
	
	class Triangle extends Shape{
		
		
		public Triangle(int b,int h) {
			super(b,h);
		}
		public void name(){
			System.out.println("Triangle");
		}
		
		public double area() {
	        return 0.5*base*height;
		}
		
		public double perimeter() {
			double hypo = Math.sqrt(base*base+height*height);
			return base+height+hypo;
		}
	}
	
	class Square extends Shape{
		
		public Square(int s) {
			super(s);
		}
		@Override
		public void name() {
			System.out.println("Square");
		}
		
		@Override
		public double area() {
			return side*side;
		}
		
		@Override
		public double perimeter() {
			return 4*side;
		}
	}
public class GeometricShape {	
	
	public static void main(String[] args) {
		Shape s = new Circle(5);//poly-morphic equation(upcasting)
		s.display();
		s = new Rectangle(4, 6);
		s.display();
        s = new Triangle(3, 4);
        s.display();
        s = new Square(5);
        s.display();
	}

}
