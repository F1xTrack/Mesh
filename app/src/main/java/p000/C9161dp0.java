package p000;

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
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: dp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9161dp0 extends AbstractC8382Uo0 {

    /* renamed from: w2 */
    public static final int[] f26282w2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: x2 */
    public static boolean f26283x2;

    /* renamed from: y2 */
    public static boolean f26284y2;

    /* renamed from: Q1 */
    public final Context f26285Q1;

    /* renamed from: R1 */
    public final boolean f26286R1;

    /* renamed from: S1 */
    public final C8165Qj1 f26287S1;

    /* renamed from: T1 */
    public final int f26288T1;

    /* renamed from: U1 */
    public final boolean f26289U1;

    /* renamed from: V1 */
    public final C11962zj1 f26290V1;

    /* renamed from: W1 */
    public final C7005vK f26291W1;

    /* renamed from: X1 */
    public C7112x1 f26292X1;

    /* renamed from: Y1 */
    public boolean f26293Y1;

    /* renamed from: Z1 */
    public boolean f26294Z1;

    /* renamed from: a2 */
    public C4084fw f26295a2;

    /* renamed from: b2 */
    public boolean f26296b2;

    /* renamed from: c2 */
    public List f26297c2;

    /* renamed from: d2 */
    public Surface f26298d2;

    /* renamed from: e2 */
    public C10617pB0 f26299e2;

    /* renamed from: f2 */
    public C8673a21 f26300f2;

    /* renamed from: g2 */
    public boolean f26301g2;

    /* renamed from: h2 */
    public int f26302h2;

    /* renamed from: i2 */
    public long f26303i2;

    /* renamed from: j2 */
    public int f26304j2;

    /* renamed from: k2 */
    public int f26305k2;

    /* renamed from: l2 */
    public int f26306l2;

    /* renamed from: m2 */
    public long f26307m2;

    /* renamed from: n2 */
    public int f26308n2;

    /* renamed from: o2 */
    public long f26309o2;

    /* renamed from: p2 */
    public C8321Tj1 f26310p2;

    /* renamed from: q2 */
    public C8321Tj1 f26311q2;

    /* renamed from: r2 */
    public int f26312r2;

    /* renamed from: s2 */
    public boolean f26313s2;

    /* renamed from: t2 */
    public int f26314t2;

    /* renamed from: u2 */
    public C9033cp0 f26315u2;

    /* renamed from: v2 */
    public InterfaceC11581wj1 f26316v2;

    public C9161dp0(Context context, InterfaceC7706Ho0 interfaceC7706Ho0, boolean z, Handler handler, SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ) {
        super(2, interfaceC7706Ho0, z, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f26285Q1 = applicationContext;
        this.f26288T1 = 50;
        this.f26287S1 = new C8165Qj1(handler, surfaceHolderCallbackC1285UQ);
        this.f26286R1 = true;
        this.f26290V1 = new C11962zj1(applicationContext, this);
        this.f26291W1 = new C7005vK(5);
        this.f26289U1 = "NVIDIA".equals(AbstractC7485Dh1.f2168c);
        this.f26300f2 = C8673a21.f15291c;
        this.f26302h2 = 1;
        this.f26310p2 = C8321Tj1.f11486e;
        this.f26314t2 = 0;
        this.f26311q2 = null;
        this.f26312r2 = -1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m17744u0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9161dp0.m17744u0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m17745v0(p000.C8018No0 r11, p000.C6686qX r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9161dp0.m17745v0(No0, qX):int");
    }

    /* renamed from: w0 */
    public static List m17746w0(Context context, C4262il c4262il, C6686qX c6686qX, boolean z, boolean z2) {
        List listM9604f;
        String str = c6686qX.f40974m;
        if (str == null) {
            return C9367fQ0.f27184e;
        }
        if (AbstractC7485Dh1.f2166a >= 26 && "video/dolby-vision".equals(str) && !AbstractC8900bp0.m10524a(context)) {
            String strM9600b = AbstractC8642Zo0.m9600b(c6686qX);
            if (strM9600b == null) {
                listM9604f = C9367fQ0.f27184e;
            } else {
                c4262il.getClass();
                listM9604f = AbstractC8642Zo0.m9604f(strM9600b, z, z2);
            }
            if (!listM9604f.isEmpty()) {
                return listM9604f;
            }
        }
        return AbstractC8642Zo0.m9606h(c4262il, c6686qX, z, z2);
    }

    /* renamed from: x0 */
    public static int m17747x0(C8018No0 c8018No0, C6686qX c6686qX) {
        if (c6686qX.f40975n == -1) {
            return m17745v0(c8018No0, c6686qX);
        }
        List list = c6686qX.f40977p;
        int size = list.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) list.get(i)).length;
        }
        return c6686qX.f40975n + length;
    }

    /* renamed from: A0 */
    public final void m17748A0() {
        int i;
        InterfaceC7758Io0 interfaceC7758Io0;
        if (!this.f26313s2 || (i = AbstractC7485Dh1.f2166a) < 23 || (interfaceC7758Io0 = this.f12090L) == null) {
            return;
        }
        this.f26315u2 = new C9033cp0(this, interfaceC7758Io0);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            interfaceC7758Io0.mo4007a(bundle);
        }
    }

    /* renamed from: B0 */
    public final void m17749B0() {
        Surface surface = this.f26298d2;
        C10617pB0 c10617pB0 = this.f26299e2;
        if (surface == c10617pB0) {
            this.f26298d2 = null;
        }
        if (c10617pB0 != null) {
            c10617pB0.release();
            this.f26299e2 = null;
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: C */
    public final C1772bE mo4716C(C8018No0 c8018No0, C6686qX c6686qX, C6686qX c6686qX2) {
        C1772bE c1772bEM5849b = c8018No0.m5849b(c6686qX, c6686qX2);
        C7112x1 c7112x1 = this.f26292X1;
        c7112x1.getClass();
        int i = c6686qX2.f40980s;
        int i2 = c7112x1.f45257a;
        int i3 = c1772bEM5849b.f16873e;
        if (i > i2 || c6686qX2.f40981t > c7112x1.f45258b) {
            i3 |= 256;
        }
        if (m17747x0(c8018No0, c6686qX2) > c7112x1.f45259c) {
            i3 |= 64;
        }
        int i4 = i3;
        return new C1772bE(c8018No0.f8009a, c6686qX, c6686qX2, i4 != 0 ? 0 : c1772bEM5849b.f16872d, i4);
    }

    /* renamed from: C0 */
    public final void m17750C0(InterfaceC7758Io0 interfaceC7758Io0, int i) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC7758Io0.mo4016o(i, true);
        Trace.endSection();
        this.f12091L1.f13069e++;
        this.f26305k2 = 0;
        if (this.f26295a2 == null) {
            m17757z0(this.f26310p2);
            C11962zj1 c11962zj1 = this.f26290V1;
            boolean z = c11962zj1.f46961d != 3;
            c11962zj1.f46961d = 3;
            c11962zj1.f46968k.getClass();
            c11962zj1.f46963f = AbstractC7485Dh1.m1802Q(SystemClock.elapsedRealtime());
            if (!z || (surface = this.f26298d2) == null) {
                return;
            }
            C8165Qj1 c8165Qj1 = this.f26287S1;
            Handler handler = (Handler) c8165Qj1.f9756a;
            if (handler != null) {
                handler.post(new RunnableC9844j81(c8165Qj1, surface, SystemClock.elapsedRealtime(), 1));
            }
            this.f26301g2 = true;
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: D */
    public final C7966Mo0 mo8154D(IllegalStateException illegalStateException, C8018No0 c8018No0) {
        Surface surface = this.f26298d2;
        C8772ap0 c8772ap0 = new C8772ap0(illegalStateException, c8018No0);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c8772ap0;
    }

    /* renamed from: D0 */
    public final void m17751D0(InterfaceC7758Io0 interfaceC7758Io0, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC7758Io0.mo4012j(i, j);
        Trace.endSection();
        this.f12091L1.f13069e++;
        this.f26305k2 = 0;
        if (this.f26295a2 == null) {
            m17757z0(this.f26310p2);
            C11962zj1 c11962zj1 = this.f26290V1;
            boolean z = c11962zj1.f46961d != 3;
            c11962zj1.f46961d = 3;
            c11962zj1.f46968k.getClass();
            c11962zj1.f46963f = AbstractC7485Dh1.m1802Q(SystemClock.elapsedRealtime());
            if (!z || (surface = this.f26298d2) == null) {
                return;
            }
            C8165Qj1 c8165Qj1 = this.f26287S1;
            Handler handler = (Handler) c8165Qj1.f9756a;
            if (handler != null) {
                handler.post(new RunnableC9844j81(c8165Qj1, surface, SystemClock.elapsedRealtime(), 1));
            }
            this.f26301g2 = true;
        }
    }

    /* renamed from: E0 */
    public final boolean m17752E0(C8018No0 c8018No0) {
        return AbstractC7485Dh1.f2166a >= 23 && !this.f26313s2 && !m17744u0(c8018No0.f8009a) && (!c8018No0.f8014f || C10617pB0.m23636a(this.f26285Q1));
    }

    /* renamed from: F0 */
    public final void m17753F0(InterfaceC7758Io0 interfaceC7758Io0, int i) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC7758Io0.mo4016o(i, false);
        Trace.endSection();
        this.f12091L1.f13070f++;
    }

    /* renamed from: G0 */
    public final void m17754G0(int i, int i2) {
        C1398WD c1398wd = this.f12091L1;
        c1398wd.f13072h += i;
        int i3 = i + i2;
        c1398wd.f13071g += i3;
        this.f26304j2 += i3;
        int i4 = this.f26305k2 + i3;
        this.f26305k2 = i4;
        c1398wd.f13073i = Math.max(i4, c1398wd.f13073i);
        int i5 = this.f26288T1;
        if (i5 <= 0 || this.f26304j2 < i5) {
            return;
        }
        m17756y0();
    }

    /* renamed from: H0 */
    public final void m17755H0(long j) {
        C1398WD c1398wd = this.f12091L1;
        c1398wd.f13075k += j;
        c1398wd.f13076l++;
        this.f26307m2 += j;
        this.f26308n2++;
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: L */
    public final int mo8162L(C1587ZD c1587zd) {
        return (AbstractC7485Dh1.f2166a < 34 || !this.f26313s2 || c1587zd.f14800g >= this.f317l) ? 0 : 32;
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: M */
    public final boolean mo8163M() {
        return this.f26313s2 && AbstractC7485Dh1.f2166a < 23;
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: N */
    public final float mo4717N(float f, C6686qX[] c6686qXArr) {
        float fMax = -1.0f;
        for (C6686qX c6686qX : c6686qXArr) {
            float f2 = c6686qX.f40982u;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: O */
    public final ArrayList mo4718O(C4262il c4262il, C6686qX c6686qX, boolean z) {
        List listM17746w0 = m17746w0(this.f26285Q1, c4262il, c6686qX, z, this.f26313s2);
        Pattern pattern = AbstractC8642Zo0.f15134a;
        ArrayList arrayList = new ArrayList(listM17746w0);
        Collections.sort(arrayList, new C4209hv(2, new C0267EE(26, c6686qX)));
        return arrayList;
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: P */
    public final C7654Go0 mo4719P(C8018No0 c8018No0, C6686qX c6686qX, MediaCrypto mediaCrypto, float f) {
        boolean z;
        int i;
        C0372Fu c0372Fu;
        int iMax;
        C7112x1 c7112x1;
        Point point;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        boolean z2;
        int i3;
        char c;
        boolean z3;
        Pair pairM9602d;
        int iM17745v0;
        C10617pB0 c10617pB0 = this.f26299e2;
        boolean z4 = c8018No0.f8014f;
        if (c10617pB0 != null && c10617pB0.f39883a != z4) {
            m17749B0();
        }
        String str = c8018No0.f8011c;
        C6686qX[] c6686qXArr = this.f315j;
        c6686qXArr.getClass();
        int iMax2 = c6686qX.f40980s;
        int iM17747x0 = m17747x0(c8018No0, c6686qX);
        int length = c6686qXArr.length;
        float f2 = c6686qX.f40982u;
        int i4 = c6686qX.f40980s;
        C0372Fu c0372Fu2 = c6686qX.f40987z;
        int i5 = c6686qX.f40981t;
        if (length == 1) {
            if (iM17747x0 != -1 && (iM17745v0 = m17745v0(c8018No0, c6686qX)) != -1) {
                iM17747x0 = Math.min((int) (iM17747x0 * 1.5f), iM17745v0);
            }
            c7112x1 = new C7112x1(iMax2, i5, iM17747x0);
            z = z4;
            i = i5;
            c0372Fu = c0372Fu2;
        } else {
            int length2 = c6686qXArr.length;
            int iMax3 = i5;
            int i6 = 0;
            boolean z5 = false;
            while (i6 < length2) {
                C6686qX c6686qX2 = c6686qXArr[i6];
                C6686qX[] c6686qXArr2 = c6686qXArr;
                if (c0372Fu2 != null && c6686qX2.f40987z == null) {
                    C6623pX c6623pXM24020a = c6686qX2.m24020a();
                    c6623pXM24020a.f40174y = c0372Fu2;
                    c6686qX2 = new C6686qX(c6623pXM24020a);
                }
                if (c8018No0.m5849b(c6686qX, c6686qX2).f16872d != 0) {
                    int i7 = c6686qX2.f40981t;
                    i3 = length2;
                    int i8 = c6686qX2.f40980s;
                    z2 = z4;
                    c = 65535;
                    z5 |= i8 == -1 || i7 == -1;
                    iMax2 = Math.max(iMax2, i8);
                    iMax3 = Math.max(iMax3, i7);
                    iM17747x0 = Math.max(iM17747x0, m17747x0(c8018No0, c6686qX2));
                } else {
                    z2 = z4;
                    i3 = length2;
                    c = 65535;
                }
                i6++;
                c6686qXArr = c6686qXArr2;
                length2 = i3;
                z4 = z2;
            }
            z = z4;
            int i9 = iMax3;
            if (z5) {
                AbstractC10872rA1.m24175h("Resolutions unknown. Codec max resolution: " + iMax2 + "x" + i9);
                boolean z6 = i5 > i4;
                int i10 = z6 ? i5 : i4;
                int i11 = z6 ? i4 : i5;
                c0372Fu = c0372Fu2;
                float f3 = i11 / i10;
                int[] iArr = f26282w2;
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
                    if (AbstractC7485Dh1.f2166a >= 21) {
                        int i16 = z6 ? i14 : i13;
                        if (!z6) {
                            i13 = i14;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = c8018No0.f8012d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            i2 = i11;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            i2 = i11;
                            point2 = new Point(AbstractC7485Dh1.m1822g(i16, widthAlignment) * widthAlignment, AbstractC7485Dh1.m1822g(i13, heightAlignment) * heightAlignment);
                        }
                        if (point2 != null) {
                            Point point3 = point2;
                            if (c8018No0.m5853f(f2, point2.x, point2.y)) {
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
                            int iM1822g = AbstractC7485Dh1.m1822g(i13, 16) * 16;
                            int iM1822g2 = AbstractC7485Dh1.m1822g(i14, 16) * 16;
                            if (iM1822g * iM1822g2 <= AbstractC8642Zo0.m9609k()) {
                                int i17 = z6 ? iM1822g2 : iM1822g;
                                if (!z6) {
                                    iM1822g = iM1822g2;
                                }
                                point = new Point(i17, iM1822g);
                            } else {
                                i12++;
                                iArr = iArr2;
                                f3 = f4;
                                i10 = i15;
                                i11 = i2;
                            }
                        } catch (C8486Wo0 unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax2 = Math.max(iMax2, point.x);
                    iMax = Math.max(i9, point.y);
                    C6623pX c6623pXM24020a2 = c6686qX.m24020a();
                    c6623pXM24020a2.f40167r = iMax2;
                    c6623pXM24020a2.f40168s = iMax;
                    iM17747x0 = Math.max(iM17747x0, m17745v0(c8018No0, new C6686qX(c6623pXM24020a2)));
                    AbstractC10872rA1.m24175h("Codec max resolution adjusted to: " + iMax2 + "x" + iMax);
                }
                c7112x1 = new C7112x1(iMax2, iMax, iM17747x0);
            } else {
                i = i5;
                c0372Fu = c0372Fu2;
            }
            iMax = i9;
            c7112x1 = new C7112x1(iMax2, iMax, iM17747x0);
        }
        this.f26292X1 = c7112x1;
        int i18 = this.f26313s2 ? this.f26314t2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(Snapshot.WIDTH, i4);
        mediaFormat.setInteger(Snapshot.HEIGHT, i);
        AbstractC10360nA1.m23096b(mediaFormat, c6686qX.f40977p);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        AbstractC10360nA1.m23095a(mediaFormat, "rotation-degrees", c6686qX.f40983v);
        if (c0372Fu != null) {
            C0372Fu c0372Fu3 = c0372Fu;
            AbstractC10360nA1.m23095a(mediaFormat, "color-transfer", c0372Fu3.f3466c);
            AbstractC10360nA1.m23095a(mediaFormat, "color-standard", c0372Fu3.f3464a);
            AbstractC10360nA1.m23095a(mediaFormat, "color-range", c0372Fu3.f3465b);
            byte[] bArr = c0372Fu3.f3467d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c6686qX.f40974m) && (pairM9602d = AbstractC8642Zo0.m9602d(c6686qX)) != null) {
            AbstractC10360nA1.m23095a(mediaFormat, Scopes.PROFILE, ((Integer) pairM9602d.first).intValue());
        }
        mediaFormat.setInteger("max-width", c7112x1.f45257a);
        mediaFormat.setInteger("max-height", c7112x1.f45258b);
        AbstractC10360nA1.m23095a(mediaFormat, "max-input-size", c7112x1.f45259c);
        int i19 = AbstractC7485Dh1.f2166a;
        if (i19 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f26289U1) {
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
            mediaFormat.setInteger(NotificationConstants.IMPORTANCE, Math.max(0, -this.f26312r2));
        }
        if (this.f26298d2 == null) {
            if (!m17752E0(c8018No0)) {
                throw new IllegalStateException();
            }
            if (this.f26299e2 == null) {
                this.f26299e2 = C10617pB0.m23637b(this.f26285Q1, z);
            }
            this.f26298d2 = this.f26299e2;
        }
        C4084fw c4084fw = this.f26295a2;
        if (c4084fw != null && !AbstractC7485Dh1.m1799N(c4084fw.f27466a)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (this.f26295a2 == null) {
            return new C7654Go0(c8018No0, mediaFormat, c6686qX, this.f26298d2, mediaCrypto);
        }
        YN1.m9281f(false);
        YN1.m9283h(null);
        throw null;
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: Q */
    public final void mo4720Q(C1587ZD c1587zd) {
        if (this.f26294Z1) {
            ByteBuffer byteBuffer = c1587zd.f14801h;
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
                        InterfaceC7758Io0 interfaceC7758Io0 = this.f12090L;
                        interfaceC7758Io0.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC7758Io0.mo4007a(bundle);
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: V */
    public final void mo4721V(Exception exc) {
        AbstractC10872rA1.m24172e("Video codec error", exc);
        C8165Qj1 c8165Qj1 = this.f26287S1;
        Handler handler = (Handler) c8165Qj1.f9756a;
        if (handler != null) {
            handler.post(new O91(c8165Qj1, 8, exc));
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: W */
    public final void mo4722W(long j, long j2, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C8165Qj1 c8165Qj1 = this.f26287S1;
        Handler handler = (Handler) c8165Qj1.f9756a;
        if (handler != null) {
            handler.post(new RunnableC7084wa(c8165Qj1, str, j, j2, 1));
        }
        this.f26293Y1 = m17744u0(str);
        C8018No0 c8018No0 = this.f12101S;
        c8018No0.getClass();
        boolean z = false;
        if (AbstractC7485Dh1.f2166a >= 29 && "video/x-vnd.on2.vp9".equals(c8018No0.f8010b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c8018No0.f8012d;
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
        this.f26294Z1 = z;
        m17748A0();
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: X */
    public final void mo4723X(String str) {
        C8165Qj1 c8165Qj1 = this.f26287S1;
        Handler handler = (Handler) c8165Qj1.f9756a;
        if (handler != null) {
            handler.post(new O91(c8165Qj1, 9, str));
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: Y */
    public final C1772bE mo4724Y(C0827N8 c0827n8) throws C0531IQ {
        C1772bE c1772bEMo4724Y = super.mo4724Y(c0827n8);
        C6686qX c6686qX = (C6686qX) c0827n8.f7524c;
        c6686qX.getClass();
        C8165Qj1 c8165Qj1 = this.f26287S1;
        Handler handler = (Handler) c8165Qj1.f9756a;
        if (handler != null) {
            handler.post(new RunnableC8176Qp0(c8165Qj1, c6686qX, c1772bEMo4724Y, 18));
        }
        return c1772bEMo4724Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    @Override // p000.AbstractC8382Uo0
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4725Z(p000.C6686qX r10, android.media.MediaFormat r11) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9161dp0.mo4725Z(qX, android.media.MediaFormat):void");
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: b0 */
    public final void mo8168b0(long j) {
        super.mo8168b0(j);
        if (this.f26313s2) {
            return;
        }
        this.f26306l2--;
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: c0 */
    public final void mo4727c0() {
        if (this.f26295a2 != null) {
            long j = this.f12093M1.f11526c;
        } else {
            this.f26290V1.m26525c(2);
        }
        m17748A0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [android.view.Surface] */
    @Override // p000.AbstractC0043Ag, p000.PB0
    /* renamed from: d */
    public final void mo259d(int i, Object obj) throws C0531IQ {
        Handler handler;
        C11962zj1 c11962zj1 = this.f26290V1;
        if (i == 1) {
            C10617pB0 c10617pB0M23637b = obj instanceof Surface ? (Surface) obj : null;
            if (c10617pB0M23637b == null) {
                C10617pB0 c10617pB0 = this.f26299e2;
                if (c10617pB0 != null) {
                    c10617pB0M23637b = c10617pB0;
                } else {
                    C8018No0 c8018No0 = this.f12101S;
                    if (c8018No0 != null && m17752E0(c8018No0)) {
                        c10617pB0M23637b = C10617pB0.m23637b(this.f26285Q1, c8018No0.f8014f);
                        this.f26299e2 = c10617pB0M23637b;
                    }
                }
            }
            Surface surface = this.f26298d2;
            C8165Qj1 c8165Qj1 = this.f26287S1;
            if (surface == c10617pB0M23637b) {
                if (c10617pB0M23637b == null || c10617pB0M23637b == this.f26299e2) {
                    return;
                }
                C8321Tj1 c8321Tj1 = this.f26311q2;
                if (c8321Tj1 != null) {
                    c8165Qj1.m6751g(c8321Tj1);
                }
                Surface surface2 = this.f26298d2;
                if (surface2 == null || !this.f26301g2 || (handler = (Handler) c8165Qj1.f9756a) == null) {
                    return;
                }
                handler.post(new RunnableC9844j81(c8165Qj1, surface2, SystemClock.elapsedRealtime(), 1));
                return;
            }
            this.f26298d2 = c10617pB0M23637b;
            if (this.f26295a2 == null) {
                C7489Dj1 c7489Dj1 = c11962zj1.f46959b;
                c7489Dj1.getClass();
                C10617pB0 c10617pB02 = c10617pB0M23637b instanceof C10617pB0 ? null : c10617pB0M23637b;
                if (c7489Dj1.f2210e != c10617pB02) {
                    c7489Dj1.m1861b();
                    c7489Dj1.f2210e = c10617pB02;
                    c7489Dj1.m1863d(true);
                }
                c11962zj1.m26525c(1);
            }
            this.f26301g2 = false;
            int i2 = this.f313h;
            InterfaceC7758Io0 interfaceC7758Io0 = this.f12090L;
            if (interfaceC7758Io0 != null && this.f26295a2 == null) {
                if (AbstractC7485Dh1.f2166a < 23 || c10617pB0M23637b == null || this.f26293Y1) {
                    m8173i0();
                    m8166T();
                } else {
                    interfaceC7758Io0.mo4019u(c10617pB0M23637b);
                }
            }
            if (c10617pB0M23637b == null || c10617pB0M23637b == this.f26299e2) {
                this.f26311q2 = null;
                C4084fw c4084fw = this.f26295a2;
                if (c4084fw != null) {
                    C4147gw c4147gw = c4084fw.f27475j;
                    c4147gw.getClass();
                    int i3 = C8673a21.f15291c.f15292a;
                    c4147gw.f28101j = null;
                }
            } else {
                C8321Tj1 c8321Tj12 = this.f26311q2;
                if (c8321Tj12 != null) {
                    c8165Qj1.m6751g(c8321Tj12);
                }
                if (i2 == 2) {
                    c11962zj1.m26524b(true);
                }
            }
            m17748A0();
            return;
        }
        if (i == 7) {
            obj.getClass();
            InterfaceC11581wj1 interfaceC11581wj1 = (InterfaceC11581wj1) obj;
            this.f26316v2 = interfaceC11581wj1;
            C4084fw c4084fw2 = this.f26295a2;
            if (c4084fw2 != null) {
                c4084fw2.f27475j.f28099h = interfaceC11581wj1;
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f26314t2 != iIntValue) {
                this.f26314t2 = iIntValue;
                if (this.f26313s2) {
                    m8173i0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f26312r2 = ((Integer) obj).intValue();
            InterfaceC7758Io0 interfaceC7758Io02 = this.f12090L;
            if (interfaceC7758Io02 != null && AbstractC7485Dh1.f2166a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt(NotificationConstants.IMPORTANCE, Math.max(0, -this.f26312r2));
                interfaceC7758Io02.mo4007a(bundle);
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f26302h2 = iIntValue2;
            InterfaceC7758Io0 interfaceC7758Io03 = this.f12090L;
            if (interfaceC7758Io03 != null) {
                interfaceC7758Io03.mo4017q(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            C7489Dj1 c7489Dj12 = c11962zj1.f46959b;
            if (c7489Dj12.f2215j == iIntValue3) {
                return;
            }
            c7489Dj12.f2215j = iIntValue3;
            c7489Dj12.m1863d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f26297c2 = list;
            C4084fw c4084fw3 = this.f26295a2;
            if (c4084fw3 != null) {
                ArrayList arrayList = c4084fw3.f27468c;
                if (arrayList.equals(list)) {
                    return;
                }
                arrayList.clear();
                arrayList.addAll(list);
                c4084fw3.m18307c();
                return;
            }
            return;
        }
        if (i != 14) {
            if (i == 11) {
                this.f12080G = (C1537YQ) obj;
                return;
            }
            return;
        }
        obj.getClass();
        C8673a21 c8673a21 = (C8673a21) obj;
        if (c8673a21.f15292a == 0 || c8673a21.f15293b == 0) {
            return;
        }
        this.f26300f2 = c8673a21;
        C4084fw c4084fw4 = this.f26295a2;
        if (c4084fw4 != null) {
            Surface surface3 = this.f26298d2;
            YN1.m9283h(surface3);
            c4084fw4.m18309e(surface3, c8673a21);
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: d0 */
    public final void mo8169d0(C1587ZD c1587zd) {
        Surface surface;
        boolean z = this.f26313s2;
        if (!z) {
            this.f26306l2++;
        }
        if (AbstractC7485Dh1.f2166a >= 23 || !z) {
            return;
        }
        long j = c1587zd.f14800g;
        m8181t0(j);
        m17757z0(this.f26310p2);
        this.f12091L1.f13069e++;
        C11962zj1 c11962zj1 = this.f26290V1;
        boolean z2 = c11962zj1.f46961d != 3;
        c11962zj1.f46961d = 3;
        c11962zj1.f46968k.getClass();
        c11962zj1.f46963f = AbstractC7485Dh1.m1802Q(SystemClock.elapsedRealtime());
        if (z2 && (surface = this.f26298d2) != null) {
            C8165Qj1 c8165Qj1 = this.f26287S1;
            Handler handler = (Handler) c8165Qj1.f9756a;
            if (handler != null) {
                handler.post(new RunnableC9844j81(c8165Qj1, surface, SystemClock.elapsedRealtime(), 1));
            }
            this.f26301g2 = true;
        }
        mo8168b0(j);
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: e0 */
    public final void mo8170e0(C6686qX c6686qX) throws C0531IQ {
        C4084fw c4084fw = this.f26295a2;
        if (c4084fw == null) {
            return;
        }
        try {
            c4084fw.m18306b(c6686qX);
            throw null;
        } catch (C8269Sj1 e) {
            throw m260f(e, c6686qX, false, 7000);
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: g */
    public final void mo261g() {
        C4084fw c4084fw = this.f26295a2;
        if (c4084fw != null) {
            C11962zj1 c11962zj1 = c4084fw.f27475j.f28093b;
            if (c11962zj1.f46961d == 0) {
                c11962zj1.f46961d = 1;
                return;
            }
            return;
        }
        C11962zj1 c11962zj12 = this.f26290V1;
        if (c11962zj12.f46961d == 0) {
            c11962zj12.f46961d = 1;
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: g0 */
    public final boolean mo4728g0(long j, long j2, InterfaceC7758Io0 interfaceC7758Io0, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6686qX c6686qX) throws InterruptedException, C0531IQ {
        long j4;
        long j5;
        long j6;
        interfaceC7758Io0.getClass();
        C8330To0 c8330To0 = this.f12093M1;
        long j7 = j3 - c8330To0.f11526c;
        int iM26523a = this.f26290V1.m26523a(j3, j, j2, c8330To0.f11525b, z2, this.f26291W1);
        if (iM26523a == 4) {
            return false;
        }
        if (z && !z2) {
            m17753F0(interfaceC7758Io0, i);
            return true;
        }
        Surface surface = this.f26298d2;
        C10617pB0 c10617pB0 = this.f26299e2;
        C7005vK c7005vK = this.f26291W1;
        if (surface == c10617pB0 && this.f26295a2 == null) {
            if (c7005vK.f44329b >= 30000) {
                return false;
            }
            m17753F0(interfaceC7758Io0, i);
            m17755H0(c7005vK.f44329b);
            return true;
        }
        C4084fw c4084fw = this.f26295a2;
        if (c4084fw != null) {
            try {
                c4084fw.m18308d(j, j2);
                C4084fw c4084fw2 = this.f26295a2;
                c4084fw2.getClass();
                YN1.m9281f(false);
                YN1.m9281f(c4084fw2.f27467b != -1);
                long j8 = c4084fw2.f27472g;
                if (j8 != -9223372036854775807L) {
                    C4147gw c4147gw = c4084fw2.f27475j;
                    if (c4147gw.f28102k == 0) {
                        long j9 = c4147gw.f28094c.f2869j;
                        if (j9 != -9223372036854775807L && j9 >= j8) {
                            c4084fw2.m18307c();
                            c4084fw2.f27472g = -9223372036854775807L;
                        }
                    }
                    return false;
                }
                YN1.m9283h(null);
                throw null;
            } catch (C8269Sj1 e) {
                throw m260f(e, e.f10929a, false, 7001);
            }
        }
        if (iM26523a == 0) {
            this.f312g.getClass();
            long jNanoTime = System.nanoTime();
            InterfaceC11581wj1 interfaceC11581wj1 = this.f26316v2;
            if (interfaceC11581wj1 != null) {
                j4 = jNanoTime;
                interfaceC11581wj1.mo8438c(j7, jNanoTime, c6686qX, this.f12094N);
            } else {
                j4 = jNanoTime;
            }
            if (AbstractC7485Dh1.f2166a >= 21) {
                m17751D0(interfaceC7758Io0, i, j4);
            } else {
                m17750C0(interfaceC7758Io0, i);
            }
            m17755H0(c7005vK.f44329b);
            return true;
        }
        if (iM26523a != 1) {
            if (iM26523a == 2) {
                Trace.beginSection("dropVideoBuffer");
                interfaceC7758Io0.mo4016o(i, false);
                Trace.endSection();
                m17754G0(0, 1);
                m17755H0(c7005vK.f44329b);
                return true;
            }
            if (iM26523a != 3) {
                if (iM26523a == 5) {
                    return false;
                }
                throw new IllegalStateException(String.valueOf(iM26523a));
            }
            m17753F0(interfaceC7758Io0, i);
            m17755H0(c7005vK.f44329b);
            return true;
        }
        long j10 = c7005vK.f44330c;
        long j11 = c7005vK.f44329b;
        if (AbstractC7485Dh1.f2166a >= 21) {
            if (j10 == this.f26309o2) {
                m17753F0(interfaceC7758Io0, i);
                j5 = j11;
                j6 = j10;
            } else {
                InterfaceC11581wj1 interfaceC11581wj12 = this.f26316v2;
                if (interfaceC11581wj12 != null) {
                    j5 = j11;
                    j6 = j10;
                    interfaceC11581wj12.mo8438c(j7, j10, c6686qX, this.f12094N);
                } else {
                    j5 = j11;
                    j6 = j10;
                }
                m17751D0(interfaceC7758Io0, i, j6);
            }
            m17755H0(j5);
            this.f26309o2 = j6;
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
            InterfaceC11581wj1 interfaceC11581wj13 = this.f26316v2;
            if (interfaceC11581wj13 != null) {
                interfaceC11581wj13.mo8438c(j7, j10, c6686qX, this.f12094N);
            }
            m17750C0(interfaceC7758Io0, i);
            m17755H0(j11);
        }
        return true;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: i */
    public final String mo263i() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: k */
    public final boolean mo265k() {
        return this.f12083H1 && this.f26295a2 == null;
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: k0 */
    public final void mo8174k0() {
        super.mo8174k0();
        this.f26306l2 = 0;
    }

    @Override // p000.AbstractC8382Uo0, p000.AbstractC0043Ag
    /* renamed from: l */
    public final boolean mo266l() {
        C10617pB0 c10617pB0;
        boolean z = super.mo266l() && this.f26295a2 == null;
        if (z && (((c10617pB0 = this.f26299e2) != null && this.f26298d2 == c10617pB0) || this.f12090L == null || this.f26313s2)) {
            return true;
        }
        C11962zj1 c11962zj1 = this.f26290V1;
        if (z && c11962zj1.f46961d == 3) {
            c11962zj1.f46965h = -9223372036854775807L;
        } else {
            if (c11962zj1.f46965h == -9223372036854775807L) {
                return false;
            }
            c11962zj1.f46968k.getClass();
            if (SystemClock.elapsedRealtime() >= c11962zj1.f46965h) {
                c11962zj1.f46965h = -9223372036854775807L;
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC8382Uo0, p000.AbstractC0043Ag
    /* renamed from: m */
    public final void mo267m() {
        C8165Qj1 c8165Qj1 = this.f26287S1;
        this.f26311q2 = null;
        C4084fw c4084fw = this.f26295a2;
        if (c4084fw != null) {
            c4084fw.f27475j.f28093b.m26525c(0);
        } else {
            this.f26290V1.m26525c(0);
        }
        m17748A0();
        this.f26301g2 = false;
        this.f26315u2 = null;
        try {
            super.mo267m();
            C1398WD c1398wd = this.f12091L1;
            c8165Qj1.getClass();
            synchronized (c1398wd) {
            }
            Handler handler = (Handler) c8165Qj1.f9756a;
            if (handler != null) {
                handler.post(new RunnableC8113Pj1(c8165Qj1, c1398wd, 1));
            }
            c8165Qj1.m6751g(C8321Tj1.f11486e);
        } catch (Throwable th) {
            c8165Qj1.m6750f(this.f12091L1);
            c8165Qj1.m6751g(C8321Tj1.f11486e);
            throw th;
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: n */
    public final void mo268n(boolean z, boolean z2) {
        this.f12091L1 = new C1398WD();
        ZQ0 zq0 = this.f309d;
        zq0.getClass();
        boolean z3 = zq0.f14891b;
        YN1.m9281f((z3 && this.f26314t2 == 0) ? false : true);
        if (this.f26313s2 != z3) {
            this.f26313s2 = z3;
            m8173i0();
        }
        C1398WD c1398wd = this.f12091L1;
        C8165Qj1 c8165Qj1 = this.f26287S1;
        Handler handler = (Handler) c8165Qj1.f9756a;
        if (handler != null) {
            handler.post(new RunnableC8113Pj1(c8165Qj1, c1398wd, 0));
        }
        boolean z4 = this.f26296b2;
        C11962zj1 c11962zj1 = this.f26290V1;
        if (!z4) {
            if ((this.f26297c2 != null || !this.f26286R1) && this.f26295a2 == null) {
                C1753aw c1753aw = new C1753aw(this.f26285Q1, c11962zj1);
                M71 m71 = this.f312g;
                m71.getClass();
                c1753aw.f16687g = m71;
                YN1.m9281f(!c1753aw.f16683c);
                if (((C3958dw) c1753aw.f16686f) == null) {
                    if (((C3896cw) c1753aw.f16685e) == null) {
                        c1753aw.f16685e = new C3896cw();
                    }
                    c1753aw.f16686f = new C3958dw((C3896cw) c1753aw.f16685e);
                }
                C4147gw c4147gw = new C4147gw(c1753aw);
                c1753aw.f16683c = true;
                this.f26295a2 = c4147gw.f28092a;
            }
            this.f26296b2 = true;
        }
        C4084fw c4084fw = this.f26295a2;
        if (c4084fw == null) {
            M71 m712 = this.f312g;
            m712.getClass();
            c11962zj1.f46968k = m712;
            c11962zj1.f46961d = z2 ? 1 : 0;
            return;
        }
        C7978Mu0 c7978Mu0 = new C7978Mu0(21, this);
        EnumC1152SJ enumC1152SJ = EnumC1152SJ.f10681a;
        c4084fw.f27473h = c7978Mu0;
        c4084fw.f27474i = enumC1152SJ;
        InterfaceC11581wj1 interfaceC11581wj1 = this.f26316v2;
        if (interfaceC11581wj1 != null) {
            c4084fw.f27475j.f28099h = interfaceC11581wj1;
        }
        if (this.f26298d2 != null && !this.f26300f2.equals(C8673a21.f15291c)) {
            this.f26295a2.m18309e(this.f26298d2, this.f26300f2);
        }
        C4084fw c4084fw2 = this.f26295a2;
        float f = this.f12086J;
        C7541Ej1 c7541Ej1 = c4084fw2.f27475j.f28094c;
        c7541Ej1.getClass();
        YN1.m9278c(f > 0.0f);
        C11962zj1 c11962zj12 = c7541Ej1.f2861b;
        if (f != c11962zj12.f46967j) {
            c11962zj12.f46967j = f;
            C7489Dj1 c7489Dj1 = c11962zj12.f46959b;
            c7489Dj1.f2214i = f;
            c7489Dj1.f2218m = 0L;
            c7489Dj1.f2221p = -1L;
            c7489Dj1.f2219n = -1L;
            c7489Dj1.m1863d(false);
        }
        List list = this.f26297c2;
        if (list != null) {
            C4084fw c4084fw3 = this.f26295a2;
            ArrayList arrayList = c4084fw3.f27468c;
            if (!arrayList.equals(list)) {
                arrayList.clear();
                arrayList.addAll(list);
                c4084fw3.m18307c();
            }
        }
        this.f26295a2.f27475j.f28093b.f46961d = z2 ? 1 : 0;
    }

    @Override // p000.AbstractC8382Uo0, p000.AbstractC0043Ag
    /* renamed from: o */
    public final void mo269o(long j, boolean z) throws C0531IQ {
        C4084fw c4084fw = this.f26295a2;
        if (c4084fw != null) {
            c4084fw.m18305a(true);
            C4084fw c4084fw2 = this.f26295a2;
            long j2 = this.f12093M1.f11526c;
            c4084fw2.getClass();
        }
        super.mo269o(j, z);
        C4084fw c4084fw3 = this.f26295a2;
        C11962zj1 c11962zj1 = this.f26290V1;
        if (c4084fw3 == null) {
            C7489Dj1 c7489Dj1 = c11962zj1.f46959b;
            c7489Dj1.f2218m = 0L;
            c7489Dj1.f2221p = -1L;
            c7489Dj1.f2219n = -1L;
            c11962zj1.f46964g = -9223372036854775807L;
            c11962zj1.f46962e = -9223372036854775807L;
            c11962zj1.m26525c(1);
            c11962zj1.f46965h = -9223372036854775807L;
        }
        if (z) {
            c11962zj1.m26524b(false);
        }
        m17748A0();
        this.f26305k2 = 0;
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: o0 */
    public final boolean mo8178o0(C8018No0 c8018No0) {
        return this.f26298d2 != null || m17752E0(c8018No0);
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: p */
    public final void mo270p() {
        C4084fw c4084fw = this.f26295a2;
        if (c4084fw == null || !this.f26286R1) {
            return;
        }
        C4147gw c4147gw = c4084fw.f27475j;
        if (c4147gw.f28103l == 2) {
            return;
        }
        R71 r71 = c4147gw.f28100i;
        if (r71 != null) {
            r71.f10020a.removeCallbacksAndMessages(null);
        }
        c4147gw.f28101j = null;
        c4147gw.f28103l = 2;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: q */
    public final void mo271q() {
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
            this.f26296b2 = false;
            if (this.f26299e2 != null) {
                m17749B0();
            }
        }
    }

    @Override // p000.AbstractC8382Uo0
    /* renamed from: q0 */
    public final int mo4731q0(C4262il c4262il, C6686qX c6686qX) {
        boolean z;
        int i = 26;
        int i2 = 0;
        if (!AbstractC8544Xr0.m9170m(c6686qX.f40974m)) {
            return AbstractC11153tN0.m24901m(0, 0, 0, 0);
        }
        boolean z2 = c6686qX.f40978q != null;
        Context context = this.f26285Q1;
        List listM17746w0 = m17746w0(context, c4262il, c6686qX, z2, false);
        if (z2 && listM17746w0.isEmpty()) {
            listM17746w0 = m17746w0(context, c4262il, c6686qX, false, false);
        }
        if (listM17746w0.isEmpty()) {
            return AbstractC11153tN0.m24901m(1, 0, 0, 0);
        }
        int i3 = c6686qX.f40960J;
        if (i3 != 0 && i3 != 2) {
            return AbstractC11153tN0.m24901m(2, 0, 0, 0);
        }
        C8018No0 c8018No0 = (C8018No0) listM17746w0.get(0);
        boolean zM5851d = c8018No0.m5851d(c6686qX);
        if (zM5851d) {
            z = true;
        } else {
            for (int i4 = 1; i4 < listM17746w0.size(); i4++) {
                C8018No0 c8018No02 = (C8018No0) listM17746w0.get(i4);
                if (c8018No02.m5851d(c6686qX)) {
                    zM5851d = true;
                    z = false;
                    c8018No0 = c8018No02;
                    break;
                }
            }
            z = true;
        }
        int i5 = zM5851d ? 4 : 3;
        int i6 = c8018No0.m5852e(c6686qX) ? 16 : 8;
        int i7 = c8018No0.f8015g ? 64 : 0;
        int i8 = z ? 128 : 0;
        if (AbstractC7485Dh1.f2166a >= 26 && "video/dolby-vision".equals(c6686qX.f40974m) && !AbstractC8900bp0.m10524a(context)) {
            i8 = 256;
        }
        if (zM5851d) {
            List listM17746w02 = m17746w0(context, c4262il, c6686qX, z2, true);
            if (!listM17746w02.isEmpty()) {
                Pattern pattern = AbstractC8642Zo0.f15134a;
                ArrayList arrayList = new ArrayList(listM17746w02);
                Collections.sort(arrayList, new C4209hv(2, new C0267EE(i, c6686qX)));
                C8018No0 c8018No03 = (C8018No0) arrayList.get(0);
                if (c8018No03.m5851d(c6686qX) && c8018No03.m5852e(c6686qX)) {
                    i2 = 32;
                }
            }
        }
        return i5 | i6 | i2 | i7 | i8;
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: r */
    public final void mo272r() {
        this.f26304j2 = 0;
        this.f312g.getClass();
        this.f26303i2 = SystemClock.elapsedRealtime();
        this.f26307m2 = 0L;
        this.f26308n2 = 0;
        C4084fw c4084fw = this.f26295a2;
        if (c4084fw != null) {
            c4084fw.f27475j.f28093b.m26526d();
        } else {
            this.f26290V1.m26526d();
        }
    }

    @Override // p000.AbstractC0043Ag
    /* renamed from: s */
    public final void mo273s() {
        m17756y0();
        int i = this.f26308n2;
        if (i != 0) {
            long j = this.f26307m2;
            C8165Qj1 c8165Qj1 = this.f26287S1;
            Handler handler = (Handler) c8165Qj1.f9756a;
            if (handler != null) {
                handler.post(new RunnableC8061Oj1(c8165Qj1, j, i, 1));
            }
            this.f26307m2 = 0L;
            this.f26308n2 = 0;
        }
        C4084fw c4084fw = this.f26295a2;
        if (c4084fw != null) {
            c4084fw.f27475j.f28093b.m26527e();
        } else {
            this.f26290V1.m26527e();
        }
    }

    @Override // p000.AbstractC8382Uo0, p000.AbstractC0043Ag
    /* renamed from: v */
    public final void mo276v(long j, long j2) throws MediaCryptoException, C0531IQ {
        super.mo276v(j, j2);
        C4084fw c4084fw = this.f26295a2;
        if (c4084fw != null) {
            try {
                c4084fw.m18308d(j, j2);
            } catch (C8269Sj1 e) {
                throw m260f(e, e.f10929a, false, 7001);
            }
        }
    }

    @Override // p000.AbstractC8382Uo0, p000.AbstractC0043Ag
    /* renamed from: y */
    public final void mo279y(float f, float f2) throws C0531IQ {
        super.mo279y(f, f2);
        C4084fw c4084fw = this.f26295a2;
        if (c4084fw == null) {
            C11962zj1 c11962zj1 = this.f26290V1;
            if (f == c11962zj1.f46967j) {
                return;
            }
            c11962zj1.f46967j = f;
            C7489Dj1 c7489Dj1 = c11962zj1.f46959b;
            c7489Dj1.f2214i = f;
            c7489Dj1.f2218m = 0L;
            c7489Dj1.f2221p = -1L;
            c7489Dj1.f2219n = -1L;
            c7489Dj1.m1863d(false);
            return;
        }
        C7541Ej1 c7541Ej1 = c4084fw.f27475j.f28094c;
        c7541Ej1.getClass();
        YN1.m9278c(f > 0.0f);
        C11962zj1 c11962zj12 = c7541Ej1.f2861b;
        if (f == c11962zj12.f46967j) {
            return;
        }
        c11962zj12.f46967j = f;
        C7489Dj1 c7489Dj12 = c11962zj12.f46959b;
        c7489Dj12.f2214i = f;
        c7489Dj12.f2218m = 0L;
        c7489Dj12.f2221p = -1L;
        c7489Dj12.f2219n = -1L;
        c7489Dj12.m1863d(false);
    }

    /* renamed from: y0 */
    public final void m17756y0() {
        if (this.f26304j2 > 0) {
            this.f312g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f26303i2;
            int i = this.f26304j2;
            C8165Qj1 c8165Qj1 = this.f26287S1;
            Handler handler = (Handler) c8165Qj1.f9756a;
            if (handler != null) {
                handler.post(new RunnableC8061Oj1(c8165Qj1, i, j));
            }
            this.f26304j2 = 0;
            this.f26303i2 = jElapsedRealtime;
        }
    }

    /* renamed from: z0 */
    public final void m17757z0(C8321Tj1 c8321Tj1) {
        if (c8321Tj1.equals(C8321Tj1.f11486e) || c8321Tj1.equals(this.f26311q2)) {
            return;
        }
        this.f26311q2 = c8321Tj1;
        this.f26287S1.m6751g(c8321Tj1);
    }
}
