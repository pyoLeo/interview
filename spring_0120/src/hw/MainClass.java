package hw;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javalec.ApplicationConfig;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AConfig.class);
		
		Tri shape1 = ctx.getBean("shape1", Tri.class);
		System.out.println("가로 : " + shape1.getWidth());
		System.out.println("세로 : " + shape1.getHeight());
		System.out.println("넓이 : " + shape1.getArea());
	
		Rec shape2 = ctx.getBean("shape2", Rec.class);
		System.out.println("가로 : " + shape2.getWidth());
		System.out.println("세로 : " + shape2.getHeight());
		System.out.println("넓이 : " + shape2.getArea());
	
		ctx.close();
	}
}
