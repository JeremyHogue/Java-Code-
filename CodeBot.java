import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeBot {
private String className, code;

public CodeBot(){
className = "Hello";
code = "public class Hello { public static void main(String[] args) { System.out.println(\"hello, world\");}}";
saveCode();
}

public CodeBot(String className, String code){
this.className = className;
this.code =code;
saveCode();
}

private void saveCode(){
try {

File f = new File(className + ".java");

if(f.exists())

{

System.out.println("File " + f.getName() + " already exists");

System.exit(0);

}

PrintWriter pw = new PrintWriter(f);

pw.println(code);
pw.close();
} catch (FileNotFoundException e) {
System.out.println(e.getMessage());
}
}

public void compile() throws CompilationException{
if(code.indexOf(className) == -1)
throw new CompilationException("Class name must be found in code.");

System.out.println("The program " + className + ".java has compiled successfully");
}


}