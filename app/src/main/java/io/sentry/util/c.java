package io.sentry.util;

/* loaded from: classes2.dex */
public final class c {
    public volatile Object a = null;
    public final b b;

    public c(b bVar) {
        this.b = bVar;
    }

    public final Object a() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = this.b.c();
                    }
                } finally {
                }
            }
        }
        return this.a;
    }
}
