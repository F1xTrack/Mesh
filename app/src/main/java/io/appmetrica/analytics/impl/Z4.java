package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* loaded from: classes2.dex */
public class Z4 {
    public final String a;
    public final String b;

    public Z4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.b);
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.a + "_" + ApiKeyUtils.createPartialApiKey(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Z4 z4 = (Z4) obj;
        String str = this.a;
        if (str == null ? z4.a != null : !str.equals(z4.a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = z4.b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.a + "_" + this.b;
    }
}
