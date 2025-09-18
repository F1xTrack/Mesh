package p000;

import java.util.Set;

/* loaded from: classes.dex */
public final class LS0 implements InterfaceC9859jG0 {

    /* renamed from: a */
    public final Set f6634a;

    /* renamed from: b */
    public final InterfaceC9859jG0 f6635b;

    public LS0(Set set, InterfaceC9859jG0 interfaceC9859jG0) {
        this.f6634a = set;
        this.f6635b = interfaceC9859jG0;
    }

    @Override // p000.InterfaceC9859jG0
    /* renamed from: a */
    public final void mo5003a(C6487nP c6487nP) {
        if (this.f6634a.contains(C0328FC.class)) {
            this.f6635b.mo5003a(c6487nP);
            return;
        }
        throw new C6838sg("Attempting to publish an undeclared event " + c6487nP + ".");
    }
}
