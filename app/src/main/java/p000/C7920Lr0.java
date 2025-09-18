package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* renamed from: Lr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7920Lr0 extends AbstractC0043Ag implements Handler.Callback {

    /* renamed from: A */
    public long f6899A;

    /* renamed from: r */
    public final C10689pl0 f6900r;

    /* renamed from: s */
    public final SurfaceHolderCallbackC1285UQ f6901s;

    /* renamed from: t */
    public final Handler f6902t;

    /* renamed from: u */
    public final C7816Jr0 f6903u;

    /* renamed from: v */
    public AbstractC10012kS1 f6904v;

    /* renamed from: w */
    public boolean f6905w;

    /* renamed from: x */
    public boolean f6906x;

    /* renamed from: y */
    public long f6907y;

    /* renamed from: z */
    public C7660Gr0 f6908z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7920Lr0(SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ, Looper looper) {
        super(5);
        C10689pl0 c10689pl0 = C10689pl0.f40370g;
        this.f6901s = surfaceHolderCallbackC1285UQ;
        this.f6902t = looper == null ? null : new Handler(looper, this);
        this.f6900r = c10689pl0;
        this.f6903u = new C7816Jr0(1);
        this.f6899A = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5124B(p000.C7660Gr0 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            Er0[] r1 = r6.f3928a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            qX r2 = r2.mo30A()
            if (r2 == 0) goto L3e
            pl0 r3 = r5.f6900r
            boolean r4 = r3.m23869o(r2)
            if (r4 == 0) goto L3e
            kS1 r2 = r3.m23867k(r2)
            r1 = r1[r0]
            byte[] r1 = r1.mo32e0()
            r1.getClass()
            Jr0 r3 = r5.f6903u
            r3.mo7722t()
            int r4 = r1.length
            r3.m9506v(r4)
            java.nio.ByteBuffer r4 = r3.f14798e
            r4.put(r1)
            r3.m9507w()
            Gr0 r1 = r2.m22215b(r3)
            if (r1 == 0) goto L43
            r5.m5124B(r1, r7)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C7920Lr0.m5124B(Gr0, java.util.ArrayList):void");
    }

    /* renamed from: C */
    public final long m5125C(long j) {
        YN1.m9281f(j != -9223372036854775807L);
        YN1.m9281f(this.f6899A != -9223372036854775807L);
        return j - this.f6899A;
    }

    /* renamed from: D */
    public final void m5126D(C7660Gr0 c7660Gr0) {
        SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ = this.f6901s;
        C1474XQ c1474xq = surfaceHolderCallbackC1285UQ.f11780a;
        C11209tp0 c11209tp0M25248a = c1474xq.f13741t1.m25248a();
        int i = 0;
        while (true) {
            InterfaceC7556Er0[] interfaceC7556Er0Arr = c7660Gr0.f3928a;
            if (i >= interfaceC7556Er0Arr.length) {
                break;
            }
            interfaceC7556Er0Arr[i].mo31d0(c11209tp0M25248a);
            i++;
        }
        c1474xq.f13741t1 = new C11337up0(c11209tp0M25248a);
        C11337up0 c11337up0M9036w1 = c1474xq.m9036w1();
        boolean zEquals = c11337up0M9036w1.equals(c1474xq.f13703O);
        C8372Uj0 c8372Uj0 = c1474xq.f13730m;
        if (!zEquals) {
            c1474xq.f13703O = c11337up0M9036w1;
            c8372Uj0.m8131c(14, new C0267EE(8, surfaceHolderCallbackC1285UQ));
        }
        c8372Uj0.m8131c(28, new C0267EE(9, c7660Gr0));
        c8372Uj0.m8130b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m5126D((C7660Gr0) message.obj);
        return true;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: i */
    public final String mo263i() {
        return "MetadataRenderer";
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: k */
    public final boolean mo265k() {
        return this.f6906x;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: l */
    public final boolean mo266l() {
        return true;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: m */
    public final void mo267m() {
        this.f6908z = null;
        this.f6904v = null;
        this.f6899A = -9223372036854775807L;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: o */
    public final void mo269o(long j, boolean z) {
        this.f6908z = null;
        this.f6905w = false;
        this.f6906x = false;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: t */
    public final void mo274t(C6686qX[] c6686qXArr, long j, long j2) {
        this.f6904v = this.f6900r.m23867k(c6686qXArr[0]);
        C7660Gr0 c7660Gr0 = this.f6908z;
        if (c7660Gr0 != null) {
            long j3 = this.f6899A;
            long j4 = c7660Gr0.f3929b;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                c7660Gr0 = new C7660Gr0(j5, c7660Gr0.f3928a);
            }
            this.f6908z = c7660Gr0;
        }
        this.f6899A = j2;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: v */
    public final void mo276v(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f6905w && this.f6908z == null) {
                C7816Jr0 c7816Jr0 = this.f6903u;
                c7816Jr0.mo7722t();
                C0827N8 c0827n8 = this.f308c;
                c0827n8.m5557f();
                int iM275u = m275u(c0827n8, c7816Jr0, 0);
                if (iM275u == -4) {
                    if (c7816Jr0.m2501g(4)) {
                        this.f6905w = true;
                    } else if (c7816Jr0.f14800g >= this.f317l) {
                        c7816Jr0.f5752j = this.f6907y;
                        c7816Jr0.m9507w();
                        AbstractC10012kS1 abstractC10012kS1 = this.f6904v;
                        int i = AbstractC7485Dh1.f2166a;
                        C7660Gr0 c7660Gr0M22215b = abstractC10012kS1.m22215b(c7816Jr0);
                        if (c7660Gr0M22215b != null) {
                            ArrayList arrayList = new ArrayList(c7660Gr0M22215b.f3928a.length);
                            m5124B(c7660Gr0M22215b, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f6908z = new C7660Gr0(m5125C(c7816Jr0.f14800g), (InterfaceC7556Er0[]) arrayList.toArray(new InterfaceC7556Er0[0]));
                            }
                        }
                    }
                } else if (iM275u == -5) {
                    C6686qX c6686qX = (C6686qX) c0827n8.f7524c;
                    c6686qX.getClass();
                    this.f6907y = c6686qX.f40979r;
                }
            }
            C7660Gr0 c7660Gr0 = this.f6908z;
            if (c7660Gr0 == null || c7660Gr0.f3929b > m5125C(j)) {
                z = false;
            } else {
                C7660Gr0 c7660Gr02 = this.f6908z;
                Handler handler = this.f6902t;
                if (handler != null) {
                    handler.obtainMessage(1, c7660Gr02).sendToTarget();
                } else {
                    m5126D(c7660Gr02);
                }
                this.f6908z = null;
                z = true;
            }
            if (this.f6905w && this.f6908z == null) {
                this.f6906x = true;
            }
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: z */
    public final int mo280z(C6686qX c6686qX) {
        if (this.f6900r.m23869o(c6686qX)) {
            return AbstractC11153tN0.m24901m(c6686qX.f40960J == 0 ? 4 : 2, 0, 0, 0);
        }
        return AbstractC11153tN0.m24901m(0, 0, 0, 0);
    }
}
