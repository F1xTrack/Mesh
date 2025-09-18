package p000;

/* renamed from: Dr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7505Dr1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f2280a;

    /* renamed from: b */
    public final /* synthetic */ C7765Ir1 f2281b;

    /* renamed from: c */
    public int f2282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7505Dr1(C7765Ir1 c7765Ir1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f2281b = c7765Ir1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f2280a = obj;
        this.f2282c |= Integer.MIN_VALUE;
        return this.f2281b.m4056g(this);
    }
}
