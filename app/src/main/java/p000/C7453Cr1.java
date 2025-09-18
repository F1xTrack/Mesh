package p000;

/* renamed from: Cr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7453Cr1 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f1729a;

    /* renamed from: b */
    public final /* synthetic */ C7765Ir1 f1730b;

    /* renamed from: c */
    public int f1731c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7453Cr1(C7765Ir1 c7765Ir1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f1730b = c7765Ir1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f1729a = obj;
        this.f1731c |= Integer.MIN_VALUE;
        return this.f1730b.m4050a(this);
    }
}
