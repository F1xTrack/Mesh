package io.appmetrica.analytics.networktasks.impl;

import android.net.Uri;

/* renamed from: io.appmetrica.analytics.networktasks.impl.c */
/* loaded from: classes2.dex */
public final class C5678c {

    /* renamed from: a */
    public final String f33088a;

    public C5678c(String str) {
        this.f33088a = m21292a(str);
    }

    /* renamed from: a */
    public static String m21292a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Uri uri = Uri.parse(str);
        return "http".equals(uri.getScheme()) ? uri.buildUpon().scheme("https").build().toString() : str;
    }
}
