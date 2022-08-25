package duke;

import java.util.ArrayList;

public class Ui {


    public void dukeReply(String message) {
        String lineBreak = "-------------------------------------------------";
        String reply = String.format("%s\n%s\n%s", lineBreak, message, lineBreak);
        System.out.println(reply);
    }

    public void greet() {
        dukeReply("Hello! I'm Ee Suan!\nWhat can I do for you?");
    }

    public void exit() {
        dukeReply("Bye. Hope to see you again soon!");
    }

    public void printList(TaskList taskList) {
        StringBuilder message = new StringBuilder("Here are the tasks in your list:");
        for (int i = 0; i < taskList.size(); i++) {
            Task curTask = taskList.get(i);
            message.append("\n").append(i + 1).append(". ").append(curTask);
        }
        dukeReply(message.toString());
    }

    public void printFind(ArrayList<Task> filteredList) {
        StringBuilder message = new StringBuilder("Here are the matching tasks in your list:");
        for (int i = 0; i < filteredList.size(); i++) {
            Task curTask = filteredList.get(i);
            message.append("\n").append(i + 1).append(". ").append(curTask);
        }
        dukeReply(message.toString());
    }

    public void echoTask(Task task, TaskList taskList) {
        int size = taskList.size();
        dukeReply("Got it. I've added this task: \n  " + task + "\nNow you have " + size + " task(s) in the list.");
    }

    public void echoDelete(Task task, TaskList taskList) {
        dukeReply("Noted. I've removed this task:\n  " + task +"\nNow you have " + taskList.size() + " task(s) in the list." );
    }
}
