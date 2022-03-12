package software.daveturner.ocj11;

public class Hello {
	public static void main(String... args) {
		String result = (args == null || args.length ==0) ? "Hello name no provided " : "Hello  " + args[0];
		System.out.println(result);
	}	
}
