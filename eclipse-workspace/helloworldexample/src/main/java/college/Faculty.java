package college;

import org.springframework.stereotype.Component;

@Component
public class Faculty implements college {
	public void study() {
		System.out.println("i am a faculty member of cse department");
	}
}
