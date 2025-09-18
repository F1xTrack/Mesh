package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;

/* renamed from: Py1 */
/* loaded from: classes.dex */
public final class C8143Py1 extends AbstractC1259U0 {

    /* renamed from: c */
    public Boolean f9376c;

    /* renamed from: d */
    public String f9377d;

    /* renamed from: e */
    public InterfaceC9182dz1 f9378e;

    /* renamed from: f */
    public Boolean f9379f;

    /* renamed from: A1 */
    public final long m6507A1(String str, GJ1 gj1) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) gj1.m3028a(null)).longValue();
        }
        String strMo5666W0 = this.f9378e.mo5666W0(str, gj1.f3689a);
        if (TextUtils.isEmpty(strMo5666W0)) {
            return ((Long) gj1.m3028a(null)).longValue();
        }
        try {
            return ((Long) gj1.m3028a(Long.valueOf(Long.parseLong(strMo5666W0)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) gj1.m3028a(null)).longValue();
        }
    }

    /* renamed from: B1 */
    public final EnumC9242eR1 m6508B1(String str, boolean z) {
        Object obj;
        Preconditions.checkNotEmpty(str);
        Bundle bundleM6517y1 = m6517y1();
        if (bundleM6517y1 == null) {
            mo6070n().f8378g.m24555d("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM6517y1.get(str);
        }
        EnumC9242eR1 enumC9242eR1 = EnumC9242eR1.UNINITIALIZED;
        if (obj == null) {
            return enumC9242eR1;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC9242eR1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC9242eR1.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return EnumC9242eR1.POLICY;
        }
        mo6070n().f8381j.m24554c(str, "Invalid manifest metadata for");
        return enumC9242eR1;
    }

    /* renamed from: C1 */
    public final String m6509C1(String str, GJ1 gj1) {
        return TextUtils.isEmpty(str) ? (String) gj1.m3028a(null) : (String) gj1.m3028a(this.f9378e.mo5666W0(str, gj1.f3689a));
    }

    /* renamed from: D1 */
    public final Boolean m6510D1(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleM6517y1 = m6517y1();
        if (bundleM6517y1 == null) {
            mo6070n().f8378g.m24555d("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleM6517y1.containsKey(str)) {
            return Boolean.valueOf(bundleM6517y1.getBoolean(str));
        }
        return null;
    }

    /* renamed from: E1 */
    public final boolean m6511E1(String str, GJ1 gj1) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) gj1.m3028a(null)).booleanValue();
        }
        String strMo5666W0 = this.f9378e.mo5666W0(str, gj1.f3689a);
        return TextUtils.isEmpty(strMo5666W0) ? ((Boolean) gj1.m3028a(null)).booleanValue() : ((Boolean) gj1.m3028a(Boolean.valueOf("1".equals(strMo5666W0)))).booleanValue();
    }

    /* renamed from: F1 */
    public final boolean m6512F1(String str) {
        return "1".equals(this.f9378e.mo5666W0(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: G1 */
    public final boolean m6513G1() {
        Boolean boolM6510D1 = m6510D1("google_analytics_automatic_screen_reporting_enabled");
        return boolM6510D1 == null || boolM6510D1.booleanValue();
    }

    /* renamed from: H1 */
    public final boolean m6514H1() {
        if (this.f9376c == null) {
            Boolean boolM6510D1 = m6510D1("app_measurement_lite");
            this.f9376c = boolM6510D1;
            if (boolM6510D1 == null) {
                this.f9376c = Boolean.FALSE;
            }
        }
        return this.f9376c.booleanValue() || !((C9110dP1) this.f11615b).f26035e;
    }

    /* renamed from: w1 */
    public final double m6515w1(String str, GJ1 gj1) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) gj1.m3028a(null)).doubleValue();
        }
        String strMo5666W0 = this.f9378e.mo5666W0(str, gj1.f3689a);
        if (TextUtils.isEmpty(strMo5666W0)) {
            return ((Double) gj1.m3028a(null)).doubleValue();
        }
        try {
            return ((Double) gj1.m3028a(Double.valueOf(Double.parseDouble(strMo5666W0)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) gj1.m3028a(null)).doubleValue();
        }
    }

    /* renamed from: x1 */
    public final String m6516x1(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            mo6070n().f8378g.m24554c(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            mo6070n().f8378g.m24554c(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            mo6070n().f8378g.m24554c(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            mo6070n().f8378g.m24554c(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    /* renamed from: y1 */
    public final Bundle m6517y1() {
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        try {
            if (c9110dP1.f26031a.getPackageManager() == null) {
                mo6070n().f8378g.m24555d("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(c9110dP1.f26031a).getApplicationInfo(c9110dP1.f26031a.getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            mo6070n().f8378g.m24555d("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            mo6070n().f8378g.m24554c(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    /* renamed from: z1 */
    public final int m6518z1(String str, GJ1 gj1) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) gj1.m3028a(null)).intValue();
        }
        String strMo5666W0 = this.f9378e.mo5666W0(str, gj1.f3689a);
        if (TextUtils.isEmpty(strMo5666W0)) {
            return ((Integer) gj1.m3028a(null)).intValue();
        }
        try {
            return ((Integer) gj1.m3028a(Integer.valueOf(Integer.parseInt(strMo5666W0)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) gj1.m3028a(null)).intValue();
        }
    }
}
