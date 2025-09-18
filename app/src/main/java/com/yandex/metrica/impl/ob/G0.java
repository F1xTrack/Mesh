package com.yandex.metrica.impl.ob;

import defpackage.NX;

/* loaded from: classes2.dex */
public final class G0 {
    private final long a;

    public G0(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof G0) && this.a == ((G0) obj).a;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return NX.i(new StringBuilder("EasyCollectingConfig(firstLaunchDelaySeconds="), this.a, ")");
    }
}
