package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.util.PlatformVersion;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: pN1 */
/* loaded from: classes.dex */
public abstract class AbstractC6447pN1 {
    public static InterfaceC7916x5 a(I5 i5, KX kx) {
        Object next;
        O90.f(kx, "fqName");
        Iterator it = i5.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (O90.a(((InterfaceC7916x5) next).f(), kx)) {
                break;
            }
        }
        return (InterfaceC7916x5) next;
    }

    public static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static boolean c(I5 i5, KX kx) {
        O90.f(kx, "fqName");
        return i5.D(kx) != null;
    }

    public static void d(Context context, C1241Pr0 c1241Pr0, boolean z) {
        C3892g32 c3892g32D;
        int i;
        if (PlatformVersion.isAtLeastQ()) {
            SharedPreferences sharedPreferencesB = b(context);
            if (sharedPreferencesB.contains("proxy_retention") && sharedPreferencesB.getBoolean("proxy_retention", false) == z) {
                return;
            }
            QT0 qt0 = (QT0) c1241Pr0.c;
            if (qt0.c.f() >= 241100000) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("proxy_retention", z);
                C22 c22E = C22.e(qt0.b);
                synchronized (c22E) {
                    i = c22E.a;
                    c22E.a = i + 1;
                }
                c3892g32D = c22E.f(new C5802m02(i, 4, bundle, 0));
            } else {
                c3892g32D = AbstractC3782fU1.d(new IOException("SERVICE_NOT_AVAILABLE"));
            }
            c3892g32D.e(new ExecutorC4096h8(2), new CW(context, z, 1));
        }
    }
}
