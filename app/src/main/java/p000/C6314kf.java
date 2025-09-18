package p000;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import org.aomedia.avif.android.AvifDecoder;

/* renamed from: kf */
/* loaded from: classes.dex */
public final class C6314kf implements InterfaceC10395nS0 {

    /* renamed from: a */
    public final InterfaceC6443mi f36591a;

    public C6314kf(InterfaceC6443mi interfaceC6443mi) {
        IL1.m3830d(interfaceC6443mi, "Argument must not be null");
        this.f36591a = interfaceC6443mi;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!byteBuffer.isDirect()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            byteBufferAllocateDirect.put(byteBuffer);
            byteBufferAllocateDirect.flip();
            byteBuffer = byteBufferAllocateDirect;
        }
        return AvifDecoder.m23565a(byteBuffer);
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        return m22237c((ByteBuffer) obj);
    }

    /* renamed from: c */
    public final InterfaceC10011kS0 m22237c(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            byteBufferAllocateDirect.put(byteBuffer);
            byteBufferAllocateDirect.flip();
            byteBuffer = byteBufferAllocateDirect;
        }
        AvifDecoder.Info info = new AvifDecoder.Info();
        if (!AvifDecoder.getInfo(byteBuffer, byteBuffer.remaining(), info)) {
            return null;
        }
        int i = info.width;
        int i2 = info.height;
        Bitmap.Config config = info.depth == 8 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
        InterfaceC6443mi interfaceC6443mi = this.f36591a;
        Bitmap bitmapMo320o = interfaceC6443mi.mo320o(i, i2, config);
        if (AvifDecoder.decode(byteBuffer, byteBuffer.remaining(), bitmapMo320o)) {
            return C6506ni.m23171b(interfaceC6443mi, bitmapMo320o);
        }
        interfaceC6443mi.mo319i(bitmapMo320o);
        return null;
    }
}
