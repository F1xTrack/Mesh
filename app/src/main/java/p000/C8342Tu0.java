package p000;

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
public class C8342Tu0 implements InterfaceC1208TC, InterfaceC11281uN0, InterfaceC8294Sw0, InterfaceC1388W3, InterfaceC6238jS, Provider, InterfaceC9071d60, InterfaceC0980PZ, InterfaceC9709i50, InterfaceC8460Wb0, InterfaceC6622pW, InterfaceC7186yC {

    /* renamed from: c */
    public static final C10463o00 f11588c = new C10463o00(1);

    /* renamed from: a */
    public final /* synthetic */ int f11589a;

    /* renamed from: b */
    public Object f11590b;

    public /* synthetic */ C8342Tu0(int i, Object obj) {
        this.f11589a = i;
        this.f11590b = obj;
    }

    /* renamed from: q0 */
    public static C8342Tu0 m7803q0(C0428Gn c0428Gn) {
        DynamicRangeProfiles dynamicRangeProfilesM4498k;
        int i = Build.VERSION.SDK_INT;
        C8342Tu0 c8342Tu0 = null;
        if (i >= 33 && (dynamicRangeProfilesM4498k = AbstractC0632K1.m4498k(c0428Gn.m3155a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            AbstractC9104dM1.m17550i(i >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
            c8342Tu0 = new C8342Tu0(12, new C0464HM(dynamicRangeProfilesM4498k));
        }
        return c8342Tu0 == null ? C0527IM.f4905a : c8342Tu0;
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: A */
    public /* synthetic */ Set mo4787A(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24892d(this, c0480Hc);
    }

    /* renamed from: A0 */
    public void m7804A0(int i, float f) {
        C6518nu c6518nu = (C6518nu) this.f11590b;
        c6518nu.getClass();
        c6518nu.m23268B(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: B0 */
    public void m7805B0(int i, Object obj, DV0 dv0) {
        C6518nu c6518nu = (C6518nu) this.f11590b;
        c6518nu.m23274H(i, 3);
        dv0.mo1714g((AbstractC0568J0) obj, c6518nu.f38599a);
        c6518nu.m23274H(i, 4);
    }

    /* renamed from: C0 */
    public void m7806C0(int i, int i2) {
        C6518nu c6518nu = (C6518nu) this.f11590b;
        c6518nu.m23274H(i, 0);
        c6518nu.m23272F(i2);
    }

    /* renamed from: D0 */
    public void m7807D0(int i, long j) {
        ((C6518nu) this.f11590b).m23276J(i, j);
    }

    /* renamed from: E0 */
    public void m7808E0(int i, Object obj, DV0 dv0) {
        AbstractC0568J0 abstractC0568J0 = (AbstractC0568J0) obj;
        C6518nu c6518nu = (C6518nu) this.f11590b;
        c6518nu.m23274H(i, 2);
        c6518nu.m23275I(abstractC0568J0.mo4101c(dv0));
        dv0.mo1714g(abstractC0568J0, c6518nu.f38599a);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: F */
    public /* synthetic */ Object mo4788F(C0480Hc c0480Hc, EnumC6791rw enumC6791rw) {
        return AbstractC11153tN0.m24899k(this, c0480Hc, enumC6791rw);
    }

    /* renamed from: F0 */
    public void m7809F0(int i, int i2) {
        ((C6518nu) this.f11590b).m23268B(i, i2);
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: G */
    public EnumC9453g50 mo6760G() {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) this.f11590b;
        if (ruleBasedCollator == null) {
            return EnumC9453g50.f27558e;
        }
        int strength = ruleBasedCollator.getStrength();
        return strength == 0 ? EnumC9453g50.f27554a : strength == 1 ? EnumC9453g50.f27555b : EnumC9453g50.f27557d;
    }

    /* renamed from: G0 */
    public void m7810G0(int i, long j) {
        ((C6518nu) this.f11590b).m23270D(i, j);
    }

    /* renamed from: H0 */
    public void m7811H0(int i, int i2) {
        C6518nu c6518nu = (C6518nu) this.f11590b;
        c6518nu.m23274H(i, 0);
        c6518nu.m23275I((i2 >> 31) ^ (i2 << 1));
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: I */
    public long mo3612I(long j, long j2) {
        return 0L;
    }

    /* renamed from: I0 */
    public void m7812I0(int i, long j) {
        ((C6518nu) this.f11590b).m23276J(i, (j >> 63) ^ (j << 1));
    }

    /* renamed from: J0 */
    public void m7813J0(int i, int i2) {
        C6518nu c6518nu = (C6518nu) this.f11590b;
        c6518nu.m23274H(i, 0);
        c6518nu.m23275I(i2);
    }

    /* renamed from: K0 */
    public void m7814K0(int i, long j) {
        ((C6518nu) this.f11590b).m23276J(i, j);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: L */
    public void mo4789L(InterfaceC6711qw interfaceC6711qw) {
        getConfig().mo4789L(interfaceC6711qw);
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: O */
    public InterfaceC9709i50 mo6768O(Y40 y40) {
        C8010Nk0 c8010Nk0 = (C8010Nk0) y40;
        c8010Nk0.m5827h();
        this.f11590b = (RuleBasedCollator) Collator.getInstance(c8010Nk0.f7982a);
        return this;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: P */
    public boolean mo3613P() {
        return true;
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: Q */
    public /* synthetic */ boolean mo4790Q(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24889a(this, c0480Hc);
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: R */
    public long mo3614R() {
        return 0L;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: W */
    public long mo3615W(long j) {
        return 1L;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: X */
    public long mo3616X(long j, long j2) {
        return 1L;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: a */
    public long mo3617a(long j) {
        return 0L;
    }

    @Override // p000.InterfaceC8294Sw0
    /* renamed from: c */
    public Object mo386c() {
        Class cls = (Class) this.f11590b;
        try {
            return AbstractC7379Bg1.f972a.mo799a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0013  */
    @Override // p000.InterfaceC6622pW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(p000.InterfaceC6748rW r7, p000.InterfaceC1382Vy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p000.C0944P
            if (r0 == 0) goto L13
            r0 = r8
            P r0 = (p000.C0944P) r0
            int r1 = r0.f8773d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8773d = r1
            goto L18
        L13:
            P r0 = new P
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f8771b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f8773d
            Tf1 r3 = p000.C8313Tf1.f11463a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            NU0 r7 = r0.f8770a
            p000.RQ1.m7017d(r8)     // Catch: java.lang.Throwable -> L2b
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
            p000.RQ1.m7017d(r8)
            NU0 r8 = new NU0
            Bz r2 = r0.getContext()
            r8.<init>(r7, r2)
            r0.f8770a = r8     // Catch: java.lang.Throwable -> L5d
            r0.f8773d = r4     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r6.f11590b     // Catch: java.lang.Throwable -> L5d
            w11 r7 = (p000.C11491w11) r7     // Catch: java.lang.Throwable -> L5d
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C8342Tu0.collect(rW, Vy):java.lang.Object");
    }

    @Override // p000.InterfaceC6238jS
    public Object create() {
        C1002Pv c1002Pv = (C1002Pv) this.f11590b;
        return new C0466HO((B10) c1002Pv.f9351a, (B10) c1002Pv.f9352b, (B10) c1002Pv.f9353c, (B10) c1002Pv.f9354d, (C0277EO) c1002Pv.f9355e, (C0277EO) c1002Pv.f9356f, (C8539Xo1) c1002Pv.f9357g);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: d0 */
    public /* synthetic */ EnumC6791rw mo4791d0(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24891c(this, c0480Hc);
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: f */
    public InterfaceC9709i50 mo6775f(EnumC9453g50 enumC9453g50) {
        int iOrdinal = enumC9453g50.ordinal();
        if (iOrdinal == 0) {
            ((RuleBasedCollator) this.f11590b).setStrength(0);
        } else if (iOrdinal == 1) {
            ((RuleBasedCollator) this.f11590b).setStrength(1);
        } else if (iOrdinal == 2) {
            ((RuleBasedCollator) this.f11590b).setStrength(0);
        } else if (iOrdinal == 3) {
            ((RuleBasedCollator) this.f11590b).setStrength(2);
        }
        return this;
    }

    /* renamed from: f0 */
    public C11473vt0 m7815f0() {
        Map mapMo24795b = ((AbstractC11130tB1) this.f11590b).mo24795b();
        C11345ut0 c11345ut0 = new C11345ut0();
        C11473vt0 c11473vt0 = new C11473vt0(mapMo24795b);
        c11473vt0.f44580f = c11345ut0;
        return c11473vt0;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: g */
    public long mo3621g(long j, long j2) {
        return 0L;
    }

    @Override // javax.inject.Provider
    public Object get() {
        InterfaceC9347fG0 interfaceC9347fG0 = (InterfaceC9347fG0) ((C8071Oo1) this.f11590b).f8629c;
        AbstractC8971cM1.m10691d(interfaceC9347fG0);
        return interfaceC9347fG0;
    }

    @Override // p000.InterfaceC11281uN0
    public InterfaceC6854sw getConfig() {
        return (InterfaceC6854sw) this.f11590b;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: h */
    public long mo3622h(long j, long j2) {
        return -9223372036854775807L;
    }

    /* renamed from: h0 */
    public Drawable m7816h0(InterfaceC7103wt interfaceC7103wt) {
        try {
            AbstractC4250iZ.m19063b();
            if (!(interfaceC7103wt instanceof InterfaceC0056At)) {
                AbstractC4250iZ.m19063b();
                return null;
            }
            InterfaceC0056At interfaceC0056At = (InterfaceC0056At) interfaceC7103wt;
            BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) this.f11590b, ((C1336VE) interfaceC0056At).f12446d);
            if ((((C1336VE) interfaceC0056At).f12448f == 0 || ((C1336VE) interfaceC0056At).f12448f == -1) && (((C1336VE) interfaceC0056At).f12449g == 1 || ((C1336VE) interfaceC0056At).f12449g == 0)) {
                return bitmapDrawable;
            }
            return new C8454Vy0(bitmapDrawable, ((C1336VE) interfaceC0056At).f12448f, ((C1336VE) interfaceC0056At).f12449g);
        } finally {
            AbstractC4250iZ.m19063b();
        }
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: i */
    public C9481gJ0 mo3623i(long j) {
        return (C9481gJ0) this.f11590b;
    }

    @Override // p000.InterfaceC9071d60
    /* renamed from: i0 */
    public void mo2076i0(C11814yZ0 c11814yZ0) {
        Frame frame = new Frame(c11814yZ0);
        try {
            frame.incrementRefCount();
            ((C4140gp) this.f11590b).m18649b(frame);
        } finally {
            frame.decrementRefCount();
        }
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: l */
    public int mo6776l(String str, String str2) {
        return ((RuleBasedCollator) this.f11590b).compare(str, str2);
    }

    @Override // p000.InterfaceC1208TC
    /* renamed from: m */
    public Object mo2902m() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f11590b;
        byteBuffer.position(0);
        return byteBuffer;
    }

    /* renamed from: o0 */
    public C9196e41 m7817o0(C0055As c0055As, C10417nd0 c10417nd0) {
        C11667xP0 c11667xP0M25185a;
        O90.m5968f(c0055As, "classId");
        O90.m5968f(c10417nd0, "jvmMetadataVersion");
        String strM1553l = D51.m1553l(c0055As.m364h().m4654b(), '.', '$');
        if (!c0055As.m363g().m4656d()) {
            strM1553l = c0055As.m363g() + '.' + strM1553l;
        }
        Class clsM22425b = AbstractC10134lP1.m22425b((ClassLoader) this.f11590b, strM1553l);
        if (clsM22425b == null || (c11667xP0M25185a = AbstractC11286uP1.m25185a(clsM22425b)) == null) {
            return null;
        }
        return new C9196e41(21, c11667xP0M25185a);
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        switch (this.f11589a) {
            case 17:
                ((C10607p60) this.f11590b).close();
                break;
            default:
                String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(((C0541Ia) this.f11590b).hashCode()));
                AbstractC7806Jm0.m4412f("Recorder");
                break;
        }
    }

    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        switch (this.f11589a) {
            case 17:
                break;
            default:
                String.format("Released audio source successfully: 0x%x", Integer.valueOf(((C0541Ia) this.f11590b).hashCode()));
                AbstractC7806Jm0.m4412f("Recorder");
                break;
        }
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: q */
    public /* synthetic */ Object mo4792q(C0480Hc c0480Hc, Object obj) {
        return AbstractC11153tN0.m24898j(this, c0480Hc, obj);
    }

    /* renamed from: r0 */
    public C11075sm0 m7818r0(Context context, String str, InputStream inputStream, String str2, String str3) {
        C11075sm0 c11075sm0M10860f;
        EnumC7140xT enumC7140xT;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        C7978Mu0 c7978Mu0 = (C7978Mu0) this.f11590b;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            AbstractC11201tl0.m24979a();
            EnumC7140xT enumC7140xT2 = EnumC7140xT.ZIP;
            c11075sm0M10860f = str3 != null ? AbstractC9022cm0.m10860f(context, new ZipInputStream(new FileInputStream(c7978Mu0.m5468P(str, inputStream, enumC7140xT2))), str) : AbstractC9022cm0.m10860f(context, new ZipInputStream(inputStream), null);
            enumC7140xT = enumC7140xT2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            AbstractC11201tl0.m24979a();
            enumC7140xT = EnumC7140xT.GZIP;
            c11075sm0M10860f = str3 != null ? AbstractC9022cm0.m10857c(new GZIPInputStream(new FileInputStream(c7978Mu0.m5468P(str, inputStream, enumC7140xT))), str) : AbstractC9022cm0.m10857c(new GZIPInputStream(inputStream), null);
        } else {
            AbstractC11201tl0.m24979a();
            enumC7140xT = EnumC7140xT.JSON;
            c11075sm0M10860f = str3 != null ? AbstractC9022cm0.m10857c(new FileInputStream(c7978Mu0.m5468P(str, inputStream, enumC7140xT).getAbsolutePath()), str) : AbstractC9022cm0.m10857c(inputStream, null);
        }
        if (str3 != null && c11075sm0M10860f.f42591a != null) {
            File file = new File(c7978Mu0.m5466I(), C7978Mu0.m5463b(str, enumC7140xT, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            AbstractC11201tl0.m24979a();
            if (!zRenameTo) {
                AbstractC11201tl0.m24980b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return c11075sm0M10860f;
    }

    /* renamed from: s0 */
    public boolean m7819s0(String str) {
        if (((ExtensionDisabledQuirk) this.f11590b) == null) {
            return false;
        }
        String str2 = Build.BRAND;
        return ((!("google".equalsIgnoreCase(str2) && "redfin".equalsIgnoreCase(Build.DEVICE)) || (AbstractC0783MR.m5368h(C1299Ue.f11946g) && AbstractC0783MR.m5365c().mo4324f())) && ((!"motorola".equalsIgnoreCase(str2) || !AbstractC0783MR.m5367g(C1299Ue.f11945f)) && (!"realme".equalsIgnoreCase(str2) || !AbstractC0783MR.m5367g(C1299Ue.f11945f)))) ? (!"samsung".equalsIgnoreCase(str2) || !"a52sxq".equalsIgnoreCase(Build.DEVICE)) ? false : str.equals("0") : true;
    }

    /* renamed from: t0 */
    public void m7820t0(int i, boolean z) {
        C6518nu c6518nu = (C6518nu) this.f11590b;
        c6518nu.m23274H(i, 0);
        c6518nu.m23278y(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: u */
    public /* synthetic */ Set mo4793u() {
        return AbstractC11153tN0.m24895g(this);
    }

    /* renamed from: u0 */
    public void m7821u0(int i, C0299Ek c0299Ek) {
        C6518nu c6518nu = (C6518nu) this.f11590b;
        c6518nu.m23274H(i, 2);
        c6518nu.m23267A(c0299Ek);
    }

    @Override // p000.InterfaceC8460Wb0
    /* renamed from: v */
    public void mo5831v(EncodedImage encodedImage, int i) throws Throwable {
        C11467vq0 c11467vq0;
        C3979eG c3979eGMo2547b;
        int i2;
        int i3 = i;
        C8726aS0 c8726aS0 = (C8726aS0) this.f11590b;
        if (encodedImage == null) {
            c8726aS0.f46773b.m7719g(i3, null);
            return;
        }
        InterfaceC11504w70 interfaceC11504w70CreateImageTranscoder = c8726aS0.f15516d.createImageTranscoder(encodedImage.getImageFormat(), c8726aS0.f15515c);
        AbstractC1237Tf abstractC1237Tf = c8726aS0.f46773b;
        RD0 rd0 = c8726aS0.f15517e;
        C7027vg c7027vg = (C7027vg) rd0;
        c7027vg.f44475c.mo752j(rd0, "ResizeAndRotateProducer");
        C10737q70 c10737q70 = c7027vg.f44473a;
        C1339VH c1339vh = c8726aS0.f15520h.f17030b;
        c1339vh.getClass();
        AbstractC10955rq0 abstractC10955rq0 = (AbstractC10955rq0) c1339vh.f12486b;
        C11467vq0 c11467vq02 = new C11467vq0(abstractC10955rq0, abstractC10955rq0.f41927j[0]);
        try {
            try {
                c11467vq0 = c11467vq02;
            } catch (Exception e) {
                e = e;
                c11467vq0 = c11467vq02;
            } catch (Throwable th) {
                th = th;
                c11467vq02.close();
                throw th;
            }
            try {
                c3979eGMo2547b = interfaceC11504w70CreateImageTranscoder.mo2547b(encodedImage, c11467vq02, c10737q70.f40616i, c10737q70.f40615h, encodedImage.getColorSpace());
                i2 = c3979eGMo2547b.f26623b;
            } catch (Exception e2) {
                e = e2;
                ((C7027vg) rd0).f44475c.mo747e(rd0, "ResizeAndRotateProducer", e, null);
                if (AbstractC1237Tf.m7714a(i3)) {
                    abstractC1237Tf.m7718e(e);
                }
                c11467vq0.close();
            }
            if (i2 == 2) {
                throw new RuntimeException("Error while transcoding the image");
            }
            C1380Vw c1380VwM9747m = c8726aS0.m9747m(encodedImage, c10737q70.f40615h, c3979eGMo2547b, interfaceC11504w70CreateImageTranscoder.getIdentifier());
            C1273UE c1273ueM26566J = AbstractC7292zt.m26566J(c11467vq0.m25523n());
            try {
                EncodedImage encodedImage2 = new EncodedImage(c1273ueM26566J);
                encodedImage2.setImageFormat(AbstractC0646KF.f5957a);
                try {
                    encodedImage2.parseMetaData();
                    ((C7027vg) rd0).f44475c.mo743a(rd0, "ResizeAndRotateProducer", c1380VwM9747m);
                    if (i2 != 1) {
                        i3 |= 16;
                    }
                    abstractC1237Tf.m7719g(i3, encodedImage2);
                    c11467vq0.close();
                } finally {
                    EncodedImage.closeSafely(encodedImage2);
                }
            } finally {
                AbstractC7292zt.m26569p(c1273ueM26566J);
            }
        } catch (Throwable th2) {
            th = th2;
            c11467vq02.close();
            throw th;
        }
    }

    /* renamed from: v0 */
    public void m7822v0(int i, double d) {
        C6518nu c6518nu = (C6518nu) this.f11590b;
        c6518nu.getClass();
        c6518nu.m23270D(i, Double.doubleToRawLongBits(d));
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: w */
    public /* synthetic */ Object mo4794w(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24897i(this, c0480Hc);
    }

    @Override // p000.InterfaceC1388W3
    /* renamed from: w0 */
    public void mo1476w0(Bundle bundle) {
        ((C1199T3) ((InterfaceC1136S3) this.f11590b)).m7538a("clx", "_ae", bundle);
    }

    /* renamed from: x0 */
    public void m7823x0(int i, int i2) {
        C6518nu c6518nu = (C6518nu) this.f11590b;
        c6518nu.m23274H(i, 0);
        c6518nu.m23272F(i2);
    }

    /* renamed from: y0 */
    public void m7824y0(int i, int i2) {
        ((C6518nu) this.f11590b).m23268B(i, i2);
    }

    /* renamed from: z0 */
    public void m7825z0(int i, long j) {
        ((C6518nu) this.f11590b).m23270D(i, j);
    }

    public /* synthetic */ C8342Tu0(Object obj, int i, Object obj2) {
        this.f11589a = i;
        this.f11590b = obj;
    }

    public C8342Tu0(C6518nu c6518nu) {
        this.f11589a = 7;
        Charset charset = AbstractC11635x90.f45425a;
        if (c6518nu != null) {
            this.f11590b = c6518nu;
            c6518nu.f38599a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public C8342Tu0(C9196e41 c9196e41) {
        this.f11589a = 18;
        this.f11590b = (IncorrectJpegMetadataQuirk) c9196e41.m17864z0(IncorrectJpegMetadataQuirk.class);
    }

    public C8342Tu0(CameraCaptureSession cameraCaptureSession, Handler handler) {
        this.f11589a = 5;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11590b = new C0176Cn(cameraCaptureSession, null);
        } else {
            this.f11590b = new ES1(cameraCaptureSession, new C8170Qm0(6, handler));
        }
    }

    public C8342Tu0(int i) {
        InterfaceC10701pr0 interfaceC10701pr0;
        this.f11589a = i;
        switch (i) {
            case 11:
                this.f11590b = H12.m3240a(Looper.getMainLooper());
                break;
            case 14:
                this.f11590b = (ExtensionDisabledQuirk) AbstractC6878tJ.f42992a.m17864z0(ExtensionDisabledQuirk.class);
                break;
            case 19:
                this.f11590b = new HashSet();
                break;
            case 22:
                break;
            default:
                try {
                    interfaceC10701pr0 = (InterfaceC10701pr0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC10701pr0 = f11588c;
                }
                InterfaceC10701pr0[] interfaceC10701pr0Arr = {C10463o00.f38667b, interfaceC10701pr0};
                C8066Om0 c8066Om0 = new C8066Om0();
                c8066Om0.f8613a = interfaceC10701pr0Arr;
                Charset charset = AbstractC11635x90.f45425a;
                this.f11590b = c8066Om0;
                break;
        }
    }

    @Override // p000.InterfaceC1208TC
    /* renamed from: b */
    public void mo2895b() {
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: J */
    public InterfaceC9709i50 mo6763J(boolean z) {
        return this;
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: a0 */
    public InterfaceC9709i50 mo6773a0(boolean z) {
        return this;
    }

    @Override // p000.InterfaceC9709i50
    /* renamed from: d */
    public InterfaceC9709i50 mo6774d(EnumC9325f50 enumC9325f50) {
        return this;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: e */
    public long mo3619e(long j, long j2) {
        return j2;
    }
}
