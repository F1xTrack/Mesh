package p000;

/* loaded from: classes.dex */
public final class B11 extends AbstractC1571Yy {

    /* renamed from: a */
    public I11 f518a;

    /* renamed from: b */
    public /* synthetic */ Object f519b;

    /* renamed from: c */
    public final /* synthetic */ I11 f520c;

    /* renamed from: d */
    public int f521d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B11(I11 i11, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f520c = i11;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f519b = obj;
        this.f521d |= Integer.MIN_VALUE;
        return this.f520c.m3725e(this);
    }
}
