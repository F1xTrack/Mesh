package p000;

/* renamed from: iq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9804iq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C8387Uq1 f34760a;

    /* renamed from: b */
    public /* synthetic */ Object f34761b;

    /* renamed from: c */
    public final /* synthetic */ C8387Uq1 f34762c;

    /* renamed from: d */
    public int f34763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9804iq1(C8387Uq1 c8387Uq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f34762c = c8387Uq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f34761b = obj;
        this.f34763d |= Integer.MIN_VALUE;
        return this.f34762c.m8188b(null, this);
    }
}
