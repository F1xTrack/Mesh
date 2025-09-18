package defpackage;

/* renamed from: ou1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6355ou1 extends AbstractC1963Yy {
    public HS0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C2407bs1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6355ou1(C2407bs1 c2407bs1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.c = c2407bs1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objC = this.c.c(null, this);
        return objC == EnumC1030Mz.a ? objC : new PS0(objC);
    }
}
