package defpackage;

/* renamed from: uq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7488uq1 extends AbstractC1963Yy {
    public C0070Aq1 a;
    public Object b;
    public Object c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C0070Aq1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7488uq1(C0070Aq1 c0070Aq1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.f = c0070Aq1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.h(null, this);
    }
}
