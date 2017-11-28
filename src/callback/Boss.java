package callback;

/**
 * 老板是作为上层应用身份出现的，下层应用（员工）是不知道 有哪些方法，因此他想被下层应用（员工）调用必须实现此接口
 * 
 * @author Administrator
 * 
 */
public class Boss implements CallBackInterface {

	@Override
	public void execute() {
		System.out.println("收到了！！" + System.currentTimeMillis());
	}

}
