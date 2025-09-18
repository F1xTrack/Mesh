package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class YY1 {
    /* renamed from: a */
    public static C3976eD m9308a(AbstractC10649pR0 abstractC10649pR0, String str, C9481gJ0 c9481gJ0, int i) {
        C3914dD c3914dD = new C3914dD();
        c3914dD.f25872c = 1;
        c3914dD.f25874e = Collections.emptyMap();
        c3914dD.f25876g = -1L;
        c3914dD.f25870a = AbstractC8668a02.m9660i(str, c9481gJ0.f27670c);
        c3914dD.f25875f = c9481gJ0.f27668a;
        c3914dD.f25876g = c9481gJ0.f27669b;
        String strMo23138b = abstractC10649pR0.mo23138b();
        if (strMo23138b == null) {
            strMo23138b = AbstractC8668a02.m9660i(((C0735Lg) abstractC10649pR0.f40077b.get(0)).f6792a, c9481gJ0.f27670c).toString();
        }
        c3914dD.f25877h = strMo23138b;
        c3914dD.f25878i = i;
        c3914dD.f25874e = C10007kQ0.f36495g;
        return c3914dD.m17503a();
    }

    /* renamed from: b */
    public static C6602pC m9309b(InterfaceC1586ZC interfaceC1586ZC, Uri uri) throws IOException {
        C6728rC c6728rC = new C6728rC();
        Map mapEmptyMap = Collections.emptyMap();
        YN1.m9284i(uri, "The uri must be set.");
        C3976eD c3976eD = new C3976eD(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1);
        M41 m41 = new M41(interfaceC1586ZC);
        C9535gk0.f27975b.getAndIncrement();
        m41.f6986b = 0L;
        C1771bD c1771bD = new C1771bD(m41, c3976eD);
        try {
            c1771bD.m10434m();
            Uri uriMo2366o = interfaceC1586ZC.mo2366o();
            uriMo2366o.getClass();
            Object objMo5748i = c6728rC.mo5748i(uriMo2366o, c1771bD);
            AbstractC7485Dh1.m1823h(c1771bD);
            return (C6602pC) objMo5748i;
        } catch (Throwable th) {
            AbstractC7485Dh1.m1823h(c1771bD);
            throw th;
        }
    }

    /* renamed from: c */
    public static C10546od1 m9310c(C10546od1 c10546od1, String[] strArr, Map map) {
        int i = 0;
        if (c10546od1 == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C10546od1) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C10546od1 c10546od12 = new C10546od1();
                int length = strArr.length;
                while (i < length) {
                    c10546od12.m23515a((C10546od1) map.get(strArr[i]));
                    i++;
                }
                return c10546od12;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c10546od1.m23515a((C10546od1) map.get(strArr[0]));
                return c10546od1;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c10546od1.m23515a((C10546od1) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c10546od1;
    }
}
