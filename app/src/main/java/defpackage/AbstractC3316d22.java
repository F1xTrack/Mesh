package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d22 */
/* loaded from: classes.dex */
public abstract class AbstractC3316d22 {
    public static int a(ArrayList arrayList, InputStream inputStream, C8426zm0 c8426zm0) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C6258oO0(inputStream, c8426zm0);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                int iD = ((H60) arrayList.get(i)).d(inputStream, c8426zm0);
                if (iD != -1) {
                    return iD;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType b(ArrayList arrayList, InputStream inputStream, C8426zm0 c8426zm0) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C6258oO0(inputStream, c8426zm0);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = ((H60) arrayList.get(i)).c(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeC != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeC;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType c(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((H60) arrayList.get(i)).a(byteBuffer);
                AtomicReference atomicReference = AbstractC7659vk.a;
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = AbstractC7659vk.a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static int d(Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }
}
