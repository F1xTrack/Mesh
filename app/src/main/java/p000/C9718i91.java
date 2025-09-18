package p000;

import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: i91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9718i91 {

    /* renamed from: a */
    public float f28841a;

    /* renamed from: b */
    public boolean f28842b;

    /* renamed from: c */
    public boolean f28843c;

    /* renamed from: d */
    public int f28844d;

    /* renamed from: e */
    public boolean f28845e;

    /* renamed from: f */
    public int f28846f;

    /* renamed from: g */
    public int f28847g;

    /* renamed from: h */
    public float f28848h;

    /* renamed from: i */
    public float f28849i;

    /* renamed from: j */
    public float f28850j;

    /* renamed from: k */
    public float f28851k;

    /* renamed from: l */
    public float f28852l;

    /* renamed from: m */
    public float f28853m;

    /* renamed from: n */
    public int f28854n;

    /* renamed from: o */
    public boolean f28855o;

    /* renamed from: p */
    public boolean f28856p;

    /* renamed from: q */
    public EnumC11528wJ0 f28857q;

    /* renamed from: r */
    public EnumC11655xJ0 f28858r;

    /* renamed from: s */
    public int f28859s;

    /* renamed from: t */
    public int f28860t;

    /* renamed from: u */
    public String f28861u;

    /* renamed from: v */
    public String f28862v;

    /* renamed from: w */
    public int f28863w;

    /* renamed from: a */
    public static int m18974a(int i, NM0 nm0) {
        return !nm0.f7734a.hasKey("textAlign") ? i : (!"justify".equals(nm0.f7734a.getString("textAlign")) || Build.VERSION.SDK_INT < 26) ? 0 : 1;
    }

    /* renamed from: b */
    public static int m18975b(String str) {
        if (str == null || StringUtils.UNDEFINED.equals(str)) {
            return -1;
        }
        if ("rtl".equals(str)) {
            return 1;
        }
        if ("ltr".equals(str)) {
            return 0;
        }
        "Invalid layoutDirection: ".concat(str);
        AbstractC3929dS.m17683p("ReactNative");
        return -1;
    }

    /* renamed from: c */
    public final float m18976c() {
        float fM25404c = this.f28843c ? AbstractC11406vL1.m25404c(this.f28850j, Float.NaN) : AbstractC11406vL1.m25403b(this.f28850j);
        int i = this.f28847g;
        if (i > 0) {
            return fM25404c / i;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.f28847g);
    }

    /* renamed from: d */
    public final void m18977d(float f) {
        this.f28848h = f;
        if (f != -1.0f) {
            f = (float) (this.f28843c ? Math.ceil(AbstractC11406vL1.m25404c(f, Float.NaN)) : Math.ceil(AbstractC11406vL1.m25403b(f)));
        }
        this.f28847g = (int) f;
    }
}
