package defpackage;

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
public final class C3300cy1 {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ C6959s32 h;
    public final AbstractC6843rS1 i;

    public C3300cy1(C6959s32 c6959s32, String str, int i, AbstractC6843rS1 abstractC6843rS1, int i2) {
        this.g = i2;
        this.h = c6959s32;
        this.a = str;
        this.b = i;
        this.i = abstractC6843rS1;
    }

    public static Boolean a(long j, C7580vJ1 c7580vJ1) {
        try {
            return d(new BigDecimal(j), c7580vJ1, ConfigValue.DOUBLE_DEFAULT_VALUE);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean b(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public static Boolean c(String str, C8150yJ1 c8150yJ1, OL1 ol1) {
        List listQ;
        Preconditions.checkNotNull(c8150yJ1);
        if (str == null || !c8150yJ1.u() || c8150yJ1.n() == 1) {
            return null;
        }
        if (c8150yJ1.n() == 7) {
            if (c8150yJ1.m() == 0) {
                return null;
            }
        } else if (!c8150yJ1.t()) {
            return null;
        }
        int iN = c8150yJ1.n();
        boolean zR = c8150yJ1.r();
        String strP = (zR || iN == 2 || iN == 7) ? c8150yJ1.p() : c8150yJ1.p().toUpperCase(Locale.ENGLISH);
        if (c8150yJ1.m() == 0) {
            listQ = null;
        } else {
            listQ = c8150yJ1.q();
            if (!zR) {
                ArrayList arrayList = new ArrayList(listQ.size());
                Iterator it = listQ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listQ = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = iN == 2 ? strP : null;
        if (iN == 7) {
            if (listQ == null || listQ.isEmpty()) {
                return null;
            }
        } else if (strP == null) {
            return null;
        }
        if (!zR && iN != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (AbstractC3701f32.a[AbstractC8235ym.x(iN)]) {
            case 1:
                if (str2 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        ol1.j.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                        return null;
                    }
                }
                break;
            case 6:
                if (listQ != null) {
                    break;
                }
                break;
        }
        return null;
    }

    public static Boolean d(BigDecimal bigDecimal, C7580vJ1 c7580vJ1, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(c7580vJ1);
        if (c7580vJ1.s()) {
            if (c7580vJ1.m() != 1) {
                if (c7580vJ1.m() == 5) {
                    if (!c7580vJ1.w() || !c7580vJ1.v()) {
                        return null;
                    }
                } else if (!c7580vJ1.t()) {
                    return null;
                }
                int iM = c7580vJ1.m();
                if (c7580vJ1.m() == 5) {
                    if (C2540cZ1.f2(c7580vJ1.q()) && C2540cZ1.f2(c7580vJ1.p())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c7580vJ1.q());
                            bigDecimal4 = new BigDecimal(c7580vJ1.p());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!C2540cZ1.f2(c7580vJ1.o())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c7580vJ1.o());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iM == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 != null) {
                }
                int i = AbstractC3701f32.b[AbstractC8235ym.x(iM)];
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(java.lang.Long r17, java.lang.Long r18, defpackage.KK1 r19, long r20, defpackage.C6411pB1 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3300cy1.e(java.lang.Long, java.lang.Long, KK1, long, pB1, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean f(Long l, Long l2, C2498cL1 c2498cL1, boolean z) {
        CX1.a();
        C6959s32 c6959s32 = this.h;
        boolean zE1 = ((C3386dP1) c6959s32.b).g.E1(this.a, IB1.y0);
        C7960xJ1 c7960xJ1 = (C7960xJ1) this.i;
        boolean zR = c7960xJ1.r();
        boolean zS = c7960xJ1.s();
        boolean zT = c7960xJ1.t();
        byte b = zR || zS || zT;
        Boolean boolB = null;
        boolD = null;
        Boolean boolD = null;
        boolB = null;
        boolB = null;
        boolB = null;
        Boolean boolD2 = null;
        boolB = null;
        if (z && b != true) {
            c6959s32.n().o.b(Integer.valueOf(this.b), c7960xJ1.u() ? Integer.valueOf(c7960xJ1.m()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        C7198tJ1 c7198tJ1O = c7960xJ1.o();
        boolean zR2 = c7198tJ1O.r();
        boolean zD = c2498cL1.D();
        C3386dP1 c3386dP1 = (C3386dP1) c6959s32.b;
        if (zD) {
            if (c7198tJ1O.t()) {
                boolB = b(a(c2498cL1.v(), c7198tJ1O.o()), zR2);
            } else {
                c6959s32.n().j.c(c3386dP1.m.g(c2498cL1.z()), "No number filter for long property. property");
            }
        } else if (c2498cL1.B()) {
            if (c7198tJ1O.t()) {
                double dM = c2498cL1.m();
                try {
                    boolD = d(new BigDecimal(dM), c7198tJ1O.o(), Math.ulp(dM));
                } catch (NumberFormatException unused) {
                }
                boolB = b(boolD, zR2);
            } else {
                c6959s32.n().j.c(c3386dP1.m.g(c2498cL1.z()), "No number filter for double property. property");
            }
        } else if (!c2498cL1.F()) {
            c6959s32.n().j.c(c3386dP1.m.g(c2498cL1.z()), "User property has no value, property");
        } else if (c7198tJ1O.v()) {
            boolB = b(c(c2498cL1.A(), c7198tJ1O.p(), c6959s32.n()), zR2);
        } else if (!c7198tJ1O.t()) {
            c6959s32.n().j.c(c3386dP1.m.g(c2498cL1.z()), "No string or number filter defined. property");
        } else if (C2540cZ1.f2(c2498cL1.A())) {
            String strA = c2498cL1.A();
            C7580vJ1 c7580vJ1O = c7198tJ1O.o();
            if (C2540cZ1.f2(strA)) {
                try {
                    boolD2 = d(new BigDecimal(strA), c7580vJ1O, ConfigValue.DOUBLE_DEFAULT_VALUE);
                } catch (NumberFormatException unused2) {
                }
            }
            boolB = b(boolD2, zR2);
        } else {
            c6959s32.n().j.b(c3386dP1.m.g(c2498cL1.z()), c2498cL1.A(), "Invalid user property value for Numeric number filter. property, value");
        }
        c6959s32.n().o.c(boolB == null ? "null" : boolB, "Property filter result");
        if (boolB == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (zT && !boolB.booleanValue()) {
            return true;
        }
        if (!z || c7960xJ1.r()) {
            this.d = boolB;
        }
        if (boolB.booleanValue() && b != false && c2498cL1.E()) {
            long jX = c2498cL1.x();
            if (l != null) {
                jX = l.longValue();
            }
            if (zE1 && c7960xJ1.r() && !c7960xJ1.s() && l2 != null) {
                jX = l2.longValue();
            }
            if (c7960xJ1.s()) {
                this.f = Long.valueOf(jX);
            } else {
                this.e = Long.valueOf(jX);
            }
        }
        return true;
    }
}
