package parcial.practica;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class MathController {

	@GetMapping("/linearsearch")
	public String linearSearch(@RequestParam(value = "list") int[] list, @RequestParam(value = "value") int value ) {
		
		return ""+MathService.linearSearch(list, value);
	}
	@GetMapping("/binarysearch")
	public String binarySearch(@RequestParam(value = "list") int[] list, @RequestParam(value = "value") int value ) {
		
		return ""+MathService.binarySearch(list, value);
	}
}