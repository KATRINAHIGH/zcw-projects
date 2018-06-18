# Console Lab Level 1

## Objectives

1. In this lab students will learn to navigate their file system using only the terminal
2. Students will practice using the following commands to traverse directories and investigate their contents: `pwd`, `ls`, `cd`, `cat`, `less`, `grep`


## Overview

The console (also referred to as the command line, terminal, or shell) is an essential tool for programmers to be familiar with. The command line shell we will be using is called Bash. This lab will focus on the basics for navigating and investigating the file system through the command line. In this lab we will only be using the command line in interactive mode (more on that in the Bash labs). Here are the commands we will focus on:

- `pwd` - "Print Working Directory" prints out your current location (known as your current working directory or 'cwd')
- `ls` - lists contents of the cwd
- `cd` - change directory. This is how you move around the file system. You can specify the destination as an absolute or relative path.
- `echo` - prints text to the terminal
- `cat` - concatenates zero or more files. Often used to print the contents of a file to the terminal. [Often misused](https://en.wikipedia.org/wiki/Cat_(Unix)#Useless_use_of_cat)
- `less`/`more` - Display contents of a file one page at a time ...just remember that less is more ([more or less](http://unix.stackexchange.com/questions/81129/what-are-the-differences-between-most-more-and-less)) and you'll be fine.
- `grep` - search for the specified text or pattern

### Other commands worth knowing

- `head` - display the first lines of a file
- `tail` - display the last lines of a file



## Unit Test

This lab is an instructional introduction to terminal. There are no unit tests.

## Pre-lab && Important Notes

It's a good practice to have a directory called `Dev` inside your home directory for all development work. You can create one in Finder (right click -> New Folder) or in the terminal (`mkdir ~/Dev`). This directory will come in handy in case things go horribly wrong, or if you want to back up all of your work. You should always make sure you are working in Dev or a directory inside of it during this course.

## Instructions

- Open up a terminal (Applications->Utilities->Terminal)
- Find out what directory you're in using `pwd`
- You know where you are, but not what's around you. Take a look around with `ls`
- You probably started in your home directory, but just in case, tell the terminal to move to your home directory with `cd ~`. Use `pwd` again to confirm.
- Change into your Dev directory with `cd Dev`. If you don't have one you should create one (see above)
-  Now let's try printing the contents of a file. First we need to create the file. One quick way to do that is with the command `echo "Hello Terminal" >myFile.txt`. We'll explain this command in greater detail in the next lab.
-  Use `ls` to list the contents of your directory after running that command to see what changed.
-  Now show the contents of that new file using the `cat` command.
-  You can use `cat` to print the contents of multiple files; Create another file the same way you created myFile.txt and then print them both together (eg: `cat myFile.txt myFile2.txt`)
-  Using `cat` is fine for small files, or when you just want to print the entire contents of a file, but if you want to read through a large file it's not great. Try using cat on the file `/etc/bashrc_Apple_Terminal`
-  That file's a bit big for `cat`; try viewing it again with `less`. You can move around in `less` using ENTER, SPACE, and your arrow keys. To exit less, press the letter `q`. (note that if this is the first time you've used the terminal, your .bash_history file may still be very small)
-  The last command for you to try out is `grep`. You can use this to search for a pattern in a file or other body of text. Try using it on that first file you created like this: `grep Hello myFile.txt`. Notice that the result is the whole line where the text you searched for occurs. What happens if you use grep to search for something that isn't in the file?


# Part 2

## Objectives

1. After this lab students will know how to create, remove, and modify files and directories using the terminal
3. By completing this lab students will gain exposure to man pages and the use of bash commands with arguments and options.


## Overview

In Part 1 lab you learned to navigate your file system in the terminal. In Part 2 you will learn how to actually make changes to the file system and where to find documentation to get a better grasp on commands you are already familiar with as well as those you haven't seen before. The commands you will practice in this lab are:

- `touch`
- `mkdir`
- `rmdir`
- `rm`
- `cp`
- `mv`
- `<`,`>`,`>>`,`|`


## Instructions


### Creating files and directories

In lab 1 you learned one way to create a file using the `echo` command and output redirection. That can be useful but there are other methods that make more sense sometimes. Here we'll focus on two other methods:

- the `touch` command.
- file editors.

#### Creating files with touch

To create a file using touch, simply type the command followed by the name of the file you want to create, like this: `touch filename`. Touch is actually meant to update the timestamp on files, but as a side effect it creates files that are named but don't already exist. It's time to practice `touch`ing files

- Use `touch` to create two files, called myfile1 and myfile2
- Try using `touch` to create three more files, but all in the same command. Just give touch the filenames you want one right after the other, separated by a space
- Use the `ls -lT` (that's a lowercase 'L' after the dash) command to see the full timestamps of the files you just created. Notice that the first two are different but the last three are all the same.

-

#### Editors

There are many text editors out there. We will be using an editor called VIM (short for VI iMproved -- it is a clone of the editor VI with some improvements). Other options that you can explore on your own include emacs and nano (a clone of a program called pico). Here are the VIM commands we'll use along with a few other useful basics (there are many, many, many many more):

- `:w` - Write; writes the current contents of the buffer (editor) to a file. 
- `:q` - Quit; Quits VIM. Complains if you have unsaved changes (use `:w` first, or `:q!` to force quit and abandon your changes)
- `:set number`/`:set nonumber` - Enables/disables line numbers.
- `a` - Switch to insert mode after the current character. `A` goes to the end of the line instead.
- `i` - Switch to insert mode before the current character. `I` goes to the beginning of the line instead
- `x` - Delete the character under the cursor.
- `dd` - Delete the current line.
- `h``j``k``l` - Work like the left, down, up, and right arrow keys respectively.

-

- Let's create a file with vim. Start by opening the program with the `vim` command.
- This is the editor screen. VIM has two modes, insert mode and normal mode; it starts in normal mode. The `esc` key switches to normal mode from insert mode but not the other way -- if you ever get lost just hit escape.
- We want to create a file, but we don't need anything in it yet. To save your current file you can use the `:w` command from normal mode. Type `:w myfile6` to save this empty file as "myfile6"
- Quit VIM with the `:q` command and list the contents of your directory to confirm that you created a file (Shortcut: `:wq` allows you to save a file and quit with just one command)
- Open that file by running vim with the filename. This time we'll add a little text.
- Switch to insert mode by pressing the `a` key and type the message "Hello Editor!". Remember to press `esc` when you finish to switch back to normal mode.
- Save the file (remember how?)
- Let's make that message a little more specific. Delete the word 'Editor' and replace it with VIM. Look at the list of commands to see how to do this. Save the changed file.
- One powerful feature in VIM is the ability to repeat commands automatically. Type the number 10 before using the `A` (note that it's capitalized) command to add text to the end of the line; Press enter to go to the next line and then type a short message. See what happens when you finish the message and press `esc`
- Now that you have several lines in your file, line numbers might be helpful. Enable them using the `:set number` command.
- Ten copies of the same message might be a bit too much. Move the cursor to line 2 and type `9dd`. You should now see only one line of your message.

#### Creating directories


- Use `mkdir` to make a directory with your name
- make two more directories inside of that one called "dir1" and "dir2"
- You can make directories in other places than your current directory, without `cd`ing into it, make a directory inside dir1. When you give the location of a file or directory relative to your current position that's called a relative path
- Try making a directory inside dir2 by giving an absolute path. Absolute paths list the exact location of a file -- you've seen this before with the pwd command.

### Copying, moving, and renaming
- use the `cp` command to copy the file you wrote in the last section. Try using the man file for cp to see what the correct syntax is (anything between [] braces is optional)
- Make a new directory and then move the copied file you just created into that directory using the `mv` command.
- Let's change the name of that file. The `mv` command doesn't have to move a file to a new location; it can simply change the name of the file in place. Change the name to something that starts with a dot (.) such as ".myFile"
- Now check the contents of your directory with `ls`. Where is the file you just renamed? In Linux and Unix systems, files and directories with names starting in "." are hidden, so by renaming your file you actually made it a hidden file. Let's see how we can view hidden files with `ls`
- The `man` command lets you view the man(ual) pages for any command that is documented. Try viewing the man pages for ls, cp, and mv. Once you've looked at each of these and have a feel for how they are laid out, take another look at the ls man page and see if you can figure out how to view hidden files (remember, hidden files begin with a dot '.' ) <sub>**hint**: viewing man pages is like using less; you can move up and down in the file with the keyboard and when you want to exit you can press the 'q' key*</sub>

### Destroying files and directories

- Make three files and two directories any way you like; create a file inside one of those directories.
- The `rm` command deletes files, try using that on one of the files you created.
- Another way to delete a file is the `unlink` command. Use this to delete the second file.
- Sometimes you want to make sure you are deleting the right files (particularly if you use the * wildcard). use `rm -i` to delete the last file and notice that you have to confirm it before it's deleted.
- Try to delete one of those directories with `rm`. Notice that on its own it won't delete directories.
- Use `rmdir` (or `rm -d`) to delete the empty directory, then try it on the directory with a file in it.
- Directories can only be deleted when they are empty; this could get painful if you have a lot of files and directories inside of one you want to delete. Try deleting that directory again with the `rm -R` command. The `-R` flag tells `rm` to recursively delete the contents of each directory it encounters and then delete the directory.
- **Bonus**: run the command `echo "Hello" >-toughFile` and then try to delete the file created by that command. There are at least two ways to do this.


### The Art of Redirection

Remember in the previous lab when you typed the command `echo "Hello Terminal" >myfile.txt`? That 'greater than' sign is actually a special character in bash used for redirecting output to a file. There are several of these operators for redirecting output and input. The main redirection operators to be aware of are as follows:

- `<` - Redirects input to come from the specified file. By default input comes from a stream called STDIN (STandarD INput)
- `>` - Redirects output to the specified file (if the file exists its contents are erased first). By default normal program output is directed to a stream called STDOUT (STandarD OUTput) and errors are directed to a stream called STDERR (STandarD ERRor -- Redirect STDERR using `2>` instead)
- `>>` - Appends output to the specified file instead of overwriting it
- `|` - redirects the output from the previous command to be the input of the next command.

-


- Use the `find` command to search for all files on your machine with "core' in the name. You can do that with `find / -name core`.
- That's a lot of "Permission denied" errors, and they make it hard to see the useful output from that command. Fortunately that's where output redirection becomes helpful: Those errors all go to STDERR, while the output we want is going to STDOUT. Use the commands above to redirect STDERR to `/dev/null`, effectively throwing away the output from STDERR.
- That's a little better. We want to search for specific core files in this output, so let's redirect STDOUT to a file called `corefiles.log`.
- Next, use `grep` to search for any lines that contain the string 'lib'. We want the search to be case insensitive so we'll use the `-i` flag like so: `grep -i lib corefiles.log` (**note**: your file may have very few lines in it if your computer is rather new and has not had many programs installed yet. It may seem silly to use grep to search for a particular line in a file with only two lines, but when you're searching for an error that occurred only once in over 10000 lines of debugging output you will want to know this tool well.)
- Great, but there's a quicker way to do this without creating a file and running two separate commands. Try using the `|` (pipe) character to redirect the output from `find` to the input for `grep`. Don't forget to throw out the STDERR output; we don't need grep to search through that since we already know it won't contain the files we're looking for.

#### Backgrounding

Did you notice how you had to wait a few seconds every time you ran that find command? Sometimes you may need to use a long-running command and don't want it to lock up your terminal the whole time it's running. That's when you would want to run it in the background (by default, any command you run on a terminal runs in the foreground. Let's play with backgrounding and foregrounding a bit.

- Run that same `find | grep` command that you used in the last step, but add the background operator, `&`, to the end of it. Notice that you immediately get a prompt, but after a few seconds the result of the grep prints to the command line.
- For now we won't worry about that output getting in the way, but this is another good example where you may want to redirect STDOUT to a file.

Now let's practice one more backgrounding technique with a different command.

- Run the command `python -m SimpleHTTPServer`. This will run forever until you kill it with ~~fire~~ `Ctrl`+`C`
- Now you're stuck without your prompt; but we can fix that! Press `Ctrl`+`Z` to suspend (not kill) that program.
- Now you've got your terminal back, but if you type `jobs` you'll see that python is currently stopped. You can bring it back with `fg`, but that will block your prompt again; instead, use `bg` to resume it in the background.
- Now that you've resumed python in the background, you can see it listed as running in `jobs`. Bring it back to the foreground with `fg` and then kill it with `Ctrl`+`C`
 

## Other Resources

- For more practice with the basics of the terminal, try the [Command Line Crash Course](http://learnpythonthehardway.org/book/appendixa.html).

- `vimtutor` -- type this command on your command line for a built-in lesson in VIM basics.

## What's next?
The next lab is [here](https://github.com/Zipcoder/ZCW-Microlabs-Git).

## Links:

1. "Often misused" https://en.wikipedia.org/wiki/Cat_(Unix)#Useless_use_of_cat
2. "more or less" http://unix.stackexchange.com/questions/81129/what-are-the-differences-between-most-more-and-less
3. "Command Line Crash Course" http://learnpythonthehardway.org/book/appendixa.html
4. "VIM 101" https://www.linux.com/learn/vim-101-beginners-guide-vim

