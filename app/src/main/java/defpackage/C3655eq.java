package defpackage;

/* renamed from: eq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3655eq implements InterfaceC0443Fl {
    public final /* synthetic */ C4037gq a;

    public void a() {
        C4037gq c4037gq = this.a;
        synchronized (c4037gq.a) {
            try {
                if (c4037gq.i == 5) {
                    c4037gq.o(c4037gq.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        String str;
        C4037gq c4037gq = this.a;
        synchronized (c4037gq.a) {
            AbstractC3377dM1.i(c4037gq.k == null, "Release completer expected to be null");
            c4037gq.k = c0365El;
            str = "Release[session=" + c4037gq + "]";
        }
        return str;
    }
}
