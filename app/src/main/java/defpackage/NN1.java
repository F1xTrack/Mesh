package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class NN1 extends AbstractC3985gY1 implements InterfaceC3493dz1 {
    public final C7925x8 e;
    public final C7925x8 f;
    public final C7925x8 g;
    public final C7925x8 h;
    public final C7925x8 i;
    public final C7925x8 j;
    public final C5304jO1 k;
    public final C6273oT0 l;
    public final C7925x8 m;
    public final C7925x8 n;
    public final C7925x8 o;

    public NN1(C5716lY1 c5716lY1) {
        super(c5716lY1);
        this.e = new C7925x8();
        this.f = new C7925x8();
        this.g = new C7925x8();
        this.h = new C7925x8();
        this.i = new C7925x8();
        this.m = new C7925x8();
        this.n = new C7925x8();
        this.o = new C7925x8();
        this.j = new C7925x8();
        this.k = new C5304jO1(this);
        this.l = new C6273oT0(this);
    }

    public static C7925x8 D1(C5674lK1 c5674lK1) {
        C7925x8 c7925x8 = new C7925x8();
        for (C6438pK1 c6438pK1 : c5674lK1.B()) {
            c7925x8.put(c6438pK1.m(), c6438pK1.n());
        }
        return c7925x8;
    }

    public static TQ1 F1(int i) {
        int i2 = AbstractC6450pO1.b[AbstractC8235ym.x(i)];
        if (i2 == 1) {
            return TQ1.AD_STORAGE;
        }
        if (i2 == 2) {
            return TQ1.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return TQ1.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return TQ1.AD_PERSONALIZATION;
    }

    @Override // defpackage.AbstractC3985gY1
    public final boolean B1() {
        return false;
    }

    public final long C1(String str) {
        String strW0 = W0(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strW0)) {
            return 0L;
        }
        try {
            return Long.parseLong(strW0);
        } catch (NumberFormatException e) {
            OL1 ol1N = n();
            ol1N.j.b(OL1.B1(str), e, "Unable to parse timezone offset. appId");
            return 0L;
        }
    }

    public final C5674lK1 E1(String str, byte[] bArr) {
        if (bArr == null) {
            return C5674lK1.u();
        }
        try {
            C5674lK1 c5674lK1 = (C5674lK1) ((C5483kK1) C2540cZ1.P1(C5674lK1.t(), bArr)).e();
            n().o.b(c5674lK1.F() ? Long.valueOf(c5674lK1.r()) : null, c5674lK1.D() ? c5674lK1.w() : null, "Parsed config. version, gmp_app_id");
            return c5674lK1;
        } catch (VS1 e) {
            n().j.b(OL1.B1(str), e, "Unable to merge remote config. appId");
            return C5674lK1.u();
        } catch (RuntimeException e2) {
            n().j.b(OL1.B1(str), e2, "Unable to merge remote config. appId");
            return C5674lK1.u();
        }
    }

    public final EnumC3582eR1 G1(String str, TQ1 tq1) {
        v1();
        T1(str);
        C3943gK1 c3943gK1L1 = L1(str);
        EnumC3582eR1 enumC3582eR1 = EnumC3582eR1.UNINITIALIZED;
        if (c3943gK1L1 == null) {
            return enumC3582eR1;
        }
        for (C3371dK1 c3371dK1 : c3943gK1L1.q()) {
            if (F1(c3371dK1.n()) == tq1) {
                int i = AbstractC6450pO1.c[AbstractC8235ym.x(c3371dK1.m())];
                return i != 1 ? i != 2 ? enumC3582eR1 : EnumC3582eR1.GRANTED : EnumC3582eR1.DENIED;
            }
        }
        return enumC3582eR1;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x039d A[Catch: SQLiteException -> 0x03ad, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x03ad, blocks: (B:94:0x0386, B:96:0x039d), top: B:108:0x0386 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H1(java.lang.String r22, java.lang.String r23, java.lang.String r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NN1.H1(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final void I1(String str, C5483kK1 c5483kK1) {
        HashSet hashSet = new HashSet();
        C7925x8 c7925x8 = new C7925x8();
        C7925x8 c7925x82 = new C7925x8();
        C7925x8 c7925x83 = new C7925x8();
        Iterator it = Collections.unmodifiableList(((C5674lK1) c5483kK1.b).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((C4134hK1) it.next()).m());
        }
        for (int i = 0; i < ((C5674lK1) c5483kK1.b).q(); i++) {
            C4325iK1 c4325iK1 = (C4325iK1) ((C5674lK1) c5483kK1.b).n(i).j();
            if (c4325iK1.k().isEmpty()) {
                n().j.d("EventConfig contained null event name");
            } else {
                String strK = c4325iK1.k();
                String strB = L22.b(c4325iK1.k(), AbstractC6441pL1.a, AbstractC6441pL1.c);
                if (!TextUtils.isEmpty(strB)) {
                    c4325iK1.i();
                    C5292jK1.n((C5292jK1) c4325iK1.b, strB);
                    c5483kK1.i();
                    C5674lK1.p((C5674lK1) c5483kK1.b, i, (C5292jK1) c4325iK1.e());
                }
                if (((C5292jK1) c4325iK1.b).r() && ((C5292jK1) c4325iK1.b).p()) {
                    c7925x8.put(strK, Boolean.TRUE);
                }
                if (((C5292jK1) c4325iK1.b).s() && ((C5292jK1) c4325iK1.b).q()) {
                    c7925x82.put(c4325iK1.k(), Boolean.TRUE);
                }
                if (((C5292jK1) c4325iK1.b).t()) {
                    if (((C5292jK1) c4325iK1.b).m() < 2 || ((C5292jK1) c4325iK1.b).m() > 65535) {
                        OL1 ol1N = n();
                        ol1N.j.b(c4325iK1.k(), Integer.valueOf(((C5292jK1) c4325iK1.b).m()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        c7925x83.put(c4325iK1.k(), Integer.valueOf(((C5292jK1) c4325iK1.b).m()));
                    }
                }
            }
        }
        this.f.put(str, hashSet);
        this.g.put(str, c7925x8);
        this.h.put(str, c7925x82);
        this.j.put(str, c7925x83);
    }

    public final void J1(String str, C5674lK1 c5674lK1) {
        if (c5674lK1.m() == 0) {
            C5304jO1 c5304jO1 = this.k;
            if (str == null) {
                c5304jO1.getClass();
                throw new NullPointerException("key == null");
            }
            synchronized (c5304jO1) {
                try {
                    if (((LinkedHashMap) c5304jO1.f).remove(str) != null) {
                        c5304jO1.b--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        n().o.c(Integer.valueOf(c5674lK1.m()), "EES programs found");
        WL1 wl1 = (WL1) c5674lK1.A().get(0);
        try {
            PA1 pa1 = new PA1();
            RN1 rn1 = new RN1(1);
            rn1.b = this;
            rn1.c = str;
            ((HashMap) ((C5826m71) pa1.a.d).b).put("internal.remoteConfig", rn1);
            RN1 rn12 = new RN1(0);
            rn12.b = this;
            rn12.c = str;
            ((HashMap) ((C5826m71) pa1.a.d).b).put("internal.appMetadata", rn12);
            CallableC5290jK callableC5290jK = new CallableC5290jK();
            callableC5290jK.b = this;
            ((HashMap) ((C5826m71) pa1.a.d).b).put("internal.logger", callableC5290jK);
            pa1.a(wl1);
            this.k.f(str, pa1);
            n().o.b(str, Integer.valueOf(wl1.m().m()), "EES program loaded for appId, activities");
            Iterator it = wl1.m().o().iterator();
            while (it.hasNext()) {
                n().o.c(((VL1) it.next()).m(), "EES program activity");
            }
        } catch (MC1 unused) {
            n().g.c(str, "Failed to load EES program. appId");
        }
    }

    public final int K1(String str, String str2) {
        Integer num;
        v1();
        T1(str);
        Map map = (Map) this.j.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final C3943gK1 L1(String str) {
        v1();
        T1(str);
        C5674lK1 c5674lK1M1 = M1(str);
        if (c5674lK1M1 == null || !c5674lK1M1.C()) {
            return null;
        }
        return c5674lK1M1.s();
    }

    public final C5674lK1 M1(String str) {
        z1();
        v1();
        Preconditions.checkNotEmpty(str);
        T1(str);
        return (C5674lK1) this.i.getOrDefault(str, null);
    }

    public final boolean N1(String str, String str2) {
        Boolean bool;
        v1();
        T1(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.h.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean O1(String str, TQ1 tq1) {
        v1();
        T1(str);
        C3943gK1 c3943gK1L1 = L1(str);
        if (c3943gK1L1 == null) {
            return false;
        }
        Iterator it = c3943gK1L1.o().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C3371dK1 c3371dK1 = (C3371dK1) it.next();
            if (tq1 == F1(c3371dK1.n())) {
                if (c3371dK1.m() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean P1(String str, String str2) {
        Boolean bool;
        v1();
        T1(str);
        if ("1".equals(W0(str, "measurement.upload.blacklist_internal")) && C5910mZ1.A2(str2)) {
            return true;
        }
        if ("1".equals(W0(str, "measurement.upload.blacklist_public")) && C5910mZ1.C2(str2)) {
            return true;
        }
        Map map = (Map) this.g.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String Q1(String str) {
        v1();
        T1(str);
        return (String) this.m.getOrDefault(str, null);
    }

    public final boolean R1(String str) {
        v1();
        T1(str);
        C7925x8 c7925x8 = this.f;
        return c7925x8.getOrDefault(str, null) != null && ((Set) c7925x8.getOrDefault(str, null)).contains("app_instance_id");
    }

    public final boolean S1(String str) {
        v1();
        T1(str);
        C7925x8 c7925x8 = this.f;
        if (c7925x8.getOrDefault(str, null) != null) {
            return ((Set) c7925x8.getOrDefault(str, null)).contains("os_version") || ((Set) c7925x8.getOrDefault(str, null)).contains("device_info");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T1(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NN1.T1(java.lang.String):void");
    }

    @Override // defpackage.InterfaceC3493dz1
    public final String W0(String str, String str2) {
        v1();
        T1(str);
        Map map = (Map) this.e.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }
}
