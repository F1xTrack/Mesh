package p000;

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

/* renamed from: uo0 */
/* loaded from: classes.dex */
public final class C11335uo0 implements InterfaceC1412WR {

    /* renamed from: e0 */
    public static final byte[] f43865e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: f0 */
    public static final byte[] f43866f0;

    /* renamed from: g0 */
    public static final byte[] f43867g0;

    /* renamed from: h0 */
    public static final byte[] f43868h0;

    /* renamed from: i0 */
    public static final UUID f43869i0;

    /* renamed from: j0 */
    public static final Map f43870j0;

    /* renamed from: A */
    public boolean f43871A;

    /* renamed from: B */
    public long f43872B;

    /* renamed from: C */
    public long f43873C;

    /* renamed from: D */
    public long f43874D;

    /* renamed from: E */
    public C0986Pf f43875E;

    /* renamed from: F */
    public C0986Pf f43876F;

    /* renamed from: G */
    public boolean f43877G;

    /* renamed from: H */
    public boolean f43878H;

    /* renamed from: I */
    public int f43879I;

    /* renamed from: J */
    public long f43880J;

    /* renamed from: K */
    public long f43881K;

    /* renamed from: L */
    public int f43882L;

    /* renamed from: M */
    public int f43883M;

    /* renamed from: N */
    public int[] f43884N;

    /* renamed from: O */
    public int f43885O;

    /* renamed from: P */
    public int f43886P;

    /* renamed from: Q */
    public int f43887Q;

    /* renamed from: R */
    public int f43888R;

    /* renamed from: S */
    public boolean f43889S;

    /* renamed from: T */
    public long f43890T;

    /* renamed from: U */
    public int f43891U;

    /* renamed from: V */
    public int f43892V;

    /* renamed from: W */
    public int f43893W;

    /* renamed from: X */
    public boolean f43894X;

    /* renamed from: Y */
    public boolean f43895Y;

    /* renamed from: Z */
    public boolean f43896Z;

    /* renamed from: a */
    public final C6668qF f43897a;

    /* renamed from: a0 */
    public int f43898a0;

    /* renamed from: b */
    public final C9660hi1 f43899b;

    /* renamed from: b0 */
    public byte f43900b0;

    /* renamed from: c */
    public final SparseArray f43901c;

    /* renamed from: c0 */
    public boolean f43902c0;

    /* renamed from: d */
    public final boolean f43903d;

    /* renamed from: d0 */
    public InterfaceC1538YR f43904d0;

    /* renamed from: e */
    public final boolean f43905e;

    /* renamed from: f */
    public final InterfaceC8939c61 f43906f;

    /* renamed from: g */
    public final C9591hA0 f43907g;

    /* renamed from: h */
    public final C9591hA0 f43908h;

    /* renamed from: i */
    public final C9591hA0 f43909i;

    /* renamed from: j */
    public final C9591hA0 f43910j;

    /* renamed from: k */
    public final C9591hA0 f43911k;

    /* renamed from: l */
    public final C9591hA0 f43912l;

    /* renamed from: m */
    public final C9591hA0 f43913m;

    /* renamed from: n */
    public final C9591hA0 f43914n;

    /* renamed from: o */
    public final C9591hA0 f43915o;

    /* renamed from: p */
    public final C9591hA0 f43916p;

    /* renamed from: q */
    public ByteBuffer f43917q;

    /* renamed from: r */
    public long f43918r;

    /* renamed from: s */
    public long f43919s;

    /* renamed from: t */
    public long f43920t;

    /* renamed from: u */
    public long f43921u;

    /* renamed from: v */
    public long f43922v;

    /* renamed from: w */
    public C11207to0 f43923w;

    /* renamed from: x */
    public boolean f43924x;

    /* renamed from: y */
    public int f43925y;

    /* renamed from: z */
    public long f43926z;

    static {
        int i = AbstractC7485Dh1.f2166a;
        f43866f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AbstractC7227yr.f46511c);
        f43867g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f43868h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f43869i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        AbstractC1374Vq.m8595n(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC1374Vq.m8595n(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f43870j0 = Collections.unmodifiableMap(map);
    }

    public C11335uo0(InterfaceC8939c61 interfaceC8939c61, int i) {
        C6668qF c6668qF = new C6668qF();
        this.f43919s = -1L;
        this.f43920t = -9223372036854775807L;
        this.f43921u = -9223372036854775807L;
        this.f43922v = -9223372036854775807L;
        this.f43872B = -1L;
        this.f43873C = -1L;
        this.f43874D = -9223372036854775807L;
        this.f43897a = c6668qF;
        c6668qF.f40680d = new C9432fw1(22, this);
        this.f43906f = interfaceC8939c61;
        this.f43903d = (i & 1) == 0;
        this.f43905e = (i & 2) == 0;
        this.f43899b = new C9660hi1();
        this.f43901c = new SparseArray();
        this.f43909i = new C9591hA0(4);
        this.f43910j = new C9591hA0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f43911k = new C9591hA0(4);
        this.f43907g = new C9591hA0(TA1.f11190a);
        this.f43908h = new C9591hA0(4);
        this.f43912l = new C9591hA0();
        this.f43913m = new C9591hA0();
        this.f43914n = new C9591hA0(8);
        this.f43915o = new C9591hA0();
        this.f43916p = new C9591hA0();
        this.f43884N = new int[1];
    }

    /* renamed from: i */
    public static byte[] m25239i(long j, long j2, String str) {
        YN1.m9278c(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = AbstractC7485Dh1.f2166a;
        return str2.getBytes(AbstractC7227yr.f46511c);
    }

    /* renamed from: a */
    public final void m25240a(int i) {
        if (this.f43875E == null || this.f43876F == null) {
            throw C10103lA0.m22366a(null, "Element " + i + " must be in a Cues");
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    /* renamed from: c */
    public final void m25241c(int i) {
        if (this.f43923w != null) {
            return;
        }
        throw C10103lA0.m22366a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1108:0x0491 A[PHI: r35
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
 binds: [B:1238:0x0678, B:1234:0x066d, B:1230:0x0662, B:1226:0x0657, B:1222:0x064c, B:1218:0x0641, B:1214:0x0636, B:1210:0x0629, B:1206:0x0619, B:1202:0x0609, B:1198:0x05f9, B:1194:0x05e9, B:1190:0x05d9, B:1186:0x05c9, B:1182:0x05b9, B:1178:0x05a9, B:1174:0x0599, B:1170:0x0589, B:1166:0x0579, B:1162:0x0569, B:1158:0x0559, B:1154:0x0549, B:1150:0x0539, B:1146:0x0529, B:1142:0x0519, B:1138:0x0509, B:1134:0x04f9, B:1130:0x04e9, B:1126:0x04d9, B:1122:0x04c9, B:1118:0x04b9, B:1114:0x04a9, B:1107:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1399:0x0adc  */
    /* JADX WARN: Removed duplicated region for block: B:1404:0x0af3  */
    /* JADX WARN: Removed duplicated region for block: B:1405:0x0af5  */
    /* JADX WARN: Removed duplicated region for block: B:1408:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:1409:0x0b15  */
    /* JADX WARN: Removed duplicated region for block: B:1500:0x0ceb  */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, to0] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v26, types: [vF] */
    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo738d(p000.InterfaceC1475XR r48, p000.C1164SV r49) throws p000.C10103lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 5240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11335uo0.mo738d(XR, SV):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00d2  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25242e(p000.C11207to0 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11335uo0.m25242e(to0, long, int, int, int):void");
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) throws EOFException, InterruptedIOException {
        C0986Pf c0986Pf = new C0986Pf(18, (byte) 0);
        C7000vF c7000vF = (C7000vF) interfaceC1475XR;
        long j = c7000vF.f44294c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        C9591hA0 c9591hA0 = (C9591hA0) c0986Pf.f9217c;
        c7000vF.mo3620f(c9591hA0.f28293a, 0, 4, false);
        c0986Pf.f9216b = 4;
        for (long jM18765w = c9591hA0.m18765w(); jM18765w != 440786851; jM18765w = ((jM18765w << 8) & (-256)) | (c9591hA0.f28293a[0] & 255)) {
            int i2 = c0986Pf.f9216b + 1;
            c0986Pf.f9216b = i2;
            if (i2 == i) {
                return false;
            }
            c7000vF.mo3620f(c9591hA0.f28293a, 0, 1, false);
        }
        long jM6403q = c0986Pf.m6403q(c7000vF);
        long j3 = c0986Pf.f9216b;
        if (jM6403q == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + jM6403q >= j) {
            return false;
        }
        while (true) {
            long j4 = c0986Pf.f9216b;
            long j5 = j3 + jM6403q;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (c0986Pf.m6403q(c7000vF) == Long.MIN_VALUE) {
                return false;
            }
            long jM6403q2 = c0986Pf.m6403q(c7000vF);
            if (jM6403q2 < 0 || jM6403q2 > 2147483647L) {
                return false;
            }
            if (jM6403q2 != 0) {
                int i3 = (int) jM6403q2;
                c7000vF.m25375a(i3, false);
                c0986Pf.f9216b += i3;
            }
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        this.f43874D = -9223372036854775807L;
        this.f43879I = 0;
        C6668qF c6668qF = this.f43897a;
        c6668qF.f40681e = 0;
        c6668qF.f40678b.clear();
        C9660hi1 c9660hi1 = c6668qF.f40679c;
        c9660hi1.f28542a = 0;
        c9660hi1.f28543b = 0;
        C9660hi1 c9660hi12 = this.f43899b;
        c9660hi12.f28542a = 0;
        c9660hi12.f28543b = 0;
        m25244k();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f43901c;
            if (i >= sparseArray.size()) {
                return;
            }
            C9522gd1 c9522gd1 = ((C11207to0) sparseArray.valueAt(i)).f43289U;
            if (c9522gd1 != null) {
                c9522gd1.f27891b = false;
                c9522gd1.f27892c = 0;
            }
            i++;
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: h */
    public final List mo741h() {
        N70 n70 = P70.f8867b;
        return C9367fQ0.f27184e;
    }

    /* renamed from: j */
    public final void m25243j(C7000vF c7000vF, int i) {
        C9591hA0 c9591hA0 = this.f43909i;
        if (c9591hA0.f28295c >= i) {
            return;
        }
        byte[] bArr = c9591hA0.f28293a;
        if (bArr.length < i) {
            c9591hA0.m18744b(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = c9591hA0.f28293a;
        int i2 = c9591hA0.f28295c;
        c7000vF.mo3618b(bArr2, i2, i - i2, false);
        c9591hA0.m18740F(i);
    }

    /* renamed from: k */
    public final void m25244k() {
        this.f43891U = 0;
        this.f43892V = 0;
        this.f43893W = 0;
        this.f43894X = false;
        this.f43895Y = false;
        this.f43896Z = false;
        this.f43898a0 = 0;
        this.f43900b0 = (byte) 0;
        this.f43902c0 = false;
        this.f43912l.m18738D(0);
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: l */
    public final void mo742l(InterfaceC1538YR interfaceC1538YR) {
        this.f43904d0 = interfaceC1538YR;
        if (this.f43905e) {
            interfaceC1538YR = new C10189lr0(interfaceC1538YR, this.f43906f);
        }
        this.f43904d0 = interfaceC1538YR;
    }

    /* renamed from: m */
    public final long m25245m(long j) throws C10103lA0 {
        long j2 = this.f43920t;
        if (j2 == -9223372036854775807L) {
            throw C10103lA0.m22366a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i = AbstractC7485Dh1.f2166a;
        return AbstractC7485Dh1.m1810Y(j, j2, 1000L, RoundingMode.FLOOR);
    }

    /* renamed from: n */
    public final int m25246n(C7000vF c7000vF, C11207to0 c11207to0, int i, boolean z) throws C10103lA0, EOFException, InterruptedIOException {
        int iMo964e;
        int iMo964e2;
        int i2;
        if ("S_TEXT/UTF8".equals(c11207to0.f43296b)) {
            m25247o(c7000vF, f43865e0, i);
            int i3 = this.f43892V;
            m25244k();
            return i3;
        }
        if ("S_TEXT/ASS".equals(c11207to0.f43296b)) {
            m25247o(c7000vF, f43867g0, i);
            int i4 = this.f43892V;
            m25244k();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(c11207to0.f43296b)) {
            m25247o(c7000vF, f43868h0, i);
            int i5 = this.f43892V;
            m25244k();
            return i5;
        }
        InterfaceC8357Ub1 interfaceC8357Ub1 = c11207to0.f43293Y;
        boolean z2 = this.f43894X;
        C9591hA0 c9591hA0 = this.f43912l;
        if (!z2) {
            boolean z3 = c11207to0.f43302h;
            C9591hA0 c9591hA02 = this.f43909i;
            if (z3) {
                this.f43887Q &= -1073741825;
                if (!this.f43895Y) {
                    c7000vF.mo3618b(c9591hA02.f28293a, 0, 1, false);
                    this.f43891U++;
                    byte b = c9591hA02.f28293a[0];
                    if ((b & 128) == 128) {
                        throw C10103lA0.m22366a(null, "Extension bit is set in signal byte");
                    }
                    this.f43900b0 = b;
                    this.f43895Y = true;
                }
                byte b2 = this.f43900b0;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.f43887Q |= 1073741824;
                    if (!this.f43902c0) {
                        C9591hA0 c9591hA03 = this.f43914n;
                        c7000vF.mo3618b(c9591hA03.f28293a, 0, 8, false);
                        this.f43891U += 8;
                        this.f43902c0 = true;
                        c9591hA02.f28293a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        c9591hA02.m18741G(0);
                        interfaceC8357Ub1.mo961b(c9591hA02, 1, 1);
                        this.f43892V++;
                        c9591hA03.m18741G(0);
                        interfaceC8357Ub1.mo961b(c9591hA03, 8, 1);
                        this.f43892V += 8;
                    }
                    if (z4) {
                        if (!this.f43896Z) {
                            c7000vF.mo3618b(c9591hA02.f28293a, 0, 1, false);
                            this.f43891U++;
                            c9591hA02.m18741G(0);
                            this.f43898a0 = c9591hA02.m18763u();
                            this.f43896Z = true;
                        }
                        int i6 = this.f43898a0 * 4;
                        c9591hA02.m18738D(i6);
                        c7000vF.mo3618b(c9591hA02.f28293a, 0, i6, false);
                        this.f43891U += i6;
                        short s = (short) ((this.f43898a0 / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f43917q;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.f43917q = ByteBuffer.allocate(i7);
                        }
                        this.f43917q.position(0);
                        this.f43917q.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.f43898a0;
                            if (i8 >= i2) {
                                break;
                            }
                            int iM18767y = c9591hA02.m18767y();
                            if (i8 % 2 == 0) {
                                this.f43917q.putShort((short) (iM18767y - i9));
                            } else {
                                this.f43917q.putInt(iM18767y - i9);
                            }
                            i8++;
                            i9 = iM18767y;
                        }
                        int i10 = (i - this.f43891U) - i9;
                        if (i2 % 2 == 1) {
                            this.f43917q.putInt(i10);
                        } else {
                            this.f43917q.putShort((short) i10);
                            this.f43917q.putInt(0);
                        }
                        byte[] bArrArray = this.f43917q.array();
                        C9591hA0 c9591hA04 = this.f43915o;
                        c9591hA04.m18739E(i7, bArrArray);
                        interfaceC8357Ub1.mo961b(c9591hA04, i7, 1);
                        this.f43892V += i7;
                    }
                }
            } else {
                byte[] bArr = c11207to0.f43303i;
                if (bArr != null) {
                    c9591hA0.m18739E(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(c11207to0.f43296b) ? z : c11207to0.f43300f > 0) {
                this.f43887Q |= 268435456;
                this.f43916p.m18738D(0);
                int i11 = (c9591hA0.f28295c + i) - this.f43891U;
                c9591hA02.m18738D(4);
                byte[] bArr2 = c9591hA02.f28293a;
                bArr2[0] = (byte) ((i11 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[1] = (byte) ((i11 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[2] = (byte) ((i11 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[3] = (byte) (i11 & KotlinVersion.MAX_COMPONENT_VALUE);
                interfaceC8357Ub1.mo961b(c9591hA02, 4, 2);
                this.f43892V += 4;
            }
            this.f43894X = true;
        }
        int i12 = i + c9591hA0.f28295c;
        if (!"V_MPEG4/ISO/AVC".equals(c11207to0.f43296b) && !"V_MPEGH/ISO/HEVC".equals(c11207to0.f43296b)) {
            if (c11207to0.f43289U != null) {
                YN1.m9281f(c9591hA0.f28295c == 0);
                c11207to0.f43289U.m18590c(c7000vF);
            }
            while (true) {
                int i13 = this.f43891U;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                int iM18743a = c9591hA0.m18743a();
                if (iM18743a > 0) {
                    iMo964e2 = Math.min(i14, iM18743a);
                    interfaceC8357Ub1.mo963d(iMo964e2, c9591hA0);
                } else {
                    iMo964e2 = interfaceC8357Ub1.mo964e(c7000vF, i14, false);
                }
                this.f43891U += iMo964e2;
                this.f43892V += iMo964e2;
            }
        } else {
            C9591hA0 c9591hA05 = this.f43908h;
            byte[] bArr3 = c9591hA05.f28293a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i15 = c11207to0.f43294Z;
            int i16 = 4 - i15;
            while (this.f43891U < i12) {
                int i17 = this.f43893W;
                if (i17 == 0) {
                    int iMin = Math.min(i15, c9591hA0.m18743a());
                    c7000vF.mo3618b(bArr3, i16 + iMin, i15 - iMin, false);
                    if (iMin > 0) {
                        c9591hA0.m18747e(bArr3, i16, iMin);
                    }
                    this.f43891U += i15;
                    c9591hA05.m18741G(0);
                    this.f43893W = c9591hA05.m18767y();
                    C9591hA0 c9591hA06 = this.f43907g;
                    c9591hA06.m18741G(0);
                    interfaceC8357Ub1.mo963d(4, c9591hA06);
                    this.f43892V += 4;
                } else {
                    int iM18743a2 = c9591hA0.m18743a();
                    if (iM18743a2 > 0) {
                        iMo964e = Math.min(i17, iM18743a2);
                        interfaceC8357Ub1.mo963d(iMo964e, c9591hA0);
                    } else {
                        iMo964e = interfaceC8357Ub1.mo964e(c7000vF, i17, false);
                    }
                    this.f43891U += iMo964e;
                    this.f43892V += iMo964e;
                    this.f43893W -= iMo964e;
                }
            }
        }
        if ("A_VORBIS".equals(c11207to0.f43296b)) {
            C9591hA0 c9591hA07 = this.f43910j;
            c9591hA07.m18741G(0);
            interfaceC8357Ub1.mo963d(4, c9591hA07);
            this.f43892V += 4;
        }
        int i18 = this.f43892V;
        m25244k();
        return i18;
    }

    /* renamed from: o */
    public final void m25247o(C7000vF c7000vF, byte[] bArr, int i) throws EOFException, InterruptedIOException {
        int length = bArr.length + i;
        C9591hA0 c9591hA0 = this.f43913m;
        byte[] bArr2 = c9591hA0.f28293a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            c9591hA0.m18739E(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c7000vF.mo3618b(c9591hA0.f28293a, bArr.length, i, false);
        c9591hA0.m18741G(0);
        c9591hA0.m18740F(length);
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
