package p000;

/* renamed from: ls1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10192ls1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f37329a;

    /* renamed from: b */
    public final /* synthetic */ C8071Oo1 f37330b;

    /* renamed from: c */
    public int f37331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10192ls1(C8071Oo1 c8071Oo1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f37330b = c8071Oo1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f37329a = obj;
        this.f37331c |= Integer.MIN_VALUE;
        Object objMo6148b = this.f37330b.mo6148b(null, this);
        return objMo6148b == EnumC0817Mz.f7418a ? objMo6148b : new PS0(objMo6148b);
    }
}
