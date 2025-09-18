package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: dp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3462dp0 extends AbstractC1622Uo0 {
    public static final int[] w2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean x2;
    public static boolean y2;
    public final Context Q1;
    public final boolean R1;
    public final C1296Qj1 S1;
    public final int T1;
    public final boolean U1;
    public final C8418zj1 V1;
    public final C7581vK W1;
    public C7902x1 X1;
    public boolean Y1;
    public boolean Z1;
    public C3864fw a2;
    public boolean b2;
    public List c2;
    public Surface d2;
    public C6410pB0 e2;
    public C2058a21 f2;
    public boolean g2;
    public int h2;
    public long i2;
    public int j2;
    public int k2;
    public int l2;
    public long m2;
    public int n2;
    public long o2;
    public C1530Tj1 p2;
    public C1530Tj1 q2;
    public int r2;
    public boolean s2;
    public int t2;
    public C3272cp0 u2;
    public InterfaceC7848wj1 v2;

    public C3462dp0(Context context, InterfaceC0609Ho0 interfaceC0609Ho0, boolean z, Handler handler, UQ uq) {
        super(2, interfaceC0609Ho0, z, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.Q1 = applicationContext;
        this.T1 = 50;
        this.S1 = new C1296Qj1(handler, uq);
        this.R1 = true;
        this.V1 = new C8418zj1(applicationContext, this);
        this.W1 = new C7581vK(5);
        this.U1 = "NVIDIA".equals(AbstractC0277Dh1.c);
        this.f2 = C2058a21.c;
        this.h2 = 1;
        this.p2 = C1530Tj1.e;
        this.t2 = 0;
        this.q2 = null;
        this.r2 = -1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean u0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3462dp0.u0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int v0(defpackage.C1076No0 r11, defpackage.C6666qX r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3462dp0.v0(No0, qX):int");
    }

    public static List w0(Context context, C4403il c4403il, C6666qX c6666qX, boolean z, boolean z2) {
        List listF;
        String str = c6666qX.m;
        if (str == null) {
            return C3769fQ0.e;
        }
        if (AbstractC0277Dh1.a >= 26 && "video/dolby-vision".equals(str) && !AbstractC2397bp0.a(context)) {
            String strB = AbstractC2012Zo0.b(c6666qX);
            if (strB == null) {
                listF = C3769fQ0.e;
            } else {
                c4403il.getClass();
                listF = AbstractC2012Zo0.f(strB, z, z2);
            }
            if (!listF.isEmpty()) {
                return listF;
            }
        }
        return AbstractC2012Zo0.h(c4403il, c6666qX, z, z2);
    }

    public static int x0(C1076No0 c1076No0, C6666qX c6666qX) {
        if (c6666qX.n == -1) {
            return v0(c1076No0, c6666qX);
        }
        List list = c6666qX.p;
        int size = list.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) list.get(i)).length;
        }
        return c6666qX.n + length;
    }

    public final void A0() {
        int i;
        InterfaceC0687Io0 interfaceC0687Io0;
        if (!this.s2 || (i = AbstractC0277Dh1.a) < 23 || (interfaceC0687Io0 = this.L) == null) {
            return;
        }
        this.u2 = new C3272cp0(this, interfaceC0687Io0);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            interfaceC0687Io0.a(bundle);
        }
    }

    public final void B0() {
        Surface surface = this.d2;
        C6410pB0 c6410pB0 = this.e2;
        if (surface == c6410pB0) {
            this.d2 = null;
        }
        if (c6410pB0 != null) {
            c6410pB0.release();
            this.e2 = null;
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final C2285bE C(C1076No0 c1076No0, C6666qX c6666qX, C6666qX c6666qX2) {
        C2285bE c2285bEB = c1076No0.b(c6666qX, c6666qX2);
        C7902x1 c7902x1 = this.X1;
        c7902x1.getClass();
        int i = c6666qX2.s;
        int i2 = c7902x1.a;
        int i3 = c2285bEB.e;
        if (i > i2 || c6666qX2.t > c7902x1.b) {
            i3 |= 256;
        }
        if (x0(c1076No0, c6666qX2) > c7902x1.c) {
            i3 |= 64;
        }
        int i4 = i3;
        return new C2285bE(c1076No0.a, c6666qX, c6666qX2, i4 != 0 ? 0 : c2285bEB.d, i4);
    }

    public final void C0(InterfaceC0687Io0 interfaceC0687Io0, int i) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC0687Io0.o(i, true);
        Trace.endSection();
        this.L1.e++;
        this.k2 = 0;
        if (this.a2 == null) {
            z0(this.p2);
            C8418zj1 c8418zj1 = this.V1;
            boolean z = c8418zj1.d != 3;
            c8418zj1.d = 3;
            c8418zj1.k.getClass();
            c8418zj1.f = AbstractC0277Dh1.Q(SystemClock.elapsedRealtime());
            if (!z || (surface = this.d2) == null) {
                return;
            }
            C1296Qj1 c1296Qj1 = this.S1;
            Handler handler = (Handler) c1296Qj1.a;
            if (handler != null) {
                handler.post(new RunnableC5256j81(c1296Qj1, surface, SystemClock.elapsedRealtime(), 1));
            }
            this.g2 = true;
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final C0998Mo0 D(IllegalStateException illegalStateException, C1076No0 c1076No0) {
        Surface surface = this.d2;
        C2206ap0 c2206ap0 = new C2206ap0(illegalStateException, c1076No0);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c2206ap0;
    }

    public final void D0(InterfaceC0687Io0 interfaceC0687Io0, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC0687Io0.j(i, j);
        Trace.endSection();
        this.L1.e++;
        this.k2 = 0;
        if (this.a2 == null) {
            z0(this.p2);
            C8418zj1 c8418zj1 = this.V1;
            boolean z = c8418zj1.d != 3;
            c8418zj1.d = 3;
            c8418zj1.k.getClass();
            c8418zj1.f = AbstractC0277Dh1.Q(SystemClock.elapsedRealtime());
            if (!z || (surface = this.d2) == null) {
                return;
            }
            C1296Qj1 c1296Qj1 = this.S1;
            Handler handler = (Handler) c1296Qj1.a;
            if (handler != null) {
                handler.post(new RunnableC5256j81(c1296Qj1, surface, SystemClock.elapsedRealtime(), 1));
            }
            this.g2 = true;
        }
    }

    public final boolean E0(C1076No0 c1076No0) {
        return AbstractC0277Dh1.a >= 23 && !this.s2 && !u0(c1076No0.a) && (!c1076No0.f || C6410pB0.a(this.Q1));
    }

    public final void F0(InterfaceC0687Io0 interfaceC0687Io0, int i) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC0687Io0.o(i, false);
        Trace.endSection();
        this.L1.f++;
    }

    public final void G0(int i, int i2) {
        WD wd = this.L1;
        wd.h += i;
        int i3 = i + i2;
        wd.g += i3;
        this.j2 += i3;
        int i4 = this.k2 + i3;
        this.k2 = i4;
        wd.i = Math.max(i4, wd.i);
        int i5 = this.T1;
        if (i5 <= 0 || this.j2 < i5) {
            return;
        }
        y0();
    }

    public final void H0(long j) {
        WD wd = this.L1;
        wd.k += j;
        wd.l++;
        this.m2 += j;
        this.n2++;
    }

    @Override // defpackage.AbstractC1622Uo0
    public final int L(ZD zd) {
        return (AbstractC0277Dh1.a < 34 || !this.s2 || zd.g >= this.l) ? 0 : 32;
    }

    @Override // defpackage.AbstractC1622Uo0
    public final boolean M() {
        return this.s2 && AbstractC0277Dh1.a < 23;
    }

    @Override // defpackage.AbstractC1622Uo0
    public final float N(float f, C6666qX[] c6666qXArr) {
        float fMax = -1.0f;
        for (C6666qX c6666qX : c6666qXArr) {
            float f2 = c6666qX.u;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // defpackage.AbstractC1622Uo0
    public final ArrayList O(C4403il c4403il, C6666qX c6666qX, boolean z) {
        List listW0 = w0(this.Q1, c4403il, c6666qX, z, this.s2);
        Pattern pattern = AbstractC2012Zo0.a;
        ArrayList arrayList = new ArrayList(listW0);
        Collections.sort(arrayList, new C4243hv(2, new EE(26, c6666qX)));
        return arrayList;
    }

    @Override // defpackage.AbstractC1622Uo0
    public final C0531Go0 P(C1076No0 c1076No0, C6666qX c6666qX, MediaCrypto mediaCrypto, float f) {
        boolean z;
        int i;
        C0470Fu c0470Fu;
        int iMax;
        C7902x1 c7902x1;
        Point point;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        boolean z2;
        int i3;
        char c;
        boolean z3;
        Pair pairD;
        int iV0;
        C6410pB0 c6410pB0 = this.e2;
        boolean z4 = c1076No0.f;
        if (c6410pB0 != null && c6410pB0.a != z4) {
            B0();
        }
        String str = c1076No0.c;
        C6666qX[] c6666qXArr = this.j;
        c6666qXArr.getClass();
        int iMax2 = c6666qX.s;
        int iX0 = x0(c1076No0, c6666qX);
        int length = c6666qXArr.length;
        float f2 = c6666qX.u;
        int i4 = c6666qX.s;
        C0470Fu c0470Fu2 = c6666qX.z;
        int i5 = c6666qX.t;
        if (length == 1) {
            if (iX0 != -1 && (iV0 = v0(c1076No0, c6666qX)) != -1) {
                iX0 = Math.min((int) (iX0 * 1.5f), iV0);
            }
            c7902x1 = new C7902x1(iMax2, i5, iX0);
            z = z4;
            i = i5;
            c0470Fu = c0470Fu2;
        } else {
            int length2 = c6666qXArr.length;
            int iMax3 = i5;
            int i6 = 0;
            boolean z5 = false;
            while (i6 < length2) {
                C6666qX c6666qX2 = c6666qXArr[i6];
                C6666qX[] c6666qXArr2 = c6666qXArr;
                if (c0470Fu2 != null && c6666qX2.z == null) {
                    C6475pX c6475pXA = c6666qX2.a();
                    c6475pXA.y = c0470Fu2;
                    c6666qX2 = new C6666qX(c6475pXA);
                }
                if (c1076No0.b(c6666qX, c6666qX2).d != 0) {
                    int i7 = c6666qX2.t;
                    i3 = length2;
                    int i8 = c6666qX2.s;
                    z2 = z4;
                    c = 65535;
                    z5 |= i8 == -1 || i7 == -1;
                    iMax2 = Math.max(iMax2, i8);
                    iMax3 = Math.max(iMax3, i7);
                    iX0 = Math.max(iX0, x0(c1076No0, c6666qX2));
                } else {
                    z2 = z4;
                    i3 = length2;
                    c = 65535;
                }
                i6++;
                c6666qXArr = c6666qXArr2;
                length2 = i3;
                z4 = z2;
            }
            z = z4;
            int i9 = iMax3;
            if (z5) {
                AbstractC6789rA1.h("Resolutions unknown. Codec max resolution: " + iMax2 + "x" + i9);
                boolean z6 = i5 > i4;
                int i10 = z6 ? i5 : i4;
                int i11 = z6 ? i4 : i5;
                c0470Fu = c0470Fu2;
                float f3 = i11 / i10;
                int[] iArr = w2;
                i = i5;
                int i12 = 0;
                while (i12 < 9) {
                    int i13 = iArr[i12];
                    int[] iArr2 = iArr;
                    int i14 = (int) (i13 * f3);
                    if (i13 <= i10 || i14 <= i11) {
                        break;
                    }
                    float f4 = f3;
                    int i15 = i10;
                    if (AbstractC0277Dh1.a >= 21) {
                        int i16 = z6 ? i14 : i13;
                        if (!z6) {
                            i13 = i14;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = c1076No0.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            i2 = i11;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            i2 = i11;
                            point2 = new Point(AbstractC0277Dh1.g(i16, widthAlignment) * widthAlignment, AbstractC0277Dh1.g(i13, heightAlignment) * heightAlignment);
                        }
                        if (point2 != null) {
                            Point point3 = point2;
                            if (c1076No0.f(f2, point2.x, point2.y)) {
                                point = point3;
                                break;
                            }
                        } else {
                            continue;
                        }
                        i12++;
                        iArr = iArr2;
                        f3 = f4;
                        i10 = i15;
                        i11 = i2;
                    } else {
                        i2 = i11;
                        try {
                            int iG = AbstractC0277Dh1.g(i13, 16) * 16;
                            int iG2 = AbstractC0277Dh1.g(i14, 16) * 16;
                            if (iG * iG2 <= AbstractC2012Zo0.k()) {
                                int i17 = z6 ? iG2 : iG;
                                if (!z6) {
                                    iG = iG2;
                                }
                                point = new Point(i17, iG);
                            } else {
                                i12++;
                                iArr = iArr2;
                                f3 = f4;
                                i10 = i15;
                                i11 = i2;
                            }
                        } catch (C1778Wo0 unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax2 = Math.max(iMax2, point.x);
                    iMax = Math.max(i9, point.y);
                    C6475pX c6475pXA2 = c6666qX.a();
                    c6475pXA2.r = iMax2;
                    c6475pXA2.s = iMax;
                    iX0 = Math.max(iX0, v0(c1076No0, new C6666qX(c6475pXA2)));
                    AbstractC6789rA1.h("Codec max resolution adjusted to: " + iMax2 + "x" + iMax);
                }
                c7902x1 = new C7902x1(iMax2, iMax, iX0);
            } else {
                i = i5;
                c0470Fu = c0470Fu2;
            }
            iMax = i9;
            c7902x1 = new C7902x1(iMax2, iMax, iX0);
        }
        this.X1 = c7902x1;
        int i18 = this.s2 ? this.t2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(Snapshot.WIDTH, i4);
        mediaFormat.setInteger(Snapshot.HEIGHT, i);
        AbstractC6026nA1.b(mediaFormat, c6666qX.p);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        AbstractC6026nA1.a(mediaFormat, "rotation-degrees", c6666qX.v);
        if (c0470Fu != null) {
            C0470Fu c0470Fu3 = c0470Fu;
            AbstractC6026nA1.a(mediaFormat, "color-transfer", c0470Fu3.c);
            AbstractC6026nA1.a(mediaFormat, "color-standard", c0470Fu3.a);
            AbstractC6026nA1.a(mediaFormat, "color-range", c0470Fu3.b);
            byte[] bArr = c0470Fu3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c6666qX.m) && (pairD = AbstractC2012Zo0.d(c6666qX)) != null) {
            AbstractC6026nA1.a(mediaFormat, Scopes.PROFILE, ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", c7902x1.a);
        mediaFormat.setInteger("max-height", c7902x1.b);
        AbstractC6026nA1.a(mediaFormat, "max-input-size", c7902x1.c);
        int i19 = AbstractC0277Dh1.a;
        if (i19 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.U1) {
            z3 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z3 = true;
        }
        if (i18 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z3);
            mediaFormat.setInteger("audio-session-id", i18);
        }
        if (i19 >= 35) {
            mediaFormat.setInteger(NotificationConstants.IMPORTANCE, Math.max(0, -this.r2));
        }
        if (this.d2 == null) {
            if (!E0(c1076No0)) {
                throw new IllegalStateException();
            }
            if (this.e2 == null) {
                this.e2 = C6410pB0.b(this.Q1, z);
            }
            this.d2 = this.e2;
        }
        C3864fw c3864fw = this.a2;
        if (c3864fw != null && !AbstractC0277Dh1.N(c3864fw.a)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (this.a2 == null) {
            return new C0531Go0(c1076No0, mediaFormat, c6666qX, this.d2, mediaCrypto);
        }
        YN1.f(false);
        YN1.h(null);
        throw null;
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void Q(ZD zd) {
        if (this.Z1) {
            ByteBuffer byteBuffer = zd.h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC0687Io0 interfaceC0687Io0 = this.L;
                        interfaceC0687Io0.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC0687Io0.a(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void V(Exception exc) {
        AbstractC6789rA1.e("Video codec error", exc);
        C1296Qj1 c1296Qj1 = this.S1;
        Handler handler = (Handler) c1296Qj1.a;
        if (handler != null) {
            handler.post(new O91(c1296Qj1, 8, exc));
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void W(long j, long j2, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C1296Qj1 c1296Qj1 = this.S1;
        Handler handler = (Handler) c1296Qj1.a;
        if (handler != null) {
            handler.post(new RunnableC7819wa(c1296Qj1, str, j, j2, 1));
        }
        this.Y1 = u0(str);
        C1076No0 c1076No0 = this.S;
        c1076No0.getClass();
        boolean z = false;
        if (AbstractC0277Dh1.a >= 29 && "video/x-vnd.on2.vp9".equals(c1076No0.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c1076No0.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.Z1 = z;
        A0();
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void X(String str) {
        C1296Qj1 c1296Qj1 = this.S1;
        Handler handler = (Handler) c1296Qj1.a;
        if (handler != null) {
            handler.post(new O91(c1296Qj1, 9, str));
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final C2285bE Y(N8 n8) throws IQ {
        C2285bE c2285bEY = super.Y(n8);
        C6666qX c6666qX = (C6666qX) n8.c;
        c6666qX.getClass();
        C1296Qj1 c1296Qj1 = this.S1;
        Handler handler = (Handler) c1296Qj1.a;
        if (handler != null) {
            handler.post(new RunnableC1313Qp0(c1296Qj1, c6666qX, c2285bEY, 18));
        }
        return c2285bEY;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    @Override // defpackage.AbstractC1622Uo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(defpackage.C6666qX r10, android.media.MediaFormat r11) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3462dp0.Z(qX, android.media.MediaFormat):void");
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void b0(long j) {
        super.b0(j);
        if (this.s2) {
            return;
        }
        this.l2--;
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void c0() {
        if (this.a2 != null) {
            long j = this.M1.c;
        } else {
            this.V1.c(2);
        }
        A0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [android.view.Surface] */
    @Override // defpackage.AbstractC0038Ag, defpackage.PB0
    public final void d(int i, Object obj) throws IQ {
        Handler handler;
        C8418zj1 c8418zj1 = this.V1;
        if (i == 1) {
            C6410pB0 c6410pB0B = obj instanceof Surface ? (Surface) obj : null;
            if (c6410pB0B == null) {
                C6410pB0 c6410pB0 = this.e2;
                if (c6410pB0 != null) {
                    c6410pB0B = c6410pB0;
                } else {
                    C1076No0 c1076No0 = this.S;
                    if (c1076No0 != null && E0(c1076No0)) {
                        c6410pB0B = C6410pB0.b(this.Q1, c1076No0.f);
                        this.e2 = c6410pB0B;
                    }
                }
            }
            Surface surface = this.d2;
            C1296Qj1 c1296Qj1 = this.S1;
            if (surface == c6410pB0B) {
                if (c6410pB0B == null || c6410pB0B == this.e2) {
                    return;
                }
                C1530Tj1 c1530Tj1 = this.q2;
                if (c1530Tj1 != null) {
                    c1296Qj1.g(c1530Tj1);
                }
                Surface surface2 = this.d2;
                if (surface2 == null || !this.g2 || (handler = (Handler) c1296Qj1.a) == null) {
                    return;
                }
                handler.post(new RunnableC5256j81(c1296Qj1, surface2, SystemClock.elapsedRealtime(), 1));
                return;
            }
            this.d2 = c6410pB0B;
            if (this.a2 == null) {
                C0283Dj1 c0283Dj1 = c8418zj1.b;
                c0283Dj1.getClass();
                C6410pB0 c6410pB02 = c6410pB0B instanceof C6410pB0 ? null : c6410pB0B;
                if (c0283Dj1.e != c6410pB02) {
                    c0283Dj1.b();
                    c0283Dj1.e = c6410pB02;
                    c0283Dj1.d(true);
                }
                c8418zj1.c(1);
            }
            this.g2 = false;
            int i2 = this.h;
            InterfaceC0687Io0 interfaceC0687Io0 = this.L;
            if (interfaceC0687Io0 != null && this.a2 == null) {
                if (AbstractC0277Dh1.a < 23 || c6410pB0B == null || this.Y1) {
                    i0();
                    T();
                } else {
                    interfaceC0687Io0.u(c6410pB0B);
                }
            }
            if (c6410pB0B == null || c6410pB0B == this.e2) {
                this.q2 = null;
                C3864fw c3864fw = this.a2;
                if (c3864fw != null) {
                    C4055gw c4055gw = c3864fw.j;
                    c4055gw.getClass();
                    int i3 = C2058a21.c.a;
                    c4055gw.j = null;
                }
            } else {
                C1530Tj1 c1530Tj12 = this.q2;
                if (c1530Tj12 != null) {
                    c1296Qj1.g(c1530Tj12);
                }
                if (i2 == 2) {
                    c8418zj1.b(true);
                }
            }
            A0();
            return;
        }
        if (i == 7) {
            obj.getClass();
            InterfaceC7848wj1 interfaceC7848wj1 = (InterfaceC7848wj1) obj;
            this.v2 = interfaceC7848wj1;
            C3864fw c3864fw2 = this.a2;
            if (c3864fw2 != null) {
                c3864fw2.j.h = interfaceC7848wj1;
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.t2 != iIntValue) {
                this.t2 = iIntValue;
                if (this.s2) {
                    i0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.r2 = ((Integer) obj).intValue();
            InterfaceC0687Io0 interfaceC0687Io02 = this.L;
            if (interfaceC0687Io02 != null && AbstractC0277Dh1.a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt(NotificationConstants.IMPORTANCE, Math.max(0, -this.r2));
                interfaceC0687Io02.a(bundle);
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.h2 = iIntValue2;
            InterfaceC0687Io0 interfaceC0687Io03 = this.L;
            if (interfaceC0687Io03 != null) {
                interfaceC0687Io03.q(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            C0283Dj1 c0283Dj12 = c8418zj1.b;
            if (c0283Dj12.j == iIntValue3) {
                return;
            }
            c0283Dj12.j = iIntValue3;
            c0283Dj12.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.c2 = list;
            C3864fw c3864fw3 = this.a2;
            if (c3864fw3 != null) {
                ArrayList arrayList = c3864fw3.c;
                if (arrayList.equals(list)) {
                    return;
                }
                arrayList.clear();
                arrayList.addAll(list);
                c3864fw3.c();
                return;
            }
            return;
        }
        if (i != 14) {
            if (i == 11) {
                this.G = (YQ) obj;
                return;
            }
            return;
        }
        obj.getClass();
        C2058a21 c2058a21 = (C2058a21) obj;
        if (c2058a21.a == 0 || c2058a21.b == 0) {
            return;
        }
        this.f2 = c2058a21;
        C3864fw c3864fw4 = this.a2;
        if (c3864fw4 != null) {
            Surface surface3 = this.d2;
            YN1.h(surface3);
            c3864fw4.e(surface3, c2058a21);
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void d0(ZD zd) {
        Surface surface;
        boolean z = this.s2;
        if (!z) {
            this.l2++;
        }
        if (AbstractC0277Dh1.a >= 23 || !z) {
            return;
        }
        long j = zd.g;
        t0(j);
        z0(this.p2);
        this.L1.e++;
        C8418zj1 c8418zj1 = this.V1;
        boolean z2 = c8418zj1.d != 3;
        c8418zj1.d = 3;
        c8418zj1.k.getClass();
        c8418zj1.f = AbstractC0277Dh1.Q(SystemClock.elapsedRealtime());
        if (z2 && (surface = this.d2) != null) {
            C1296Qj1 c1296Qj1 = this.S1;
            Handler handler = (Handler) c1296Qj1.a;
            if (handler != null) {
                handler.post(new RunnableC5256j81(c1296Qj1, surface, SystemClock.elapsedRealtime(), 1));
            }
            this.g2 = true;
        }
        b0(j);
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void e0(C6666qX c6666qX) throws IQ {
        C3864fw c3864fw = this.a2;
        if (c3864fw == null) {
            return;
        }
        try {
            c3864fw.b(c6666qX);
            throw null;
        } catch (C1452Sj1 e) {
            throw f(e, c6666qX, false, 7000);
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final void g() {
        C3864fw c3864fw = this.a2;
        if (c3864fw != null) {
            C8418zj1 c8418zj1 = c3864fw.j.b;
            if (c8418zj1.d == 0) {
                c8418zj1.d = 1;
                return;
            }
            return;
        }
        C8418zj1 c8418zj12 = this.V1;
        if (c8418zj12.d == 0) {
            c8418zj12.d = 1;
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final boolean g0(long j, long j2, InterfaceC0687Io0 interfaceC0687Io0, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6666qX c6666qX) throws InterruptedException, IQ {
        long j4;
        long j5;
        long j6;
        interfaceC0687Io0.getClass();
        C1544To0 c1544To0 = this.M1;
        long j7 = j3 - c1544To0.c;
        int iA = this.V1.a(j3, j, j2, c1544To0.b, z2, this.W1);
        if (iA == 4) {
            return false;
        }
        if (z && !z2) {
            F0(interfaceC0687Io0, i);
            return true;
        }
        Surface surface = this.d2;
        C6410pB0 c6410pB0 = this.e2;
        C7581vK c7581vK = this.W1;
        if (surface == c6410pB0 && this.a2 == null) {
            if (c7581vK.b >= 30000) {
                return false;
            }
            F0(interfaceC0687Io0, i);
            H0(c7581vK.b);
            return true;
        }
        C3864fw c3864fw = this.a2;
        if (c3864fw != null) {
            try {
                c3864fw.d(j, j2);
                C3864fw c3864fw2 = this.a2;
                c3864fw2.getClass();
                YN1.f(false);
                YN1.f(c3864fw2.b != -1);
                long j8 = c3864fw2.g;
                if (j8 != -9223372036854775807L) {
                    C4055gw c4055gw = c3864fw2.j;
                    if (c4055gw.k == 0) {
                        long j9 = c4055gw.c.j;
                        if (j9 != -9223372036854775807L && j9 >= j8) {
                            c3864fw2.c();
                            c3864fw2.g = -9223372036854775807L;
                        }
                    }
                    return false;
                }
                YN1.h(null);
                throw null;
            } catch (C1452Sj1 e) {
                throw f(e, e.a, false, 7001);
            }
        }
        if (iA == 0) {
            this.g.getClass();
            long jNanoTime = System.nanoTime();
            InterfaceC7848wj1 interfaceC7848wj1 = this.v2;
            if (interfaceC7848wj1 != null) {
                j4 = jNanoTime;
                interfaceC7848wj1.c(j7, jNanoTime, c6666qX, this.N);
            } else {
                j4 = jNanoTime;
            }
            if (AbstractC0277Dh1.a >= 21) {
                D0(interfaceC0687Io0, i, j4);
            } else {
                C0(interfaceC0687Io0, i);
            }
            H0(c7581vK.b);
            return true;
        }
        if (iA != 1) {
            if (iA == 2) {
                Trace.beginSection("dropVideoBuffer");
                interfaceC0687Io0.o(i, false);
                Trace.endSection();
                G0(0, 1);
                H0(c7581vK.b);
                return true;
            }
            if (iA != 3) {
                if (iA == 5) {
                    return false;
                }
                throw new IllegalStateException(String.valueOf(iA));
            }
            F0(interfaceC0687Io0, i);
            H0(c7581vK.b);
            return true;
        }
        long j10 = c7581vK.c;
        long j11 = c7581vK.b;
        if (AbstractC0277Dh1.a >= 21) {
            if (j10 == this.o2) {
                F0(interfaceC0687Io0, i);
                j5 = j11;
                j6 = j10;
            } else {
                InterfaceC7848wj1 interfaceC7848wj12 = this.v2;
                if (interfaceC7848wj12 != null) {
                    j5 = j11;
                    j6 = j10;
                    interfaceC7848wj12.c(j7, j10, c6666qX, this.N);
                } else {
                    j5 = j11;
                    j6 = j10;
                }
                D0(interfaceC0687Io0, i, j6);
            }
            H0(j5);
            this.o2 = j6;
        } else {
            if (j11 >= 30000) {
                return false;
            }
            if (j11 > 11000) {
                try {
                    Thread.sleep((j11 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            InterfaceC7848wj1 interfaceC7848wj13 = this.v2;
            if (interfaceC7848wj13 != null) {
                interfaceC7848wj13.c(j7, j10, c6666qX, this.N);
            }
            C0(interfaceC0687Io0, i);
            H0(j11);
        }
        return true;
    }

    @Override // defpackage.AbstractC0038Ag
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.AbstractC0038Ag
    public final boolean k() {
        return this.H1 && this.a2 == null;
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void k0() {
        super.k0();
        this.l2 = 0;
    }

    @Override // defpackage.AbstractC1622Uo0, defpackage.AbstractC0038Ag
    public final boolean l() {
        C6410pB0 c6410pB0;
        boolean z = super.l() && this.a2 == null;
        if (z && (((c6410pB0 = this.e2) != null && this.d2 == c6410pB0) || this.L == null || this.s2)) {
            return true;
        }
        C8418zj1 c8418zj1 = this.V1;
        if (z && c8418zj1.d == 3) {
            c8418zj1.h = -9223372036854775807L;
        } else {
            if (c8418zj1.h == -9223372036854775807L) {
                return false;
            }
            c8418zj1.k.getClass();
            if (SystemClock.elapsedRealtime() >= c8418zj1.h) {
                c8418zj1.h = -9223372036854775807L;
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC1622Uo0, defpackage.AbstractC0038Ag
    public final void m() {
        C1296Qj1 c1296Qj1 = this.S1;
        this.q2 = null;
        C3864fw c3864fw = this.a2;
        if (c3864fw != null) {
            c3864fw.j.b.c(0);
        } else {
            this.V1.c(0);
        }
        A0();
        this.g2 = false;
        this.u2 = null;
        try {
            super.m();
            WD wd = this.L1;
            c1296Qj1.getClass();
            synchronized (wd) {
            }
            Handler handler = (Handler) c1296Qj1.a;
            if (handler != null) {
                handler.post(new RunnableC1218Pj1(c1296Qj1, wd, 1));
            }
            c1296Qj1.g(C1530Tj1.e);
        } catch (Throwable th) {
            c1296Qj1.f(this.L1);
            c1296Qj1.g(C1530Tj1.e);
            throw th;
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final void n(boolean z, boolean z2) {
        this.L1 = new WD();
        ZQ0 zq0 = this.d;
        zq0.getClass();
        boolean z3 = zq0.b;
        YN1.f((z3 && this.t2 == 0) ? false : true);
        if (this.s2 != z3) {
            this.s2 = z3;
            i0();
        }
        WD wd = this.L1;
        C1296Qj1 c1296Qj1 = this.S1;
        Handler handler = (Handler) c1296Qj1.a;
        if (handler != null) {
            handler.post(new RunnableC1218Pj1(c1296Qj1, wd, 0));
        }
        boolean z4 = this.b2;
        C8418zj1 c8418zj1 = this.V1;
        if (!z4) {
            if ((this.c2 != null || !this.R1) && this.a2 == null) {
                C2226aw c2226aw = new C2226aw(this.Q1, c8418zj1);
                M71 m71 = this.g;
                m71.getClass();
                c2226aw.g = m71;
                YN1.f(!c2226aw.c);
                if (((C3482dw) c2226aw.f) == null) {
                    if (((C3292cw) c2226aw.e) == null) {
                        c2226aw.e = new C3292cw();
                    }
                    c2226aw.f = new C3482dw((C3292cw) c2226aw.e);
                }
                C4055gw c4055gw = new C4055gw(c2226aw);
                c2226aw.c = true;
                this.a2 = c4055gw.a;
            }
            this.b2 = true;
        }
        C3864fw c3864fw = this.a2;
        if (c3864fw == null) {
            M71 m712 = this.g;
            m712.getClass();
            c8418zj1.k = m712;
            c8418zj1.d = z2 ? 1 : 0;
            return;
        }
        C1016Mu0 c1016Mu0 = new C1016Mu0(21, this);
        SJ sj = SJ.a;
        c3864fw.h = c1016Mu0;
        c3864fw.i = sj;
        InterfaceC7848wj1 interfaceC7848wj1 = this.v2;
        if (interfaceC7848wj1 != null) {
            c3864fw.j.h = interfaceC7848wj1;
        }
        if (this.d2 != null && !this.f2.equals(C2058a21.c)) {
            this.a2.e(this.d2, this.f2);
        }
        C3864fw c3864fw2 = this.a2;
        float f = this.J;
        C0361Ej1 c0361Ej1 = c3864fw2.j.c;
        c0361Ej1.getClass();
        YN1.c(f > 0.0f);
        C8418zj1 c8418zj12 = c0361Ej1.b;
        if (f != c8418zj12.j) {
            c8418zj12.j = f;
            C0283Dj1 c0283Dj1 = c8418zj12.b;
            c0283Dj1.i = f;
            c0283Dj1.m = 0L;
            c0283Dj1.p = -1L;
            c0283Dj1.n = -1L;
            c0283Dj1.d(false);
        }
        List list = this.c2;
        if (list != null) {
            C3864fw c3864fw3 = this.a2;
            ArrayList arrayList = c3864fw3.c;
            if (!arrayList.equals(list)) {
                arrayList.clear();
                arrayList.addAll(list);
                c3864fw3.c();
            }
        }
        this.a2.j.b.d = z2 ? 1 : 0;
    }

    @Override // defpackage.AbstractC1622Uo0, defpackage.AbstractC0038Ag
    public final void o(long j, boolean z) throws IQ {
        C3864fw c3864fw = this.a2;
        if (c3864fw != null) {
            c3864fw.a(true);
            C3864fw c3864fw2 = this.a2;
            long j2 = this.M1.c;
            c3864fw2.getClass();
        }
        super.o(j, z);
        C3864fw c3864fw3 = this.a2;
        C8418zj1 c8418zj1 = this.V1;
        if (c3864fw3 == null) {
            C0283Dj1 c0283Dj1 = c8418zj1.b;
            c0283Dj1.m = 0L;
            c0283Dj1.p = -1L;
            c0283Dj1.n = -1L;
            c8418zj1.g = -9223372036854775807L;
            c8418zj1.e = -9223372036854775807L;
            c8418zj1.c(1);
            c8418zj1.h = -9223372036854775807L;
        }
        if (z) {
            c8418zj1.b(false);
        }
        A0();
        this.k2 = 0;
    }

    @Override // defpackage.AbstractC1622Uo0
    public final boolean o0(C1076No0 c1076No0) {
        return this.d2 != null || E0(c1076No0);
    }

    @Override // defpackage.AbstractC0038Ag
    public final void p() {
        C3864fw c3864fw = this.a2;
        if (c3864fw == null || !this.R1) {
            return;
        }
        C4055gw c4055gw = c3864fw.j;
        if (c4055gw.l == 2) {
            return;
        }
        R71 r71 = c4055gw.i;
        if (r71 != null) {
            r71.a.removeCallbacksAndMessages(null);
        }
        c4055gw.j = null;
        c4055gw.l = 2;
    }

    @Override // defpackage.AbstractC0038Ag
    public final void q() {
        try {
            try {
                E();
                i0();
                LL ll = this.F;
                if (ll != null) {
                    ll.d(null);
                }
                this.F = null;
            } catch (Throwable th) {
                LL ll2 = this.F;
                if (ll2 != null) {
                    ll2.d(null);
                }
                this.F = null;
                throw th;
            }
        } finally {
            this.b2 = false;
            if (this.e2 != null) {
                B0();
            }
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final int q0(C4403il c4403il, C6666qX c6666qX) {
        boolean z;
        int i = 26;
        int i2 = 0;
        if (!AbstractC1865Xr0.m(c6666qX.m)) {
            return AbstractC7209tN0.m(0, 0, 0, 0);
        }
        boolean z2 = c6666qX.q != null;
        Context context = this.Q1;
        List listW0 = w0(context, c4403il, c6666qX, z2, false);
        if (z2 && listW0.isEmpty()) {
            listW0 = w0(context, c4403il, c6666qX, false, false);
        }
        if (listW0.isEmpty()) {
            return AbstractC7209tN0.m(1, 0, 0, 0);
        }
        int i3 = c6666qX.J;
        if (i3 != 0 && i3 != 2) {
            return AbstractC7209tN0.m(2, 0, 0, 0);
        }
        C1076No0 c1076No0 = (C1076No0) listW0.get(0);
        boolean zD = c1076No0.d(c6666qX);
        if (zD) {
            z = true;
        } else {
            for (int i4 = 1; i4 < listW0.size(); i4++) {
                C1076No0 c1076No02 = (C1076No0) listW0.get(i4);
                if (c1076No02.d(c6666qX)) {
                    zD = true;
                    z = false;
                    c1076No0 = c1076No02;
                    break;
                }
            }
            z = true;
        }
        int i5 = zD ? 4 : 3;
        int i6 = c1076No0.e(c6666qX) ? 16 : 8;
        int i7 = c1076No0.g ? 64 : 0;
        int i8 = z ? 128 : 0;
        if (AbstractC0277Dh1.a >= 26 && "video/dolby-vision".equals(c6666qX.m) && !AbstractC2397bp0.a(context)) {
            i8 = 256;
        }
        if (zD) {
            List listW02 = w0(context, c4403il, c6666qX, z2, true);
            if (!listW02.isEmpty()) {
                Pattern pattern = AbstractC2012Zo0.a;
                ArrayList arrayList = new ArrayList(listW02);
                Collections.sort(arrayList, new C4243hv(2, new EE(i, c6666qX)));
                C1076No0 c1076No03 = (C1076No0) arrayList.get(0);
                if (c1076No03.d(c6666qX) && c1076No03.e(c6666qX)) {
                    i2 = 32;
                }
            }
        }
        return i5 | i6 | i2 | i7 | i8;
    }

    @Override // defpackage.AbstractC0038Ag
    public final void r() {
        this.j2 = 0;
        this.g.getClass();
        this.i2 = SystemClock.elapsedRealtime();
        this.m2 = 0L;
        this.n2 = 0;
        C3864fw c3864fw = this.a2;
        if (c3864fw != null) {
            c3864fw.j.b.d();
        } else {
            this.V1.d();
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final void s() {
        y0();
        int i = this.n2;
        if (i != 0) {
            long j = this.m2;
            C1296Qj1 c1296Qj1 = this.S1;
            Handler handler = (Handler) c1296Qj1.a;
            if (handler != null) {
                handler.post(new RunnableC1140Oj1(c1296Qj1, j, i, 1));
            }
            this.m2 = 0L;
            this.n2 = 0;
        }
        C3864fw c3864fw = this.a2;
        if (c3864fw != null) {
            c3864fw.j.b.e();
        } else {
            this.V1.e();
        }
    }

    @Override // defpackage.AbstractC1622Uo0, defpackage.AbstractC0038Ag
    public final void v(long j, long j2) throws MediaCryptoException, IQ {
        super.v(j, j2);
        C3864fw c3864fw = this.a2;
        if (c3864fw != null) {
            try {
                c3864fw.d(j, j2);
            } catch (C1452Sj1 e) {
                throw f(e, e.a, false, 7001);
            }
        }
    }

    @Override // defpackage.AbstractC1622Uo0, defpackage.AbstractC0038Ag
    public final void y(float f, float f2) throws IQ {
        super.y(f, f2);
        C3864fw c3864fw = this.a2;
        if (c3864fw == null) {
            C8418zj1 c8418zj1 = this.V1;
            if (f == c8418zj1.j) {
                return;
            }
            c8418zj1.j = f;
            C0283Dj1 c0283Dj1 = c8418zj1.b;
            c0283Dj1.i = f;
            c0283Dj1.m = 0L;
            c0283Dj1.p = -1L;
            c0283Dj1.n = -1L;
            c0283Dj1.d(false);
            return;
        }
        C0361Ej1 c0361Ej1 = c3864fw.j.c;
        c0361Ej1.getClass();
        YN1.c(f > 0.0f);
        C8418zj1 c8418zj12 = c0361Ej1.b;
        if (f == c8418zj12.j) {
            return;
        }
        c8418zj12.j = f;
        C0283Dj1 c0283Dj12 = c8418zj12.b;
        c0283Dj12.i = f;
        c0283Dj12.m = 0L;
        c0283Dj12.p = -1L;
        c0283Dj12.n = -1L;
        c0283Dj12.d(false);
    }

    public final void y0() {
        if (this.j2 > 0) {
            this.g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.i2;
            int i = this.j2;
            C1296Qj1 c1296Qj1 = this.S1;
            Handler handler = (Handler) c1296Qj1.a;
            if (handler != null) {
                handler.post(new RunnableC1140Oj1(c1296Qj1, i, j));
            }
            this.j2 = 0;
            this.i2 = jElapsedRealtime;
        }
    }

    public final void z0(C1530Tj1 c1530Tj1) {
        if (c1530Tj1.equals(C1530Tj1.e) || c1530Tj1.equals(this.q2)) {
            return;
        }
        this.q2 = c1530Tj1;
        this.S1.g(c1530Tj1);
    }
}
