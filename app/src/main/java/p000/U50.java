package p000;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class U50 extends AbstractC10012kS1 {

    /* renamed from: b */
    public static final C0912OU f11650b = new C0912OU(17);

    /* renamed from: a */
    public final S50 f11651a;

    public U50(S50 s50) {
        this.f11651a = s50;
    }

    /* renamed from: f */
    public static C1453X5 m7896f(C9591hA0 c9591hA0, int i, int i2) {
        int iM7914x;
        String strConcat;
        int iM18763u = c9591hA0.m18763u();
        Charset charsetM7911u = m7911u(iM18763u);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c9591hA0.m18747e(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + PN1.m6357c(new String(bArr, 0, 3, AbstractC7227yr.f46510b));
            if (ClipboardModule.MIMETYPE_JPG.equals(strConcat)) {
                strConcat = ClipboardModule.MIMETYPE_JPEG;
            }
            iM7914x = 2;
        } else {
            iM7914x = m7914x(0, bArr);
            String strM6357c = PN1.m6357c(new String(bArr, 0, iM7914x, AbstractC7227yr.f46510b));
            strConcat = strM6357c.indexOf(47) == -1 ? "image/".concat(strM6357c) : strM6357c;
        }
        int i4 = bArr[iM7914x + 1] & 255;
        int i5 = iM7914x + 2;
        int iM7913w = m7913w(bArr, i5, iM18763u);
        String str = new String(bArr, i5, iM7913w - i5, charsetM7911u);
        int iM7910t = m7910t(iM18763u) + iM7913w;
        return new C1453X5(strConcat, str, i4, i3 <= iM7910t ? AbstractC7485Dh1.f2171f : Arrays.copyOfRange(bArr, iM7910t, i3));
    }

    /* renamed from: g */
    public static C6643pr m7897g(C9591hA0 c9591hA0, int i, int i2, boolean z, int i3, S50 s50) {
        int i4 = c9591hA0.f28294b;
        int iM7914x = m7914x(i4, c9591hA0.f28293a);
        String str = new String(c9591hA0.f28293a, i4, iM7914x - i4, AbstractC7227yr.f46510b);
        c9591hA0.m18741G(iM7914x + 1);
        int iM18749g = c9591hA0.m18749g();
        int iM18749g2 = c9591hA0.m18749g();
        long jM18765w = c9591hA0.m18765w();
        long j = jM18765w == 4294967295L ? -1L : jM18765w;
        long jM18765w2 = c9591hA0.m18765w();
        long j2 = jM18765w2 == 4294967295L ? -1L : jM18765w2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (c9591hA0.f28294b < i5) {
            V50 v50M7900j = m7900j(i2, c9591hA0, z, i3, s50);
            if (v50M7900j != null) {
                arrayList.add(v50M7900j);
            }
        }
        return new C6643pr(str, iM18749g, iM18749g2, j, j2, (V50[]) arrayList.toArray(new V50[0]));
    }

    /* renamed from: h */
    public static C6706qr m7898h(C9591hA0 c9591hA0, int i, int i2, boolean z, int i3, S50 s50) {
        int i4 = c9591hA0.f28294b;
        int iM7914x = m7914x(i4, c9591hA0.f28293a);
        String str = new String(c9591hA0.f28293a, i4, iM7914x - i4, AbstractC7227yr.f46510b);
        c9591hA0.m18741G(iM7914x + 1);
        int iM18763u = c9591hA0.m18763u();
        boolean z2 = (iM18763u & 2) != 0;
        boolean z3 = (iM18763u & 1) != 0;
        int iM18763u2 = c9591hA0.m18763u();
        String[] strArr = new String[iM18763u2];
        for (int i5 = 0; i5 < iM18763u2; i5++) {
            int i6 = c9591hA0.f28294b;
            int iM7914x2 = m7914x(i6, c9591hA0.f28293a);
            strArr[i5] = new String(c9591hA0.f28293a, i6, iM7914x2 - i6, AbstractC7227yr.f46510b);
            c9591hA0.m18741G(iM7914x2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (c9591hA0.f28294b < i7) {
            V50 v50M7900j = m7900j(i2, c9591hA0, z, i3, s50);
            if (v50M7900j != null) {
                arrayList.add(v50M7900j);
            }
        }
        return new C6706qr(str, z2, z3, strArr, (V50[]) arrayList.toArray(new V50[0]));
    }

    /* renamed from: i */
    public static C0938Ou m7899i(int i, C9591hA0 c9591hA0) {
        if (i < 4) {
            return null;
        }
        int iM18763u = c9591hA0.m18763u();
        Charset charsetM7911u = m7911u(iM18763u);
        byte[] bArr = new byte[3];
        c9591hA0.m18747e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c9591hA0.m18747e(bArr2, 0, i2);
        int iM7913w = m7913w(bArr2, 0, iM18763u);
        String str2 = new String(bArr2, 0, iM7913w, charsetM7911u);
        int iM7910t = m7910t(iM18763u) + iM7913w;
        return new C0938Ou(str, str2, m7904n(bArr2, iM7910t, m7913w(bArr2, iM7910t, iM18763u), charsetM7911u));
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01db A[Catch: all -> 0x010d, Exception -> 0x0110, OutOfMemoryError -> 0x0113, TRY_LEAVE, TryCatch #2 {Exception -> 0x0110, OutOfMemoryError -> 0x0113, all -> 0x010d, blocks: (B:91:0x0107, B:99:0x0118, B:106:0x012e, B:108:0x0136, B:116:0x0150, B:125:0x0168, B:136:0x0183, B:143:0x0195, B:149:0x01a4, B:154:0x01bc, B:160:0x01d6, B:161:0x01db), top: B:172:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fe  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.V50 m7900j(int r18, p000.C9591hA0 r19, boolean r20, int r21, p000.S50 r22) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.U50.m7900j(int, hA0, boolean, int, S50):V50");
    }

    /* renamed from: k */
    public static M00 m7901k(int i, C9591hA0 c9591hA0) {
        int iM18763u = c9591hA0.m18763u();
        Charset charsetM7911u = m7911u(iM18763u);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c9591hA0.m18747e(bArr, 0, i2);
        int iM7914x = m7914x(0, bArr);
        String strM9171n = AbstractC8544Xr0.m9171n(new String(bArr, 0, iM7914x, AbstractC7227yr.f46510b));
        int i3 = iM7914x + 1;
        int iM7913w = m7913w(bArr, i3, iM18763u);
        String strM7904n = m7904n(bArr, i3, iM7913w, charsetM7911u);
        int iM7910t = m7910t(iM18763u) + iM7913w;
        int iM7913w2 = m7913w(bArr, iM7910t, iM18763u);
        String strM7904n2 = m7904n(bArr, iM7910t, iM7913w2, charsetM7911u);
        int iM7910t2 = m7910t(iM18763u) + iM7913w2;
        return new M00(strM9171n, strM7904n, strM7904n2, i2 <= iM7910t2 ? AbstractC7485Dh1.f2171f : Arrays.copyOfRange(bArr, iM7910t2, i2));
    }

    /* renamed from: l */
    public static C9295es0 m7902l(int i, C9591hA0 c9591hA0) {
        int iM18735A = c9591hA0.m18735A();
        int iM18766x = c9591hA0.m18766x();
        int iM18766x2 = c9591hA0.m18766x();
        int iM18763u = c9591hA0.m18763u();
        int iM18763u2 = c9591hA0.m18763u();
        C0683Kq c0683Kq = new C0683Kq();
        c0683Kq.m4759s(c9591hA0);
        int i2 = ((i - 10) * 8) / (iM18763u + iM18763u2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM4752l = c0683Kq.m4752l(iM18763u);
            int iM4752l2 = c0683Kq.m4752l(iM18763u2);
            iArr[i3] = iM4752l;
            iArr2[i3] = iM4752l2;
        }
        return new C9295es0(iM18735A, iM18766x, iM18766x2, iArr, iArr2);
    }

    /* renamed from: m */
    public static AD0 m7903m(int i, C9591hA0 c9591hA0) {
        byte[] bArr = new byte[i];
        c9591hA0.m18747e(bArr, 0, i);
        int iM7914x = m7914x(0, bArr);
        String str = new String(bArr, 0, iM7914x, AbstractC7227yr.f46510b);
        int i2 = iM7914x + 1;
        return new AD0(str, i <= i2 ? AbstractC7485Dh1.f2171f : Arrays.copyOfRange(bArr, i2, i));
    }

    /* renamed from: n */
    public static String m7904n(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    /* renamed from: o */
    public static C10742q91 m7905o(int i, C9591hA0 c9591hA0, String str) {
        if (i < 1) {
            return null;
        }
        int iM18763u = c9591hA0.m18763u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c9591hA0.m18747e(bArr, 0, i2);
        return new C10742q91(str, null, m7906p(bArr, iM18763u, 0));
    }

    /* renamed from: p */
    public static C9367fQ0 m7906p(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return P70.m6229B("");
        }
        M70 m70M6233t = P70.m6233t();
        int iM7913w = m7913w(bArr, i2, i);
        while (i2 < iM7913w) {
            m70M6233t.m3755a(new String(bArr, i2, iM7913w - i2, m7911u(i)));
            i2 = m7910t(i) + iM7913w;
            iM7913w = m7913w(bArr, i2, i);
        }
        C9367fQ0 c9367fQ0M5273h = m70M6233t.m5273h();
        return c9367fQ0M5273h.isEmpty() ? P70.m6229B("") : c9367fQ0M5273h;
    }

    /* renamed from: q */
    public static C10742q91 m7907q(int i, C9591hA0 c9591hA0) {
        if (i < 1) {
            return null;
        }
        int iM18763u = c9591hA0.m18763u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c9591hA0.m18747e(bArr, 0, i2);
        int iM7913w = m7913w(bArr, 0, iM18763u);
        return new C10742q91("TXXX", new String(bArr, 0, iM7913w, m7911u(iM18763u)), m7906p(bArr, iM18763u, m7910t(iM18763u) + iM7913w));
    }

    /* renamed from: r */
    public static C9013ch1 m7908r(int i, C9591hA0 c9591hA0, String str) {
        byte[] bArr = new byte[i];
        c9591hA0.m18747e(bArr, 0, i);
        return new C9013ch1(str, null, new String(bArr, 0, m7914x(0, bArr), AbstractC7227yr.f46510b));
    }

    /* renamed from: s */
    public static C9013ch1 m7909s(int i, C9591hA0 c9591hA0) {
        if (i < 1) {
            return null;
        }
        int iM18763u = c9591hA0.m18763u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c9591hA0.m18747e(bArr, 0, i2);
        int iM7913w = m7913w(bArr, 0, iM18763u);
        String str = new String(bArr, 0, iM7913w, m7911u(iM18763u));
        int iM7910t = m7910t(iM18763u) + iM7913w;
        return new C9013ch1("WXXX", str, m7904n(bArr, iM7910t, m7914x(iM7910t, bArr), AbstractC7227yr.f46510b));
    }

    /* renamed from: t */
    public static int m7910t(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: u */
    public static Charset m7911u(int i) {
        return i != 1 ? i != 2 ? i != 3 ? AbstractC7227yr.f46510b : AbstractC7227yr.f46511c : AbstractC7227yr.f46512d : AbstractC7227yr.f46514f;
    }

    /* renamed from: v */
    public static String m7912v(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* renamed from: w */
    public static int m7913w(byte[] bArr, int i, int i2) {
        int iM7914x = m7914x(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iM7914x;
        }
        while (iM7914x < bArr.length - 1) {
            if ((iM7914x - i) % 2 == 0 && bArr[iM7914x + 1] == 0) {
                return iM7914x;
            }
            iM7914x = m7914x(iM7914x + 1, bArr);
        }
        return bArr.length;
    }

    /* renamed from: x */
    public static int m7914x(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: y */
    public static int m7915y(int i, C9591hA0 c9591hA0) {
        byte[] bArr = c9591hA0.f28293a;
        int i2 = c9591hA0.f28294b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m7916z(p000.C9591hA0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f28294b
        L6:
            int r3 = r18.m18743a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.m18749g()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.m18765w()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.m18735A()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r18.m18766x()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.m18766x()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.m18741G(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.m18741G(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.m18741G(r2)
            return r6
        L99:
            int r3 = r18.m18743a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.m18741G(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.m18742H(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.m18741G(r2)
            return r4
        Lb0:
            r1.m18741G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.U50.m7916z(hA0, int, int, boolean):boolean");
    }

    @Override // p000.AbstractC10012kS1
    /* renamed from: c */
    public final C7660Gr0 mo3312c(C7816Jr0 c7816Jr0, ByteBuffer byteBuffer) {
        return m7917e(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C7660Gr0 m7917e(int r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.U50.m7917e(int, byte[]):Gr0");
    }
}
