import java.util.ArrayList;
import java.util.Scanner;



public class ToDoApp {
        public static void main(String[] args){
        ArrayList<Task> tasks=new ArrayList<>();
        Scanner input =new Scanner(System.in);
        int chioce;
        do{
            System.out.println("================================");
            System.out.println("WELCOME AT ToDoList🫡");
            System.out.println("================================");
            System.out.println("1-Add New Task");
            System.out.println("2-Show All Tasks");
            System.out.println("3-Remove Task");
            System.out.println("4-Mark As Done");
            System.out.println("5-Remove Mark");
            System.out.println("6-Exit");
            System.out.print("Choose A Number: ");
            chioce=input.nextInt();
            input.nextLine();
            switch (chioce) {
                case 1:
                    System.out.print("Enter the task: ");
                    String taskDesc=input.nextLine();
                    tasks.add(new Task(taskDesc));
                    System.out.println("Added successfully\n");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No task added yet");
                    }
                    for (int i = 0; i < tasks.size(); i++) {
                        Task x=tasks.get(i);
                        if (x.iscompleted())
                            System.out.println((i+1)+".✅ "+x.getTaskName()+".");
                        
                        else
                            System.out.println((i+1)+".❌ "+x.getTaskName()+".");
                    }
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.print("Enter the number of the task: ");
                    int num=input.nextInt();
                    while ( !(num>0 && num<=tasks.size()) ) {
                        System.out.println("The task number is incorrect! Please try again.");
                        System.out.print("Enter the number of the task: ");
                         num=input.nextInt();
                    }
                    tasks.remove(num-1);
                    System.out.println("Removed successfully\n");
                    break;

                case 4:
                    System.out.print("Enter the number of the task: ");
                    int taskNum=input.nextInt();

                    while ( !(taskNum>0 && taskNum<=tasks.size()) ) {
                        System.out.println("The task number is incorrect! Please try again.");
                        System.out.print("Enter the number of the task: ");
                         taskNum=input.nextInt();
                    }
                    tasks.get(taskNum-1).markAsDone();
                    System.out.println("Added mark successfully✅\n");
                    break;

                case 5:
                    System.out.print("Enter the number of the task: ");
                    int task_Num=input.nextInt();
                    
                    while ( !(task_Num>0 && task_Num<=tasks.size()) ) {
                        System.out.println("The task number is incorrect! Please try again.");
                        System.out.print("Enter the number of the task: ");
                         task_Num=input.nextInt();
                    }
                    tasks.get(task_Num-1).removeMark();
                    System.out.println("Remove mark successfully😢\n");
                    break;

                case 6:
                    System.out.println("Good Bye👋");
                    break;
                
                default:
                    System.out.println("The option number is incorrect! Please try again.");
                    break;
            }
        }while(chioce!=6);

        input.close();
    }
}