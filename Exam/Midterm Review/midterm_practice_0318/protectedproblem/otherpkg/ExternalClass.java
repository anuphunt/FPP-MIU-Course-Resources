package midterm_practice_0318.protectedproblem.otherpkg;

import midterm_practice_0318.protectedproblem.Subclass;

//inside secondpackage
public class ExternalClass {
	public String readVal() {
		Subclass cl = new Subclass();
		//return cl.getVal(); //produces a compiler error -- how to fix?
		return null;
	}
}


