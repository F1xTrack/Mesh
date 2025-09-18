package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ab */
/* loaded from: classes2.dex */
public final class C4995ab extends JSONObject {
    public C4995ab() {
    }

    /* renamed from: a */
    public final Long m20118a(String str) {
        try {
            return Long.valueOf(getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final String m20119b(String str) {
        if (has(str)) {
            try {
                return getString(str);
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public C4995ab(String str) {
        super(str);
    }
}
