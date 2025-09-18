package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.AbstractC1705Vq;
import defpackage.F91;
import defpackage.O90;

/* renamed from: io.appmetrica.analytics.impl.le */
/* loaded from: classes2.dex */
public final class C4695le implements Bc {
    public final Context a;
    public final String b;
    public final String c;

    public C4695le(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    public final C4695le a(Context context, String str, String str2) {
        return new C4695le(context, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4695le)) {
            return false;
        }
        C4695le c4695le = (C4695le) obj;
        return O90.a(this.a, c4695le.a) && O90.a(this.b, c4695le.b) && O90.a(this.c, c4695le.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1705Vq.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreferencesBasedModuleEntryPoint(context=");
        sb.append(this.a);
        sb.append(", prefName=");
        sb.append(this.b);
        sb.append(", prefValueName=");
        return F91.v(sb, this.c, ')');
    }

    public static C4695le a(C4695le c4695le, Context context, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            context = c4695le.a;
        }
        if ((i & 2) != 0) {
            str = c4695le.b;
        }
        if ((i & 4) != 0) {
            str2 = c4695le.c;
        }
        c4695le.getClass();
        return new C4695le(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Bc
    public final String a() {
        String string = this.a.getSharedPreferences(this.b, 0).getString(this.c, "");
        return string == null ? "" : string;
    }
}
