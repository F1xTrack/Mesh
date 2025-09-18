package defpackage;

/* renamed from: bw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2419bw1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0999Mo1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2419bw1(C0999Mo1 c0999Mo1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c0999Mo1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objM = this.b.m(null, null, this);
        return objM == EnumC1030Mz.a ? objM : new PS0(objM);
    }
}
