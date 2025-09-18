package p000;

import com.facebook.imagepipeline.image.EncodedImage;

/* renamed from: LD */
/* loaded from: classes.dex */
public final class C0707LD extends RuntimeException {

    /* renamed from: a */
    public final EncodedImage f6549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0707LD(String str, EncodedImage encodedImage) {
        super(str);
        O90.m5968f(encodedImage, "encodedImage");
        this.f6549a = encodedImage;
    }
}
