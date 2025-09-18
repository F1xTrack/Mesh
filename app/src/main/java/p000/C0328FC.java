package p000;

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

/* renamed from: FC */
/* loaded from: classes.dex */
public final class C0328FC implements InterfaceC11504w70, InterfaceC6411mC, RemoteCall {

    /* renamed from: a */
    public boolean f3086a;

    public /* synthetic */ C0328FC(boolean z, boolean z2) {
        this.f3086a = z;
    }

    /* renamed from: e */
    public static C1373Vp m2545e(C1373Vp c1373Vp) {
        C1622Zm c1622Zm = new C1622Zm();
        c1622Zm.f15113a = c1373Vp.f12780c;
        Iterator it = Collections.unmodifiableList(c1373Vp.f12778a).iterator();
        while (it.hasNext()) {
            c1622Zm.m9591d((AbstractC4232iH) it.next());
        }
        c1622Zm.m9590c(c1373Vp.f12779b);
        C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
        c7612Ft0M2812b.m2815e(C3950dn.m17743L0(CaptureRequest.FLASH_MODE), 0);
        c1622Zm.m9590c(new C3950dn(6, C7882Ky0.m4786a(c7612Ft0M2812b)));
        return c1622Zm.m9592e();
    }

    @Override // p000.InterfaceC11504w70
    /* renamed from: a */
    public boolean mo2546a(D60 d60) {
        O90.m5968f(d60, "imageFormat");
        return d60 == AbstractC0646KF.f5967k || d60 == AbstractC0646KF.f5957a;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.f10059a;
        ((C11900zE1) obj).m26336c((S81) obj2, this.f3086a);
    }

    @Override // p000.InterfaceC11504w70
    /* renamed from: b */
    public C3979eG mo2547b(EncodedImage encodedImage, C11467vq0 c11467vq0, CT0 ct0, C9115dS0 c9115dS0, ColorSpace colorSpace) throws Throwable {
        C0328FC c0328fc;
        CT0 ct02;
        Bitmap bitmap;
        C3979eG c3979eG;
        Integer num = 85;
        O90.m5968f(encodedImage, "encodedImage");
        if (ct0 == null) {
            ct02 = CT0.f1389b;
            c0328fc = this;
        } else {
            c0328fc = this;
            ct02 = ct0;
        }
        int iM10405e = !c0328fc.f3086a ? 1 : AbstractC8796b02.m10405e(ct02, c9115dS0, encodedImage, 2048);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iM10405e;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Matrix matrix = null;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.getInputStream(), null, options);
            if (bitmapDecodeStream == null) {
                AbstractC3929dS.m17672e("SimpleImageTranscoder");
                return new C3979eG(2, 2);
            }
            Q70 q70 = AbstractC9263ec0.f26777a;
            if (AbstractC9263ec0.f26777a.contains(Integer.valueOf(encodedImage.getExifOrientation()))) {
                int iM18014a = AbstractC9263ec0.m18014a(ct02, encodedImage);
                Matrix matrix2 = new Matrix();
                if (iM18014a == 2) {
                    matrix2.setScale(-1.0f, 1.0f);
                } else if (iM18014a == 7) {
                    matrix2.setRotate(-90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (iM18014a == 4) {
                    matrix2.setRotate(180.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (iM18014a == 5) {
                    matrix2.setRotate(90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                }
                matrix = matrix2;
            } else {
                int iM18015b = AbstractC9263ec0.m18015b(ct02, encodedImage);
                if (iM18015b != 0) {
                    matrix = new Matrix();
                    matrix.setRotate(iM18015b);
                }
            }
            Matrix matrix3 = matrix;
            if (matrix3 != null) {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix3, false);
                    O90.m5967e(bitmapCreateBitmap, "createBitmap(\n          …x,\n                false)");
                    bitmap = bitmapCreateBitmap;
                } catch (OutOfMemoryError unused) {
                    bitmap = bitmapDecodeStream;
                    AbstractC3929dS.m17675h("SimpleImageTranscoder");
                    c3979eG = new C3979eG(2, 2);
                    bitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return c3979eG;
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
                    bitmap.compress(Bitmap.CompressFormat.JPEG, num.intValue(), c11467vq0);
                    c3979eG = new C3979eG(iM10405e > 1 ? 0 : 1, 2);
                } catch (Throwable th2) {
                    th = th2;
                    bitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } catch (OutOfMemoryError unused2) {
                AbstractC3929dS.m17675h("SimpleImageTranscoder");
                c3979eG = new C3979eG(2, 2);
                bitmap.recycle();
                bitmapDecodeStream.recycle();
                return c3979eG;
            }
            bitmap.recycle();
            bitmapDecodeStream.recycle();
            return c3979eG;
        } catch (OutOfMemoryError unused3) {
            AbstractC3929dS.m17675h("SimpleImageTranscoder");
            return new C3979eG(2, 2);
        }
    }

    @Override // p000.InterfaceC11504w70
    /* renamed from: c */
    public boolean mo2548c(EncodedImage encodedImage, CT0 ct0, C9115dS0 c9115dS0) {
        O90.m5968f(encodedImage, "encodedImage");
        if (ct0 == null) {
            ct0 = CT0.f1389b;
        }
        return this.f3086a && AbstractC8796b02.m10405e(ct0, c9115dS0, encodedImage, 2048) > 1;
    }

    /* renamed from: d */
    public synchronized void m2549d() {
        this.f3086a = false;
    }

    /* renamed from: f */
    public boolean m2550f(ArrayList arrayList, boolean z) {
        if (!this.f3086a || !z) {
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

    /* renamed from: g */
    public synchronized boolean m2551g() {
        if (this.f3086a) {
            return false;
        }
        this.f3086a = true;
        notifyAll();
        return true;
    }

    @Override // p000.InterfaceC11504w70
    public String getIdentifier() {
        return "SimpleImageTranscoder";
    }

    /* renamed from: h */
    public boolean m2552h(ArrayList arrayList, boolean z) {
        if (this.f3086a && z) {
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

    @Override // p000.InterfaceC6411mC
    /* renamed from: k */
    public Iterable mo2553k(Object obj) {
        InterfaceC7158xl interfaceC7158xlMo2089x1 = (InterfaceC7158xl) obj;
        if (this.f3086a) {
            interfaceC7158xlMo2089x1 = interfaceC7158xlMo2089x1 != null ? interfaceC7158xlMo2089x1.mo2089x1() : null;
        }
        Collection collectionMo1222j = interfaceC7158xlMo2089x1 != null ? interfaceC7158xlMo2089x1.mo1222j() : null;
        return collectionMo1222j == null ? C0779MN.f7117a : collectionMo1222j;
    }

    public C0328FC(C9196e41 c9196e41, int i) {
        switch (i) {
            case 11:
                this.f3086a = c9196e41.m17862x0(UseTorchAsFlashQuirk.class);
                break;
            default:
                this.f3086a = c9196e41.m17862x0(Preview3AThreadCrashQuirk.class);
                break;
        }
    }

    public C0328FC(int i) {
        switch (i) {
            case 9:
                this.f3086a = AbstractC6815sJ.f42362a.m17864z0(SurfaceOrderQuirk.class) != null;
                break;
            case 10:
                this.f3086a = AbstractC7067wJ.f44776a.m17864z0(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                break;
            default:
                this.f3086a = ((StillCaptureFlashStopRepeatingQuirk) AbstractC7067wJ.f44776a.m17864z0(StillCaptureFlashStopRepeatingQuirk.class)) != null;
                break;
        }
    }
}
