package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.Wd */
/* loaded from: classes2.dex */
public class C3029Wd extends AbstractC3004Vd {
    public C3029Wd(String str) {
        super(m15389a(str));
    }

    /* renamed from: a */
    private static String m15389a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri uri = Uri.parse(str);
        return "http".equals(uri.getScheme()) ? uri.buildUpon().scheme("https").build().toString() : str;
    }
}
