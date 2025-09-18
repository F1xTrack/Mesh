package p000;

/* loaded from: classes.dex */
public final class SY0 extends AbstractC1571Yy {

    /* renamed from: a */
    public TY0 f10849a;

    /* renamed from: b */
    public /* synthetic */ Object f10850b;

    /* renamed from: c */
    public final /* synthetic */ TY0 f10851c;

    /* renamed from: d */
    public int f10852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SY0(TY0 ty0, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f10851c = ty0;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f10850b = obj;
        this.f10852d |= Integer.MIN_VALUE;
        return TY0.m7704a(this.f10851c, this);
    }
}
