package p000;

/* renamed from: qr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10830qr1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C8389Ur1 f41213a;

    /* renamed from: b */
    public boolean f41214b;

    /* renamed from: c */
    public /* synthetic */ Object f41215c;

    /* renamed from: d */
    public final /* synthetic */ C8389Ur1 f41216d;

    /* renamed from: e */
    public int f41217e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10830qr1(C8389Ur1 c8389Ur1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f41216d = c8389Ur1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f41215c = obj;
        this.f41217e |= Integer.MIN_VALUE;
        return this.f41216d.m8195a(false, this);
    }
}
