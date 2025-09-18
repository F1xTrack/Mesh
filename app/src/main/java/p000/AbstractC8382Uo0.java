package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: Uo0 */
/* loaded from: classes.dex */
public abstract class AbstractC8382Uo0 extends AbstractC0043Ag {

    /* renamed from: P1 */
    public static final byte[] f12067P1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    public final ArrayDeque f12068A;

    /* renamed from: A1 */
    public int f12069A1;

    /* renamed from: B */
    public final C9817ix0 f12070B;

    /* renamed from: B1 */
    public boolean f12071B1;

    /* renamed from: C */
    public C6686qX f12072C;

    /* renamed from: C1 */
    public boolean f12073C1;

    /* renamed from: D */
    public C6686qX f12074D;

    /* renamed from: D1 */
    public boolean f12075D1;

    /* renamed from: E */
    public InterfaceC0715LL f12076E;

    /* renamed from: E1 */
    public long f12077E1;

    /* renamed from: F */
    public InterfaceC0715LL f12078F;

    /* renamed from: F1 */
    public long f12079F1;

    /* renamed from: G */
    public C1537YQ f12080G;

    /* renamed from: G1 */
    public boolean f12081G1;

    /* renamed from: H */
    public MediaCrypto f12082H;

    /* renamed from: H1 */
    public boolean f12083H1;

    /* renamed from: I */
    public final long f12084I;

    /* renamed from: I1 */
    public boolean f12085I1;

    /* renamed from: J */
    public float f12086J;

    /* renamed from: J1 */
    public boolean f12087J1;

    /* renamed from: K */
    public float f12088K;

    /* renamed from: K1 */
    public C0531IQ f12089K1;

    /* renamed from: L */
    public InterfaceC7758Io0 f12090L;

    /* renamed from: L1 */
    public C1398WD f12091L1;

    /* renamed from: M */
    public C6686qX f12092M;

    /* renamed from: M1 */
    public C8330To0 f12093M1;

    /* renamed from: N */
    public MediaFormat f12094N;

    /* renamed from: N1 */
    public long f12095N1;

    /* renamed from: O */
    public boolean f12096O;

    /* renamed from: O1 */
    public boolean f12097O1;

    /* renamed from: P */
    public float f12098P;

    /* renamed from: Q */
    public ArrayDeque f12099Q;

    /* renamed from: R */
    public C8226Ro0 f12100R;

    /* renamed from: S */
    public C8018No0 f12101S;

    /* renamed from: T */
    public int f12102T;

    /* renamed from: U */
    public boolean f12103U;

    /* renamed from: V */
    public boolean f12104V;

    /* renamed from: W */
    public boolean f12105W;

    /* renamed from: X */
    public boolean f12106X;

    /* renamed from: Y */
    public boolean f12107Y;

    /* renamed from: Z */
    public boolean f12108Z;

    /* renamed from: a0 */
    public boolean f12109a0;

    /* renamed from: b0 */
    public boolean f12110b0;

    /* renamed from: c0 */
    public boolean f12111c0;

    /* renamed from: d0 */
    public long f12112d0;

    /* renamed from: e0 */
    public int f12113e0;

    /* renamed from: q1 */
    public int f12114q1;

    /* renamed from: r */
    public final InterfaceC7706Ho0 f12115r;

    /* renamed from: r1 */
    public ByteBuffer f12116r1;

    /* renamed from: s */
    public final C4262il f12117s;

    /* renamed from: s1 */
    public boolean f12118s1;

    /* renamed from: t */
    public final boolean f12119t;

    /* renamed from: t1 */
    public boolean f12120t1;

    /* renamed from: u */
    public final float f12121u;

    /* renamed from: u1 */
    public boolean f12122u1;

    /* renamed from: v */
    public final C1587ZD f12123v;

    /* renamed from: v1 */
    public boolean f12124v1;

    /* renamed from: w */
    public final C1587ZD f12125w;

    /* renamed from: w1 */
    public boolean f12126w1;

    /* renamed from: x */
    public final C1587ZD f12127x;

    /* renamed from: x1 */
    public boolean f12128x1;

    /* renamed from: y */
    public final C1238Tg f12129y;

    /* renamed from: y1 */
    public int f12130y1;

    /* renamed from: z */
    public final MediaCodec.BufferInfo f12131z;

    /* renamed from: z1 */
    public int f12132z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8382Uo0(int i, InterfaceC7706Ho0 interfaceC7706Ho0, boolean z, float f) {
        super(i);
        C4262il c4262il = C4262il.f29439c;
        this.f12115r = interfaceC7706Ho0;
        this.f12117s = c4262il;
        this.f12119t = z;
        this.f12121u = f;
        this.f12123v = new C1587ZD(0);
        this.f12125w = new C1587ZD(0);
        this.f12127x = new C1587ZD(2);
        C1238Tg c1238Tg = new C1238Tg(2);
        c1238Tg.f11466l = 32;
        this.f12129y = c1238Tg;
        this.f12131z = new MediaCodec.BufferInfo();
        this.f12086J = 1.0f;
        this.f12088K = 1.0f;
        this.f12084I = -9223372036854775807L;
        this.f12068A = new ArrayDeque();
        this.f12093M1 = C8330To0.f11523e;
        c1238Tg.m9506v(0);
        c1238Tg.f14798e.order(ByteOrder.nativeOrder());
        C9817ix0 c9817ix0 = new C9817ix0();
        c9817ix0.f34816c = InterfaceC6832sa.f42484a;
        c9817ix0.f34815b = 0;
        c9817ix0.f34814a = 2;
        this.f12070B = c9817ix0;
        this.f12098P = -1.0f;
        this.f12102T = 0;
        this.f12130y1 = 0;
        this.f12113e0 = -1;
        this.f12114q1 = -1;
        this.f12112d0 = -9223372036854775807L;
        this.f12077E1 = -9223372036854775807L;
        this.f12079F1 = -9223372036854775807L;
        this.f12095N1 = -9223372036854775807L;
        this.f12132z1 = 0;
        this.f12069A1 = 0;
        this.f12091L1 = new C1398WD();
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: A */
    public final int mo258A() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:275:0x032a, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0330, code lost:
    
        r26.f12124v1 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:267:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0324  */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m8153B(long r27, long r29) throws p000.C0531IQ {
        /*
            Method dump skipped, instructions count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8382Uo0.m8153B(long, long):boolean");
    }

    /* renamed from: C */
    public abstract C1772bE mo4716C(C8018No0 c8018No0, C6686qX c6686qX, C6686qX c6686qX2);

    /* renamed from: D */
    public C7966Mo0 mo8154D(IllegalStateException illegalStateException, C8018No0 c8018No0) {
        return new C7966Mo0(illegalStateException, c8018No0);
    }

    /* renamed from: E */
    public final void m8155E() {
        this.f12126w1 = false;
        this.f12129y.mo7722t();
        this.f12127x.mo7722t();
        this.f12124v1 = false;
        this.f12122u1 = false;
        C9817ix0 c9817ix0 = this.f12070B;
        c9817ix0.getClass();
        c9817ix0.f34816c = InterfaceC6832sa.f42484a;
        c9817ix0.f34815b = 0;
        c9817ix0.f34814a = 2;
    }

    /* renamed from: F */
    public final boolean m8156F() throws MediaCryptoException, C0531IQ {
        if (this.f12071B1) {
            this.f12132z1 = 1;
            if (this.f12104V || this.f12106X) {
                this.f12069A1 = 3;
                return false;
            }
            this.f12069A1 = 2;
        } else {
            m8180s0();
        }
        return true;
    }

    /* renamed from: G */
    public final boolean m8157G(long j, long j2) throws MediaCryptoException, C0531IQ {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean zMo4728g0;
        ByteBuffer byteBuffer;
        int i;
        int i2;
        long j3;
        boolean z3;
        boolean z4;
        C6686qX c6686qX;
        int iMo4015m;
        InterfaceC7758Io0 interfaceC7758Io0 = this.f12090L;
        interfaceC7758Io0.getClass();
        boolean z5 = this.f12114q1 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f12131z;
        if (!z5) {
            if (this.f12107Y && this.f12073C1) {
                try {
                    iMo4015m = interfaceC7758Io0.mo4015m(bufferInfo2);
                } catch (IllegalStateException unused) {
                    m8171f0();
                    if (this.f12083H1) {
                        m8173i0();
                    }
                    return false;
                }
            } else {
                iMo4015m = interfaceC7758Io0.mo4015m(bufferInfo2);
            }
            if (iMo4015m < 0) {
                if (iMo4015m != -2) {
                    if (this.f12111c0 && (this.f12081G1 || this.f12132z1 == 2)) {
                        m8171f0();
                    }
                    return false;
                }
                this.f12075D1 = true;
                InterfaceC7758Io0 interfaceC7758Io02 = this.f12090L;
                interfaceC7758Io02.getClass();
                MediaFormat mediaFormatMo4011f = interfaceC7758Io02.mo4011f();
                if (this.f12102T != 0 && mediaFormatMo4011f.getInteger(Snapshot.WIDTH) == 32 && mediaFormatMo4011f.getInteger(Snapshot.HEIGHT) == 32) {
                    this.f12110b0 = true;
                } else {
                    this.f12094N = mediaFormatMo4011f;
                    this.f12096O = true;
                }
                return true;
            }
            if (this.f12110b0) {
                this.f12110b0 = false;
                interfaceC7758Io0.mo4016o(iMo4015m, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m8171f0();
                return false;
            }
            this.f12114q1 = iMo4015m;
            ByteBuffer byteBufferMo4020v = interfaceC7758Io0.mo4020v(iMo4015m);
            this.f12116r1 = byteBufferMo4020v;
            if (byteBufferMo4020v != null) {
                byteBufferMo4020v.position(bufferInfo2.offset);
                this.f12116r1.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f12108Z && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0 && this.f12077E1 != -9223372036854775807L) {
                bufferInfo2.presentationTimeUs = this.f12079F1;
            }
            long j4 = bufferInfo2.presentationTimeUs;
            this.f12118s1 = j4 < this.f317l;
            long j5 = this.f12079F1;
            this.f12120t1 = j5 != -9223372036854775807L && j5 <= j4;
            m8181t0(j4);
        }
        if (this.f12107Y && this.f12073C1) {
            try {
                byteBuffer = this.f12116r1;
                i = this.f12114q1;
                i2 = bufferInfo2.flags;
                j3 = bufferInfo2.presentationTimeUs;
                z3 = this.f12118s1;
                z4 = this.f12120t1;
                c6686qX = this.f12074D;
                c6686qX.getClass();
                z = true;
                z2 = false;
            } catch (IllegalStateException unused2) {
                z2 = false;
            }
            try {
                zMo4728g0 = mo4728g0(j, j2, interfaceC7758Io0, byteBuffer, i, i2, 1, j3, z3, z4, c6686qX);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                m8171f0();
                if (this.f12083H1) {
                    m8173i0();
                }
                return z2;
            }
        } else {
            z = true;
            z2 = false;
            ByteBuffer byteBuffer2 = this.f12116r1;
            int i3 = this.f12114q1;
            int i4 = bufferInfo2.flags;
            long j6 = bufferInfo2.presentationTimeUs;
            boolean z6 = this.f12118s1;
            boolean z7 = this.f12120t1;
            C6686qX c6686qX2 = this.f12074D;
            c6686qX2.getClass();
            bufferInfo = bufferInfo2;
            zMo4728g0 = mo4728g0(j, j2, interfaceC7758Io0, byteBuffer2, i3, i4, 1, j6, z6, z7, c6686qX2);
        }
        if (zMo4728g0) {
            mo8168b0(bufferInfo.presentationTimeUs);
            boolean z8 = (bufferInfo.flags & 4) != 0 ? z : z2;
            this.f12114q1 = -1;
            this.f12116r1 = null;
            if (!z8) {
                return z;
            }
            m8171f0();
        }
        return z2;
    }

    /* renamed from: H */
    public final boolean m8158H() throws MediaCryptoException, C0531IQ {
        InterfaceC7758Io0 interfaceC7758Io0 = this.f12090L;
        if (interfaceC7758Io0 == null || this.f12132z1 == 2 || this.f12081G1) {
            return false;
        }
        int i = this.f12113e0;
        C1587ZD c1587zd = this.f12125w;
        if (i < 0) {
            int iMo4013k = interfaceC7758Io0.mo4013k();
            this.f12113e0 = iMo4013k;
            if (iMo4013k < 0) {
                return false;
            }
            c1587zd.f14798e = interfaceC7758Io0.mo4018t(iMo4013k);
            c1587zd.mo7722t();
        }
        if (this.f12132z1 == 1) {
            if (!this.f12111c0) {
                this.f12073C1 = true;
                interfaceC7758Io0.mo4009c(this.f12113e0, 0, 4, 0L);
                this.f12113e0 = -1;
                c1587zd.f14798e = null;
            }
            this.f12132z1 = 2;
            return false;
        }
        if (this.f12109a0) {
            this.f12109a0 = false;
            ByteBuffer byteBuffer = c1587zd.f14798e;
            byteBuffer.getClass();
            byteBuffer.put(f12067P1);
            interfaceC7758Io0.mo4009c(this.f12113e0, 38, 0, 0L);
            this.f12113e0 = -1;
            c1587zd.f14798e = null;
            this.f12071B1 = true;
            return true;
        }
        if (this.f12130y1 == 1) {
            int i2 = 0;
            while (true) {
                C6686qX c6686qX = this.f12092M;
                c6686qX.getClass();
                if (i2 >= c6686qX.f40977p.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f12092M.f40977p.get(i2);
                ByteBuffer byteBuffer2 = c1587zd.f14798e;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i2++;
            }
            this.f12130y1 = 2;
        }
        ByteBuffer byteBuffer3 = c1587zd.f14798e;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        C0827N8 c0827n8 = this.f308c;
        c0827n8.m5557f();
        try {
            int iM275u = m275u(c0827n8, c1587zd, 0);
            if (iM275u == -3) {
                if (m264j()) {
                    this.f12079F1 = this.f12077E1;
                }
                return false;
            }
            if (iM275u == -5) {
                if (this.f12130y1 == 2) {
                    c1587zd.mo7722t();
                    this.f12130y1 = 1;
                }
                mo4724Y(c0827n8);
                return true;
            }
            if (c1587zd.m2501g(4)) {
                this.f12079F1 = this.f12077E1;
                if (this.f12130y1 == 2) {
                    c1587zd.mo7722t();
                    this.f12130y1 = 1;
                }
                this.f12081G1 = true;
                if (!this.f12071B1) {
                    m8171f0();
                    return false;
                }
                try {
                    if (!this.f12111c0) {
                        this.f12073C1 = true;
                        interfaceC7758Io0.mo4009c(this.f12113e0, 0, 4, 0L);
                        this.f12113e0 = -1;
                        c1587zd.f14798e = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw m260f(e, this.f12072C, false, AbstractC7485Dh1.m1837v(e.getErrorCode()));
                }
            }
            if (!this.f12071B1 && !c1587zd.m2501g(1)) {
                c1587zd.mo7722t();
                if (this.f12130y1 == 2) {
                    this.f12130y1 = 1;
                }
                return true;
            }
            boolean zM2501g = c1587zd.m2501g(1073741824);
            if (zM2501g) {
                C6536oB c6536oB = c1587zd.f14797d;
                if (iPosition == 0) {
                    c6536oB.getClass();
                } else {
                    if (c6536oB.f38856d == null) {
                        int[] iArr = new int[1];
                        c6536oB.f38856d = iArr;
                        c6536oB.f38861i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = c6536oB.f38856d;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.f12103U && !zM2501g) {
                ByteBuffer byteBuffer4 = c1587zd.f14798e;
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
                ByteBuffer byteBuffer5 = c1587zd.f14798e;
                byteBuffer5.getClass();
                if (byteBuffer5.position() == 0) {
                    return true;
                }
                this.f12103U = false;
            }
            long j = c1587zd.f14800g;
            if (this.f12085I1) {
                ArrayDeque arrayDeque = this.f12068A;
                if (arrayDeque.isEmpty()) {
                    C0577J9 c0577j9 = this.f12093M1.f11527d;
                    C6686qX c6686qX2 = this.f12072C;
                    c6686qX2.getClass();
                    c0577j9.m4221a(j, c6686qX2);
                } else {
                    C0577J9 c0577j92 = ((C8330To0) arrayDeque.peekLast()).f11527d;
                    C6686qX c6686qX3 = this.f12072C;
                    c6686qX3.getClass();
                    c0577j92.m4221a(j, c6686qX3);
                }
                this.f12085I1 = false;
            }
            this.f12077E1 = Math.max(this.f12077E1, j);
            if (m264j() || c1587zd.m2501g(536870912)) {
                this.f12079F1 = this.f12077E1;
            }
            c1587zd.m9507w();
            if (c1587zd.m2501g(268435456)) {
                mo4720Q(c1587zd);
            }
            mo8169d0(c1587zd);
            int iMo8162L = mo8162L(c1587zd);
            try {
                if (zM2501g) {
                    interfaceC7758Io0.mo4008b(this.f12113e0, c1587zd.f14797d, j, iMo8162L);
                } else {
                    int i7 = this.f12113e0;
                    ByteBuffer byteBuffer6 = c1587zd.f14798e;
                    byteBuffer6.getClass();
                    interfaceC7758Io0.mo4009c(i7, byteBuffer6.limit(), iMo8162L, j);
                }
                this.f12113e0 = -1;
                c1587zd.f14798e = null;
                this.f12071B1 = true;
                this.f12130y1 = 0;
                this.f12091L1.f13067c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw m260f(e2, this.f12072C, false, AbstractC7485Dh1.m1837v(e2.getErrorCode()));
            }
        } catch (C1524YD e3) {
            mo4721V(e3);
            m8172h0(0);
            m8159I();
            return true;
        }
    }

    /* renamed from: I */
    public final void m8159I() {
        try {
            InterfaceC7758Io0 interfaceC7758Io0 = this.f12090L;
            YN1.m9283h(interfaceC7758Io0);
            interfaceC7758Io0.flush();
        } finally {
            mo8174k0();
        }
    }

    /* renamed from: J */
    public final boolean m8160J() throws MediaCryptoException {
        if (this.f12090L == null) {
            return false;
        }
        int i = this.f12069A1;
        if (i == 3 || this.f12104V || ((this.f12105W && !this.f12075D1) || (this.f12106X && this.f12073C1))) {
            m8173i0();
            return true;
        }
        if (i == 2) {
            int i2 = AbstractC7485Dh1.f2166a;
            YN1.m9281f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m8180s0();
                } catch (C0531IQ e) {
                    AbstractC10872rA1.m24176i("Failed to update the DRM session, releasing the codec instead.", e);
                    m8173i0();
                    return true;
                }
            }
        }
        m8159I();
        return false;
    }

    /* renamed from: K */
    public final List m8161K(boolean z) {
        C6686qX c6686qX = this.f12072C;
        c6686qX.getClass();
        C4262il c4262il = this.f12117s;
        ArrayList arrayListMo4718O = mo4718O(c4262il, c6686qX, z);
        if (arrayListMo4718O.isEmpty() && z) {
            arrayListMo4718O = mo4718O(c4262il, c6686qX, false);
            if (!arrayListMo4718O.isEmpty()) {
                AbstractC10872rA1.m24175h("Drm session requires secure decoder for " + c6686qX.f40974m + ", but no secure decoder available. Trying to proceed with " + arrayListMo4718O + ".");
            }
        }
        return arrayListMo4718O;
    }

    /* renamed from: L */
    public int mo8162L(C1587ZD c1587zd) {
        return 0;
    }

    /* renamed from: M */
    public boolean mo8163M() {
        return false;
    }

    /* renamed from: N */
    public abstract float mo4717N(float f, C6686qX[] c6686qXArr);

    /* renamed from: O */
    public abstract ArrayList mo4718O(C4262il c4262il, C6686qX c6686qX, boolean z);

    /* renamed from: P */
    public abstract C7654Go0 mo4719P(C8018No0 c8018No0, C6686qX c6686qX, MediaCrypto mediaCrypto, float f);

    /* renamed from: Q */
    public abstract void mo4720Q(C1587ZD c1587zd);

    /* JADX WARN: Removed duplicated region for block: B:188:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01f0  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8164R(p000.C8018No0 r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8382Uo0.m8164R(No0, android.media.MediaCrypto):void");
    }

    /* renamed from: S */
    public final boolean m8165S(long j, long j2) {
        C6686qX c6686qX;
        return j2 < j && ((c6686qX = this.f12074D) == null || !Objects.equals(c6686qX.f40974m, "audio/opus") || j - j2 > 80000);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00b2 A[Catch: Ro0 -> 0x00bc, TryCatch #1 {Ro0 -> 0x00bc, blocks: (B:138:0x00ae, B:140:0x00b2, B:146:0x00bf), top: B:158:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00be  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8166T() throws p000.C0531IQ {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8382Uo0.m8166T():void");
    }

    /* renamed from: U */
    public final void m8167U(MediaCrypto mediaCrypto, boolean z) throws C8226Ro0 {
        String diagnosticInfo;
        C6686qX c6686qX = this.f12072C;
        c6686qX.getClass();
        if (this.f12099Q == null) {
            try {
                List listM8161K = m8161K(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f12099Q = arrayDeque;
                if (this.f12119t) {
                    arrayDeque.addAll(listM8161K);
                } else if (!listM8161K.isEmpty()) {
                    this.f12099Q.add((C8018No0) listM8161K.get(0));
                }
                this.f12100R = null;
            } catch (C8486Wo0 e) {
                throw new C8226Ro0(c6686qX, e, z, -49998);
            }
        }
        if (this.f12099Q.isEmpty()) {
            throw new C8226Ro0(c6686qX, null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.f12099Q;
        arrayDeque2.getClass();
        while (this.f12090L == null) {
            C8018No0 c8018No0 = (C8018No0) arrayDeque2.peekFirst();
            c8018No0.getClass();
            if (!mo8178o0(c8018No0)) {
                return;
            }
            try {
                m8164R(c8018No0, mediaCrypto);
            } catch (Exception e2) {
                AbstractC10872rA1.m24176i("Failed to initialize decoder: " + c8018No0, e2);
                arrayDeque2.removeFirst();
                String str = "Decoder init failed: " + c8018No0.f8009a + ", " + c6686qX;
                if (AbstractC7485Dh1.f2166a >= 21) {
                    diagnosticInfo = e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null;
                } else {
                    diagnosticInfo = null;
                }
                C8226Ro0 c8226Ro0 = new C8226Ro0(str, e2, c6686qX.f40974m, z, c8018No0, diagnosticInfo);
                mo4721V(c8226Ro0);
                C8226Ro0 c8226Ro02 = this.f12100R;
                if (c8226Ro02 == null) {
                    this.f12100R = c8226Ro0;
                } else {
                    this.f12100R = new C8226Ro0(c8226Ro02.getMessage(), c8226Ro02.getCause(), c8226Ro02.f10429a, c8226Ro02.f10430b, c8226Ro02.f10431c, c8226Ro02.f10432d);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f12100R;
                }
            }
        }
        this.f12099Q = null;
    }

    /* renamed from: V */
    public abstract void mo4721V(Exception exc);

    /* renamed from: W */
    public abstract void mo4722W(long j, long j2, String str);

    /* renamed from: X */
    public abstract void mo4723X(String str);

    /* JADX WARN: Code restructure failed: missing block: B:195:0x00cf, code lost:
    
        if (r4.mo4953f(r3) != false) goto L270;
     */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0100  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.C1772bE mo4724Y(p000.C0827N8 r13) throws p000.C0531IQ {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8382Uo0.mo4724Y(N8):bE");
    }

    /* renamed from: Z */
    public abstract void mo4725Z(C6686qX c6686qX, MediaFormat mediaFormat);

    /* renamed from: b0 */
    public void mo8168b0(long j) {
        this.f12095N1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.f12068A;
            if (arrayDeque.isEmpty() || j < ((C8330To0) arrayDeque.peek()).f11524a) {
                return;
            }
            C8330To0 c8330To0 = (C8330To0) arrayDeque.poll();
            c8330To0.getClass();
            m8177n0(c8330To0);
            mo4727c0();
        }
    }

    /* renamed from: c0 */
    public abstract void mo4727c0();

    /* renamed from: f0 */
    public final void m8171f0() throws MediaCryptoException, C0531IQ {
        int i = this.f12069A1;
        if (i == 1) {
            m8159I();
            return;
        }
        if (i == 2) {
            m8159I();
            m8180s0();
        } else if (i != 3) {
            this.f12083H1 = true;
            mo4729j0();
        } else {
            m8173i0();
            m8166T();
        }
    }

    /* renamed from: g0 */
    public abstract boolean mo4728g0(long j, long j2, InterfaceC7758Io0 interfaceC7758Io0, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6686qX c6686qX);

    /* renamed from: h0 */
    public final boolean m8172h0(int i) throws MediaCryptoException, C0531IQ {
        C0827N8 c0827n8 = this.f308c;
        c0827n8.m5557f();
        C1587ZD c1587zd = this.f12123v;
        c1587zd.mo7722t();
        int iM275u = m275u(c0827n8, c1587zd, i | 4);
        if (iM275u == -5) {
            mo4724Y(c0827n8);
            return true;
        }
        if (iM275u != -4 || !c1587zd.m2501g(4)) {
            return false;
        }
        this.f12081G1 = true;
        m8171f0();
        return false;
    }

    /* renamed from: i0 */
    public final void m8173i0() {
        try {
            InterfaceC7758Io0 interfaceC7758Io0 = this.f12090L;
            if (interfaceC7758Io0 != null) {
                interfaceC7758Io0.release();
                this.f12091L1.f13066b++;
                C8018No0 c8018No0 = this.f12101S;
                c8018No0.getClass();
                mo4723X(c8018No0.f8009a);
            }
            this.f12090L = null;
            try {
                MediaCrypto mediaCrypto = this.f12082H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f12090L = null;
            try {
                MediaCrypto mediaCrypto2 = this.f12082H;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: k0 */
    public void mo8174k0() {
        this.f12113e0 = -1;
        this.f12125w.f14798e = null;
        this.f12114q1 = -1;
        this.f12116r1 = null;
        this.f12112d0 = -9223372036854775807L;
        this.f12073C1 = false;
        this.f12071B1 = false;
        this.f12109a0 = false;
        this.f12110b0 = false;
        this.f12118s1 = false;
        this.f12120t1 = false;
        this.f12077E1 = -9223372036854775807L;
        this.f12079F1 = -9223372036854775807L;
        this.f12095N1 = -9223372036854775807L;
        this.f12132z1 = 0;
        this.f12069A1 = 0;
        this.f12130y1 = this.f12128x1 ? 1 : 0;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: l */
    public boolean mo266l() {
        boolean zMo37f;
        if (this.f12072C == null) {
            return false;
        }
        if (m264j()) {
            zMo37f = this.f319n;
        } else {
            InterfaceC9121dV0 interfaceC9121dV0 = this.f314i;
            interfaceC9121dV0.getClass();
            zMo37f = interfaceC9121dV0.mo37f();
        }
        if (!zMo37f) {
            if (!(this.f12114q1 >= 0)) {
                if (this.f12112d0 == -9223372036854775807L) {
                    return false;
                }
                this.f312g.getClass();
                if (SystemClock.elapsedRealtime() >= this.f12112d0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: l0 */
    public final void m8175l0() {
        mo8174k0();
        this.f12089K1 = null;
        this.f12099Q = null;
        this.f12101S = null;
        this.f12092M = null;
        this.f12094N = null;
        this.f12096O = false;
        this.f12075D1 = false;
        this.f12098P = -1.0f;
        this.f12102T = 0;
        this.f12103U = false;
        this.f12104V = false;
        this.f12105W = false;
        this.f12106X = false;
        this.f12107Y = false;
        this.f12108Z = false;
        this.f12111c0 = false;
        this.f12128x1 = false;
        this.f12130y1 = 0;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: m */
    public void mo267m() throws MediaCryptoException {
        this.f12072C = null;
        m8177n0(C8330To0.f11523e);
        this.f12068A.clear();
        m8160J();
    }

    /* renamed from: m0 */
    public final void m8176m0(InterfaceC0715LL interfaceC0715LL) {
        InterfaceC0715LL interfaceC0715LL2 = this.f12076E;
        if (interfaceC0715LL2 != interfaceC0715LL) {
            if (interfaceC0715LL != null) {
                interfaceC0715LL.mo4952e(null);
            }
            if (interfaceC0715LL2 != null) {
                interfaceC0715LL2.mo4951d(null);
            }
        }
        this.f12076E = interfaceC0715LL;
    }

    /* renamed from: n0 */
    public final void m8177n0(C8330To0 c8330To0) {
        this.f12093M1 = c8330To0;
        if (c8330To0.f11526c != -9223372036854775807L) {
            this.f12097O1 = true;
            mo4726a0();
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: o */
    public void mo269o(long j, boolean z) throws C0531IQ {
        this.f12081G1 = false;
        this.f12083H1 = false;
        this.f12087J1 = false;
        if (this.f12122u1) {
            this.f12129y.mo7722t();
            this.f12127x.mo7722t();
            this.f12124v1 = false;
            C9817ix0 c9817ix0 = this.f12070B;
            c9817ix0.getClass();
            c9817ix0.f34816c = InterfaceC6832sa.f42484a;
            c9817ix0.f34815b = 0;
            c9817ix0.f34814a = 2;
        } else if (m8160J()) {
            m8166T();
        }
        if (this.f12093M1.f11527d.m4230t() > 0) {
            this.f12085I1 = true;
        }
        this.f12093M1.f11527d.m4222b();
        this.f12068A.clear();
    }

    /* renamed from: o0 */
    public boolean mo8178o0(C8018No0 c8018No0) {
        return true;
    }

    /* renamed from: p0 */
    public boolean mo4730p0(C6686qX c6686qX) {
        return false;
    }

    /* renamed from: q0 */
    public abstract int mo4731q0(C4262il c4262il, C6686qX c6686qX);

    /* renamed from: r0 */
    public final boolean m8179r0(C6686qX c6686qX) throws C0531IQ {
        if (AbstractC7485Dh1.f2166a >= 23 && this.f12090L != null && this.f12069A1 != 3 && this.f313h != 0) {
            float f = this.f12088K;
            c6686qX.getClass();
            C6686qX[] c6686qXArr = this.f315j;
            c6686qXArr.getClass();
            float fMo4717N = mo4717N(f, c6686qXArr);
            float f2 = this.f12098P;
            if (f2 == fMo4717N) {
                return true;
            }
            if (fMo4717N == -1.0f) {
                if (this.f12071B1) {
                    this.f12132z1 = 1;
                    this.f12069A1 = 3;
                    return false;
                }
                m8173i0();
                m8166T();
                return false;
            }
            if (f2 == -1.0f && fMo4717N <= this.f12121u) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fMo4717N);
            InterfaceC7758Io0 interfaceC7758Io0 = this.f12090L;
            interfaceC7758Io0.getClass();
            interfaceC7758Io0.mo4007a(bundle);
            this.f12098P = fMo4717N;
        }
        return true;
    }

    /* renamed from: s0 */
    public final void m8180s0() throws MediaCryptoException, C0531IQ {
        InterfaceC0715LL interfaceC0715LL = this.f12078F;
        interfaceC0715LL.getClass();
        InterfaceC6410mB interfaceC6410mBMo4954g = interfaceC0715LL.mo4954g();
        if (interfaceC6410mBMo4954g instanceof C1167SY) {
            try {
                MediaCrypto mediaCrypto = this.f12082H;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((C1167SY) interfaceC6410mBMo4954g).f10848b);
            } catch (MediaCryptoException e) {
                throw m260f(e, this.f12072C, false, AuthCode.StatusCode.PERMISSION_EXPIRED);
            }
        }
        m8176m0(this.f12078F);
        this.f12132z1 = 0;
        this.f12069A1 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0036, code lost:
    
        if (r7 >= r5) goto L34;
     */
    @Override // p000.AbstractC0043Ag
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo274t(p000.C6686qX[] r13, long r14, long r16) {
        /*
            r12 = this;
            r0 = r12
            To0 r1 = r0.f12093M1
            long r1 = r1.f11526c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            To0 r1 = new To0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.m8177n0(r1)
            goto L63
        L20:
            java.util.ArrayDeque r1 = r0.f12068A
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L55
            long r5 = r0.f12077E1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L38
            long r7 = r0.f12095N1
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
            r12.m8177n0(r1)
            To0 r1 = r0.f12093M1
            long r1 = r1.f11526c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L63
            r12.mo4727c0()
            goto L63
        L55:
            To0 r9 = new To0
            long r3 = r0.f12077E1
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8382Uo0.mo274t(qX[], long, long):void");
    }

    /* renamed from: t0 */
    public final void m8181t0(long j) {
        C6686qX c6686qX = (C6686qX) this.f12093M1.f11527d.m4227q(j);
        if (c6686qX == null && this.f12097O1 && this.f12094N != null) {
            c6686qX = (C6686qX) this.f12093M1.f11527d.m4226p();
        }
        if (c6686qX != null) {
            this.f12074D = c6686qX;
        } else if (!this.f12096O || this.f12074D == null) {
            return;
        }
        C6686qX c6686qX2 = this.f12074D;
        c6686qX2.getClass();
        mo4725Z(c6686qX2, this.f12094N);
        this.f12096O = false;
        this.f12097O1 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0075 A[LOOP:1: B:121:0x0050->B:131:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0096 A[LOOP:2: B:132:0x0076->B:142:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0076 A[EDGE_INSN: B:179:0x0076->B:183:? BREAK  A[LOOP:1: B:121:0x0050->B:131:0x0075], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0097 A[EDGE_INSN: B:182:0x0097->B:143:0x0097 BREAK  A[LOOP:2: B:132:0x0076->B:142:0x0096], SYNTHETIC] */
    @Override // p000.AbstractC0043Ag
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo276v(long r12, long r14) throws android.media.MediaCryptoException, p000.C0531IQ {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8382Uo0.mo276v(long, long):void");
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: y */
    public void mo279y(float f, float f2) throws C0531IQ {
        this.f12086J = f;
        this.f12088K = f2;
        m8179r0(this.f12092M);
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: z */
    public final int mo280z(C6686qX c6686qX) throws C0531IQ {
        try {
            return mo4731q0(this.f12117s, c6686qX);
        } catch (C8486Wo0 e) {
            throw m260f(e, c6686qX, false, 4002);
        }
    }

    /* renamed from: a0 */
    public void mo4726a0() {
    }

    /* renamed from: j0 */
    public void mo4729j0() {
    }

    /* renamed from: d0 */
    public void mo8169d0(C1587ZD c1587zd) {
    }

    /* renamed from: e0 */
    public void mo8170e0(C6686qX c6686qX) {
    }
}
