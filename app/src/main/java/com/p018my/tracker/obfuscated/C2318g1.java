package com.p018my.tracker.obfuscated;

import com.p018my.tracker.obfuscated.C2310e1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.g1 */
/* loaded from: classes2.dex */
public final class C2318g1 {

    /* renamed from: a */
    final C2310e1 f19951a;

    /* renamed from: b */
    final int f19952b;

    /* renamed from: c */
    final int f19953c;

    /* renamed from: d */
    final int f19954d;

    /* renamed from: e */
    final int f19955e;

    /* renamed from: f */
    long f19956f;

    /* renamed from: g */
    long f19957g;

    private C2318g1(C2310e1 c2310e1, int i, int i2, int i3, int i4) {
        this.f19951a = c2310e1;
        this.f19952b = i;
        this.f19953c = i2;
        this.f19954d = i3;
        this.f19955e = i4;
        Long lM12908b = c2310e1.m12908b("timestamp_base");
        this.f19956f = lM12908b == null ? 0L : lM12908b.longValue();
        this.f19957g = c2310e1.m12929l();
    }

    /* renamed from: a */
    public boolean m13098a() {
        try {
            this.f19951a.m12911c();
            this.f19951a.m12909b();
            this.f19951a.m12918e();
            this.f19951a.m12915d();
            this.f19951a.m12900a();
            this.f19951a.m12904a("custom_events_skipped_count", (Long) null);
            this.f19957g = 0L;
            C2310e1.f fVarM12899a = this.f19951a.m12899a("default_session");
            try {
                m13110c(fVarM12899a.m12930b() ? fVarM12899a.m12949m() : 0L);
                fVarM12899a.close();
                return true;
            } finally {
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public InterfaceC2390y1 m13103b() {
        return new C2394z1(this.f19951a);
    }

    /* renamed from: c */
    public InterfaceC2292a2 m13109c() {
        return new C2297b2(this.f19951a, "default_session");
    }

    /* renamed from: d */
    public InterfaceC2294b m13112d() {
        try {
            return this.f19951a.m12920f();
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("MyTrackerRepository error: ", th);
            return null;
        }
    }

    /* renamed from: e */
    public List m13114e() {
        ArrayList arrayList = new ArrayList();
        C2310e1.b bVarM12923h = null;
        try {
            bVarM12923h = this.f19951a.m12923h();
            while (bVarM12923h.m12930b()) {
                C2312f c2312fM12958a = C2312f.m12958a(bVarM12923h.m12933m(), bVarM12923h.m12934n(), bVarM12923h.m12935o(), bVarM12923h.m12936p(), bVarM12923h.m12932e());
                if (c2312fM12958a != null) {
                    arrayList.add(c2312fM12958a.m12959a(bVarM12923h.m12931a()));
                }
            }
        } catch (Throwable th) {
            try {
                AbstractC2391y2.m13573b("MyTrackerRepository error: error while reading purchases", th);
            } finally {
                if (bVarM12923h != null) {
                    bVarM12923h.close();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public long m13116f() {
        try {
            Long lM12908b = this.f19951a.m12908b("custom_events_skipped_count");
            if (lM12908b == null) {
                return 0L;
            }
            return lM12908b.longValue();
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Error: get custom events skipped count", th);
            return 0L;
        }
    }

    /* renamed from: g */
    public List m13118g() {
        ArrayList arrayList = new ArrayList();
        C2310e1.e eVarM12928k = null;
        try {
            eVarM12928k = this.f19951a.m12928k();
            while (eVarM12928k.m12930b()) {
                C2353p0 c2353p0M13371a = C2353p0.m13371a(eVarM12928k.m12944m(), eVarM12928k.m12945n(), eVarM12928k.m12943e());
                if (c2353p0M13371a != null) {
                    arrayList.add(c2353p0M13371a.m13373a(eVarM12928k.m12942a()));
                }
            }
        } catch (Throwable th) {
            try {
                AbstractC2391y2.m13573b("MyTrackerRepository error: error while reading purchases", th);
            } finally {
                if (eVarM12928k != null) {
                    eVarM12928k.close();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public long m13120h() {
        return this.f19957g;
    }

    /* renamed from: i */
    public long m13122i() {
        return this.f19956f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* renamed from: j */
    public boolean m13124j() {
        C2310e1.c cVarM12925i;
        C2310e1.f fVarM12899a;
        try {
            cVarM12925i = this.f19951a.m12925i();
        } catch (Exception unused) {
        }
        try {
            ?? M12930b = cVarM12925i.m12930b();
            try {
                cVarM12925i.close();
                fVarM12899a = this.f19951a.m12899a("default_session");
            } catch (Exception unused2) {
            }
            try {
                M12930b = M12930b;
                if (fVarM12899a.m12930b()) {
                    M12930b++;
                }
                fVarM12899a.close();
                return M12930b != 0;
            } finally {
            }
        } catch (Throwable th) {
            if (cVarM12925i != null) {
                try {
                    cVarM12925i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: k */
    public boolean m13126k(byte[] bArr, long j) {
        return m13093c(13, bArr, j);
    }

    /* renamed from: l */
    public boolean m13127l(byte[] bArr, long j) {
        return m13100a(25, bArr, false, true, j);
    }

    /* renamed from: m */
    public boolean m13128m(byte[] bArr, long j) {
        return m13093c(7, bArr, j);
    }

    /* renamed from: n */
    public boolean m13129n(byte[] bArr, long j) {
        return m13100a(26, bArr, false, true, j);
    }

    /* renamed from: o */
    public boolean m13130o(byte[] bArr, long j) {
        return m13100a(28, bArr, false, true, j);
    }

    /* renamed from: p */
    public boolean m13131p(byte[] bArr, long j) {
        return m13100a(29, bArr, false, true, j);
    }

    /* renamed from: q */
    public boolean m13132q(byte[] bArr, long j) {
        return m13100a(2, bArr, true, false, j);
    }

    /* renamed from: r */
    public boolean m13133r(byte[] bArr, long j) {
        return m13093c(8, bArr, j);
    }

    /* renamed from: s */
    public boolean m13134s(byte[] bArr, long j) {
        return m13100a(5, bArr, true, false, j);
    }

    /* renamed from: a */
    public void m13094a(long j) {
        try {
            this.f19951a.m12912c(j);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("MyTrackerRepository error: ", th);
        }
    }

    /* renamed from: b */
    public boolean m13108b(byte[] bArr, long j) {
        return m13100a(33, bArr, true, false, j);
    }

    /* renamed from: c */
    public boolean m13111c(byte[] bArr, long j) {
        return m13100a(32, bArr, true, false, j);
    }

    /* renamed from: d */
    public boolean m13113d(byte[] bArr, long j) {
        try {
            if (this.f19951a.m12919f(6L) >= this.f19953c) {
                long jLongValue = 0;
                if (this.f19951a.m12895a(6L, bArr) == 0) {
                    AbstractC2391y2.m13568a("MyTrackerRepository: maximum count of custom events is exceeded, event has been skipped");
                    Long lM12908b = this.f19951a.m12908b("custom_events_skipped_count");
                    if (lM12908b != null) {
                        jLongValue = lM12908b.longValue();
                    }
                    long j2 = jLongValue + 1;
                    AbstractC2391y2.m13568a("MyTrackerRepository: skipped custom events count: " + j2);
                    this.f19951a.m12904a("custom_events_skipped_count", Long.valueOf(j2));
                    return false;
                }
            }
            return m13100a(6, bArr, false, true, j);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("MyTrackerRepository error: event serialization failed, type: 6", th);
            return false;
        }
    }

    /* renamed from: e */
    public boolean m13115e(byte[] bArr, long j) {
        return m13100a(15, bArr, true, true, j);
    }

    /* renamed from: f */
    public boolean m13117f(byte[] bArr, long j) {
        return m13100a(10, bArr, true, false, j);
    }

    /* renamed from: g */
    public boolean m13119g(byte[] bArr, long j) {
        return m13100a(27, bArr, false, true, j);
    }

    /* renamed from: h */
    public boolean m13121h(byte[] bArr, long j) {
        return m13100a(31, bArr, true, false, j);
    }

    /* renamed from: i */
    public boolean m13123i(byte[] bArr, long j) {
        return m13100a(1, bArr, true, false, j);
    }

    /* renamed from: j */
    public boolean m13125j(byte[] bArr, long j) {
        return m13093c(9, bArr, j);
    }

    /* renamed from: c */
    private boolean m13093c(int i, byte[] bArr, long j) {
        try {
            return m13100a(i, bArr, false, true, j);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("MyTrackerRepository error: event serialization failed, type: " + i, th);
            return false;
        }
    }

    /* renamed from: a */
    public boolean m13099a(int i, byte[] bArr, long j) {
        return m13100a(i, bArr, true, true, j);
    }

    /* renamed from: b */
    public boolean m13107b(long j) {
        return m13093c(3, new byte[0], j);
    }

    /* renamed from: a */
    public boolean m13102a(byte[] bArr, long j) {
        return m13100a(14, bArr, true, false, j);
    }

    /* renamed from: b */
    public boolean m13106b(int i, byte[] bArr, long j) {
        boolean z = i == 20 || i == 21;
        if (i == 24) {
            try {
                long j2 = i;
                if (this.f19951a.m12919f(j2) >= this.f19953c && this.f19951a.m12895a(j2, bArr) == 0) {
                    AbstractC2391y2.m13568a("MyTrackerRepository: maximum count of mini-app custom events is exceeded, event has been skipped");
                    return false;
                }
            } catch (Throwable th) {
                AbstractC2391y2.m13573b("MyTrackerRepository error: event serialization failed, type: " + i, th);
                return false;
            }
        }
        return m13100a(i, bArr, z, true, j);
    }

    /* renamed from: c */
    public void m13110c(long j) {
        try {
            this.f19951a.m12904a("timestamp_base", Long.valueOf(j));
            this.f19956f = j;
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("MyTrackerRepository error: ", th);
        }
    }

    /* renamed from: a */
    public void m13095a(C2312f c2312f) {
        String string = c2312f.m12965e().toString();
        String strM12961a = c2312f.m12961a();
        String strM12966f = c2312f.m12966f();
        int iM12967g = c2312f.m12967g();
        try {
            if (this.f19951a.m12921g() >= this.f19955e) {
                AbstractC2391y2.m13568a("MyTrackerRepository: max count of raw purchases is reached");
                AbstractC2391y2.m13568a("MyTrackerRepository: appgalleery raw purchase with data: " + string + ", signature " + strM12961a + " isn't inserted");
                return;
            }
            long jM12898a = this.f19951a.m12898a(string, strM12961a, strM12966f, iM12967g, c2312f.m12968h());
            if (jM12898a >= 0) {
                AbstractC2391y2.m13568a("MyTrackerRepository: appgallery raw purchase was inserted; id: " + jM12898a + ", data: " + string + ", signature: " + strM12961a);
                c2312f.m12959a(jM12898a);
            }
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("MyTrackerRepository error: can't insert appgallery raw purchase with data: " + string + ", signature " + strM12961a, th);
        }
    }

    /* renamed from: b */
    public void m13104b(C2312f c2312f) {
        Long lM12962b = c2312f.m12962b();
        if (lM12962b != null) {
            try {
                this.f19951a.m12901a(lM12962b.longValue());
            } catch (Throwable th) {
                AbstractC2391y2.m13573b("MyTrackerRepository error: error while removing raw appgallery purchase with id " + lM12962b, th);
            }
        }
    }

    /* renamed from: a */
    public boolean m13100a(int i, byte[] bArr, boolean z, boolean z2, long j) {
        long jM12938c;
        try {
            long jM12893a = C2310e1.f19890y;
            if (z2) {
                C2310e1.c cVarM12907b = null;
                try {
                    cVarM12907b = this.f19951a.m12907b(i, bArr);
                    if (cVarM12907b.m12930b()) {
                        jM12893a = cVarM12907b.m12937a();
                        jM12938c = cVarM12907b.m12938c();
                    } else {
                        jM12893a = jM12893a;
                        jM12938c = 0;
                    }
                    cVarM12907b.close();
                } catch (Throwable th) {
                    if (cVarM12907b != null) {
                        cVarM12907b.close();
                    }
                    throw th;
                }
            } else {
                jM12938c = 0;
            }
            if (jM12893a == C2310e1.f19890y) {
                AbstractC2391y2.m13568a("MyTrackerRepository: insert " + i + " event");
                jM12893a = this.f19951a.m12893a(i, bArr, z);
                if (jM12893a != C2310e1.f19890y && z) {
                    this.f19957g++;
                }
            } else {
                AbstractC2391y2.m13568a("MyTrackerRepository: aggregate " + i + " event");
            }
            if (jM12893a == C2310e1.f19890y) {
                AbstractC2391y2.m13572b("MyTrackerRepository error: event insertion failed, type: " + i);
                return false;
            }
            if (this.f19956f == 0) {
                m13110c(j);
            }
            this.f19951a.m12913c(jM12893a, j - this.f19956f);
            long jM12914d = this.f19951a.m12914d(jM12893a);
            AbstractC2391y2.m13568a("MyTrackerRepository: event timestamps count: " + jM12914d);
            long j2 = (long) this.f19952b;
            if (jM12914d <= j2) {
                return true;
            }
            long jM12894a = this.f19951a.m12894a(jM12893a, jM12914d - j2);
            this.f19951a.m12916d(jM12893a, jM12938c + jM12894a);
            AbstractC2391y2.m13568a("MyTrackerRepository: maximum count of event timestamps is exceeded, remove oldest timestamps, count: " + jM12894a);
            return true;
        } catch (Throwable th2) {
            AbstractC2391y2.m13573b("MyTrackerRepository error: event insertion failed, type: " + i, th2);
            return false;
        }
    }

    /* renamed from: b */
    public void m13105b(C2353p0 c2353p0) {
        Long lM13376b = c2353p0.m13376b();
        if (lM13376b != null) {
            try {
                this.f19951a.m12910b(lM13376b.longValue());
            } catch (Throwable th) {
                AbstractC2391y2.m13573b("MyTrackerRepository error: error while removing raw purchase with id " + lM13376b, th);
            }
        }
    }

    /* renamed from: a */
    public void m13096a(C2353p0 c2353p0) {
        String string = c2353p0.m13378d().toString();
        String strM13375a = c2353p0.m13375a();
        try {
            if (this.f19951a.m12927j() >= this.f19955e) {
                AbstractC2391y2.m13568a("MyTrackerRepository: max count of raw purchases is reached");
                AbstractC2391y2.m13568a("MyTrackerRepository: raw purchase with data: " + string + ", signature " + strM13375a + " isn't inserted");
                return;
            }
            long jM12897a = this.f19951a.m12897a(string, strM13375a, c2353p0.m13380f());
            if (jM12897a >= 0) {
                AbstractC2391y2.m13568a("MyTrackerRepository: raw purchase was inserted; id: " + jM12897a + ", data: " + string + ", signature: " + strM13375a);
                c2353p0.m13373a(jM12897a);
            }
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("MyTrackerRepository error: can't insert raw purchase with data: " + string + ", signature " + strM13375a, th);
        }
    }

    /* JADX WARN: Not initialized variable reg: 20, insn: 0x0032: MOVE (r6 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:12:0x0032 */
    /* renamed from: a */
    public boolean m13101a(long j, long j2) {
        long jM12906b;
        C2310e1.f fVar;
        C2310e1.f fVar2;
        long j3;
        C2310e1.f fVarM12899a = null;
        try {
            fVarM12899a = this.f19951a.m12899a("default_session");
            try {
                jM12906b = 0;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (fVarM12899a.m12930b()) {
                long jM12946a = fVarM12899a.m12946a();
                long jM12949m = fVarM12899a.m12949m();
                long jM12947c = fVarM12899a.m12947c();
                fVar2 = fVarM12899a;
                if (this.f19956f == 0) {
                    m13110c(jM12949m);
                }
                AbstractC2391y2.m13568a("MyTrackerRepository: finish previous session");
                if (j2 == 0) {
                    j3 = jM12946a;
                    this.f19951a.m12903a(jM12946a, jM12949m - this.f19956f, true, 0L);
                } else {
                    j3 = jM12946a;
                    C2310e1 c2310e1 = this.f19951a;
                    long j4 = this.f19956f;
                    c2310e1.m12903a(j3, jM12949m - j4, false, j2 - j4);
                }
                long j5 = j3;
                long jM12922g = this.f19951a.m12922g(j5);
                AbstractC2391y2.m13568a("MyTrackerRepository: session timestamps count: " + jM12922g);
                long j6 = (long) this.f19954d;
                if (jM12922g > j6) {
                    jM12906b = this.f19951a.m12906b(j5, jM12922g - j6);
                    AbstractC2391y2.m13568a("MyTrackerRepository: maximum count of session timestamps is exceeded, remove oldest timestamps, count: " + jM12906b);
                }
                AbstractC2391y2.m13568a("MyTrackerRepository: start new session");
                this.f19951a.m12902a(j5, j, jM12947c + jM12906b);
            } else {
                fVar2 = fVarM12899a;
                AbstractC2391y2.m13568a("MyTrackerRepository: insert session");
                if (this.f19951a.m12896a("default_session", j) == C2310e1.f19890y) {
                    AbstractC2391y2.m13572b("MyTrackerRepository error: session insertion failed ");
                    fVar2.close();
                    return false;
                }
                if (this.f19956f == 0) {
                    m13110c(j);
                }
            }
            fVar2.close();
            return true;
        } catch (Throwable th3) {
            th = th3;
            fVarM12899a = fVar;
            try {
                AbstractC2391y2.m13573b("MyTrackerRepository error: session insertion failed ", th);
                if (fVarM12899a == null) {
                    return false;
                }
                fVarM12899a.close();
                return false;
            } finally {
            }
        }
    }

    /* renamed from: a */
    public static C2318g1 m13091a(C2310e1 c2310e1) {
        return m13092a(c2310e1, 1000, 500, 500, 100);
    }

    /* renamed from: a */
    public static C2318g1 m13092a(C2310e1 c2310e1, int i, int i2, int i3, int i4) {
        try {
            return new C2318g1(c2310e1, i, i2, i3, i4);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("MyTrackerRepository error: failed to create MyTrackerRepository instance", th);
            return null;
        }
    }

    /* renamed from: a */
    public void m13097a(byte[] bArr) {
        try {
            this.f19951a.m12926i(14L);
            this.f19951a.m12905a(bArr);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("MyTrackerRepository error: ", th);
        }
    }
}
