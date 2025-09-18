package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import ru.ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes.dex */
public final class G91 extends AbstractC0038Ag implements Handler.Callback {
    public C1081Nq A;
    public int B;
    public final Handler C;
    public final UQ D;
    public final N8 E;
    public boolean F;
    public boolean G;
    public C6666qX H;
    public long I;
    public long J;
    public long K;
    public final C0318Dv0 r;
    public final ZD s;
    public InterfaceC7744wB t;
    public final C6446pN0 u;
    public boolean v;
    public int w;
    public V51 x;
    public C2072a61 y;
    public C1081Nq z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G91(UQ uq, Looper looper) {
        super(3);
        C6446pN0 c6446pN0 = X51.P0;
        this.D = uq;
        this.C = looper == null ? null : new Handler(looper, this);
        this.u = c6446pN0;
        this.r = new C0318Dv0(11);
        this.s = new ZD(1);
        this.E = new N8(12, false);
        this.K = -9223372036854775807L;
        this.I = -9223372036854775807L;
        this.J = -9223372036854775807L;
    }

    public final void B() {
        YN1.g(Objects.equals(this.H.m, "application/cea-608") || Objects.equals(this.H.m, "application/x-mp4-cea-608") || Objects.equals(this.H.m, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.H.m + " samples (expected application/x-media3-cues).");
    }

    public final long C() {
        if (this.B == -1) {
            return Long.MAX_VALUE;
        }
        this.z.getClass();
        if (this.B >= this.z.j()) {
            return Long.MAX_VALUE;
        }
        return this.z.f(this.B);
    }

    public final long D(long j) {
        YN1.f(j != -9223372036854775807L);
        YN1.f(this.I != -9223372036854775807L);
        return j - this.I;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E() {
        /*
            r7 = this;
            r0 = 1
            r7.v = r0
            qX r1 = r7.H
            r1.getClass()
            pN0 r2 = r7.u
            r2.getClass()
            java.lang.String r3 = r1.m
            if (r3 == 0) goto L4d
            int r4 = r1.F
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L31;
                case 1566015601: goto L28;
                case 1566016562: goto L1d;
                default: goto L1b;
            }
        L1b:
            r0 = r5
            goto L3b
        L1d:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L26
            goto L1b
        L26:
            r0 = 2
            goto L3b
        L28:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L3b
            goto L1b
        L31:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3a
            goto L1b
        L3a:
            r0 = 0
        L3b:
            switch(r0) {
                case 0: goto L47;
                case 1: goto L47;
                case 2: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L4d
        L3f:
            Lq r0 = new Lq
            java.util.List r1 = r1.p
            r0.<init>(r4, r1)
            goto L6e
        L47:
            Hq r0 = new Hq
            r0.<init>(r3, r4)
            goto L6e
        L4d:
            java.lang.Object r0 = r2.b
            Bv0 r0 = (defpackage.C0162Bv0) r0
            boolean r2 = r0.b(r1)
            if (r2 == 0) goto L76
            e61 r0 = r0.f(r1)
            ai r1 = new ai
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6e:
            r7.x = r0
            long r1 = r7.l
            r0.a(r1)
            return
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = defpackage.AbstractC8235ym.v(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.G91.E():void");
    }

    public final void F(C7554vB c7554vB) {
        P70 p70 = c7554vB.a;
        UQ uq = this.D;
        uq.a.m.f(27, new C6609qE(p70));
        XQ xq = uq.a;
        xq.getClass();
        xq.m.f(27, new EE(7, c7554vB));
    }

    public final void G() {
        this.y = null;
        this.B = -1;
        C1081Nq c1081Nq = this.z;
        if (c1081Nq != null) {
            c1081Nq.u();
            this.z = null;
        }
        C1081Nq c1081Nq2 = this.A;
        if (c1081Nq2 != null) {
            c1081Nq2.u();
            this.A = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        F((C7554vB) message.obj);
        return true;
    }

    @Override // defpackage.AbstractC0038Ag
    public final String i() {
        return "TextRenderer";
    }

    @Override // defpackage.AbstractC0038Ag
    public final boolean k() {
        return this.G;
    }

    @Override // defpackage.AbstractC0038Ag
    public final boolean l() {
        return true;
    }

    @Override // defpackage.AbstractC0038Ag
    public final void m() {
        this.H = null;
        this.K = -9223372036854775807L;
        C3769fQ0 c3769fQ0 = C3769fQ0.e;
        D(this.J);
        C7554vB c7554vB = new C7554vB(c3769fQ0);
        Handler handler = this.C;
        if (handler != null) {
            handler.obtainMessage(1, c7554vB).sendToTarget();
        } else {
            F(c7554vB);
        }
        this.I = -9223372036854775807L;
        this.J = -9223372036854775807L;
        if (this.x != null) {
            G();
            V51 v51 = this.x;
            v51.getClass();
            v51.release();
            this.x = null;
            this.w = 0;
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final void o(long j, boolean z) {
        this.J = j;
        InterfaceC7744wB interfaceC7744wB = this.t;
        if (interfaceC7744wB != null) {
            interfaceC7744wB.clear();
        }
        C3769fQ0 c3769fQ0 = C3769fQ0.e;
        D(this.J);
        C7554vB c7554vB = new C7554vB(c3769fQ0);
        Handler handler = this.C;
        if (handler != null) {
            handler.obtainMessage(1, c7554vB).sendToTarget();
        } else {
            F(c7554vB);
        }
        this.F = false;
        this.G = false;
        this.K = -9223372036854775807L;
        C6666qX c6666qX = this.H;
        if (c6666qX == null || Objects.equals(c6666qX.m, "application/x-media3-cues")) {
            return;
        }
        if (this.w == 0) {
            G();
            V51 v51 = this.x;
            v51.getClass();
            v51.flush();
            v51.a(this.l);
            return;
        }
        G();
        V51 v512 = this.x;
        v512.getClass();
        v512.release();
        this.x = null;
        this.w = 0;
        E();
    }

    @Override // defpackage.AbstractC0038Ag
    public final void t(C6666qX[] c6666qXArr, long j, long j2) {
        this.I = j2;
        C6666qX c6666qX = c6666qXArr[0];
        this.H = c6666qX;
        if (Objects.equals(c6666qX.m, "application/x-media3-cues")) {
            this.t = this.H.G == 1 ? new C3850fr0() : new I60(1);
            return;
        }
        B();
        if (this.x != null) {
            this.w = 1;
        } else {
            E();
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final void v(long j, long j2) {
        boolean z;
        long jF;
        if (this.n) {
            long j3 = this.K;
            if (j3 != -9223372036854775807L && j >= j3) {
                G();
                this.G = true;
            }
        }
        if (this.G) {
            return;
        }
        C6666qX c6666qX = this.H;
        c6666qX.getClass();
        boolean zEquals = Objects.equals(c6666qX.m, "application/x-media3-cues");
        Handler handler = this.C;
        boolean zB = false;
        zB = false;
        zB = false;
        N8 n8 = this.E;
        if (zEquals) {
            this.t.getClass();
            if (!this.F) {
                ZD zd = this.s;
                if (u(n8, zd, 0) == -4) {
                    if (zd.g(4)) {
                        this.F = true;
                    } else {
                        zd.w();
                        ByteBuffer byteBuffer = zd.e;
                        byteBuffer.getClass();
                        long j4 = zd.g;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.r.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        C4403il c4403il = new C4403il(19);
                        M70 m70T = P70.t();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                            bundle2.getClass();
                            m70T.a(c4403il.apply(bundle2));
                        }
                        C7934xB c7934xB = new C7934xB(m70T.h(), j4, bundle.getLong(UcumUtils.UCUM_DAYS));
                        zd.t();
                        zB = this.t.b(c7934xB, j);
                    }
                }
            }
            long jA = this.t.a(this.J);
            if (jA == Long.MIN_VALUE && this.F && !zB) {
                this.G = true;
            }
            if (jA != Long.MIN_VALUE && jA <= j) {
                zB = true;
            }
            if (zB) {
                P70 p70C = this.t.c(j);
                long jD = this.t.d(j);
                D(jD);
                C7554vB c7554vB = new C7554vB(p70C);
                if (handler != null) {
                    handler.obtainMessage(1, c7554vB).sendToTarget();
                } else {
                    F(c7554vB);
                }
                this.t.e(jD);
            }
            this.J = j;
            return;
        }
        B();
        this.J = j;
        if (this.A == null) {
            V51 v51 = this.x;
            v51.getClass();
            v51.b(j);
            try {
                V51 v512 = this.x;
                v512.getClass();
                this.A = (C1081Nq) v512.c();
            } catch (W51 e) {
                AbstractC6789rA1.e("Subtitle decoding failed. streamFormat=" + this.H, e);
                C3769fQ0 c3769fQ0 = C3769fQ0.e;
                D(this.J);
                C7554vB c7554vB2 = new C7554vB(c3769fQ0);
                if (handler != null) {
                    handler.obtainMessage(1, c7554vB2).sendToTarget();
                } else {
                    F(c7554vB2);
                }
                G();
                V51 v513 = this.x;
                v513.getClass();
                v513.release();
                this.x = null;
                this.w = 0;
                E();
                return;
            }
        }
        if (this.h != 2) {
            return;
        }
        if (this.z != null) {
            long jC = C();
            z = false;
            while (jC <= j) {
                this.B++;
                jC = C();
                z = true;
            }
        } else {
            z = false;
        }
        C1081Nq c1081Nq = this.A;
        boolean z2 = z;
        if (c1081Nq != null) {
            z2 = z;
            if (!c1081Nq.g(4)) {
                z2 = z;
                if (c1081Nq.c <= j) {
                    C1081Nq c1081Nq2 = this.z;
                    if (c1081Nq2 != null) {
                        c1081Nq2.u();
                    }
                    this.B = c1081Nq.c(j);
                    this.z = c1081Nq;
                    this.A = null;
                    z2 = true;
                }
            } else if (!z) {
                z2 = z;
                if (C() == Long.MAX_VALUE) {
                    if (this.w == 2) {
                        G();
                        V51 v514 = this.x;
                        v514.getClass();
                        v514.release();
                        this.x = null;
                        this.w = 0;
                        E();
                        z2 = z;
                    } else {
                        G();
                        this.G = true;
                        z2 = z;
                    }
                }
            }
        }
        if (z2) {
            this.z.getClass();
            int iC = this.z.c(j);
            if (iC == 0 || this.z.j() == 0) {
                jF = this.z.c;
            } else if (iC == -1) {
                C1081Nq c1081Nq3 = this.z;
                jF = c1081Nq3.f(c1081Nq3.j() - 1);
            } else {
                jF = this.z.f(iC - 1);
            }
            D(jF);
            C7554vB c7554vB3 = new C7554vB(this.z.h(j));
            if (handler != null) {
                handler.obtainMessage(1, c7554vB3).sendToTarget();
            } else {
                F(c7554vB3);
            }
        }
        if (this.w == 2) {
            return;
        }
        while (!this.F) {
            try {
                C2072a61 c2072a61 = this.y;
                if (c2072a61 == null) {
                    V51 v515 = this.x;
                    v515.getClass();
                    c2072a61 = (C2072a61) v515.d();
                    if (c2072a61 == null) {
                        return;
                    } else {
                        this.y = c2072a61;
                    }
                }
                if (this.w == 1) {
                    c2072a61.b = 4;
                    V51 v516 = this.x;
                    v516.getClass();
                    v516.e(c2072a61);
                    this.y = null;
                    this.w = 2;
                    return;
                }
                int iU = u(n8, c2072a61, 0);
                if (iU == -4) {
                    if (c2072a61.g(4)) {
                        this.F = true;
                        this.v = false;
                    } else {
                        C6666qX c6666qX2 = (C6666qX) n8.c;
                        if (c6666qX2 == null) {
                            return;
                        }
                        c2072a61.j = c6666qX2.r;
                        c2072a61.w();
                        this.v &= !c2072a61.g(1);
                    }
                    if (!this.v) {
                        V51 v517 = this.x;
                        v517.getClass();
                        v517.e(c2072a61);
                        this.y = null;
                    }
                } else if (iU == -3) {
                    return;
                }
            } catch (W51 e2) {
                AbstractC6789rA1.e("Subtitle decoding failed. streamFormat=" + this.H, e2);
                C3769fQ0 c3769fQ02 = C3769fQ0.e;
                D(this.J);
                C7554vB c7554vB4 = new C7554vB(c3769fQ02);
                if (handler != null) {
                    handler.obtainMessage(1, c7554vB4).sendToTarget();
                } else {
                    F(c7554vB4);
                }
                G();
                V51 v518 = this.x;
                v518.getClass();
                v518.release();
                this.x = null;
                this.w = 0;
                E();
                return;
            }
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final int z(C6666qX c6666qX) {
        if (!Objects.equals(c6666qX.m, "application/x-media3-cues")) {
            C6446pN0 c6446pN0 = this.u;
            c6446pN0.getClass();
            if (!((C0162Bv0) c6446pN0.b).b(c6666qX)) {
                String str = c6666qX.m;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return AbstractC1865Xr0.l(str) ? AbstractC7209tN0.m(1, 0, 0, 0) : AbstractC7209tN0.m(0, 0, 0, 0);
                }
            }
        }
        return AbstractC7209tN0.m(c6666qX.J == 0 ? 4 : 2, 0, 0, 0);
    }
}
