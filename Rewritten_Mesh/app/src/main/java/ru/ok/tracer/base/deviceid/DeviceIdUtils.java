package ru.ok.tracer.base.deviceid;

import android.content.Context;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u001a\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"FILE_DEVICE_ID", "", "KEY_DEVICE_ID", "NULL_UUID", "cachedDeviceId", "deviceIdLock", "Ljava/lang/Object;", "getDeviceId", "context", "Landroid/content/Context;", "loadDeviceId", "tracer-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceIdUtils {
    private static final String FILE_DEVICE_ID = "device_id.txt";
    private static final String KEY_DEVICE_ID = "device_id";
    public static final String NULL_UUID = "00000000-0000-0000-0000-000000000000";
    private static volatile String cachedDeviceId;
    private static final Object deviceIdLock = new Object();

    public static final String getDeviceId(Context context) {
        O90.f(context, "context");
        String str = cachedDeviceId;
        if (str != null) {
            return str;
        }
        synchronized (deviceIdLock) {
            String str2 = cachedDeviceId;
            if (str2 != null) {
                return str2;
            }
            Context applicationContext = context.getApplicationContext();
            O90.e(applicationContext, "context.applicationContext");
            String strLoadDeviceId = loadDeviceId(applicationContext);
            cachedDeviceId = strLoadDeviceId;
            return strLoadDeviceId;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String loadDeviceId(android.content.Context r8) {
        /*
            java.lang.String r0 = "tracer"
            r1 = 0
            android.content.SharedPreferences r1 = r8.getSharedPreferences(r0, r1)
            java.lang.String r2 = "device_id"
            r3 = 0
            java.lang.String r4 = r1.getString(r2, r3)
            if (r4 != 0) goto L13
            java.lang.String r5 = "00000000-0000-0000-0000-000000000000"
            goto L14
        L13:
            r5 = r4
        L14:
            java.io.File r8 = r8.getFilesDir()     // Catch: java.io.IOException -> L8b
            java.lang.String r6 = "context.filesDir"
            defpackage.O90.e(r8, r6)     // Catch: java.io.IOException -> L8b
            java.io.File r8 = defpackage.AbstractC5702lU.g(r8, r0)     // Catch: java.io.IOException -> L8b
            java.io.File r8 = ru.ok.tracer.base.io.FileUtils.mkdirsChecked(r8)     // Catch: java.io.IOException -> L8b
            java.lang.String r0 = "device_id.txt"
            java.io.File r8 = defpackage.AbstractC5702lU.g(r8, r0)
            boolean r0 = r8.exists()
            if (r0 != 0) goto L33
        L31:
            r0 = r3
            goto L45
        L33:
            java.lang.String r0 = defpackage.AbstractC5702lU.f(r8)     // Catch: java.io.IOException -> L31
            java.lang.CharSequence r0 = defpackage.AbstractC7538v51.Y(r0)     // Catch: java.io.IOException -> L31
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L31
            int r6 = r0.length()     // Catch: java.io.IOException -> L31
            if (r6 <= 0) goto L31
        L45:
            if (r0 == 0) goto L48
            return r0
        L48:
            if (r4 != 0) goto L58
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "randomUUID().toString()"
            defpackage.O90.e(r0, r6)
            goto L59
        L58:
            r0 = r4
        L59:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L8b
            r6.<init>(r8)     // Catch: java.io.IOException -> L8b
            java.nio.charset.Charset r8 = defpackage.AbstractC7680vr.a     // Catch: java.lang.Throwable -> L84
            byte[] r8 = r0.getBytes(r8)     // Catch: java.lang.Throwable -> L84
            java.lang.String r7 = "this as java.lang.String).getBytes(charset)"
            defpackage.O90.e(r8, r7)     // Catch: java.lang.Throwable -> L84
            r6.write(r8)     // Catch: java.lang.Throwable -> L84
            java.io.FileDescriptor r8 = r6.getFD()     // Catch: java.lang.Throwable -> L84
            r8.sync()     // Catch: java.lang.Throwable -> L84
            defpackage.AbstractC2141aT1.a(r6, r3)     // Catch: java.io.IOException -> L8b
            if (r4 == 0) goto L83
            android.content.SharedPreferences$Editor r8 = r1.edit()
            android.content.SharedPreferences$Editor r8 = r8.remove(r2)
            r8.apply()
        L83:
            return r0
        L84:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            defpackage.AbstractC2141aT1.a(r6, r8)     // Catch: java.io.IOException -> L8b
            throw r0     // Catch: java.io.IOException -> L8b
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.base.deviceid.DeviceIdUtils.loadDeviceId(android.content.Context):java.lang.String");
    }
}
