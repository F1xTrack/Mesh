package p000;

/* renamed from: eq */
/* loaded from: classes.dex */
public final /* synthetic */ class C4015eq implements InterfaceC0363Fl {

    /* renamed from: a */
    public final /* synthetic */ C4141gq f26909a;

    /* renamed from: a */
    public void m18059a() {
        C4141gq c4141gq = this.f26909a;
        synchronized (c4141gq.f28040a) {
            try {
                if (c4141gq.f28048i == 5) {
                    c4141gq.m18660o(c4141gq.f28045f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        String str;
        C4141gq c4141gq = this.f26909a;
        synchronized (c4141gq.f28040a) {
            AbstractC9104dM1.m17550i(c4141gq.f28050k == null, "Release completer expected to be null");
            c4141gq.f28050k = c0300El;
            str = "Release[session=" + c4141gq + "]";
        }
        return str;
    }
}
