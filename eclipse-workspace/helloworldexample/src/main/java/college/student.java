package college;

import org.springframework.stereotype.Component;

@Component
public class student implements college{
	public void study() {
		System.out.println("i am a student");
	}

}
