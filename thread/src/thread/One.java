package thread;
public abstract interface One { 
	  public void show(String s);
	} 
//	Choose the correct class.
////	 a.
//	public abstract class Two implements One{
//	   public abstract void show(String s) { }
//	}
////	b.
//	public class Two extends One {
//	  public void show(Integer i) { }
//	}
////	 c.
//	public class Two implements One {
//	 public void show(Integer i) { }
//	}
//	 d.
	class Two implements One {
		public void show(String i) { }
		public void show(Integer s) { }
	}