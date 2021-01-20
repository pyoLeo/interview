package hw;

import org.springframework.context.annotation.Bean;

public class AConfig {
	@Bean
	public Tri shape1() {
		Tri tri = new Tri(3, 5);
		
		return tri;
	}
	
	@Bean
	public Rec shape2() {
		Rec rec = new Rec(3, 5);
		
		return rec;
	}
}
