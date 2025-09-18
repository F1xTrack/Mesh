package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.util.PlatformVersion;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: pN1 */
/* loaded from: classes.dex */
public abstract class AbstractC10642pN1 {
    /* renamed from: a */
    public static InterfaceC7116x5 m23768a(InterfaceC0510I5 interfaceC0510I5, C0664KX c0664kx) {
        Object next;
        O90.m5968f(c0664kx, "fqName");
        Iterator it = interfaceC0510I5.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (O90.m5963a(((InterfaceC7116x5) next).mo4960f(), c0664kx)) {
                break;
            }
        }
        return (InterfaceC7116x5) next;
    }

    /* renamed from: b */
    public static SharedPreferences m23769b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* renamed from: c */
    public static boolean m23770c(InterfaceC0510I5 interfaceC0510I5, C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        return interfaceC0510I5.mo3260D(c0664kx) != null;
    }

    /* renamed from: d */
    public static void m23771d(Context context, C8128Pr0 c8128Pr0, boolean z) {
        C9450g32 c9450g32M18243d;
        int i;
        if (PlatformVersion.isAtLeastQ()) {
            SharedPreferences sharedPreferencesM23769b = m23769b(context);
            if (sharedPreferencesM23769b.contains("proxy_retention") && sharedPreferencesM23769b.getBoolean("proxy_retention", false) == z) {
                return;
            }
            QT0 qt0 = (QT0) c8128Pr0.f9305c;
            if (qt0.f9638c.m21948f() >= 241100000) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("proxy_retention", z);
                C22 c22M952e = C22.m952e(qt0.f9637b);
                synchronized (c22M952e) {
                    i = c22M952e.f1149a;
                    c22M952e.f1149a = i + 1;
                }
                c9450g32M18243d = c22M952e.m957f(new C10209m02(i, 4, bundle, 0));
            } else {
                c9450g32M18243d = AbstractC9376fU1.m18243d(new IOException("SERVICE_NOT_AVAILABLE"));
            }
            c9450g32M18243d.mo11138e(new ExecutorC4160h8(2), new C0159CW(context, z, 1));
        }
    }
}
