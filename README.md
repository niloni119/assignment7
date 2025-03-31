Implementing a Date Class in Java

Description: This Java program provides a Data class for handling and manipulating dates. It includes functionalities such as date validation, checking leap years, updating dates, printing formatted dates, sorting dates, determining the day of the week, and calculating the difference between two dates.

Methods and classes:

1. Date Validation (isValidDate())
   
Checks if a given date is valid by considering month and day constraints.

Correctly handles leap years for February.

2. Leap Year Detection (isLeapYear())

Determines whether a given year is a leap year using standard leap year rules.

3. Date Modification (updateDate())

Allows updating a date only if the new date is valid.

Prevents setting incorrect dates by reverting to the previous values if the update fails.

4. Date Printing (printDate())

Outputs the date in a user-friendly format (e.g., "January 10, 2023").

5. Date Sorting (compareTo())

Implements the Comparable interface to enable sorting based on year, month, and day.

6. Day of the Week (getDayOfWeek())

Uses Java's LocalDate to determine the weekday for a given date.

7. Date Difference Calculation (calculateDifference())

Computes the number of days between two dates using toEpochDay().

Problems:

While I was writing the code, I encountered such problems as not knowing how to find the day of the week of a certain date, how to find the difference between dates, and how to sort a list of dates. But after looking at several other people's projects on GitHub, I found answers to my questions. I also encountered such a problem as not knowing how to write compare to better. And with this, I also turned to the presentation and the Internet.

Coclusion:

So I learned how to write code in Java using classes and methods. I also got some experience in how to write code and solve problems skills. I found this task very interesting.
