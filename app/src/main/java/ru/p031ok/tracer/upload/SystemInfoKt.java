package ru.p031ok.tracer.upload;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import kotlin.Metadata;
import p000.C8896bn0;
import p000.O90;
import ru.p031ok.tracer.HasTracerSystemInfo;
import ru.p031ok.tracer.base.compat.PackageManagerCompat;
import ru.p031ok.tracer.base.process.ProcessUtils;

@Metadata(m22266d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0003¨\u0006\u0007"}, m22267d2 = {"getOperatorInfo", "", "applicationContext", "Landroid/content/Context;", "getSystemProperties", "", "context", "tracer-commons_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
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
        O90.m5968f(context, "context");
        C8896bn0 c8896bn0 = new C8896bn0();
        Object applicationContext = context.getApplicationContext();
        if (applicationContext instanceof HasTracerSystemInfo) {
            try {
                c8896bn0.putAll(((HasTracerSystemInfo) applicationContext).getTracerSystemInfo());
            } catch (Throwable unused) {
            }
        }
        String str = Build.BOARD;
        O90.m5967e(str, "BOARD");
        c8896bn0.put("board", str);
        String str2 = Build.BRAND;
        O90.m5967e(str2, "BRAND");
        c8896bn0.put("brand", str2);
        String strJoin = TextUtils.join(", ", Build.SUPPORTED_ABIS);
        O90.m5967e(strJoin, "join(\", \", Build.SUPPORTED_ABIS)");
        c8896bn0.put("cpuABI", strJoin);
        String str3 = Build.DEVICE;
        O90.m5967e(str3, "DEVICE");
        c8896bn0.put("device", str3);
        String str4 = Build.MANUFACTURER;
        O90.m5967e(str4, "MANUFACTURER");
        c8896bn0.put("manufacturer", str4);
        String str5 = Build.MODEL;
        O90.m5967e(str5, "MODEL");
        c8896bn0.put(CommonUrlParts.MODEL, str5);
        c8896bn0.put("cpuCount", String.valueOf(Runtime.getRuntime().availableProcessors()));
        c8896bn0.put("osVersionSdkInt", String.valueOf(Build.VERSION.SDK_INT));
        String str6 = Build.VERSION.RELEASE;
        O90.m5967e(str6, "RELEASE");
        c8896bn0.put("osVersionRelease", str6);
        String simpleProcessName = ProcessUtils.getSimpleProcessName(context);
        if (simpleProcessName != null) {
        }
        String operatorInfo = getOperatorInfo(context);
        if (operatorInfo != null) {
        }
        PackageManager packageManager = context.getPackageManager();
        O90.m5967e(packageManager, "context.packageManager");
        String packageName = context.getPackageName();
        O90.m5967e(packageName, "context.packageName");
        String installerPackageNameCompat = PackageManagerCompat.getInstallerPackageNameCompat(packageManager, packageName);
        if (installerPackageNameCompat != null) {
            c8896bn0.put("installer", installerPackageNameCompat);
        }
        return c8896bn0.m10510b();
    }
}
