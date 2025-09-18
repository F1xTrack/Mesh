package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import com.facebook.imagepipeline.image.EncodedImage;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class FC implements InterfaceC7733w70, InterfaceC5839mC, RemoteCall {
    public boolean a;

    public /* synthetic */ FC(boolean z, boolean z2) {
        this.a = z;
    }

    public static C1702Vp e(C1702Vp c1702Vp) {
        C2005Zm c2005Zm = new C2005Zm();
        c2005Zm.a = c1702Vp.c;
        Iterator it = Collections.unmodifiableList(c1702Vp.a).iterator();
        while (it.hasNext()) {
            c2005Zm.d((AbstractC4314iH) it.next());
        }
        c2005Zm.c(c1702Vp.b);
        C0468Ft0 c0468Ft0B = C0468Ft0.b();
        c0468Ft0B.e(C3456dn.L0(CaptureRequest.FLASH_MODE), 0);
        c2005Zm.c(new C3456dn(6, C0873Ky0.a(c0468Ft0B)));
        return c2005Zm.e();
    }

    @Override // defpackage.InterfaceC7733w70
    public boolean a(D60 d60) {
        O90.f(d60, "imageFormat");
        return d60 == KF.k || d60 == KF.a;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.a;
        ((C8325zE1) obj).c((S81) obj2, this.a);
    }

    @Override // defpackage.InterfaceC7733w70
    public C3547eG b(EncodedImage encodedImage, C7678vq0 c7678vq0, CT0 ct0, C3394dS0 c3394dS0, ColorSpace colorSpace) throws Throwable {
        FC fc;
        CT0 ct02;
        Bitmap bitmap;
        C3547eG c3547eG;
        Integer num = 85;
        O90.f(encodedImage, "encodedImage");
        if (ct0 == null) {
            ct02 = CT0.b;
            fc = this;
        } else {
            fc = this;
            ct02 = ct0;
        }
        int iE = !fc.a ? 1 : AbstractC2242b02.e(ct02, c3394dS0, encodedImage, 2048);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iE;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Matrix matrix = null;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.getInputStream(), null, options);
            if (bitmapDecodeStream == null) {
                AbstractC3393dS.e("SimpleImageTranscoder");
                return new C3547eG(2, 2);
            }
            Q70 q70 = AbstractC3614ec0.a;
            if (AbstractC3614ec0.a.contains(Integer.valueOf(encodedImage.getExifOrientation()))) {
                int iA = AbstractC3614ec0.a(ct02, encodedImage);
                Matrix matrix2 = new Matrix();
                if (iA == 2) {
                    matrix2.setScale(-1.0f, 1.0f);
                } else if (iA == 7) {
                    matrix2.setRotate(-90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (iA == 4) {
                    matrix2.setRotate(180.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (iA == 5) {
                    matrix2.setRotate(90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                }
                matrix = matrix2;
            } else {
                int iB = AbstractC3614ec0.b(ct02, encodedImage);
                if (iB != 0) {
                    matrix = new Matrix();
                    matrix.setRotate(iB);
                }
            }
            Matrix matrix3 = matrix;
            if (matrix3 != null) {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix3, false);
                    O90.e(bitmapCreateBitmap, "createBitmap(\n          …x,\n                false)");
                    bitmap = bitmapCreateBitmap;
                } catch (OutOfMemoryError unused) {
                    bitmap = bitmapDecodeStream;
                    AbstractC3393dS.h("SimpleImageTranscoder");
                    c3547eG = new C3547eG(2, 2);
                    bitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return c3547eG;
                } catch (Throwable th) {
                    th = th;
                    bitmap = bitmapDecodeStream;
                    bitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = bitmapDecodeStream;
            }
            try {
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, num.intValue(), c7678vq0);
                    c3547eG = new C3547eG(iE > 1 ? 0 : 1, 2);
                } catch (Throwable th2) {
                    th = th2;
                    bitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } catch (OutOfMemoryError unused2) {
                AbstractC3393dS.h("SimpleImageTranscoder");
                c3547eG = new C3547eG(2, 2);
                bitmap.recycle();
                bitmapDecodeStream.recycle();
                return c3547eG;
            }
            bitmap.recycle();
            bitmapDecodeStream.recycle();
            return c3547eG;
        } catch (OutOfMemoryError unused3) {
            AbstractC3393dS.h("SimpleImageTranscoder");
            return new C3547eG(2, 2);
        }
    }

    @Override // defpackage.InterfaceC7733w70
    public boolean c(EncodedImage encodedImage, CT0 ct0, C3394dS0 c3394dS0) {
        O90.f(encodedImage, "encodedImage");
        if (ct0 == null) {
            ct0 = CT0.b;
        }
        return this.a && AbstractC2242b02.e(ct0, c3394dS0, encodedImage, 2048) > 1;
    }

    public synchronized void d() {
        this.a = false;
    }

    public boolean f(ArrayList arrayList, boolean z) {
        if (!this.a || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean g() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    @Override // defpackage.InterfaceC7733w70
    public String getIdentifier() {
        return "SimpleImageTranscoder";
    }

    public boolean h(ArrayList arrayList, boolean z) {
        if (this.a && z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (iIntValue == 2 || iIntValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC5839mC
    public Iterable k(Object obj) {
        InterfaceC8042xl interfaceC8042xlX1 = (InterfaceC8042xl) obj;
        if (this.a) {
            interfaceC8042xlX1 = interfaceC8042xlX1 != null ? interfaceC8042xlX1.x1() : null;
        }
        Collection collectionJ = interfaceC8042xlX1 != null ? interfaceC8042xlX1.j() : null;
        return collectionJ == null ? MN.a : collectionJ;
    }

    public FC(C3513e41 c3513e41, int i) {
        switch (i) {
            case 11:
                this.a = c3513e41.x0(UseTorchAsFlashQuirk.class);
                break;
            default:
                this.a = c3513e41.x0(Preview3AThreadCrashQuirk.class);
                break;
        }
    }

    public FC(int i) {
        switch (i) {
            case 9:
                this.a = AbstractC7005sJ.a.z0(SurfaceOrderQuirk.class) != null;
                break;
            case 10:
                this.a = AbstractC7768wJ.a.z0(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                break;
            default:
                this.a = ((StillCaptureFlashStopRepeatingQuirk) AbstractC7768wJ.a.z0(StillCaptureFlashStopRepeatingQuirk.class)) != null;
                break;
        }
    }
}
