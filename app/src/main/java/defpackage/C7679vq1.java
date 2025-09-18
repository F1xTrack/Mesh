package defpackage;

/* renamed from: vq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7679vq1 extends AbstractC1963Yy {
    public C0070Aq1 a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0070Aq1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7679vq1(C0070Aq1 c0070Aq1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c0070Aq1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(null, this);
    }
}
