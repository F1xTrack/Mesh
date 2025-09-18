package p000;

/* renamed from: hf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9654hf1 extends AbstractC11700xf1 {

    /* renamed from: b */
    public final int f28517b;

    /* renamed from: c */
    public final boolean f28518c;

    /* renamed from: d */
    public final boolean f28519d;

    /* renamed from: e */
    public final /* synthetic */ C11827yf1 f28520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9654hf1(C11827yf1 c11827yf1, int i, int i2, boolean z, boolean z2) {
        super(i);
        this.f28520e = c11827yf1;
        this.f28517b = i2;
        this.f28519d = z;
        this.f28518c = z2;
    }

    @Override // p000.InterfaceC11318uf1
    public final void execute() {
        boolean z = this.f28519d;
        C11827yf1 c11827yf1 = this.f28520e;
        if (z) {
            c11827yf1.f46385b.clearJSResponder();
            return;
        }
        c11827yf1.f46385b.setJSResponder(this.f45729a, this.f28517b, this.f28518c);
    }
}
