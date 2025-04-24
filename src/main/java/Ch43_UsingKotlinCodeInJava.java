
public class Ch43_UsingKotlinCodeInJava {

    public static void main(String[] args) {

        // If we remove @JvmStatic annotation from KotlinUtility.printMessage() function,
        // It will show error in Java compiler. Non-static method 'printMessage(java.lang.String)' cannot be referenced from a static context

        KotlinInJavaExample clas = new KotlinInJavaExample();
        clas.value = 5;

        KotlinUtility.printMessage("test");

    }

}


