package io.appmetrica.analytics.impl;

import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.nb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4740nb implements Ea {
    public final Ea a;

    public C4740nb(Ea ea) {
        this.a = ea;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Ea a(String str, String str2) {
        this.a.a(str, str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final void b() {
        this.a.b();
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final boolean getBoolean(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final int getInt(String str, int i) {
        return this.a.getInt(str, i);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final long getLong(String str, long j) {
        return this.a.getLong(str, j);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final String getString(String str, String str2) {
        return this.a.getString(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Ea remove(String str) {
        this.a.remove(str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Ea a(String str, long j) {
        this.a.a(str, j);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Ea a(int i, String str) {
        this.a.a(i, str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Ea a(String str, boolean z) {
        this.a.a(str, z);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Ea a(String str, float f) {
        this.a.a(str, f);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final boolean a(String str) {
        return this.a.a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Set a() {
        return this.a.a();
    }
}
