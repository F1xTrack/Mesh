package p000;

/* renamed from: or1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10574or1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f39308a;

    /* renamed from: b */
    public final /* synthetic */ C8025Nr1 f39309b;

    /* renamed from: c */
    public int f39310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10574or1(C8025Nr1 c8025Nr1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f39309b = c8025Nr1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f39308a = obj;
        this.f39310c |= Integer.MIN_VALUE;
        Object objMo4457c = this.f39309b.mo4457c(this);
        return objMo4457c == EnumC0817Mz.f7418a ? objMo4457c : new PS0(objMo4457c);
    }
}
