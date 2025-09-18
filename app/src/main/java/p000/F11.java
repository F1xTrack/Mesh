package p000;

/* loaded from: classes.dex */
public final class F11 extends AbstractC1571Yy {

    /* renamed from: a */
    public I11 f3014a;

    /* renamed from: b */
    public Object f3015b;

    /* renamed from: c */
    public Object f3016c;

    /* renamed from: d */
    public /* synthetic */ Object f3017d;

    /* renamed from: e */
    public final /* synthetic */ I11 f3018e;

    /* renamed from: f */
    public int f3019f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F11(I11 i11, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f3018e = i11;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f3017d = obj;
        this.f3019f |= Integer.MIN_VALUE;
        return this.f3018e.m3729i(null, null, this);
    }
}
