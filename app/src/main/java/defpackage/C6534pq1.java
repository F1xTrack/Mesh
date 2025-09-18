package defpackage;

/* renamed from: pq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6534pq1 extends AbstractC1963Yy {
    public C0070Aq1 a;
    public String b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C0070Aq1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6534pq1(C0070Aq1 c0070Aq1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.e = c0070Aq1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
