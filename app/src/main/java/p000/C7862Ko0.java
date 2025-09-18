package p000;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.regex.Pattern;

/* renamed from: Ko0 */
/* loaded from: classes.dex */
public final class C7862Ko0 extends AbstractC8382Uo0 implements InterfaceC7602Fo0 {

    /* renamed from: Q1 */
    public final Context f6298Q1;

    /* renamed from: R1 */
    public final CC0 f6299R1;

    /* renamed from: S1 */
    public final C0833NE f6300S1;

    /* renamed from: T1 */
    public int f6301T1;

    /* renamed from: U1 */
    public boolean f6302U1;

    /* renamed from: V1 */
    public boolean f6303V1;

    /* renamed from: W1 */
    public C6686qX f6304W1;

    /* renamed from: X1 */
    public C6686qX f6305X1;

    /* renamed from: Y1 */
    public long f6306Y1;

    /* renamed from: Z1 */
    public boolean f6307Z1;

    /* renamed from: a2 */
    public boolean f6308a2;

    /* renamed from: b2 */
    public boolean f6309b2;

    /* renamed from: c2 */
    public int f6310c2;

    public C7862Ko0(Context context, InterfaceC7706Ho0 interfaceC7706Ho0, boolean z, Handler handler, SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ, C0833NE c0833ne) {
        super(1, interfaceC7706Ho0, z, 44100.0f);
        this.f6298Q1 = context.getApplicationContext();
        this.f6300S1 = c0833ne;
        this.f6310c2 = -1000;
        this.f6299R1 = new CC0(handler, 5, surfaceHolderCallbackC1285UQ);
        c0833ne.f7644s = new G10(21, this);
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: C */
    public final C1772bE mo4716C(C8018No0 c8018No0, C6686qX c6686qX, C6686qX c6686qX2) {
        C1772bE c1772bEM5849b = c8018No0.m5849b(c6686qX, c6686qX2);
        boolean z = this.f12078F == null && mo4730p0(c6686qX2);
        int i = c1772bEM5849b.f16873e;
        if (z) {
            i |= 32768;
        }
        if (m4733v0(c8018No0, c6686qX2) > this.f6301T1) {
            i |= 64;
        }
        int i2 = i;
        return new C1772bE(c8018No0.f8009a, c6686qX, c6686qX2, i2 == 0 ? c1772bEM5849b.f16872d : 0, i2);
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: N */
    public final float mo4717N(float f, C6686qX[] c6686qXArr) {
        int iMax = -1;
        for (C6686qX c6686qX : c6686qXArr) {
            int i = c6686qX.f40952B;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: O */
    public final ArrayList mo4718O(C4262il c4262il, C6686qX c6686qX, boolean z) {
        C8018No0 c8018No0M9603e;
        C9367fQ0 c9367fQ0M9606h = c6686qX.f40974m == null ? C9367fQ0.f27184e : (this.f6300S1.m5597f(c6686qX) == 0 || (c8018No0M9603e = AbstractC8642Zo0.m9603e("audio/raw")) == null) ? AbstractC8642Zo0.m9606h(c4262il, c6686qX, z, false) : P70.m6229B(c8018No0M9603e);
        Pattern pattern = AbstractC8642Zo0.f15134a;
        ArrayList arrayList = new ArrayList(c9367fQ0M9606h);
        Collections.sort(arrayList, new C4209hv(2, new C0267EE(26, c6686qX)));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0060  */
    @Override // p000.AbstractC8382Uo0
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C7654Go0 mo4719P(p000.C8018No0 r12, p000.C6686qX r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7862Ko0.mo4719P(No0, qX, android.media.MediaCrypto, float):Go0");
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: Q */
    public final void mo4720Q(C1587ZD c1587zd) {
        C6686qX c6686qX;
        C0456HE c0456he;
        if (AbstractC7485Dh1.f2166a < 29 || (c6686qX = c1587zd.f14796c) == null || !Objects.equals(c6686qX.f40974m, "audio/opus") || !this.f12122u1) {
            return;
        }
        ByteBuffer byteBuffer = c1587zd.f14801h;
        byteBuffer.getClass();
        C6686qX c6686qX2 = c1587zd.f14796c;
        c6686qX2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            C0833NE c0833ne = this.f6300S1;
            AudioTrack audioTrack = c0833ne.f7648w;
            if (audioTrack == null || !C0833NE.m5591m(audioTrack) || (c0456he = c0833ne.f7646u) == null || !c0456he.f4189k) {
                return;
            }
            c0833ne.f7648w.setOffloadDelayPadding(c6686qX2.f40954D, i);
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: V */
    public final void mo4721V(Exception exc) {
        AbstractC10872rA1.m24172e("Audio codec error", exc);
        CC0 cc0 = this.f6299R1;
        Handler handler = (Handler) cc0.f1250b;
        if (handler != null) {
            handler.post(new RunnableC7021va(cc0, exc, 0));
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: W */
    public final void mo4722W(long j, long j2, String str) {
        CC0 cc0 = this.f6299R1;
        Handler handler = (Handler) cc0.f1250b;
        if (handler != null) {
            handler.post(new RunnableC7084wa(cc0, str, j, j2, 0));
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: X */
    public final void mo4723X(String str) {
        CC0 cc0 = this.f6299R1;
        Handler handler = (Handler) cc0.f1250b;
        if (handler != null) {
            handler.post(new RunnableC6720r4(cc0, 5, str));
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: Y */
    public final C1772bE mo4724Y(C0827N8 c0827n8) throws C0531IQ {
        C6686qX c6686qX = (C6686qX) c0827n8.f7524c;
        c6686qX.getClass();
        this.f6304W1 = c6686qX;
        C1772bE c1772bEMo4724Y = super.mo4724Y(c0827n8);
        CC0 cc0 = this.f6299R1;
        Handler handler = (Handler) cc0.f1250b;
        if (handler != null) {
            handler.post(new RunnableC8339Ts1(cc0, c6686qX, c1772bEMo4724Y, 2));
        }
        return c1772bEMo4724Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0104 A[Catch: Ba -> 0x0102, TryCatch #0 {Ba -> 0x0102, blocks: (B:110:0x00d9, B:113:0x00e1, B:115:0x00e5, B:117:0x00ee, B:121:0x00fc, B:124:0x0104, B:128:0x010b, B:129:0x0110), top: B:133:0x00d9 }] */
    @Override // p000.AbstractC8382Uo0
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4725Z(p000.C6686qX r14, android.media.MediaFormat r15) throws p000.C0531IQ {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7862Ko0.mo4725Z(qX, android.media.MediaFormat):void");
    }

    @Override // p000.InterfaceC7602Fo0
    /* renamed from: a */
    public final void mo2784a(CB0 cb0) {
        C0833NE c0833ne = this.f6300S1;
        c0833ne.getClass();
        c0833ne.f7591D = new CB0(AbstractC7485Dh1.m1824i(cb0.f1239a, 0.1f, 8.0f), AbstractC7485Dh1.m1824i(cb0.f1240b, 0.1f, 8.0f));
        if (c0833ne.m5610t()) {
            c0833ne.m5609s();
            return;
        }
        C0519IE c0519ie = new C0519IE(cb0, -9223372036854775807L, -9223372036854775807L);
        if (c0833ne.m5603l()) {
            c0833ne.f7589B = c0519ie;
        } else {
            c0833ne.f7590C = c0519ie;
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: a0 */
    public final void mo4726a0() {
        this.f6300S1.getClass();
    }

    @Override // p000.InterfaceC7602Fo0
    /* renamed from: b */
    public final long mo2785b() {
        if (this.f313h == 2) {
            m4734w0();
        }
        return this.f6306Y1;
    }

    @Override // p000.InterfaceC7602Fo0
    /* renamed from: c */
    public final boolean mo2786c() {
        boolean z = this.f6309b2;
        this.f6309b2 = false;
        return z;
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: c0 */
    public final void mo4727c0() {
        this.f6300S1.f7600M = true;
    }

    @Override // p000.AbstractC0043Ag, p000.PB0
    /* renamed from: d */
    public final void mo259d(int i, Object obj) {
        C0833NE c0833ne = this.f6300S1;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (c0833ne.f7603P != fFloatValue) {
                c0833ne.f7603P = fFloatValue;
                if (c0833ne.m5603l()) {
                    if (AbstractC7485Dh1.f2166a >= 21) {
                        c0833ne.f7648w.setVolume(c0833ne.f7603P);
                        return;
                    }
                    AudioTrack audioTrack = c0833ne.f7648w;
                    float f = c0833ne.f7603P;
                    audioTrack.setStereoVolume(f, f);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            C1017Q9 c1017q9 = (C1017Q9) obj;
            c1017q9.getClass();
            if (c0833ne.f7588A.equals(c1017q9)) {
                return;
            }
            c0833ne.f7588A = c1017q9;
            if (c0833ne.f7621d0) {
                return;
            }
            C1856ca c1856ca = c0833ne.f7650y;
            if (c1856ca != null) {
                c1856ca.f17613j = c1017q9;
                c1856ca.m10789a(C1520Y9.m9223b((Context) c1856ca.f17605b, c1017q9, (C3999ea) c1856ca.f17612i));
            }
            c0833ne.m5595d();
            return;
        }
        if (i == 6) {
            C1799bf c1799bf = (C1799bf) obj;
            c1799bf.getClass();
            if (c0833ne.f7617b0.equals(c1799bf)) {
                return;
            }
            if (c0833ne.f7648w != null) {
                c0833ne.f7617b0.getClass();
            }
            c0833ne.f7617b0 = c1799bf;
            return;
        }
        if (i == 12) {
            if (AbstractC7485Dh1.f2166a >= 23) {
                AbstractC7810Jo0.m4417a(c0833ne, obj);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f6310c2 = ((Integer) obj).intValue();
            InterfaceC7758Io0 interfaceC7758Io0 = this.f12090L;
            if (interfaceC7758Io0 != null && AbstractC7485Dh1.f2166a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt(NotificationConstants.IMPORTANCE, Math.max(0, -this.f6310c2));
                interfaceC7758Io0.mo4007a(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            c0833ne.f7592E = ((Boolean) obj).booleanValue();
            C0519IE c0519ie = new C0519IE(c0833ne.m5610t() ? CB0.f1238d : c0833ne.f7591D, -9223372036854775807L, -9223372036854775807L);
            if (c0833ne.m5603l()) {
                c0833ne.f7589B = c0519ie;
                return;
            } else {
                c0833ne.f7590C = c0519ie;
                return;
            }
        }
        if (i != 10) {
            if (i == 11) {
                this.f12080G = (C1537YQ) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (c0833ne.f7615a0 != iIntValue) {
            c0833ne.f7615a0 = iIntValue;
            c0833ne.f7613Z = iIntValue != 0;
            c0833ne.m5595d();
        }
    }

    @Override // p000.InterfaceC7602Fo0
    /* renamed from: e */
    public final CB0 mo2787e() {
        return this.f6300S1.f7591D;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0068  */
    @Override // p000.AbstractC8382Uo0
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo4728g0(long r1, long r3, p000.InterfaceC7758Io0 r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, p000.C6686qX r14) throws p000.C0531IQ {
        /*
            r0 = this;
            r6.getClass()
            qX r1 = r0.f6305X1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            r1 = r8 & 2
            if (r1 == 0) goto L14
            r5.getClass()
            r5.mo4016o(r7, r3)
            return r2
        L14:
            NE r1 = r0.f6300S1
            if (r12 == 0) goto L27
            if (r5 == 0) goto L1d
            r5.mo4016o(r7, r3)
        L1d:
            WD r3 = r0.f12091L1
            int r4 = r3.f13070f
            int r4 = r4 + r9
            r3.f13070f = r4
            r1.f7600M = r2
            return r2
        L27:
            boolean r1 = r1.m5600i(r6, r10, r9)     // Catch: p000.C0289Ea -> L3b p000.C0163Ca -> L55
            if (r1 == 0) goto L3a
            if (r5 == 0) goto L32
            r5.mo4016o(r7, r3)
        L32:
            WD r1 = r0.f12091L1
            int r3 = r1.f13069e
            int r3 = r3 + r9
            r1.f13069e = r3
            return r2
        L3a:
            return r3
        L3b:
            r1 = move-exception
            boolean r2 = r0.f12122u1
            if (r2 == 0) goto L4c
            ZQ0 r2 = r0.f309d
            r2.getClass()
            int r2 = r2.f14890a
            if (r2 == 0) goto L4c
            r2 = 5003(0x138b, float:7.01E-42)
            goto L4e
        L4c:
            r2 = 5002(0x138a, float:7.009E-42)
        L4e:
            boolean r3 = r1.f2785b
            IQ r1 = r0.m260f(r1, r14, r3, r2)
            throw r1
        L55:
            r1 = move-exception
            qX r2 = r0.f6304W1
            boolean r3 = r0.f12122u1
            if (r3 == 0) goto L68
            ZQ0 r3 = r0.f309d
            r3.getClass()
            int r3 = r3.f14890a
            if (r3 == 0) goto L68
            r3 = 5004(0x138c, float:7.012E-42)
            goto L6a
        L68:
            r3 = 5001(0x1389, float:7.008E-42)
        L6a:
            boolean r4 = r1.f1455b
            IQ r1 = r0.m260f(r1, r2, r4, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7862Ko0.mo4728g0(long, long, Io0, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, qX):boolean");
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: i */
    public final String mo263i() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: j0 */
    public final void mo4729j0() throws C0531IQ {
        try {
            C0833NE c0833ne = this.f6300S1;
            if (!c0833ne.f7609V && c0833ne.m5603l() && c0833ne.m5594c()) {
                c0833ne.m5606p();
                c0833ne.f7609V = true;
            }
        } catch (C0289Ea e) {
            throw m260f(e, e.f2786c, e.f2785b, this.f12122u1 ? 5003 : 5002);
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: k */
    public final boolean mo265k() {
        if (this.f12083H1) {
            C0833NE c0833ne = this.f6300S1;
            if (!c0833ne.m5603l() || (c0833ne.f7609V && !c0833ne.m5601j())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC8382Uo0, p000.AbstractC0043Ag
    /* renamed from: l */
    public final boolean mo266l() {
        return this.f6300S1.m5601j() || super.mo266l();
    }

    @Override // p000.AbstractC8382Uo0, p000.AbstractC0043Ag
    /* renamed from: m */
    public final void mo267m() {
        CC0 cc0 = this.f6299R1;
        this.f6308a2 = true;
        this.f6304W1 = null;
        try {
            this.f6300S1.m5595d();
            try {
                super.mo267m();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo267m();
                throw th;
            } finally {
            }
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: n */
    public final void mo268n(boolean z, boolean z2) {
        C1398WD c1398wd = new C1398WD();
        this.f12091L1 = c1398wd;
        CC0 cc0 = this.f6299R1;
        Handler handler = (Handler) cc0.f1250b;
        if (handler != null) {
            handler.post(new RunnableC6895ta(cc0, c1398wd, 0));
        }
        ZQ0 zq0 = this.f309d;
        zq0.getClass();
        boolean z3 = zq0.f14891b;
        C0833NE c0833ne = this.f6300S1;
        if (z3) {
            c0833ne.getClass();
            YN1.m9281f(AbstractC7485Dh1.f2166a >= 21);
            YN1.m9281f(c0833ne.f7613Z);
            if (!c0833ne.f7621d0) {
                c0833ne.f7621d0 = true;
                c0833ne.m5595d();
            }
        } else if (c0833ne.f7621d0) {
            c0833ne.f7621d0 = false;
            c0833ne.m5595d();
        }
        NB0 nb0 = this.f311f;
        nb0.getClass();
        c0833ne.f7643r = nb0;
        M71 m71 = this.f312g;
        m71.getClass();
        c0833ne.f7630i.f10285J = m71;
    }

    @Override // p000.AbstractC8382Uo0, p000.AbstractC0043Ag
    /* renamed from: o */
    public final void mo269o(long j, boolean z) throws C0531IQ {
        super.mo269o(j, z);
        this.f6300S1.m5595d();
        this.f6306Y1 = j;
        this.f6309b2 = false;
        this.f6307Z1 = true;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: p */
    public final void mo270p() {
        C1673aa c1673aa;
        C1856ca c1856ca = this.f6300S1.f7650y;
        if (c1856ca == null || !c1856ca.f17604a) {
            return;
        }
        c1856ca.f17611h = null;
        int i = AbstractC7485Dh1.f2166a;
        Context context = (Context) c1856ca.f17605b;
        if (i >= 23 && (c1673aa = (C1673aa) c1856ca.f17608e) != null) {
            AbstractC1583Z9.m9495b(context, c1673aa);
        }
        C0196D6 c0196d6 = (C0196D6) c1856ca.f17609f;
        if (c0196d6 != null) {
            context.unregisterReceiver(c0196d6);
        }
        C1794ba c1794ba = (C1794ba) c1856ca.f17610g;
        if (c1794ba != null) {
            c1794ba.f17074a.unregisterContentObserver(c1794ba);
        }
        c1856ca.f17604a = false;
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: p0 */
    public final boolean mo4730p0(C6686qX c6686qX) {
        ZQ0 zq0 = this.f309d;
        zq0.getClass();
        if (zq0.f14890a != 0) {
            int iM4732u0 = m4732u0(c6686qX);
            if ((iM4732u0 & 512) != 0) {
                ZQ0 zq02 = this.f309d;
                zq02.getClass();
                if (zq02.f14890a == 2 || (iM4732u0 & 1024) != 0 || (c6686qX.f40954D == 0 && c6686qX.f40955E == 0)) {
                    return true;
                }
            }
        }
        return this.f6300S1.m5597f(c6686qX) != 0;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: q */
    public final void mo271q() {
        C0833NE c0833ne = this.f6300S1;
        this.f6309b2 = false;
        try {
            try {
                m8155E();
                m8173i0();
                InterfaceC0715LL interfaceC0715LL = this.f12078F;
                if (interfaceC0715LL != null) {
                    interfaceC0715LL.mo4951d(null);
                }
                this.f12078F = null;
            } catch (Throwable th) {
                InterfaceC0715LL interfaceC0715LL2 = this.f12078F;
                if (interfaceC0715LL2 != null) {
                    interfaceC0715LL2.mo4951d(null);
                }
                this.f12078F = null;
                throw th;
            }
        } finally {
            if (this.f6308a2) {
                this.f6308a2 = false;
                c0833ne.m5608r();
            }
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: q0 */
    public final int mo4731q0(C4262il c4262il, C6686qX c6686qX) {
        int iM4732u0;
        C8018No0 c8018No0M9603e;
        boolean z;
        if (!AbstractC8544Xr0.m9167j(c6686qX.f40974m)) {
            return AbstractC11153tN0.m24901m(0, 0, 0, 0);
        }
        int i = AbstractC7485Dh1.f2166a >= 21 ? 32 : 0;
        boolean z2 = true;
        int i2 = c6686qX.f40960J;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        C0833NE c0833ne = this.f6300S1;
        if (!z4 || (z3 && AbstractC8642Zo0.m9603e("audio/raw") == null)) {
            iM4732u0 = 0;
        } else {
            iM4732u0 = m4732u0(c6686qX);
            if (c0833ne.m5597f(c6686qX) != 0) {
                return AbstractC11153tN0.m24901m(4, 8, i, iM4732u0);
            }
        }
        String str = c6686qX.f40974m;
        if ("audio/raw".equals(str) && c0833ne.m5597f(c6686qX) == 0) {
            return AbstractC11153tN0.m24901m(1, 0, 0, 0);
        }
        C6623pX c6623pX = new C6623pX();
        c6623pX.f40161l = AbstractC8544Xr0.m9171n("audio/raw");
        c6623pX.f40175z = c6686qX.f40951A;
        c6623pX.f40141A = c6686qX.f40952B;
        c6623pX.f40142B = 2;
        if (c0833ne.m5597f(new C6686qX(c6623pX)) == 0) {
            return AbstractC11153tN0.m24901m(1, 0, 0, 0);
        }
        C9367fQ0 c9367fQ0M9606h = str == null ? C9367fQ0.f27184e : (c0833ne.m5597f(c6686qX) == 0 || (c8018No0M9603e = AbstractC8642Zo0.m9603e("audio/raw")) == null) ? AbstractC8642Zo0.m9606h(c4262il, c6686qX, false, false) : P70.m6229B(c8018No0M9603e);
        if (c9367fQ0M9606h.isEmpty()) {
            return AbstractC11153tN0.m24901m(1, 0, 0, 0);
        }
        if (!z4) {
            return AbstractC11153tN0.m24901m(2, 0, 0, 0);
        }
        C8018No0 c8018No0 = (C8018No0) c9367fQ0M9606h.get(0);
        boolean zM5851d = c8018No0.m5851d(c6686qX);
        if (zM5851d) {
            z = true;
            z2 = zM5851d;
        } else {
            for (int i4 = 1; i4 < c9367fQ0M9606h.f27186d; i4++) {
                C8018No0 c8018No02 = (C8018No0) c9367fQ0M9606h.get(i4);
                if (c8018No02.m5851d(c6686qX)) {
                    z = false;
                    c8018No0 = c8018No02;
                    break;
                }
            }
            z = true;
            z2 = zM5851d;
        }
        int i5 = z2 ? 4 : 3;
        if (z2 && c8018No0.m5852e(c6686qX)) {
            i3 = 16;
        }
        return i5 | i3 | i | (c8018No0.f8015g ? 64 : 0) | (z ? 128 : 0) | iM4732u0;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: r */
    public final void mo272r() {
        this.f6300S1.m5605o();
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: s */
    public final void mo273s() throws IllegalStateException {
        m4734w0();
        C0833NE c0833ne = this.f6300S1;
        c0833ne.f7612Y = false;
        if (c0833ne.m5603l()) {
            C1106Ra c1106Ra = c0833ne.f7630i;
            c1106Ra.m7043d();
            if (c1106Ra.f10310y == -9223372036854775807L) {
                C1044Qa c1044Qa = c1106Ra.f10291f;
                c1044Qa.getClass();
                c1044Qa.m6730a();
            } else {
                c1106Ra.f10276A = c1106Ra.m7041b();
                if (!C0833NE.m5591m(c0833ne.f7648w)) {
                    return;
                }
            }
            c0833ne.f7648w.pause();
        }
    }

    /* renamed from: u0 */
    public final int m4732u0(C6686qX c6686qX) {
        C6498na c6498naM5596e = this.f6300S1.m5596e(c6686qX);
        if (!c6498naM5596e.f38377a) {
            return 0;
        }
        int i = c6498naM5596e.f38378b ? 1536 : 512;
        return c6498naM5596e.f38379c ? i | 2048 : i;
    }

    /* renamed from: v0 */
    public final int m4733v0(C8018No0 c8018No0, C6686qX c6686qX) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c8018No0.f8009a) || (i = AbstractC7485Dh1.f2166a) >= 24 || (i == 23 && AbstractC7485Dh1.m1801P(this.f6298Q1))) {
            return c6686qX.f40975n;
        }
        return -1;
    }

    /* renamed from: w0 */
    public final void m4734w0() {
        long jMax;
        ArrayDeque arrayDeque;
        long jM1840y;
        long jM1810Y;
        boolean zMo265k = mo265k();
        C0833NE c0833ne = this.f6300S1;
        if (!c0833ne.m5603l() || c0833ne.f7601N) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(c0833ne.f7630i.m7040a(zMo265k), AbstractC7485Dh1.m1808W(c0833ne.f7646u.f4183e, c0833ne.m5599h()));
            while (true) {
                arrayDeque = c0833ne.f7632j;
                if (arrayDeque.isEmpty() || jMin < ((C0519IE) arrayDeque.getFirst()).f4845c) {
                    break;
                } else {
                    c0833ne.f7590C = (C0519IE) arrayDeque.remove();
                }
            }
            long j = jMin - c0833ne.f7590C.f4845c;
            boolean zIsEmpty = arrayDeque.isEmpty();
            C10189lr0 c10189lr0 = c0833ne.f7616b;
            if (zIsEmpty) {
                S21 s21 = (S21) c10189lr0.f37325d;
                if (s21.isActive()) {
                    if (s21.f10559o >= 1024) {
                        long j2 = s21.f10558n;
                        s21.f10554j.getClass();
                        long j3 = j2 - ((r3.f9939k * r3.f9930b) * 2);
                        int i = s21.f10552h.f41026a;
                        int i2 = s21.f10551g.f41026a;
                        jM1810Y = i == i2 ? AbstractC7485Dh1.m1810Y(j, j3, s21.f10559o, RoundingMode.FLOOR) : AbstractC7485Dh1.m1810Y(j, j3 * i, s21.f10559o * i2, RoundingMode.FLOOR);
                    } else {
                        jM1810Y = (long) (s21.f10547c * j);
                    }
                    j = jM1810Y;
                }
                jM1840y = c0833ne.f7590C.f4844b + j;
            } else {
                C0519IE c0519ie = (C0519IE) arrayDeque.getFirst();
                jM1840y = c0519ie.f4844b - AbstractC7485Dh1.m1840y(c0519ie.f4845c - jMin, c0833ne.f7590C.f4843a.f1239a);
            }
            long j4 = ((I01) c10189lr0.f37324c).f4643q;
            jMax = AbstractC7485Dh1.m1808W(c0833ne.f7646u.f4183e, j4) + jM1840y;
            long j5 = c0833ne.f7633j0;
            if (j4 > j5) {
                long jM1808W = AbstractC7485Dh1.m1808W(c0833ne.f7646u.f4183e, j4 - j5);
                c0833ne.f7633j0 = j4;
                c0833ne.f7635k0 += jM1808W;
                if (c0833ne.f7637l0 == null) {
                    c0833ne.f7637l0 = new Handler(Looper.myLooper());
                }
                c0833ne.f7637l0.removeCallbacksAndMessages(null);
                c0833ne.f7637l0.postDelayed(new RunnableC0204DE(0, c0833ne), 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.f6307Z1) {
                jMax = Math.max(this.f6306Y1, jMax);
            }
            this.f6306Y1 = jMax;
            this.f6307Z1 = false;
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: h */
    public final InterfaceC7602Fo0 mo262h() {
        return this;
    }
}
