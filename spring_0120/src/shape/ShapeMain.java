package shape;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocatioin = "classpath:ctx.xml";

		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocatioin);
		
		IShape shape1 = ctx.getBean("shape1", IShape.class);
		System.out.println("삼각형의 넓이는 : " + shape1.getArea());
		IShape shape2 = ctx.getBean("shape2", IShape.class);
		System.out.println("사각형의 넓이는 : " + shape2.getArea());
		IShape shape3 = ctx.getBean("shape3", IShape.class);
		System.out.println("원의 넓이는 : " + shape3.getArea());
		ctx.close();
	}

}
