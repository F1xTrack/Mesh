package ru.ok.tracer.upload;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import defpackage.C2391bn0;
import defpackage.O90;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.tracer.HasTracerSystemInfo;
import ru.ok.tracer.base.compat.PackageManagerCompat;
import ru.ok.tracer.base.process.ProcessUtils;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"getOperatorInfo", "", "applicationContext", "Landroid/content/Context;", "getSystemProperties", "", "context", "tracer-commons_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SystemInfoKt {
    private static final String getOperatorInfo(Context context) {
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    public static final Map<String, String> getSystemProperties(Context context) {
        O90.f(context, "context");
        C2391bn0 c2391bn0 = new C2391bn0();
        Object applicationContext = context.getApplicationContext();
        if (applicationContext instanceof HasTracerSystemInfo) {
            try {
                c2391bn0.putAll(((HasTracerSystemInfo) applicationContext).getTracerSystemInfo());
            } catch (Throwable unused) {
            }
        }
        String str = Build.BOARD;
        O90.e(str, "BOARD");
        c2391bn0.put("board", str);
        String str2 = Build.BRAND;
        O90.e(str2, "BRAND");
        c2391bn0.put("brand", str2);
        String strJoin = TextUtils.join(", ", Build.SUPPORTED_ABIS);
        O90.e(strJoin, "join(\", \", Build.SUPPORTED_ABIS)");
        c2391bn0.put("cpuABI", strJoin);
        String str3 = Build.DEVICE;
        O90.e(str3, "DEVICE");
        c2391bn0.put("device", str3);
        String str4 = Build.MANUFACTURER;
        O90.e(str4, "MANUFACTURER");
        c2391bn0.put("manufacturer", str4);
        String str5 = Build.MODEL;
        O90.e(str5, "MODEL");
        c2391bn0.put(CommonUrlParts.MODEL, str5);
        c2391bn0.put("cpuCount", String.valueOf(Runtime.getRuntime().availableProcessors()));
        c2391bn0.put("osVersionSdkInt", String.valueOf(Build.VERSION.SDK_INT));
        String str6 = Build.VERSION.RELEASE;
        O90.e(str6, "RELEASE");
        c2391bn0.put("osVersionRelease", str6);
        String simpleProcessName = ProcessUtils.getSimpleProcessName(context);
        if (simpleProcessName != null) {
        }
        String operatorInfo = getOperatorInfo(context);
        if (operatorInfo != null) {
        }
        PackageManager packageManager = context.getPackageManager();
        O90.e(packageManager, "context.packageManager");
        String packageName = context.getPackageName();
        O90.e(packageName, "context.packageName");
        String installerPackageNameCompat = PackageManagerCompat.getInstallerPackageNameCompat(packageManager, packageName);
        if (installerPackageNameCompat != null) {
            c2391bn0.put("installer", installerPackageNameCompat);
        }
        return c2391bn0.b();
    }
}
