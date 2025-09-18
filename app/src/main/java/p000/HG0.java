package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class HG0 implements InterfaceC6894tZ {
    /* renamed from: a */
    public static DG0 m3338a(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrM3339b = m3339b(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrM3339b2 = m3339b(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        AbstractC7806Jm0.m4412f("QuirkSettingsLoader");
        AbstractC7806Jm0.m4412f("QuirkSettingsLoader");
        Arrays.toString(strArrM3339b);
        AbstractC7806Jm0.m4412f("QuirkSettingsLoader");
        Arrays.toString(strArrM3339b2);
        AbstractC7806Jm0.m4412f("QuirkSettingsLoader");
        return new DG0(z, new HashSet(m3340c(strArrM3339b)), new HashSet(m3340c(strArrM3339b2)));
    }

    /* renamed from: b */
    public static String[] m3339b(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            AbstractC7806Jm0.m4412f("QuirkSettingsLoader");
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException unused) {
            AbstractC7806Jm0.m4412f("QuirkSettingsLoader");
            return new String[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0027 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashSet m3340c(java.lang.String[] r6) throws java.lang.ClassNotFoundException {
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
            java.lang.Class<CG0> r5 = p000.CG0.class
            boolean r5 = r5.isAssignableFrom(r3)     // Catch: java.lang.ClassNotFoundException -> L1e
            if (r5 == 0) goto L1a
            goto L22
        L1a:
            p000.AbstractC7806Jm0.m4412f(r4)     // Catch: java.lang.ClassNotFoundException -> L1e
            goto L21
        L1e:
            p000.AbstractC7806Jm0.m4412f(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.HG0.m3340c(java.lang.String[]):java.util.HashSet");
    }
}
