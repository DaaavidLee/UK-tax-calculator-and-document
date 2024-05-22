# Acknowledgements #

- Name: Cheng-Yu Lee
- Student ID: s2608053
- Tutorial group: Tutorial 2: Group 2 - Intermediate (Thurs. @ 17:10-18:30)
- Tutor: Ishani Raj
- Date: 2024-03-12


| Line  |                       Code                        | Function                                                  |                                                                                               Citation                                                                                                |
|-------|:-------------------------------------------------:|-----------------------------------------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| 13    |                       `final` double ALLOWANCE = 12_570;                        | A keyword used to decalre constants.                      |                                                         w3schools [Java final Keyword](https://www.w3schools.com/java/ref_keyword_final.asp)                                                          |
| 13    |         final double `ALLOWANCE` = 12_570;          | Giving meaningful variable to avoid magic numbers.        |           Stack Overflow    [What are magic numbers and why do some consider them bad?](https://stackoverflow.com/questions/47882/what-are-magic-numbers-and-why-do-some-consider-them-bad)           |
| 13    |                       final double ALLOWANCE = `12_570`;                       | An identifier to increase the readibility for humans.     | Stack Overflow [How Numeric literal with underscore works in java ...](https://stackoverflow.com/questions/19806632/how-numeric-literal-with-underscore-works-in-java-and-why-it-was-added-as-part-o) |
| 22    |             Integer.parseInt(args[0])             | Read the first input on the terminal as integer.          |                                              geeksforgeeks [String to int in Java](https://www.geeksforgeeks.org/how-to-convert-string-to-int-in-java/)                                               |
| 25-26 | double variable1 = (variable2 <= 100_000) ? A : B | Ternary operator. Enhanced if statement to simplify code. |                                    Stack Overflow [Short form for Java if statement](https://stackoverflow.com/questions/8898590/short-form-for-java-if-statement)                                    |
| 33-44 |                  if-else if-else                  | Java if statement for multiple conditionals.                                          |                                                                                     w3schools [Java If...Else](https://www.w3schools.com/java/java_conditions.asp)                                                                                      |





<STYLE>
* { /* Don't leave any empty lines or IntelliJ might not render correctly */
  /* Text size */
  font-size:   1.1rem;
  /*font-size:   1.2rem;*/
  /* Zenburn dark theme */
  background-color: #2A252A;
  color:            #D5DAD5;
  /* One Dark theme */
  /*background-color: #282C34;
  color:            #ABB2BF;*/
  /* white-ish on dull blue-ish */
  /*background-color: DarkSlateGray;
    color:            AntiqueWhite;*/
  /* white on black */
  /*background-color: black;
  color: white;*/
  /* black on white */
  /*background-color: white;
  color: black;*/
  /* nearly black on bright yellow */
  /*background-color: #FFFFAA;
  color:            #080808;*/
  /* black on bright blue */  
  /*background-color: #99CCFF;
  color:            black;*/
}
body {
  /* width of the text column */
  width: 80%;
  /* line spacing */
  line-height: 180%;
  /*line-height: 200%;*/
  /* Font styles: */
  /* Default sans serif */
  /*font-family: sans-serif;*/
  /* Default serif */
  font-family: serif;
  /* Specific font with generic fall-back */
  /* font-family: "Calibri Light", sans-serif; */
  /*font-family: "OpenDyslexic", sans-serif;*/
}
pre,
code,
pre code {
  /* line spacing */
  line-height: 150%;
  /* Default monospace */
  font-family: monospace;
  /* Specific fixed-width font with generic fall-back */
  /*font-family: "Consolas", monospace;*/
  /*font-family: "OpenDyslexicMono", monospace;*/
}
ol,
ol ol,
ol ol ol { /* Nested lists all use decimal numbering */
  list-style-type: decimal;
}
em {
  /* if you want underlining instead of italics */
  /*font-style: normal;
  border-bottom-style: solid;
  border-bottom-width: 1px;
  padding-bottom:      2px;*/
  text-decoration-skip-ink: auto;
}
h2 { /* Put a horizontal line above major headings to assist screen viewing */
  border-top:  1px solid #D5DAD5;
  margin-top:  80px;
  padding-top: 20px;
  }
</STYLE>