package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Be extends O7 {
    @Override // io.appmetrica.analytics.impl.O7
    public final boolean a(He he, He he2) {
        if (he.c) {
            return !he2.c || ((Number) this.a.a(he.e)).intValue() > ((Number) this.a.a(he2.e)).intValue();
        }
        return false;
    }
}
