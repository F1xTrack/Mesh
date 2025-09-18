package p000;

/* loaded from: classes.dex */
public final class RQ0 extends AbstractC1571Yy {

    /* renamed from: a */
    public Object f10170a;

    /* renamed from: b */
    public InterfaceC7924Lt0 f10171b;

    /* renamed from: c */
    public /* synthetic */ Object f10172c;

    /* renamed from: d */
    public final /* synthetic */ UQ0 f10173d;

    /* renamed from: e */
    public int f10174e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RQ0(UQ0 uq0, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f10173d = uq0;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f10172c = obj;
        this.f10174e |= Integer.MIN_VALUE;
        return this.f10173d.m8015d(this);
    }
}
