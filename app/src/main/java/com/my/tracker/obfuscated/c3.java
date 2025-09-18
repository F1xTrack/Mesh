package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class c3 {
    private static volatile String a;

    public static String a(Context context) {
        String strK = a;
        if (strK == null) {
            synchronized (c3.class) {
                try {
                    strK = a;
                    if (strK == null) {
                        strK = q1.a(context).k();
                        if (TextUtils.isEmpty(strK)) {
                            strK = UUID.randomUUID().toString();
                            q1.a(context).k(strK);
                            a = strK;
                        }
                    }
                } finally {
                }
            }
        }
        return strK;
    }
}
