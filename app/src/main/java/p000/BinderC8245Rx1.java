package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Rx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC8245Rx1 extends QA1 implements FB1 {

    /* renamed from: h */
    public static final int[] f10493h = {5, 7, 7, 7, 5, 5};

    /* renamed from: i */
    public static final double[][] f10494i = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* renamed from: a */
    public final Context f10495a;

    /* renamed from: b */
    public final RA1 f10496b;

    /* renamed from: g */
    public BarhopperV3 f10497g;

    public BinderC8245Rx1(Context context, RA1 ra1) {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
        this.f10495a = context;
        this.f10496b = ra1;
    }

    /* renamed from: I */
    public static C11740xz1 m7130I(C10782qT1 c10782qT1, String str, String str2) {
        if (c10782qT1 == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new C11740xz1(c10782qT1.m24012s(), c10782qT1.m24010q(), c10782qT1.m24007n(), c10782qT1.m24008o(), c10782qT1.m24009p(), c10782qT1.m24011r(), c10782qT1.m24013u(), matcher.find() ? matcher.group(1) : null);
    }

    @Override // p000.QA1
    /* renamed from: G */
    public final boolean mo6254G(int i, Parcel parcel, Parcel parcel2) throws IOException {
        if (i == 1) {
            m7131H();
            parcel2.writeNoException();
        } else if (i == 2) {
            BarhopperV3 barhopperV3 = this.f10497g;
            if (barhopperV3 != null) {
                barhopperV3.close();
                this.f10497g = null;
            }
            parcel2.writeNoException();
        } else if (i == 3) {
            InterfaceC9197e50 interfaceC9197e50M10546G = BinderC8916bx0.m10546G(parcel.readStrongBinder());
            WC1 wc1 = (WC1) OC1.m5981a(parcel, WC1.CREATOR);
            OC1.m5982b(parcel);
            RecognitionOptions recognitionOptions = new RecognitionOptions();
            RA1 ra1 = this.f10496b;
            recognitionOptions.m11155a(ra1.f10053a);
            recognitionOptions.m11160f(ra1.f10054b);
            recognitionOptions.m11156b();
            recognitionOptions.m11157c();
            ArrayList arrayListM7133K = m7133K(interfaceC9197e50M10546G, wc1, recognitionOptions);
            parcel2.writeNoException();
            parcel2.writeTypedList(arrayListM7133K);
        } else if (i == 4) {
            InterfaceC9197e50 interfaceC9197e50M10546G2 = BinderC8916bx0.m10546G(parcel.readStrongBinder());
            WC1 wc12 = (WC1) OC1.m5981a(parcel, WC1.CREATOR);
            WA1 wa1 = (WA1) OC1.m5981a(parcel, WA1.CREATOR);
            OC1.m5982b(parcel);
            RecognitionOptions recognitionOptions2 = new RecognitionOptions();
            RA1 ra12 = this.f10496b;
            recognitionOptions2.m11155a(ra12.f10053a);
            recognitionOptions2.m11160f(ra12.f10054b);
            recognitionOptions2.m11156b();
            recognitionOptions2.m11157c();
            MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
            multiScaleDecodingOptions.m11151a(wa1.f13029a.f25867a);
            C9084dC1 c9084dC1 = wa1.f13029a;
            multiScaleDecodingOptions.m11152b(c9084dC1.f25868b);
            multiScaleDecodingOptions.m11153c(c9084dC1.f25869c);
            recognitionOptions2.m11158d(multiScaleDecodingOptions);
            MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
            multiScaleDetectionOptions.m11154a(c9084dC1.f25867a);
            recognitionOptions2.m11159e(multiScaleDetectionOptions);
            recognitionOptions2.m11161g(wa1.f13032d);
            ArrayList arrayListM7133K2 = m7133K(interfaceC9197e50M10546G2, wc12, recognitionOptions2);
            parcel2.writeNoException();
            parcel2.writeTypedList(arrayListM7133K2);
        } else {
            if (i != 5) {
                return false;
            }
            OC1.m5982b(parcel);
            m7131H();
            parcel2.writeNoException();
        }
        return true;
    }

    /* renamed from: H */
    public final void m7131H() throws IOException {
        Context context = this.f10495a;
        if (this.f10497g != null) {
            return;
        }
        BarhopperV3 barhopperV3 = new BarhopperV3();
        System.loadLibrary("barhopper_v3");
        this.f10497g = barhopperV3;
        LM1 lm1M4962n = LO1.m4962n();
        C9348fG1 c9348fG1M10444n = C8835bI1.m10444n();
        int i = 16;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            GA1 ga1M1591n = DC1.m1591n();
            ga1M1591n.m23960j();
            DC1.m1595r((DC1) ga1M1591n.f40713b, i);
            ga1M1591n.m23960j();
            DC1.m1592o((DC1) ga1M1591n.f40713b, i);
            for (int i4 = 0; i4 < f10493h[i3]; i4++) {
                double[] dArr = f10494i[i2];
                double d = dArr[0] * 320.0d;
                float fSqrt = (float) Math.sqrt(dArr[1]);
                float f = (float) d;
                ga1M1591n.m23960j();
                DC1.m1593p((DC1) ga1M1591n.f40713b, f / fSqrt);
                ga1M1591n.m23960j();
                DC1.m1594q((DC1) ga1M1591n.f40713b, f * fSqrt);
                i2++;
            }
            i += i;
            c9348fG1M10444n.m23960j();
            C8835bI1.m10445o((C8835bI1) c9348fG1M10444n.f40713b, (DC1) ga1M1591n.m23959e());
        }
        lm1M4962n.m23960j();
        LO1.m4963o((LO1) lm1M4962n.f40713b, (C8835bI1) c9348fG1M10444n.m23959e());
        try {
            InputStream inputStreamOpen = context.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream inputStreamOpen2 = context.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream inputStreamOpen3 = context.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV32 = (BarhopperV3) Preconditions.checkNotNull(this.f10497g);
                        XR1 xr1M3536n = C0483Hf.m3536n();
                        JE1 je1M4259E = JE1.m4259E(inputStreamOpen);
                        lm1M4962n.m23960j();
                        LO1.m4964p((LO1) lm1M4962n.f40713b, je1M4259E);
                        xr1M3536n.m23960j();
                        C0483Hf.m3537o((C0483Hf) xr1M3536n.f40713b, (LO1) lm1M4962n.m23959e());
                        C8609Yx1 c8609Yx1M17804n = C9180dy1.m17804n();
                        JE1 je1M4259E2 = JE1.m4259E(inputStreamOpen2);
                        c8609Yx1M17804n.m23960j();
                        C9180dy1.m17806p((C9180dy1) c8609Yx1M17804n.f40713b, je1M4259E2);
                        JE1 je1M4259E3 = JE1.m4259E(inputStreamOpen3);
                        c8609Yx1M17804n.m23960j();
                        C9180dy1.m17805o((C9180dy1) c8609Yx1M17804n.f40713b, je1M4259E3);
                        xr1M3536n.m23960j();
                        C0483Hf.m3538p((C0483Hf) xr1M3536n.f40713b, (C9180dy1) c8609Yx1M17804n.m23959e());
                        barhopperV32.m11147a((C0483Hf) xr1M3536n.m23959e());
                        if (inputStreamOpen3 != null) {
                            inputStreamOpen3.close();
                        }
                        if (inputStreamOpen2 != null) {
                            inputStreamOpen2.close();
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed to open Barcode models", e);
        }
    }

    /* renamed from: J */
    public final C0420Gf m7132J(ByteBuffer byteBuffer, WC1 wc1, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.f10497g);
        if (((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).isDirect()) {
            return barhopperV3.m11148c(wc1.f13061b, wc1.f13062c, byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.m11149e(wc1.f13061b, wc1.f13062c, byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.m11149e(wc1.f13061b, wc1.f13062c, bArr, recognitionOptions);
    }

    /* renamed from: K */
    public final ArrayList m7133K(InterfaceC9197e50 interfaceC9197e50, WC1 wc1, RecognitionOptions recognitionOptions) {
        C0420Gf c0420GfM11150f;
        Matrix matrix;
        C8249Rz1 c8249Rz1;
        C9592hA1 c9592hA1;
        C10232mA1 c10232mA1;
        C11128tA1 c11128tA1;
        C10744qA1 c10744qA1;
        C8561Xz1 c8561Xz1;
        C7365Az1 c7365Az1;
        C7625Fz1 c7625Fz1;
        C7989Mz1 c7989Mz1;
        int i;
        int i2;
        String strMo3013v;
        int i3;
        byte[] bArr;
        Point[] pointArr;
        int i4;
        int i5;
        C9592hA1[] c9592hA1Arr;
        C8249Rz1[] c8249Rz1Arr;
        C10846qz1[] c10846qz1Arr;
        String strMo3013v2;
        String strMo3013v3;
        int i6 = wc1.f13060a;
        int i7 = 0;
        int i8 = -1;
        if (i6 == -1) {
            c0420GfM11150f = ((BarhopperV3) Preconditions.checkNotNull(this.f10497g)).m11150f((Bitmap) BinderC8916bx0.m10547H(interfaceC9197e50), recognitionOptions);
        } else if (i6 == 17) {
            c0420GfM11150f = m7132J((ByteBuffer) BinderC8916bx0.m10547H(interfaceC9197e50), wc1, recognitionOptions);
        } else if (i6 != 35) {
            if (i6 != 842094169) {
                throw new IllegalArgumentException("Unsupported image format: " + wc1.f13060a);
            }
            c0420GfM11150f = m7132J((ByteBuffer) BinderC8916bx0.m10547H(interfaceC9197e50), wc1, recognitionOptions);
        } else {
            c0420GfM11150f = m7132J(((Image) Preconditions.checkNotNull((Image) BinderC8916bx0.m10547H(interfaceC9197e50))).getPlanes()[0].getBuffer(), wc1, recognitionOptions);
        }
        ArrayList arrayList = new ArrayList();
        C11885z70.f46640a.getClass();
        QG1 qg1 = null;
        int i9 = wc1.f13063d;
        if (i9 == 0) {
            matrix = null;
        } else {
            matrix = new Matrix();
            int i10 = wc1.f13061b;
            int i11 = wc1.f13062c;
            matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
            matrix.postRotate(i9 * 90);
            int i12 = i9 % 2;
            int i13 = i12 != 0 ? i11 : i10;
            if (i12 == 0) {
                i10 = i11;
            }
            matrix.postTranslate(i13 / 2.0f, i10 / 2.0f);
        }
        for (GC1 gc1 : c0420GfM11150f.m3118o()) {
            int i14 = 5;
            if (gc1.m2984o() > 0 && matrix != null) {
                float[] fArr = new float[8];
                InterfaceC11270uH1 interfaceC11270uH1M2972A = gc1.m2972A();
                int iM2984o = gc1.m2984o();
                for (int i15 = i7; i15 < iM2984o; i15++) {
                    int i16 = i15 + i15;
                    fArr[i16] = ((C10972ry1) interfaceC11270uH1M2972A.get(i15)).m24562n();
                    fArr[i16 + 1] = ((C10972ry1) interfaceC11270uH1M2972A.get(i15)).m24563o();
                }
                matrix.mapPoints(fArr);
                int i17 = i7;
                while (i17 < iM2984o) {
                    AbstractC10756qG1 abstractC10756qG1 = (AbstractC10756qG1) gc1.mo180m(i14, qg1);
                    if (!abstractC10756qG1.f40712a.equals(gc1)) {
                        if (!abstractC10756qG1.f40713b.m6626k()) {
                            abstractC10756qG1.mo1686k();
                        }
                        QG1 qg12 = abstractC10756qG1.f40713b;
                        C9482gJ1.f27672c.m18426a(qg12.getClass()).mo7663c(qg12, gc1);
                    }
                    KA1 ka1 = (KA1) abstractC10756qG1;
                    int i18 = i17 + i17;
                    C10716py1 c10716py1M24559p = C10972ry1.m24559p();
                    int i19 = (int) fArr[i18];
                    c10716py1M24559p.m23960j();
                    C10972ry1.m24560q((C10972ry1) c10716py1M24559p.f40713b, i19);
                    int i20 = (int) fArr[i18 + 1];
                    c10716py1M24559p.m23960j();
                    C10972ry1.m24561r((C10972ry1) c10716py1M24559p.f40713b, i20);
                    C10972ry1 c10972ry1 = (C10972ry1) c10716py1M24559p.m23959e();
                    ka1.m23960j();
                    GC1.m2971B((GC1) ka1.f40713b, (i17 + i9) % iM2984o, c10972ry1);
                    gc1 = (GC1) ka1.m23959e();
                    i17++;
                    qg1 = null;
                    i14 = 5;
                }
            }
            if (gc1.m2976F()) {
                B22 b22M2989t = gc1.m2989t();
                c8249Rz1 = new C8249Rz1(b22M2989t.m471o(), b22M2989t.m474r() + i8, b22M2989t.m473q(), b22M2989t.m472p());
            } else {
                c8249Rz1 = null;
            }
            if (gc1.m2978H()) {
                C11771yD1 c11771yD1M2985p = gc1.m2985p();
                c9592hA1 = new C9592hA1(c11771yD1M2985p.m26104p() + i8, c11771yD1M2985p.m26103o());
            } else {
                c9592hA1 = null;
            }
            if (gc1.m2979I()) {
                C7883Ky1 c7883Ky1M2991v = gc1.m2991v();
                c10232mA1 = new C10232mA1(c7883Ky1M2991v.m4796o(), c7883Ky1M2991v.m4797p());
            } else {
                c10232mA1 = null;
            }
            if (gc1.m2981K()) {
                C7417Bz1 c7417Bz1M2993x = gc1.m2993x();
                c11128tA1 = new C11128tA1(c7417Bz1M2993x.m943p(), c7417Bz1M2993x.m942o(), c7417Bz1M2993x.m944q() + i8);
            } else {
                c11128tA1 = null;
            }
            if (gc1.m2980J()) {
                C9310ez1 c9310ez1M2992w = gc1.m2992w();
                c10744qA1 = new C10744qA1(c9310ez1M2992w.m18112o(), c9310ez1M2992w.m18113p());
            } else {
                c10744qA1 = null;
            }
            if (gc1.m2977G()) {
                U32 u32M2990u = gc1.m2990u();
                c8561Xz1 = new C8561Xz1(u32M2990u.m7870n(), u32M2990u.m7871o());
            } else {
                c8561Xz1 = null;
            }
            if (gc1.m2973C()) {
                ZV1 zv1M2986q = gc1.m2986q();
                String strM9547u = zv1M2986q.m9547u();
                String strM9543q = zv1M2986q.m9543q();
                String strM9544r = zv1M2986q.m9544r();
                String strM9545s = zv1M2986q.m9545s();
                String strM9546t = zv1M2986q.m9546t();
                C10782qT1 c10782qT1M9542o = zv1M2986q.m9542o();
                if (gc1.m2994y().mo3015z()) {
                    JE1 je1M2994y = gc1.m2994y();
                    je1M2994y.getClass();
                    strMo3013v2 = je1M2994y.mo3006i() == 0 ? "" : je1M2994y.mo3013v(AbstractC11398vH1.f44320a);
                } else {
                    strMo3013v2 = null;
                }
                C11740xz1 c11740xz1M7130I = m7130I(c10782qT1M9542o, strMo3013v2, "DTSTART:([0-9TZ]*)");
                C10782qT1 c10782qT1M9541n = zv1M2986q.m9541n();
                if (gc1.m2994y().mo3015z()) {
                    JE1 je1M2994y2 = gc1.m2994y();
                    je1M2994y2.getClass();
                    strMo3013v3 = je1M2994y2.mo3006i() == 0 ? "" : je1M2994y2.mo3013v(AbstractC11398vH1.f44320a);
                } else {
                    strMo3013v3 = null;
                }
                c7365Az1 = new C7365Az1(strM9547u, strM9543q, strM9544r, strM9545s, strM9546t, c11740xz1M7130I, m7130I(c10782qT1M9541n, strMo3013v3, "DTEND:([0-9TZ]*)"));
            } else {
                c7365Az1 = null;
            }
            if (gc1.m2974D()) {
                C11686xY1 c11686xY1M2987r = gc1.m2987r();
                C10622pD1 c10622pD1M25914n = c11686xY1M2987r.m25914n();
                C8947cA1 c8947cA1 = c10622pD1M25914n != null ? new C8947cA1(c10622pD1M25914n.m23645p(), c10622pD1M25914n.m23649t(), c10622pD1M25914n.m23648s(), c10622pD1M25914n.m23644o(), c10622pD1M25914n.m23647r(), c10622pD1M25914n.m23646q(), c10622pD1M25914n.m23650u()) : null;
                String strM25915p = c11686xY1M2987r.m25915p();
                String strM25916q = c11686xY1M2987r.m25916q();
                InterfaceC11270uH1 interfaceC11270uH1M25919t = c11686xY1M2987r.m25919t();
                if (interfaceC11270uH1M25919t.isEmpty()) {
                    c9592hA1Arr = null;
                } else {
                    C9592hA1[] c9592hA1Arr2 = new C9592hA1[interfaceC11270uH1M25919t.size()];
                    for (int i21 = i7; i21 < interfaceC11270uH1M25919t.size(); i21++) {
                        c9592hA1Arr2[i21] = new C9592hA1(((C11771yD1) interfaceC11270uH1M25919t.get(i21)).m26104p() + i8, ((C11771yD1) interfaceC11270uH1M25919t.get(i21)).m26103o());
                    }
                    c9592hA1Arr = c9592hA1Arr2;
                }
                InterfaceC11270uH1 interfaceC11270uH1M25918s = c11686xY1M2987r.m25918s();
                if (interfaceC11270uH1M25918s.isEmpty()) {
                    c8249Rz1Arr = null;
                } else {
                    C8249Rz1[] c8249Rz1Arr2 = new C8249Rz1[interfaceC11270uH1M25918s.size()];
                    int i22 = 0;
                    while (i22 < interfaceC11270uH1M25918s.size()) {
                        c8249Rz1Arr2[i22] = new C8249Rz1(((B22) interfaceC11270uH1M25918s.get(i22)).m471o(), ((B22) interfaceC11270uH1M25918s.get(i22)).m474r() + i8, ((B22) interfaceC11270uH1M25918s.get(i22)).m473q(), ((B22) interfaceC11270uH1M25918s.get(i22)).m472p());
                        i22++;
                        i8 = -1;
                    }
                    c8249Rz1Arr = c8249Rz1Arr2;
                }
                String[] strArr = (String[]) c11686xY1M2987r.m25920u().toArray(new String[0]);
                InterfaceC11270uH1 interfaceC11270uH1M25917r = c11686xY1M2987r.m25917r();
                if (interfaceC11270uH1M25917r.isEmpty()) {
                    c10846qz1Arr = null;
                } else {
                    C10846qz1[] c10846qz1Arr2 = new C10846qz1[interfaceC11270uH1M25917r.size()];
                    for (int i23 = 0; i23 < interfaceC11270uH1M25917r.size(); i23++) {
                        c10846qz1Arr2[i23] = new C10846qz1(((C9982kD1) interfaceC11270uH1M25917r.get(i23)).m22172o() - 1, (String[]) ((C9982kD1) interfaceC11270uH1M25917r.get(i23)).m22171n().toArray(new String[0]));
                    }
                    c10846qz1Arr = c10846qz1Arr2;
                }
                c7625Fz1 = new C7625Fz1(c8947cA1, strM25915p, strM25916q, c9592hA1Arr, c8249Rz1Arr, strArr, c10846qz1Arr);
            } else {
                c7625Fz1 = null;
            }
            if (gc1.m2975E()) {
                C9569h02 c9569h02M2988s = gc1.m2988s();
                c7989Mz1 = new C7989Mz1(c9569h02M2988s.m18689t(), c9569h02M2988s.m18691v(), c9569h02M2988s.m18683B(), c9569h02M2988s.m18695z(), c9569h02M2988s.m18692w(), c9569h02M2988s.m18686q(), c9569h02M2988s.m18684o(), c9569h02M2988s.m18685p(), c9569h02M2988s.m18687r(), c9569h02M2988s.m18682A(), c9569h02M2988s.m18693x(), c9569h02M2988s.m18690u(), c9569h02M2988s.m18688s(), c9569h02M2988s.m18694y());
            } else {
                c7989Mz1 = null;
            }
            switch (gc1.m2982L() - 1) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 8;
                    break;
                case 5:
                    i2 = 16;
                    i = i2;
                    break;
                case 6:
                    i2 = 32;
                    i = i2;
                    break;
                case 7:
                    i2 = 64;
                    i = i2;
                    break;
                case 8:
                    i2 = 128;
                    i = i2;
                    break;
                case 9:
                    i2 = 256;
                    i = i2;
                    break;
                case 10:
                    i2 = 512;
                    i = i2;
                    break;
                case 11:
                    i2 = 1024;
                    i = i2;
                    break;
                case 12:
                    i2 = 2048;
                    i = i2;
                    break;
                case 13:
                    i2 = 4096;
                    i = i2;
                    break;
                default:
                    i = -1;
                    break;
            }
            String strM2995z = gc1.m2995z();
            if (gc1.m2994y().mo3015z()) {
                JE1 je1M2994y3 = gc1.m2994y();
                je1M2994y3.getClass();
                strMo3013v = je1M2994y3.mo3006i() != 0 ? je1M2994y3.mo3013v(AbstractC11398vH1.f44320a) : "";
            } else {
                strMo3013v = null;
            }
            JE1 je1M2994y4 = gc1.m2994y();
            int iMo3006i = je1M2994y4.mo3006i();
            if (iMo3006i == 0) {
                bArr = AbstractC11398vH1.f44321b;
                i3 = 0;
            } else {
                byte[] bArr2 = new byte[iMo3006i];
                i3 = 0;
                je1M2994y4.mo3007k(0, bArr2, 0, iMo3006i);
                bArr = bArr2;
            }
            InterfaceC11270uH1 interfaceC11270uH1M2972A2 = gc1.m2972A();
            if (interfaceC11270uH1M2972A2.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[interfaceC11270uH1M2972A2.size()];
                for (int i24 = i3; i24 < interfaceC11270uH1M2972A2.size(); i24++) {
                    pointArr2[i24] = new Point(((C10972ry1) interfaceC11270uH1M2972A2.get(i24)).m24562n(), ((C10972ry1) interfaceC11270uH1M2972A2.get(i24)).m24563o());
                }
                pointArr = pointArr2;
            }
            switch (gc1.m2983n() - 1) {
                case 1:
                    i4 = 1;
                    continue;
                    arrayList.add(new C11384vA1(i, strM2995z, strMo3013v, bArr, pointArr, i4, c8249Rz1, c9592hA1, c10232mA1, c11128tA1, c10744qA1, c8561Xz1, c7365Az1, c7625Fz1, c7989Mz1));
                    i8 = -1;
                    i7 = i3;
                    qg1 = null;
                case 2:
                    i4 = 2;
                    continue;
                    arrayList.add(new C11384vA1(i, strM2995z, strMo3013v, bArr, pointArr, i4, c8249Rz1, c9592hA1, c10232mA1, c11128tA1, c10744qA1, c8561Xz1, c7365Az1, c7625Fz1, c7989Mz1));
                    i8 = -1;
                    i7 = i3;
                    qg1 = null;
                case 3:
                    i5 = 3;
                    break;
                case 4:
                    i4 = 4;
                    continue;
                    arrayList.add(new C11384vA1(i, strM2995z, strMo3013v, bArr, pointArr, i4, c8249Rz1, c9592hA1, c10232mA1, c11128tA1, c10744qA1, c8561Xz1, c7365Az1, c7625Fz1, c7989Mz1));
                    i8 = -1;
                    i7 = i3;
                    qg1 = null;
                case 5:
                    i4 = 5;
                    continue;
                    arrayList.add(new C11384vA1(i, strM2995z, strMo3013v, bArr, pointArr, i4, c8249Rz1, c9592hA1, c10232mA1, c11128tA1, c10744qA1, c8561Xz1, c7365Az1, c7625Fz1, c7989Mz1));
                    i8 = -1;
                    i7 = i3;
                    qg1 = null;
                case 6:
                    i5 = 6;
                    break;
                case 7:
                    i5 = 7;
                    break;
                case 8:
                    i4 = 8;
                    continue;
                    arrayList.add(new C11384vA1(i, strM2995z, strMo3013v, bArr, pointArr, i4, c8249Rz1, c9592hA1, c10232mA1, c11128tA1, c10744qA1, c8561Xz1, c7365Az1, c7625Fz1, c7989Mz1));
                    i8 = -1;
                    i7 = i3;
                    qg1 = null;
                case 9:
                    i5 = 9;
                    break;
                case 10:
                    i5 = 10;
                    break;
                case 11:
                    i5 = 11;
                    break;
                case 12:
                    i5 = 12;
                    break;
                default:
                    i4 = i3;
                    continue;
                    arrayList.add(new C11384vA1(i, strM2995z, strMo3013v, bArr, pointArr, i4, c8249Rz1, c9592hA1, c10232mA1, c11128tA1, c10744qA1, c8561Xz1, c7365Az1, c7625Fz1, c7989Mz1));
                    i8 = -1;
                    i7 = i3;
                    qg1 = null;
            }
            i4 = i5;
            arrayList.add(new C11384vA1(i, strM2995z, strMo3013v, bArr, pointArr, i4, c8249Rz1, c9592hA1, c10232mA1, c11128tA1, c10744qA1, c8561Xz1, c7365Az1, c7625Fz1, c7989Mz1));
            i8 = -1;
            i7 = i3;
            qg1 = null;
        }
        return arrayList;
    }
}
