package p000;

/* loaded from: classes.dex */
public final class C11 extends AbstractC1571Yy {

    /* renamed from: a */
    public I11 f1143a;

    /* renamed from: b */
    public /* synthetic */ Object f1144b;

    /* renamed from: c */
    public final /* synthetic */ I11 f1145c;

    /* renamed from: d */
    public int f1146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11(I11 i11, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f1145c = i11;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f1144b = obj;
        this.f1146d |= Integer.MIN_VALUE;
        return this.f1145c.m3726f(this);
    }
}
