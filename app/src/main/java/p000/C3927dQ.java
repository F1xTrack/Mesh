package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: dQ */
/* loaded from: classes.dex */
public final class C3927dQ implements InterfaceC11314ud1, Cloneable {

    /* renamed from: c */
    public static final C3927dQ f26057c;

    /* renamed from: a */
    public List f26058a;

    /* renamed from: b */
    public List f26059b;

    static {
        C3927dQ c3927dQ = new C3927dQ();
        c3927dQ.f26058a = Collections.emptyList();
        c3927dQ.f26059b = Collections.emptyList();
        f26057c = c3927dQ;
    }

    /* renamed from: c */
    public static boolean m17603c(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // p000.InterfaceC11314ud1
    /* renamed from: a */
    public final AbstractC11058sd1 mo2052a(C9189e20 c9189e20, C11825ye1 c11825ye1) {
        boolean z;
        boolean zM17603c = m17603c(c11825ye1.f46373a);
        boolean z2 = false;
        if (zM17603c) {
            z = true;
        } else {
            m17604b(true);
            z = false;
        }
        if (zM17603c) {
            z2 = true;
        } else {
            m17604b(false);
        }
        if (z || z2) {
            return new C1784bQ(this, z, c9189e20, c11825ye1);
        }
        return null;
    }

    /* renamed from: b */
    public final void m17604b(boolean z) {
        Iterator it = (z ? this.f26058a : this.f26059b).iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
    }

    public final Object clone() {
        try {
            return (C3927dQ) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
