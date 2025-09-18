package p000;

/* renamed from: wr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11597wr1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C7765Ir1 f45145a;

    /* renamed from: b */
    public /* synthetic */ Object f45146b;

    /* renamed from: c */
    public final /* synthetic */ C7765Ir1 f45147c;

    /* renamed from: d */
    public int f45148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11597wr1(C7765Ir1 c7765Ir1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f45147c = c7765Ir1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f45146b = obj;
        this.f45148d |= Integer.MIN_VALUE;
        return this.f45147c.m4054e(this);
    }
}
