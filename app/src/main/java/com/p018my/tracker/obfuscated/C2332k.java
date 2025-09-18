package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.p018my.tracker.MyTrackerConfig;
import com.p018my.tracker.obfuscated.C2328j;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.k */
/* loaded from: classes2.dex */
public final class C2332k {

    /* renamed from: a */
    private static final C2328j f20006a = new C2328j(Collections.emptyList());

    /* renamed from: a */
    private static String m13262a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2328j.a) it.next()).f19988a);
        }
        return TextUtils.join(StringUtils.COMMA, arrayList);
    }

    /* renamed from: b */
    private static List m13263b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageInfo packageInfo = (PackageInfo) it.next();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(new C2328j.a(applicationInfo.packageName, AbstractC2383w2.m13530b(packageInfo.firstInstallTime)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C2328j m13264a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, Context context) {
        List<PackageInfo> installedPackages;
        if (installedPackagesProvider == null) {
            return f20006a;
        }
        try {
            installedPackages = installedPackagesProvider.getInstalledPackages();
        } catch (Throwable unused) {
            AbstractC2391y2.m13572b("MyTracker error: exception at InstalledPackagesProvider::getInstalledPackages()");
            installedPackages = null;
        }
        if (installedPackages == null || installedPackages.isEmpty()) {
            return f20006a;
        }
        List listM13263b = m13263b(installedPackages);
        if (listM13263b.isEmpty()) {
            return f20006a;
        }
        String strM13262a = m13262a(listM13263b);
        String strM13428g = C2358q1.m13407a(context).m13428g();
        String strM12805a = AbstractC2300c0.m12805a(strM13262a);
        if (strM13428g.equals(strM12805a)) {
            AbstractC2391y2.m13568a("AppsDataProvider: Apps hash did not changed");
            return f20006a;
        }
        AbstractC2391y2.m13568a("AppsDataProvider: Apps hash changed");
        C2358q1.m13407a(context).m13431h(strM12805a);
        return new C2328j(listM13263b);
    }
}
