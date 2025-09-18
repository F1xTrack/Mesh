package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.my.tracker.obfuscated.c3 */
/* loaded from: classes2.dex */
public abstract class AbstractC2303c3 {

    /* renamed from: a */
    private static volatile String f19784a;

    /* renamed from: a */
    public static String m12811a(Context context) {
        String strM13436k = f19784a;
        if (strM13436k == null) {
            synchronized (AbstractC2303c3.class) {
                try {
                    strM13436k = f19784a;
                    if (strM13436k == null) {
                        strM13436k = C2358q1.m13407a(context).m13436k();
                        if (TextUtils.isEmpty(strM13436k)) {
                            strM13436k = UUID.randomUUID().toString();
                            C2358q1.m13407a(context).m13437k(strM13436k);
                            f19784a = strM13436k;
                        }
                    }
                } finally {
                }
            }
        }
        return strM13436k;
    }
}
