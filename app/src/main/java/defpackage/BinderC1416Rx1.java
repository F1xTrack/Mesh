package defpackage;

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
public final class BinderC1416Rx1 extends QA1 implements FB1 {
    public static final int[] h = {5, 7, 7, 7, 5, 5};
    public static final double[][] i = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};
    public final Context a;
    public final RA1 b;
    public BarhopperV3 g;

    public BinderC1416Rx1(Context context, RA1 ra1) {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
        this.a = context;
        this.b = ra1;
    }

    public static C8086xz1 I(C6656qT1 c6656qT1, String str, String str2) {
        if (c6656qT1 == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new C8086xz1(c6656qT1.s(), c6656qT1.q(), c6656qT1.n(), c6656qT1.o(), c6656qT1.p(), c6656qT1.r(), c6656qT1.u(), matcher.find() ? matcher.group(1) : null);
    }

    @Override // defpackage.QA1
    public final boolean G(int i2, Parcel parcel, Parcel parcel2) throws IOException {
        if (i2 == 1) {
            H();
            parcel2.writeNoException();
        } else if (i2 == 2) {
            BarhopperV3 barhopperV3 = this.g;
            if (barhopperV3 != null) {
                barhopperV3.close();
                this.g = null;
            }
            parcel2.writeNoException();
        } else if (i2 == 3) {
            InterfaceC3515e50 interfaceC3515e50G = BinderC2421bx0.G(parcel.readStrongBinder());
            WC1 wc1 = (WC1) OC1.a(parcel, WC1.CREATOR);
            OC1.b(parcel);
            RecognitionOptions recognitionOptions = new RecognitionOptions();
            RA1 ra1 = this.b;
            recognitionOptions.a(ra1.a);
            recognitionOptions.f(ra1.b);
            recognitionOptions.b();
            recognitionOptions.c();
            ArrayList arrayListK = K(interfaceC3515e50G, wc1, recognitionOptions);
            parcel2.writeNoException();
            parcel2.writeTypedList(arrayListK);
        } else if (i2 == 4) {
            InterfaceC3515e50 interfaceC3515e50G2 = BinderC2421bx0.G(parcel.readStrongBinder());
            WC1 wc12 = (WC1) OC1.a(parcel, WC1.CREATOR);
            WA1 wa1 = (WA1) OC1.a(parcel, WA1.CREATOR);
            OC1.b(parcel);
            RecognitionOptions recognitionOptions2 = new RecognitionOptions();
            RA1 ra12 = this.b;
            recognitionOptions2.a(ra12.a);
            recognitionOptions2.f(ra12.b);
            recognitionOptions2.b();
            recognitionOptions2.c();
            MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
            multiScaleDecodingOptions.a(wa1.a.a);
            C3347dC1 c3347dC1 = wa1.a;
            multiScaleDecodingOptions.b(c3347dC1.b);
            multiScaleDecodingOptions.c(c3347dC1.c);
            recognitionOptions2.d(multiScaleDecodingOptions);
            MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
            multiScaleDetectionOptions.a(c3347dC1.a);
            recognitionOptions2.e(multiScaleDetectionOptions);
            recognitionOptions2.g(wa1.d);
            ArrayList arrayListK2 = K(interfaceC3515e50G2, wc12, recognitionOptions2);
            parcel2.writeNoException();
            parcel2.writeTypedList(arrayListK2);
        } else {
            if (i2 != 5) {
                return false;
            }
            OC1.b(parcel);
            H();
            parcel2.writeNoException();
        }
        return true;
    }

    public final void H() throws IOException {
        Context context = this.a;
        if (this.g != null) {
            return;
        }
        BarhopperV3 barhopperV3 = new BarhopperV3();
        System.loadLibrary("barhopper_v3");
        this.g = barhopperV3;
        LM1 lm1N = LO1.n();
        C3740fG1 c3740fG1N = C2299bI1.n();
        int i2 = 16;
        int i3 = 0;
        for (int i4 = 0; i4 < 6; i4++) {
            GA1 ga1N = DC1.n();
            ga1N.j();
            DC1.r((DC1) ga1N.b, i2);
            ga1N.j();
            DC1.o((DC1) ga1N.b, i2);
            for (int i5 = 0; i5 < h[i4]; i5++) {
                double[] dArr = i[i3];
                double d = dArr[0] * 320.0d;
                float fSqrt = (float) Math.sqrt(dArr[1]);
                float f = (float) d;
                ga1N.j();
                DC1.p((DC1) ga1N.b, f / fSqrt);
                ga1N.j();
                DC1.q((DC1) ga1N.b, f * fSqrt);
                i3++;
            }
            i2 += i2;
            c3740fG1N.j();
            C2299bI1.o((C2299bI1) c3740fG1N.b, (DC1) ga1N.e());
        }
        lm1N.j();
        LO1.o((LO1) lm1N.b, (C2299bI1) c3740fG1N.e());
        try {
            InputStream inputStreamOpen = context.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream inputStreamOpen2 = context.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream inputStreamOpen3 = context.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV32 = (BarhopperV3) Preconditions.checkNotNull(this.g);
                        XR1 xr1N = C0581Hf.n();
                        JE1 je1E = JE1.E(inputStreamOpen);
                        lm1N.j();
                        LO1.p((LO1) lm1N.b, je1E);
                        xr1N.j();
                        C0581Hf.o((C0581Hf) xr1N.b, (LO1) lm1N.e());
                        C1962Yx1 c1962Yx1N = C3490dy1.n();
                        JE1 je1E2 = JE1.E(inputStreamOpen2);
                        c1962Yx1N.j();
                        C3490dy1.p((C3490dy1) c1962Yx1N.b, je1E2);
                        JE1 je1E3 = JE1.E(inputStreamOpen3);
                        c1962Yx1N.j();
                        C3490dy1.o((C3490dy1) c1962Yx1N.b, je1E3);
                        xr1N.j();
                        C0581Hf.p((C0581Hf) xr1N.b, (C3490dy1) c1962Yx1N.e());
                        barhopperV32.a((C0581Hf) xr1N.e());
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

    public final C0503Gf J(ByteBuffer byteBuffer, WC1 wc1, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.g);
        if (((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).isDirect()) {
            return barhopperV3.c(wc1.b, wc1.c, byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.e(wc1.b, wc1.c, byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.e(wc1.b, wc1.c, bArr, recognitionOptions);
    }

    public final ArrayList K(InterfaceC3515e50 interfaceC3515e50, WC1 wc1, RecognitionOptions recognitionOptions) {
        C0503Gf c0503GfF;
        Matrix matrix;
        C1422Rz1 c1422Rz1;
        C4104hA1 c4104hA1;
        C5835mA1 c5835mA1;
        C7171tA1 c7171tA1;
        C6599qA1 c6599qA1;
        C1890Xz1 c1890Xz1;
        C0097Az1 c0097Az1;
        C0487Fz1 c0487Fz1;
        C1032Mz1 c1032Mz1;
        int i2;
        int i3;
        String strV;
        int i4;
        byte[] bArr;
        Point[] pointArr;
        int i5;
        int i6;
        C4104hA1[] c4104hA1Arr;
        C1422Rz1[] c1422Rz1Arr;
        C6752qz1[] c6752qz1Arr;
        String strV2;
        String strV3;
        int i7 = wc1.a;
        int i8 = 0;
        int i9 = -1;
        if (i7 == -1) {
            c0503GfF = ((BarhopperV3) Preconditions.checkNotNull(this.g)).f((Bitmap) BinderC2421bx0.H(interfaceC3515e50), recognitionOptions);
        } else if (i7 == 17) {
            c0503GfF = J((ByteBuffer) BinderC2421bx0.H(interfaceC3515e50), wc1, recognitionOptions);
        } else if (i7 != 35) {
            if (i7 != 842094169) {
                throw new IllegalArgumentException("Unsupported image format: " + wc1.a);
            }
            c0503GfF = J((ByteBuffer) BinderC2421bx0.H(interfaceC3515e50), wc1, recognitionOptions);
        } else {
            c0503GfF = J(((Image) Preconditions.checkNotNull((Image) BinderC2421bx0.H(interfaceC3515e50))).getPlanes()[0].getBuffer(), wc1, recognitionOptions);
        }
        ArrayList arrayList = new ArrayList();
        C8303z70.a.getClass();
        QG1 qg1 = null;
        int i10 = wc1.d;
        if (i10 == 0) {
            matrix = null;
        } else {
            matrix = new Matrix();
            int i11 = wc1.b;
            int i12 = wc1.c;
            matrix.postTranslate((-i11) / 2.0f, (-i12) / 2.0f);
            matrix.postRotate(i10 * 90);
            int i13 = i10 % 2;
            int i14 = i13 != 0 ? i12 : i11;
            if (i13 == 0) {
                i11 = i12;
            }
            matrix.postTranslate(i14 / 2.0f, i11 / 2.0f);
        }
        for (GC1 gc1 : c0503GfF.o()) {
            int i15 = 5;
            if (gc1.o() > 0 && matrix != null) {
                float[] fArr = new float[8];
                InterfaceC7383uH1 interfaceC7383uH1A = gc1.A();
                int iO = gc1.o();
                for (int i16 = i8; i16 < iO; i16++) {
                    int i17 = i16 + i16;
                    fArr[i17] = ((C6939ry1) interfaceC7383uH1A.get(i16)).n();
                    fArr[i17 + 1] = ((C6939ry1) interfaceC7383uH1A.get(i16)).o();
                }
                matrix.mapPoints(fArr);
                int i18 = i8;
                while (i18 < iO) {
                    AbstractC6617qG1 abstractC6617qG1 = (AbstractC6617qG1) gc1.m(i15, qg1);
                    if (!abstractC6617qG1.a.equals(gc1)) {
                        if (!abstractC6617qG1.b.k()) {
                            abstractC6617qG1.k();
                        }
                        QG1 qg12 = abstractC6617qG1.b;
                        C3940gJ1.c.a(qg12.getClass()).c(qg12, gc1);
                    }
                    KA1 ka1 = (KA1) abstractC6617qG1;
                    int i19 = i18 + i18;
                    C6558py1 c6558py1P = C6939ry1.p();
                    int i20 = (int) fArr[i19];
                    c6558py1P.j();
                    C6939ry1.q((C6939ry1) c6558py1P.b, i20);
                    int i21 = (int) fArr[i19 + 1];
                    c6558py1P.j();
                    C6939ry1.r((C6939ry1) c6558py1P.b, i21);
                    C6939ry1 c6939ry1 = (C6939ry1) c6558py1P.e();
                    ka1.j();
                    GC1.B((GC1) ka1.b, (i18 + i10) % iO, c6939ry1);
                    gc1 = (GC1) ka1.e();
                    i18++;
                    qg1 = null;
                    i15 = 5;
                }
            }
            if (gc1.F()) {
                B22 b22T = gc1.t();
                c1422Rz1 = new C1422Rz1(b22T.o(), b22T.r() + i9, b22T.q(), b22T.p());
            } else {
                c1422Rz1 = null;
            }
            if (gc1.H()) {
                C8132yD1 c8132yD1P = gc1.p();
                c4104hA1 = new C4104hA1(c8132yD1P.p() + i9, c8132yD1P.o());
            } else {
                c4104hA1 = null;
            }
            if (gc1.I()) {
                C0874Ky1 c0874Ky1V = gc1.v();
                c5835mA1 = new C5835mA1(c0874Ky1V.o(), c0874Ky1V.p());
            } else {
                c5835mA1 = null;
            }
            if (gc1.K()) {
                C0175Bz1 c0175Bz1X = gc1.x();
                c7171tA1 = new C7171tA1(c0175Bz1X.p(), c0175Bz1X.o(), c0175Bz1X.q() + i9);
            } else {
                c7171tA1 = null;
            }
            if (gc1.J()) {
                C3684ez1 c3684ez1W = gc1.w();
                c6599qA1 = new C6599qA1(c3684ez1W.o(), c3684ez1W.p());
            } else {
                c6599qA1 = null;
            }
            if (gc1.G()) {
                U32 u32U = gc1.u();
                c1890Xz1 = new C1890Xz1(u32U.n(), u32U.o());
            } else {
                c1890Xz1 = null;
            }
            if (gc1.C()) {
                ZV1 zv1Q = gc1.q();
                String strU = zv1Q.u();
                String strQ = zv1Q.q();
                String strR = zv1Q.r();
                String strS = zv1Q.s();
                String strT = zv1Q.t();
                C6656qT1 c6656qT1O = zv1Q.o();
                if (gc1.y().z()) {
                    JE1 je1Y = gc1.y();
                    je1Y.getClass();
                    strV2 = je1Y.i() == 0 ? "" : je1Y.v(AbstractC7574vH1.a);
                } else {
                    strV2 = null;
                }
                C8086xz1 c8086xz1I = I(c6656qT1O, strV2, "DTSTART:([0-9TZ]*)");
                C6656qT1 c6656qT1N = zv1Q.n();
                if (gc1.y().z()) {
                    JE1 je1Y2 = gc1.y();
                    je1Y2.getClass();
                    strV3 = je1Y2.i() == 0 ? "" : je1Y2.v(AbstractC7574vH1.a);
                } else {
                    strV3 = null;
                }
                c0097Az1 = new C0097Az1(strU, strQ, strR, strS, strT, c8086xz1I, I(c6656qT1N, strV3, "DTEND:([0-9TZ]*)"));
            } else {
                c0097Az1 = null;
            }
            if (gc1.D()) {
                C8005xY1 c8005xY1R = gc1.r();
                C6417pD1 c6417pD1N = c8005xY1R.n();
                C2465cA1 c2465cA1 = c6417pD1N != null ? new C2465cA1(c6417pD1N.p(), c6417pD1N.t(), c6417pD1N.s(), c6417pD1N.o(), c6417pD1N.r(), c6417pD1N.q(), c6417pD1N.u()) : null;
                String strP = c8005xY1R.p();
                String strQ2 = c8005xY1R.q();
                InterfaceC7383uH1 interfaceC7383uH1T = c8005xY1R.t();
                if (interfaceC7383uH1T.isEmpty()) {
                    c4104hA1Arr = null;
                } else {
                    C4104hA1[] c4104hA1Arr2 = new C4104hA1[interfaceC7383uH1T.size()];
                    for (int i22 = i8; i22 < interfaceC7383uH1T.size(); i22++) {
                        c4104hA1Arr2[i22] = new C4104hA1(((C8132yD1) interfaceC7383uH1T.get(i22)).p() + i9, ((C8132yD1) interfaceC7383uH1T.get(i22)).o());
                    }
                    c4104hA1Arr = c4104hA1Arr2;
                }
                InterfaceC7383uH1 interfaceC7383uH1S = c8005xY1R.s();
                if (interfaceC7383uH1S.isEmpty()) {
                    c1422Rz1Arr = null;
                } else {
                    C1422Rz1[] c1422Rz1Arr2 = new C1422Rz1[interfaceC7383uH1S.size()];
                    int i23 = 0;
                    while (i23 < interfaceC7383uH1S.size()) {
                        c1422Rz1Arr2[i23] = new C1422Rz1(((B22) interfaceC7383uH1S.get(i23)).o(), ((B22) interfaceC7383uH1S.get(i23)).r() + i9, ((B22) interfaceC7383uH1S.get(i23)).q(), ((B22) interfaceC7383uH1S.get(i23)).p());
                        i23++;
                        i9 = -1;
                    }
                    c1422Rz1Arr = c1422Rz1Arr2;
                }
                String[] strArr = (String[]) c8005xY1R.u().toArray(new String[0]);
                InterfaceC7383uH1 interfaceC7383uH1R = c8005xY1R.r();
                if (interfaceC7383uH1R.isEmpty()) {
                    c6752qz1Arr = null;
                } else {
                    C6752qz1[] c6752qz1Arr2 = new C6752qz1[interfaceC7383uH1R.size()];
                    for (int i24 = 0; i24 < interfaceC7383uH1R.size(); i24++) {
                        c6752qz1Arr2[i24] = new C6752qz1(((C5462kD1) interfaceC7383uH1R.get(i24)).o() - 1, (String[]) ((C5462kD1) interfaceC7383uH1R.get(i24)).n().toArray(new String[0]));
                    }
                    c6752qz1Arr = c6752qz1Arr2;
                }
                c0487Fz1 = new C0487Fz1(c2465cA1, strP, strQ2, c4104hA1Arr, c1422Rz1Arr, strArr, c6752qz1Arr);
            } else {
                c0487Fz1 = null;
            }
            if (gc1.E()) {
                C4071h02 c4071h02S = gc1.s();
                c1032Mz1 = new C1032Mz1(c4071h02S.t(), c4071h02S.v(), c4071h02S.B(), c4071h02S.z(), c4071h02S.w(), c4071h02S.q(), c4071h02S.o(), c4071h02S.p(), c4071h02S.r(), c4071h02S.A(), c4071h02S.x(), c4071h02S.u(), c4071h02S.s(), c4071h02S.y());
            } else {
                c1032Mz1 = null;
            }
            switch (gc1.L() - 1) {
                case 0:
                    i2 = 0;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 8;
                    break;
                case 5:
                    i3 = 16;
                    i2 = i3;
                    break;
                case 6:
                    i3 = 32;
                    i2 = i3;
                    break;
                case 7:
                    i3 = 64;
                    i2 = i3;
                    break;
                case 8:
                    i3 = 128;
                    i2 = i3;
                    break;
                case 9:
                    i3 = 256;
                    i2 = i3;
                    break;
                case 10:
                    i3 = 512;
                    i2 = i3;
                    break;
                case 11:
                    i3 = 1024;
                    i2 = i3;
                    break;
                case 12:
                    i3 = 2048;
                    i2 = i3;
                    break;
                case 13:
                    i3 = 4096;
                    i2 = i3;
                    break;
                default:
                    i2 = -1;
                    break;
            }
            String strZ = gc1.z();
            if (gc1.y().z()) {
                JE1 je1Y3 = gc1.y();
                je1Y3.getClass();
                strV = je1Y3.i() != 0 ? je1Y3.v(AbstractC7574vH1.a) : "";
            } else {
                strV = null;
            }
            JE1 je1Y4 = gc1.y();
            int i25 = je1Y4.i();
            if (i25 == 0) {
                bArr = AbstractC7574vH1.b;
                i4 = 0;
            } else {
                byte[] bArr2 = new byte[i25];
                i4 = 0;
                je1Y4.k(0, bArr2, 0, i25);
                bArr = bArr2;
            }
            InterfaceC7383uH1 interfaceC7383uH1A2 = gc1.A();
            if (interfaceC7383uH1A2.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[interfaceC7383uH1A2.size()];
                for (int i26 = i4; i26 < interfaceC7383uH1A2.size(); i26++) {
                    pointArr2[i26] = new Point(((C6939ry1) interfaceC7383uH1A2.get(i26)).n(), ((C6939ry1) interfaceC7383uH1A2.get(i26)).o());
                }
                pointArr = pointArr2;
            }
            switch (gc1.n() - 1) {
                case 1:
                    i5 = 1;
                    continue;
                    arrayList.add(new C7553vA1(i2, strZ, strV, bArr, pointArr, i5, c1422Rz1, c4104hA1, c5835mA1, c7171tA1, c6599qA1, c1890Xz1, c0097Az1, c0487Fz1, c1032Mz1));
                    i9 = -1;
                    i8 = i4;
                    qg1 = null;
                case 2:
                    i5 = 2;
                    continue;
                    arrayList.add(new C7553vA1(i2, strZ, strV, bArr, pointArr, i5, c1422Rz1, c4104hA1, c5835mA1, c7171tA1, c6599qA1, c1890Xz1, c0097Az1, c0487Fz1, c1032Mz1));
                    i9 = -1;
                    i8 = i4;
                    qg1 = null;
                case 3:
                    i6 = 3;
                    break;
                case 4:
                    i5 = 4;
                    continue;
                    arrayList.add(new C7553vA1(i2, strZ, strV, bArr, pointArr, i5, c1422Rz1, c4104hA1, c5835mA1, c7171tA1, c6599qA1, c1890Xz1, c0097Az1, c0487Fz1, c1032Mz1));
                    i9 = -1;
                    i8 = i4;
                    qg1 = null;
                case 5:
                    i5 = 5;
                    continue;
                    arrayList.add(new C7553vA1(i2, strZ, strV, bArr, pointArr, i5, c1422Rz1, c4104hA1, c5835mA1, c7171tA1, c6599qA1, c1890Xz1, c0097Az1, c0487Fz1, c1032Mz1));
                    i9 = -1;
                    i8 = i4;
                    qg1 = null;
                case 6:
                    i6 = 6;
                    break;
                case 7:
                    i6 = 7;
                    break;
                case 8:
                    i5 = 8;
                    continue;
                    arrayList.add(new C7553vA1(i2, strZ, strV, bArr, pointArr, i5, c1422Rz1, c4104hA1, c5835mA1, c7171tA1, c6599qA1, c1890Xz1, c0097Az1, c0487Fz1, c1032Mz1));
                    i9 = -1;
                    i8 = i4;
                    qg1 = null;
                case 9:
                    i6 = 9;
                    break;
                case 10:
                    i6 = 10;
                    break;
                case 11:
                    i6 = 11;
                    break;
                case 12:
                    i6 = 12;
                    break;
                default:
                    i5 = i4;
                    continue;
                    arrayList.add(new C7553vA1(i2, strZ, strV, bArr, pointArr, i5, c1422Rz1, c4104hA1, c5835mA1, c7171tA1, c6599qA1, c1890Xz1, c0097Az1, c0487Fz1, c1032Mz1));
                    i9 = -1;
                    i8 = i4;
                    qg1 = null;
            }
            i5 = i6;
            arrayList.add(new C7553vA1(i2, strZ, strV, bArr, pointArr, i5, c1422Rz1, c4104hA1, c5835mA1, c7171tA1, c6599qA1, c1890Xz1, c0097Az1, c0487Fz1, c1032Mz1));
            i9 = -1;
            i8 = i4;
            qg1 = null;
        }
        return arrayList;
    }
}
