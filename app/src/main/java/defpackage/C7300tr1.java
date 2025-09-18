package defpackage;

/* renamed from: tr1 */
/* loaded from: classes2.dex */
public final class C7300tr1 extends AbstractC1963Yy {
    public Object a;
    public C1091Nt0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1320Qr1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7300tr1(C1320Qr1 c1320Qr1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c1320Qr1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
