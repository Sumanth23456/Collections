import java.util.Iterator;
import java.util.LinkedList;



class ToDoList{
	LinkedList<Task> li=new LinkedList<>();
	public void add(String Description,boolean isCompleted){
		 li.add(new Task( Description,  isCompleted));
	}
	public void delete(String Description) {
		Iterator<Task> it=li.iterator();
		while(it.hasNext()) {
			Task task = it.next();
	            if (task.Description.equals(Description)) {
	                it.remove();
	                break;}
		}
		
	}
	public void display(){
		 li.forEach(System.out::println);
	}
	 void editTask(String oldDescription, String newDescription) {
	        for (Task task : li) {
	            if (task.Description.equals(oldDescription)) {
	                task.Description=newDescription;
	                break;
	            }
	        }
	    }
}
class Task{
	String Description;
	boolean isCompleted;
	public Task(String Description,boolean isCompleted) {
		this.Description=Description;
		this.isCompleted=isCompleted;
	}
	@Override
	public String toString() {
		return "Task [Description=" + Description + ", isCompleted=" + isCompleted + "]";
	}
	
}
 class Todo {
	 public static void main(String[] args) {
		 ToDoList tl=new ToDoList();
         tl.add("learn Arrays", false);
         tl.add("learn Strings", false);
         tl.add("learn Collections", true);
         tl.delete("learn Arrays");
         tl.display();
}
}