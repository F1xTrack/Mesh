package p000;

/* renamed from: Xu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8551Xu1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C8083Ou1 f14044a;

    /* renamed from: b */
    public /* synthetic */ Object f14045b;

    /* renamed from: c */
    public final /* synthetic */ C8083Ou1 f14046c;

    /* renamed from: d */
    public int f14047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8551Xu1(C8083Ou1 c8083Ou1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f14046c = c8083Ou1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f14045b = obj;
        this.f14047d |= Integer.MIN_VALUE;
        return C8083Ou1.m6184b(this.f14046c, this);
    }
}
