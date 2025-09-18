package p000;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class FR1 extends AbstractC9608hI1 {

    /* renamed from: d */
    public C0533IS f3205d;

    /* renamed from: e */
    public C9108dO1 f3206e;

    /* renamed from: f */
    public final CopyOnWriteArraySet f3207f;

    /* renamed from: g */
    public boolean f3208g;

    /* renamed from: h */
    public final AtomicReference f3209h;

    /* renamed from: i */
    public final Object f3210i;

    /* renamed from: j */
    public boolean f3211j;

    /* renamed from: k */
    public int f3212k;

    /* renamed from: l */
    public AS1 f3213l;

    /* renamed from: m */
    public AS1 f3214m;

    /* renamed from: n */
    public PriorityQueue f3215n;

    /* renamed from: o */
    public boolean f3216o;

    /* renamed from: p */
    public XQ1 f3217p;

    /* renamed from: q */
    public final AtomicLong f3218q;

    /* renamed from: r */
    public long f3219r;

    /* renamed from: s */
    public final C11287uQ0 f3220s;

    /* renamed from: t */
    public boolean f3221t;

    /* renamed from: u */
    public AS1 f3222u;

    /* renamed from: v */
    public SharedPreferencesOnSharedPreferenceChangeListenerC11292uS1 f3223v;

    /* renamed from: w */
    public AS1 f3224w;

    /* renamed from: x */
    public final C11287uQ0 f3225x;

    public FR1(C9110dP1 c9110dP1) {
        super(c9110dP1);
        this.f3207f = new CopyOnWriteArraySet();
        this.f3210i = new Object();
        this.f3211j = false;
        this.f3212k = 1;
        this.f3221t = true;
        this.f3225x = new C11287uQ0(this);
        this.f3209h = new AtomicReference();
        this.f3217p = XQ1.f13755c;
        this.f3219r = -1L;
        this.f3218q = new AtomicLong(0L);
        this.f3220s = new C11287uQ0(c9110dP1);
    }

    /* renamed from: O1 */
    public static void m2632O1(FR1 fr1, XQ1 xq1, long j, boolean z, boolean z2) {
        fr1.mo7681v1();
        fr1.m18793A1();
        XQ1 xq1M7995E1 = fr1.m7851t1().m7995E1();
        long j2 = fr1.f3219r;
        int i = xq1.f13757b;
        if (j <= j2 && XQ1.m9046h(xq1M7995E1.f13757b, i)) {
            fr1.mo6070n().f8384m.m24554c(xq1, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        UM1 um1M7851t1 = fr1.m7851t1();
        um1M7851t1.mo7681v1();
        if (!XQ1.m9046h(i, um1M7851t1.m7993C1().getInt("consent_source", 100))) {
            OL1 ol1Mo6070n = fr1.mo6070n();
            ol1Mo6070n.f8384m.m24554c(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = um1M7851t1.m7993C1().edit();
        editorEdit.putString("consent_settings", xq1.m9051l());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        fr1.mo6070n().f8386o.m24554c(xq1, "Setting storage consent(FE)");
        fr1.f3219r = j;
        C9110dP1 c9110dP1 = (C9110dP1) fr1.f11615b;
        C8989cV1 c8989cV1M6946j = RI1.m6946j(c9110dP1);
        if (c8989cV1M6946j.m10749K1() && c8989cV1M6946j.m7852u1().m22861B2() < 241200) {
            C8989cV1 c8989cV1M6946j2 = RI1.m6946j(c9110dP1);
            if (c8989cV1M6946j2.m10748J1()) {
                c8989cV1M6946j2.m10744F1(new HV1(c8989cV1M6946j2, c8989cV1M6946j2.m10752N1(false), 1));
            }
        } else {
            C8989cV1 c8989cV1M6946j3 = RI1.m6946j(c9110dP1);
            RunnableC9634hV1 runnableC9634hV1 = new RunnableC9634hV1(1);
            runnableC9634hV1.f28438b = c8989cV1M6946j3;
            c8989cV1M6946j3.m10744F1(runnableC9634hV1);
        }
        if (z2) {
            c9110dP1.m17601o().m10741C1(new AtomicReference());
        }
    }

    /* renamed from: C1 */
    public final void m2633C1(long j, Bundle bundle, String str, String str2) {
        mo7681v1();
        m2638H1(str, str2, j, bundle, true, this.f3206e == null || C10282mZ1.m22837A2(str2), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x004c  */
    /* renamed from: D1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2634D1(long r10, java.lang.Object r12, java.lang.String r13, java.lang.String r14) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            r9.mo7681v1()
            r9.m18793A1()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L67
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L4c
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4c
            java.util.Locale r12 = java.util.Locale.ENGLISH
            java.lang.String r12 = r0.toLowerCase(r12)
            java.lang.String r14 = "false"
            boolean r12 = r14.equals(r12)
            r2 = 1
            if (r12 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r12 = java.lang.Long.valueOf(r4)
            UM1 r0 = r9.m7851t1()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L45
            java.lang.String r14 = "true"
        L45:
            VG r0 = r0.f11754o
            r0.m8354t(r14)
        L4a:
            r14 = r1
            goto L5a
        L4c:
            if (r12 != 0) goto L5a
            UM1 r14 = r9.m7851t1()
            VG r14 = r14.f11754o
            java.lang.String r0 = "unset"
            r14.m8354t(r0)
            goto L4a
        L5a:
            OL1 r0 = r9.mo6070n()
            java.lang.String r1 = "non_personalized_ads(_npa)"
            rx r0 = r0.f8386o
            java.lang.String r2 = "Setting user property(FE)"
            r0.m24553b(r1, r12, r2)
        L67:
            r6 = r12
            r7 = r14
            java.lang.Object r12 = r9.f11615b
            dP1 r12 = (p000.C9110dP1) r12
            boolean r14 = r12.m17593f()
            if (r14 != 0) goto L7f
            OL1 r10 = r9.mo6070n()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            rx r10 = r10.f8386o
            r10.m24555d(r11)
            return
        L7f:
            boolean r14 = r12.m17594g()
            if (r14 != 0) goto L86
            return
        L86:
            jZ1 r14 = new jZ1
            r3 = r14
            r4 = r10
            r8 = r13
            r3.<init>(r4, r6, r7, r8)
            cV1 r10 = p000.RI1.m6946j(r12)
            java.lang.Object r11 = r10.f11615b
            dP1 r11 = (p000.C9110dP1) r11
            xL1 r11 = r11.m17598k()
            r11.getClass()
            android.os.Parcel r12 = android.os.Parcel.obtain()
            r13 = 0
            r14.writeToParcel(r12, r13)
            byte[] r0 = r12.marshall()
            r12.recycle()
            int r12 = r0.length
            r1 = 131072(0x20000, float:1.83671E-40)
            r2 = 1
            if (r12 <= r1) goto Lbf
            OL1 r11 = r11.mo6070n()
            java.lang.String r12 = "User property too long for local database. Sending directly to service"
            rx r11 = r11.f8379h
            r11.m24555d(r12)
            r3 = r13
            goto Lc4
        Lbf:
            boolean r11 = r11.m25843D1(r2, r0)
            r3 = r11
        Lc4:
            EY1 r2 = r10.m10752N1(r2)
            sL0 r11 = new sL0
            r5 = 3
            r0 = r11
            r1 = r10
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r10.m10744F1(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.FR1.m2634D1(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    /* renamed from: E1 */
    public final void m2635E1(Bundle bundle, int i, long j) {
        Object obj;
        EnumC9242eR1 enumC9242eR1;
        String string;
        m18793A1();
        XQ1 xq1 = XQ1.f13755c;
        TQ1[] tq1Arr = EnumC8853bR1.STORAGE.f17026a;
        int length = tq1Arr.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            TQ1 tq1 = tq1Arr[i2];
            if (bundle.containsKey(tq1.f11353a) && (string = bundle.getString(tq1.f11353a)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i2++;
        }
        if (obj != null) {
            mo6070n().f8383l.m24554c(obj, "Ignoring invalid consent setting");
            mo6070n().f8383l.m24555d("Valid consent values are 'granted', 'denied'");
        }
        boolean zM25414G1 = mo6071p0().m25414G1();
        XQ1 xq1M9042c = XQ1.m9042c(i, bundle);
        Iterator it = xq1M9042c.f13756a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC9242eR1 = EnumC9242eR1.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((EnumC9242eR1) it.next()) != enumC9242eR1) {
                m2644N1(xq1M9042c, zM25414G1);
                break;
            }
        }
        C8949cB1 c8949cB1M10619b = C8949cB1.m10619b(i, bundle);
        Iterator it2 = c8949cB1M10619b.f17362e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((EnumC9242eR1) it2.next()) != enumC9242eR1) {
                m2642L1(c8949cB1M10619b, zM25414G1);
                break;
            }
        }
        Boolean boolM10618a = C8949cB1.m10618a(bundle);
        if (boolM10618a != null) {
            String str = i == -30 ? "tcf" : "app";
            if (zM25414G1) {
                m2634D1(j, boolM10618a.toString(), str, "allow_personalized_ads");
            } else {
                m2641K1(str, "allow_personalized_ads", boolM10618a.toString(), false, j);
            }
        }
    }

    /* renamed from: F1 */
    public final void m2636F1(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            mo6070n().f8381j.m24555d("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        I22.m3735c(bundle2, "app_id", String.class, null);
        I22.m3735c(bundle2, "origin", String.class, null);
        I22.m3735c(bundle2, "name", String.class, null);
        I22.m3735c(bundle2, "value", Object.class, null);
        I22.m3735c(bundle2, "trigger_event_name", String.class, null);
        I22.m3735c(bundle2, "trigger_timeout", Long.class, 0L);
        I22.m3735c(bundle2, "timed_out_event_name", String.class, null);
        I22.m3735c(bundle2, "timed_out_event_params", Bundle.class, null);
        I22.m3735c(bundle2, "triggered_event_name", String.class, null);
        I22.m3735c(bundle2, "triggered_event_params", Bundle.class, null);
        I22.m3735c(bundle2, "time_to_live", Long.class, 0L);
        I22.m3735c(bundle2, "expired_event_name", String.class, null);
        I22.m3735c(bundle2, "expired_event_params", Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        int iM22891o2 = m7852u1().m22891o2(string);
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        if (iM22891o2 != 0) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8378g.m24554c(c9110dP1.f26043m.m2167g(string), "Invalid conditional user property name");
            return;
        }
        if (m7852u1().m22898z1(obj, string) != 0) {
            OL1 ol1Mo6070n2 = mo6070n();
            ol1Mo6070n2.f8378g.m24553b(c9110dP1.f26043m.m2167g(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objM22894u2 = m7852u1().m22894u2(obj, string);
        if (objM22894u2 == null) {
            OL1 ol1Mo6070n3 = mo6070n();
            ol1Mo6070n3.f8378g.m24553b(c9110dP1.f26043m.m2167g(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        I22.m3736d(bundle2, objM22894u2);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            OL1 ol1Mo6070n4 = mo6070n();
            ol1Mo6070n4.f8378g.m24553b(c9110dP1.f26043m.m2167g(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 <= 15552000000L && j3 >= 1) {
            mo6071p0().m25412E1(new RO1(this, bundle2, false, 3));
            return;
        }
        OL1 ol1Mo6070n5 = mo6070n();
        ol1Mo6070n5.f8378g.m24553b(c9110dP1.f26043m.m2167g(string), Long.valueOf(j3), "Invalid conditional user property time to live");
    }

    /* renamed from: G1 */
    public final void m2637G1(Boolean bool, boolean z) {
        mo7681v1();
        m18793A1();
        mo6070n().f8385n.m24554c(bool, "Setting app measurement enabled (FE)");
        UM1 um1M7851t1 = m7851t1();
        um1M7851t1.mo7681v1();
        SharedPreferences.Editor editorEdit = um1M7851t1.m7993C1().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            UM1 um1M7851t12 = m7851t1();
            um1M7851t12.mo7681v1();
            SharedPreferences.Editor editorEdit2 = um1M7851t12.m7993C1().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        C11412vO1 c11412vO1 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        if (c9110dP1.f26026E || !(bool == null || bool.booleanValue())) {
            m2651V1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x00fc  */
    /* renamed from: H1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2638H1(java.lang.String r27, java.lang.String r28, long r29, android.os.Bundle r31, boolean r32, boolean r33, boolean r34) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.FR1.m2638H1(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    /* renamed from: I1 */
    public final void m2639I1(String str, String str2, Bundle bundle) {
        long jCurrentTimeMillis = ((C9110dP1) this.f11615b).f26044n.currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        mo6071p0().m25412E1(new ZR1(this, bundle2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0057, code lost:
    
        if (r3 > 500) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x008a, code lost:
    
        if (r4 > 500) goto L158;
     */
    /* renamed from: J1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2640J1(java.lang.String r16, java.lang.String r17, android.os.Bundle r18, boolean r19, boolean r20, long r21) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.FR1.m2640J1(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0063  */
    /* renamed from: K1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2641K1(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            r11 = this;
            r8 = r11
            r3 = r13
            r0 = r14
            if (r12 != 0) goto L9
            java.lang.String r1 = "app"
            r2 = r1
            goto La
        L9:
            r2 = r12
        La:
            r1 = 0
            r4 = 24
            if (r15 == 0) goto L19
            mZ1 r5 = r11.m7852u1()
            int r5 = r5.m22891o2(r13)
        L17:
            r9 = r5
            goto L3b
        L19:
            mZ1 r5 = r11.m7852u1()
            java.lang.String r6 = "user property"
            boolean r7 = r5.m22896w2(r6, r13)
            r9 = 6
            if (r7 != 0) goto L27
            goto L3b
        L27:
            java.lang.String[] r7 = p000.AbstractC10766qL1.f40794a
            r10 = 0
            boolean r7 = r5.m22889k2(r6, r7, r10, r13)
            if (r7 != 0) goto L33
            r5 = 15
            goto L17
        L33:
            boolean r5 = r5.m22885b2(r4, r6, r13)
            if (r5 != 0) goto L3a
            goto L3b
        L3a:
            r9 = r1
        L3b:
            uQ0 r5 = r8.f3225x
            java.lang.Object r6 = r8.f11615b
            dP1 r6 = (p000.C9110dP1) r6
            r7 = 1
            if (r9 == 0) goto L63
            r11.m7852u1()
            java.lang.String r0 = p000.C10282mZ1.m22844J1(r4, r13, r7)
            if (r3 == 0) goto L51
            int r1 = r13.length()
        L51:
            r6.m17602p()
            r2 = 0
            java.lang.String r3 = "_ev"
            r12 = r5
            r13 = r2
            r14 = r9
            r15 = r3
            r16 = r0
            r17 = r1
            p000.C10282mZ1.m22847Z1(r12, r13, r14, r15, r16, r17)
            return
        L63:
            if (r0 == 0) goto Lb5
            mZ1 r9 = r11.m7852u1()
            int r9 = r9.m22898z1(r14, r13)
            if (r9 == 0) goto L98
            r11.m7852u1()
            java.lang.String r2 = p000.C10282mZ1.m22844J1(r4, r13, r7)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 != 0) goto L7e
            boolean r3 = r0 instanceof java.lang.CharSequence
            if (r3 == 0) goto L86
        L7e:
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r1 = r0.length()
        L86:
            r6.m17602p()
            r0 = 0
            java.lang.String r3 = "_ev"
            r12 = r5
            r13 = r0
            r14 = r9
            r15 = r3
            r16 = r2
            r17 = r1
            p000.C10282mZ1.m22847Z1(r12, r13, r14, r15, r16, r17)
            return
        L98:
            mZ1 r1 = r11.m7852u1()
            java.lang.Object r4 = r1.m22894u2(r14, r13)
            if (r4 == 0) goto Lb4
            vO1 r9 = r11.mo6071p0()
            qb1 r10 = new qb1
            r7 = 2
            r0 = r10
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.m25412E1(r10)
        Lb4:
            return
        Lb5:
            vO1 r9 = r11.mo6071p0()
            qb1 r10 = new qb1
            r4 = 0
            r7 = 2
            r0 = r10
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.m25412E1(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.FR1.m2641K1(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* renamed from: L1 */
    public final void m2642L1(C8949cB1 c8949cB1, boolean z) {
        RunnableC11676xT1 runnableC11676xT1 = new RunnableC11676xT1(this, 1, c8949cB1);
        if (!z) {
            mo6071p0().m25412E1(runnableC11676xT1);
        } else {
            mo7681v1();
            runnableC11676xT1.run();
        }
    }

    /* renamed from: M1 */
    public final void m2643M1(XQ1 xq1) {
        mo7681v1();
        boolean z = (xq1.m9048i(TQ1.ANALYTICS_STORAGE) && xq1.m9048i(TQ1.AD_STORAGE)) || ((C9110dP1) this.f11615b).m17601o().m10748J1();
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        C11412vO1 c11412vO1 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        if (z != c9110dP1.f26026E) {
            C9110dP1 c9110dP12 = (C9110dP1) this.f11615b;
            C11412vO1 c11412vO12 = c9110dP12.f26040j;
            C9110dP1.m17592e(c11412vO12);
            c11412vO12.mo7681v1();
            c9110dP12.f26026E = z;
            UM1 um1M7851t1 = m7851t1();
            um1M7851t1.mo7681v1();
            Boolean boolValueOf = um1M7851t1.m7993C1().contains("measurement_enabled_from_api") ? Boolean.valueOf(um1M7851t1.m7993C1().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                m2637G1(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: N1 */
    public final void m2644N1(XQ1 xq1, boolean z) {
        boolean z2;
        XQ1 xq12;
        boolean z3;
        boolean z4;
        m18793A1();
        int i = xq1.f13757b;
        if (i != -10) {
            EnumC9242eR1 enumC9242eR1 = (EnumC9242eR1) xq1.f13756a.get(TQ1.AD_STORAGE);
            if (enumC9242eR1 == null) {
                enumC9242eR1 = EnumC9242eR1.UNINITIALIZED;
            }
            EnumC9242eR1 enumC9242eR12 = EnumC9242eR1.UNINITIALIZED;
            if (enumC9242eR1 == enumC9242eR12) {
                EnumC9242eR1 enumC9242eR13 = (EnumC9242eR1) xq1.f13756a.get(TQ1.ANALYTICS_STORAGE);
                if (enumC9242eR13 == null) {
                    enumC9242eR13 = enumC9242eR12;
                }
                if (enumC9242eR13 == enumC9242eR12) {
                    mo6070n().f8383l.m24555d("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f3210i) {
            try {
                z2 = false;
                if (XQ1.m9046h(i, this.f3217p.f13757b)) {
                    XQ1 xq13 = this.f3217p;
                    EnumMap enumMap = xq1.f13756a;
                    TQ1[] tq1Arr = (TQ1[]) enumMap.keySet().toArray(new TQ1[0]);
                    int length = tq1Arr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        TQ1 tq1 = tq1Arr[i2];
                        EnumC9242eR1 enumC9242eR14 = (EnumC9242eR1) enumMap.get(tq1);
                        EnumC9242eR1 enumC9242eR15 = (EnumC9242eR1) xq13.f13756a.get(tq1);
                        EnumC9242eR1 enumC9242eR16 = EnumC9242eR1.DENIED;
                        if (enumC9242eR14 == enumC9242eR16 && enumC9242eR15 != enumC9242eR16) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    TQ1 tq12 = TQ1.ANALYTICS_STORAGE;
                    if (xq1.m9048i(tq12) && !this.f3217p.m9048i(tq12)) {
                        z2 = true;
                    }
                    XQ1 xq1M9049j = xq1.m9049j(this.f3217p);
                    this.f3217p = xq1M9049j;
                    xq12 = xq1M9049j;
                    z4 = z2;
                    z2 = true;
                } else {
                    xq12 = xq1;
                    z3 = false;
                    z4 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            mo6070n().f8384m.m24554c(xq12, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f3218q.getAndIncrement();
        if (z3) {
            m2652W1(null);
            ST1 st1 = new ST1(this, xq12, andIncrement, z4, 1);
            if (!z) {
                mo6071p0().m25413F1(st1);
                return;
            } else {
                mo7681v1();
                st1.run();
                return;
            }
        }
        ST1 st12 = new ST1(this, xq12, andIncrement, z4, 0);
        if (z) {
            mo7681v1();
            st12.run();
        } else if (i == 30 || i == -10) {
            mo6071p0().m25413F1(st12);
        } else {
            mo6071p0().m25412E1(st12);
        }
    }

    /* renamed from: P1 */
    public final PriorityQueue m2645P1() {
        if (this.f3215n == null) {
            this.f3215n = AbstractC8209Rf1.m7073n(Comparator.comparing(new MR1(), new C8774aq0(28)));
        }
        return this.f3215n;
    }

    /* renamed from: Q1 */
    public final void m2646Q1() {
        mo7681v1();
        m18793A1();
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        if (c9110dP1.m17594g()) {
            Boolean boolM6510D1 = c9110dP1.f26037g.m6510D1("google_analytics_deferred_deep_link_enabled");
            if (boolM6510D1 != null && boolM6510D1.booleanValue()) {
                mo6070n().f8385n.m24555d("Deferred Deep Link feature enabled.");
                C11412vO1 c11412vO1Mo6071p0 = mo6071p0();
                ZO1 zo1 = new ZO1(1);
                zo1.f14878b = this;
                c11412vO1Mo6071p0.m25412E1(zo1);
            }
            C8989cV1 c8989cV1M6946j = RI1.m6946j(c9110dP1);
            EY1 ey1M10752N1 = c8989cV1M6946j.m10752N1(true);
            ((C9110dP1) c8989cV1M6946j.f11615b).m17598k().m25843D1(3, new byte[0]);
            c8989cV1M6946j.m10744F1(new HV1(c8989cV1M6946j, ey1M10752N1, 0));
            this.f3221t = false;
            UM1 um1M7851t1 = m7851t1();
            um1M7851t1.mo7681v1();
            String string = um1M7851t1.m7993C1().getString("previous_os_version", null);
            ((C9110dP1) um1M7851t1.f11615b).m17596i().m7367w1();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = um1M7851t1.m7993C1().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c9110dP1.m17596i().m7367w1();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m2653X1("auto", "_ou", bundle);
        }
    }

    /* renamed from: R1 */
    public final void m2647R1() {
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        if (!(c9110dP1.f26031a.getApplicationContext() instanceof Application) || this.f3205d == null) {
            return;
        }
        ((Application) c9110dP1.f26031a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f3205d);
    }

    /* renamed from: S1 */
    public final void m2648S1() {
        C11304uY1.m25207a();
        if (((C9110dP1) this.f11615b).f26037g.m6511E1(null, IB1.f4763R0)) {
            if (mo6071p0().m25414G1()) {
                mo6070n().f8378g.m24555d("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C4049fN.m18225p()) {
                mo6070n().f8378g.m24555d("Cannot get trigger URIs from main thread");
                return;
            }
            m18793A1();
            mo6070n().f8386o.m24555d("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C11412vO1 c11412vO1Mo6071p0 = mo6071p0();
            OR1 or1 = new OR1();
            or1.f8448c = this;
            or1.f8447b = atomicReference;
            c11412vO1Mo6071p0.m25416z1(atomicReference, 10000L, "get trigger URIs", or1);
            List list = (List) atomicReference.get();
            if (list == null) {
                mo6070n().f8378g.m24555d("Timed out waiting for get trigger URIs");
                return;
            }
            C11412vO1 c11412vO1Mo6071p02 = mo6071p0();
            RO1 ro1 = new RO1();
            ro1.f10156b = this;
            ro1.f10157c = list;
            c11412vO1Mo6071p02.m25412E1(ro1);
        }
    }

    /* renamed from: T1 */
    public final void m2649T1() {
        String string;
        int i;
        int i2;
        int i3;
        String string2;
        int i4;
        int i5;
        Bundle bundle;
        int i6;
        Bundle bundle2;
        mo7681v1();
        mo6070n().f8385n.m24555d("Handle tcf update.");
        SharedPreferences sharedPreferencesM7992B1 = m7851t1().m7992B1();
        HashMap map = new HashMap();
        try {
            string = sharedPreferencesM7992B1.getString("IABTCF_VendorConsents", "\u0000");
        } catch (ClassCastException unused) {
            string = "\u0000";
        }
        if (!"\u0000".equals(string) && string.length() > 754) {
            map.put("GoogleConsent", String.valueOf(string.charAt(754)));
        }
        try {
            i = sharedPreferencesM7992B1.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused2) {
            i = -1;
        }
        if (i != -1) {
            map.put("gdprApplies", String.valueOf(i));
        }
        try {
            i2 = sharedPreferencesM7992B1.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused3) {
            i2 = -1;
        }
        if (i2 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(i2));
        }
        try {
            i3 = sharedPreferencesM7992B1.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused4) {
            i3 = -1;
        }
        if (i3 != -1) {
            map.put("PolicyVersion", String.valueOf(i3));
        }
        try {
            string2 = sharedPreferencesM7992B1.getString("IABTCF_PurposeConsents", "\u0000");
        } catch (ClassCastException unused5) {
            string2 = "\u0000";
        }
        if (!"\u0000".equals(string2)) {
            map.put("PurposeConsents", string2);
        }
        try {
            i4 = sharedPreferencesM7992B1.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused6) {
            i4 = -1;
        }
        if (i4 != -1) {
            map.put("CmpSdkID", String.valueOf(i4));
        }
        C11302uX1 c11302uX1 = new C11302uX1(map);
        mo6070n().f8386o.m24554c(c11302uX1, "Tcf preferences read");
        UM1 um1M7851t1 = m7851t1();
        um1M7851t1.mo7681v1();
        String string3 = um1M7851t1.m7993C1().getString("stored_tcf_param", "");
        String strM25198a = c11302uX1.m25198a();
        if (strM25198a.equals(string3)) {
            return;
        }
        SharedPreferences.Editor editorEdit = um1M7851t1.m7993C1().edit();
        editorEdit.putString("stored_tcf_param", strM25198a);
        editorEdit.apply();
        HashMap map2 = c11302uX1.f43731a;
        if ("1".equals(map2.get("GoogleConsent")) && "1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            int iM25199b = c11302uX1.m25199b();
            if (iM25199b < 0) {
                bundle2 = Bundle.EMPTY;
            } else {
                String str = (String) map2.get("PurposeConsents");
                if (TextUtils.isEmpty(str)) {
                    bundle2 = Bundle.EMPTY;
                } else {
                    Bundle bundle3 = new Bundle();
                    String str2 = "denied";
                    if (str.length() > 0) {
                        bundle3.putString("ad_storage", str.charAt(0) == '1' ? "granted" : "denied");
                    }
                    if (str.length() > 3) {
                        bundle3.putString("ad_personalization", (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                    }
                    if (str.length() <= 6 || iM25199b < 4) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                            str2 = "granted";
                        }
                        bundle3.putString("ad_user_data", str2);
                    }
                    bundle = bundle3;
                }
            }
            bundle = bundle2;
            i5 = 0;
        } else {
            i5 = 0;
            bundle = Bundle.EMPTY;
        }
        mo6070n().f8386o.m24554c(bundle, "Consent generated from Tcf");
        if (bundle != Bundle.EMPTY) {
            m2635E1(bundle, -30, ((C9110dP1) this.f11615b).f26044n.currentTimeMillis());
        }
        Bundle bundle4 = new Bundle();
        StringBuilder sb = new StringBuilder("1");
        try {
            String str3 = (String) map2.get("CmpSdkID");
            i6 = !TextUtils.isEmpty(str3) ? Integer.parseInt(str3) : -1;
        } catch (NumberFormatException unused7) {
            i6 = -1;
        }
        if (i6 < 0 || i6 > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((i6 >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i6 & 63));
        }
        int iM25199b2 = c11302uX1.m25199b();
        if (iM25199b2 < 0 || iM25199b2 > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iM25199b2));
        }
        Preconditions.checkArgument(true);
        int i7 = "1".equals(map2.get("gdprApplies")) ? 2 : i5;
        int i8 = i7 | 4;
        if ("1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            i8 = i7 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i8));
        bundle4.putString("_tcfd", sb.toString());
        m2653X1("auto", "_tcf", bundle4);
    }

    /* renamed from: U1 */
    public final void m2650U1() {
        C11938zX1 c11938zX1;
        C7446Co0 c7446Co0M22867G2;
        mo7681v1();
        this.f3216o = false;
        if (m2645P1().isEmpty() || this.f3211j || (c11938zX1 = (C11938zX1) m2645P1().poll()) == null || (c7446Co0M22867G2 = m7852u1().m22867G2()) == null) {
            return;
        }
        this.f3211j = true;
        C6792rx c6792rx = mo6070n().f8386o;
        String str = c11938zX1.f46861a;
        c6792rx.m24554c(str, "Registering trigger URI");
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0M1369d = c7446Co0M22867G2.m1369d(Uri.parse(str));
        if (interfaceFutureC7800Jj0M1369d != null) {
            interfaceFutureC7800Jj0M1369d.mo2494d(new RunnableC1420WZ(interfaceFutureC7800Jj0M1369d, 0, new ES1(this, 0, c11938zX1)), new ExecutorC4251ia(this));
        } else {
            this.f3211j = false;
            m2645P1().add(c11938zX1);
        }
    }

    /* renamed from: V1 */
    public final void m2651V1() {
        mo7681v1();
        String strM8350o = m7851t1().f11754o.m8350o();
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        if (strM8350o != null) {
            if ("unset".equals(strM8350o)) {
                m2634D1(c9110dP1.f26044n.currentTimeMillis(), null, "app", "_npa");
            } else {
                m2634D1(c9110dP1.f26044n.currentTimeMillis(), Long.valueOf("true".equals(strM8350o) ? 1L : 0L), "app", "_npa");
            }
        }
        if (c9110dP1.m17593f() && this.f3221t) {
            mo6070n().f8385n.m24555d("Recording app launch after enabling measurement for the first time (FE)");
            m2646Q1();
            m7684y1().f13244f.m24358l();
            mo6071p0().m25412E1(new ZO1(this));
            return;
        }
        mo6070n().f8385n.m24555d("Updating Scion state (FE)");
        C8989cV1 c8989cV1M17601o = c9110dP1.m17601o();
        c8989cV1M17601o.mo7681v1();
        c8989cV1M17601o.m18793A1();
        c8989cV1M17601o.m10744F1(new FV1(c8989cV1M17601o, c8989cV1M17601o.m10752N1(true), 2));
    }

    /* renamed from: W1 */
    public final void m2652W1(String str) {
        this.f3209h.set(str);
    }

    /* renamed from: X1 */
    public final void m2653X1(String str, String str2, Bundle bundle) {
        mo7681v1();
        m2633C1(((C9110dP1) this.f11615b).f26044n.currentTimeMillis(), bundle, str, str2);
    }

    @Override // p000.AbstractC9608hI1
    /* renamed from: z1 */
    public final boolean mo2654z1() {
        return false;
    }
}
