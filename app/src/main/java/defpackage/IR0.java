package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class IR0 implements InterfaceC7125sx {
    public final UR0 a;
    public final /* synthetic */ JR0 b;

    public IR0(JR0 jr0, UR0 ur0) {
        this.b = jr0;
        this.a = ur0;
    }

    @Override // defpackage.InterfaceC7125sx
    public final void a(boolean z) {
        if (z) {
            synchronized (this.b) {
                UR0 ur0 = this.a;
                Iterator it = AbstractC0121Bh1.e(ur0.a).iterator();
                while (it.hasNext()) {
                    InterfaceC6839rR0 interfaceC6839rR0 = (InterfaceC6839rR0) it.next();
                    if (!interfaceC6839rR0.k() && !interfaceC6839rR0.i()) {
                        interfaceC6839rR0.clear();
                        if (ur0.c) {
                            ur0.b.add(interfaceC6839rR0);
                        } else {
                            interfaceC6839rR0.j();
                        }
                    }
                }
            }
        }
    }
}
