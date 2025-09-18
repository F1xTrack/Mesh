package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinVersion;

/* renamed from: uo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7481uo0 implements WR {
    public static final byte[] e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f0;
    public static final byte[] g0;
    public static final byte[] h0;
    public static final UUID i0;
    public static final Map j0;
    public boolean A;
    public long B;
    public long C;
    public long D;
    public C1204Pf E;
    public C1204Pf F;
    public boolean G;
    public boolean H;
    public int I;
    public long J;
    public long K;
    public int L;
    public int M;
    public int[] N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public long T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final C6612qF a;
    public int a0;
    public final C4206hi1 b;
    public byte b0;
    public final SparseArray c;
    public boolean c0;
    public final boolean d;
    public YR d0;
    public final boolean e;
    public final InterfaceC2453c61 f;
    public final C4103hA0 g;
    public final C4103hA0 h;
    public final C4103hA0 i;
    public final C4103hA0 j;
    public final C4103hA0 k;
    public final C4103hA0 l;
    public final C4103hA0 m;
    public final C4103hA0 n;
    public final C4103hA0 o;
    public final C4103hA0 p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public C7290to0 w;
    public boolean x;
    public int y;
    public long z;

    static {
        int i = AbstractC0277Dh1.a;
        f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AbstractC8250yr.c);
        g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        AbstractC1705Vq.n(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC1705Vq.n(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        j0 = Collections.unmodifiableMap(map);
    }

    public C7481uo0(InterfaceC2453c61 interfaceC2453c61, int i) {
        C6612qF c6612qF = new C6612qF();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.B = -1L;
        this.C = -1L;
        this.D = -9223372036854775807L;
        this.a = c6612qF;
        c6612qF.d = new C3866fw1(22, this);
        this.f = interfaceC2453c61;
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new C4206hi1();
        this.c = new SparseArray();
        this.i = new C4103hA0(4);
        this.j = new C4103hA0(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new C4103hA0(4);
        this.g = new C4103hA0(TA1.a);
        this.h = new C4103hA0(4);
        this.l = new C4103hA0();
        this.m = new C4103hA0();
        this.n = new C4103hA0(8);
        this.o = new C4103hA0();
        this.p = new C4103hA0();
        this.N = new int[1];
    }

    public static byte[] i(long j, long j2, String str) {
        YN1.c(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = AbstractC0277Dh1.a;
        return str2.getBytes(AbstractC8250yr.c);
    }

    public final void a(int i) {
        if (this.E == null || this.F == null) {
            throw C5643lA0.a(null, "Element " + i + " must be in a Cues");
        }
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    public final void c(int i) {
        if (this.w != null) {
            return;
        }
        throw C5643lA0.a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0491 A[PHI: r35
  0x0491: PHI (r35v37 java.lang.String) = 
  (r35v3 java.lang.String)
  (r35v4 java.lang.String)
  (r35v5 java.lang.String)
  (r35v6 java.lang.String)
  (r35v7 java.lang.String)
  (r35v8 java.lang.String)
  (r35v9 java.lang.String)
  (r35v10 java.lang.String)
  (r35v11 java.lang.String)
  (r35v12 java.lang.String)
  (r35v13 java.lang.String)
  (r35v14 java.lang.String)
  (r35v15 java.lang.String)
  (r35v16 java.lang.String)
  (r35v17 java.lang.String)
  (r35v18 java.lang.String)
  (r35v19 java.lang.String)
  (r35v20 java.lang.String)
  (r35v21 java.lang.String)
  (r35v22 java.lang.String)
  (r35v23 java.lang.String)
  (r35v24 java.lang.String)
  (r35v25 java.lang.String)
  (r35v26 java.lang.String)
  (r35v27 java.lang.String)
  (r35v28 java.lang.String)
  (r35v29 java.lang.String)
  (r35v30 java.lang.String)
  (r35v31 java.lang.String)
  (r35v32 java.lang.String)
  (r35v33 java.lang.String)
  (r35v34 java.lang.String)
  (r35v38 java.lang.String)
 binds: [B:365:0x0678, B:361:0x066d, B:357:0x0662, B:353:0x0657, B:349:0x064c, B:345:0x0641, B:341:0x0636, B:337:0x0629, B:333:0x0619, B:329:0x0609, B:325:0x05f9, B:321:0x05e9, B:317:0x05d9, B:313:0x05c9, B:309:0x05b9, B:305:0x05a9, B:301:0x0599, B:297:0x0589, B:293:0x0579, B:289:0x0569, B:285:0x0559, B:281:0x0549, B:277:0x0539, B:273:0x0529, B:269:0x0519, B:265:0x0509, B:261:0x04f9, B:257:0x04e9, B:253:0x04d9, B:249:0x04c9, B:245:0x04b9, B:241:0x04a9, B:234:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0adc  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0af3  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0af5  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0b15  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0ceb  */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, to0] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v26, types: [vF] */
    @Override // defpackage.WR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.XR r48, defpackage.SV r49) throws defpackage.C5643lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 5240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7481uo0.d(XR, SV):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.C7290to0 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7481uo0.e(to0, long, int, int, int):void");
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) throws EOFException, InterruptedIOException {
        C1204Pf c1204Pf = new C1204Pf(18, (byte) 0);
        C7566vF c7566vF = (C7566vF) xr;
        long j = c7566vF.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        C4103hA0 c4103hA0 = (C4103hA0) c1204Pf.c;
        c7566vF.f(c4103hA0.a, 0, 4, false);
        c1204Pf.b = 4;
        for (long jW = c4103hA0.w(); jW != 440786851; jW = ((jW << 8) & (-256)) | (c4103hA0.a[0] & 255)) {
            int i2 = c1204Pf.b + 1;
            c1204Pf.b = i2;
            if (i2 == i) {
                return false;
            }
            c7566vF.f(c4103hA0.a, 0, 1, false);
        }
        long jQ = c1204Pf.q(c7566vF);
        long j3 = c1204Pf.b;
        if (jQ == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + jQ >= j) {
            return false;
        }
        while (true) {
            long j4 = c1204Pf.b;
            long j5 = j3 + jQ;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (c1204Pf.q(c7566vF) == Long.MIN_VALUE) {
                return false;
            }
            long jQ2 = c1204Pf.q(c7566vF);
            if (jQ2 < 0 || jQ2 > 2147483647L) {
                return false;
            }
            if (jQ2 != 0) {
                int i3 = (int) jQ2;
                c7566vF.a(i3, false);
                c1204Pf.b += i3;
            }
        }
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        this.D = -9223372036854775807L;
        this.I = 0;
        C6612qF c6612qF = this.a;
        c6612qF.e = 0;
        c6612qF.b.clear();
        C4206hi1 c4206hi1 = c6612qF.c;
        c4206hi1.a = 0;
        c4206hi1.b = 0;
        C4206hi1 c4206hi12 = this.b;
        c4206hi12.a = 0;
        c4206hi12.b = 0;
        k();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            C4000gd1 c4000gd1 = ((C7290to0) sparseArray.valueAt(i)).U;
            if (c4000gd1 != null) {
                c4000gd1.b = false;
                c4000gd1.c = 0;
            }
            i++;
        }
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    public final void j(C7566vF c7566vF, int i) {
        C4103hA0 c4103hA0 = this.i;
        if (c4103hA0.c >= i) {
            return;
        }
        byte[] bArr = c4103hA0.a;
        if (bArr.length < i) {
            c4103hA0.b(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = c4103hA0.a;
        int i2 = c4103hA0.c;
        c7566vF.b(bArr2, i2, i - i2, false);
        c4103hA0.F(i);
    }

    public final void k() {
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = 0;
        this.b0 = (byte) 0;
        this.c0 = false;
        this.l.D(0);
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        this.d0 = yr;
        if (this.e) {
            yr = new C5772lr0(yr, this.f);
        }
        this.d0 = yr;
    }

    public final long m(long j) throws C5643lA0 {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw C5643lA0.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i = AbstractC0277Dh1.a;
        return AbstractC0277Dh1.Y(j, j2, 1000L, RoundingMode.FLOOR);
    }

    public final int n(C7566vF c7566vF, C7290to0 c7290to0, int i, boolean z) throws C5643lA0, EOFException, InterruptedIOException {
        int iE;
        int iE2;
        int i2;
        if ("S_TEXT/UTF8".equals(c7290to0.b)) {
            o(c7566vF, e0, i);
            int i3 = this.V;
            k();
            return i3;
        }
        if ("S_TEXT/ASS".equals(c7290to0.b)) {
            o(c7566vF, g0, i);
            int i4 = this.V;
            k();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(c7290to0.b)) {
            o(c7566vF, h0, i);
            int i5 = this.V;
            k();
            return i5;
        }
        InterfaceC1584Ub1 interfaceC1584Ub1 = c7290to0.Y;
        boolean z2 = this.X;
        C4103hA0 c4103hA0 = this.l;
        if (!z2) {
            boolean z3 = c7290to0.h;
            C4103hA0 c4103hA02 = this.i;
            if (z3) {
                this.Q &= -1073741825;
                if (!this.Y) {
                    c7566vF.b(c4103hA02.a, 0, 1, false);
                    this.U++;
                    byte b = c4103hA02.a[0];
                    if ((b & 128) == 128) {
                        throw C5643lA0.a(null, "Extension bit is set in signal byte");
                    }
                    this.b0 = b;
                    this.Y = true;
                }
                byte b2 = this.b0;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.Q |= 1073741824;
                    if (!this.c0) {
                        C4103hA0 c4103hA03 = this.n;
                        c7566vF.b(c4103hA03.a, 0, 8, false);
                        this.U += 8;
                        this.c0 = true;
                        c4103hA02.a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        c4103hA02.G(0);
                        interfaceC1584Ub1.b(c4103hA02, 1, 1);
                        this.V++;
                        c4103hA03.G(0);
                        interfaceC1584Ub1.b(c4103hA03, 8, 1);
                        this.V += 8;
                    }
                    if (z4) {
                        if (!this.Z) {
                            c7566vF.b(c4103hA02.a, 0, 1, false);
                            this.U++;
                            c4103hA02.G(0);
                            this.a0 = c4103hA02.u();
                            this.Z = true;
                        }
                        int i6 = this.a0 * 4;
                        c4103hA02.D(i6);
                        c7566vF.b(c4103hA02.a, 0, i6, false);
                        this.U += i6;
                        short s = (short) ((this.a0 / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.q = ByteBuffer.allocate(i7);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.a0;
                            if (i8 >= i2) {
                                break;
                            }
                            int iY = c4103hA02.y();
                            if (i8 % 2 == 0) {
                                this.q.putShort((short) (iY - i9));
                            } else {
                                this.q.putInt(iY - i9);
                            }
                            i8++;
                            i9 = iY;
                        }
                        int i10 = (i - this.U) - i9;
                        if (i2 % 2 == 1) {
                            this.q.putInt(i10);
                        } else {
                            this.q.putShort((short) i10);
                            this.q.putInt(0);
                        }
                        byte[] bArrArray = this.q.array();
                        C4103hA0 c4103hA04 = this.o;
                        c4103hA04.E(i7, bArrArray);
                        interfaceC1584Ub1.b(c4103hA04, i7, 1);
                        this.V += i7;
                    }
                }
            } else {
                byte[] bArr = c7290to0.i;
                if (bArr != null) {
                    c4103hA0.E(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(c7290to0.b) ? z : c7290to0.f > 0) {
                this.Q |= 268435456;
                this.p.D(0);
                int i11 = (c4103hA0.c + i) - this.U;
                c4103hA02.D(4);
                byte[] bArr2 = c4103hA02.a;
                bArr2[0] = (byte) ((i11 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[1] = (byte) ((i11 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[2] = (byte) ((i11 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[3] = (byte) (i11 & KotlinVersion.MAX_COMPONENT_VALUE);
                interfaceC1584Ub1.b(c4103hA02, 4, 2);
                this.V += 4;
            }
            this.X = true;
        }
        int i12 = i + c4103hA0.c;
        if (!"V_MPEG4/ISO/AVC".equals(c7290to0.b) && !"V_MPEGH/ISO/HEVC".equals(c7290to0.b)) {
            if (c7290to0.U != null) {
                YN1.f(c4103hA0.c == 0);
                c7290to0.U.c(c7566vF);
            }
            while (true) {
                int i13 = this.U;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                int iA = c4103hA0.a();
                if (iA > 0) {
                    iE2 = Math.min(i14, iA);
                    interfaceC1584Ub1.d(iE2, c4103hA0);
                } else {
                    iE2 = interfaceC1584Ub1.e(c7566vF, i14, false);
                }
                this.U += iE2;
                this.V += iE2;
            }
        } else {
            C4103hA0 c4103hA05 = this.h;
            byte[] bArr3 = c4103hA05.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i15 = c7290to0.Z;
            int i16 = 4 - i15;
            while (this.U < i12) {
                int i17 = this.W;
                if (i17 == 0) {
                    int iMin = Math.min(i15, c4103hA0.a());
                    c7566vF.b(bArr3, i16 + iMin, i15 - iMin, false);
                    if (iMin > 0) {
                        c4103hA0.e(bArr3, i16, iMin);
                    }
                    this.U += i15;
                    c4103hA05.G(0);
                    this.W = c4103hA05.y();
                    C4103hA0 c4103hA06 = this.g;
                    c4103hA06.G(0);
                    interfaceC1584Ub1.d(4, c4103hA06);
                    this.V += 4;
                } else {
                    int iA2 = c4103hA0.a();
                    if (iA2 > 0) {
                        iE = Math.min(i17, iA2);
                        interfaceC1584Ub1.d(iE, c4103hA0);
                    } else {
                        iE = interfaceC1584Ub1.e(c7566vF, i17, false);
                    }
                    this.U += iE;
                    this.V += iE;
                    this.W -= iE;
                }
            }
        }
        if ("A_VORBIS".equals(c7290to0.b)) {
            C4103hA0 c4103hA07 = this.j;
            c4103hA07.G(0);
            interfaceC1584Ub1.d(4, c4103hA07);
            this.V += 4;
        }
        int i18 = this.V;
        k();
        return i18;
    }

    public final void o(C7566vF c7566vF, byte[] bArr, int i) throws EOFException, InterruptedIOException {
        int length = bArr.length + i;
        C4103hA0 c4103hA0 = this.m;
        byte[] bArr2 = c4103hA0.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            c4103hA0.E(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c7566vF.b(c4103hA0.a, bArr.length, i, false);
        c4103hA0.G(0);
        c4103hA0.F(length);
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
