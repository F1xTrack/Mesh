package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* renamed from: Lr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929Lr0 extends AbstractC0038Ag implements Handler.Callback {
    public long A;
    public final C6518pl0 r;
    public final UQ s;
    public final Handler t;
    public final C0774Jr0 u;
    public AbstractC5507kS1 v;
    public boolean w;
    public boolean x;
    public long y;
    public C0540Gr0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0929Lr0(UQ uq, Looper looper) {
        super(5);
        C6518pl0 c6518pl0 = C6518pl0.g;
        this.s = uq;
        this.t = looper == null ? null : new Handler(looper, this);
        this.r = c6518pl0;
        this.u = new C0774Jr0(1);
        this.A = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(defpackage.C0540Gr0 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            Er0[] r1 = r6.a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            qX r2 = r2.A()
            if (r2 == 0) goto L3e
            pl0 r3 = r5.r
            boolean r4 = r3.o(r2)
            if (r4 == 0) goto L3e
            kS1 r2 = r3.k(r2)
            r1 = r1[r0]
            byte[] r1 = r1.e0()
            r1.getClass()
            Jr0 r3 = r5.u
            r3.t()
            int r4 = r1.length
            r3.v(r4)
            java.nio.ByteBuffer r4 = r3.e
            r4.put(r1)
            r3.w()
            Gr0 r1 = r2.b(r3)
            if (r1 == 0) goto L43
            r5.B(r1, r7)
            goto L43
        L3e:
            r1 = r1[r0]
            r7.add(r1)
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0929Lr0.B(Gr0, java.util.ArrayList):void");
    }

    public final long C(long j) {
        YN1.f(j != -9223372036854775807L);
        YN1.f(this.A != -9223372036854775807L);
        return j - this.A;
    }

    public final void D(C0540Gr0 c0540Gr0) {
        UQ uq = this.s;
        XQ xq = uq.a;
        C7293tp0 c7293tp0A = xq.t1.a();
        int i = 0;
        while (true) {
            InterfaceC0384Er0[] interfaceC0384Er0Arr = c0540Gr0.a;
            if (i >= interfaceC0384Er0Arr.length) {
                break;
            }
            interfaceC0384Er0Arr[i].d0(c7293tp0A);
            i++;
        }
        xq.t1 = new C7484up0(c7293tp0A);
        C7484up0 c7484up0W1 = xq.w1();
        boolean zEquals = c7484up0W1.equals(xq.O);
        C1607Uj0 c1607Uj0 = xq.m;
        if (!zEquals) {
            xq.O = c7484up0W1;
            c1607Uj0.c(14, new EE(8, uq));
        }
        c1607Uj0.c(28, new EE(9, c0540Gr0));
        c1607Uj0.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        D((C0540Gr0) message.obj);
        return true;
    }

    @Override // defpackage.AbstractC0038Ag
    public final String i() {
        return "MetadataRenderer";
    }

    @Override // defpackage.AbstractC0038Ag
    public final boolean k() {
        return this.x;
    }

    @Override // defpackage.AbstractC0038Ag
    public final boolean l() {
        return true;
    }

    @Override // defpackage.AbstractC0038Ag
    public final void m() {
        this.z = null;
        this.v = null;
        this.A = -9223372036854775807L;
    }

    @Override // defpackage.AbstractC0038Ag
    public final void o(long j, boolean z) {
        this.z = null;
        this.w = false;
        this.x = false;
    }

    @Override // defpackage.AbstractC0038Ag
    public final void t(C6666qX[] c6666qXArr, long j, long j2) {
        this.v = this.r.k(c6666qXArr[0]);
        C0540Gr0 c0540Gr0 = this.z;
        if (c0540Gr0 != null) {
            long j3 = this.A;
            long j4 = c0540Gr0.b;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                c0540Gr0 = new C0540Gr0(j5, c0540Gr0.a);
            }
            this.z = c0540Gr0;
        }
        this.A = j2;
    }

    @Override // defpackage.AbstractC0038Ag
    public final void v(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.w && this.z == null) {
                C0774Jr0 c0774Jr0 = this.u;
                c0774Jr0.t();
                N8 n8 = this.c;
                n8.f();
                int iU = u(n8, c0774Jr0, 0);
                if (iU == -4) {
                    if (c0774Jr0.g(4)) {
                        this.w = true;
                    } else if (c0774Jr0.g >= this.l) {
                        c0774Jr0.j = this.y;
                        c0774Jr0.w();
                        AbstractC5507kS1 abstractC5507kS1 = this.v;
                        int i = AbstractC0277Dh1.a;
                        C0540Gr0 c0540Gr0B = abstractC5507kS1.b(c0774Jr0);
                        if (c0540Gr0B != null) {
                            ArrayList arrayList = new ArrayList(c0540Gr0B.a.length);
                            B(c0540Gr0B, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.z = new C0540Gr0(C(c0774Jr0.g), (InterfaceC0384Er0[]) arrayList.toArray(new InterfaceC0384Er0[0]));
                            }
                        }
                    }
                } else if (iU == -5) {
                    C6666qX c6666qX = (C6666qX) n8.c;
                    c6666qX.getClass();
                    this.y = c6666qX.r;
                }
            }
            C0540Gr0 c0540Gr0 = this.z;
            if (c0540Gr0 == null || c0540Gr0.b > C(j)) {
                z = false;
            } else {
                C0540Gr0 c0540Gr02 = this.z;
                Handler handler = this.t;
                if (handler != null) {
                    handler.obtainMessage(1, c0540Gr02).sendToTarget();
                } else {
                    D(c0540Gr02);
                }
                this.z = null;
                z = true;
            }
            if (this.w && this.z == null) {
                this.x = true;
            }
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final int z(C6666qX c6666qX) {
        if (this.r.o(c6666qX)) {
            return AbstractC7209tN0.m(c6666qX.J == 0 ? 4 : 2, 0, 0, 0);
        }
        return AbstractC7209tN0.m(0, 0, 0, 0);
    }
}
