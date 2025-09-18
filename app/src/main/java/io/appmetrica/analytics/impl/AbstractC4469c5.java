package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4469c5 {
    public final C4567g5 a;
    public final String b = "[ComponentMigrationToV113]";

    public AbstractC4469c5(C4567g5 c4567g5) {
        this.a = c4567g5;
    }

    public final C4567g5 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public abstract boolean b(int i);

    public abstract void c();

    public final void a(int i) {
        if (b(i)) {
            c();
        }
    }
}
