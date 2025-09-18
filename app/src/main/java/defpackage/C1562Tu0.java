package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk;
import com.facebook.imagepipeline.image.EncodedImage;
import com.mrousavy.camera.frameprocessors.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.Collator;
import java.text.RuleBasedCollator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import javax.inject.Provider;

/* renamed from: Tu0 */
/* loaded from: classes.dex */
public class C1562Tu0 implements TC, InterfaceC7400uN0, InterfaceC1490Sw0, W3, InterfaceC5314jS, Provider, InterfaceC3328d60, PZ, InterfaceC4279i50, InterfaceC1739Wb0, InterfaceC6472pW, InterfaceC8127yC {
    public static final C6182o00 c = new C6182o00(1);
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C1562Tu0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static C1562Tu0 q0(C0527Gn c0527Gn) {
        DynamicRangeProfiles dynamicRangeProfilesK;
        int i = Build.VERSION.SDK_INT;
        C1562Tu0 c1562Tu0 = null;
        if (i >= 33 && (dynamicRangeProfilesK = K1.k(c0527Gn.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            AbstractC3377dM1.i(i >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
            c1562Tu0 = new C1562Tu0(12, new HM(dynamicRangeProfilesK));
        }
        return c1562Tu0 == null ? IM.a : c1562Tu0;
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Set A(C0572Hc c0572Hc) {
        return AbstractC7209tN0.d(this, c0572Hc);
    }

    public void A0(int i, float f) {
        C6162nu c6162nu = (C6162nu) this.b;
        c6162nu.getClass();
        c6162nu.B(i, Float.floatToRawIntBits(f));
    }

    public void B0(int i, Object obj, DV0 dv0) {
        C6162nu c6162nu = (C6162nu) this.b;
        c6162nu.H(i, 3);
        dv0.g((J0) obj, c6162nu.a);
        c6162nu.H(i, 4);
    }

    public void C0(int i, int i2) {
        C6162nu c6162nu = (C6162nu) this.b;
        c6162nu.H(i, 0);
        c6162nu.F(i2);
    }

    public void D0(int i, long j) {
        ((C6162nu) this.b).J(i, j);
    }

    public void E0(int i, Object obj, DV0 dv0) {
        J0 j0 = (J0) obj;
        C6162nu c6162nu = (C6162nu) this.b;
        c6162nu.H(i, 2);
        c6162nu.I(j0.c(dv0));
        dv0.g(j0, c6162nu.a);
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Object F(C0572Hc c0572Hc, EnumC6931rw enumC6931rw) {
        return AbstractC7209tN0.k(this, c0572Hc, enumC6931rw);
    }

    public void F0(int i, int i2) {
        ((C6162nu) this.b).B(i, i2);
    }

    @Override // defpackage.InterfaceC4279i50
    public EnumC3897g50 G() {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) this.b;
        if (ruleBasedCollator == null) {
            return EnumC3897g50.e;
        }
        int strength = ruleBasedCollator.getStrength();
        return strength == 0 ? EnumC3897g50.a : strength == 1 ? EnumC3897g50.b : EnumC3897g50.d;
    }

    public void G0(int i, long j) {
        ((C6162nu) this.b).D(i, j);
    }

    public void H0(int i, int i2) {
        C6162nu c6162nu = (C6162nu) this.b;
        c6162nu.H(i, 0);
        c6162nu.I((i2 >> 31) ^ (i2 << 1));
    }

    @Override // defpackage.InterfaceC8127yC
    public long I(long j, long j2) {
        return 0L;
    }

    public void I0(int i, long j) {
        ((C6162nu) this.b).J(i, (j >> 63) ^ (j << 1));
    }

    public void J0(int i, int i2) {
        C6162nu c6162nu = (C6162nu) this.b;
        c6162nu.H(i, 0);
        c6162nu.I(i2);
    }

    public void K0(int i, long j) {
        ((C6162nu) this.b).J(i, j);
    }

    @Override // defpackage.InterfaceC7122sw
    public void L(InterfaceC6741qw interfaceC6741qw) {
        getConfig().L(interfaceC6741qw);
    }

    @Override // defpackage.InterfaceC4279i50
    public InterfaceC4279i50 O(Y40 y40) {
        C1064Nk0 c1064Nk0 = (C1064Nk0) y40;
        c1064Nk0.h();
        this.b = (RuleBasedCollator) Collator.getInstance(c1064Nk0.a);
        return this;
    }

    @Override // defpackage.InterfaceC8127yC
    public boolean P() {
        return true;
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ boolean Q(C0572Hc c0572Hc) {
        return AbstractC7209tN0.a(this, c0572Hc);
    }

    @Override // defpackage.InterfaceC8127yC
    public long R() {
        return 0L;
    }

    @Override // defpackage.InterfaceC8127yC
    public long W(long j) {
        return 1L;
    }

    @Override // defpackage.InterfaceC8127yC
    public long X(long j, long j2) {
        return 1L;
    }

    @Override // defpackage.InterfaceC8127yC
    public long a(long j) {
        return 0L;
    }

    @Override // defpackage.InterfaceC1490Sw0
    public Object c() {
        Class cls = (Class) this.b;
        try {
            return AbstractC0118Bg1.a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0013  */
    @Override // defpackage.InterfaceC6472pW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(defpackage.InterfaceC6853rW r7, defpackage.InterfaceC1729Vy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.P
            if (r0 == 0) goto L13
            r0 = r8
            P r0 = (defpackage.P) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            P r0 = new P
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            Tf1 r3 = defpackage.C1518Tf1.a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            NU0 r7 = r0.a
            defpackage.RQ1.d(r8)     // Catch: java.lang.Throwable -> L2b
            goto L55
        L2b:
            r8 = move-exception
            goto L5f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.RQ1.d(r8)
            NU0 r8 = new NU0
            Bz r2 = r0.getContext()
            r8.<init>(r7, r2)
            r0.a = r8     // Catch: java.lang.Throwable -> L5d
            r0.d = r4     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r6.b     // Catch: java.lang.Throwable -> L5d
            w11 r7 = (defpackage.C7714w11) r7     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 != r1) goto L50
            goto L51
        L50:
            r7 = r3
        L51:
            if (r7 != r1) goto L54
            return r1
        L54:
            r7 = r8
        L55:
            r7.releaseIntercepted()
            return r3
        L59:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L5f
        L5d:
            r7 = move-exception
            goto L59
        L5f:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1562Tu0.collect(rW, Vy):java.lang.Object");
    }

    @Override // defpackage.InterfaceC5314jS
    public Object create() {
        C1252Pv c1252Pv = (C1252Pv) this.b;
        return new HO((B10) c1252Pv.a, (B10) c1252Pv.b, (B10) c1252Pv.c, (B10) c1252Pv.d, (EO) c1252Pv.e, (EO) c1252Pv.f, (C1857Xo1) c1252Pv.g);
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ EnumC6931rw d0(C0572Hc c0572Hc) {
        return AbstractC7209tN0.c(this, c0572Hc);
    }

    @Override // defpackage.InterfaceC4279i50
    public InterfaceC4279i50 f(EnumC3897g50 enumC3897g50) {
        int iOrdinal = enumC3897g50.ordinal();
        if (iOrdinal == 0) {
            ((RuleBasedCollator) this.b).setStrength(0);
        } else if (iOrdinal == 1) {
            ((RuleBasedCollator) this.b).setStrength(1);
        } else if (iOrdinal == 2) {
            ((RuleBasedCollator) this.b).setStrength(0);
        } else if (iOrdinal == 3) {
            ((RuleBasedCollator) this.b).setStrength(2);
        }
        return this;
    }

    public C7687vt0 f0() {
        Map mapB = ((AbstractC7174tB1) this.b).b();
        C7496ut0 c7496ut0 = new C7496ut0();
        C7687vt0 c7687vt0 = new C7687vt0(mapB);
        c7687vt0.f = c7496ut0;
        return c7687vt0;
    }

    @Override // defpackage.InterfaceC8127yC
    public long g(long j, long j2) {
        return 0L;
    }

    @Override // javax.inject.Provider
    public Object get() {
        InterfaceC3739fG0 interfaceC3739fG0 = (InterfaceC3739fG0) ((C1155Oo1) this.b).c;
        AbstractC2501cM1.d(interfaceC3739fG0);
        return interfaceC3739fG0;
    }

    @Override // defpackage.InterfaceC7400uN0
    public InterfaceC7122sw getConfig() {
        return (InterfaceC7122sw) this.b;
    }

    @Override // defpackage.InterfaceC8127yC
    public long h(long j, long j2) {
        return -9223372036854775807L;
    }

    public Drawable h0(InterfaceC7876wt interfaceC7876wt) {
        try {
            AbstractC4368iZ.b();
            if (!(interfaceC7876wt instanceof InterfaceC0077At)) {
                AbstractC4368iZ.b();
                return null;
            }
            InterfaceC0077At interfaceC0077At = (InterfaceC0077At) interfaceC7876wt;
            BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) this.b, ((VE) interfaceC0077At).d);
            if ((((VE) interfaceC0077At).f == 0 || ((VE) interfaceC0077At).f == -1) && (((VE) interfaceC0077At).g == 1 || ((VE) interfaceC0077At).g == 0)) {
                return bitmapDrawable;
            }
            return new C1730Vy0(bitmapDrawable, ((VE) interfaceC0077At).f, ((VE) interfaceC0077At).g);
        } finally {
            AbstractC4368iZ.b();
        }
    }

    @Override // defpackage.InterfaceC8127yC
    public C3939gJ0 i(long j) {
        return (C3939gJ0) this.b;
    }

    @Override // defpackage.InterfaceC3328d60
    public void i0(C8197yZ0 c8197yZ0) {
        Frame frame = new Frame(c8197yZ0);
        try {
            frame.incrementRefCount();
            ((C4034gp) this.b).b(frame);
        } finally {
            frame.decrementRefCount();
        }
    }

    @Override // defpackage.InterfaceC4279i50
    public int l(String str, String str2) {
        return ((RuleBasedCollator) this.b).compare(str, str2);
    }

    @Override // defpackage.TC
    public Object m() {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        byteBuffer.position(0);
        return byteBuffer;
    }

    public C3513e41 o0(C0074As c0074As, C6112nd0 c6112nd0) {
        C7977xP0 c7977xP0A;
        O90.f(c0074As, "classId");
        O90.f(c6112nd0, "jvmMetadataVersion");
        String strL = D51.l(c0074As.h().b(), '.', '$');
        if (!c0074As.g().d()) {
            strL = c0074As.g() + '.' + strL;
        }
        Class clsB = AbstractC5689lP1.b((ClassLoader) this.b, strL);
        if (clsB == null || (c7977xP0A = AbstractC7407uP1.a(clsB)) == null) {
            return null;
        }
        return new C3513e41(21, c7977xP0A);
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 17:
                ((C6395p60) this.b).close();
                break;
            default:
                String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(((C0644Ia) this.b).hashCode()));
                AbstractC0759Jm0.f("Recorder");
                break;
        }
    }

    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 17:
                break;
            default:
                String.format("Released audio source successfully: 0x%x", Integer.valueOf(((C0644Ia) this.b).hashCode()));
                AbstractC0759Jm0.f("Recorder");
                break;
        }
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Object q(C0572Hc c0572Hc, Object obj) {
        return AbstractC7209tN0.j(this, c0572Hc, obj);
    }

    public C7093sm0 r0(Context context, String str, InputStream inputStream, String str2, String str3) {
        C7093sm0 c7093sm0F;
        EnumC7988xT enumC7988xT;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        C1016Mu0 c1016Mu0 = (C1016Mu0) this.b;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            AbstractC7281tl0.a();
            EnumC7988xT enumC7988xT2 = EnumC7988xT.ZIP;
            c7093sm0F = str3 != null ? AbstractC2578cm0.f(context, new ZipInputStream(new FileInputStream(c1016Mu0.P(str, inputStream, enumC7988xT2))), str) : AbstractC2578cm0.f(context, new ZipInputStream(inputStream), null);
            enumC7988xT = enumC7988xT2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            AbstractC7281tl0.a();
            enumC7988xT = EnumC7988xT.GZIP;
            c7093sm0F = str3 != null ? AbstractC2578cm0.c(new GZIPInputStream(new FileInputStream(c1016Mu0.P(str, inputStream, enumC7988xT))), str) : AbstractC2578cm0.c(new GZIPInputStream(inputStream), null);
        } else {
            AbstractC7281tl0.a();
            enumC7988xT = EnumC7988xT.JSON;
            c7093sm0F = str3 != null ? AbstractC2578cm0.c(new FileInputStream(c1016Mu0.P(str, inputStream, enumC7988xT).getAbsolutePath()), str) : AbstractC2578cm0.c(inputStream, null);
        }
        if (str3 != null && c7093sm0F.a != null) {
            File file = new File(c1016Mu0.I(), C1016Mu0.b(str, enumC7988xT, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            AbstractC7281tl0.a();
            if (!zRenameTo) {
                AbstractC7281tl0.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return c7093sm0F;
    }

    public boolean s0(String str) {
        if (((ExtensionDisabledQuirk) this.b) == null) {
            return false;
        }
        String str2 = Build.BRAND;
        return ((!("google".equalsIgnoreCase(str2) && "redfin".equalsIgnoreCase(Build.DEVICE)) || (MR.h(C1591Ue.g) && MR.c().f())) && ((!"motorola".equalsIgnoreCase(str2) || !MR.g(C1591Ue.f)) && (!"realme".equalsIgnoreCase(str2) || !MR.g(C1591Ue.f)))) ? (!"samsung".equalsIgnoreCase(str2) || !"a52sxq".equalsIgnoreCase(Build.DEVICE)) ? false : str.equals("0") : true;
    }

    public void t0(int i, boolean z) {
        C6162nu c6162nu = (C6162nu) this.b;
        c6162nu.H(i, 0);
        c6162nu.y(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Set u() {
        return AbstractC7209tN0.g(this);
    }

    public void u0(int i, C0362Ek c0362Ek) {
        C6162nu c6162nu = (C6162nu) this.b;
        c6162nu.H(i, 2);
        c6162nu.A(c0362Ek);
    }

    @Override // defpackage.InterfaceC1739Wb0
    public void v(EncodedImage encodedImage, int i) throws Throwable {
        C7678vq0 c7678vq0;
        C3547eG c3547eGB;
        int i2;
        int i3 = i;
        C2137aS0 c2137aS0 = (C2137aS0) this.b;
        if (encodedImage == null) {
            c2137aS0.b.g(i3, null);
            return;
        }
        InterfaceC7733w70 interfaceC7733w70CreateImageTranscoder = c2137aS0.d.createImageTranscoder(encodedImage.getImageFormat(), c2137aS0.c);
        AbstractC1516Tf abstractC1516Tf = c2137aS0.b;
        RD0 rd0 = c2137aS0.e;
        C7647vg c7647vg = (C7647vg) rd0;
        c7647vg.c.j(rd0, "ResizeAndRotateProducer");
        C6589q70 c6589q70 = c7647vg.a;
        VH vh = c2137aS0.h.b;
        vh.getClass();
        AbstractC6914rq0 abstractC6914rq0 = (AbstractC6914rq0) vh.b;
        C7678vq0 c7678vq02 = new C7678vq0(abstractC6914rq0, abstractC6914rq0.j[0]);
        try {
            try {
                c7678vq0 = c7678vq02;
            } catch (Exception e) {
                e = e;
                c7678vq0 = c7678vq02;
            } catch (Throwable th) {
                th = th;
                c7678vq02.close();
                throw th;
            }
            try {
                c3547eGB = interfaceC7733w70CreateImageTranscoder.b(encodedImage, c7678vq02, c6589q70.i, c6589q70.h, encodedImage.getColorSpace());
                i2 = c3547eGB.b;
            } catch (Exception e2) {
                e = e2;
                ((C7647vg) rd0).c.e(rd0, "ResizeAndRotateProducer", e, null);
                if (AbstractC1516Tf.a(i3)) {
                    abstractC1516Tf.e(e);
                }
                c7678vq0.close();
            }
            if (i2 == 2) {
                throw new RuntimeException("Error while transcoding the image");
            }
            C1723Vw c1723VwM = c2137aS0.m(encodedImage, c6589q70.h, c3547eGB, interfaceC7733w70CreateImageTranscoder.getIdentifier());
            UE ueJ = AbstractC8446zt.J(c7678vq0.n());
            try {
                EncodedImage encodedImage2 = new EncodedImage(ueJ);
                encodedImage2.setImageFormat(KF.a);
                try {
                    encodedImage2.parseMetaData();
                    ((C7647vg) rd0).c.a(rd0, "ResizeAndRotateProducer", c1723VwM);
                    if (i2 != 1) {
                        i3 |= 16;
                    }
                    abstractC1516Tf.g(i3, encodedImage2);
                    c7678vq0.close();
                } finally {
                    EncodedImage.closeSafely(encodedImage2);
                }
            } finally {
                AbstractC8446zt.p(ueJ);
            }
        } catch (Throwable th2) {
            th = th2;
            c7678vq02.close();
            throw th;
        }
    }

    public void v0(int i, double d) {
        C6162nu c6162nu = (C6162nu) this.b;
        c6162nu.getClass();
        c6162nu.D(i, Double.doubleToRawLongBits(d));
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Object w(C0572Hc c0572Hc) {
        return AbstractC7209tN0.i(this, c0572Hc);
    }

    @Override // defpackage.W3
    public void w0(Bundle bundle) {
        ((T3) ((S3) this.b)).a("clx", "_ae", bundle);
    }

    public void x0(int i, int i2) {
        C6162nu c6162nu = (C6162nu) this.b;
        c6162nu.H(i, 0);
        c6162nu.F(i2);
    }

    public void y0(int i, int i2) {
        ((C6162nu) this.b).B(i, i2);
    }

    public void z0(int i, long j) {
        ((C6162nu) this.b).D(i, j);
    }

    public /* synthetic */ C1562Tu0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
    }

    public C1562Tu0(C6162nu c6162nu) {
        this.a = 7;
        Charset charset = AbstractC7929x90.a;
        if (c6162nu != null) {
            this.b = c6162nu;
            c6162nu.a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public C1562Tu0(C3513e41 c3513e41) {
        this.a = 18;
        this.b = (IncorrectJpegMetadataQuirk) c3513e41.z0(IncorrectJpegMetadataQuirk.class);
    }

    public C1562Tu0(CameraCaptureSession cameraCaptureSession, Handler handler) {
        this.a = 5;
        if (Build.VERSION.SDK_INT >= 28) {
            this.b = new C0215Cn(cameraCaptureSession, null);
        } else {
            this.b = new ES1(cameraCaptureSession, new C1304Qm0(6, handler));
        }
    }

    public C1562Tu0(int i) {
        InterfaceC6536pr0 interfaceC6536pr0;
        this.a = i;
        switch (i) {
            case 11:
                this.b = H12.a(Looper.getMainLooper());
                break;
            case 14:
                this.b = (ExtensionDisabledQuirk) AbstractC7196tJ.a.z0(ExtensionDisabledQuirk.class);
                break;
            case 19:
                this.b = new HashSet();
                break;
            case 22:
                break;
            default:
                try {
                    interfaceC6536pr0 = (InterfaceC6536pr0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC6536pr0 = c;
                }
                InterfaceC6536pr0[] interfaceC6536pr0Arr = {C6182o00.b, interfaceC6536pr0};
                C1148Om0 c1148Om0 = new C1148Om0();
                c1148Om0.a = interfaceC6536pr0Arr;
                Charset charset = AbstractC7929x90.a;
                this.b = c1148Om0;
                break;
        }
    }

    @Override // defpackage.TC
    public void b() {
    }

    @Override // defpackage.InterfaceC4279i50
    public InterfaceC4279i50 J(boolean z) {
        return this;
    }

    @Override // defpackage.InterfaceC4279i50
    public InterfaceC4279i50 a0(boolean z) {
        return this;
    }

    @Override // defpackage.InterfaceC4279i50
    public InterfaceC4279i50 d(EnumC3706f50 enumC3706f50) {
        return this;
    }

    @Override // defpackage.InterfaceC8127yC
    public long e(long j, long j2) {
        return j2;
    }
}
