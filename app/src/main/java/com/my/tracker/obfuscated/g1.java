package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.e1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class g1 {
    final e1 a;
    final int b;
    final int c;
    final int d;
    final int e;
    long f;
    long g;

    private g1(e1 e1Var, int i, int i2, int i3, int i4) {
        this.a = e1Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        Long lB = e1Var.b("timestamp_base");
        this.f = lB == null ? 0L : lB.longValue();
        this.g = e1Var.l();
    }

    public boolean a() {
        try {
            this.a.c();
            this.a.b();
            this.a.e();
            this.a.d();
            this.a.a();
            this.a.a("custom_events_skipped_count", (Long) null);
            this.g = 0L;
            e1.f fVarA = this.a.a("default_session");
            try {
                c(fVarA.b() ? fVarA.m() : 0L);
                fVarA.close();
                return true;
            } finally {
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public y1 b() {
        return new z1(this.a);
    }

    public a2 c() {
        return new b2(this.a, "default_session");
    }

    public InterfaceC2613b d() {
        try {
            return this.a.f();
        } catch (Throwable th) {
            y2.b("MyTrackerRepository error: ", th);
            return null;
        }
    }

    public List e() {
        ArrayList arrayList = new ArrayList();
        e1.b bVarH = null;
        try {
            bVarH = this.a.h();
            while (bVarH.b()) {
                f fVarA = f.a(bVarH.m(), bVarH.n(), bVarH.o(), bVarH.p(), bVarH.e());
                if (fVarA != null) {
                    arrayList.add(fVarA.a(bVarH.a()));
                }
            }
        } catch (Throwable th) {
            try {
                y2.b("MyTrackerRepository error: error while reading purchases", th);
            } finally {
                if (bVarH != null) {
                    bVarH.close();
                }
            }
        }
        return arrayList;
    }

    public long f() {
        try {
            Long lB = this.a.b("custom_events_skipped_count");
            if (lB == null) {
                return 0L;
            }
            return lB.longValue();
        } catch (Throwable th) {
            y2.b("Error: get custom events skipped count", th);
            return 0L;
        }
    }

    public List g() {
        ArrayList arrayList = new ArrayList();
        e1.e eVarK = null;
        try {
            eVarK = this.a.k();
            while (eVarK.b()) {
                p0 p0VarA = p0.a(eVarK.m(), eVarK.n(), eVarK.e());
                if (p0VarA != null) {
                    arrayList.add(p0VarA.a(eVarK.a()));
                }
            }
        } catch (Throwable th) {
            try {
                y2.b("MyTrackerRepository error: error while reading purchases", th);
            } finally {
                if (eVarK != null) {
                    eVarK.close();
                }
            }
        }
        return arrayList;
    }

    public long h() {
        return this.g;
    }

    public long i() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public boolean j() {
        e1.c cVarI;
        e1.f fVarA;
        try {
            cVarI = this.a.i();
        } catch (Exception unused) {
        }
        try {
            ?? B = cVarI.b();
            try {
                cVarI.close();
                fVarA = this.a.a("default_session");
            } catch (Exception unused2) {
            }
            try {
                B = B;
                if (fVarA.b()) {
                    B++;
                }
                fVarA.close();
                return B != 0;
            } finally {
            }
        } catch (Throwable th) {
            if (cVarI != null) {
                try {
                    cVarI.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean k(byte[] bArr, long j) {
        return c(13, bArr, j);
    }

    public boolean l(byte[] bArr, long j) {
        return a(25, bArr, false, true, j);
    }

    public boolean m(byte[] bArr, long j) {
        return c(7, bArr, j);
    }

    public boolean n(byte[] bArr, long j) {
        return a(26, bArr, false, true, j);
    }

    public boolean o(byte[] bArr, long j) {
        return a(28, bArr, false, true, j);
    }

    public boolean p(byte[] bArr, long j) {
        return a(29, bArr, false, true, j);
    }

    public boolean q(byte[] bArr, long j) {
        return a(2, bArr, true, false, j);
    }

    public boolean r(byte[] bArr, long j) {
        return c(8, bArr, j);
    }

    public boolean s(byte[] bArr, long j) {
        return a(5, bArr, true, false, j);
    }

    public void a(long j) {
        try {
            this.a.c(j);
        } catch (Throwable th) {
            y2.b("MyTrackerRepository error: ", th);
        }
    }

    public boolean b(byte[] bArr, long j) {
        return a(33, bArr, true, false, j);
    }

    public boolean c(byte[] bArr, long j) {
        return a(32, bArr, true, false, j);
    }

    public boolean d(byte[] bArr, long j) {
        try {
            if (this.a.f(6L) >= this.c) {
                long jLongValue = 0;
                if (this.a.a(6L, bArr) == 0) {
                    y2.a("MyTrackerRepository: maximum count of custom events is exceeded, event has been skipped");
                    Long lB = this.a.b("custom_events_skipped_count");
                    if (lB != null) {
                        jLongValue = lB.longValue();
                    }
                    long j2 = jLongValue + 1;
                    y2.a("MyTrackerRepository: skipped custom events count: " + j2);
                    this.a.a("custom_events_skipped_count", Long.valueOf(j2));
                    return false;
                }
            }
            return a(6, bArr, false, true, j);
        } catch (Throwable th) {
            y2.b("MyTrackerRepository error: event serialization failed, type: 6", th);
            return false;
        }
    }

    public boolean e(byte[] bArr, long j) {
        return a(15, bArr, true, true, j);
    }

    public boolean f(byte[] bArr, long j) {
        return a(10, bArr, true, false, j);
    }

    public boolean g(byte[] bArr, long j) {
        return a(27, bArr, false, true, j);
    }

    public boolean h(byte[] bArr, long j) {
        return a(31, bArr, true, false, j);
    }

    public boolean i(byte[] bArr, long j) {
        return a(1, bArr, true, false, j);
    }

    public boolean j(byte[] bArr, long j) {
        return c(9, bArr, j);
    }

    private boolean c(int i, byte[] bArr, long j) {
        try {
            return a(i, bArr, false, true, j);
        } catch (Throwable th) {
            y2.b("MyTrackerRepository error: event serialization failed, type: " + i, th);
            return false;
        }
    }

    public boolean a(int i, byte[] bArr, long j) {
        return a(i, bArr, true, true, j);
    }

    public boolean b(long j) {
        return c(3, new byte[0], j);
    }

    public boolean a(byte[] bArr, long j) {
        return a(14, bArr, true, false, j);
    }

    public boolean b(int i, byte[] bArr, long j) {
        boolean z = i == 20 || i == 21;
        if (i == 24) {
            try {
                long j2 = i;
                if (this.a.f(j2) >= this.c && this.a.a(j2, bArr) == 0) {
                    y2.a("MyTrackerRepository: maximum count of mini-app custom events is exceeded, event has been skipped");
                    return false;
                }
            } catch (Throwable th) {
                y2.b("MyTrackerRepository error: event serialization failed, type: " + i, th);
                return false;
            }
        }
        return a(i, bArr, z, true, j);
    }

    public void c(long j) {
        try {
            this.a.a("timestamp_base", Long.valueOf(j));
            this.f = j;
        } catch (Throwable th) {
            y2.b("MyTrackerRepository error: ", th);
        }
    }

    public void a(f fVar) {
        String string = fVar.e().toString();
        String strA = fVar.a();
        String strF = fVar.f();
        int iG = fVar.g();
        try {
            if (this.a.g() >= this.e) {
                y2.a("MyTrackerRepository: max count of raw purchases is reached");
                y2.a("MyTrackerRepository: appgalleery raw purchase with data: " + string + ", signature " + strA + " isn't inserted");
                return;
            }
            long jA = this.a.a(string, strA, strF, iG, fVar.h());
            if (jA >= 0) {
                y2.a("MyTrackerRepository: appgallery raw purchase was inserted; id: " + jA + ", data: " + string + ", signature: " + strA);
                fVar.a(jA);
            }
        } catch (Throwable th) {
            y2.b("MyTrackerRepository error: can't insert appgallery raw purchase with data: " + string + ", signature " + strA, th);
        }
    }

    public void b(f fVar) {
        Long lB = fVar.b();
        if (lB != null) {
            try {
                this.a.a(lB.longValue());
            } catch (Throwable th) {
                y2.b("MyTrackerRepository error: error while removing raw appgallery purchase with id " + lB, th);
            }
        }
    }

    public boolean a(int i, byte[] bArr, boolean z, boolean z2, long j) {
        long jC;
        try {
            long jA = e1.y;
            if (z2) {
                e1.c cVarB = null;
                try {
                    cVarB = this.a.b(i, bArr);
                    if (cVarB.b()) {
                        jA = cVarB.a();
                        jC = cVarB.c();
                    } else {
                        jA = jA;
                        jC = 0;
                    }
                    cVarB.close();
                } catch (Throwable th) {
                    if (cVarB != null) {
                        cVarB.close();
                    }
                    throw th;
                }
            } else {
                jC = 0;
            }
            if (jA == e1.y) {
                y2.a("MyTrackerRepository: insert " + i + " event");
                jA = this.a.a(i, bArr, z);
                if (jA != e1.y && z) {
                    this.g++;
                }
            } else {
                y2.a("MyTrackerRepository: aggregate " + i + " event");
            }
            if (jA == e1.y) {
                y2.b("MyTrackerRepository error: event insertion failed, type: " + i);
                return false;
            }
            if (this.f == 0) {
                c(j);
            }
            this.a.c(jA, j - this.f);
            long jD = this.a.d(jA);
            y2.a("MyTrackerRepository: event timestamps count: " + jD);
            long j2 = (long) this.b;
            if (jD <= j2) {
                return true;
            }
            long jA2 = this.a.a(jA, jD - j2);
            this.a.d(jA, jC + jA2);
            y2.a("MyTrackerRepository: maximum count of event timestamps is exceeded, remove oldest timestamps, count: " + jA2);
            return true;
        } catch (Throwable th2) {
            y2.b("MyTrackerRepository error: event insertion failed, type: " + i, th2);
            return false;
        }
    }

    public void b(p0 p0Var) {
        Long lB = p0Var.b();
        if (lB != null) {
            try {
                this.a.b(lB.longValue());
            } catch (Throwable th) {
                y2.b("MyTrackerRepository error: error while removing raw purchase with id " + lB, th);
            }
        }
    }

    public void a(p0 p0Var) {
        String string = p0Var.d().toString();
        String strA = p0Var.a();
        try {
            if (this.a.j() >= this.e) {
                y2.a("MyTrackerRepository: max count of raw purchases is reached");
                y2.a("MyTrackerRepository: raw purchase with data: " + string + ", signature " + strA + " isn't inserted");
                return;
            }
            long jA = this.a.a(string, strA, p0Var.f());
            if (jA >= 0) {
                y2.a("MyTrackerRepository: raw purchase was inserted; id: " + jA + ", data: " + string + ", signature: " + strA);
                p0Var.a(jA);
            }
        } catch (Throwable th) {
            y2.b("MyTrackerRepository error: can't insert raw purchase with data: " + string + ", signature " + strA, th);
        }
    }

    /* JADX WARN: Not initialized variable reg: 20, insn: 0x0032: MOVE (r6 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:12:0x0032 */
    public boolean a(long j, long j2) {
        long jB;
        e1.f fVar;
        e1.f fVar2;
        long j3;
        e1.f fVarA = null;
        try {
            fVarA = this.a.a("default_session");
            try {
                jB = 0;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (fVarA.b()) {
                long jA = fVarA.a();
                long jM = fVarA.m();
                long jC = fVarA.c();
                fVar2 = fVarA;
                if (this.f == 0) {
                    c(jM);
                }
                y2.a("MyTrackerRepository: finish previous session");
                if (j2 == 0) {
                    j3 = jA;
                    this.a.a(jA, jM - this.f, true, 0L);
                } else {
                    j3 = jA;
                    e1 e1Var = this.a;
                    long j4 = this.f;
                    e1Var.a(j3, jM - j4, false, j2 - j4);
                }
                long j5 = j3;
                long jG = this.a.g(j5);
                y2.a("MyTrackerRepository: session timestamps count: " + jG);
                long j6 = (long) this.d;
                if (jG > j6) {
                    jB = this.a.b(j5, jG - j6);
                    y2.a("MyTrackerRepository: maximum count of session timestamps is exceeded, remove oldest timestamps, count: " + jB);
                }
                y2.a("MyTrackerRepository: start new session");
                this.a.a(j5, j, jC + jB);
            } else {
                fVar2 = fVarA;
                y2.a("MyTrackerRepository: insert session");
                if (this.a.a("default_session", j) == e1.y) {
                    y2.b("MyTrackerRepository error: session insertion failed ");
                    fVar2.close();
                    return false;
                }
                if (this.f == 0) {
                    c(j);
                }
            }
            fVar2.close();
            return true;
        } catch (Throwable th3) {
            th = th3;
            fVarA = fVar;
            try {
                y2.b("MyTrackerRepository error: session insertion failed ", th);
                if (fVarA == null) {
                    return false;
                }
                fVarA.close();
                return false;
            } finally {
            }
        }
    }

    public static g1 a(e1 e1Var) {
        return a(e1Var, 1000, 500, 500, 100);
    }

    public static g1 a(e1 e1Var, int i, int i2, int i3, int i4) {
        try {
            return new g1(e1Var, i, i2, i3, i4);
        } catch (Throwable th) {
            y2.b("MyTrackerRepository error: failed to create MyTrackerRepository instance", th);
            return null;
        }
    }

    public void a(byte[] bArr) {
        try {
            this.a.i(14L);
            this.a.a(bArr);
        } catch (Throwable th) {
            y2.b("MyTrackerRepository error: ", th);
        }
    }
}
