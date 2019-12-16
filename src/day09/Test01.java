package day09; //인터페이스와 default

import javax.swing.JOptionPane;

public class Test01 {

	public static void main(String[] args) {
		Command cmd = null;
		
		String msg = 
	JOptionPane.showInputDialog
	("명령을 입력하세요. 1.delete 2.insert 3.update");
		
		switch(msg) {
		case "1":
		case "delete":
			cmd = new DeleteCommand();
			break;
		case "2":
		case "insert":
			cmd = new InsertCommand();
			break;
		case "3":
		case "update":
			cmd = new UpdateCommand();
			break;
		default:
			//System.out.println("명령 선택을 다시하세요");
			cmd = new ListCommand();
			break;
		}
		
		if(cmd != null) {
			cmd.exec();
			cmd.base();
		}

	}

}
interface Command {
	void exec() ; //추상메소드 public abstract 생략
	default public void base() { //인터페이스 기능 확장\
		System.out.println("Command base() 기능 ");
	}
}

class DeleteCommand implements Command{

	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");		
	}	
}

class UpdateCommand implements Command{

	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");		
	}	
	public void base() {
		System.out.println("UpdateCommnand base() 기능 재정의");
	}
}

class InsertCommand implements Command{

	@Override
	public void exec() {
		System.out.println("InsertCommand 수행");		
	}		
}
class ListCommand implements Command{
	public void exec() {
		System.out.println("ListCommand 수행");		
	}		
}








