package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: cQ */
/* loaded from: classes2.dex */
public final class C2511cQ implements InterfaceC7258td1, Cloneable {
    public static final C2511cQ c;
    public List a;
    public List b;

    static {
        C2511cQ c2511cQ = new C2511cQ();
        c2511cQ.a = Collections.emptyList();
        c2511cQ.b = Collections.emptyList();
        c = c2511cQ;
    }

    public static boolean c(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // defpackage.InterfaceC7258td1
    public final AbstractC6876rd1 a(C2226aw c2226aw, C8023xe1 c8023xe1) {
        boolean z;
        boolean z2;
        boolean zC = c(c8023xe1.a);
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
            z2 = false;
        }
        if (z || z2) {
            return new C2130aQ(this, z2, z, c2226aw, c8023xe1);
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
            return (C2511cQ) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
