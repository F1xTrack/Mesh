package p000;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;

/* loaded from: classes.dex */
public final class N10 extends GoogleApi {

    /* renamed from: a */
    public static int f7462a = 1;

    /* renamed from: a */
    public final synchronized int m5520a() {
        int i;
        try {
            i = f7462a;
            if (i == 1) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, 12451000);
                if (iIsGooglePlayServicesAvailable == 0) {
                    i = 4;
                    f7462a = 4;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, iIsGooglePlayServicesAvailable, null) != null || C0778MM.m5341a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    f7462a = 2;
                } else {
                    i = 3;
                    f7462a = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
