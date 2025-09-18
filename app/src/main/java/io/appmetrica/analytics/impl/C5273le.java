package io.appmetrica.analytics.impl;

import android.content.Context;
import p000.AbstractC1374Vq;
import p000.F91;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.le */
/* loaded from: classes2.dex */
public final class C5273le implements InterfaceC4394Bc {

    /* renamed from: a */
    public final Context f32147a;

    /* renamed from: b */
    public final String f32148b;

    /* renamed from: c */
    public final String f32149c;

    public C5273le(Context context, String str, String str2) {
        this.f32147a = context;
        this.f32148b = str;
        this.f32149c = str2;
    }

    /* renamed from: a */
    public final C5273le m20692a(Context context, String str, String str2) {
        return new C5273le(context, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5273le)) {
            return false;
        }
        C5273le c5273le = (C5273le) obj;
        return O90.m5963a(this.f32147a, c5273le.f32147a) && O90.m5963a(this.f32148b, c5273le.f32148b) && O90.m5963a(this.f32149c, c5273le.f32149c);
    }

    public final int hashCode() {
        return this.f32149c.hashCode() + AbstractC1374Vq.m8586e(this.f32147a.hashCode() * 31, 31, this.f32148b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreferencesBasedModuleEntryPoint(context=");
        sb.append(this.f32147a);
        sb.append(", prefName=");
        sb.append(this.f32148b);
        sb.append(", prefValueName=");
        return F91.m2539v(sb, this.f32149c, ')');
    }

    /* renamed from: a */
    public static C5273le m20691a(C5273le c5273le, Context context, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            context = c5273le.f32147a;
        }
        if ((i & 2) != 0) {
            str = c5273le.f32148b;
        }
        if ((i & 4) != 0) {
            str2 = c5273le.f32149c;
        }
        c5273le.getClass();
        return new C5273le(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4394Bc
    /* renamed from: a */
    public final String mo19232a() {
        String string = this.f32147a.getSharedPreferences(this.f32148b, 0).getString(this.f32149c, "");
        return string == null ? "" : string;
    }
}
