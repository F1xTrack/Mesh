package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8169yQ implements H60 {
    @Override // defpackage.H60
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.H60
    public final int b(ByteBuffer byteBuffer, C8426zm0 c8426zm0) {
        AtomicReference atomicReference = AbstractC7659vk.a;
        return d(new C7468uk(byteBuffer), c8426zm0);
    }

    @Override // defpackage.H60
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.H60
    public final int d(InputStream inputStream, C8426zm0 c8426zm0) {
        int iF = new C7979xQ(inputStream).f(1, "Orientation");
        if (iF == 0) {
            return -1;
        }
        return iF;
    }
}
