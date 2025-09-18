package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C5142l1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class r implements InterfaceC5141l0 {
    public String a;
    public String b;
    public CopyOnWriteArraySet c;
    public CopyOnWriteArraySet d;
    public HashMap e;

    public r(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.a.equals(rVar.a) && this.b.equals(rVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("name").d(this.a);
        a0.u("version").d(this.b);
        CopyOnWriteArraySet copyOnWriteArraySet = this.c;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = (CopyOnWriteArraySet) C5142l1.v().b;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.d;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = (CopyOnWriteArraySet) C5142l1.v().a;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            a0.u("packages").r(iLogger, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            a0.u("integrations").r(iLogger, copyOnWriteArraySet2);
        }
        HashMap map = this.e;
        if (map != null) {
            for (String str : map.keySet()) {
                a0.u(str).r(iLogger, this.e.get(str));
            }
        }
        a0.j();
    }
}
