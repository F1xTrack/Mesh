package p000;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.Collections;

/* renamed from: ec0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9263ec0 {

    /* renamed from: a */
    public static final Q70 f26777a;

    static {
        Q70 q70 = new Q70(4);
        Collections.addAll(q70, 2, 7, 4, 5);
        f26777a = q70;
    }

    /* renamed from: a */
    public static final int m18014a(CT0 ct0, EncodedImage encodedImage) {
        O90.m5968f(encodedImage, "encodedImage");
        Integer numValueOf = Integer.valueOf(encodedImage.getExifOrientation());
        Q70 q70 = f26777a;
        int iIndexOf = q70.indexOf(numValueOf);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        int i = ct0.f1390a;
        if (i == -1) {
            i = 0;
        } else if (i == -1) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        Object obj = q70.get(((i / 90) + iIndexOf) % q70.size());
        O90.m5967e(obj, "INVERTED_EXIF_ORIENTATIO…D_EXIF_ORIENTATIONS.size]");
        return ((Number) obj).intValue();
    }

    /* renamed from: b */
    public static final int m18015b(CT0 ct0, EncodedImage encodedImage) {
        O90.m5968f(ct0, "rotationOptions");
        O90.m5968f(encodedImage, "encodedImage");
        int i = ct0.f1390a;
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

    /* renamed from: c */
    public static final int m18016c(CT0 ct0, C9115dS0 c9115dS0, EncodedImage encodedImage, boolean z) {
        O90.m5968f(encodedImage, "encodedImage");
        if (!z || c9115dS0 == null) {
            return 8;
        }
        int iM18015b = m18015b(ct0, encodedImage);
        int iM18014a = f26777a.contains(Integer.valueOf(encodedImage.getExifOrientation())) ? m18014a(ct0, encodedImage) : 0;
        boolean z2 = iM18015b == 90 || iM18015b == 270 || iM18014a == 5 || iM18014a == 7;
        float height = z2 ? encodedImage.getHeight() : encodedImage.getWidth();
        float width = z2 ? encodedImage.getWidth() : encodedImage.getHeight();
        float fMax = Math.max(c9115dS0.f26115a / height, c9115dS0.f26116b / width);
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
