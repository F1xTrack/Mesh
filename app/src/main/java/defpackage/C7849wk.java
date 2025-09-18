package defpackage;

import android.content.Context;
import com.bumptech.glide.a;
import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;

/* renamed from: wk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7849wk implements InterfaceC6079nS0 {
    public static final C8272yy0 c = C8272yy0.a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.ByteBufferWebpDecoder.DisableAnimation");
    public final Context a;
    public final C0999Mo1 b;

    public C7849wk(Context context, C8426zm0 c8426zm0, InterfaceC5935mi interfaceC5935mi) {
        this.a = context.getApplicationContext();
        this.b = new C0999Mo1(interfaceC5935mi, c8426zm0);
    }

    @Override // defpackage.InterfaceC6079nS0
    public final boolean a(Object obj, C0795Jy0 c0795Jy0) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) c0795Jy0.c(c)).booleanValue()) {
            return false;
        }
        return (byteBuffer == null ? 7 : AbstractC2436c12.g(new C1683Vi1(byteBuffer))) == 6;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr, 0, iRemaining);
        WebpImage webpImageCreate = WebpImage.create(bArr);
        int iMin = Math.min(webpImageCreate.getHeight() / i2, webpImageCreate.getWidth() / i);
        C1617Um1 c1617Um1 = new C1617Um1(this.b, webpImageCreate, byteBuffer, Math.max(1, iMin != 0 ? Integer.highestOneBit(iMin) : 0), (C1851Xm1) c0795Jy0.c(C2582cn1.q));
        c1617Um1.b();
        return new C3691f10(new C1773Wm1(new C2448c5(2, new C2582cn1(a.a(this.a), c1617Um1, i, i2, c1617Um1.a()))), 2);
    }
}
