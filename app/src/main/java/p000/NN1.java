package p000;

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
public final class NN1 extends AbstractC9512gY1 implements InterfaceC9182dz1 {

    /* renamed from: e */
    public final C7119x8 f7736e;

    /* renamed from: f */
    public final C7119x8 f7737f;

    /* renamed from: g */
    public final C7119x8 f7738g;

    /* renamed from: h */
    public final C7119x8 f7739h;

    /* renamed from: i */
    public final C7119x8 f7740i;

    /* renamed from: j */
    public final C7119x8 f7741j;

    /* renamed from: k */
    public final C9876jO1 f7742k;

    /* renamed from: l */
    public final C10525oT0 f7743l;

    /* renamed from: m */
    public final C7119x8 f7744m;

    /* renamed from: n */
    public final C7119x8 f7745n;

    /* renamed from: o */
    public final C7119x8 f7746o;

    public NN1(C10152lY1 c10152lY1) {
        super(c10152lY1);
        this.f7736e = new C7119x8();
        this.f7737f = new C7119x8();
        this.f7738g = new C7119x8();
        this.f7739h = new C7119x8();
        this.f7740i = new C7119x8();
        this.f7744m = new C7119x8();
        this.f7745n = new C7119x8();
        this.f7746o = new C7119x8();
        this.f7741j = new C7119x8();
        this.f7742k = new C9876jO1(this);
        this.f7743l = new C10525oT0(this);
    }

    /* renamed from: D1 */
    public static C7119x8 m5648D1(C10124lK1 c10124lK1) {
        C7119x8 c7119x8 = new C7119x8();
        for (C10636pK1 c10636pK1 : c10124lK1.m22391B()) {
            c7119x8.put(c10636pK1.m23738m(), c10636pK1.m23739n());
        }
        return c7119x8;
    }

    /* renamed from: F1 */
    public static TQ1 m5649F1(int i) {
        int i2 = AbstractC10644pO1.f40048b[AbstractC7222ym.m26247x(i)];
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

    @Override // p000.AbstractC9512gY1
    /* renamed from: B1 */
    public final boolean mo1721B1() {
        return false;
    }

    /* renamed from: C1 */
    public final long m5650C1(String str) {
        String strMo5666W0 = mo5666W0(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strMo5666W0)) {
            return 0L;
        }
        try {
            return Long.parseLong(strMo5666W0);
        } catch (NumberFormatException e) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8381j.m24553b(OL1.m6026B1(str), e, "Unable to parse timezone offset. appId");
            return 0L;
        }
    }

    /* renamed from: E1 */
    public final C10124lK1 m5651E1(String str, byte[] bArr) {
        if (bArr == null) {
            return C10124lK1.m22389u();
        }
        try {
            C10124lK1 c10124lK1 = (C10124lK1) ((C9996kK1) C8997cZ1.m10763P1(C10124lK1.m22388t(), bArr)).m23412e();
            mo6070n().f8386o.m24553b(c10124lK1.m22395F() ? Long.valueOf(c10124lK1.m22399r()) : null, c10124lK1.m22393D() ? c10124lK1.m22402w() : null, "Parsed config. version, gmp_app_id");
            return c10124lK1;
        } catch (VS1 e) {
            mo6070n().f8381j.m24553b(OL1.m6026B1(str), e, "Unable to merge remote config. appId");
            return C10124lK1.m22389u();
        } catch (RuntimeException e2) {
            mo6070n().f8381j.m24553b(OL1.m6026B1(str), e2, "Unable to merge remote config. appId");
            return C10124lK1.m22389u();
        }
    }

    /* renamed from: G1 */
    public final EnumC9242eR1 m5652G1(String str, TQ1 tq1) {
        mo7681v1();
        m5665T1(str);
        C9484gK1 c9484gK1M5657L1 = m5657L1(str);
        EnumC9242eR1 enumC9242eR1 = EnumC9242eR1.UNINITIALIZED;
        if (c9484gK1M5657L1 == null) {
            return enumC9242eR1;
        }
        for (C9100dK1 c9100dK1 : c9484gK1M5657L1.m18431q()) {
            if (m5649F1(c9100dK1.m17544n()) == tq1) {
                int i = AbstractC10644pO1.f40049c[AbstractC7222ym.m26247x(c9100dK1.m17543m())];
                return i != 1 ? i != 2 ? enumC9242eR1 : EnumC9242eR1.GRANTED : EnumC9242eR1.DENIED;
            }
        }
        return enumC9242eR1;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x039d A[Catch: SQLiteException -> 0x03ad, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x03ad, blocks: (B:94:0x0386, B:96:0x039d), top: B:108:0x0386 }] */
    /* renamed from: H1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5653H1(java.lang.String r22, java.lang.String r23, java.lang.String r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.NN1.m5653H1(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    /* renamed from: I1 */
    public final void m5654I1(String str, C9996kK1 c9996kK1) {
        HashSet hashSet = new HashSet();
        C7119x8 c7119x8 = new C7119x8();
        C7119x8 c7119x82 = new C7119x8();
        C7119x8 c7119x83 = new C7119x8();
        Iterator it = Collections.unmodifiableList(((C10124lK1) c9996kK1.f39024b).m22405z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((C9612hK1) it.next()).m18798m());
        }
        for (int i = 0; i < ((C10124lK1) c9996kK1.f39024b).m22398q(); i++) {
            C9740iK1 c9740iK1 = (C9740iK1) ((C10124lK1) c9996kK1.f39024b).m22397n(i).m24347j();
            if (c9740iK1.m19002k().isEmpty()) {
                mo6070n().f8381j.m24555d("EventConfig contained null event name");
            } else {
                String strM19002k = c9740iK1.m19002k();
                String strM4896b = L22.m4896b(c9740iK1.m19002k(), AbstractC10638pL1.f40027a, AbstractC10638pL1.f40029c);
                if (!TextUtils.isEmpty(strM4896b)) {
                    c9740iK1.m23414i();
                    C9868jK1.m22015n((C9868jK1) c9740iK1.f39024b, strM4896b);
                    c9996kK1.m23414i();
                    C10124lK1.m22387p((C10124lK1) c9996kK1.f39024b, i, (C9868jK1) c9740iK1.m23412e());
                }
                if (((C9868jK1) c9740iK1.f39024b).m22020r() && ((C9868jK1) c9740iK1.f39024b).m22018p()) {
                    c7119x8.put(strM19002k, Boolean.TRUE);
                }
                if (((C9868jK1) c9740iK1.f39024b).m22021s() && ((C9868jK1) c9740iK1.f39024b).m22019q()) {
                    c7119x82.put(c9740iK1.m19002k(), Boolean.TRUE);
                }
                if (((C9868jK1) c9740iK1.f39024b).m22022t()) {
                    if (((C9868jK1) c9740iK1.f39024b).m22016m() < 2 || ((C9868jK1) c9740iK1.f39024b).m22016m() > 65535) {
                        OL1 ol1Mo6070n = mo6070n();
                        ol1Mo6070n.f8381j.m24553b(c9740iK1.m19002k(), Integer.valueOf(((C9868jK1) c9740iK1.f39024b).m22016m()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        c7119x83.put(c9740iK1.m19002k(), Integer.valueOf(((C9868jK1) c9740iK1.f39024b).m22016m()));
                    }
                }
            }
        }
        this.f7737f.put(str, hashSet);
        this.f7738g.put(str, c7119x8);
        this.f7739h.put(str, c7119x82);
        this.f7741j.put(str, c7119x83);
    }

    /* renamed from: J1 */
    public final void m5655J1(String str, C10124lK1 c10124lK1) {
        if (c10124lK1.m22396m() == 0) {
            C9876jO1 c9876jO1 = this.f7742k;
            if (str == null) {
                c9876jO1.getClass();
                throw new NullPointerException("key == null");
            }
            synchronized (c9876jO1) {
                try {
                    if (((LinkedHashMap) c9876jO1.f5924f).remove(str) != null) {
                        c9876jO1.f5920b--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        mo6070n().f8386o.m24554c(Integer.valueOf(c10124lK1.m22396m()), "EES programs found");
        WL1 wl1 = (WL1) c10124lK1.m22390A().get(0);
        try {
            PA1 pa1 = new PA1();
            RN1 rn1 = new RN1(1);
            rn1.f10149b = this;
            rn1.f10150c = str;
            ((HashMap) ((C10226m71) pa1.f8879a.f8630d).f37493b).put("internal.remoteConfig", rn1);
            RN1 rn12 = new RN1(0);
            rn12.f10149b = this;
            rn12.f10150c = str;
            ((HashMap) ((C10226m71) pa1.f8879a.f8630d).f37493b).put("internal.appMetadata", rn12);
            CallableC6230jK callableC6230jK = new CallableC6230jK();
            callableC6230jK.f35065b = this;
            ((HashMap) ((C10226m71) pa1.f8879a.f8630d).f37493b).put("internal.logger", callableC6230jK);
            pa1.m6251a(wl1);
            this.f7742k.m4573f(str, pa1);
            mo6070n().f8386o.m24553b(str, Integer.valueOf(wl1.m8748m().m7988m()), "EES program loaded for appId, activities");
            Iterator it = wl1.m8748m().m7989o().iterator();
            while (it.hasNext()) {
                mo6070n().f8386o.m24554c(((VL1) it.next()).m8420m(), "EES program activity");
            }
        } catch (MC1 unused) {
            mo6070n().f8378g.m24554c(str, "Failed to load EES program. appId");
        }
    }

    /* renamed from: K1 */
    public final int m5656K1(String str, String str2) {
        Integer num;
        mo7681v1();
        m5665T1(str);
        Map map = (Map) this.f7741j.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: L1 */
    public final C9484gK1 m5657L1(String str) {
        mo7681v1();
        m5665T1(str);
        C10124lK1 c10124lK1M5658M1 = m5658M1(str);
        if (c10124lK1M5658M1 == null || !c10124lK1M5658M1.m22392C()) {
            return null;
        }
        return c10124lK1M5658M1.m22400s();
    }

    /* renamed from: M1 */
    public final C10124lK1 m5658M1(String str) {
        m18576z1();
        mo7681v1();
        Preconditions.checkNotEmpty(str);
        m5665T1(str);
        return (C10124lK1) this.f7740i.getOrDefault(str, null);
    }

    /* renamed from: N1 */
    public final boolean m5659N1(String str, String str2) {
        Boolean bool;
        mo7681v1();
        m5665T1(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f7739h.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: O1 */
    public final boolean m5660O1(String str, TQ1 tq1) {
        mo7681v1();
        m5665T1(str);
        C9484gK1 c9484gK1M5657L1 = m5657L1(str);
        if (c9484gK1M5657L1 == null) {
            return false;
        }
        Iterator it = c9484gK1M5657L1.m18429o().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C9100dK1 c9100dK1 = (C9100dK1) it.next();
            if (tq1 == m5649F1(c9100dK1.m17544n())) {
                if (c9100dK1.m17543m() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: P1 */
    public final boolean m5661P1(String str, String str2) {
        Boolean bool;
        mo7681v1();
        m5665T1(str);
        if ("1".equals(mo5666W0(str, "measurement.upload.blacklist_internal")) && C10282mZ1.m22837A2(str2)) {
            return true;
        }
        if ("1".equals(mo5666W0(str, "measurement.upload.blacklist_public")) && C10282mZ1.m22839C2(str2)) {
            return true;
        }
        Map map = (Map) this.f7738g.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: Q1 */
    public final String m5662Q1(String str) {
        mo7681v1();
        m5665T1(str);
        return (String) this.f7744m.getOrDefault(str, null);
    }

    /* renamed from: R1 */
    public final boolean m5663R1(String str) {
        mo7681v1();
        m5665T1(str);
        C7119x8 c7119x8 = this.f7737f;
        return c7119x8.getOrDefault(str, null) != null && ((Set) c7119x8.getOrDefault(str, null)).contains("app_instance_id");
    }

    /* renamed from: S1 */
    public final boolean m5664S1(String str) {
        mo7681v1();
        m5665T1(str);
        C7119x8 c7119x8 = this.f7737f;
        if (c7119x8.getOrDefault(str, null) != null) {
            return ((Set) c7119x8.getOrDefault(str, null)).contains("os_version") || ((Set) c7119x8.getOrDefault(str, null)).contains("device_info");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    /* renamed from: T1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5665T1(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.NN1.m5665T1(java.lang.String):void");
    }

    @Override // p000.InterfaceC9182dz1
    /* renamed from: W0 */
    public final String mo5666W0(String str, String str2) {
        mo7681v1();
        m5665T1(str);
        Map map = (Map) this.f7736e.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }
}
