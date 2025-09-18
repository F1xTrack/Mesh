package com.vk.push.core.data.source;

import android.content.Context;
import android.os.Build;
import defpackage.AbstractC8235ym;
import defpackage.O90;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/data/source/DeviceInfoDataSource;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getDeviceManufacturer", "()Ljava/lang/String;", "getDeviceModel", "getOSVersion", "getTimeZone", "getDefaultLocale", "getCountryId", "getRegionId", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceInfoDataSource {
    public final Context a;

    public DeviceInfoDataSource(Context context) {
        O90.f(context, "context");
        this.a = context;
    }

    public static String a() {
        String id = TimeZone.getDefault().getID();
        try {
            String region = Build.VERSION.SDK_INT >= 24 ? android.icu.util.TimeZone.getRegion(id) : id;
            O90.e(region, "{\n            if (Build.…d\n            }\n        }");
            return region;
        } catch (Throwable unused) {
            O90.e(id, "{\n            defaultTimeZoneId\n        }");
            return id;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e A[Catch: UnsupportedOperationException -> 0x0023, TRY_LEAVE, TryCatch #0 {UnsupportedOperationException -> 0x0023, blocks: (B:4:0x000c, B:6:0x0012, B:7:0x001e), top: B:12:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getCountryId() {
        /*
            r2 = this;
            android.content.Context r0 = r2.a
            java.lang.Class<android.telephony.TelephonyManager> r1 = android.telephony.TelephonyManager.class
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.getNetworkCountryIso()     // Catch: java.lang.UnsupportedOperationException -> L23
            if (r0 == 0) goto L1e
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.UnsupportedOperationException -> L23
            java.lang.String r0 = r0.toUpperCase(r1)     // Catch: java.lang.UnsupportedOperationException -> L23
            java.lang.String r1 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            defpackage.O90.e(r0, r1)     // Catch: java.lang.UnsupportedOperationException -> L23
            goto L27
        L1e:
            java.lang.String r0 = a()     // Catch: java.lang.UnsupportedOperationException -> L23
            goto L27
        L23:
            java.lang.String r0 = a()
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.data.source.DeviceInfoDataSource.getCountryId():java.lang.String");
    }

    public final String getDefaultLocale() {
        String displayName = Locale.getDefault().getDisplayName();
        O90.e(displayName, "getDefault().displayName");
        return displayName;
    }

    public final String getDeviceManufacturer() {
        String str = Build.MANUFACTURER;
        O90.e(str, "MANUFACTURER");
        return str;
    }

    public final String getDeviceModel() {
        String str = Build.MODEL;
        O90.e(str, "MODEL");
        return str;
    }

    public final String getOSVersion() {
        StringBuilder sb = new StringBuilder("Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(" (SDK ");
        return AbstractC8235ym.l(sb, Build.VERSION.SDK_INT, ')');
    }

    public final String getRegionId() {
        return a();
    }

    public final String getTimeZone() {
        String id = TimeZone.getDefault().getID();
        O90.e(id, "getDefault().id");
        return id;
    }
}
