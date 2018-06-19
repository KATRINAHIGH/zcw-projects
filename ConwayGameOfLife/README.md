# Conway's Game of Life

The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970.

The "game" is a zero-player game, 
meaning that its evolution is determined by 
its initial state, requiring no further input. 
One interacts with the Game of Life by creating an initial configuration and observing how it evolves over many egenerations.

### Rules

The universe of the [Game Of Life ](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life) is an infinite two-dimensional matrix grid of square cells, each of which is in one of two possible states, alive or dead, or "populated" or "unpopulated". Every cell interacts with its eight neighbours, which are the cells that are horizontally, vertically, or diagonally adjacent. At each step in time, the following transitions occur:

* Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
* Any live cell with two or three live neighbours lives on to the next generation.
* Any live cell with more than three live neighbours dies, as if by overpopulation.
* Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

The initial pattern constitutes the seed of the system. The first generation is created by applying the above rules simultaneously to every cell in the seed—births and deaths occur simultaneously, and the discrete moment at which this happens is sometimes called a tick (in other words, each generation is a pure function of the preceding one). The rules continue to be applied repeatedly to create further generations.

You run each generation, decide what cells will be alive in the next generation, make the next generation the current generation and then repeat for some number of times.

### a Cool Website to explore

[Stanford Conway's Game of Life](http://web.stanford.edu/~cdebs/GameOfLife/) is a terrific site, which has a simulator
on it where you can draw and see what happens.

## The Lab

This lab has three parts. 

The first is to create a single window of a set size where a random game can start and run for some number of generations. 

The second is to prove your game engine works correctly by correctly running the two very simple tests.

The third is to do a screen grab of a Size 50 matrix, randomly started, and showing the graphic results after 50 generations.

You'll use a 2D matrix of ints. So "int[][]" is the basic type. When you set the dimension, as referenced in the UML,
you will then set the arrays to `int[50][50]` if dimension is set to 50.

You'll create two constructors and a few methods to help you break the problem up.

`isAlive(int, int, int[][])` is the heart of the ConwayGameOfLife class.

you call it to determine if the cell at i,j will be alive in the next generation, If the cell and its immediate neighbors
fulfill the rules above, the cell lives (1), if not it does (0). when you are at the end of the matrix, reach back around to the "other side" to get the adjacent cell. This essentially makes the top edge meet with the bottom edge, and left edge meet with the right edge.

`simulate(numberOfGenerations)` returns the final state of the matrix after simulating numberOfGenerations. 

To determine each generation, you should do a nested FOR loop through the currentGeneration matrix, taking the values from the currentGeneration, and deciding on the live/die for that cell in the nextGeneration matrix. 

at the end of each generation, you should `copyAndZeroOut(nextGeneration, currentGeneration)`, this routine should
copy each i,j value from nextGeneration to the same i,j in currentGeneration. Then it should put a 0 into i,j or nextGeneration. Then you loop and do it again until generations > maxGenerations.

In each of your Constructors, the first thing you should do is create an instance variable displayWindow from the provided
SimpleWindow class. 

```aidl
 this.displayWindow = new SimpleWindow(dimension);
```

at the top of your main generations loop, you shoud display the currentGeneration matrix:
```aidl
 this.displayWindow.display(currentGeneration, generations);
```

at the botom of the loop, you should call the window's `sleep` method to delay for 125 milliseconds
```aidl
 this.displayWindow.sleep(125);
```

Finally, you should create a `private int[][] createRandomStart(Integer dimension)` method
that creates a int[][] array and loops through it puting in randoom 1 or 0 values for each cell in the 
array. This can be used to "seed" the simulation in the `ConwayGameOfLife(Integer dimension)` constructor.

The testing constructor `ConwayGameOfLife(Integer dimension, int[][] startmatrix)` takes the dimension and the
test starting array.


