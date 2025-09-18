package io.appmetrica.analytics.impl;

import p000.AbstractC7222ym;

/* renamed from: io.appmetrica.analytics.impl.El */
/* loaded from: classes2.dex */
public final class C4478El {

    /* renamed from: a */
    public final int f30111a;

    public C4478El(int i) {
        this.f30111a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4478El) && this.f30111a == ((C4478El) obj).f30111a;
    }

    public final int hashCode() {
        return this.f30111a;
    }

    public final String toString() {
        return AbstractC7222ym.m26235l(new StringBuilder("StartupUpdateConfig(intervalSeconds="), this.f30111a, ')');
    }
}
