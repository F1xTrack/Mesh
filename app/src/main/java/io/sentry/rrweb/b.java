package io.sentry.rrweb;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class b {
    public c a;
    public long b = System.currentTimeMillis();

    public b(c cVar) {
        this.a = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.b == bVar.b && this.a == bVar.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b)});
    }
}
