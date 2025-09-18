package p000;

import android.content.Context;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;

/* renamed from: wk */
/* loaded from: classes.dex */
public final class C7094wk implements InterfaceC10395nS0 {

    /* renamed from: c */
    public static final C11864yy0 f45048c = C11864yy0.m26288a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.ByteBufferWebpDecoder.DisableAnimation");

    /* renamed from: a */
    public final Context f45049a;

    /* renamed from: b */
    public final C7967Mo1 f45050b;

    public C7094wk(Context context, C11967zm0 c11967zm0, InterfaceC6443mi interfaceC6443mi) {
        this.f45049a = context.getApplicationContext();
        this.f45050b = new C7967Mo1(interfaceC6443mi, c11967zm0);
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) c7830Jy0.m4482c(f45048c)).booleanValue()) {
            return false;
        }
        return (byteBuffer == null ? 7 : AbstractC8927c12.m10569g(new C8423Vi1(byteBuffer))) == 6;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr, 0, iRemaining);
        WebpImage webpImageCreate = WebpImage.create(bArr);
        int iMin = Math.min(webpImageCreate.getHeight() / i2, webpImageCreate.getWidth() / i);
        C8379Um1 c8379Um1 = new C8379Um1(this.f45050b, webpImageCreate, byteBuffer, Math.max(1, iMin != 0 ? Integer.highestOneBit(iMin) : 0), (C8535Xm1) c7830Jy0.m4482c(C9025cn1.f17748q));
        c8379Um1.m8140b();
        return new C9314f10(new C8483Wm1(new C1825c5(2, new C9025cn1(ComponentCallbacks2C1874a.m10883a(this.f45049a), c8379Um1, i, i2, c8379Um1.mo8139a()))), 2);
    }
}
