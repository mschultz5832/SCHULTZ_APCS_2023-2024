public class RefactorATableOfVariables {

    public static void main(String [] args)
    {
    
        int rowOneColumnOne = 1;
        int rowOneColumnTwo = rowOneColumnOne * rowOneColumnOne;
        int rowOneColumnThree = rowOneColumnOne * rowOneColumnOne * rowOneColumnOne ; 
        int rowTwoColumnOne = 2;
        int rowTwoColumTwo = rowTwoColumnOne * rowTwoColumnOne ;    
        int rowTwoColumnThree = rowTwoColumnOne * rowTwoColumnOne * rowTwoColumTwo ;
        int rowThreeColumnOne = 3;
        int rowThreeColumnTwo = rowThreeColumnOne * rowThreeColumnOne ;
        int rowThreeColumnThree = rowThreeColumnOne * rowThreeColumnOne * rowThreeColumnOne ;
        int rowFourColumnOne = 4;
        int rowFourColumnTwo = rowFourColumnOne * rowFourColumnOne;
        int rowFourColumnThree  = rowFourColumnOne * rowFourColumnOne * rowFourColumnOne ;
    
    
    
    System.out.println(   "a"  +  " " +  "a^2" + " "  +  "a^3" );
    System.out.println(  rowOneColumnOne + " "  +    rowOneColumnTwo    +  " "   + rowOneColumnThree );
    System.out.println(  rowTwoColumnOne  + " "  + rowTwoColumTwo   +  " "  +   rowTwoColumnThree ); 
    System.out.println(  rowThreeColumnOne  + " " + rowThreeColumnTwo  + " " + rowThreeColumnThree  );
    System.out.println(  rowFourColumnOne  +  " "  +  rowFourColumnTwo  + " "  + rowFourColumnThree  ); 

    }

}