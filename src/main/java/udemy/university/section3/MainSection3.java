package udemy.university.section3;

public class MainSection3 {

    public MainSection3() {
        variables();

    }

    public void variables() {
        System.out.println("****************** Variables ********************");

        Variables variables = new Variables();

        System.out.println("""
                byte: %d
                short: %d
                int: %d
                float: %f
                double: %f
                char: %c
                boolean: %b
                """.formatted(variables.getVarByte(), variables.getVarShort(), variables.getVarInt(), variables.getVarFloat(), variables.getVarDouble(), variables.getVarChar(), variables.getVarBoolean()));
    }
}
