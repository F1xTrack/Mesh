package defpackage;

/* renamed from: Xs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1869Xs1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C5826m71 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1869Xs1(C5826m71 c5826m71, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c5826m71;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objD = this.b.d(null, this);
        return objD == EnumC1030Mz.a ? objD : new PS0(objD);
    }
}
