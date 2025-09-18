package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes.dex */
public final class G91 extends AbstractC0043Ag implements Handler.Callback {

    /* renamed from: A */
    public C0871Nq f3611A;

    /* renamed from: B */
    public int f3612B;

    /* renamed from: C */
    public final Handler f3613C;

    /* renamed from: D */
    public final SurfaceHolderCallbackC1285UQ f3614D;

    /* renamed from: E */
    public final C0827N8 f3615E;

    /* renamed from: F */
    public boolean f3616F;

    /* renamed from: G */
    public boolean f3617G;

    /* renamed from: H */
    public C6686qX f3618H;

    /* renamed from: I */
    public long f3619I;

    /* renamed from: J */
    public long f3620J;

    /* renamed from: K */
    public long f3621K;

    /* renamed from: r */
    public final C7512Dv0 f3622r;

    /* renamed from: s */
    public final C1587ZD f3623s;

    /* renamed from: t */
    public InterfaceC7059wB f3624t;

    /* renamed from: u */
    public final C10641pN0 f3625u;

    /* renamed from: v */
    public boolean f3626v;

    /* renamed from: w */
    public int f3627w;

    /* renamed from: x */
    public V51 f3628x;

    /* renamed from: y */
    public C8683a61 f3629y;

    /* renamed from: z */
    public C0871Nq f3630z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G91(SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ, Looper looper) {
        super(3);
        C10641pN0 c10641pN0 = X51.f13563P0;
        this.f3614D = surfaceHolderCallbackC1285UQ;
        this.f3613C = looper == null ? null : new Handler(looper, this);
        this.f3625u = c10641pN0;
        this.f3622r = new C7512Dv0(11);
        this.f3623s = new C1587ZD(1);
        this.f3615E = new C0827N8(12, false);
        this.f3621K = -9223372036854775807L;
        this.f3619I = -9223372036854775807L;
        this.f3620J = -9223372036854775807L;
    }

    /* renamed from: B */
    public final void m2931B() {
        YN1.m9282g(Objects.equals(this.f3618H.f40974m, "application/cea-608") || Objects.equals(this.f3618H.f40974m, "application/x-mp4-cea-608") || Objects.equals(this.f3618H.f40974m, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f3618H.f40974m + " samples (expected application/x-media3-cues).");
    }

    /* renamed from: C */
    public final long m2932C() {
        if (this.f3612B == -1) {
            return Long.MAX_VALUE;
        }
        this.f3630z.getClass();
        if (this.f3612B >= this.f3630z.mo5858j()) {
            return Long.MAX_VALUE;
        }
        return this.f3630z.mo5856f(this.f3612B);
    }

    /* renamed from: D */
    public final long m2933D(long j) {
        YN1.m9281f(j != -9223372036854775807L);
        YN1.m9281f(this.f3619I != -9223372036854775807L);
        return j - this.f3619I;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2934E() {
        /*
            r7 = this;
            r0 = 1
            r7.f3626v = r0
            qX r1 = r7.f3618H
            r1.getClass()
            pN0 r2 = r7.f3625u
            r2.getClass()
            java.lang.String r3 = r1.f40974m
            if (r3 == 0) goto L4d
            int r4 = r1.f40956F
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
            java.util.List r1 = r1.f40977p
            r0.<init>(r4, r1)
            goto L6e
        L47:
            Hq r0 = new Hq
            r0.<init>(r3, r4)
            goto L6e
        L4d:
            java.lang.Object r0 = r2.f40042b
            Bv0 r0 = (p000.C7408Bv0) r0
            boolean r2 = r0.mo911b(r1)
            if (r2 == 0) goto L76
            e61 r0 = r0.mo916f(r1)
            ai r1 = new ai
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6e:
            r7.f3628x = r0
            long r1 = r7.f317l
            r0.mo6160a(r1)
            return
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = p000.AbstractC7222ym.m26245v(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.G91.m2934E():void");
    }

    /* renamed from: F */
    public final void m2935F(C6996vB c6996vB) {
        P70 p70 = c6996vB.f44236a;
        SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ = this.f3614D;
        surfaceHolderCallbackC1285UQ.f11780a.f13730m.m8134f(27, new C6667qE(p70));
        C1474XQ c1474xq = surfaceHolderCallbackC1285UQ.f11780a;
        c1474xq.getClass();
        c1474xq.f13730m.m8134f(27, new C0267EE(7, c6996vB));
    }

    /* renamed from: G */
    public final void m2936G() {
        this.f3629y = null;
        this.f3612B = -1;
        C0871Nq c0871Nq = this.f3630z;
        if (c0871Nq != null) {
            c0871Nq.mo5860u();
            this.f3630z = null;
        }
        C0871Nq c0871Nq2 = this.f3611A;
        if (c0871Nq2 != null) {
            c0871Nq2.mo5860u();
            this.f3611A = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m2935F((C6996vB) message.obj);
        return true;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: i */
    public final String mo263i() {
        return "TextRenderer";
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: k */
    public final boolean mo265k() {
        return this.f3617G;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: l */
    public final boolean mo266l() {
        return true;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: m */
    public final void mo267m() {
        this.f3618H = null;
        this.f3621K = -9223372036854775807L;
        C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
        m2933D(this.f3620J);
        C6996vB c6996vB = new C6996vB(c9367fQ0);
        Handler handler = this.f3613C;
        if (handler != null) {
            handler.obtainMessage(1, c6996vB).sendToTarget();
        } else {
            m2935F(c6996vB);
        }
        this.f3619I = -9223372036854775807L;
        this.f3620J = -9223372036854775807L;
        if (this.f3628x != null) {
            m2936G();
            V51 v51 = this.f3628x;
            v51.getClass();
            v51.release();
            this.f3628x = null;
            this.f3627w = 0;
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: o */
    public final void mo269o(long j, boolean z) {
        this.f3620J = j;
        InterfaceC7059wB interfaceC7059wB = this.f3624t;
        if (interfaceC7059wB != null) {
            interfaceC7059wB.clear();
        }
        C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
        m2933D(this.f3620J);
        C6996vB c6996vB = new C6996vB(c9367fQ0);
        Handler handler = this.f3613C;
        if (handler != null) {
            handler.obtainMessage(1, c6996vB).sendToTarget();
        } else {
            m2935F(c6996vB);
        }
        this.f3616F = false;
        this.f3617G = false;
        this.f3621K = -9223372036854775807L;
        C6686qX c6686qX = this.f3618H;
        if (c6686qX == null || Objects.equals(c6686qX.f40974m, "application/x-media3-cues")) {
            return;
        }
        if (this.f3627w == 0) {
            m2936G();
            V51 v51 = this.f3628x;
            v51.getClass();
            v51.flush();
            v51.mo6160a(this.f317l);
            return;
        }
        m2936G();
        V51 v512 = this.f3628x;
        v512.getClass();
        v512.release();
        this.f3628x = null;
        this.f3627w = 0;
        m2934E();
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: t */
    public final void mo274t(C6686qX[] c6686qXArr, long j, long j2) {
        this.f3619I = j2;
        C6686qX c6686qX = c6686qXArr[0];
        this.f3618H = c6686qX;
        if (Objects.equals(c6686qX.f40974m, "application/x-media3-cues")) {
            this.f3624t = this.f3618H.f40957G == 1 ? new C9421fr0() : new I60(1);
            return;
        }
        m2931B();
        if (this.f3628x != null) {
            this.f3627w = 1;
        } else {
            m2934E();
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: v */
    public final void mo276v(long j, long j2) {
        boolean z;
        long jMo5856f;
        if (this.f319n) {
            long j3 = this.f3621K;
            if (j3 != -9223372036854775807L && j >= j3) {
                m2936G();
                this.f3617G = true;
            }
        }
        if (this.f3617G) {
            return;
        }
        C6686qX c6686qX = this.f3618H;
        c6686qX.getClass();
        boolean zEquals = Objects.equals(c6686qX.f40974m, "application/x-media3-cues");
        Handler handler = this.f3613C;
        boolean zMo3745b = false;
        zMo3745b = false;
        zMo3745b = false;
        C0827N8 c0827n8 = this.f3615E;
        if (zEquals) {
            this.f3624t.getClass();
            if (!this.f3616F) {
                C1587ZD c1587zd = this.f3623s;
                if (m275u(c0827n8, c1587zd, 0) == -4) {
                    if (c1587zd.m2501g(4)) {
                        this.f3616F = true;
                    } else {
                        c1587zd.m9507w();
                        ByteBuffer byteBuffer = c1587zd.f14798e;
                        byteBuffer.getClass();
                        long j4 = c1587zd.f14800g;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f3622r.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        C4262il c4262il = new C4262il(19);
                        M70 m70M6233t = P70.m6233t();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                            bundle2.getClass();
                            m70M6233t.m3755a(c4262il.apply(bundle2));
                        }
                        C7122xB c7122xB = new C7122xB(m70M6233t.m5273h(), j4, bundle.getLong(UcumUtils.UCUM_DAYS));
                        c1587zd.mo7722t();
                        zMo3745b = this.f3624t.mo3745b(c7122xB, j);
                    }
                }
            }
            long jMo3744a = this.f3624t.mo3744a(this.f3620J);
            if (jMo3744a == Long.MIN_VALUE && this.f3616F && !zMo3745b) {
                this.f3617G = true;
            }
            if (jMo3744a != Long.MIN_VALUE && jMo3744a <= j) {
                zMo3745b = true;
            }
            if (zMo3745b) {
                P70 p70Mo3746c = this.f3624t.mo3746c(j);
                long jMo3747d = this.f3624t.mo3747d(j);
                m2933D(jMo3747d);
                C6996vB c6996vB = new C6996vB(p70Mo3746c);
                if (handler != null) {
                    handler.obtainMessage(1, c6996vB).sendToTarget();
                } else {
                    m2935F(c6996vB);
                }
                this.f3624t.mo3748e(jMo3747d);
            }
            this.f3620J = j;
            return;
        }
        m2931B();
        this.f3620J = j;
        if (this.f3611A == null) {
            V51 v51 = this.f3628x;
            v51.getClass();
            v51.mo6161b(j);
            try {
                V51 v512 = this.f3628x;
                v512.getClass();
                this.f3611A = (C0871Nq) v512.mo3599c();
            } catch (W51 e) {
                AbstractC10872rA1.m24172e("Subtitle decoding failed. streamFormat=" + this.f3618H, e);
                C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
                m2933D(this.f3620J);
                C6996vB c6996vB2 = new C6996vB(c9367fQ0);
                if (handler != null) {
                    handler.obtainMessage(1, c6996vB2).sendToTarget();
                } else {
                    m2935F(c6996vB2);
                }
                m2936G();
                V51 v513 = this.f3628x;
                v513.getClass();
                v513.release();
                this.f3628x = null;
                this.f3627w = 0;
                m2934E();
                return;
            }
        }
        if (this.f313h != 2) {
            return;
        }
        if (this.f3630z != null) {
            long jM2932C = m2932C();
            z = false;
            while (jM2932C <= j) {
                this.f3612B++;
                jM2932C = m2932C();
                z = true;
            }
        } else {
            z = false;
        }
        C0871Nq c0871Nq = this.f3611A;
        boolean z2 = z;
        if (c0871Nq != null) {
            z2 = z;
            if (!c0871Nq.m2501g(4)) {
                z2 = z;
                if (c0871Nq.f15398c <= j) {
                    C0871Nq c0871Nq2 = this.f3630z;
                    if (c0871Nq2 != null) {
                        c0871Nq2.mo5860u();
                    }
                    this.f3612B = c0871Nq.mo5855c(j);
                    this.f3630z = c0871Nq;
                    this.f3611A = null;
                    z2 = true;
                }
            } else if (!z) {
                z2 = z;
                if (m2932C() == Long.MAX_VALUE) {
                    if (this.f3627w == 2) {
                        m2936G();
                        V51 v514 = this.f3628x;
                        v514.getClass();
                        v514.release();
                        this.f3628x = null;
                        this.f3627w = 0;
                        m2934E();
                        z2 = z;
                    } else {
                        m2936G();
                        this.f3617G = true;
                        z2 = z;
                    }
                }
            }
        }
        if (z2) {
            this.f3630z.getClass();
            int iMo5855c = this.f3630z.mo5855c(j);
            if (iMo5855c == 0 || this.f3630z.mo5858j() == 0) {
                jMo5856f = this.f3630z.f15398c;
            } else if (iMo5855c == -1) {
                C0871Nq c0871Nq3 = this.f3630z;
                jMo5856f = c0871Nq3.mo5856f(c0871Nq3.mo5858j() - 1);
            } else {
                jMo5856f = this.f3630z.mo5856f(iMo5855c - 1);
            }
            m2933D(jMo5856f);
            C6996vB c6996vB3 = new C6996vB(this.f3630z.mo5857h(j));
            if (handler != null) {
                handler.obtainMessage(1, c6996vB3).sendToTarget();
            } else {
                m2935F(c6996vB3);
            }
        }
        if (this.f3627w == 2) {
            return;
        }
        while (!this.f3616F) {
            try {
                C8683a61 c8683a61 = this.f3629y;
                if (c8683a61 == null) {
                    V51 v515 = this.f3628x;
                    v515.getClass();
                    c8683a61 = (C8683a61) v515.mo6162d();
                    if (c8683a61 == null) {
                        return;
                    } else {
                        this.f3629y = c8683a61;
                    }
                }
                if (this.f3627w == 1) {
                    c8683a61.f3082b = 4;
                    V51 v516 = this.f3628x;
                    v516.getClass();
                    v516.mo6163e(c8683a61);
                    this.f3629y = null;
                    this.f3627w = 2;
                    return;
                }
                int iM275u = m275u(c0827n8, c8683a61, 0);
                if (iM275u == -4) {
                    if (c8683a61.m2501g(4)) {
                        this.f3616F = true;
                        this.f3626v = false;
                    } else {
                        C6686qX c6686qX2 = (C6686qX) c0827n8.f7524c;
                        if (c6686qX2 == null) {
                            return;
                        }
                        c8683a61.f15313j = c6686qX2.f40979r;
                        c8683a61.m9507w();
                        this.f3626v &= !c8683a61.m2501g(1);
                    }
                    if (!this.f3626v) {
                        V51 v517 = this.f3628x;
                        v517.getClass();
                        v517.mo6163e(c8683a61);
                        this.f3629y = null;
                    }
                } else if (iM275u == -3) {
                    return;
                }
            } catch (W51 e2) {
                AbstractC10872rA1.m24172e("Subtitle decoding failed. streamFormat=" + this.f3618H, e2);
                C9367fQ0 c9367fQ02 = C9367fQ0.f27184e;
                m2933D(this.f3620J);
                C6996vB c6996vB4 = new C6996vB(c9367fQ02);
                if (handler != null) {
                    handler.obtainMessage(1, c6996vB4).sendToTarget();
                } else {
                    m2935F(c6996vB4);
                }
                m2936G();
                V51 v518 = this.f3628x;
                v518.getClass();
                v518.release();
                this.f3628x = null;
                this.f3627w = 0;
                m2934E();
                return;
            }
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: z */
    public final int mo280z(C6686qX c6686qX) {
        if (!Objects.equals(c6686qX.f40974m, "application/x-media3-cues")) {
            C10641pN0 c10641pN0 = this.f3625u;
            c10641pN0.getClass();
            if (!((C7408Bv0) c10641pN0.f40042b).mo911b(c6686qX)) {
                String str = c6686qX.f40974m;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return AbstractC8544Xr0.m9169l(str) ? AbstractC11153tN0.m24901m(1, 0, 0, 0) : AbstractC11153tN0.m24901m(0, 0, 0, 0);
                }
            }
        }
        return AbstractC11153tN0.m24901m(c6686qX.f40960J == 0 ? 4 : 2, 0, 0, 0);
    }
}
