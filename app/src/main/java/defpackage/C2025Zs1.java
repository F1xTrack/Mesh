package defpackage;

/* renamed from: Zs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2025Zs1 extends AbstractC1963Yy {
    public U41 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ U41 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2025Zs1(U41 u41, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = u41;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.m(null, this);
    }
}
