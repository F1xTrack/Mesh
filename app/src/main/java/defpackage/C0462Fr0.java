package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Rational;
import android.util.Size;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: Fr0 */
/* loaded from: classes.dex */
public final class C0462Fr0 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public C0462Fr0(Context context) {
        this.b = 0;
        this.c = context;
    }

    public static String c(MU mu) {
        mu.a();
        C3783fV c3783fV = mu.c;
        String str = c3783fV.e;
        if (str != null) {
            return str;
        }
        mu.a();
        String str2 = c3783fV.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public static ArrayList d(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(X8.a);
        arrayList.add(X8.c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                    if (X8.a(size, (Rational) it2.next(), AbstractC3696f21.c)) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static Rational f(int i, boolean z) {
        if (i != -1) {
            if (i == 0) {
                return z ? X8.a : X8.b;
            }
            if (i == 1) {
                return z ? X8.c : X8.d;
            }
            AbstractC0759Jm0.f("SupportedOutputSizesCollector");
        }
        return null;
    }

    public static HashMap g(List list) {
        HashMap map = new HashMap();
        Iterator it = d(list).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (X8.a(size, rational, AbstractC3696f21.c)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static List j(C3775fS0 c3775fS0, List list, Size size, int i, Rational rational, int i2, int i3) {
        C1538Tm0 c1538Tm0 = c3775fS0.a;
        HashMap mapG = g(list);
        boolean z = rational == null || rational.getNumerator() >= rational.getDenominator();
        c1538Tm0.getClass();
        Rational rationalF = f(0, z);
        ArrayList arrayList = new ArrayList(mapG.keySet());
        Collections.sort(arrayList, new W8(rationalF, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Rational rational2 = (Rational) it.next();
            linkedHashMap.put(rational2, (List) mapG.get(rational2));
        }
        if (size != null) {
            Size size2 = AbstractC3696f21.a;
            int height = size.getHeight() * size.getWidth();
            Iterator it2 = linkedHashMap.keySet().iterator();
            while (it2.hasNext()) {
                List<Size> list2 = (List) linkedHashMap.get((Rational) it2.next());
                ArrayList arrayList2 = new ArrayList();
                for (Size size3 : list2) {
                    if (AbstractC3696f21.a(size3) <= height) {
                        arrayList2.add(size3);
                    }
                }
                list2.clear();
                list2.addAll(arrayList2);
            }
        }
        C4157hS0 c4157hS0 = c3775fS0.b;
        if (c4157hS0 != null) {
            Iterator it3 = linkedHashMap.keySet().iterator();
            while (it3.hasNext()) {
                List list3 = (List) linkedHashMap.get((Rational) it3.next());
                if (!list3.isEmpty() && !c4157hS0.equals(C4157hS0.c)) {
                    int i4 = c4157hS0.b;
                    Size size4 = c4157hS0.a;
                    if (i4 == 0) {
                        boolean zContains = list3.contains(size4);
                        list3.clear();
                        if (zContains) {
                            list3.add(size4);
                        }
                    } else if (i4 == 1) {
                        k(list3, size4, true);
                    } else if (i4 == 2) {
                        k(list3, size4, false);
                    } else if (i4 == 3) {
                        l(list3, size4, true);
                    } else if (i4 == 4) {
                        l(list3, size4, false);
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = linkedHashMap.values().iterator();
        while (it4.hasNext()) {
            for (Size size5 : (List) it4.next()) {
                if (!arrayList3.contains(size5)) {
                    arrayList3.add(size5);
                }
            }
        }
        C1724Vw0 c1724Vw0 = c3775fS0.c;
        if (c1724Vw0 == null) {
            return arrayList3;
        }
        AbstractC4346iR1.b(AbstractC4346iR1.d(i), i2, i3 == 1);
        ArrayList arrayList4 = new ArrayList(arrayList3);
        Size size6 = (Size) c1724Vw0.b;
        List listW = AbstractC8069xu.W(arrayList4, new C4243hv(1, new InterfaceC6099nZ[]{new C3966gS0(size6, 0), new C3966gS0(size6, 1)}));
        if (arrayList3.containsAll(listW)) {
            return listW;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    public static void k(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void l(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public synchronized String a() {
        try {
            if (((String) this.d) == null) {
                i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.d;
    }

    public synchronized String b() {
        try {
            if (((String) this.e) == null) {
                i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List e(defpackage.InterfaceC5361jh1 r15) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0462Fr0.e(jh1):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0045 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {, blocks: (B:48:0x0001, B:53:0x000a, B:58:0x0020, B:60:0x0026, B:62:0x0038, B:64:0x003e, B:69:0x0045, B:71:0x0058, B:73:0x005e, B:76:0x0063, B:78:0x0069, B:80:0x006e, B:79:0x006c), top: B:88:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.b     // Catch: java.lang.Throwable -> L43
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            goto L71
        La:
            java.lang.Object r0 = r5.c     // Catch: java.lang.Throwable -> L43
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L43
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r3 = r0.checkPermission(r3, r4)     // Catch: java.lang.Throwable -> L43
            r4 = -1
            if (r3 != r4) goto L20
            monitor-exit(r5)
            r0 = r2
            goto L71
        L20:
            boolean r3 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L45
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L43
            java.util.List r3 = r0.queryIntentServices(r3, r2)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L45
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L43
            if (r3 <= 0) goto L45
            r5.b = r1     // Catch: java.lang.Throwable -> L43
            monitor-exit(r5)
            r0 = r1
            goto L71
        L43:
            r0 = move-exception
            goto L76
        L45:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L43
            java.util.List r0 = r0.queryBroadcastReceivers(r3, r2)     // Catch: java.lang.Throwable -> L43
            r3 = 2
            if (r0 == 0) goto L63
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L43
            if (r0 <= 0) goto L63
            r5.b = r3     // Catch: java.lang.Throwable -> L43
            monitor-exit(r5)
            r0 = r3
            goto L71
        L63:
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L6c
            r5.b = r3     // Catch: java.lang.Throwable -> L43
            goto L6e
        L6c:
            r5.b = r1     // Catch: java.lang.Throwable -> L43
        L6e:
            int r0 = r5.b     // Catch: java.lang.Throwable -> L43
            monitor-exit(r5)
        L71:
            if (r0 == 0) goto L74
            goto L75
        L74:
            r1 = r2
        L75:
            return r1
        L76:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L43
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0462Fr0.h():boolean");
    }

    public synchronized void i() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.c).getPackageManager().getPackageInfo(((Context) this.c).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.d = Integer.toString(packageInfo.versionCode);
            this.e = packageInfo.versionName;
        }
    }

    public C0462Fr0(InterfaceC6907ro interfaceC6907ro, Size size) {
        Rational rational;
        this.c = interfaceC6907ro;
        this.a = interfaceC6907ro.c();
        this.b = interfaceC6907ro.j();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listW = interfaceC6907ro.w(256);
            if (listW.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listW, new C3479dv(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.d = rational;
        C5426k20 c5426k20 = new C5426k20();
        c5426k20.a = interfaceC6907ro.c();
        c5426k20.b = interfaceC6907ro.j();
        c5426k20.d = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        c5426k20.c = z;
        this.e = c5426k20;
    }
}
