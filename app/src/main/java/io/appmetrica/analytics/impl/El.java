package io.appmetrica.analytics.impl;

import defpackage.AbstractC8235ym;

/* loaded from: classes2.dex */
public final class El {
    public final int a;

    public El(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof El) && this.a == ((El) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return AbstractC8235ym.l(new StringBuilder("StartupUpdateConfig(intervalSeconds="), this.a, ')');
    }
}
