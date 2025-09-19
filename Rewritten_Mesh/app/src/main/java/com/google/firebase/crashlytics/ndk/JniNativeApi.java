package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p000.AbstractC7222ym;
import p000.InterfaceC9939ju0;

/* loaded from: classes.dex */
class JniNativeApi implements InterfaceC9939ju0 {

    /* renamed from: b */
    public static final boolean f18454b;

    /* renamed from: c */
    public static final C1958c f18455c = new C1958c();

    /* renamed from: a */
    public final Context f18456a;

    static {
        boolean z;
        try {
            System.loadLibrary("crashlytics");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            e.getLocalizedMessage();
            z = false;
        }
        f18454b = z;
    }

    public JniNativeApi(Context context) {
        this.f18456a = context;
    }

    /* renamed from: a */
    public static void m11298a(ArrayList arrayList, PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(arrayList, strArr);
        }
        File file = new File(applicationInfo.dataDir, AbstractC7222ym.m26234k("files/splitcompat/", Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode), "/verified-splits"));
        if (!file.exists()) {
            file.getAbsolutePath();
            return;
        }
        File[] fileArrListFiles = file.listFiles(f18455c);
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        file.getAbsolutePath();
        for (File file2 : fileArrListFiles) {
            file2.getName();
            arrayList.add(file2.getAbsolutePath());
        }
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    /* renamed from: b */
    public final boolean m11299b(AssetManager assetManager, String str) throws PackageManager.NameNotFoundException {
        String str2 = Build.CPU_ABI;
        Context context = this.f18456a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), Build.VERSION.SDK_INT >= 24 ? 9216 : 1024);
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            m11298a(arrayList, packageInfo);
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str2).getPath());
                if (str2.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str2.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.endsWith(".apk")) {
                    arrayList2.add(str3 + "!/lib/" + str2);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str4 = File.pathSeparator;
            String[] strArr2 = {TextUtils.join(str4, arrayList), TextUtils.join(str4, arrayList2)};
            return f18454b && nativeInit(new String[]{strArr2[0], strArr2[1], str}, assetManager);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
