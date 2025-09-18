package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* renamed from: bi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2375bi implements InterfaceC6079nS0 {
    public final /* synthetic */ int a;
    public final InterfaceC5935mi b;

    public C2375bi() {
        this.a = 0;
        this.b = new C0474Fv0(8);
    }

    @Override // defpackage.InterfaceC6079nS0
    public final /* bridge */ /* synthetic */ boolean a(Object obj, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                H1.u(obj);
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                return c(H1.d(obj), i, i2, c0795Jy0);
            default:
                return C6126ni.b(this.b, ((InterfaceC3310d10) obj).a());
        }
    }

    public C6126ni c(ImageDecoder.Source source, int i, int i2, C0795Jy0 c0795Jy0) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C6805rG(i, i2, c0795Jy0));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C6126ni((C0474Fv0) this.b, bitmapDecodeBitmap);
    }

    public C2375bi(InterfaceC5935mi interfaceC5935mi) {
        this.a = 1;
        this.b = interfaceC5935mi;
    }
}
