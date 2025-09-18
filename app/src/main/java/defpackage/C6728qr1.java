package defpackage;

/* renamed from: qr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6728qr1 extends AbstractC1963Yy {
    public C1632Ur1 a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1632Ur1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6728qr1(C1632Ur1 c1632Ur1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c1632Ur1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(false, this);
    }
}
