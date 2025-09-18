package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.j;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class k {
    private static final j a = new j(Collections.emptyList());

    private static String a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((j.a) it.next()).a);
        }
        return TextUtils.join(StringUtils.COMMA, arrayList);
    }

    private static List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageInfo packageInfo = (PackageInfo) it.next();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(new j.a(applicationInfo.packageName, w2.b(packageInfo.firstInstallTime)));
            }
        }
        return arrayList;
    }

    public j a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, Context context) {
        List<PackageInfo> installedPackages;
        if (installedPackagesProvider == null) {
            return a;
        }
        try {
            installedPackages = installedPackagesProvider.getInstalledPackages();
        } catch (Throwable unused) {
            y2.b("MyTracker error: exception at InstalledPackagesProvider::getInstalledPackages()");
            installedPackages = null;
        }
        if (installedPackages == null || installedPackages.isEmpty()) {
            return a;
        }
        List listB = b(installedPackages);
        if (listB.isEmpty()) {
            return a;
        }
        String strA = a(listB);
        String strG = q1.a(context).g();
        String strA2 = c0.a(strA);
        if (strG.equals(strA2)) {
            y2.a("AppsDataProvider: Apps hash did not changed");
            return a;
        }
        y2.a("AppsDataProvider: Apps hash changed");
        q1.a(context).h(strA2);
        return new j(listB);
    }
}
