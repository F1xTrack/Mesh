package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class JA0 implements Parcelable {
    public static final Parcelable.Creator<JA0> CREATOR = new C7856Kl0(17);

    /* renamed from: a */
    public final String f5368a;

    /* renamed from: b */
    public final C7731Ia1 f5369b;

    /* renamed from: c */
    public boolean f5370c;

    public JA0(String str, C7564Ev0 c7564Ev0) {
        this.f5370c = false;
        this.f5368a = str;
        this.f5369b = new C7731Ia1();
    }

    /* renamed from: b */
    public static IA0[] m4241b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        IA0[] ia0Arr = new IA0[list.size()];
        IA0 ia0M4243a = ((JA0) list.get(0)).m4243a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            IA0 ia0M4243a2 = ((JA0) list.get(i)).m4243a();
            if (z || !((JA0) list.get(i)).f5370c) {
                ia0Arr[i] = ia0M4243a2;
            } else {
                ia0Arr[0] = ia0M4243a2;
                ia0Arr[i] = ia0M4243a;
                z = true;
            }
        }
        if (!z) {
            ia0Arr[0] = ia0M4243a;
        }
        return ia0Arr;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d0  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.JA0 m4242c(java.lang.String r9) {
        /*
            java.lang.String r0 = "-"
            java.lang.String r1 = ""
            java.lang.String r9 = r9.replace(r0, r1)
            JA0 r0 = new JA0
            Ev0 r1 = new Ev0
            r2 = 9
            r1.<init>(r2)
            r0.<init>(r9, r1)
            Lw r9 = p000.C0751Lw.m5135e()
            boolean r1 = r9.m5156u()
            if (r1 == 0) goto Ld0
            double r1 = java.lang.Math.random()
            java.lang.Class<ix> r3 = p000.C6206ix.class
            monitor-enter(r3)
            ix r4 = p000.C6206ix.f34811a     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L34
            ix r4 = new ix     // Catch: java.lang.Throwable -> L31
            r4.<init>()     // Catch: java.lang.Throwable -> L31
            p000.C6206ix.f34811a = r4     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r9 = move-exception
            goto Lce
        L34:
            ix r4 = p000.C6206ix.f34811a     // Catch: java.lang.Throwable -> L31
            monitor-exit(r3)
            zy0 r3 = r9.m5149k(r4)
            boolean r5 = r3.m26594b()
            if (r5 == 0) goto L56
            java.lang.Object r3 = r3.m26593a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 / r7
            boolean r3 = p000.C0751Lw.m5139v(r5)
            if (r3 == 0) goto L56
            goto Lc8
        L56:
            com.google.firebase.perf.config.RemoteConfigManager r3 = r9.f6932a
            java.lang.String r5 = "fpr_vc_session_sampling_rate"
            zy0 r3 = r3.getDouble(r5)
            boolean r5 = r3.m26594b()
            if (r5 == 0) goto L90
            java.lang.Object r5 = r3.m26593a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            boolean r5 = p000.C0751Lw.m5139v(r5)
            if (r5 == 0) goto L90
            gJ r9 = r9.f6934c
            java.lang.String r4 = "com.google.firebase.perf.SessionSamplingRate"
            java.lang.Object r5 = r3.m26593a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            r9.m18422e(r4, r5)
            java.lang.Object r9 = r3.m26593a()
            java.lang.Double r9 = (java.lang.Double) r9
            double r5 = r9.doubleValue()
            goto Lc8
        L90:
            zy0 r3 = r9.m5141b(r4)
            boolean r4 = r3.m26594b()
            if (r4 == 0) goto Lb5
            java.lang.Object r4 = r3.m26593a()
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            boolean r4 = p000.C0751Lw.m5139v(r4)
            if (r4 == 0) goto Lb5
            java.lang.Object r9 = r3.m26593a()
            java.lang.Double r9 = (java.lang.Double) r9
            double r5 = r9.doubleValue()
            goto Lc8
        Lb5:
            com.google.firebase.perf.config.RemoteConfigManager r9 = r9.f6932a
            boolean r9 = r9.isLastFetchFailed()
            if (r9 == 0) goto Lc3
            r5 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            goto Lc8
        Lc3:
            r5 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
        Lc8:
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 >= 0) goto Ld0
            r9 = 1
            goto Ld1
        Lce:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
            throw r9
        Ld0:
            r9 = 0
        Ld1:
            r0.f5370c = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.JA0.m4242c(java.lang.String):JA0");
    }

    /* renamed from: a */
    public final IA0 m4243a() {
        HA0 ha0M3774y = IA0.m3774y();
        ha0M3774y.m23922n();
        IA0.m3772u((IA0) ha0M3774y.f40483b, this.f5368a);
        if (this.f5370c) {
            ha0M3774y.m23922n();
            IA0.m3773v((IA0) ha0M3774y.f40483b);
        }
        return (IA0) ha0M3774y.m23920l();
    }

    /* renamed from: d */
    public final boolean m4244d() {
        C4085fx c4085fx;
        long jLongValue;
        long minutes = TimeUnit.MICROSECONDS.toMinutes(this.f5369b.m3946a());
        C0751Lw c0751LwM5135e = C0751Lw.m5135e();
        c0751LwM5135e.getClass();
        synchronized (C4085fx.class) {
            try {
                if (C4085fx.f27506a == null) {
                    C4085fx.f27506a = new C4085fx();
                }
                c4085fx = C4085fx.f27506a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C11991zy0 c11991zy0M5150l = c0751LwM5135e.m5150l(c4085fx);
        if (!c11991zy0M5150l.m26594b() || ((Long) c11991zy0M5150l.m26593a()).longValue() <= 0) {
            C11991zy0 c11991zy0 = c0751LwM5135e.f6932a.getLong("fpr_session_max_duration_min");
            if (!c11991zy0.m26594b() || ((Long) c11991zy0.m26593a()).longValue() <= 0) {
                C11991zy0 c11991zy0M5142c = c0751LwM5135e.m5142c(c4085fx);
                jLongValue = (!c11991zy0M5142c.m26594b() || ((Long) c11991zy0M5142c.m26593a()).longValue() <= 0) ? 240L : ((Long) c11991zy0M5142c.m26593a()).longValue();
            } else {
                c0751LwM5135e.f6934c.m18421d(((Long) c11991zy0.m26593a()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                jLongValue = ((Long) c11991zy0.m26593a()).longValue();
            }
        } else {
            jLongValue = ((Long) c11991zy0M5150l.m26593a()).longValue();
        }
        return minutes > jLongValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5368a);
        parcel.writeByte(this.f5370c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f5369b, 0);
    }

    public JA0(Parcel parcel) {
        this.f5370c = false;
        this.f5368a = parcel.readString();
        this.f5370c = parcel.readByte() != 0;
        this.f5369b = (C7731Ia1) parcel.readParcelable(C7731Ia1.class.getClassLoader());
    }
}
