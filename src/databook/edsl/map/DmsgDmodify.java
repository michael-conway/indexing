/** Code generated by EriLex */
package databook.edsl.map;
public class DmsgDmodify<__t,__E> extends Dmsg<__t,__E> {
	Dmap<__t,__E> i0;
	Dmap<__t,__E> i1;
	Dmsg<__t,__E> i2;
	public DmsgDmodify(
		final Dmap<__t,__E> i0, 
		final Dmap<__t,__E> i1, 
		final Dmsg<__t,__E> i2) {
		super(new erilex.tree.ASTValueData(
				"msg", 
				"msg")
			, 
			new erilex.data.generic.Tree(
				new erilex.tree.ASTValueData(
					"modify", 
					"modify")), 
			i0, 
			i1, 
			i2);
		this.i0=i0;
		this.i1=i1;
		this.i2=i2;
	}
	public java.lang.Object accept(
		final Visitor v, 
		final java.lang.String key) {
		return v.visit(key, 
			this);
	}
	public static <__t,__E> DmsgDmodify<__t,__E> modify(
		final Dmap<__t,__E> i0, 
		final Dmap<__t,__E> i1, 
		final Dmsg<__t,__E> i2) {
		return new DmsgDmodify<__t,__E>(
			i0, 
			i1, 
			i2);
	}
}
