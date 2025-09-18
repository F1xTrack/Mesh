package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import android.location.Location;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ND0 {
    public final Executor a;
    public final CameraCharacteristics b;
    public C0136Bm1 c;
    public C5732le d;
    public S20 e;
    public C0481Fx1 f;
    public C0318Dv0 g;
    public S20 h;
    public C3759fN i;
    public C1538Tm0 j;
    public C6518pl0 k;
    public C0318Dv0 l;
    public final C3513e41 m;
    public final boolean n;

    public ND0(Executor executor, CameraCharacteristics cameraCharacteristics) {
        C3513e41 c3513e41 = AbstractC7005sJ.a;
        if (AbstractC7005sJ.a.z0(LowMemoryQuirk.class) != null) {
            this.a = new ExecutorC5715lY0(executor);
        } else {
            this.a = executor;
        }
        this.b = cameraCharacteristics;
        this.m = c3513e41;
        this.n = c3513e41.x0(IncorrectJpegMetadataQuirk.class);
    }

    public final InterfaceC3903g70 a(C5923me c5923me) {
        OD0 od0 = c5923me.a;
        C4192he c4192he = (C4192he) this.e.k(c5923me);
        ArrayList arrayList = this.d.d;
        AbstractC3377dM1.e(!arrayList.isEmpty());
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        if ((c4192he.c == 35 || this.n) && iIntValue == 256) {
            C4192he c4192he2 = (C4192he) this.f.d(new C0964Md(c4192he, od0.f));
            this.k.getClass();
            Size size = c4192he2.d;
            MU0 mu0 = new MU0(AbstractC4079h22.a(size.getWidth(), size.getHeight(), 256, 2));
            InterfaceC3903g70 interfaceC3903g70B = ImageProcessingUtil.b(mu0, (byte[]) c4192he2.a);
            mu0.b();
            Objects.requireNonNull(interfaceC3903g70B);
            C5499kQ c5499kQ = c4192he2.b;
            Objects.requireNonNull(c5499kQ);
            Matrix matrix = c4192he2.g;
            AbstractC8190yX abstractC8190yX = (AbstractC8190yX) interfaceC3903g70B;
            Size size2 = new Size(abstractC8190yX.getWidth(), abstractC8190yX.getHeight());
            abstractC8190yX.j0();
            c4192he = new C4192he(interfaceC3903g70B, c5499kQ, abstractC8190yX.j0(), size2, c4192he2.e, c4192he2.f, matrix, c4192he2.h);
        }
        this.j.getClass();
        InterfaceC3903g70 interfaceC3903g70 = (InterfaceC3903g70) c4192he.a;
        C8197yZ0 c8197yZ0 = new C8197yZ0(interfaceC3903g70, c4192he.d, new C1120Od(interfaceC3903g70.P().b(), interfaceC3903g70.P().getTimestamp(), c4192he.f, c4192he.g));
        c8197yZ0.c(c4192he.e);
        if (arrayList.size() > 1) {
            od0.b.b(c8197yZ0.j0());
        }
        return c8197yZ0;
    }

    public final C0396Ev0 b(C5923me c5923me) throws Exception {
        int i;
        ArrayList arrayList = this.d.d;
        AbstractC3377dM1.e(!arrayList.isEmpty());
        Integer num = (Integer) arrayList.get(0);
        int iIntValue = num.intValue();
        AbstractC3377dM1.d("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: " + num, AbstractC5237j22.b(iIntValue) || iIntValue == 32);
        OD0 od0 = c5923me.a;
        AbstractC3377dM1.d("OutputFileOptions cannot be empty", od0.c != null);
        C4192he c4192he = (C4192he) this.e.k(c5923me);
        int size = arrayList.size();
        VH vh = od0.c;
        if (size > 1) {
            AbstractC3377dM1.d("The number of OutputFileOptions for simultaneous capture should be at least two", false);
            C1357Re c1357Re = od0.b;
            if (c4192he.c != 32) {
                throw null;
            }
            Objects.requireNonNull(vh);
            C0396Ev0 c0396Ev0C = c(c4192he, vh);
            c1357Re.b(32);
            return c0396Ev0C;
        }
        if (iIntValue == 32) {
            Objects.requireNonNull(vh);
            return c(c4192he, vh);
        }
        Objects.requireNonNull(vh);
        int i2 = od0.f;
        C4192he c4192he2 = (C4192he) this.f.d(new C0964Md(c4192he, i2));
        if (AbstractC7255tc1.b(c4192he2.e, c4192he2.d)) {
            AbstractC3377dM1.i(AbstractC5237j22.b(c4192he2.c), null);
            this.i.getClass();
            byte[] bArr = (byte[]) c4192he2.a;
            try {
                BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
                BitmapFactory.Options options = new BitmapFactory.Options();
                Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(c4192he2.e, options);
                C5499kQ c5499kQ = c4192he2.b;
                Objects.requireNonNull(c5499kQ);
                Rect rect = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                Matrix matrix = c4192he2.g;
                RectF rectF = AbstractC7255tc1.a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-r7.left, -r7.top);
                Size size2 = new Size(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                InterfaceC7668vn interfaceC7668vn = c4192he2.h;
                if (interfaceC7668vn == null) {
                    throw new NullPointerException("Null cameraCaptureResult");
                }
                this.g.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapDecodeRegion.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                c4192he2 = new C4192he(byteArrayOutputStream.toByteArray(), c5499kQ, (Build.VERSION.SDK_INT < 34 || !AbstractC1600Uh.d(bitmapDecodeRegion)) ? 256 : 4101, size2, rect, c4192he2.f, matrix2, interfaceC7668vn);
            } catch (IOException e) {
                throw new C7730w60("Failed to decode JPEG.", e);
            }
        }
        S20 s20 = this.h;
        Objects.requireNonNull(vh);
        s20.getClass();
        File fileB = Y02.b(vh);
        byte[] bArr2 = (byte[]) c4192he2.a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileB);
            try {
                fileOutputStream.write(bArr2, 0, new C3866fw1(20).e(bArr2));
                fileOutputStream.close();
                C5499kQ c5499kQ2 = c4192he2.b;
                Objects.requireNonNull(c5499kQ2);
                try {
                    C6987sD c6987sD = C5499kQ.b;
                    C7979xQ c7979xQ = new C7979xQ(fileB.toString());
                    C5499kQ c5499kQ3 = new C5499kQ(c7979xQ);
                    c5499kQ2.b(c5499kQ3);
                    int i3 = 7;
                    if (c5499kQ3.c() == 0 && (i = c4192he2.f) != 0) {
                        if (i % 90 != 0) {
                            Locale locale = Locale.US;
                            AbstractC0759Jm0.f("kQ");
                            c7979xQ.G("Orientation", String.valueOf(0));
                        } else {
                            int i4 = i % 360;
                            int iF = c7979xQ.f(0, "Orientation");
                            while (i4 < 0) {
                                i4 += 90;
                                switch (iF) {
                                    case 2:
                                        iF = 5;
                                        break;
                                    case 3:
                                    case 8:
                                        iF = 6;
                                        break;
                                    case 4:
                                        iF = 7;
                                        break;
                                    case 5:
                                        iF = 4;
                                        break;
                                    case 6:
                                        iF = 1;
                                        break;
                                    case 7:
                                        iF = 2;
                                        break;
                                    default:
                                        iF = 8;
                                        break;
                                }
                            }
                            while (i4 > 0) {
                                i4 -= 90;
                                switch (iF) {
                                    case 2:
                                        iF = 7;
                                        break;
                                    case 3:
                                        iF = 8;
                                        break;
                                    case 4:
                                        iF = 5;
                                        break;
                                    case 5:
                                        iF = 2;
                                        break;
                                    case 6:
                                        iF = 3;
                                        break;
                                    case 7:
                                        iF = 4;
                                        break;
                                    case 8:
                                        iF = 1;
                                        break;
                                    default:
                                        iF = 6;
                                        break;
                                }
                            }
                            c7979xQ.G("Orientation", String.valueOf(iF));
                        }
                    }
                    C1135Oi c1135Oi = (C1135Oi) vh.c;
                    if (c1135Oi.b) {
                        switch (c5499kQ3.a.f(0, "Orientation")) {
                            case 2:
                                i3 = 1;
                                break;
                            case 3:
                                i3 = 4;
                                break;
                            case 4:
                                i3 = 3;
                                break;
                            case 5:
                                i3 = 6;
                                break;
                            case 6:
                                i3 = 5;
                                break;
                            case 7:
                                i3 = 8;
                                break;
                            case 8:
                                break;
                            default:
                                i3 = 2;
                                break;
                        }
                        c7979xQ.G("Orientation", String.valueOf(i3));
                    }
                    Location location = (Location) c1135Oi.c;
                    if (location != null) {
                        c5499kQ3.a(location);
                    }
                    c5499kQ3.d();
                    Y02.c(fileB, vh);
                    return new C0396Ev0(15);
                } catch (IOException e2) {
                    throw new C7730w60("Failed to update Exif data", e2);
                }
            } finally {
            }
        } catch (IOException e3) {
            throw new C7730w60("Failed to write to temp file", e3);
        }
    }

    public final C0396Ev0 c(C4192he c4192he, VH vh) throws Exception {
        if (this.c == null) {
            CameraCharacteristics cameraCharacteristics = this.b;
            if (cameraCharacteristics == null) {
                throw new C7730w60("CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (c4192he.h.t() == null) {
                throw new C7730w60("CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CaptureResult captureResultT = c4192he.h.t();
            Objects.requireNonNull(captureResultT);
            DngCreator dngCreator = new DngCreator(cameraCharacteristics, captureResultT);
            C0136Bm1 c0136Bm1 = new C0136Bm1(15, false);
            c0136Bm1.b = dngCreator;
            this.c = c0136Bm1;
        }
        C0136Bm1 c0136Bm12 = this.c;
        InterfaceC3903g70 interfaceC3903g70 = (InterfaceC3903g70) c4192he.a;
        Objects.requireNonNull(vh);
        if (interfaceC3903g70 == null) {
            throw new NullPointerException("Null imageProxy");
        }
        c0136Bm12.getClass();
        File fileB = Y02.b(vh);
        DngCreator dngCreator2 = (DngCreator) c0136Bm12.b;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileB);
                    int i = c4192he.f;
                    try {
                        dngCreator2.setOrientation(i != 0 ? i != 90 ? i != 180 ? i != 270 ? 0 : 8 : 3 : 6 : 1);
                        dngCreator2.writeImage(fileOutputStream, interfaceC3903g70.Z());
                        fileOutputStream.close();
                        interfaceC3903g70.close();
                        Y02.c(fileB, vh);
                        return new C0396Ev0(15);
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IllegalArgumentException e) {
                    throw new C7730w60("Image with an unsupported format was used", e);
                } catch (IllegalStateException e2) {
                    throw new C7730w60("Not enough metadata information has been set to write a well-formatted DNG file", e2);
                }
            } catch (IOException e3) {
                throw new C7730w60("Failed to write to temp file", e3);
            }
        } catch (Throwable th3) {
            interfaceC3903g70.close();
            throw th3;
        }
    }
}
