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
}
