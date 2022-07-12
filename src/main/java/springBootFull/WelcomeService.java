package springBootFull;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService{
	public String getWelcomeMessage() {
		return "Welcome service!!";
	}
}