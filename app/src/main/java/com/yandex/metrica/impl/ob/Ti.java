package com.yandex.metrica.impl.ob;

import defpackage.AbstractC1705Vq;

/* loaded from: classes2.dex */
public final class Ti {
    private final int a;

    public Ti(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Ti) && this.a == ((Ti) obj).a;
        }
        return true;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return AbstractC1705Vq.j(new StringBuilder("StartupUpdateConfig(intervalSeconds="), this.a, ")");
    }
}
