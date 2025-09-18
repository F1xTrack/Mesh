package defpackage;

/* loaded from: classes.dex */
public final class JY0 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ C7617vW c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JY0(C7617vW c7617vW, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.c = c7617vW;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
