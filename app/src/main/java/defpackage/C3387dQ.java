package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: dQ */
/* loaded from: classes.dex */
public final class C3387dQ implements InterfaceC7449ud1, Cloneable {
    public static final C3387dQ c;
    public List a;
    public List b;

    static {
        C3387dQ c3387dQ = new C3387dQ();
        c3387dQ.a = Collections.emptyList();
        c3387dQ.b = Collections.emptyList();
        c = c3387dQ;
    }

    public static boolean c(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // defpackage.InterfaceC7449ud1
    public final AbstractC7067sd1 a(C3504e20 c3504e20, C8213ye1 c8213ye1) {
        boolean z;
        boolean zC = c(c8213ye1.a);
        boolean z2 = false;
        if (zC) {
            z = true;
        } else {
            b(true);
            z = false;
        }
        if (zC) {
            z2 = true;
        } else {
            b(false);
        }
        if (z || z2) {
            return new C2321bQ(this, z, c3504e20, c8213ye1);
        }
        return null;
    }

    public final void b(boolean z) {
        Iterator it = (z ? this.a : this.b).iterator();
        if (it.hasNext()) {
            throw AbstractC8235ym.d(it);
        }
    }

    public final Object clone() {
        try {
            return (C3387dQ) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
