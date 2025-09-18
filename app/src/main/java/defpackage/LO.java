package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class LO implements InterfaceC7916x5 {
    public static final LO a = new LO();

    @Override // defpackage.InterfaceC7916x5
    public final W21 e() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.InterfaceC7916x5
    public final KX f() {
        InterfaceC7492us interfaceC7492usD = AbstractC7384uI.d(this);
        if (interfaceC7492usD == null) {
            return null;
        }
        if (C5496kP.f(interfaceC7492usD)) {
            interfaceC7492usD = null;
        }
        if (interfaceC7492usD != null) {
            return AbstractC7384uI.c(interfaceC7492usD);
        }
        return null;
    }

    @Override // defpackage.InterfaceC7916x5
    public final Map g() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.InterfaceC7916x5
    public final AbstractC0663Ig0 getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
