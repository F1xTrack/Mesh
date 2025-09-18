package defpackage;

/* renamed from: uW */
/* loaded from: classes2.dex */
public final class C7426uW extends AbstractC1963Yy {
    public C7617vW a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C7617vW c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7426uW(C7617vW c7617vW, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.c = c7617vW;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
