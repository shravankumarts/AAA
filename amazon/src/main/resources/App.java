import org.openqa.selenium.WebDriver;

public class App {
	@Test
	public void m1(){
		WebDriver driver =new Firesfoxdriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	Thread.sleep(5000);
	
	}

}
