import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/", (req, res) -> "<h1> Page Principale </h1>");
		get("/hello", (req, res) -> "Hello World");
		get("/test", (req, res) -> "Test Test!");
	}
}
