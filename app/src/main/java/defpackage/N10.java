package defpackage;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;

/* loaded from: classes.dex */
public final class N10 extends GoogleApi {
    public static int a = 1;

    public final synchronized int a() {
        int i;
        try {
            i = a;
            if (i == 1) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, 12451000);
                if (iIsGooglePlayServicesAvailable == 0) {
                    i = 4;
                    a = 4;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, iIsGooglePlayServicesAvailable, null) != null || MM.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    a = 2;
                } else {
                    i = 3;
                    a = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
