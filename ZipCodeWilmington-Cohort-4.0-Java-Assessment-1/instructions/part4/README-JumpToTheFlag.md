## Jump The Flag

Bob is trying to reach a flag that's k units above the ground. In his attempt to reach the flag, Bob can make any number of jumps up the rock wall where it's mounted; however, he can only move up the wall (meaning he cannot overshoot the flag and move down to reach it). There are 2 types of jumps:

1. A jump of height 1.
2. A jump of height j.
 

Bob wants your help determining the minimum number of jumps it will take him to collect the flag. Complete the jumps function in your editor. It has 2 parameters:

1. An integer, k, the height of the flag.
2. An integer, j, the number of units he ascends in a jump of type 2.
It must return an integer denoting the minimum number of times Bob must jump to collect the flag.

 

### Input Format

```
/*
 * Complete the function below.
 */
  public int jumps(int k, int j) {

  }
```

The first parameter contains an integer, k, denoting height of the flag.

The second parameter contains an integer, j, denoting the number of units Bob ascends in a jump of type 2.

 
**Constraints**

1 ≤ k ≤ 109
1 ≤ j ≤ 109
 

**Output Format**

Your function must return an integer denoting the minimum number of jumps Bob must make to collect the flag. This is printed to stdout by the locked stub code in your editor.

 

**Sample Test 0**

```
// Should assert to true
Jumper jumper = new Jumper();
Integer expected = jumper.jumps(3,1);
Integer actual = 3;
Assert.assertEquals(expected, actual);
``` 

**Explanation**

**Sample Case 0:** As Bob can only jump 1 unit or j units and j = 1, Bob can only ever make 1-unit jumps. This means that it will take him 3 steps to reach the flag, so we return 3.


**Sample Test 1**

```
// Should assert to true
Jumper jumper = new Jumper();
Integer expected = jumper.jumps(3,2);
Integer actual = 2;
Assert.assertEquals(expected, actual);
``` 

**Explanation**

**Sample Case 1:** Bob will jump j = 2 units, and then jump 1 more unit to reach the flag. Thus, we return 2.

**Sample Test 2**

```
// Should assert to true
Jumper jumper = new Jumper();
Integer expected = jumper.jumps(3,3);
Integer actual = 1;
Assert.assertEquals(expected, actual);
``` 

**Explanation**

**Sample Case 2:** Bob will make a single jump j = 3 units up the rock wall and reach the flag, so we return 1.
