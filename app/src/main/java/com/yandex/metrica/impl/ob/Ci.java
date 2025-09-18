package com.yandex.metrica.impl.ob;

import defpackage.AbstractC8235ym;

/* loaded from: classes2.dex */
public class Ci {
    public final int a;
    public final int b;

    public Ci(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ci.class != obj.getClass()) {
            return false;
        }
        Ci ci = (Ci) obj;
        return this.a == ci.a && this.b == ci.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RetryPolicyConfig{maxIntervalSeconds=");
        sb.append(this.a);
        sb.append(", exponentialMultiplier=");
        return AbstractC8235ym.l(sb, this.b, '}');
    }
}
