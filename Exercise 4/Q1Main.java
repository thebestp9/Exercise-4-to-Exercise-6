class QuestionOne {
	private int count;
	
	public void init(){
		count = 1;
	}
	public void increment() {
		count = count + 1;
	}
	public int getCount() {
		return count;
	}
}
public class Q1Main {
	public static void main (String []arg) {
		QuestionOne q1;
		q1 = new QuestionOne();
		q1.init();
		q1.increment();
		q1.increment();
		System.out.println(q1.getCount());
	}
}
