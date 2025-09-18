package p000;

/* renamed from: rq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10956rq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C8387Uq1 f41928a;

    /* renamed from: b */
    public /* synthetic */ Object f41929b;

    /* renamed from: c */
    public final /* synthetic */ C8387Uq1 f41930c;

    /* renamed from: d */
    public int f41931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10956rq1(C8387Uq1 c8387Uq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f41930c = c8387Uq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f41929b = obj;
        this.f41931d |= Integer.MIN_VALUE;
        return this.f41930c.m8190d(null, this);
    }
}
