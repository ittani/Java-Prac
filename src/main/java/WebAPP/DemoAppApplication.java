package WebAPP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class DemoAppApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(BeanClass.class);
		System.out.println(context.getBean("name"));
		//System.out.println(context.getBean("age"));
		//System.out.println(context.getBean("salary"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("occupation"));
		System.out.println(context.getBean("vacation"));
	}

}
