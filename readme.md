This is document version 1, dated 2024-01-23.

You may adjust the CSS to suit your needs. IntelliJ can convert the
document to another format using `Tools > Markdown Converter` or
[pandoc](https://pandoc.org/installing.html "instructions for installing pandoc").

# Contents #

* [The tasks](#the-tasks-)
* [Project structure and files](#project-structure-and-files-)
* [Instructions for `worksheet.md`](#instructions-for-worksheetmd-)
* [Instructions for the diagram](#instructions-for-the-diagram-)
* [Instructions for `acknowledgements.md`](#instructions-for-acknowledgementsmd-)
* [Instructions for `writing.md`](#instructions-for-writingmd-)
  * [Writing rules and advice](#writing-rules-and-advice-)
  * [The writing questions](#the-writing-questions-)
    * [1: The best bit](#1-the-best-bit-)
    * [2: Favourite mistake](#2-favourite-mistake-)
    * [3: Helping previous you](#3-helping-previous-you-)
    * [4: Helping future you](#4-helping-future-you-)
    * [5: You be the judge](#5-you-be-the-judge-)
* [Overall advice](#overall-advice-)

# The tasks #

The task is to revise your worksheet and program code from Part 1. The
rules and requirements, including accessibility, from Part 1 still
apply unless an instruction from Part 2 overrides them.

1. Complete the [`worksheet.md` file](worksheet.md "worksheet file")
   using the feedback you have received and additional research you
   have undertaken to make improvements. You MUST continue with the
   same challenge submitted for Part 1: **no exceptions**. Note the
   additional headings in the Part 2 version of `worksheet.md`. These
   headings form part of the marking scheme so ensure you do as
   instructed.
2. Complete the
   [`acknowledgements.md` file](acknowledgements.md "acknowledgements file")
   including updating for new items and fixing all the problems
   highlighted in the feedback. The measure of well-written
   acknowledgements is that the reader need not do any additional work
   to understand how each item contributed. For tools and information
   sources this also means being immediately directed to the resource.
   For people it means understanding who the person is and their
   relationship to you, as well as how they helped.
3. Complete the
   [`writing.md` file](writing.md "writing file")
   to answer the reflective writing questions. The questions
   themselves are further down this `readme` file in
   [the "Writing questions" section](#the-writing-questions-).

You may do the worksheet and acknowledgements tasks in either order or
intertwined but you should do the reflective writing last. You are
advised to leave sufficient time to make a serious attempt at the
writing, especially if writing is not your speciality. The writing
reinforces the knowledge you have learnt doing this assignment, which
will assist you in future years, and it helps you understand more
about the process of learning. It also adds evidence that your
submission really is your own work.

# Project structure and files #

Do not transfer the `.md` files themselves from Part 1, partly because
Part 2's `worksheet.md` has additional headings. Instead, transfer the
relevant contents into the equivalent Part 2 files. The same applies
to `src/Design.java` although you may transfer additional program code
files. Make your updates in Part 2.

Note the IntelliJ project MUST be called `Assignment2part2`. The
autograder will deduct marks if the project is misnamed or structured
incorrectly, for example having a "double" project structure where the
project contains a directory with the same name as the project and all
the files are inside that subdirectory instead of being directly under
the project's root directory. The correct structure is
```text
Assignment2part2
├── Assignment2part2.iml
├── acknowledgements.md
├── diagram.jpg or diagram.png
├── readme.md
├── src
│   └── Design.java
├── worksheet.md
└── writing.md
```

# Instructions for `worksheet.md` #

You may organise your worksheet as you wish within the following
constraints:

1. The worksheet MUST start with the list of fields identifying you
   and your tutorial group.
2. After the list of identification fields, the following headings
   MUST appear in this order:
    1. The name of the challenge;
    2. Target audience;
    3. Prerequisite knowledge;
    4. Learning outcomes;
    5. Introduction.  
       Delete all the `TODO` instructions for those headings, otherwise you
       create a poor initial impression that is difficult to overcome.
3. After the Introduction, you may have headings as you need them and,
   if you wish, a table of contents.
4. The last two parts of the worksheet MUST be, in this order:
    1. a section containing the text and followup points of the
       original challenge as well as the StackExchange short-form URL
       to the original challenge;
    2. the CSS styling (which you are allowed to edit).
5. Your worksheet MUST make use of your diagram file (which may
   contain multiple components or sub-figures).

You MUST rename the `TODO` heading to show the challenge. You are
advised to use the challenge name from CodeGolf, but you may modify the
original name if you have good reason.

The worksheet MUST end with the original challenge question including
its followup questions and answers. It MUST NOT be necessary for
someone reading your worksheet to have to go to the original challenge
to read the original challenge and followup discussion.

It is useful to think of at least one part of your work that you can
try to make exceptional, even if you are unable to achieve it or
implement it. It is even more useful to minimise weaknesses throughout
your work. Think about professional sports (including e-sports),
music, or other arts activities. The top people all have aspects that
they do exceptionally; these vary per person. But all the top people
do all the "basics" to a high minimum standard. World champions spend
much more of their time improving their "weaknesses" (relatively
speaking) than they do practising their "strengths." This is an
excellent model to follow. Try to be "good" at some things, but try
harder not to be "bad" at anything important.

[Back to contents](#contents- "Return to the table of contents")

# Instructions for the diagram #

Revise your diagram from Part 1. For Part 2, your diagram MUST be
called `diagram.jpg` or `diagram.png`. The rules from Part 1 still
apply. Pay special attention to the accessibility aspects. Remember
although you are only allowed one image file, that image file is
allowed to contain multiple components, sections, or sub-figures.

[Back to contents](#contents- "Return to the table of contents")

# Instructions for `acknowledgements.md` #

The instructions for this are the same as for Part 1. Pay attention to
the tutor feedback you received. A quick and useful way to test the
quality of your acknowledgements is whether someone else can, with no
additional effort, find the same information source or tool; or can
identify the people by name or online id, their relationship to you,
and how they contributed. It is not advisable to make the people you
mention immediately contactable via the acknowledgements.

[Back to contents](#contents- "Return to the table of contents")

# Instructions for `writing.md` #

## Writing rules and advice ##

It does not matter if you are not "good" at writing. What you need to
be good at is re-writing. The main improvements in quality come from
re-writing. You are therefore strongly advised to redraft your written
answers after your first version rather than just submit your first
draft. You almost certainly would not submit the preliminary version
of your program code — apply the same quality control to your writing.

1. You MAY customize the CSS for your accessibility needs.
2. You MUST personalize the information at the top of the `writing.md`
   file.
3. You SHOULD attempt every question.
4. You MAY use markdown, but if you do, you MUST use it consistently,
   correctly, and appropriately.
5. You MUST NOT alter the headings in the file `writing.md`.
6. You SHOULD proofread your work thoroughly before submission.
7. You MUST use technical terms appropriately and correctly.
8. You MAY use tools and resources to help you write but you MUST
   report these in the acknowledgements. The final draft MUST be
   demonstrably your own effort building on any resources you have
   used.
9. There are no word limits but overly long answers might not be read
   in full.

Answers need to be long enough to include the main points, while being
short enough to demonstrate the ideas and thoughts have been curated
and ordered purposefully. While there is no word limit, the marker is
allowed to stop reading and marking if they feel the answer is
excessive, extraneous, or repetitive. Answers may refer to text in
your other answers to avoid repetition.

You are not being judged on your general English. Nevertheless, you
MUST use technical terms appropriately and correctly to be taken
seriously as a Computer Scientist — this is true of every subject.
Using your subject's technical language correctly is altogether more
important than being accurate in small matters of grammar. However, if
your writing has so many errors that it is unclear or inaccurate,
whether overall or in concentrated doses, it might confuse or mislead
the marker, meaning missed opportunities to gain marks. **Probably the
best way to proof-read your work is reading it aloud.** Text-to-speech
software might help.

A lack of range of vocabulary and grammar might limit your ability to
communicate effectively. You are not explicitly marked on these
matters but you need to be able to express your ideas clearly. You are
expected to take pride in your work by checking for and correcting
simple errors such as spelling, orthography, and unconventional
spacing around punctuation.

[Back to contents](#contents- "Return to the table of contents")

## The writing questions ##

### 1: The best bit ###

What part of your assignment are you most pleased with and why? What
part do you wish you had been able to improve further and why?

You may choose any part(s) or subtask(s) of the assignment.

[Back to contents](#contents- "Return to the table of contents")

### 2: Favourite mistake ### 

Error analysis is incredibly useful — it is important to value mistakes
rather than feel embarrassed. So **outline** your most useful or
"favourite" mistake from this assignment, whether you actually made it
or stopped yourself from making it. **Explain** what this mistake helped
you learn.

Think of the instruction word "outline" like in art: drawing an
outline means giving the overall shape with only enough detail to
distinguish that shape from another: for example enough to identify a
line drawing of a lion from a tiger.

Whereas "outline" means minimal detail, "explain" means use detail,
though this should be focused, not excessive. You could think of it in
terms of commenting code: most blocks of code should be
self-documenting but some require additional clarification.

[Back to contents](#contents- "Return to the table of contents")

### 3: Helping previous you ###

Imagine you could travel back to before this assignment started to
advise "previous you." Write three prioritised pieces of succinct
advice to "previous you." Each piece of advice should justify its
ranking and try to preempt the question "why are you giving me this
advice?"

Pay attention to the instructions "succint" and "justify its ranking"
in the question — ensure your answer satisfies these requirements.

[Back to contents](#contents- "Return to the table of contents")

### 4: Helping future you ###

For this assignment you had to self-study markdown, accessibility, and
engineering requirements (something MUST (NOT) / SHOULD (NOT) /
MAY). Suggest how these might help you in **ONE** of these scenarios:

- working in a team as a Computer Scientist in a company or academic
  institution;
- writing your own software for publication, whether alone or in a
  team;
- in a future University assignment (not necessarily involving
  programming) either individually or in a group.

If those three scenarios do not appeal to you, you may alternatively
travel back in time and show these might have helped in a previous
assignment (not necessarily involving programming).

Your answer will be easier to write — and read — if you have a clear
idea of the scenario details. Your answer should include half a
sentence to a full a sentence setting a **specific** scene rather than
a general or generic situation. Try to find a (fairly)
self-explanatory scenario because this reduces the amount you have to
explain.

[Back to contents](#contents- "Return to the table of contents")

### 5: You be the judge ###

Comment on how effective or ineffective you feel the steps you took to
complete this assignment were. You must include a brief judgement of
what you feel the quality / level / grade of your work is.

Try to identify what was useful. Also consider whether something
turned out to be less (or more) useful than you expected. One
measure of the quality of your worksheet is, given a set of worksheets
produced by Inf1B students, whether you would be attracted to do this
worksheet instead of another.

[Back to contents](#contents- "Return to the table of contents")

# Overall advice #

Like a world champion, set yourself a high minimum standard, but don't
pressure yourself to a high maximum standard. You devalue a high
maximum if you don't have a high minimum. A high minimum is achievable
by taking pride in your work and performing basic checks. Actively
look for errors and inconsistencies and remove them. Read your work
aloud to hear errors and clumsy wording. Abide by the rules and
requirements. Have you actually done as the assignment asks? Check
your submission file before you submit it, and check what the system
says about your submission.

And above all: read the instructions and follow them.

[Back to contents](#contents- "Return to the table of contents")

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
</STYLE>"# UK-tax-calculator-and-document" 
