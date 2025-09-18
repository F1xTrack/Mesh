package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.os.Build;

/* renamed from: com.my.tracker.obfuscated.n1 */
/* loaded from: classes2.dex */
public abstract class AbstractC2346n1 {

    /* renamed from: a */
    public static final boolean f20061a;

    /* renamed from: b */
    public static final boolean f20062b;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        f20061a = i <= 30;
        if (i <= 30 && !Build.MODEL.equals("Pixel 5")) {
            z = true;
        }
        f20062b = z;
    }

    /* renamed from: a */
    public static boolean m13339a() {
        return false;
    }

    /* renamed from: a */
    public static boolean m13340a(String str, Context context) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
