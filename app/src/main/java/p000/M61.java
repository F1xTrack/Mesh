package p000;

/* loaded from: classes.dex */
public final /* synthetic */ class M61 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6995a;

    /* renamed from: b */
    public final /* synthetic */ Q61 f6996b;

    public /* synthetic */ M61(Q61 q61, int i) {
        this.f6995a = i;
        this.f6996b = q61;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6995a) {
            case 0:
                this.f6996b.mo6573a();
                break;
            case 1:
                this.f6996b.m18991b();
                break;
            default:
                Q61 q61 = this.f6996b;
                T61 t61 = q61.f9483r;
                if (t61 != null) {
                    t61.m7550m();
                }
                if (q61.f9482q == null) {
                    q61.f9481p.m2376c();
                    break;
                }
                break;
        }
    }
}
