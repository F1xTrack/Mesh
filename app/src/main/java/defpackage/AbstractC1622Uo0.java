package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: Uo0 */
/* loaded from: classes.dex */
public abstract class AbstractC1622Uo0 extends AbstractC0038Ag {
    public static final byte[] P1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final ArrayDeque A;
    public int A1;
    public final C5217ix0 B;
    public boolean B1;
    public C6666qX C;
    public boolean C1;
    public C6666qX D;
    public boolean D1;
    public LL E;
    public long E1;
    public LL F;
    public long F1;
    public YQ G;
    public boolean G1;
    public MediaCrypto H;
    public boolean H1;
    public final long I;
    public boolean I1;
    public float J;
    public boolean J1;
    public float K;
    public IQ K1;
    public InterfaceC0687Io0 L;
    public WD L1;
    public C6666qX M;
    public C1544To0 M1;
    public MediaFormat N;
    public long N1;
    public boolean O;
    public boolean O1;
    public float P;
    public ArrayDeque Q;
    public C1388Ro0 R;
    public C1076No0 S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public long d0;
    public int e0;
    public int q1;
    public final InterfaceC0609Ho0 r;
    public ByteBuffer r1;
    public final C4403il s;
    public boolean s1;
    public final boolean t;
    public boolean t1;
    public final float u;
    public boolean u1;
    public final ZD v;
    public boolean v1;
    public final ZD w;
    public boolean w1;
    public final ZD x;
    public boolean x1;
    public final C1519Tg y;
    public int y1;
    public final MediaCodec.BufferInfo z;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1622Uo0(int i, InterfaceC0609Ho0 interfaceC0609Ho0, boolean z, float f) {
        super(i);
        C4403il c4403il = C4403il.c;
        this.r = interfaceC0609Ho0;
        this.s = c4403il;
        this.t = z;
        this.u = f;
        this.v = new ZD(0);
        this.w = new ZD(0);
        this.x = new ZD(2);
        C1519Tg c1519Tg = new C1519Tg(2);
        c1519Tg.l = 32;
        this.y = c1519Tg;
        this.z = new MediaCodec.BufferInfo();
        this.J = 1.0f;
        this.K = 1.0f;
        this.I = -9223372036854775807L;
        this.A = new ArrayDeque();
        this.M1 = C1544To0.e;
        c1519Tg.v(0);
        c1519Tg.e.order(ByteOrder.nativeOrder());
        C5217ix0 c5217ix0 = new C5217ix0();
        c5217ix0.c = InterfaceC7056sa.a;
        c5217ix0.b = 0;
        c5217ix0.a = 2;
        this.B = c5217ix0;
        this.P = -1.0f;
        this.T = 0;
        this.y1 = 0;
        this.e0 = -1;
        this.q1 = -1;
        this.d0 = -9223372036854775807L;
        this.E1 = -9223372036854775807L;
        this.F1 = -9223372036854775807L;
        this.N1 = -9223372036854775807L;
        this.z1 = 0;
        this.A1 = 0;
        this.L1 = new WD();
    }

    @Override // defpackage.AbstractC0038Ag
    public final int A() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:275:0x032a, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0330, code lost:
    
        r26.v1 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:267:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0324  */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(long r27, long r29) throws defpackage.IQ {
        /*
            Method dump skipped, instructions count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1622Uo0.B(long, long):boolean");
    }

    public abstract C2285bE C(C1076No0 c1076No0, C6666qX c6666qX, C6666qX c6666qX2);

    public C0998Mo0 D(IllegalStateException illegalStateException, C1076No0 c1076No0) {
        return new C0998Mo0(illegalStateException, c1076No0);
    }

    public final void E() {
        this.w1 = false;
        this.y.t();
        this.x.t();
        this.v1 = false;
        this.u1 = false;
        C5217ix0 c5217ix0 = this.B;
        c5217ix0.getClass();
        c5217ix0.c = InterfaceC7056sa.a;
        c5217ix0.b = 0;
        c5217ix0.a = 2;
    }

    public final boolean F() throws MediaCryptoException, IQ {
        if (this.B1) {
            this.z1 = 1;
            if (this.V || this.X) {
                this.A1 = 3;
                return false;
            }
            this.A1 = 2;
        } else {
            s0();
        }
        return true;
    }

    public final boolean G(long j, long j2) throws MediaCryptoException, IQ {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean zG0;
        ByteBuffer byteBuffer;
        int i;
        int i2;
        long j3;
        boolean z3;
        boolean z4;
        C6666qX c6666qX;
        int iM;
        InterfaceC0687Io0 interfaceC0687Io0 = this.L;
        interfaceC0687Io0.getClass();
        boolean z5 = this.q1 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.z;
        if (!z5) {
            if (this.Y && this.C1) {
                try {
                    iM = interfaceC0687Io0.m(bufferInfo2);
                } catch (IllegalStateException unused) {
                    f0();
                    if (this.H1) {
                        i0();
                    }
                    return false;
                }
            } else {
                iM = interfaceC0687Io0.m(bufferInfo2);
            }
            if (iM < 0) {
                if (iM != -2) {
                    if (this.c0 && (this.G1 || this.z1 == 2)) {
                        f0();
                    }
                    return false;
                }
                this.D1 = true;
                InterfaceC0687Io0 interfaceC0687Io02 = this.L;
                interfaceC0687Io02.getClass();
                MediaFormat mediaFormatF = interfaceC0687Io02.f();
                if (this.T != 0 && mediaFormatF.getInteger(Snapshot.WIDTH) == 32 && mediaFormatF.getInteger(Snapshot.HEIGHT) == 32) {
                    this.b0 = true;
                } else {
                    this.N = mediaFormatF;
                    this.O = true;
                }
                return true;
            }
            if (this.b0) {
                this.b0 = false;
                interfaceC0687Io0.o(iM, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                f0();
                return false;
            }
            this.q1 = iM;
            ByteBuffer byteBufferV = interfaceC0687Io0.v(iM);
            this.r1 = byteBufferV;
            if (byteBufferV != null) {
                byteBufferV.position(bufferInfo2.offset);
                this.r1.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Z && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0 && this.E1 != -9223372036854775807L) {
                bufferInfo2.presentationTimeUs = this.F1;
            }
            long j4 = bufferInfo2.presentationTimeUs;
            this.s1 = j4 < this.l;
            long j5 = this.F1;
            this.t1 = j5 != -9223372036854775807L && j5 <= j4;
            t0(j4);
        }
        if (this.Y && this.C1) {
            try {
                byteBuffer = this.r1;
                i = this.q1;
                i2 = bufferInfo2.flags;
                j3 = bufferInfo2.presentationTimeUs;
                z3 = this.s1;
                z4 = this.t1;
                c6666qX = this.D;
                c6666qX.getClass();
                z = true;
                z2 = false;
            } catch (IllegalStateException unused2) {
                z2 = false;
            }
            try {
                zG0 = g0(j, j2, interfaceC0687Io0, byteBuffer, i, i2, 1, j3, z3, z4, c6666qX);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                f0();
                if (this.H1) {
                    i0();
                }
                return z2;
            }
        } else {
            z = true;
            z2 = false;
            ByteBuffer byteBuffer2 = this.r1;
            int i3 = this.q1;
            int i4 = bufferInfo2.flags;
            long j6 = bufferInfo2.presentationTimeUs;
            boolean z6 = this.s1;
            boolean z7 = this.t1;
            C6666qX c6666qX2 = this.D;
            c6666qX2.getClass();
            bufferInfo = bufferInfo2;
            zG0 = g0(j, j2, interfaceC0687Io0, byteBuffer2, i3, i4, 1, j6, z6, z7, c6666qX2);
        }
        if (zG0) {
            b0(bufferInfo.presentationTimeUs);
            boolean z8 = (bufferInfo.flags & 4) != 0 ? z : z2;
            this.q1 = -1;
            this.r1 = null;
            if (!z8) {
                return z;
            }
            f0();
        }
        return z2;
    }

    public final boolean H() throws MediaCryptoException, IQ {
        InterfaceC0687Io0 interfaceC0687Io0 = this.L;
        if (interfaceC0687Io0 == null || this.z1 == 2 || this.G1) {
            return false;
        }
        int i = this.e0;
        ZD zd = this.w;
        if (i < 0) {
            int iK = interfaceC0687Io0.k();
            this.e0 = iK;
            if (iK < 0) {
                return false;
            }
            zd.e = interfaceC0687Io0.t(iK);
            zd.t();
        }
        if (this.z1 == 1) {
            if (!this.c0) {
                this.C1 = true;
                interfaceC0687Io0.c(this.e0, 0, 4, 0L);
                this.e0 = -1;
                zd.e = null;
            }
            this.z1 = 2;
            return false;
        }
        if (this.a0) {
            this.a0 = false;
            ByteBuffer byteBuffer = zd.e;
            byteBuffer.getClass();
            byteBuffer.put(P1);
            interfaceC0687Io0.c(this.e0, 38, 0, 0L);
            this.e0 = -1;
            zd.e = null;
            this.B1 = true;
            return true;
        }
        if (this.y1 == 1) {
            int i2 = 0;
            while (true) {
                C6666qX c6666qX = this.M;
                c6666qX.getClass();
                if (i2 >= c6666qX.p.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.M.p.get(i2);
                ByteBuffer byteBuffer2 = zd.e;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i2++;
            }
            this.y1 = 2;
        }
        ByteBuffer byteBuffer3 = zd.e;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        N8 n8 = this.c;
        n8.f();
        try {
            int iU = u(n8, zd, 0);
            if (iU == -3) {
                if (j()) {
                    this.F1 = this.E1;
                }
                return false;
            }
            if (iU == -5) {
                if (this.y1 == 2) {
                    zd.t();
                    this.y1 = 1;
                }
                Y(n8);
                return true;
            }
            if (zd.g(4)) {
                this.F1 = this.E1;
                if (this.y1 == 2) {
                    zd.t();
                    this.y1 = 1;
                }
                this.G1 = true;
                if (!this.B1) {
                    f0();
                    return false;
                }
                try {
                    if (!this.c0) {
                        this.C1 = true;
                        interfaceC0687Io0.c(this.e0, 0, 4, 0L);
                        this.e0 = -1;
                        zd.e = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw f(e, this.C, false, AbstractC0277Dh1.v(e.getErrorCode()));
                }
            }
            if (!this.B1 && !zd.g(1)) {
                zd.t();
                if (this.y1 == 2) {
                    this.y1 = 1;
                }
                return true;
            }
            boolean zG = zd.g(1073741824);
            if (zG) {
                C6218oB c6218oB = zd.d;
                if (iPosition == 0) {
                    c6218oB.getClass();
                } else {
                    if (c6218oB.d == null) {
                        int[] iArr = new int[1];
                        c6218oB.d = iArr;
                        c6218oB.i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = c6218oB.d;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.U && !zG) {
                ByteBuffer byteBuffer4 = zd.e;
                byteBuffer4.getClass();
                int iPosition2 = byteBuffer4.position();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i3 + 1;
                    if (i5 >= iPosition2) {
                        byteBuffer4.clear();
                        break;
                    }
                    int i6 = byteBuffer4.get(i3) & 255;
                    if (i4 == 3) {
                        if (i6 == 1 && (byteBuffer4.get(i5) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer4.duplicate();
                            byteBufferDuplicate.position(i3 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer4.position(0);
                            byteBuffer4.put(byteBufferDuplicate);
                            break;
                        }
                    } else if (i6 == 0) {
                        i4++;
                    }
                    if (i6 != 0) {
                        i4 = 0;
                    }
                    i3 = i5;
                }
                ByteBuffer byteBuffer5 = zd.e;
                byteBuffer5.getClass();
                if (byteBuffer5.position() == 0) {
                    return true;
                }
                this.U = false;
            }
            long j = zd.g;
            if (this.I1) {
                ArrayDeque arrayDeque = this.A;
                if (arrayDeque.isEmpty()) {
                    J9 j9 = this.M1.d;
                    C6666qX c6666qX2 = this.C;
                    c6666qX2.getClass();
                    j9.a(j, c6666qX2);
                } else {
                    J9 j92 = ((C1544To0) arrayDeque.peekLast()).d;
                    C6666qX c6666qX3 = this.C;
                    c6666qX3.getClass();
                    j92.a(j, c6666qX3);
                }
                this.I1 = false;
            }
            this.E1 = Math.max(this.E1, j);
            if (j() || zd.g(536870912)) {
                this.F1 = this.E1;
            }
            zd.w();
            if (zd.g(268435456)) {
                Q(zd);
            }
            d0(zd);
            int iL = L(zd);
            try {
                if (zG) {
                    interfaceC0687Io0.b(this.e0, zd.d, j, iL);
                } else {
                    int i7 = this.e0;
                    ByteBuffer byteBuffer6 = zd.e;
                    byteBuffer6.getClass();
                    interfaceC0687Io0.c(i7, byteBuffer6.limit(), iL, j);
                }
                this.e0 = -1;
                zd.e = null;
                this.B1 = true;
                this.y1 = 0;
                this.L1.c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw f(e2, this.C, false, AbstractC0277Dh1.v(e2.getErrorCode()));
            }
        } catch (YD e3) {
            V(e3);
            h0(0);
            I();
            return true;
        }
    }

    public final void I() {
        try {
            InterfaceC0687Io0 interfaceC0687Io0 = this.L;
            YN1.h(interfaceC0687Io0);
            interfaceC0687Io0.flush();
        } finally {
            k0();
        }
    }

    public final boolean J() throws MediaCryptoException {
        if (this.L == null) {
            return false;
        }
        int i = this.A1;
        if (i == 3 || this.V || ((this.W && !this.D1) || (this.X && this.C1))) {
            i0();
            return true;
        }
        if (i == 2) {
            int i2 = AbstractC0277Dh1.a;
            YN1.f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    s0();
                } catch (IQ e) {
                    AbstractC6789rA1.i("Failed to update the DRM session, releasing the codec instead.", e);
                    i0();
                    return true;
                }
            }
        }
        I();
        return false;
    }

    public final List K(boolean z) {
        C6666qX c6666qX = this.C;
        c6666qX.getClass();
        C4403il c4403il = this.s;
        ArrayList arrayListO = O(c4403il, c6666qX, z);
        if (arrayListO.isEmpty() && z) {
            arrayListO = O(c4403il, c6666qX, false);
            if (!arrayListO.isEmpty()) {
                AbstractC6789rA1.h("Drm session requires secure decoder for " + c6666qX.m + ", but no secure decoder available. Trying to proceed with " + arrayListO + ".");
            }
        }
        return arrayListO;
    }

    public int L(ZD zd) {
        return 0;
    }

    public boolean M() {
        return false;
    }

    public abstract float N(float f, C6666qX[] c6666qXArr);

    public abstract ArrayList O(C4403il c4403il, C6666qX c6666qX, boolean z);

    public abstract C0531Go0 P(C1076No0 c1076No0, C6666qX c6666qX, MediaCrypto mediaCrypto, float f);

    public abstract void Q(ZD zd);

    /* JADX WARN: Removed duplicated region for block: B:188:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(defpackage.C1076No0 r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1622Uo0.R(No0, android.media.MediaCrypto):void");
    }

    public final boolean S(long j, long j2) {
        C6666qX c6666qX;
        return j2 < j && ((c6666qX = this.D) == null || !Objects.equals(c6666qX.m, "audio/opus") || j - j2 > 80000);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00b2 A[Catch: Ro0 -> 0x00bc, TryCatch #1 {Ro0 -> 0x00bc, blocks: (B:138:0x00ae, B:140:0x00b2, B:146:0x00bf), top: B:158:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T() throws defpackage.IQ {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1622Uo0.T():void");
    }

    public final void U(MediaCrypto mediaCrypto, boolean z) throws C1388Ro0 {
        String diagnosticInfo;
        C6666qX c6666qX = this.C;
        c6666qX.getClass();
        if (this.Q == null) {
            try {
                List listK = K(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.Q = arrayDeque;
                if (this.t) {
                    arrayDeque.addAll(listK);
                } else if (!listK.isEmpty()) {
                    this.Q.add((C1076No0) listK.get(0));
                }
                this.R = null;
            } catch (C1778Wo0 e) {
                throw new C1388Ro0(c6666qX, e, z, -49998);
            }
        }
        if (this.Q.isEmpty()) {
            throw new C1388Ro0(c6666qX, null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.Q;
        arrayDeque2.getClass();
        while (this.L == null) {
            C1076No0 c1076No0 = (C1076No0) arrayDeque2.peekFirst();
            c1076No0.getClass();
            if (!o0(c1076No0)) {
                return;
            }
            try {
                R(c1076No0, mediaCrypto);
            } catch (Exception e2) {
                AbstractC6789rA1.i("Failed to initialize decoder: " + c1076No0, e2);
                arrayDeque2.removeFirst();
                String str = "Decoder init failed: " + c1076No0.a + ", " + c6666qX;
                if (AbstractC0277Dh1.a >= 21) {
                    diagnosticInfo = e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null;
                } else {
                    diagnosticInfo = null;
                }
                C1388Ro0 c1388Ro0 = new C1388Ro0(str, e2, c6666qX.m, z, c1076No0, diagnosticInfo);
                V(c1388Ro0);
                C1388Ro0 c1388Ro02 = this.R;
                if (c1388Ro02 == null) {
                    this.R = c1388Ro0;
                } else {
                    this.R = new C1388Ro0(c1388Ro02.getMessage(), c1388Ro02.getCause(), c1388Ro02.a, c1388Ro02.b, c1388Ro02.c, c1388Ro02.d);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.R;
                }
            }
        }
        this.Q = null;
    }

    public abstract void V(Exception exc);

    public abstract void W(long j, long j2, String str);

    public abstract void X(String str);

    /* JADX WARN: Code restructure failed: missing block: B:195:0x00cf, code lost:
    
        if (r4.f(r3) != false) goto L270;
     */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.C2285bE Y(defpackage.N8 r13) throws defpackage.IQ {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1622Uo0.Y(N8):bE");
    }

    public abstract void Z(C6666qX c6666qX, MediaFormat mediaFormat);

    public void b0(long j) {
        this.N1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.A;
            if (arrayDeque.isEmpty() || j < ((C1544To0) arrayDeque.peek()).a) {
                return;
            }
            C1544To0 c1544To0 = (C1544To0) arrayDeque.poll();
            c1544To0.getClass();
            n0(c1544To0);
            c0();
        }
    }

    public abstract void c0();

    public final void f0() throws MediaCryptoException, IQ {
        int i = this.A1;
        if (i == 1) {
            I();
            return;
        }
        if (i == 2) {
            I();
            s0();
        } else if (i != 3) {
            this.H1 = true;
            j0();
        } else {
            i0();
            T();
        }
    }

    public abstract boolean g0(long j, long j2, InterfaceC0687Io0 interfaceC0687Io0, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6666qX c6666qX);

    public final boolean h0(int i) throws MediaCryptoException, IQ {
        N8 n8 = this.c;
        n8.f();
        ZD zd = this.v;
        zd.t();
        int iU = u(n8, zd, i | 4);
        if (iU == -5) {
            Y(n8);
            return true;
        }
        if (iU != -4 || !zd.g(4)) {
            return false;
        }
        this.G1 = true;
        f0();
        return false;
    }

    public final void i0() {
        try {
            InterfaceC0687Io0 interfaceC0687Io0 = this.L;
            if (interfaceC0687Io0 != null) {
                interfaceC0687Io0.release();
                this.L1.b++;
                C1076No0 c1076No0 = this.S;
                c1076No0.getClass();
                X(c1076No0.a);
            }
            this.L = null;
            try {
                MediaCrypto mediaCrypto = this.H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.L = null;
            try {
                MediaCrypto mediaCrypto2 = this.H;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void k0() {
        this.e0 = -1;
        this.w.e = null;
        this.q1 = -1;
        this.r1 = null;
        this.d0 = -9223372036854775807L;
        this.C1 = false;
        this.B1 = false;
        this.a0 = false;
        this.b0 = false;
        this.s1 = false;
        this.t1 = false;
        this.E1 = -9223372036854775807L;
        this.F1 = -9223372036854775807L;
        this.N1 = -9223372036854775807L;
        this.z1 = 0;
        this.A1 = 0;
        this.y1 = this.x1 ? 1 : 0;
    }

    @Override // defpackage.AbstractC0038Ag
    public boolean l() {
        boolean zF;
        if (this.C == null) {
            return false;
        }
        if (j()) {
            zF = this.n;
        } else {
            InterfaceC3403dV0 interfaceC3403dV0 = this.i;
            interfaceC3403dV0.getClass();
            zF = interfaceC3403dV0.f();
        }
        if (!zF) {
            if (!(this.q1 >= 0)) {
                if (this.d0 == -9223372036854775807L) {
                    return false;
                }
                this.g.getClass();
                if (SystemClock.elapsedRealtime() >= this.d0) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void l0() {
        k0();
        this.K1 = null;
        this.Q = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.O = false;
        this.D1 = false;
        this.P = -1.0f;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.c0 = false;
        this.x1 = false;
        this.y1 = 0;
    }

    @Override // defpackage.AbstractC0038Ag
    public void m() throws MediaCryptoException {
        this.C = null;
        n0(C1544To0.e);
        this.A.clear();
        J();
    }

    public final void m0(LL ll) {
        LL ll2 = this.E;
        if (ll2 != ll) {
            if (ll != null) {
                ll.e(null);
            }
            if (ll2 != null) {
                ll2.d(null);
            }
        }
        this.E = ll;
    }

    public final void n0(C1544To0 c1544To0) {
        this.M1 = c1544To0;
        if (c1544To0.c != -9223372036854775807L) {
            this.O1 = true;
            a0();
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public void o(long j, boolean z) throws IQ {
        this.G1 = false;
        this.H1 = false;
        this.J1 = false;
        if (this.u1) {
            this.y.t();
            this.x.t();
            this.v1 = false;
            C5217ix0 c5217ix0 = this.B;
            c5217ix0.getClass();
            c5217ix0.c = InterfaceC7056sa.a;
            c5217ix0.b = 0;
            c5217ix0.a = 2;
        } else if (J()) {
            T();
        }
        if (this.M1.d.t() > 0) {
            this.I1 = true;
        }
        this.M1.d.b();
        this.A.clear();
    }

    public boolean o0(C1076No0 c1076No0) {
        return true;
    }

    public boolean p0(C6666qX c6666qX) {
        return false;
    }

    public abstract int q0(C4403il c4403il, C6666qX c6666qX);

    public final boolean r0(C6666qX c6666qX) throws IQ {
        if (AbstractC0277Dh1.a >= 23 && this.L != null && this.A1 != 3 && this.h != 0) {
            float f = this.K;
            c6666qX.getClass();
            C6666qX[] c6666qXArr = this.j;
            c6666qXArr.getClass();
            float fN = N(f, c6666qXArr);
            float f2 = this.P;
            if (f2 == fN) {
                return true;
            }
            if (fN == -1.0f) {
                if (this.B1) {
                    this.z1 = 1;
                    this.A1 = 3;
                    return false;
                }
                i0();
                T();
                return false;
            }
            if (f2 == -1.0f && fN <= this.u) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fN);
            InterfaceC0687Io0 interfaceC0687Io0 = this.L;
            interfaceC0687Io0.getClass();
            interfaceC0687Io0.a(bundle);
            this.P = fN;
        }
        return true;
    }

    public final void s0() throws MediaCryptoException, IQ {
        LL ll = this.F;
        ll.getClass();
        InterfaceC5836mB interfaceC5836mBG = ll.g();
        if (interfaceC5836mBG instanceof SY) {
            try {
                MediaCrypto mediaCrypto = this.H;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((SY) interfaceC5836mBG).b);
            } catch (MediaCryptoException e) {
                throw f(e, this.C, false, AuthCode.StatusCode.PERMISSION_EXPIRED);
            }
        }
        m0(this.F);
        this.z1 = 0;
        this.A1 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0036, code lost:
    
        if (r7 >= r5) goto L34;
     */
    @Override // defpackage.AbstractC0038Ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.C6666qX[] r13, long r14, long r16) {
        /*
            r12 = this;
            r0 = r12
            To0 r1 = r0.M1
            long r1 = r1.c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            To0 r1 = new To0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.n0(r1)
            goto L63
        L20:
            java.util.ArrayDeque r1 = r0.A
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L55
            long r5 = r0.E1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L38
            long r7 = r0.N1
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L55
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L55
        L38:
            To0 r1 = new To0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.n0(r1)
            To0 r1 = r0.M1
            long r1 = r1.c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L63
            r12.c0()
            goto L63
        L55:
            To0 r9 = new To0
            long r3 = r0.E1
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1622Uo0.t(qX[], long, long):void");
    }

    public final void t0(long j) {
        C6666qX c6666qX = (C6666qX) this.M1.d.q(j);
        if (c6666qX == null && this.O1 && this.N != null) {
            c6666qX = (C6666qX) this.M1.d.p();
        }
        if (c6666qX != null) {
            this.D = c6666qX;
        } else if (!this.O || this.D == null) {
            return;
        }
        C6666qX c6666qX2 = this.D;
        c6666qX2.getClass();
        Z(c6666qX2, this.N);
        this.O = false;
        this.O1 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0075 A[LOOP:1: B:121:0x0050->B:131:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0096 A[LOOP:2: B:132:0x0076->B:142:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0076 A[EDGE_INSN: B:179:0x0076->B:183:? BREAK  A[LOOP:1: B:121:0x0050->B:131:0x0075], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0097 A[EDGE_INSN: B:182:0x0097->B:143:0x0097 BREAK  A[LOOP:2: B:132:0x0076->B:142:0x0096], SYNTHETIC] */
    @Override // defpackage.AbstractC0038Ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(long r12, long r14) throws android.media.MediaCryptoException, defpackage.IQ {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1622Uo0.v(long, long):void");
    }

    @Override // defpackage.AbstractC0038Ag
    public void y(float f, float f2) throws IQ {
        this.J = f;
        this.K = f2;
        r0(this.M);
    }

    @Override // defpackage.AbstractC0038Ag
    public final int z(C6666qX c6666qX) throws IQ {
        try {
            return q0(this.s, c6666qX);
        } catch (C1778Wo0 e) {
            throw f(e, c6666qX, false, 4002);
        }
    }

    public void a0() {
    }

    public void j0() {
    }

    public void d0(ZD zd) {
    }

    public void e0(C6666qX c6666qX) {
    }
}
