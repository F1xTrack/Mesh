package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ab, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4425ab extends JSONObject {
    public C4425ab() {
    }

    public final Long a(String str) {
        try {
            return Long.valueOf(getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String b(String str) {
        if (has(str)) {
            try {
                return getString(str);
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public C4425ab(String str) {
        super(str);
    }
}
