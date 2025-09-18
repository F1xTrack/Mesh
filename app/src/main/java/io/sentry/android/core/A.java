package io.sentry.android.core;

/* loaded from: classes2.dex */
public final class A {
    public static final A b;
    public Boolean a;

    static {
        A a = new A();
        a.a = null;
        b = a;
    }

    public final synchronized void a(boolean z) {
        this.a = Boolean.valueOf(z);
    }
}
