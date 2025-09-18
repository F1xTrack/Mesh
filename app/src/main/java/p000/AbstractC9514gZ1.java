package p000;

import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;
import java.util.List;

/* renamed from: gZ1 */
/* loaded from: classes.dex */
public abstract class AbstractC9514gZ1 {

    /* renamed from: a */
    public static CC0 f27849a;

    /* renamed from: b */
    public static C10919rY0 f27850b;

    /* renamed from: c */
    public static String f27851c;

    /* renamed from: a */
    public static C10919rY0 m18580a(ReactContext reactContext, C0959PE c0959pe, HashMap map) {
        if (II1.f4888e == null) {
            II1.f4888e = new C10585ox0(II1.m3810d());
        }
        C10585ox0 c10585ox0 = II1.f4888e;
        InterfaceC4213hz interfaceC4213hz = c10585ox0.f39380j;
        O90.m5966d(interfaceC4213hz, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer");
        ((TJ0) ((InterfaceC6208iz) interfaceC4213hz)).f11322a = new G10(new C7018vX());
        C10919rY0 c10919rY0 = new C10919rY0(c10585ox0);
        c10919rY0.f41731e = c0959pe;
        if (map != null) {
            C0827N8 c0827n8 = (C0827N8) c10919rY0.f41729c;
            synchronized (c0827n8) {
                c0827n8.f7524c = null;
                ((HashMap) c0827n8.f7523b).clear();
                ((HashMap) c0827n8.f7523b).putAll(map);
            }
            if (!map.containsKey("User-Agent")) {
                c10919rY0.f41728b = m18582c(reactContext);
            }
        } else {
            c10919rY0.f41728b = m18582c(reactContext);
        }
        return c10919rY0;
    }

    /* renamed from: b */
    public static final InterfaceC1397WC m18581b(ReactContext reactContext, C0959PE c0959pe, HashMap map) {
        O90.m5968f(reactContext, "context");
        if (f27849a == null || (map != null && !map.isEmpty())) {
            f27849a = new CC0(reactContext, m18580a(reactContext, c0959pe, map));
        }
        CC0 cc0 = f27849a;
        O90.m5966d(cc0, "null cannot be cast to non-null type androidx.media3.datasource.DataSource.Factory");
        return cc0;
    }

    /* renamed from: c */
    public static String m18582c(ReactContext reactContext) {
        String str;
        if (f27851c == null) {
            String packageName = reactContext.getPackageName();
            int i = AbstractC7485Dh1.f2166a;
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
            f27851c = AbstractC1374Vq.m8593l(sb, Build.VERSION.RELEASE, ") AndroidXMedia3/1.4.1");
        }
        String str2 = f27851c;
        O90.m5966d(str2, "null cannot be cast to non-null type kotlin.String");
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005e  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.C7789Jd1 m18583d(p000.C7789Jd1 r5, p000.InterfaceC0510I5 r6) {
        /*
            java.lang.String r0 = "<this>"
            p000.O90.m5968f(r5, r0)
            I5 r0 = p000.AbstractC0761M5.m5256a(r5)
            if (r0 != r6) goto Lc
            return r5
        Lc:
            mf0[] r0 = p000.AbstractC0761M5.f6988a
            r1 = 0
            r0 = r0[r1]
            eG r1 = p000.AbstractC0761M5.f6989b
            java.lang.Object r0 = r1.getValue(r5, r0)
            L5 r0 = (p000.C0699L5) r0
            if (r0 == 0) goto L5f
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L23
        L21:
            r0 = r5
            goto L5b
        L23:
            w8 r1 = r5.f7533a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()
            r4 = r3
            L5 r4 = (p000.C0699L5) r4
            boolean r4 = p000.O90.m5963a(r4, r0)
            if (r4 != 0) goto L2e
            r2.add(r3)
            goto L2e
        L45:
            int r0 = r2.size()
            w8 r1 = r5.f7533a
            int r1 = r1.mo3381b()
            if (r0 != r1) goto L52
            goto L21
        L52:
            CC0 r0 = p000.C7789Jd1.f5652b
            r0.getClass()
            Jd1 r0 = p000.CC0.m1005J0(r2)
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
            IP0 r6 = p000.BP0.f799a
            java.lang.Class<L5> r1 = p000.C0699L5.class
            Vd0 r6 = r6.mo3846b(r1)
            CC0 r1 = p000.C7789Jd1.f5652b
            r1.getClass()
            java.lang.String r6 = r6.mo2806a()
            p000.O90.m5965c(r6)
            int r6 = r1.m1048W0(r6)
            w8 r1 = r5.f7533a
            java.lang.Object r6 = r1.get(r6)
            if (r6 == 0) goto L96
            goto Lb4
        L96:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto La6
            Jd1 r5 = new Jd1
            java.util.List r6 = p000.AbstractC7230yu.m26274e(r0)
            r5.<init>(r6)
            goto Lb4
        La6:
            java.util.List r5 = p000.AbstractC7167xu.m25982b0(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.ArrayList r5 = p000.AbstractC7167xu.m25969O(r5, r0)
            Jd1 r5 = p000.CC0.m1005J0(r5)
        Lb4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC9514gZ1.m18583d(Jd1, I5):Jd1");
    }

    /* renamed from: e */
    public static final C7789Jd1 m18584e(InterfaceC0510I5 interfaceC0510I5) {
        O90.m5968f(interfaceC0510I5, "<this>");
        if (interfaceC0510I5.isEmpty()) {
            C7789Jd1.f5652b.getClass();
            return C7789Jd1.f5653c;
        }
        CC0 cc0 = C7789Jd1.f5652b;
        List listM26274e = AbstractC7230yu.m26274e(new C0699L5(interfaceC0510I5));
        cc0.getClass();
        return CC0.m1005J0(listM26274e);
    }
}
