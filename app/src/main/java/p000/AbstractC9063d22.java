package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d22 */
/* loaded from: classes.dex */
public abstract class AbstractC9063d22 {
    /* renamed from: a */
    public static int m17477a(ArrayList arrayList, InputStream inputStream, C11967zm0 c11967zm0) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C10515oO0(inputStream, c11967zm0);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                int iMo3300d = ((H60) arrayList.get(i)).mo3300d(inputStream, c11967zm0);
                if (iMo3300d != -1) {
                    return iMo3300d;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static ImageHeaderParser$ImageType m17478b(ArrayList arrayList, InputStream inputStream, C11967zm0 c11967zm0) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C10515oO0(inputStream, c11967zm0);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo3299c = ((H60) arrayList.get(i)).mo3299c(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeMo3299c != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo3299c;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* renamed from: c */
    public static ImageHeaderParser$ImageType m17479c(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo3297a = ((H60) arrayList.get(i)).mo3297a(byteBuffer);
                AtomicReference atomicReference = AbstractC7031vk.f44510a;
                if (imageHeaderParser$ImageTypeMo3297a != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo3297a;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = AbstractC7031vk.f44510a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* renamed from: d */
    public static int m17480d(Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }
}
