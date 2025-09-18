package p000;

/* renamed from: gw1 */
/* loaded from: classes2.dex */
public final class C9560gw1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f28108a;

    /* renamed from: b */
    public final /* synthetic */ A61 f28109b;

    /* renamed from: c */
    public int f28110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9560gw1(A61 a61, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f28109b = a61;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f28108a = obj;
        this.f28110c |= Integer.MIN_VALUE;
        Object objM54a = this.f28109b.m54a(null, this);
        return objM54a == EnumC0817Mz.f7418a ? objM54a : new PS0(objM54a);
    }
}
