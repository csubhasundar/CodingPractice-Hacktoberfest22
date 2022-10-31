public class Strings {

    public static void main(String[] args) {

	    // Creating String using String literal

        String str1 = "Ashu";
        String str2 = "Ashu";
        System.out.println(str1 == str2);
        //Creating String using new

        String st1 = new String("hey! ashu");
        String st2 = new String("hey! ashu");
                System.out.println(st1 == st2);

   String name = "Ashutosh";

   //Printing the String
        System.out.println(name);

    //Length of the String(length())
        int value = name.length();
        System.out.println(value);

     //Printing in Lower Case(toLowercase)

        String lstring = name.toLowerCase();
        System.out.println(lstring);

     //printing in Upper Case(toUpperCase)

        String ustring = name.toUpperCase();
        System.out.println(ustring);

    //Trimming the String(trim())

        String nonTrimmedString = "    Ashutosh Rath    ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

     // Substring
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

     //Replace
        System.out.println(name.replace('h', 's'));
        System.out.println(name.replace("a", "Tas"));

      //StartsWith
        System.out.println(name.startsWith("Har"));

      //endsWith
        System.out.println(name.endsWith("dd"));

      //Character At(CharAt)
        System.out.println(name.charAt(4));

     //indexOf
        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry", 4));
        System.out.println(modifiedName.lastIndexOf("rry", 7));

      //equals
        System.out.println(name.equals("Harry"));

      //equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("HarRY"));


    }
}
