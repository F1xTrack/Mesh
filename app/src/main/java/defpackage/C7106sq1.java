package defpackage;

/* renamed from: sq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7106sq1 extends AbstractC1963Yy {
    public C0070Aq1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C0070Aq1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7106sq1(C0070Aq1 c0070Aq1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = c0070Aq1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(this);
    }
}
