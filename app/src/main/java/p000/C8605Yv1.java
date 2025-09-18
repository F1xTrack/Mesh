package p000;

/* renamed from: Yv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8605Yv1 extends AbstractC1571Yy {

    /* renamed from: a */
    public T71 f14614a;

    /* renamed from: b */
    public String f14615b;

    /* renamed from: c */
    public /* synthetic */ Object f14616c;

    /* renamed from: d */
    public final /* synthetic */ T71 f14617d;

    /* renamed from: e */
    public int f14618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8605Yv1(T71 t71, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f14617d = t71;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f14616c = obj;
        this.f14618e |= Integer.MIN_VALUE;
        return this.f14617d.m7571j(null, this);
    }
}
