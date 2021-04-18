package net.codejava.ws;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
		
	@RequestMapping("/hello")
	public String hello(@RequestParam(name = "name", defaultValue = "") String name) {
	
	 
	char[] charArray = name.toCharArray();
	String result = "";
	
	for (int i = 0; i < charArray.length; i++) {
		if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u') {
			charArray[i] = Character.toUpperCase(charArray[i]);
	}
	}
	for (int k = charArray.length - 1; k >= 0; k--) {
		result+=charArray[k];
	}
	
	result = result.replaceAll("\\s+", " ");
		
	return result;
	}
}
	

/*int[] numArray = new int[name.length()];

for (int i = 0; i <= name.length(); i++) {
	numArray[i] = Integer.parseInt(String.valueOf(name.charAt(i)));
}

int pom = numArray[numArray.length - 1];

for (int i = numArray.length - 1; i > 0; i--) {
	if (numArray[i] < 3) {
		numArray[i] = numArray[i-1];
	}
	numArray[0] = pom;
}
StringBuilder builder = new StringBuilder();
for (int i: numArray) {
	builder.append(i);
}
String text = builder.toString();*/

    
	


	
