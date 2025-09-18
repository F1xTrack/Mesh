package defpackage;

import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;

/* renamed from: e5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3514e5 {
    public static final C8272yy0 d = C8272yy0.a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.AnimatedWebpBitmapDecoder.DisableBitmap");
    public final C8426zm0 a;
    public final InterfaceC5935mi b;
    public final C0999Mo1 c;

    public C3514e5(C8426zm0 c8426zm0, InterfaceC5935mi interfaceC5935mi) {
        this.a = c8426zm0;
        this.b = interfaceC5935mi;
        this.c = new C0999Mo1(interfaceC5935mi, c8426zm0);
    }

    public final C6126ni a(ByteBuffer byteBuffer, int i, int i2) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr, 0, iRemaining);
        WebpImage webpImageCreate = WebpImage.create(bArr);
        int iMin = Math.min(webpImageCreate.getHeight() / i2, webpImageCreate.getWidth() / i);
        C1617Um1 c1617Um1 = new C1617Um1(this.c, webpImageCreate, byteBuffer, Math.max(1, iMin != 0 ? Integer.highestOneBit(iMin) : 0), C1851Xm1.b);
        try {
            c1617Um1.b();
            return C6126ni.b(this.b, c1617Um1.a());
        } finally {
            c1617Um1.c();
        }
    }
}
