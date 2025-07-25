package udemy.university.section4;

public class MainSection4 {
    public MainSection4() {
        classString();
        indicesString();
        immutabilityString();
        comparisonString();
        stringMethods();
        subString();
        searchSubString();
        replaceSubString();
        concatenationString();
        specialCharacterString();
        challengerEmail();
    }

    public void classString() {
        System.out.println("************************** Class String *****************************");
        ClassString classString = new ClassString();
        System.out.println(classString.toString());
    }
    public void indicesString() {
        System.out.println("************************* Indices String *************************");
        IndicesString indicesString = new IndicesString();
        System.out.println(indicesString.indicesString());

    }
    public void immutabilityString() {
        System.out.println("*********************** Immutability String ***************************");
        ImmutabilityString immutabilityString = new ImmutabilityString();
        System.out.println(immutabilityString.toString());
    }
    public void comparisonString() {
        System.out.println("*********************** Comparison String ***********************");
        ComparisonString comparisonString = new ComparisonString();
        System.out.println(comparisonString.toString());
    }
    public void stringMethods() {
        System.out.println("*********************** String Method ************************");
        StringMethods stringMethods = new StringMethods();
        System.out.println(stringMethods.toString());
    }
    public void subString() {
        System.out.println("************************ Sub String *******************************");
        SubString subString = new SubString();
        System.out.println(subString.generateSubStrings());
    }
    public void searchSubString() {
        System.out.println("************************* Search SusString ******************************");
        SearchSubString searchSubString = new SearchSubString();
        System.out.println(searchSubString.findSubString());
    }
    public void replaceSubString() {
        System.out.println("**************************Replace Sub String ******************************");
        ReplaceSubString replaceSubString = new ReplaceSubString();
        System.out.println(replaceSubString.replaceSubString());
    }
    public void concatenationString() {
        System.out.println("***************************** Concatenation String *********************************");
        ConcatenationString concatenationString = new ConcatenationString();
        System.out.println(concatenationString.toString());
    }
    public void specialCharacterString() {
        System.out.println("***************************** Special Character String ****************************");
        SpecialCharacterString specialCharacterString = new SpecialCharacterString();
        System.out.println(specialCharacterString.toString());
    }
    public void challengerEmail() {
        System.out.println("**************************** Challenger Email **************************");
        ChallengerGeneratorEmail challengerGeneratorEmail = new ChallengerGeneratorEmail();
        System.out.println(challengerGeneratorEmail.generateEmail());
    }
}
