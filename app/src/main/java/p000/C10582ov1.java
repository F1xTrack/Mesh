package p000;

/* renamed from: ov1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10582ov1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f39360a;

    /* renamed from: b */
    public final /* synthetic */ C10919rY0 f39361b;

    /* renamed from: c */
    public int f39362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10582ov1(C10919rY0 c10919rY0, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f39361b = c10919rY0;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f39360a = obj;
        this.f39362c |= Integer.MIN_VALUE;
        Object objM24417a = this.f39361b.m24417a(null, this);
        return objM24417a == EnumC0817Mz.f7418a ? objM24417a : new PS0(objM24417a);
    }
}
