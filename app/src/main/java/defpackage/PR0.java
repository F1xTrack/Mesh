package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class PR0 extends AbstractC0116Bg {
    private static PR0 centerCropOptions;
    private static PR0 centerInsideOptions;
    private static PR0 circleCropOptions;
    private static PR0 fitCenterOptions;
    private static PR0 noAnimationOptions;
    private static PR0 noTransformOptions;
    private static PR0 skipMemoryCacheFalseOptions;
    private static PR0 skipMemoryCacheTrueOptions;

    public static PR0 bitmapTransform(InterfaceC7446uc1 interfaceC7446uc1) {
        return (PR0) new PR0().transform(interfaceC7446uc1, true);
    }

    public static PR0 centerCropTransform() {
        if (centerCropOptions == null) {
            centerCropOptions = (PR0) ((PR0) new PR0().transform(AbstractC2496cL.c, new C1783Wq())).autoClone();
        }
        return centerCropOptions;
    }

    public static PR0 centerInsideTransform() {
        if (centerInsideOptions == null) {
            centerInsideOptions = (PR0) ((PR0) new PR0().b(AbstractC2496cL.b, new C1861Xq(), true)).autoClone();
        }
        return centerInsideOptions;
    }

    public static PR0 circleCropTransform() {
        if (circleCropOptions == null) {
            circleCropOptions = (PR0) ((PR0) new PR0().transform(AbstractC2496cL.b, new C4043gs())).autoClone();
        }
        return circleCropOptions;
    }

    public static PR0 decodeTypeOf(Class<?> cls) {
        return (PR0) new PR0().decode(cls);
    }

    public static PR0 diskCacheStrategyOf(AbstractC3750fK abstractC3750fK) {
        return (PR0) new PR0().diskCacheStrategy(abstractC3750fK);
    }

    public static PR0 downsampleOf(AbstractC2496cL abstractC2496cL) {
        return (PR0) new PR0().downsample(abstractC2496cL);
    }

    public static PR0 encodeFormatOf(Bitmap.CompressFormat compressFormat) {
        PR0 pr0 = new PR0();
        C8272yy0 c8272yy0 = C1912Yh.c;
        IL1.d(compressFormat, "Argument must not be null");
        return (PR0) pr0.set(c8272yy0, compressFormat);
    }

    public static PR0 encodeQualityOf(int i) {
        return (PR0) new PR0().set(C1912Yh.b, Integer.valueOf(i));
    }

    public static PR0 errorOf(Drawable drawable) {
        return (PR0) new PR0().error(drawable);
    }

    public static PR0 fitCenterTransform() {
        if (fitCenterOptions == null) {
            fitCenterOptions = (PR0) ((PR0) new PR0().b(AbstractC2496cL.a, new IV(), true)).autoClone();
        }
        return fitCenterOptions;
    }

    public static PR0 formatOf(MD md) {
        PR0 pr0 = new PR0();
        IL1.c(md);
        return (PR0) pr0.set(C3562eL.f, md).set(AbstractC6186o10.a, md);
    }

    public static PR0 frameOf(long j) {
        return (PR0) new PR0().set(C1917Yi1.d, Long.valueOf(j));
    }

    public static PR0 noAnimation() {
        if (noAnimationOptions == null) {
            noAnimationOptions = (PR0) ((PR0) new PR0().set(AbstractC6186o10.b, Boolean.TRUE)).autoClone();
        }
        return noAnimationOptions;
    }

    public static PR0 noTransformation() {
        if (noTransformOptions == null) {
            noTransformOptions = (PR0) ((PR0) new PR0().dontTransform()).autoClone();
        }
        return noTransformOptions;
    }

    public static <T> PR0 option(C8272yy0 c8272yy0, T t) {
        return (PR0) new PR0().set(c8272yy0, t);
    }

    public static PR0 overrideOf(int i, int i2) {
        return (PR0) new PR0().override(i, i2);
    }

    public static PR0 placeholderOf(Drawable drawable) {
        return (PR0) new PR0().placeholder(drawable);
    }

    public static PR0 priorityOf(EnumC7561vD0 enumC7561vD0) {
        return (PR0) new PR0().priority(enumC7561vD0);
    }

    public static PR0 signatureOf(InterfaceC0660If0 interfaceC0660If0) {
        return (PR0) new PR0().signature(interfaceC0660If0);
    }

    public static PR0 sizeMultiplierOf(float f) {
        return (PR0) new PR0().sizeMultiplier(f);
    }

    public static PR0 skipMemoryCacheOf(boolean z) {
        if (z) {
            if (skipMemoryCacheTrueOptions == null) {
                skipMemoryCacheTrueOptions = (PR0) ((PR0) new PR0().skipMemoryCache(true)).autoClone();
            }
            return skipMemoryCacheTrueOptions;
        }
        if (skipMemoryCacheFalseOptions == null) {
            skipMemoryCacheFalseOptions = (PR0) ((PR0) new PR0().skipMemoryCache(false)).autoClone();
        }
        return skipMemoryCacheFalseOptions;
    }

    public static PR0 timeoutOf(int i) {
        return (PR0) new PR0().set(C7534v40.b, Integer.valueOf(i));
    }

    @Override // defpackage.AbstractC0116Bg
    public boolean equals(Object obj) {
        return (obj instanceof PR0) && super.equals(obj);
    }

    @Override // defpackage.AbstractC0116Bg
    public int hashCode() {
        return super.hashCode();
    }

    public static PR0 errorOf(int i) {
        return (PR0) new PR0().error(i);
    }

    public static PR0 overrideOf(int i) {
        return overrideOf(i, i);
    }

    public static PR0 placeholderOf(int i) {
        return (PR0) new PR0().placeholder(i);
    }
}
