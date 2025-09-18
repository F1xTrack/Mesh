package defpackage;

/* renamed from: or1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6346or1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C1086Nr1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6346or1(C1086Nr1 c1086Nr1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c1086Nr1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objC = this.b.c(this);
        return objC == EnumC1030Mz.a ? objC : new PS0(objC);
    }
}
