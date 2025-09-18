package defpackage;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: classes.dex */
public final class AN1 {
    public final C3386dP1 a;

    public AN1(C5716lY1 c5716lY1) {
        this.a = c5716lY1.l;
    }

    public final boolean a() {
        C3386dP1 c3386dP1 = this.a;
        try {
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(c3386dP1.a);
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            OL1 ol1 = c3386dP1.i;
            C3386dP1.e(ol1);
            ol1.o.d("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            OL1 ol12 = c3386dP1.i;
            C3386dP1.e(ol12);
            ol12.o.c(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
