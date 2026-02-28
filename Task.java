public class Task {
    private String task_name;
    private boolean iscompleted;

    public Task(String task_name){
        this.task_name=task_name;
        this.iscompleted=false;
    }
    public void markAsDone(){
        this.iscompleted=true;
    }
    public void removeMark(){
        this.iscompleted=false;
    }
    public String getTaskName(){
        return task_name;
    }
    public boolean iscompleted(){
        return iscompleted;
    }  
}
