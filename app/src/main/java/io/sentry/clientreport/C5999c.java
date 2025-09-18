package io.sentry.clientreport;

import io.sentry.config.AbstractC6003a;
import java.util.Arrays;

/* renamed from: io.sentry.clientreport.c */
/* loaded from: classes2.dex */
public final class C5999c {

    /* renamed from: a */
    public final String f34116a;

    /* renamed from: b */
    public final String f34117b;

    public C5999c(String str, String str2) {
        this.f34116a = str;
        this.f34117b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5999c)) {
            return false;
        }
        C5999c c5999c = (C5999c) obj;
        return AbstractC6003a.m21747f(this.f34116a, c5999c.f34116a) && AbstractC6003a.m21747f(this.f34117b, c5999c.f34117b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34116a, this.f34117b});
    }
}
