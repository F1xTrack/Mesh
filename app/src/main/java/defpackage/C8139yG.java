package defpackage;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.HashMap;

/* renamed from: yG */
/* loaded from: classes.dex */
public final class C8139yG {
    public final /* synthetic */ int a = 1;
    public final String b;

    public C8139yG(String str) {
        this.b = str;
    }

    public static void a(C5772lr0 c5772lr0, IZ0 iz0) {
        b(c5772lr0, "X-CRASHLYTICS-GOOGLE-APP-ID", iz0.a);
        b(c5772lr0, "X-CRASHLYTICS-API-CLIENT-TYPE", ConstantDeviceInfo.APP_PLATFORM);
        b(c5772lr0, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.0");
        b(c5772lr0, "Accept", "application/json");
        b(c5772lr0, "X-CRASHLYTICS-DEVICE-MODEL", iz0.b);
        b(c5772lr0, "X-CRASHLYTICS-OS-BUILD-VERSION", iz0.c);
        b(c5772lr0, "X-CRASHLYTICS-OS-DISPLAY-VERSION", iz0.d);
        b(c5772lr0, "X-CRASHLYTICS-INSTALLATION-ID", iz0.e.c().a);
    }

    public static void b(C5772lr0 c5772lr0, String str, String str2) {
        if (str2 != null) {
            ((HashMap) c5772lr0.d).put(str, str2);
        }
    }

    public static HashMap c(IZ0 iz0) {
        HashMap map = new HashMap();
        map.put("build_version", iz0.h);
        map.put("display_version", iz0.g);
        map.put("source", Integer.toString(iz0.i));
        String str = iz0.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return F91.v(new StringBuilder("<"), this.b, '>');
            default:
                return super.toString();
        }
    }

    public C8139yG(String str, C5396jt0 c5396jt0) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.b = str;
    }
}
