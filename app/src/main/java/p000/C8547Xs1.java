package p000;

/* renamed from: Xs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8547Xs1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f14030a;

    /* renamed from: b */
    public final /* synthetic */ C10226m71 f14031b;

    /* renamed from: c */
    public int f14032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8547Xs1(C10226m71 c10226m71, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f14031b = c10226m71;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f14030a = obj;
        this.f14032c |= Integer.MIN_VALUE;
        Object objM22679d = this.f14031b.m22679d(null, this);
        return objM22679d == EnumC0817Mz.f7418a ? objM22679d : new PS0(objM22679d);
    }
}
