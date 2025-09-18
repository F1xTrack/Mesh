package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;

/* loaded from: classes.dex */
public final class LD extends RuntimeException {
    public final EncodedImage a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LD(String str, EncodedImage encodedImage) {
        super(str);
        O90.f(encodedImage, "encodedImage");
        this.a = encodedImage;
    }
}
