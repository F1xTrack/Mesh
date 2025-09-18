package defpackage;

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
public final class FR1 extends AbstractC4128hI1 {
    public IS d;
    public C3383dO1 e;
    public final CopyOnWriteArraySet f;
    public boolean g;
    public final AtomicReference h;
    public final Object i;
    public boolean j;
    public int k;
    public AS1 l;
    public AS1 m;
    public PriorityQueue n;
    public boolean o;
    public XQ1 p;
    public final AtomicLong q;
    public long r;
    public final C7409uQ0 s;
    public boolean t;
    public AS1 u;
    public SharedPreferencesOnSharedPreferenceChangeListenerC7416uS1 v;
    public AS1 w;
    public final C7409uQ0 x;

    public FR1(C3386dP1 c3386dP1) {
        super(c3386dP1);
        this.f = new CopyOnWriteArraySet();
        this.i = new Object();
        this.j = false;
        this.k = 1;
        this.t = true;
        this.x = new C7409uQ0(this);
        this.h = new AtomicReference();
        this.p = XQ1.c;
        this.r = -1L;
        this.q = new AtomicLong(0L);
        this.s = new C7409uQ0(c3386dP1);
    }

    public static void O1(FR1 fr1, XQ1 xq1, long j, boolean z, boolean z2) {
        fr1.v1();
        fr1.A1();
        XQ1 xq1E1 = fr1.t1().E1();
        long j2 = fr1.r;
        int i = xq1.b;
        if (j <= j2 && XQ1.h(xq1E1.b, i)) {
            fr1.n().m.c(xq1, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        UM1 um1T1 = fr1.t1();
        um1T1.v1();
        if (!XQ1.h(i, um1T1.C1().getInt("consent_source", 100))) {
            OL1 ol1N = fr1.n();
            ol1N.m.c(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = um1T1.C1().edit();
        editorEdit.putString("consent_settings", xq1.l());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        fr1.n().o.c(xq1, "Setting storage consent(FE)");
        fr1.r = j;
        C3386dP1 c3386dP1 = (C3386dP1) fr1.b;
        C2528cV1 c2528cV1J = RI1.j(c3386dP1);
        if (c2528cV1J.K1() && c2528cV1J.u1().B2() < 241200) {
            C2528cV1 c2528cV1J2 = RI1.j(c3386dP1);
            if (c2528cV1J2.J1()) {
                c2528cV1J2.F1(new HV1(c2528cV1J2, c2528cV1J2.N1(false), 1));
            }
        } else {
            C2528cV1 c2528cV1J3 = RI1.j(c3386dP1);
            RunnableC4167hV1 runnableC4167hV1 = new RunnableC4167hV1(1);
            runnableC4167hV1.b = c2528cV1J3;
            c2528cV1J3.F1(runnableC4167hV1);
        }
        if (z2) {
            c3386dP1.o().C1(new AtomicReference());
        }
    }

    public final void C1(long j, Bundle bundle, String str, String str2) {
        v1();
        H1(str, str2, j, bundle, true, this.e == null || C5910mZ1.A2(str2), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D1(long r10, java.lang.Object r12, java.lang.String r13, java.lang.String r14) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            r9.v1()
            r9.A1()
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
            UM1 r0 = r9.t1()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L45
            java.lang.String r14 = "true"
        L45:
            VG r0 = r0.o
            r0.t(r14)
        L4a:
            r14 = r1
            goto L5a
        L4c:
            if (r12 != 0) goto L5a
            UM1 r14 = r9.t1()
            VG r14 = r14.o
            java.lang.String r0 = "unset"
            r14.t(r0)
            goto L4a
        L5a:
            OL1 r0 = r9.n()
            java.lang.String r1 = "non_personalized_ads(_npa)"
            rx r0 = r0.o
            java.lang.String r2 = "Setting user property(FE)"
            r0.b(r1, r12, r2)
        L67:
            r6 = r12
            r7 = r14
            java.lang.Object r12 = r9.b
            dP1 r12 = (defpackage.C3386dP1) r12
            boolean r14 = r12.f()
            if (r14 != 0) goto L7f
            OL1 r10 = r9.n()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            rx r10 = r10.o
            r10.d(r11)
            return
        L7f:
            boolean r14 = r12.g()
            if (r14 != 0) goto L86
            return
        L86:
            jZ1 r14 = new jZ1
            r3 = r14
            r4 = r10
            r8 = r13
            r3.<init>(r4, r6, r7, r8)
            cV1 r10 = defpackage.RI1.j(r12)
            java.lang.Object r11 = r10.b
            dP1 r11 = (defpackage.C3386dP1) r11
            xL1 r11 = r11.k()
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
            OL1 r11 = r11.n()
            java.lang.String r12 = "User property too long for local database. Sending directly to service"
            rx r11 = r11.h
            r11.d(r12)
            r3 = r13
            goto Lc4
        Lbf:
            boolean r11 = r11.D1(r2, r0)
            r3 = r11
        Lc4:
            EY1 r2 = r10.N1(r2)
            sL0 r11 = new sL0
            r5 = 3
            r0 = r11
            r1 = r10
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r10.F1(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FR1.D1(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void E1(Bundle bundle, int i, long j) {
        Object obj;
        EnumC3582eR1 enumC3582eR1;
        String string;
        A1();
        XQ1 xq1 = XQ1.c;
        TQ1[] tq1Arr = EnumC2326bR1.STORAGE.a;
        int length = tq1Arr.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            TQ1 tq1 = tq1Arr[i2];
            if (bundle.containsKey(tq1.a) && (string = bundle.getString(tq1.a)) != null) {
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
            n().l.c(obj, "Ignoring invalid consent setting");
            n().l.d("Valid consent values are 'granted', 'denied'");
        }
        boolean zG1 = p0().G1();
        XQ1 xq1C = XQ1.c(i, bundle);
        Iterator it = xq1C.a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC3582eR1 = EnumC3582eR1.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((EnumC3582eR1) it.next()) != enumC3582eR1) {
                N1(xq1C, zG1);
                break;
            }
        }
        C2468cB1 c2468cB1B = C2468cB1.b(i, bundle);
        Iterator it2 = c2468cB1B.e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((EnumC3582eR1) it2.next()) != enumC3582eR1) {
                L1(c2468cB1B, zG1);
                break;
            }
        }
        Boolean boolA = C2468cB1.a(bundle);
        if (boolA != null) {
            String str = i == -30 ? "tcf" : "app";
            if (zG1) {
                D1(j, boolA.toString(), str, "allow_personalized_ads");
            } else {
                K1(str, "allow_personalized_ads", boolA.toString(), false, j);
            }
        }
    }

    public final void F1(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            n().j.d("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        I22.c(bundle2, "app_id", String.class, null);
        I22.c(bundle2, "origin", String.class, null);
        I22.c(bundle2, "name", String.class, null);
        I22.c(bundle2, "value", Object.class, null);
        I22.c(bundle2, "trigger_event_name", String.class, null);
        I22.c(bundle2, "trigger_timeout", Long.class, 0L);
        I22.c(bundle2, "timed_out_event_name", String.class, null);
        I22.c(bundle2, "timed_out_event_params", Bundle.class, null);
        I22.c(bundle2, "triggered_event_name", String.class, null);
        I22.c(bundle2, "triggered_event_params", Bundle.class, null);
        I22.c(bundle2, "time_to_live", Long.class, 0L);
        I22.c(bundle2, "expired_event_name", String.class, null);
        I22.c(bundle2, "expired_event_params", Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        int iO2 = u1().o2(string);
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        if (iO2 != 0) {
            OL1 ol1N = n();
            ol1N.g.c(c3386dP1.m.g(string), "Invalid conditional user property name");
            return;
        }
        if (u1().z1(obj, string) != 0) {
            OL1 ol1N2 = n();
            ol1N2.g.b(c3386dP1.m.g(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objU2 = u1().u2(obj, string);
        if (objU2 == null) {
            OL1 ol1N3 = n();
            ol1N3.g.b(c3386dP1.m.g(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        I22.d(bundle2, objU2);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            OL1 ol1N4 = n();
            ol1N4.g.b(c3386dP1.m.g(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 <= 15552000000L && j3 >= 1) {
            p0().E1(new RO1(this, bundle2, false, 3));
            return;
        }
        OL1 ol1N5 = n();
        ol1N5.g.b(c3386dP1.m.g(string), Long.valueOf(j3), "Invalid conditional user property time to live");
    }

    public final void G1(Boolean bool, boolean z) {
        v1();
        A1();
        n().n.c(bool, "Setting app measurement enabled (FE)");
        UM1 um1T1 = t1();
        um1T1.v1();
        SharedPreferences.Editor editorEdit = um1T1.C1().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            UM1 um1T12 = t1();
            um1T12.v1();
            SharedPreferences.Editor editorEdit2 = um1T12.C1().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        C7595vO1 c7595vO1 = c3386dP1.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        if (c3386dP1.E || !(bool == null || bool.booleanValue())) {
            V1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H1(java.lang.String r27, java.lang.String r28, long r29, android.os.Bundle r31, boolean r32, boolean r33, boolean r34) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FR1.H1(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    public final void I1(String str, String str2, Bundle bundle) {
        long jCurrentTimeMillis = ((C3386dP1) this.b).n.currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        p0().E1(new ZR1(this, bundle2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0057, code lost:
    
        if (r3 > 500) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x008a, code lost:
    
        if (r4 > 500) goto L158;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J1(java.lang.String r16, java.lang.String r17, android.os.Bundle r18, boolean r19, boolean r20, long r21) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FR1.J1(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K1(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
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
            mZ1 r5 = r11.u1()
            int r5 = r5.o2(r13)
        L17:
            r9 = r5
            goto L3b
        L19:
            mZ1 r5 = r11.u1()
            java.lang.String r6 = "user property"
            boolean r7 = r5.w2(r6, r13)
            r9 = 6
            if (r7 != 0) goto L27
            goto L3b
        L27:
            java.lang.String[] r7 = defpackage.AbstractC6632qL1.a
            r10 = 0
            boolean r7 = r5.k2(r6, r7, r10, r13)
            if (r7 != 0) goto L33
            r5 = 15
            goto L17
        L33:
            boolean r5 = r5.b2(r4, r6, r13)
            if (r5 != 0) goto L3a
            goto L3b
        L3a:
            r9 = r1
        L3b:
            uQ0 r5 = r8.x
            java.lang.Object r6 = r8.b
            dP1 r6 = (defpackage.C3386dP1) r6
            r7 = 1
            if (r9 == 0) goto L63
            r11.u1()
            java.lang.String r0 = defpackage.C5910mZ1.J1(r4, r13, r7)
            if (r3 == 0) goto L51
            int r1 = r13.length()
        L51:
            r6.p()
            r2 = 0
            java.lang.String r3 = "_ev"
            r12 = r5
            r13 = r2
            r14 = r9
            r15 = r3
            r16 = r0
            r17 = r1
            defpackage.C5910mZ1.Z1(r12, r13, r14, r15, r16, r17)
            return
        L63:
            if (r0 == 0) goto Lb5
            mZ1 r9 = r11.u1()
            int r9 = r9.z1(r14, r13)
            if (r9 == 0) goto L98
            r11.u1()
            java.lang.String r2 = defpackage.C5910mZ1.J1(r4, r13, r7)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 != 0) goto L7e
            boolean r3 = r0 instanceof java.lang.CharSequence
            if (r3 == 0) goto L86
        L7e:
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r1 = r0.length()
        L86:
            r6.p()
            r0 = 0
            java.lang.String r3 = "_ev"
            r12 = r5
            r13 = r0
            r14 = r9
            r15 = r3
            r16 = r2
            r17 = r1
            defpackage.C5910mZ1.Z1(r12, r13, r14, r15, r16, r17)
            return
        L98:
            mZ1 r1 = r11.u1()
            java.lang.Object r4 = r1.u2(r14, r13)
            if (r4 == 0) goto Lb4
            vO1 r9 = r11.p0()
            qb1 r10 = new qb1
            r7 = 2
            r0 = r10
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.E1(r10)
        Lb4:
            return
        Lb5:
            vO1 r9 = r11.p0()
            qb1 r10 = new qb1
            r4 = 0
            r7 = 2
            r0 = r10
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.E1(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FR1.K1(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final void L1(C2468cB1 c2468cB1, boolean z) {
        RunnableC7990xT1 runnableC7990xT1 = new RunnableC7990xT1(this, 1, c2468cB1);
        if (!z) {
            p0().E1(runnableC7990xT1);
        } else {
            v1();
            runnableC7990xT1.run();
        }
    }

    public final void M1(XQ1 xq1) {
        v1();
        boolean z = (xq1.i(TQ1.ANALYTICS_STORAGE) && xq1.i(TQ1.AD_STORAGE)) || ((C3386dP1) this.b).o().J1();
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        C7595vO1 c7595vO1 = c3386dP1.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        if (z != c3386dP1.E) {
            C3386dP1 c3386dP12 = (C3386dP1) this.b;
            C7595vO1 c7595vO12 = c3386dP12.j;
            C3386dP1.e(c7595vO12);
            c7595vO12.v1();
            c3386dP12.E = z;
            UM1 um1T1 = t1();
            um1T1.v1();
            Boolean boolValueOf = um1T1.C1().contains("measurement_enabled_from_api") ? Boolean.valueOf(um1T1.C1().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                G1(Boolean.valueOf(z), false);
            }
        }
    }

    public final void N1(XQ1 xq1, boolean z) {
        boolean z2;
        XQ1 xq12;
        boolean z3;
        boolean z4;
        A1();
        int i = xq1.b;
        if (i != -10) {
            EnumC3582eR1 enumC3582eR1 = (EnumC3582eR1) xq1.a.get(TQ1.AD_STORAGE);
            if (enumC3582eR1 == null) {
                enumC3582eR1 = EnumC3582eR1.UNINITIALIZED;
            }
            EnumC3582eR1 enumC3582eR12 = EnumC3582eR1.UNINITIALIZED;
            if (enumC3582eR1 == enumC3582eR12) {
                EnumC3582eR1 enumC3582eR13 = (EnumC3582eR1) xq1.a.get(TQ1.ANALYTICS_STORAGE);
                if (enumC3582eR13 == null) {
                    enumC3582eR13 = enumC3582eR12;
                }
                if (enumC3582eR13 == enumC3582eR12) {
                    n().l.d("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.i) {
            try {
                z2 = false;
                if (XQ1.h(i, this.p.b)) {
                    XQ1 xq13 = this.p;
                    EnumMap enumMap = xq1.a;
                    TQ1[] tq1Arr = (TQ1[]) enumMap.keySet().toArray(new TQ1[0]);
                    int length = tq1Arr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        TQ1 tq1 = tq1Arr[i2];
                        EnumC3582eR1 enumC3582eR14 = (EnumC3582eR1) enumMap.get(tq1);
                        EnumC3582eR1 enumC3582eR15 = (EnumC3582eR1) xq13.a.get(tq1);
                        EnumC3582eR1 enumC3582eR16 = EnumC3582eR1.DENIED;
                        if (enumC3582eR14 == enumC3582eR16 && enumC3582eR15 != enumC3582eR16) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    TQ1 tq12 = TQ1.ANALYTICS_STORAGE;
                    if (xq1.i(tq12) && !this.p.i(tq12)) {
                        z2 = true;
                    }
                    XQ1 xq1J = xq1.j(this.p);
                    this.p = xq1J;
                    xq12 = xq1J;
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
            n().m.c(xq12, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.q.getAndIncrement();
        if (z3) {
            W1(null);
            ST1 st1 = new ST1(this, xq12, andIncrement, z4, 1);
            if (!z) {
                p0().F1(st1);
                return;
            } else {
                v1();
                st1.run();
                return;
            }
        }
        ST1 st12 = new ST1(this, xq12, andIncrement, z4, 0);
        if (z) {
            v1();
            st12.run();
        } else if (i == 30 || i == -10) {
            p0().F1(st12);
        } else {
            p0().E1(st12);
        }
    }

    public final PriorityQueue P1() {
        if (this.n == null) {
            this.n = AbstractC1362Rf1.n(Comparator.comparing(new MR1(), new C2209aq0(28)));
        }
        return this.n;
    }

    public final void Q1() {
        v1();
        A1();
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        if (c3386dP1.g()) {
            Boolean boolD1 = c3386dP1.g.D1("google_analytics_deferred_deep_link_enabled");
            if (boolD1 != null && boolD1.booleanValue()) {
                n().n.d("Deferred Deep Link feature enabled.");
                C7595vO1 c7595vO1P0 = p0();
                ZO1 zo1 = new ZO1(1);
                zo1.b = this;
                c7595vO1P0.E1(zo1);
            }
            C2528cV1 c2528cV1J = RI1.j(c3386dP1);
            EY1 ey1N1 = c2528cV1J.N1(true);
            ((C3386dP1) c2528cV1J.b).k().D1(3, new byte[0]);
            c2528cV1J.F1(new HV1(c2528cV1J, ey1N1, 0));
            this.t = false;
            UM1 um1T1 = t1();
            um1T1.v1();
            String string = um1T1.C1().getString("previous_os_version", null);
            ((C3386dP1) um1T1.b).i().w1();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = um1T1.C1().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c3386dP1.i().w1();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            X1("auto", "_ou", bundle);
        }
    }

    public final void R1() {
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        if (!(c3386dP1.a.getApplicationContext() instanceof Application) || this.d == null) {
            return;
        }
        ((Application) c3386dP1.a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.d);
    }

    public final void S1() {
        C7434uY1.a();
        if (((C3386dP1) this.b).g.E1(null, IB1.R0)) {
            if (p0().G1()) {
                n().g.d("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C3759fN.p()) {
                n().g.d("Cannot get trigger URIs from main thread");
                return;
            }
            A1();
            n().o.d("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C7595vO1 c7595vO1P0 = p0();
            OR1 or1 = new OR1();
            or1.c = this;
            or1.b = atomicReference;
            c7595vO1P0.z1(atomicReference, 10000L, "get trigger URIs", or1);
            List list = (List) atomicReference.get();
            if (list == null) {
                n().g.d("Timed out waiting for get trigger URIs");
                return;
            }
            C7595vO1 c7595vO1P02 = p0();
            RO1 ro1 = new RO1();
            ro1.b = this;
            ro1.c = list;
            c7595vO1P02.E1(ro1);
        }
    }

    public final void T1() {
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
        v1();
        n().n.d("Handle tcf update.");
        SharedPreferences sharedPreferencesB1 = t1().B1();
        HashMap map = new HashMap();
        try {
            string = sharedPreferencesB1.getString("IABTCF_VendorConsents", "\u0000");
        } catch (ClassCastException unused) {
            string = "\u0000";
        }
        if (!"\u0000".equals(string) && string.length() > 754) {
            map.put("GoogleConsent", String.valueOf(string.charAt(754)));
        }
        try {
            i = sharedPreferencesB1.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused2) {
            i = -1;
        }
        if (i != -1) {
            map.put("gdprApplies", String.valueOf(i));
        }
        try {
            i2 = sharedPreferencesB1.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused3) {
            i2 = -1;
        }
        if (i2 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(i2));
        }
        try {
            i3 = sharedPreferencesB1.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused4) {
            i3 = -1;
        }
        if (i3 != -1) {
            map.put("PolicyVersion", String.valueOf(i3));
        }
        try {
            string2 = sharedPreferencesB1.getString("IABTCF_PurposeConsents", "\u0000");
        } catch (ClassCastException unused5) {
            string2 = "\u0000";
        }
        if (!"\u0000".equals(string2)) {
            map.put("PurposeConsents", string2);
        }
        try {
            i4 = sharedPreferencesB1.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused6) {
            i4 = -1;
        }
        if (i4 != -1) {
            map.put("CmpSdkID", String.valueOf(i4));
        }
        C7431uX1 c7431uX1 = new C7431uX1(map);
        n().o.c(c7431uX1, "Tcf preferences read");
        UM1 um1T1 = t1();
        um1T1.v1();
        String string3 = um1T1.C1().getString("stored_tcf_param", "");
        String strA = c7431uX1.a();
        if (strA.equals(string3)) {
            return;
        }
        SharedPreferences.Editor editorEdit = um1T1.C1().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        HashMap map2 = c7431uX1.a;
        if ("1".equals(map2.get("GoogleConsent")) && "1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            int iB = c7431uX1.b();
            if (iB < 0) {
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
                    if (str.length() <= 6 || iB < 4) {
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
        n().o.c(bundle, "Consent generated from Tcf");
        if (bundle != Bundle.EMPTY) {
            E1(bundle, -30, ((C3386dP1) this.b).n.currentTimeMillis());
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
        int iB2 = c7431uX1.b();
        if (iB2 < 0 || iB2 > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iB2));
        }
        Preconditions.checkArgument(true);
        int i7 = "1".equals(map2.get("gdprApplies")) ? 2 : i5;
        int i8 = i7 | 4;
        if ("1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            i8 = i7 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i8));
        bundle4.putString("_tcfd", sb.toString());
        X1("auto", "_tcf", bundle4);
    }

    public final void U1() {
        C8382zX1 c8382zX1;
        C0219Co0 c0219Co0G2;
        v1();
        this.o = false;
        if (P1().isEmpty() || this.j || (c8382zX1 = (C8382zX1) P1().poll()) == null || (c0219Co0G2 = u1().G2()) == null) {
            return;
        }
        this.j = true;
        C6934rx c6934rx = n().o;
        String str = c8382zX1.a;
        c6934rx.c(str, "Registering trigger URI");
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0D = c0219Co0G2.d(Uri.parse(str));
        if (interfaceFutureC0750Jj0D != null) {
            interfaceFutureC0750Jj0D.d(new WZ(interfaceFutureC0750Jj0D, 0, new ES1(this, 0, c8382zX1)), new ExecutorC4371ia(this));
        } else {
            this.j = false;
            P1().add(c8382zX1);
        }
    }

    public final void V1() {
        v1();
        String strO = t1().o.o();
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        if (strO != null) {
            if ("unset".equals(strO)) {
                D1(c3386dP1.n.currentTimeMillis(), null, "app", "_npa");
            } else {
                D1(c3386dP1.n.currentTimeMillis(), Long.valueOf("true".equals(strO) ? 1L : 0L), "app", "_npa");
            }
        }
        if (c3386dP1.f() && this.t) {
            n().n.d("Recording app launch after enabling measurement for the first time (FE)");
            Q1();
            y1().f.l();
            p0().E1(new ZO1(this));
            return;
        }
        n().n.d("Updating Scion state (FE)");
        C2528cV1 c2528cV1O = c3386dP1.o();
        c2528cV1O.v1();
        c2528cV1O.A1();
        c2528cV1O.F1(new FV1(c2528cV1O, c2528cV1O.N1(true), 2));
    }

    public final void W1(String str) {
        this.h.set(str);
    }

    public final void X1(String str, String str2, Bundle bundle) {
        v1();
        C1(((C3386dP1) this.b).n.currentTimeMillis(), bundle, str, str2);
    }

    @Override // defpackage.AbstractC4128hI1
    public final boolean z1() {
        return false;
    }
}
