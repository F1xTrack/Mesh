package p000;

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
public final class C7608Fr0 {

    /* renamed from: a */
    public int f3444a;

    /* renamed from: b */
    public int f3445b;

    /* renamed from: c */
    public final Object f3446c;

    /* renamed from: d */
    public Object f3447d;

    /* renamed from: e */
    public Object f3448e;

    public C7608Fr0(Context context) {
        this.f3445b = 0;
        this.f3446c = context;
    }

    /* renamed from: c */
    public static String m2794c(C0786MU c0786mu) {
        c0786mu.m5379a();
        C4057fV c4057fV = c0786mu.f7176c;
        String str = c4057fV.f27222e;
        if (str != null) {
            return str;
        }
        c0786mu.m5379a();
        String str2 = c4057fV.f27219b;
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

    /* renamed from: d */
    public static ArrayList m2795d(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC1456X8.f13568a);
        arrayList.add(AbstractC1456X8.f13570c);
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
                    if (AbstractC1456X8.m8936a(size, (Rational) it2.next(), AbstractC9318f21.f27018c)) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static Rational m2796f(int i, boolean z) {
        if (i != -1) {
            if (i == 0) {
                return z ? AbstractC1456X8.f13568a : AbstractC1456X8.f13569b;
            }
            if (i == 1) {
                return z ? AbstractC1456X8.f13570c : AbstractC1456X8.f13571d;
            }
            AbstractC7806Jm0.m4412f("SupportedOutputSizesCollector");
        }
        return null;
    }

    /* renamed from: g */
    public static HashMap m2797g(List list) {
        HashMap map = new HashMap();
        Iterator it = m2795d(list).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (AbstractC1456X8.m8936a(size, rational, AbstractC9318f21.f27018c)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    /* renamed from: j */
    public static List m2798j(C9371fS0 c9371fS0, List list, Size size, int i, Rational rational, int i2, int i3) {
        C8326Tm0 c8326Tm0 = c9371fS0.f27203a;
        HashMap mapM2797g = m2797g(list);
        boolean z = rational == null || rational.getNumerator() >= rational.getDenominator();
        c8326Tm0.getClass();
        Rational rationalM2796f = m2796f(0, z);
        ArrayList arrayList = new ArrayList(mapM2797g.keySet());
        Collections.sort(arrayList, new C1393W8(rationalM2796f, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Rational rational2 = (Rational) it.next();
            linkedHashMap.put(rational2, (List) mapM2797g.get(rational2));
        }
        if (size != null) {
            Size size2 = AbstractC9318f21.f27016a;
            int height = size.getHeight() * size.getWidth();
            Iterator it2 = linkedHashMap.keySet().iterator();
            while (it2.hasNext()) {
                List<Size> list2 = (List) linkedHashMap.get((Rational) it2.next());
                ArrayList arrayList2 = new ArrayList();
                for (Size size3 : list2) {
                    if (AbstractC9318f21.m18157a(size3) <= height) {
                        arrayList2.add(size3);
                    }
                }
                list2.clear();
                list2.addAll(arrayList2);
            }
        }
        C9627hS0 c9627hS0 = c9371fS0.f27204b;
        if (c9627hS0 != null) {
            Iterator it3 = linkedHashMap.keySet().iterator();
            while (it3.hasNext()) {
                List list3 = (List) linkedHashMap.get((Rational) it3.next());
                if (!list3.isEmpty() && !c9627hS0.equals(C9627hS0.f28420c)) {
                    int i4 = c9627hS0.f28422b;
                    Size size4 = c9627hS0.f28421a;
                    if (i4 == 0) {
                        boolean zContains = list3.contains(size4);
                        list3.clear();
                        if (zContains) {
                            list3.add(size4);
                        }
                    } else if (i4 == 1) {
                        m2799k(list3, size4, true);
                    } else if (i4 == 2) {
                        m2799k(list3, size4, false);
                    } else if (i4 == 3) {
                        m2800l(list3, size4, true);
                    } else if (i4 == 4) {
                        m2800l(list3, size4, false);
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
        C8450Vw0 c8450Vw0 = c9371fS0.f27205c;
        if (c8450Vw0 == null) {
            return arrayList3;
        }
        AbstractC9754iR1.m19038b(AbstractC9754iR1.m19040d(i), i2, i3 == 1);
        ArrayList arrayList4 = new ArrayList(arrayList3);
        Size size6 = (Size) c8450Vw0.f12875b;
        List listM25977W = AbstractC7167xu.m25977W(arrayList4, new C4209hv(1, new InterfaceC6497nZ[]{new C9499gS0(size6, 0), new C9499gS0(size6, 1)}));
        if (arrayList3.containsAll(listM25977W)) {
            return listM25977W;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    /* renamed from: k */
    public static void m2799k(List list, Size size, boolean z) {
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

    /* renamed from: l */
    public static void m2800l(List list, Size size, boolean z) {
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

    /* renamed from: a */
    public synchronized String m2801a() {
        try {
            if (((String) this.f3447d) == null) {
                m2805i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f3447d;
    }

    /* renamed from: b */
    public synchronized String m2802b() {
        try {
            if (((String) this.f3448e) == null) {
                m2805i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f3448e;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x00a5  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List m2803e(p000.InterfaceC9914jh1 r15) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7608Fr0.m2803e(jh1):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0045 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {, blocks: (B:48:0x0001, B:53:0x000a, B:58:0x0020, B:60:0x0026, B:62:0x0038, B:64:0x003e, B:69:0x0045, B:71:0x0058, B:73:0x005e, B:76:0x0063, B:78:0x0069, B:80:0x006e, B:79:0x006c), top: B:88:0x0001 }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m2804h() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f3445b     // Catch: java.lang.Throwable -> L43
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            goto L71
        La:
            java.lang.Object r0 = r5.f3446c     // Catch: java.lang.Throwable -> L43
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
            r5.f3445b = r1     // Catch: java.lang.Throwable -> L43
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
            r5.f3445b = r3     // Catch: java.lang.Throwable -> L43
            monitor-exit(r5)
            r0 = r3
            goto L71
        L63:
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L6c
            r5.f3445b = r3     // Catch: java.lang.Throwable -> L43
            goto L6e
        L6c:
            r5.f3445b = r1     // Catch: java.lang.Throwable -> L43
        L6e:
            int r0 = r5.f3445b     // Catch: java.lang.Throwable -> L43
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C7608Fr0.m2804h():boolean");
    }

    /* renamed from: i */
    public synchronized void m2805i() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.f3446c).getPackageManager().getPackageInfo(((Context) this.f3446c).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f3447d = Integer.toString(packageInfo.versionCode);
            this.f3448e = packageInfo.versionName;
        }
    }

    public C7608Fr0(InterfaceC6766ro interfaceC6766ro, Size size) {
        Rational rational;
        this.f3446c = interfaceC6766ro;
        this.f3444a = interfaceC6766ro.mo2391c();
        this.f3445b = interfaceC6766ro.mo2398j();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listMo2411w = interfaceC6766ro.mo2411w(256);
            if (listMo2411w.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listMo2411w, new C3957dv(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f3447d = rational;
        C9957k20 c9957k20 = new C9957k20();
        c9957k20.f36227a = interfaceC6766ro.mo2391c();
        c9957k20.f36228b = interfaceC6766ro.mo2398j();
        c9957k20.f36230d = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        c9957k20.f36229c = z;
        this.f3448e = c9957k20;
    }
}
