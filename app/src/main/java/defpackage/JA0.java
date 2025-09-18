package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class JA0 implements Parcelable {
    public static final Parcelable.Creator<JA0> CREATOR = new C0834Kl0(17);
    public final String a;
    public final C0646Ia1 b;
    public boolean c;

    public JA0(String str, C0396Ev0 c0396Ev0) {
        this.c = false;
        this.a = str;
        this.b = new C0646Ia1();
    }

    public static IA0[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        IA0[] ia0Arr = new IA0[list.size()];
        IA0 ia0A = ((JA0) list.get(0)).a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            IA0 ia0A2 = ((JA0) list.get(i)).a();
            if (z || !((JA0) list.get(i)).c) {
                ia0Arr[i] = ia0A2;
            } else {
                ia0Arr[0] = ia0A2;
                ia0Arr[i] = ia0A;
                z = true;
            }
        }
        if (!z) {
            ia0Arr[0] = ia0A;
        }
        return ia0Arr;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.JA0 c(java.lang.String r9) {
        /*
            java.lang.String r0 = "-"
            java.lang.String r1 = ""
            java.lang.String r9 = r9.replace(r0, r1)
            JA0 r0 = new JA0
            Ev0 r1 = new Ev0
            r2 = 9
            r1.<init>(r2)
            r0.<init>(r9, r1)
            Lw r9 = defpackage.C0943Lw.e()
            boolean r1 = r9.u()
            if (r1 == 0) goto Ld0
            double r1 = java.lang.Math.random()
            java.lang.Class<ix> r3 = defpackage.C5216ix.class
            monitor-enter(r3)
            ix r4 = defpackage.C5216ix.a     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L34
            ix r4 = new ix     // Catch: java.lang.Throwable -> L31
            r4.<init>()     // Catch: java.lang.Throwable -> L31
            defpackage.C5216ix.a = r4     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r9 = move-exception
            goto Lce
        L34:
            ix r4 = defpackage.C5216ix.a     // Catch: java.lang.Throwable -> L31
            monitor-exit(r3)
            zy0 r3 = r9.k(r4)
            boolean r5 = r3.b()
            if (r5 == 0) goto L56
            java.lang.Object r3 = r3.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 / r7
            boolean r3 = defpackage.C0943Lw.v(r5)
            if (r3 == 0) goto L56
            goto Lc8
        L56:
            com.google.firebase.perf.config.RemoteConfigManager r3 = r9.a
            java.lang.String r5 = "fpr_vc_session_sampling_rate"
            zy0 r3 = r3.getDouble(r5)
            boolean r5 = r3.b()
            if (r5 == 0) goto L90
            java.lang.Object r5 = r3.a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            boolean r5 = defpackage.C0943Lw.v(r5)
            if (r5 == 0) goto L90
            gJ r9 = r9.c
            java.lang.String r4 = "com.google.firebase.perf.SessionSamplingRate"
            java.lang.Object r5 = r3.a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            r9.e(r4, r5)
            java.lang.Object r9 = r3.a()
            java.lang.Double r9 = (java.lang.Double) r9
            double r5 = r9.doubleValue()
            goto Lc8
        L90:
            zy0 r3 = r9.b(r4)
            boolean r4 = r3.b()
            if (r4 == 0) goto Lb5
            java.lang.Object r4 = r3.a()
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            boolean r4 = defpackage.C0943Lw.v(r4)
            if (r4 == 0) goto Lb5
            java.lang.Object r9 = r3.a()
            java.lang.Double r9 = (java.lang.Double) r9
            double r5 = r9.doubleValue()
            goto Lc8
        Lb5:
            com.google.firebase.perf.config.RemoteConfigManager r9 = r9.a
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
            r0.c = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.JA0.c(java.lang.String):JA0");
    }

    public final IA0 a() {
        HA0 ha0Y = IA0.y();
        ha0Y.n();
        IA0.u((IA0) ha0Y.b, this.a);
        if (this.c) {
            ha0Y.n();
            IA0.v((IA0) ha0Y.b);
        }
        return (IA0) ha0Y.l();
    }

    public final boolean d() {
        C3867fx c3867fx;
        long jLongValue;
        long minutes = TimeUnit.MICROSECONDS.toMinutes(this.b.a());
        C0943Lw c0943LwE = C0943Lw.e();
        c0943LwE.getClass();
        synchronized (C3867fx.class) {
            try {
                if (C3867fx.a == null) {
                    C3867fx.a = new C3867fx();
                }
                c3867fx = C3867fx.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C8462zy0 c8462zy0L = c0943LwE.l(c3867fx);
        if (!c8462zy0L.b() || ((Long) c8462zy0L.a()).longValue() <= 0) {
            C8462zy0 c8462zy0 = c0943LwE.a.getLong("fpr_session_max_duration_min");
            if (!c8462zy0.b() || ((Long) c8462zy0.a()).longValue() <= 0) {
                C8462zy0 c8462zy0C = c0943LwE.c(c3867fx);
                jLongValue = (!c8462zy0C.b() || ((Long) c8462zy0C.a()).longValue() <= 0) ? 240L : ((Long) c8462zy0C.a()).longValue();
            } else {
                c0943LwE.c.d(((Long) c8462zy0.a()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                jLongValue = ((Long) c8462zy0.a()).longValue();
            }
        } else {
            jLongValue = ((Long) c8462zy0L.a()).longValue();
        }
        return minutes > jLongValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.b, 0);
    }

    public JA0(Parcel parcel) {
        this.c = false;
        this.a = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.b = (C0646Ia1) parcel.readParcelable(C0646Ia1.class.getClassLoader());
    }
}
