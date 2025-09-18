package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class UR0 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final HashSet b = new HashSet();
    public boolean c;

    public final boolean a(InterfaceC6839rR0 interfaceC6839rR0) {
        boolean z = true;
        if (interfaceC6839rR0 == null) {
            return true;
        }
        boolean zRemove = this.a.remove(interfaceC6839rR0);
        if (!this.b.remove(interfaceC6839rR0) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC6839rR0.clear();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.a.size());
        sb.append(", isPaused=");
        return AbstractC8235ym.m(sb, this.c, "}");
    }
}
