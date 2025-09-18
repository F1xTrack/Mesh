package p000;

/* renamed from: oq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10572oq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C8387Uq1 f39301a;

    /* renamed from: b */
    public /* synthetic */ Object f39302b;

    /* renamed from: c */
    public final /* synthetic */ C8387Uq1 f39303c;

    /* renamed from: d */
    public int f39304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10572oq1(C8387Uq1 c8387Uq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f39303c = c8387Uq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f39302b = obj;
        this.f39304d |= Integer.MIN_VALUE;
        return this.f39303c.m8191e(this);
    }
}
