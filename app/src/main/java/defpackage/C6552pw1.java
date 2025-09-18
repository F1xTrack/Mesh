package defpackage;

/* renamed from: pw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6552pw1 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0145Bp1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6552pw1(C0145Bp1 c0145Bp1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.b = c0145Bp1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objE = this.b.e(null, null, this);
        return objE == EnumC1030Mz.a ? objE : new PS0(objE);
    }
}
