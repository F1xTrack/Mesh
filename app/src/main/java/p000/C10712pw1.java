package p000;

/* renamed from: pw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10712pw1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f40442a;

    /* renamed from: b */
    public final /* synthetic */ C7397Bp1 f40443b;

    /* renamed from: c */
    public int f40444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10712pw1(C7397Bp1 c7397Bp1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f40443b = c7397Bp1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f40442a = obj;
        this.f40444c |= Integer.MIN_VALUE;
        Object objM888e = this.f40443b.m888e(null, null, this);
        return objM888e == EnumC0817Mz.f7418a ? objM888e : new PS0(objM888e);
    }
}
