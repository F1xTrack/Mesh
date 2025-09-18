package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* renamed from: bi */
/* loaded from: classes.dex */
public final class C1802bi implements InterfaceC10395nS0 {

    /* renamed from: a */
    public final /* synthetic */ int f17122a;

    /* renamed from: b */
    public final InterfaceC6443mi f17123b;

    public C1802bi() {
        this.f17122a = 0;
        this.f17123b = new C7616Fv0(8);
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        switch (this.f17122a) {
            case 0:
                AbstractC0443H1.m3234u(obj);
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        switch (this.f17122a) {
            case 0:
                return m10484c(AbstractC0443H1.m3217d(obj), i, i2, c7830Jy0);
            default:
                return C6506ni.m23171b(this.f17123b, ((InterfaceC9058d10) obj).mo8139a());
        }
    }

    /* renamed from: c */
    public C6506ni m10484c(ImageDecoder.Source source, int i, int i2, C7830Jy0 c7830Jy0) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C6732rG(i, i2, c7830Jy0));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C6506ni((C7616Fv0) this.f17123b, bitmapDecodeBitmap);
    }

    public C1802bi(InterfaceC6443mi interfaceC6443mi) {
        this.f17122a = 1;
        this.f17123b = interfaceC6443mi;
    }
}
