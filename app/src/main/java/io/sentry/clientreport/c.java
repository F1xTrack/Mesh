package io.sentry.clientreport;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c {
    public final String a;
    public final String b;

    public c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return io.sentry.config.a.f(this.a, cVar.a) && io.sentry.config.a.f(this.b, cVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
