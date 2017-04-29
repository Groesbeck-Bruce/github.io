/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author bruce
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
{
<!DOCTYPE HTML>
<html lang="en-us">
<head>
<meta charset="utf-8">
<title>5 Times Table</title>
<script type="text/javascript">

 /* Program to print the five times table from 1 to 12 in this format:
         5 x 1 = 5
         5 x 2 = 10
         5 x ...
         Input: There will be no user input, program will use a loop to create the 5 times table.
         Process: Define all the 5 times table between 1 and 12.
         Output: The 5 times table will be displayed.
         */
        function fiveTimesTable() {
            var result = 0;
            for (i=1; i<=12; i++){
                 result = "5 * " + i + result + i*5 + "<br>";
            var display =result;
            }
            document.getElementById("outputDiv").innerHTML = display;
            }       
</script>
</head>
<body>
    <h1>Five Times Table From 1 - 12.</h1>
    <h2>Press the button to display the table.</h2>
    <button type="button" onclick="fiveTimesTable()">Times Table</button>
    <div id="outputDiv"></div>
</body>
</html>
}