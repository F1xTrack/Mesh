package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import org.aomedia.avif.android.AvifDecoder;

/* renamed from: kf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5544kf implements InterfaceC6079nS0 {
    public final InterfaceC5935mi a;

    public C5544kf(InterfaceC5935mi interfaceC5935mi) {
        IL1.d(interfaceC5935mi, "Argument must not be null");
        this.a = interfaceC5935mi;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final boolean a(Object obj, C0795Jy0 c0795Jy0) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!byteBuffer.isDirect()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            byteBufferAllocateDirect.put(byteBuffer);
            byteBufferAllocateDirect.flip();
            byteBuffer = byteBufferAllocateDirect;
        }
        return AvifDecoder.a(byteBuffer);
    }

    @Override // defpackage.InterfaceC6079nS0
    public final /* bridge */ /* synthetic */ InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        return c((ByteBuffer) obj);
    }

    public final InterfaceC5506kS0 c(ByteBuffer byteBuffer) {
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
        InterfaceC5935mi interfaceC5935mi = this.a;
        Bitmap bitmapO = interfaceC5935mi.o(i, i2, config);
        if (AvifDecoder.decode(byteBuffer, byteBuffer.remaining(), bitmapO)) {
            return C6126ni.b(interfaceC5935mi, bitmapO);
        }
        interfaceC5935mi.i(bitmapO);
        return null;
    }
}
