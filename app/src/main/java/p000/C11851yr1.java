package p000;

/* renamed from: yr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11851yr1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f46519a;

    /* renamed from: b */
    public final /* synthetic */ C7765Ir1 f46520b;

    /* renamed from: c */
    public int f46521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11851yr1(C7765Ir1 c7765Ir1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f46520b = c7765Ir1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f46519a = obj;
        this.f46521c |= Integer.MIN_VALUE;
        return this.f46520b.m4053d(this);
    }
}
