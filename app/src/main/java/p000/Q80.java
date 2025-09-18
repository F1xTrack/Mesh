package p000;

/* loaded from: classes.dex */
public final class Q80 extends AbstractC1571Yy {

    /* renamed from: a */
    public Object f9490a;

    /* renamed from: b */
    public /* synthetic */ Object f9491b;

    /* renamed from: c */
    public final /* synthetic */ C10212m12 f9492c;

    /* renamed from: d */
    public int f9493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q80(C10212m12 c10212m12, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f9492c = c10212m12;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f9491b = obj;
        this.f9493d |= Integer.MIN_VALUE;
        return this.f9492c.m22632b(null, this);
    }
}
