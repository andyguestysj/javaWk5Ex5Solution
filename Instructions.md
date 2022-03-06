## C'est La Vie

1. The `Printer` class is already created for you. It looks like this.
```java
public abstract class Printer {

  public abstract void print(int x);
  
}
```
This is a parent for classes which can print out an integer in a variety of different ways.

2. Make a class `Stars` which **extends** `Printer` and overrides `print()` to print out the `integer`
using the appropriate number of stars; e.g. for 5 it should print out "* * * * *"

3. Make similar classes `English` (which prints out the number using the English word) and
`Numeric` (which prints out the number using a simple number). Make your classes work for
numbers between 1 and 5.

4. In `main` create `Stars`, `English` and `Numeric` objects.

5. Write code in `main` to ask the user for a number then call `print()` for each of your objects.
Your output might look something like this:
```console
Enter a number between 1 and 5
4 
Output
4
****
four
```

6. Add a new class `French` which prints out the number using the French word. The table below gives
a translation table.

|Number|French word|
|---|---|
|1|un|
|2|deux|
|3|trois|
|4|quatre|
|5|cinq|
