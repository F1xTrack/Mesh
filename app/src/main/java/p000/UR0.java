package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class UR0 {

    /* renamed from: a */
    public final Set f11786a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final HashSet f11787b = new HashSet();

    /* renamed from: c */
    public boolean f11788c;

    /* renamed from: a */
    public final boolean m8016a(InterfaceC10905rR0 interfaceC10905rR0) {
        boolean z = true;
        if (interfaceC10905rR0 == null) {
            return true;
        }
        boolean zRemove = this.f11786a.remove(interfaceC10905rR0);
        if (!this.f11787b.remove(interfaceC10905rR0) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC10905rR0.clear();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.f11786a.size());
        sb.append(", isPaused=");
        return AbstractC7222ym.m26236m(sb, this.f11788c, "}");
    }
}
