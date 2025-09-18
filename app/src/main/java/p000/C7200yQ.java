package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yQ */
/* loaded from: classes.dex */
public final class C7200yQ implements H60 {
    @Override // p000.H60
    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo3297a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.H60
    /* renamed from: b */
    public final int mo3298b(ByteBuffer byteBuffer, C11967zm0 c11967zm0) {
        AtomicReference atomicReference = AbstractC7031vk.f44510a;
        return mo3300d(new C6968uk(byteBuffer), c11967zm0);
    }

    @Override // p000.H60
    /* renamed from: c */
    public final ImageHeaderParser$ImageType mo3299c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.H60
    /* renamed from: d */
    public final int mo3300d(InputStream inputStream, C11967zm0 c11967zm0) {
        int iM25870f = new C7137xQ(inputStream).m25870f(1, "Orientation");
        if (iM25870f == 0) {
            return -1;
        }
        return iM25870f;
    }
}
