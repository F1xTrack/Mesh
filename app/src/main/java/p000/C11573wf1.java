package p000;

/* renamed from: wf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11573wf1 extends AbstractC11700xf1 {

    /* renamed from: b */
    public final /* synthetic */ int f45020b;

    /* renamed from: c */
    public final /* synthetic */ C11827yf1 f45021c;

    /* renamed from: d */
    public final Object f45022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11573wf1(C11827yf1 c11827yf1, int i, Object obj, int i2) {
        super(i);
        this.f45020b = i2;
        this.f45021c = c11827yf1;
        this.f45022d = obj;
    }

    @Override // p000.InterfaceC11318uf1
    public final void execute() {
        switch (this.f45020b) {
            case 0:
                this.f45021c.f46385b.updateProperties(this.f45729a, (NM0) this.f45022d);
                break;
            default:
                this.f45021c.f46385b.updateViewExtraData(this.f45729a, (C8972cN0) this.f45022d);
                break;
        }
    }
}
