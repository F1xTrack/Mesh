package com.p018my.tracker.obfuscated;

import android.net.Uri;

/* renamed from: com.my.tracker.obfuscated.a3 */
/* loaded from: classes2.dex */
public abstract class AbstractC2293a3 {
    /* renamed from: a */
    public static String m12784a(String str, String str2) {
        Uri.Builder builderEncodedAuthority = new Uri.Builder().scheme("https").encodedAuthority(str);
        if (str2 != null) {
            builderEncodedAuthority.appendEncodedPath(str2);
        }
        return builderEncodedAuthority.toString();
    }

    /* renamed from: a */
    public static String m12785a(String str, String str2, String str3) {
        return m12784a(str + "." + str2, str3);
    }
}
