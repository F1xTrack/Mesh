package p000;

/* renamed from: Rv1 */
/* loaded from: classes2.dex */
public final class C8241Rv1 extends AbstractC1571Yy {

    /* renamed from: a */
    public Object f10483a;

    /* renamed from: b */
    public int f10484b;

    /* renamed from: c */
    public /* synthetic */ Object f10485c;

    /* renamed from: d */
    public final /* synthetic */ C8397Uv1 f10486d;

    /* renamed from: e */
    public int f10487e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8241Rv1(C8397Uv1 c8397Uv1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f10486d = c8397Uv1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f10485c = obj;
        this.f10487e |= Integer.MIN_VALUE;
        return this.f10486d.m8201a(0, this);
    }
}
