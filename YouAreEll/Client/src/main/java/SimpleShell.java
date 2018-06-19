import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SimpleShell {


    public static void prettyPrint(String output) {
        // yep, make an effort to format things nicely, eh?
        System.out.println(output);
    }

    public static void main(String[] args) throws java.io.IOException {

        YouAreEll webber = new YouAreEll();
        //String commandLine;// can remove this. all this is doing is telling the compiler to make space for a string. Do this only if chance it will never be used.
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in)); //even though InputStreamReader is not a reader I can use it here because it extends reader and inherits its properties

        ProcessBuilder pb = new ProcessBuilder();//"this is used to create an operating system process", its a way to interact with the underlying operating system
        List<String> history = new ArrayList<String>(); //List is interface, ArrayList implements List interface,

        int index = 0;
        //we break out with <ctrl c>  when this is running only to stop it is press control c, there's no interupt so have to kill manually in terminal
        while (true) {
            //read what the user enters
            System.out.println("cmd? ");
            String commandLine = console.readLine();

            //input parsed into array of strings(command and arguments)
            String[] commands = commandLine.split(" ");
            List<String> list = new ArrayList<String>();

            //if the user entered a return, just loop again
            if (commandLine.equals(""))
                continue;
            if (commandLine.equals("exit")) {
                System.out.println("bye!");
                break;
            }

            //loop through to see if parsing worked
            for (int i = 0; i < commands.length; i++) {
                //System.out.println(commands[i]); //***check to see if parsing/split worked***
                list.add(commands[i]);

            }
            System.out.println(list); //***check to see if list was added correctly***
            history.addAll(list);
            try {
                //display history of shell with index
                if (list.get(list.size() - 1).equals("history")) {
                    for (String s : history)
                        System.out.println((index++) + " " + s);
                    continue;
                }

                //region SPECIFIC COMMANDS

                String results;

                // ids
                if (list.contains("ids")) {
                    switch (list.size()) {
                        case 1:
                            results = webber.get_ids();
                            SimpleShell.prettyPrint(results);
                            break;
                        case 3:
                            // get 2nd and third item from list
                            // create json object with "name" set to the 2nd item and "github" set to the 3rd item
                            System.out.println("delete me");
                            results = webber.post_id("{\"userid\":\"-\",\"name\":\"kat\",\"github\":\"KATRINAHIGH\"}");
                            SimpleShell.prettyPrint(results);
                            break;
                        case 4:
                            //handle PUT here
                        default:
                            throw new IOException();
                    }
                    continue;

                }

                // messages
                if (list.contains("messages")) {
                    results = webber.get_messages();
                    SimpleShell.prettyPrint(results);
                    continue;
                }
                // you need to add a bunch more.

                //!! command returns the last command in history, this is the command before last
                if (list.get(list.size() - 1).equals("!!")) {
                    pb.command(history.get(history.size() - 2));

                }//!<integer value i> command  ...this is the last command, exclimation marks are terminal shortcuts, we are emulating them
                else if (list.get(list.size() - 1).charAt(0) == '!') {
                    int b = Character.getNumericValue(list.get(list.size() - 1).charAt(1));
                    if (b <= history.size())//check if integer entered isn't bigger than history size
                        pb.command(history.get(b));
                } else {
                    pb.command(list);
                }

                // wait, wait, what curiousness is this? It's doing nested curios bullshit with lists and arrays
                Process process = pb.start(); //expecting a list that can't be empty or have null strings

                //obtain the input stream
                InputStream is = process.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                //read output of the process
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
                //endregion
            }

            //catch ioexception, output appropriate message, resume waiting for input
            catch (IOException e) {
                System.out.println("Input Error, Please try again!");
            }
            // So what, do you suppose, is the meaning of this comment?
            /** The steps are:
             * 1. parse the input to obtain the command and any parameters
             * 2. create a ProcessBuilder object
             * 3. start the process
             * 4. obtain the output stream
             * 5. output the contents returned by the command
             */

        }


    }

}