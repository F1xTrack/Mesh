package com.p019vk.push.core.utils;

import android.annotation.SuppressLint;
import android.app.usage.UsageStatsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.PowerManager;
import android.os.RemoteException;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.p019vk.push.core.domain.ComponentActions;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p000.AbstractC7167xu;
import p000.AbstractC7293zu;
import p000.C0779MN;
import p000.O90;

@Metadata(m22266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t*\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t*\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\b\u001a\u0019\u0010\u0014\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\b\u001a\u0019\u0010\u0015\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\b\u001a\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\t*\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u000b\u001a\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\t*\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u000b\u001a\u001b\u0010\u0018\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001d\u001a\u0004\u0018\u00010\u0010*\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010!\u001a\u0004\u0018\u00010 *\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010#\u001a\u00020\u000e*\u00020\u0000¢\u0006\u0004\b#\u0010$¨\u0006%"}, m22267d2 = {"Landroid/content/Context;", "", "packageName", "getApplicationSignature", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/pm/PackageManager;", "", "isHostPackageInstalled", "(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z", "", "getInitializedHostPackages", "(Landroid/content/pm/PackageManager;)Ljava/util/List;", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "", "flags", "Landroid/content/pm/ResolveInfo;", "queryIntentServicesCompat", "(Landroid/content/pm/PackageManager;Landroid/content/Intent;I)Ljava/util/List;", "isOldRuStoreVersionPackageInstalled", "isClientPackageInstalled", "checkAppInstalled", "getPackagesWithDeviceId", "getClientsPackages", "isIgnoringBatteryOptimizations", "(Landroid/content/Context;Ljava/lang/String;)Z", "expectedPubKey", "validateCallingPackage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z", "resolveServiceCompat", "(Landroid/content/pm/PackageManager;Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;", "intentAction", "Landroid/content/ComponentName;", "findServiceByAction", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/ComponentName;", "getAppStandbyBucket", "(Landroid/content/Context;)I", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PackageExtenstionsKt {
    /* renamed from: a */
    public static final String m13756a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            cArr[i2] = "0123456789ABCDEF".charAt((b & 255) >>> 4);
            cArr[i2 + 1] = "0123456789ABCDEF".charAt(b & 15);
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static final PackageInfo m13757b(Context context, String str) throws PackageManager.NameNotFoundException {
        if (Build.VERSION.SDK_INT >= 28) {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 134217728);
            O90.m5967e(packageInfo, "{\n        packageManager…GNING_CERTIFICATES)\n    }");
            return packageInfo;
        }
        PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(str, 64);
        O90.m5967e(packageInfo2, "{\n        packageManager…ger.GET_SIGNATURES)\n    }");
        return packageInfo2;
    }

    /* renamed from: c */
    public static final Signature[] m13758c(PackageInfo packageInfo) {
        Signature[] apkContentsSigners;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            apkContentsSigners = signingInfo != null ? signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory() : null;
        } else {
            apkContentsSigners = packageInfo.signatures;
        }
        return apkContentsSigners == null ? new Signature[0] : apkContentsSigners;
    }

    public static final boolean checkAppInstalled(PackageManager packageManager, String str) {
        O90.m5968f(packageManager, "<this>");
        O90.m5968f(str, "packageName");
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final ComponentName findServiceByAction(Context context, String str, String str2) {
        O90.m5968f(context, "<this>");
        O90.m5968f(str, "packageName");
        O90.m5968f(str2, "intentAction");
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        O90.m5967e(packageManager, "packageManager");
        ResolveInfo resolveInfoResolveServiceCompat = resolveServiceCompat(packageManager, intent, 128);
        if (resolveInfoResolveServiceCompat != null) {
            return new ComponentName(str, resolveInfoResolveServiceCompat.serviceInfo.name);
        }
        return null;
    }

    public static final int getAppStandbyBucket(Context context) {
        O90.m5968f(context, "<this>");
        if (Build.VERSION.SDK_INT < 28) {
            return 0;
        }
        Object systemService = context.getSystemService("usagestats");
        UsageStatsManager usageStatsManager = systemService instanceof UsageStatsManager ? (UsageStatsManager) systemService : null;
        if (usageStatsManager != null) {
            return usageStatsManager.getAppStandbyBucket();
        }
        return 0;
    }

    public static final String getApplicationSignature(Context context, String str) throws NoSuchAlgorithmException {
        O90.m5968f(context, "<this>");
        O90.m5968f(str, "packageName");
        try {
            PackageInfo packageInfoM13757b = m13757b(context, str);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (Signature signature : m13758c(packageInfoM13757b)) {
                messageDigest.update(signature.toByteArray());
            }
            byte[] bArrDigest = messageDigest.digest();
            O90.m5967e(bArrDigest, "messageDigest.digest()");
            return m13756a(bArrDigest);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static final List<String> getClientsPackages(PackageManager packageManager) {
        O90.m5968f(packageManager, "<this>");
        Intent intent = new Intent();
        intent.setAction(ComponentActions.CLIENT_MESSAGING_SERVICE_ACTION);
        List<ResolveInfo> listQueryIntentServicesCompat = queryIntentServicesCompat(packageManager, intent, 128);
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(listQueryIntentServicesCompat));
        Iterator<T> it = listQueryIntentServicesCompat.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).serviceInfo.packageName);
        }
        return arrayList;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static final List<String> getInitializedHostPackages(PackageManager packageManager) {
        O90.m5968f(packageManager, "<this>");
        Intent intent = new Intent();
        intent.setAction("com.vk.push.HOST_SERVICE");
        List<ResolveInfo> listQueryIntentServicesCompat = queryIntentServicesCompat(packageManager, intent, 128);
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(listQueryIntentServicesCompat));
        Iterator<T> it = listQueryIntentServicesCompat.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).serviceInfo.packageName);
        }
        return AbstractC7167xu.m25982b0(AbstractC7167xu.m25986f0(arrayList));
    }

    public static final List<String> getPackagesWithDeviceId(PackageManager packageManager) {
        O90.m5968f(packageManager, "<this>");
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(8);
        O90.m5967e(installedPackages, "getInstalledPackages(PackageManager.GET_PROVIDERS)");
        List<PackageInfo> list = installedPackages;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PackageInfo) it.next()).packageName);
        }
        return arrayList;
    }

    public static final boolean isClientPackageInstalled(PackageManager packageManager, String str) {
        O90.m5968f(packageManager, "<this>");
        O90.m5968f(str, "packageName");
        return getClientsPackages(packageManager).contains(str);
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static final boolean isHostPackageInstalled(PackageManager packageManager, String str) {
        O90.m5968f(packageManager, "<this>");
        O90.m5968f(str, "packageName");
        List<String> initializedHostPackages = getInitializedHostPackages(packageManager);
        return initializedHostPackages.isEmpty() ? isOldRuStoreVersionPackageInstalled(packageManager, str) : initializedHostPackages.contains(str);
    }

    public static final boolean isIgnoringBatteryOptimizations(Context context, String str) {
        O90.m5968f(context, "<this>");
        O90.m5968f(str, "packageName");
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        return powerManager != null && powerManager.isIgnoringBatteryOptimizations(str);
    }

    public static /* synthetic */ boolean isIgnoringBatteryOptimizations$default(Context context, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = context.getPackageName();
            O90.m5967e(str, "this.packageName");
        }
        return isIgnoringBatteryOptimizations(context, str);
    }

    public static final boolean isOldRuStoreVersionPackageInstalled(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        O90.m5968f(packageManager, "<this>");
        O90.m5968f(str, "packageName");
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static final List<ResolveInfo> queryIntentServicesCompat(PackageManager packageManager, Intent intent, int i) {
        C0779MN c0779mn = C0779MN.f7117a;
        O90.m5968f(packageManager, "<this>");
        O90.m5968f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        try {
            List<ResolveInfo> listQueryIntentServices = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentServices(intent, PackageManager.ResolveInfoFlags.of(i)) : packageManager.queryIntentServices(intent, i);
            O90.m5967e(listQueryIntentServices, "{\n        if (Build.VERS…t, flags)\n        }\n    }");
            return listQueryIntentServices;
        } catch (RemoteException e) {
            e.toString();
            return c0779mn;
        } catch (RuntimeException e2) {
            e2.toString();
            return c0779mn;
        }
    }

    public static final ResolveInfo resolveServiceCompat(PackageManager packageManager, Intent intent, int i) {
        O90.m5968f(packageManager, "<this>");
        O90.m5968f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        return Build.VERSION.SDK_INT >= 33 ? packageManager.resolveService(intent, PackageManager.ResolveInfoFlags.of(i)) : packageManager.resolveService(intent, i);
    }

    public static /* synthetic */ ResolveInfo resolveServiceCompat$default(PackageManager packageManager, Intent intent, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return resolveServiceCompat(packageManager, intent, i);
    }

    public static final boolean validateCallingPackage(Context context, String str, String str2) throws NoSuchAlgorithmException {
        O90.m5968f(context, "<this>");
        O90.m5968f(str, "expectedPubKey");
        O90.m5968f(str2, "packageName");
        try {
            PackageInfo packageInfoM13757b = m13757b(context, str2);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (Signature signature : m13758c(packageInfoM13757b)) {
                O90.m5967e(messageDigest, "messageDigest");
                messageDigest.reset();
                messageDigest.update(signature.toByteArray());
                byte[] bArrDigest = messageDigest.digest();
                O90.m5967e(bArrDigest, "messageDigest.digest()");
                if (str.equalsIgnoreCase(m13756a(bArrDigest))) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return false;
    }
}
