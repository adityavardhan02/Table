package apjfsa;

public class PrintTable extends Thread{
	Table table;
	public PrintTable(Table table) {
		super();
		this.table=table;
	}
	
	public void run() {
		table.printTable(7);
	}

	public static void main(String[] args) {
		Table t=new Table();
		
		PrintTable pt=new PrintTable(t);
		
		PrintTable pt1=new PrintTable(t);
		pt.start();
		pt1.start();
	}

}
