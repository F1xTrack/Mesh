package defpackage;

/* renamed from: Su1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1485Su1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C5996n11 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1485Su1(C5996n11 c5996n11, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c5996n11;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objC = this.b.c(null, this);
        return objC == EnumC1030Mz.a ? objC : new PS0(objC);
    }
}
