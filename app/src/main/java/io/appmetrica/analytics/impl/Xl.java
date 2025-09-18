package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes2.dex */
public final class Xl extends U2 {
    public Xl(int i, String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.a;
    }

    public Xl(int i, String str, PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.Hm
    public final String a(String str) {
        if (str != null) {
            int length = str.length();
            int i = this.a;
            if (length > i) {
                String strSubstring = str.substring(0, i);
                this.c.warning("\"%s\" %s size exceeded limit of %d characters", this.b, str, Integer.valueOf(this.a));
                return strSubstring;
            }
        }
        return str;
    }

    public final String a() {
        return this.b;
    }
}
