package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class HG0 implements InterfaceC7244tZ {
    public static DG0 a(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrB = b(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrB2 = b(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        AbstractC0759Jm0.f("QuirkSettingsLoader");
        AbstractC0759Jm0.f("QuirkSettingsLoader");
        Arrays.toString(strArrB);
        AbstractC0759Jm0.f("QuirkSettingsLoader");
        Arrays.toString(strArrB2);
        AbstractC0759Jm0.f("QuirkSettingsLoader");
        return new DG0(z, new HashSet(c(strArrB)), new HashSet(c(strArrB2)));
    }

    public static String[] b(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            AbstractC0759Jm0.f("QuirkSettingsLoader");
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException unused) {
            AbstractC0759Jm0.f("QuirkSettingsLoader");
            return new String[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashSet c(java.lang.String[] r6) throws java.lang.ClassNotFoundException {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L2a
            r3 = r6[r2]
            java.lang.String r4 = "QuirkSettingsLoader"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L1e
            java.lang.Class<CG0> r5 = defpackage.CG0.class
            boolean r5 = r5.isAssignableFrom(r3)     // Catch: java.lang.ClassNotFoundException -> L1e
            if (r5 == 0) goto L1a
            goto L22
        L1a:
            defpackage.AbstractC0759Jm0.f(r4)     // Catch: java.lang.ClassNotFoundException -> L1e
            goto L21
        L1e:
            defpackage.AbstractC0759Jm0.f(r4)
        L21:
            r3 = 0
        L22:
            if (r3 == 0) goto L27
            r0.add(r3)
        L27:
            int r2 = r2 + 1
            goto L7
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HG0.c(java.lang.String[]):java.util.HashSet");
    }
}
