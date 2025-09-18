package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* renamed from: io.appmetrica.analytics.impl.Z4 */
/* loaded from: classes2.dex */
public class C4964Z4 {

    /* renamed from: a */
    public final String f31144a;

    /* renamed from: b */
    public final String f31145b;

    public C4964Z4(String str, String str2) {
        this.f31144a = str;
        this.f31145b = str2;
    }

    /* renamed from: a */
    public final String m20054a() {
        return ApiKeyUtils.createPartialApiKey(this.f31145b);
    }

    /* renamed from: b */
    public final String m20055b() {
        return this.f31145b;
    }

    /* renamed from: c */
    public final String m20056c() {
        return this.f31144a;
    }

    /* renamed from: d */
    public boolean mo20057d() {
        return false;
    }

    /* renamed from: e */
    public String mo20058e() {
        return this.f31144a + "_" + ApiKeyUtils.createPartialApiKey(this.f31145b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4964Z4 c4964z4 = (C4964Z4) obj;
        String str = this.f31144a;
        if (str == null ? c4964z4.f31144a != null : !str.equals(c4964z4.f31144a)) {
            return false;
        }
        String str2 = this.f31145b;
        String str3 = c4964z4.f31145b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        String str = this.f31144a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31145b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f31144a + "_" + this.f31145b;
    }
}
