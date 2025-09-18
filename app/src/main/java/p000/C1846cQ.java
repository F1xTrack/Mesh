package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: cQ */
/* loaded from: classes2.dex */
public final class C1846cQ implements InterfaceC11186td1, Cloneable {

    /* renamed from: c */
    public static final C1846cQ f17468c;

    /* renamed from: a */
    public List f17469a;

    /* renamed from: b */
    public List f17470b;

    static {
        C1846cQ c1846cQ = new C1846cQ();
        c1846cQ.f17469a = Collections.emptyList();
        c1846cQ.f17470b = Collections.emptyList();
        f17468c = c1846cQ;
    }

    /* renamed from: c */
    public static boolean m10694c(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // p000.InterfaceC11186td1
    /* renamed from: a */
    public final AbstractC10930rd1 mo1562a(C1753aw c1753aw, C11698xe1 c11698xe1) {
        boolean z;
        boolean z2;
        boolean zM10694c = m10694c(c11698xe1.f45725a);
        if (zM10694c) {
            z = true;
        } else {
            m10695b(true);
            z = false;
        }
        if (zM10694c) {
            z2 = true;
        } else {
            m10695b(false);
            z2 = false;
        }
        if (z || z2) {
            return new C1663aQ(this, z2, z, c1753aw, c11698xe1);
        }
        return null;
    }

    /* renamed from: b */
    public final void m10695b(boolean z) {
        Iterator it = (z ? this.f17469a : this.f17470b).iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
    }

    public final Object clone() {
        try {
            return (C1846cQ) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
