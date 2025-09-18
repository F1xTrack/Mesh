package p000;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.HashMap;

/* renamed from: yG */
/* loaded from: classes.dex */
public final class C7190yG {

    /* renamed from: a */
    public final /* synthetic */ int f46160a = 1;

    /* renamed from: b */
    public final String f46161b;

    public C7190yG(String str) {
        this.f46161b = str;
    }

    /* renamed from: a */
    public static void m26105a(C10189lr0 c10189lr0, IZ0 iz0) {
        m26106b(c10189lr0, "X-CRASHLYTICS-GOOGLE-APP-ID", iz0.f4984a);
        m26106b(c10189lr0, "X-CRASHLYTICS-API-CLIENT-TYPE", ConstantDeviceInfo.APP_PLATFORM);
        m26106b(c10189lr0, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.0");
        m26106b(c10189lr0, "Accept", "application/json");
        m26106b(c10189lr0, "X-CRASHLYTICS-DEVICE-MODEL", iz0.f4985b);
        m26106b(c10189lr0, "X-CRASHLYTICS-OS-BUILD-VERSION", iz0.f4986c);
        m26106b(c10189lr0, "X-CRASHLYTICS-OS-DISPLAY-VERSION", iz0.f4987d);
        m26106b(c10189lr0, "X-CRASHLYTICS-INSTALLATION-ID", iz0.f4988e.m9219c().f9702a);
    }

    /* renamed from: b */
    public static void m26106b(C10189lr0 c10189lr0, String str, String str2) {
        if (str2 != null) {
            ((HashMap) c10189lr0.f37325d).put(str, str2);
        }
    }

    /* renamed from: c */
    public static HashMap m26107c(IZ0 iz0) {
        HashMap map = new HashMap();
        map.put("build_version", iz0.f4991h);
        map.put("display_version", iz0.f4990g);
        map.put("source", Integer.toString(iz0.f4992i));
        String str = iz0.f4989f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public String toString() {
        switch (this.f46160a) {
            case 1:
                return F91.m2539v(new StringBuilder("<"), this.f46161b, '>');
            default:
                return super.toString();
        }
    }

    public C7190yG(String str, C9937jt0 c9937jt0) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f46161b = str;
    }
}
