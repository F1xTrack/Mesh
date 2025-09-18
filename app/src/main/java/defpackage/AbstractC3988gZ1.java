package defpackage;

import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;
import java.util.List;

/* renamed from: gZ1 */
/* loaded from: classes.dex */
public abstract class AbstractC3988gZ1 {
    public static CC0 a;
    public static C6860rY0 b;
    public static String c;

    public static C6860rY0 a(ReactContext reactContext, PE pe, HashMap map) {
        if (II1.e == null) {
            II1.e = new C6363ox0(II1.d());
        }
        C6363ox0 c6363ox0 = II1.e;
        InterfaceC4255hz interfaceC4255hz = c6363ox0.j;
        O90.d(interfaceC4255hz, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer");
        ((TJ0) ((InterfaceC5222iz) interfaceC4255hz)).a = new G10(new C7620vX());
        C6860rY0 c6860rY0 = new C6860rY0(c6363ox0);
        c6860rY0.e = pe;
        if (map != null) {
            N8 n8 = (N8) c6860rY0.c;
            synchronized (n8) {
                n8.c = null;
                ((HashMap) n8.b).clear();
                ((HashMap) n8.b).putAll(map);
            }
            if (!map.containsKey("User-Agent")) {
                c6860rY0.b = c(reactContext);
            }
        } else {
            c6860rY0.b = c(reactContext);
        }
        return c6860rY0;
    }

    public static final WC b(ReactContext reactContext, PE pe, HashMap map) {
        O90.f(reactContext, "context");
        if (a == null || (map != null && !map.isEmpty())) {
            a = new CC0(reactContext, a(reactContext, pe, map));
        }
        CC0 cc0 = a;
        O90.d(cc0, "null cannot be cast to non-null type androidx.media3.datasource.DataSource.Factory");
        return cc0;
    }

    public static String c(ReactContext reactContext) {
        String str;
        if (c == null) {
            String packageName = reactContext.getPackageName();
            int i = AbstractC0277Dh1.a;
            try {
                str = reactContext.getPackageManager().getPackageInfo(reactContext.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "?";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(packageName);
            sb.append("/");
            sb.append(str);
            sb.append(" (Linux;Android ");
            c = AbstractC1705Vq.l(sb, Build.VERSION.RELEASE, ") AndroidXMedia3/1.4.1");
        }
        String str2 = c;
        O90.d(str2, "null cannot be cast to non-null type kotlin.String");
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.C0733Jd1 d(defpackage.C0733Jd1 r5, defpackage.I5 r6) {
        /*
            java.lang.String r0 = "<this>"
            defpackage.O90.f(r5, r0)
            I5 r0 = defpackage.M5.a(r5)
            if (r0 != r6) goto Lc
            return r5
        Lc:
            mf0[] r0 = defpackage.M5.a
            r1 = 0
            r0 = r0[r1]
            eG r1 = defpackage.M5.b
            java.lang.Object r0 = r1.getValue(r5, r0)
            L5 r0 = (defpackage.L5) r0
            if (r0 == 0) goto L5f
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L23
        L21:
            r0 = r5
            goto L5b
        L23:
            w8 r1 = r5.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()
            r4 = r3
            L5 r4 = (defpackage.L5) r4
            boolean r4 = defpackage.O90.a(r4, r0)
            if (r4 != 0) goto L2e
            r2.add(r3)
            goto L2e
        L45:
            int r0 = r2.size()
            w8 r1 = r5.a
            int r1 = r1.b()
            if (r0 != r1) goto L52
            goto L21
        L52:
            CC0 r0 = defpackage.C0733Jd1.b
            r0.getClass()
            Jd1 r0 = defpackage.CC0.J0(r2)
        L5b:
            if (r0 != 0) goto L5e
            goto L5f
        L5e:
            r5 = r0
        L5f:
            java.util.Iterator r0 = r6.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L70
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L70
            return r5
        L70:
            L5 r0 = new L5
            r0.<init>(r6)
            IP0 r6 = defpackage.BP0.a
            java.lang.Class<L5> r1 = defpackage.L5.class
            Vd0 r6 = r6.b(r1)
            CC0 r1 = defpackage.C0733Jd1.b
            r1.getClass()
            java.lang.String r6 = r6.a()
            defpackage.O90.c(r6)
            int r6 = r1.W0(r6)
            w8 r1 = r5.a
            java.lang.Object r6 = r1.get(r6)
            if (r6 == 0) goto L96
            goto Lb4
        L96:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto La6
            Jd1 r5 = new Jd1
            java.util.List r6 = defpackage.AbstractC8259yu.e(r0)
            r5.<init>(r6)
            goto Lb4
        La6:
            java.util.List r5 = defpackage.AbstractC8069xu.b0(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.ArrayList r5 = defpackage.AbstractC8069xu.O(r5, r0)
            Jd1 r5 = defpackage.CC0.J0(r5)
        Lb4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3988gZ1.d(Jd1, I5):Jd1");
    }

    public static final C0733Jd1 e(I5 i5) {
        O90.f(i5, "<this>");
        if (i5.isEmpty()) {
            C0733Jd1.b.getClass();
            return C0733Jd1.c;
        }
        CC0 cc0 = C0733Jd1.b;
        List listE = AbstractC8259yu.e(new L5(i5));
        cc0.getClass();
        return CC0.J0(listE);
    }
}
