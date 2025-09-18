package defpackage;

/* renamed from: wW */
/* loaded from: classes2.dex */
public final class C7807wW extends AbstractC1963Yy {
    public C7997xW a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C7997xW d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7807wW(C7997xW c7997xW, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.d = c7997xW;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
