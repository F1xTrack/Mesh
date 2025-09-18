package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;

/* renamed from: Py1 */
/* loaded from: classes.dex */
public final class C1263Py1 extends U0 {
    public Boolean c;
    public String d;
    public InterfaceC3493dz1 e;
    public Boolean f;

    public final long A1(String str, GJ1 gj1) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) gj1.a(null)).longValue();
        }
        String strW0 = this.e.W0(str, gj1.a);
        if (TextUtils.isEmpty(strW0)) {
            return ((Long) gj1.a(null)).longValue();
        }
        try {
            return ((Long) gj1.a(Long.valueOf(Long.parseLong(strW0)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) gj1.a(null)).longValue();
        }
    }

    public final EnumC3582eR1 B1(String str, boolean z) {
        Object obj;
        Preconditions.checkNotEmpty(str);
        Bundle bundleY1 = y1();
        if (bundleY1 == null) {
            n().g.d("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleY1.get(str);
        }
        EnumC3582eR1 enumC3582eR1 = EnumC3582eR1.UNINITIALIZED;
        if (obj == null) {
            return enumC3582eR1;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC3582eR1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC3582eR1.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return EnumC3582eR1.POLICY;
        }
        n().j.c(str, "Invalid manifest metadata for");
        return enumC3582eR1;
    }

    public final String C1(String str, GJ1 gj1) {
        return TextUtils.isEmpty(str) ? (String) gj1.a(null) : (String) gj1.a(this.e.W0(str, gj1.a));
    }

    public final Boolean D1(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleY1 = y1();
        if (bundleY1 == null) {
            n().g.d("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleY1.containsKey(str)) {
            return Boolean.valueOf(bundleY1.getBoolean(str));
        }
        return null;
    }

    public final boolean E1(String str, GJ1 gj1) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) gj1.a(null)).booleanValue();
        }
        String strW0 = this.e.W0(str, gj1.a);
        return TextUtils.isEmpty(strW0) ? ((Boolean) gj1.a(null)).booleanValue() : ((Boolean) gj1.a(Boolean.valueOf("1".equals(strW0)))).booleanValue();
    }

    public final boolean F1(String str) {
        return "1".equals(this.e.W0(str, "measurement.event_sampling_enabled"));
    }

    public final boolean G1() {
        Boolean boolD1 = D1("google_analytics_automatic_screen_reporting_enabled");
        return boolD1 == null || boolD1.booleanValue();
    }

    public final boolean H1() {
        if (this.c == null) {
            Boolean boolD1 = D1("app_measurement_lite");
            this.c = boolD1;
            if (boolD1 == null) {
                this.c = Boolean.FALSE;
            }
        }
        return this.c.booleanValue() || !((C3386dP1) this.b).e;
    }

    public final double w1(String str, GJ1 gj1) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) gj1.a(null)).doubleValue();
        }
        String strW0 = this.e.W0(str, gj1.a);
        if (TextUtils.isEmpty(strW0)) {
            return ((Double) gj1.a(null)).doubleValue();
        }
        try {
            return ((Double) gj1.a(Double.valueOf(Double.parseDouble(strW0)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) gj1.a(null)).doubleValue();
        }
    }

    public final String x1(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            n().g.c(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            n().g.c(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            n().g.c(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            n().g.c(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final Bundle y1() {
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        try {
            if (c3386dP1.a.getPackageManager() == null) {
                n().g.d("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(c3386dP1.a).getApplicationInfo(c3386dP1.a.getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            n().g.d("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            n().g.c(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final int z1(String str, GJ1 gj1) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) gj1.a(null)).intValue();
        }
        String strW0 = this.e.W0(str, gj1.a);
        if (TextUtils.isEmpty(strW0)) {
            return ((Integer) gj1.a(null)).intValue();
        }
        try {
            return ((Integer) gj1.a(Integer.valueOf(Integer.parseInt(strW0)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) gj1.a(null)).intValue();
        }
    }
}
