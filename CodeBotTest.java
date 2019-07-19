public class CodeBotTest {
public static void main(String[] args) throws CompilationException {
CodeBot b1 = new CodeBot();
b1.compile();

CodeBot b2 = new CodeBot("Hello2", "public class { public static void main(String[] args) {System.out.println(\"hello, world\");}}");
b2.compile();
}
}