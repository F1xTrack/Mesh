package defpackage;

/* renamed from: ts1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7303ts1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0622Hs1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7303ts1(C0622Hs1 c0622Hs1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c0622Hs1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
