package p000;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class IR0 implements InterfaceC6855sx {

    /* renamed from: a */
    public final UR0 f4935a;

    /* renamed from: b */
    public final /* synthetic */ JR0 f4936b;

    public IR0(JR0 jr0, UR0 ur0) {
        this.f4936b = jr0;
        this.f4935a = ur0;
    }

    @Override // p000.InterfaceC6855sx
    /* renamed from: a */
    public final void mo3861a(boolean z) {
        if (z) {
            synchronized (this.f4936b) {
                UR0 ur0 = this.f4935a;
                Iterator it = AbstractC7381Bh1.m806e(ur0.f11786a).iterator();
                while (it.hasNext()) {
                    InterfaceC10905rR0 interfaceC10905rR0 = (InterfaceC10905rR0) it.next();
                    if (!interfaceC10905rR0.mo4126k() && !interfaceC10905rR0.mo4124i()) {
                        interfaceC10905rR0.clear();
                        if (ur0.f11788c) {
                            ur0.f11787b.add(interfaceC10905rR0);
                        } else {
                            interfaceC10905rR0.mo4125j();
                        }
                    }
                }
            }
        }
    }
}
