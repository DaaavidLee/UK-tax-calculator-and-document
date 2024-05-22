- Name: Cheng-Yu Lee
- Student ID: s2608053
- Tutorial group: Tutorial 2: Group 2 - Intermediate (Thurs. @ 17:10-18:30)
- Tutor: Ishani Raj
- Date: 2024-02-29

# Income Tax #

# Target audience #

      
Beginner programmers who want to understand income tax calculation and 
practice coding skills.

# Prerequisite knowledge #

- Basic understanding of programming concepts (variables, conditions, functions, etc.).
- Familiarity with arithmetic operations (addition, subtraction, multiplication, division).

# Learning outcomes #


1. Understand the UK income tax rules.
2. Learn to design and implement a simple income tax calculator program.
3. Practice problem-solving skills in a real-world scenario.

# Introduction #
Income tax calculation is an essential concept in finance and programming. In this worksheet, we'll explore the UK income tax rules and develop a simple program to calculate income tax based on provided rules.


# Original challenge question from CodeGolf #

[Short link to CodeGolf challenge](https://codegolf.stackexchange.com/q/256003)

## Background
Here in the UK[^1], these are the income tax rules:

* You get a personal allowance (untaxed) of up to £12,570:
  * If you earn less than £100,000, you get the full £12,570 as personal allowance.
  * For every £2 over £100,000, your personal allowance goes down by £1.
* After the personal allowance, the next £37,700 is taxed at the "basic rate" of 20%.
* After that, the next £99,730 is taxed at the "higher rate" of 40%.
  Finally, anything above this is taxed at the "additional rate" of 45%.

[^1]: This isn't actually the case in Scotland; only England, Wales and Northern Ireland.</small>

## Your task

Using the above tax rules, take in an annual salary (as a positive integer) and calculate the income tax.

## Test cases
 
| Input  | Output  |  
|--------|---------|  
| 12570  | 0       |  
| 50000  | 7486    |  
| 80000  | 19432   |  
| 120000 | 39432   |  
| 200000 | 75588.5 |  

Note: the final test case can be any of 75588, 75588.5, or 75589 (any is fine).

## Clarifications

- You can choose whether to make the personal allowance an integer or keep it as a float.
  e.g. if the input is £100,003, the personal allowance can be £12,569, £12,568.50, or £12,568.
- The same goes for the final output. If it ends up as a float, you can make it an integer or keep it as a float (see the final test case).
- This is code-golf, so shortest answer in bytes wins!

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