package com.p019vk.push.core.data.source;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import p000.AbstractC7222ym;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u000f"}, m22267d2 = {"Lcom/vk/push/core/data/source/DeviceInfoDataSource;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getDeviceManufacturer", "()Ljava/lang/String;", "getDeviceModel", "getOSVersion", "getTimeZone", "getDefaultLocale", "getCountryId", "getRegionId", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class DeviceInfoDataSource {

    /* renamed from: a */
    public final Context f20355a;

    public DeviceInfoDataSource(Context context) {
        O90.m5968f(context, "context");
        this.f20355a = context;
    }

    /* renamed from: a */
    public static String m13735a() {
        String id = TimeZone.getDefault().getID();
        try {
            String region = Build.VERSION.SDK_INT >= 24 ? android.icu.util.TimeZone.getRegion(id) : id;
            O90.m5967e(region, "{\n            if (Build.…d\n            }\n        }");
            return region;
        } catch (Throwable unused) {
            O90.m5967e(id, "{\n            defaultTimeZoneId\n        }");
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
            android.content.Context r0 = r2.f20355a
            java.lang.Class<android.telephony.TelephonyManager> r1 = android.telephony.TelephonyManager.class
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.getNetworkCountryIso()     // Catch: java.lang.UnsupportedOperationException -> L23
            if (r0 == 0) goto L1e
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.UnsupportedOperationException -> L23
            java.lang.String r0 = r0.toUpperCase(r1)     // Catch: java.lang.UnsupportedOperationException -> L23
            java.lang.String r1 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            p000.O90.m5967e(r0, r1)     // Catch: java.lang.UnsupportedOperationException -> L23
            goto L27
        L1e:
            java.lang.String r0 = m13735a()     // Catch: java.lang.UnsupportedOperationException -> L23
            goto L27
        L23:
            java.lang.String r0 = m13735a()
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.data.source.DeviceInfoDataSource.getCountryId():java.lang.String");
    }

    public final String getDefaultLocale() {
        String displayName = Locale.getDefault().getDisplayName();
        O90.m5967e(displayName, "getDefault().displayName");
        return displayName;
    }

    public final String getDeviceManufacturer() {
        String str = Build.MANUFACTURER;
        O90.m5967e(str, "MANUFACTURER");
        return str;
    }

    public final String getDeviceModel() {
        String str = Build.MODEL;
        O90.m5967e(str, "MODEL");
        return str;
    }

    public final String getOSVersion() {
        StringBuilder sb = new StringBuilder("Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(" (SDK ");
        return AbstractC7222ym.m26235l(sb, Build.VERSION.SDK_INT, ')');
    }

    public final String getRegionId() {
        return m13735a();
    }

    public final String getTimeZone() {
        String id = TimeZone.getDefault().getID();
        O90.m5967e(id, "getDefault().id");
        return id;
    }
}
