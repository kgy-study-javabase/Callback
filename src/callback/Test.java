package callback;

public class Test {
	public static void main(String[] args) {

		Employee emp = new Employee();

		// 将回调对象（上层对象）传入，注册
		emp.setCallBack(new Boss());

		// 开启控制器对象运行
		emp.doSome();
	}
}
