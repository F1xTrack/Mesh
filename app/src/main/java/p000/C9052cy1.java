package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.yandex.varioqub.config.model.ConfigValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* renamed from: cy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9052cy1 {

    /* renamed from: a */
    public final String f25731a;

    /* renamed from: b */
    public final int f25732b;

    /* renamed from: c */
    public Boolean f25733c;

    /* renamed from: d */
    public Boolean f25734d;

    /* renamed from: e */
    public Long f25735e;

    /* renamed from: f */
    public Long f25736f;

    /* renamed from: g */
    public final /* synthetic */ int f25737g;

    /* renamed from: h */
    public final /* synthetic */ C10986s32 f25738h;

    /* renamed from: i */
    public final AbstractC10908rS1 f25739i;

    public C9052cy1(C10986s32 c10986s32, String str, int i, AbstractC10908rS1 abstractC10908rS1, int i2) {
        this.f25737g = i2;
        this.f25738h = c10986s32;
        this.f25731a = str;
        this.f25732b = i;
        this.f25739i = abstractC10908rS1;
    }

    /* renamed from: a */
    public static Boolean m17439a(long j, C11402vJ1 c11402vJ1) {
        try {
            return m17442d(new BigDecimal(j), c11402vJ1, ConfigValue.DOUBLE_DEFAULT_VALUE);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Boolean m17440b(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: c */
    public static Boolean m17441c(String str, C11783yJ1 c11783yJ1, OL1 ol1) {
        List listM26128q;
        Preconditions.checkNotNull(c11783yJ1);
        if (str == null || !c11783yJ1.m26132u() || c11783yJ1.m26126n() == 1) {
            return null;
        }
        if (c11783yJ1.m26126n() == 7) {
            if (c11783yJ1.m26125m() == 0) {
                return null;
            }
        } else if (!c11783yJ1.m26131t()) {
            return null;
        }
        int iM26126n = c11783yJ1.m26126n();
        boolean zM26129r = c11783yJ1.m26129r();
        String strM26127p = (zM26129r || iM26126n == 2 || iM26126n == 7) ? c11783yJ1.m26127p() : c11783yJ1.m26127p().toUpperCase(Locale.ENGLISH);
        if (c11783yJ1.m26125m() == 0) {
            listM26128q = null;
        } else {
            listM26128q = c11783yJ1.m26128q();
            if (!zM26129r) {
                ArrayList arrayList = new ArrayList(listM26128q.size());
                Iterator it = listM26128q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listM26128q = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = iM26126n == 2 ? strM26127p : null;
        if (iM26126n == 7) {
            if (listM26128q == null || listM26128q.isEmpty()) {
                return null;
            }
        } else if (strM26127p == null) {
            return null;
        }
        if (!zM26129r && iM26126n != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (AbstractC9322f32.f27029a[AbstractC7222ym.m26247x(iM26126n)]) {
            case 1:
                if (str2 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        ol1.f8381j.m24554c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                        return null;
                    }
                }
                break;
            case 6:
                if (listM26128q != null) {
                    break;
                }
                break;
        }
        return null;
    }

    /* renamed from: d */
    public static Boolean m17442d(BigDecimal bigDecimal, C11402vJ1 c11402vJ1, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(c11402vJ1);
        if (c11402vJ1.m25394s()) {
            if (c11402vJ1.m25389m() != 1) {
                if (c11402vJ1.m25389m() == 5) {
                    if (!c11402vJ1.m25398w() || !c11402vJ1.m25397v()) {
                        return null;
                    }
                } else if (!c11402vJ1.m25395t()) {
                    return null;
                }
                int iM25389m = c11402vJ1.m25389m();
                if (c11402vJ1.m25389m() == 5) {
                    if (C8997cZ1.m10773f2(c11402vJ1.m25392q()) && C8997cZ1.m10773f2(c11402vJ1.m25391p())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c11402vJ1.m25392q());
                            bigDecimal4 = new BigDecimal(c11402vJ1.m25391p());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!C8997cZ1.m10773f2(c11402vJ1.m25390o())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c11402vJ1.m25390o());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iM25389m == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 != null) {
                }
                int i = AbstractC9322f32.f27030b[AbstractC7222ym.m26247x(iM25389m)];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4 && bigDecimal3 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                            }
                            return null;
                        }
                        if (bigDecimal2 != null) {
                            if (d != ConfigValue.DOUBLE_DEFAULT_VALUE) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                            }
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                    } else if (bigDecimal2 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0165  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m17443e(java.lang.Long r17, java.lang.Long r18, p000.KK1 r19, long r20, p000.C10618pB1 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9052cy1.m17443e(java.lang.Long, java.lang.Long, KK1, long, pB1, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public boolean m17444f(Long l, Long l2, C8969cL1 c8969cL1, boolean z) {
        CX1.m1205a();
        C10986s32 c10986s32 = this.f25738h;
        boolean zM6511E1 = ((C9110dP1) c10986s32.f11615b).f26037g.m6511E1(this.f25731a, IB1.f4835y0);
        C11656xJ1 c11656xJ1 = (C11656xJ1) this.f25739i;
        boolean zM25832r = c11656xJ1.m25832r();
        boolean zM25833s = c11656xJ1.m25833s();
        boolean zM25834t = c11656xJ1.m25834t();
        byte b = zM25832r || zM25833s || zM25834t;
        Boolean boolM17440b = null;
        boolM17442d = null;
        Boolean boolM17442d = null;
        boolM17440b = null;
        boolM17440b = null;
        boolM17440b = null;
        Boolean boolM17442d2 = null;
        boolM17440b = null;
        if (z && b != true) {
            c10986s32.mo6070n().f8386o.m24553b(Integer.valueOf(this.f25732b), c11656xJ1.m25835u() ? Integer.valueOf(c11656xJ1.m25829m()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        C11146tJ1 c11146tJ1M25830o = c11656xJ1.m25830o();
        boolean zM24870r = c11146tJ1M25830o.m24870r();
        boolean zM10683D = c8969cL1.m10683D();
        C9110dP1 c9110dP1 = (C9110dP1) c10986s32.f11615b;
        if (zM10683D) {
            if (c11146tJ1M25830o.m24872t()) {
                boolM17440b = m17440b(m17439a(c8969cL1.m10688v(), c11146tJ1M25830o.m24867o()), zM24870r);
            } else {
                c10986s32.mo6070n().f8381j.m24554c(c9110dP1.f26043m.m2167g(c8969cL1.m10690z()), "No number filter for long property. property");
            }
        } else if (c8969cL1.m10681B()) {
            if (c11146tJ1M25830o.m24872t()) {
                double dM10686m = c8969cL1.m10686m();
                try {
                    boolM17442d = m17442d(new BigDecimal(dM10686m), c11146tJ1M25830o.m24867o(), Math.ulp(dM10686m));
                } catch (NumberFormatException unused) {
                }
                boolM17440b = m17440b(boolM17442d, zM24870r);
            } else {
                c10986s32.mo6070n().f8381j.m24554c(c9110dP1.f26043m.m2167g(c8969cL1.m10690z()), "No number filter for double property. property");
            }
        } else if (!c8969cL1.m10685F()) {
            c10986s32.mo6070n().f8381j.m24554c(c9110dP1.f26043m.m2167g(c8969cL1.m10690z()), "User property has no value, property");
        } else if (c11146tJ1M25830o.m24874v()) {
            boolM17440b = m17440b(m17441c(c8969cL1.m10680A(), c11146tJ1M25830o.m24868p(), c10986s32.mo6070n()), zM24870r);
        } else if (!c11146tJ1M25830o.m24872t()) {
            c10986s32.mo6070n().f8381j.m24554c(c9110dP1.f26043m.m2167g(c8969cL1.m10690z()), "No string or number filter defined. property");
        } else if (C8997cZ1.m10773f2(c8969cL1.m10680A())) {
            String strM10680A = c8969cL1.m10680A();
            C11402vJ1 c11402vJ1M24867o = c11146tJ1M25830o.m24867o();
            if (C8997cZ1.m10773f2(strM10680A)) {
                try {
                    boolM17442d2 = m17442d(new BigDecimal(strM10680A), c11402vJ1M24867o, ConfigValue.DOUBLE_DEFAULT_VALUE);
                } catch (NumberFormatException unused2) {
                }
            }
            boolM17440b = m17440b(boolM17442d2, zM24870r);
        } else {
            c10986s32.mo6070n().f8381j.m24553b(c9110dP1.f26043m.m2167g(c8969cL1.m10690z()), c8969cL1.m10680A(), "Invalid user property value for Numeric number filter. property, value");
        }
        c10986s32.mo6070n().f8386o.m24554c(boolM17440b == null ? "null" : boolM17440b, "Property filter result");
        if (boolM17440b == null) {
            return false;
        }
        this.f25733c = Boolean.TRUE;
        if (zM25834t && !boolM17440b.booleanValue()) {
            return true;
        }
        if (!z || c11656xJ1.m25832r()) {
            this.f25734d = boolM17440b;
        }
        if (boolM17440b.booleanValue() && b != false && c8969cL1.m10684E()) {
            long jM10689x = c8969cL1.m10689x();
            if (l != null) {
                jM10689x = l.longValue();
            }
            if (zM6511E1 && c11656xJ1.m25832r() && !c11656xJ1.m25833s() && l2 != null) {
                jM10689x = l2.longValue();
            }
            if (c11656xJ1.m25833s()) {
                this.f25736f = Long.valueOf(jM10689x);
            } else {
                this.f25735e = Long.valueOf(jM10689x);
            }
        }
        return true;
    }
}
