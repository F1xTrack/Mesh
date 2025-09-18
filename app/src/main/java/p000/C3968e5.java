package p000;

import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;

/* renamed from: e5 */
/* loaded from: classes.dex */
public final class C3968e5 {

    /* renamed from: d */
    public static final C11864yy0 f26533d = C11864yy0.m26288a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.AnimatedWebpBitmapDecoder.DisableBitmap");

    /* renamed from: a */
    public final C11967zm0 f26534a;

    /* renamed from: b */
    public final InterfaceC6443mi f26535b;

    /* renamed from: c */
    public final C7967Mo1 f26536c;

    public C3968e5(C11967zm0 c11967zm0, InterfaceC6443mi interfaceC6443mi) {
        this.f26534a = c11967zm0;
        this.f26535b = interfaceC6443mi;
        this.f26536c = new C7967Mo1(interfaceC6443mi, c11967zm0);
    }

    /* renamed from: a */
    public final C6506ni m17865a(ByteBuffer byteBuffer, int i, int i2) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr, 0, iRemaining);
        WebpImage webpImageCreate = WebpImage.create(bArr);
        int iMin = Math.min(webpImageCreate.getHeight() / i2, webpImageCreate.getWidth() / i);
        C8379Um1 c8379Um1 = new C8379Um1(this.f26536c, webpImageCreate, byteBuffer, Math.max(1, iMin != 0 ? Integer.highestOneBit(iMin) : 0), C8535Xm1.f13967b);
        try {
            c8379Um1.m8140b();
            return C6506ni.m23171b(this.f26535b, c8379Um1.mo8139a());
        } finally {
            c8379Um1.m8141c();
        }
    }
}
