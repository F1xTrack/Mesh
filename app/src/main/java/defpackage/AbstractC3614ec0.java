package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.Collections;

/* renamed from: ec0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3614ec0 {
    public static final Q70 a;

    static {
        Q70 q70 = new Q70(4);
        Collections.addAll(q70, 2, 7, 4, 5);
        a = q70;
    }

    public static final int a(CT0 ct0, EncodedImage encodedImage) {
        O90.f(encodedImage, "encodedImage");
        Integer numValueOf = Integer.valueOf(encodedImage.getExifOrientation());
        Q70 q70 = a;
        int iIndexOf = q70.indexOf(numValueOf);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        int i = ct0.a;
        if (i == -1) {
            i = 0;
        } else if (i == -1) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        Object obj = q70.get(((i / 90) + iIndexOf) % q70.size());
        O90.e(obj, "INVERTED_EXIF_ORIENTATIO…D_EXIF_ORIENTATIONS.size]");
        return ((Number) obj).intValue();
    }

    public static final int b(CT0 ct0, EncodedImage encodedImage) {
        O90.f(ct0, "rotationOptions");
        O90.f(encodedImage, "encodedImage");
        int i = ct0.a;
        if (!(i != -2)) {
            return 0;
        }
        int rotationAngle = encodedImage.getRotationAngle();
        int rotationAngle2 = (rotationAngle == 90 || rotationAngle == 180 || rotationAngle == 270) ? encodedImage.getRotationAngle() : 0;
        if (i == -1) {
            return rotationAngle2;
        }
        if (i != -1) {
            return (i + rotationAngle2) % 360;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public static final int c(CT0 ct0, C3394dS0 c3394dS0, EncodedImage encodedImage, boolean z) {
        O90.f(encodedImage, "encodedImage");
        if (!z || c3394dS0 == null) {
            return 8;
        }
        int iB = b(ct0, encodedImage);
        int iA = a.contains(Integer.valueOf(encodedImage.getExifOrientation())) ? a(ct0, encodedImage) : 0;
        boolean z2 = iB == 90 || iB == 270 || iA == 5 || iA == 7;
        float height = z2 ? encodedImage.getHeight() : encodedImage.getWidth();
        float width = z2 ? encodedImage.getWidth() : encodedImage.getHeight();
        float fMax = Math.max(c3394dS0.a / height, c3394dS0.b / width);
        if (height * fMax > 2048.0f) {
            fMax = 2048.0f / height;
        }
        if (width * fMax > 2048.0f) {
            fMax = 2048.0f / width;
        }
        int i = (int) ((fMax * 8) + 0.6666667f);
        if (i > 8) {
            return 8;
        }
        if (i < 1) {
            return 1;
        }
        return i;
    }
}
