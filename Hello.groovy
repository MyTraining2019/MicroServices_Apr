@RestController
public class Hello{
	@RequestMapping("/")
	public String sayHello(){
	 return "Hello World!";
	}


}