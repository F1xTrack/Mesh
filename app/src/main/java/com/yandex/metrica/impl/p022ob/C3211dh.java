package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.BuildConfig;

/* renamed from: com.yandex.metrica.impl.ob.dh */
/* loaded from: classes2.dex */
public class C3211dh {

    /* renamed from: a */
    private String f23258a;

    /* renamed from: b */
    private C3168c0 f23259b;

    /* renamed from: c */
    private C3690w2 f23260c;

    /* renamed from: d */
    private final String f23261d = m15766z();

    /* renamed from: e */
    private String f23262e = C2494B2.m13905a();

    /* renamed from: f */
    private String f23263f;

    /* renamed from: g */
    private String f23264g;

    /* renamed from: h */
    private C3310hc f23265h;

    /* renamed from: i */
    private C3284gc f23266i;

    /* renamed from: j */
    private String f23267j;

    /* renamed from: k */
    private String f23268k;

    /* renamed from: l */
    private C2885Qi f23269l;

    /* renamed from: com.yandex.metrica.impl.ob.dh$a */
    public static abstract class a<I, O> implements InterfaceC3185ch<I, O> {

        /* renamed from: a */
        public final String f23270a;

        /* renamed from: b */
        public final String f23271b;

        /* renamed from: c */
        public final String f23272c;

        public a(String str, String str2, String str3) {
            this.f23270a = str;
            this.f23271b = str2;
            this.f23272c = str3;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$b */
    public static abstract class b<T extends C3211dh, A extends a> implements d<T, c<A>> {

        /* renamed from: a */
        final Context f23273a;

        /* renamed from: b */
        final String f23274b;

        public b(Context context, String str) {
            this.f23273a = context;
            this.f23274b = str;
        }

        /* renamed from: a */
        public abstract T mo15421a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$c */
    public static class c<A> {

        /* renamed from: a */
        public final C2885Qi f23275a;

        /* renamed from: b */
        public final A f23276b;

        public c(C2885Qi c2885Qi, A a) {
            this.f23275a = c2885Qi;
            this.f23276b = a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$d */
    public interface d<T extends C3211dh, D> {
        /* renamed from: a */
        T mo14785a(D d);
    }

    /* renamed from: z */
    private static String m15766z() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty("public")) {
            sb.append("public");
        }
        if (!TextUtils.isEmpty(BuildConfig.SDK_DEPENDENCY)) {
            sb.append("_binary");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("_");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m15769a(C3168c0 c3168c0) {
        this.f23259b = c3168c0;
    }

    /* renamed from: b */
    public String m15774b() {
        String str = this.f23264g;
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public String m15776c() {
        return this.f23262e;
    }

    /* renamed from: d */
    public synchronized String m15778d() {
        String strM16042a;
        C3310hc c3310hc = this.f23265h;
        strM16042a = c3310hc == null ? null : c3310hc.m16042a();
        if (strM16042a == null) {
            strM16042a = "";
        }
        return strM16042a;
    }

    /* renamed from: e */
    public void m15781e(String str) {
        this.f23258a = str;
    }

    /* renamed from: f */
    public String m15782f() {
        String str = this.f23263f;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public synchronized String m15783g() {
        String strM14883i;
        strM14883i = this.f23269l.m14883i();
        if (strM14883i == null) {
            strM14883i = "";
        }
        return strM14883i;
    }

    /* renamed from: h */
    public synchronized String m15784h() {
        String strM14884j;
        strM14884j = this.f23269l.m14884j();
        if (strM14884j == null) {
            strM14884j = "";
        }
        return strM14884j;
    }

    /* renamed from: i */
    public String m15785i() {
        return this.f23259b.f23171e;
    }

    /* renamed from: j */
    public String m15786j() {
        String str = this.f23267j;
        return str == null ? "phone" : str;
    }

    /* renamed from: k */
    public String m15787k() {
        return this.f23261d;
    }

    /* renamed from: l */
    public String m15788l() {
        String str = this.f23268k;
        return str == null ? "" : str;
    }

    /* renamed from: m */
    public String m15789m() {
        String str = this.f23259b.f23167a;
        return str == null ? "" : str;
    }

    /* renamed from: n */
    public String m15790n() {
        return this.f23259b.f23168b;
    }

    /* renamed from: o */
    public int m15791o() {
        return this.f23259b.f23170d;
    }

    /* renamed from: p */
    public String m15792p() {
        return this.f23259b.f23169c;
    }

    /* renamed from: q */
    public String m15793q() {
        return this.f23258a;
    }

    /* renamed from: r */
    public C2535Ci m15794r() {
        return this.f23269l.m14861J();
    }

    /* renamed from: s */
    public float m15795s() {
        return this.f23260c.m17111d();
    }

    /* renamed from: t */
    public int m15796t() {
        return this.f23260c.m17109b();
    }

    /* renamed from: u */
    public int m15797u() {
        return this.f23260c.m17110c();
    }

    /* renamed from: v */
    public int m15798v() {
        return this.f23260c.m17112e();
    }

    /* renamed from: w */
    public C2885Qi m15799w() {
        return this.f23269l;
    }

    /* renamed from: x */
    public synchronized String m15800x() {
        String strM14873V;
        strM14873V = this.f23269l.m14873V();
        if (strM14873V == null) {
            strM14873V = "";
        }
        return strM14873V;
    }

    /* renamed from: y */
    public synchronized boolean m15801y() {
        return C2835Oi.m14715a(this.f23269l);
    }

    /* renamed from: a */
    public void m15772a(C3690w2 c3690w2) {
        this.f23260c = c3690w2;
    }

    /* renamed from: b */
    public void m15775b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f23263f = str;
    }

    /* renamed from: c */
    public void m15777c(String str) {
        this.f23267j = str;
    }

    /* renamed from: d */
    public final void m15779d(String str) {
        this.f23268k = str;
    }

    /* renamed from: e */
    public synchronized String m15780e() {
        String str;
        C3310hc c3310hc = this.f23265h;
        str = c3310hc == null ? null : c3310hc.m16043b().f9832a;
        if (str == null) {
            str = "";
        }
        return str;
    }

    /* renamed from: a */
    public void m15768a(C2885Qi c2885Qi) {
        this.f23269l = c2885Qi;
    }

    /* renamed from: a */
    public void m15773a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f23264g = str;
    }

    /* renamed from: a */
    public synchronized void m15771a(C3310hc c3310hc) {
        this.f23265h = c3310hc;
    }

    /* renamed from: a */
    public C3284gc m15767a() {
        return this.f23266i;
    }

    /* renamed from: a */
    public void m15770a(C3284gc c3284gc) {
        this.f23266i = c3284gc;
    }
}
