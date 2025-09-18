package p000;

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

    /* renamed from: a */
    public final Executor f7569a;

    /* renamed from: b */
    public final CameraCharacteristics f7570b;

    /* renamed from: c */
    public C7391Bm1 f7571c;

    /* renamed from: d */
    public C6376le f7572d;

    /* renamed from: e */
    public S20 f7573e;

    /* renamed from: f */
    public C7621Fx1 f7574f;

    /* renamed from: g */
    public C7512Dv0 f7575g;

    /* renamed from: h */
    public S20 f7576h;

    /* renamed from: i */
    public C4049fN f7577i;

    /* renamed from: j */
    public C8326Tm0 f7578j;

    /* renamed from: k */
    public C10689pl0 f7579k;

    /* renamed from: l */
    public C7512Dv0 f7580l;

    /* renamed from: m */
    public final C9196e41 f7581m;

    /* renamed from: n */
    public final boolean f7582n;

    public ND0(Executor executor, CameraCharacteristics cameraCharacteristics) {
        C9196e41 c9196e41 = AbstractC6815sJ.f42362a;
        if (AbstractC6815sJ.f42362a.m17864z0(LowMemoryQuirk.class) != null) {
            this.f7569a = new ExecutorC10151lY0(executor);
        } else {
            this.f7569a = executor;
        }
        this.f7570b = cameraCharacteristics;
        this.f7581m = c9196e41;
        this.f7582n = c9196e41.m17862x0(IncorrectJpegMetadataQuirk.class);
    }

    /* renamed from: a */
    public final InterfaceC9457g70 m5588a(C6439me c6439me) {
        OD0 od0 = c6439me.f37809a;
        C4192he c4192he = (C4192he) this.f7573e.m7160k(c6439me);
        ArrayList arrayList = this.f7572d.f37211d;
        AbstractC9104dM1.m17546e(!arrayList.isEmpty());
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        if ((c4192he.f28490c == 35 || this.f7582n) && iIntValue == 256) {
            C4192he c4192he2 = (C4192he) this.f7574f.m2841d(new C0795Md(c4192he, od0.f8309f));
            this.f7579k.getClass();
            Size size = c4192he2.f28491d;
            MU0 mu0 = new MU0(AbstractC9575h22.m18702a(size.getWidth(), size.getHeight(), 256, 2));
            InterfaceC9457g70 interfaceC9457g70M9888b = ImageProcessingUtil.m9888b(mu0, (byte[]) c4192he2.f28488a);
            mu0.m5386b();
            Objects.requireNonNull(interfaceC9457g70M9888b);
            C6299kQ c6299kQ = c4192he2.f28489b;
            Objects.requireNonNull(c6299kQ);
            Matrix matrix = c4192he2.f28494g;
            AbstractC7207yX abstractC7207yX = (AbstractC7207yX) interfaceC9457g70M9888b;
            Size size2 = new Size(abstractC7207yX.getWidth(), abstractC7207yX.getHeight());
            abstractC7207yX.mo18405j0();
            c4192he = new C4192he(interfaceC9457g70M9888b, c6299kQ, abstractC7207yX.mo18405j0(), size2, c4192he2.f28492e, c4192he2.f28493f, matrix, c4192he2.f28495h);
        }
        this.f7578j.getClass();
        InterfaceC9457g70 interfaceC9457g70 = (InterfaceC9457g70) c4192he.f28488a;
        C11814yZ0 c11814yZ0 = new C11814yZ0(interfaceC9457g70, c4192he.f28491d, new C0921Od(interfaceC9457g70.mo18403P().mo4564b(), interfaceC9457g70.mo18403P().getTimestamp(), c4192he.f28493f, c4192he.f28494g));
        c11814yZ0.m26169c(c4192he.f28492e);
        if (arrayList.size() > 1) {
            od0.f8305b.m7053b(c11814yZ0.mo18405j0());
        }
        return c11814yZ0;
    }

    /* renamed from: b */
    public final C7564Ev0 m5589b(C6439me c6439me) throws Exception {
        int i;
        ArrayList arrayList = this.f7572d.f37211d;
        AbstractC9104dM1.m17546e(!arrayList.isEmpty());
        Integer num = (Integer) arrayList.get(0);
        int iIntValue = num.intValue();
        AbstractC9104dM1.m17545d("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: " + num, AbstractC9831j22.m21967b(iIntValue) || iIntValue == 32);
        OD0 od0 = c6439me.f37809a;
        AbstractC9104dM1.m17545d("OutputFileOptions cannot be empty", od0.f8306c != null);
        C4192he c4192he = (C4192he) this.f7573e.m7160k(c6439me);
        int size = arrayList.size();
        C1339VH c1339vh = od0.f8306c;
        if (size > 1) {
            AbstractC9104dM1.m17545d("The number of OutputFileOptions for simultaneous capture should be at least two", false);
            C1110Re c1110Re = od0.f8305b;
            if (c4192he.f28490c != 32) {
                throw null;
            }
            Objects.requireNonNull(c1339vh);
            C7564Ev0 c7564Ev0M5590c = m5590c(c4192he, c1339vh);
            c1110Re.m7053b(32);
            return c7564Ev0M5590c;
        }
        if (iIntValue == 32) {
            Objects.requireNonNull(c1339vh);
            return m5590c(c4192he, c1339vh);
        }
        Objects.requireNonNull(c1339vh);
        int i2 = od0.f8309f;
        C4192he c4192he2 = (C4192he) this.f7574f.m2841d(new C0795Md(c4192he, i2));
        if (AbstractC11184tc1.m24948b(c4192he2.f28492e, c4192he2.f28491d)) {
            AbstractC9104dM1.m17550i(AbstractC9831j22.m21967b(c4192he2.f28490c), null);
            this.f7577i.getClass();
            byte[] bArr = (byte[]) c4192he2.f28488a;
            try {
                BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
                BitmapFactory.Options options = new BitmapFactory.Options();
                Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(c4192he2.f28492e, options);
                C6299kQ c6299kQ = c4192he2.f28489b;
                Objects.requireNonNull(c6299kQ);
                Rect rect = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                Matrix matrix = c4192he2.f28494g;
                RectF rectF = AbstractC11184tc1.f43173a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-r7.left, -r7.top);
                Size size2 = new Size(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                InterfaceC7034vn interfaceC7034vn = c4192he2.f28495h;
                if (interfaceC7034vn == null) {
                    throw new NullPointerException("Null cameraCaptureResult");
                }
                this.f7575g.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapDecodeRegion.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                c4192he2 = new C4192he(byteArrayOutputStream.toByteArray(), c6299kQ, (Build.VERSION.SDK_INT < 34 || !AbstractC1302Uh.m8118d(bitmapDecodeRegion)) ? 256 : 4101, size2, rect, c4192he2.f28493f, matrix2, interfaceC7034vn);
            } catch (IOException e) {
                throw new C11502w60("Failed to decode JPEG.", e);
            }
        }
        S20 s20 = this.f7576h;
        Objects.requireNonNull(c1339vh);
        s20.getClass();
        File fileM9203b = Y02.m9203b(c1339vh);
        byte[] bArr2 = (byte[]) c4192he2.f28488a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileM9203b);
            try {
                fileOutputStream.write(bArr2, 0, new C9432fw1(20).m18334e(bArr2));
                fileOutputStream.close();
                C6299kQ c6299kQ2 = c4192he2.f28489b;
                Objects.requireNonNull(c6299kQ2);
                try {
                    C6809sD c6809sD = C6299kQ.f36489b;
                    C7137xQ c7137xQ = new C7137xQ(fileM9203b.toString());
                    C6299kQ c6299kQ3 = new C6299kQ(c7137xQ);
                    c6299kQ2.m22202b(c6299kQ3);
                    int i3 = 7;
                    if (c6299kQ3.m22203c() == 0 && (i = c4192he2.f28493f) != 0) {
                        if (i % 90 != 0) {
                            Locale locale = Locale.US;
                            AbstractC7806Jm0.m4412f("kQ");
                            c7137xQ.m25862G("Orientation", String.valueOf(0));
                        } else {
                            int i4 = i % 360;
                            int iM25870f = c7137xQ.m25870f(0, "Orientation");
                            while (i4 < 0) {
                                i4 += 90;
                                switch (iM25870f) {
                                    case 2:
                                        iM25870f = 5;
                                        break;
                                    case 3:
                                    case 8:
                                        iM25870f = 6;
                                        break;
                                    case 4:
                                        iM25870f = 7;
                                        break;
                                    case 5:
                                        iM25870f = 4;
                                        break;
                                    case 6:
                                        iM25870f = 1;
                                        break;
                                    case 7:
                                        iM25870f = 2;
                                        break;
                                    default:
                                        iM25870f = 8;
                                        break;
                                }
                            }
                            while (i4 > 0) {
                                i4 -= 90;
                                switch (iM25870f) {
                                    case 2:
                                        iM25870f = 7;
                                        break;
                                    case 3:
                                        iM25870f = 8;
                                        break;
                                    case 4:
                                        iM25870f = 5;
                                        break;
                                    case 5:
                                        iM25870f = 2;
                                        break;
                                    case 6:
                                        iM25870f = 3;
                                        break;
                                    case 7:
                                        iM25870f = 4;
                                        break;
                                    case 8:
                                        iM25870f = 1;
                                        break;
                                    default:
                                        iM25870f = 6;
                                        break;
                                }
                            }
                            c7137xQ.m25862G("Orientation", String.valueOf(iM25870f));
                        }
                    }
                    C0926Oi c0926Oi = (C0926Oi) c1339vh.f12487c;
                    if (c0926Oi.f8575b) {
                        switch (c6299kQ3.f36494a.m25870f(0, "Orientation")) {
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
                        c7137xQ.m25862G("Orientation", String.valueOf(i3));
                    }
                    Location location = (Location) c0926Oi.f8576c;
                    if (location != null) {
                        c6299kQ3.m22201a(location);
                    }
                    c6299kQ3.m22204d();
                    Y02.m9204c(fileM9203b, c1339vh);
                    return new C7564Ev0(15);
                } catch (IOException e2) {
                    throw new C11502w60("Failed to update Exif data", e2);
                }
            } finally {
            }
        } catch (IOException e3) {
            throw new C11502w60("Failed to write to temp file", e3);
        }
    }

    /* renamed from: c */
    public final C7564Ev0 m5590c(C4192he c4192he, C1339VH c1339vh) throws Exception {
        if (this.f7571c == null) {
            CameraCharacteristics cameraCharacteristics = this.f7570b;
            if (cameraCharacteristics == null) {
                throw new C11502w60("CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (c4192he.f28495h.mo403t() == null) {
                throw new C11502w60("CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CaptureResult captureResultMo403t = c4192he.f28495h.mo403t();
            Objects.requireNonNull(captureResultMo403t);
            DngCreator dngCreator = new DngCreator(cameraCharacteristics, captureResultMo403t);
            C7391Bm1 c7391Bm1 = new C7391Bm1(15, false);
            c7391Bm1.f1022b = dngCreator;
            this.f7571c = c7391Bm1;
        }
        C7391Bm1 c7391Bm12 = this.f7571c;
        InterfaceC9457g70 interfaceC9457g70 = (InterfaceC9457g70) c4192he.f28488a;
        Objects.requireNonNull(c1339vh);
        if (interfaceC9457g70 == null) {
            throw new NullPointerException("Null imageProxy");
        }
        c7391Bm12.getClass();
        File fileM9203b = Y02.m9203b(c1339vh);
        DngCreator dngCreator2 = (DngCreator) c7391Bm12.f1022b;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileM9203b);
                    int i = c4192he.f28493f;
                    try {
                        dngCreator2.setOrientation(i != 0 ? i != 90 ? i != 180 ? i != 270 ? 0 : 8 : 3 : 6 : 1);
                        dngCreator2.writeImage(fileOutputStream, interfaceC9457g70.mo18404Z());
                        fileOutputStream.close();
                        interfaceC9457g70.close();
                        Y02.m9204c(fileM9203b, c1339vh);
                        return new C7564Ev0(15);
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IllegalArgumentException e) {
                    throw new C11502w60("Image with an unsupported format was used", e);
                } catch (IllegalStateException e2) {
                    throw new C11502w60("Not enough metadata information has been set to write a well-formatted DNG file", e2);
                }
            } catch (IOException e3) {
                throw new C11502w60("Failed to write to temp file", e3);
            }
        } catch (Throwable th3) {
            interfaceC9457g70.close();
            throw th3;
        }
    }
}
