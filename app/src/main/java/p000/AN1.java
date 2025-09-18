package p000;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: classes.dex */
public final class AN1 {

    /* renamed from: a */
    public final C9110dP1 f180a;

    public AN1(C10152lY1 c10152lY1) {
        this.f180a = c10152lY1.f37134l;
    }

    /* renamed from: a */
    public final boolean m171a() {
        C9110dP1 c9110dP1 = this.f180a;
        try {
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(c9110dP1.f26031a);
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            OL1 ol1 = c9110dP1.f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8386o.m24555d("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            OL1 ol12 = c9110dP1.f26039i;
            C9110dP1.m17592e(ol12);
            ol12.f8386o.m24554c(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
