package udemy.university.section3;

public class MainSection3 {

    public MainSection3() {
        variables();
        bookDetails();
        personDetails();
        dataType();
        challengerProductDetail();
        varVariable();
        stringConcatenation();
        constants();
        challengerHotelReservation();
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

    public void bookDetails() {
        System.out.println("***************************** Book Detail ******************************");
        BookDetails bookDetails = new BookDetails();
        System.out.print("""
                name: %s
                year: %d
                price: %f
                is available: %b""".formatted(bookDetails.getName(), bookDetails.getYear(), bookDetails.getPrice(), bookDetails.getIsAvailableSale()));
    }

    public void personDetails() {
        System.out.println("***************************** Book Detail ******************************");
        PersonDetails personDetails = new PersonDetails();

        System.out.println("""
                name: %s
                age: %d
                height: %f
                Country: %S
                is Married: %c
                """.formatted(personDetails.getName(), personDetails.getAge(), personDetails.getHeight(), personDetails.getCountry(), personDetails.getIsMarried()));
    }

    public void dataType() {
        System.out.println("***************************** Data Type **************************");
        System.out.println(DataTypes.dataTypes());
    }
    public void challengerProductDetail() {
        System.out.println("***************************** Challenger Product Detail **************************");

        ChallengerProductDetail challengerProductDetail = new ChallengerProductDetail();
        System.out.println(challengerProductDetail.toString());
    }
    public void varVariable() {
        System.out.println("***************************** Var Variable ***************************");
        VarVariable varVariable = new VarVariable();
        System.out.println(varVariable.toString());

    }
    public void stringConcatenation() {
        System.out.println("**************************** String Concatenation ************************");
        StringConcatenation stringConcatenation = new StringConcatenation();
        System.out.println(stringConcatenation.toString());
    }
    public void constants() {
        System.out.println("**************************** Constants *************************");
        Constants constants = new Constants();
        System.out.println(constants.toString());
    }
    public void challengerHotelReservation() {
        System.out.println("*************************** Reservation Hotel ************************");
        ChallengerHotelReservation challengerHotelReservation = new ChallengerHotelReservation();
        System.out.println(challengerHotelReservation.toString());

    }
}
