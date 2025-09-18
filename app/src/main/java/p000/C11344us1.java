package p000;

/* renamed from: us1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11344us1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f43999a;

    /* renamed from: b */
    public final /* synthetic */ C8071Oo1 f44000b;

    /* renamed from: c */
    public int f44001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11344us1(C8071Oo1 c8071Oo1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f44000b = c8071Oo1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f43999a = obj;
        this.f44001c |= Integer.MIN_VALUE;
        Object objMo6150h = this.f44000b.mo6150h(null, null, this);
        return objMo6150h == EnumC0817Mz.f7418a ? objMo6150h : new PS0(objMo6150h);
    }
}
