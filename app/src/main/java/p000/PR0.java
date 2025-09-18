package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class PR0 extends AbstractC0106Bg {
    private static PR0 centerCropOptions;
    private static PR0 centerInsideOptions;
    private static PR0 circleCropOptions;
    private static PR0 fitCenterOptions;
    private static PR0 noAnimationOptions;
    private static PR0 noTransformOptions;
    private static PR0 skipMemoryCacheFalseOptions;
    private static PR0 skipMemoryCacheTrueOptions;

    public static PR0 bitmapTransform(InterfaceC11312uc1 interfaceC11312uc1) {
        return (PR0) new PR0().transform(interfaceC11312uc1, true);
    }

    public static PR0 centerCropTransform() {
        if (centerCropOptions == null) {
            centerCropOptions = (PR0) ((PR0) new PR0().transform(AbstractC1841cL.f17434c, new C1437Wq())).autoClone();
        }
        return centerCropOptions;
    }

    public static PR0 centerInsideTransform() {
        if (centerInsideOptions == null) {
            centerInsideOptions = (PR0) ((PR0) new PR0().m797b(AbstractC1841cL.f17433b, new C1500Xq(), true)).autoClone();
        }
        return centerInsideOptions;
    }

    public static PR0 circleCropTransform() {
        if (circleCropOptions == null) {
            circleCropOptions = (PR0) ((PR0) new PR0().transform(AbstractC1841cL.f17433b, new C4143gs())).autoClone();
        }
        return circleCropOptions;
    }

    public static PR0 decodeTypeOf(Class<?> cls) {
        return (PR0) new PR0().decode(cls);
    }

    public static PR0 diskCacheStrategyOf(AbstractC4046fK abstractC4046fK) {
        return (PR0) new PR0().diskCacheStrategy(abstractC4046fK);
    }

    public static PR0 downsampleOf(AbstractC1841cL abstractC1841cL) {
        return (PR0) new PR0().downsample(abstractC1841cL);
    }

    public static PR0 encodeFormatOf(Bitmap.CompressFormat compressFormat) {
        PR0 pr0 = new PR0();
        C11864yy0 c11864yy0 = C1554Yh.f14453c;
        IL1.m3830d(compressFormat, "Argument must not be null");
        return (PR0) pr0.set(c11864yy0, compressFormat);
    }

    public static PR0 encodeQualityOf(int i) {
        return (PR0) new PR0().set(C1554Yh.f14452b, Integer.valueOf(i));
    }

    public static PR0 errorOf(Drawable drawable) {
        return (PR0) new PR0().error(drawable);
    }

    public static PR0 fitCenterTransform() {
        if (fitCenterOptions == null) {
            fitCenterOptions = (PR0) ((PR0) new PR0().m797b(AbstractC1841cL.f17432a, new C0536IV(), true)).autoClone();
        }
        return fitCenterOptions;
    }

    public static PR0 formatOf(EnumC0769MD enumC0769MD) {
        PR0 pr0 = new PR0();
        IL1.m3829c(enumC0769MD);
        return (PR0) pr0.set(C3984eL.f26663f, enumC0769MD).set(AbstractC10466o10.f38687a, enumC0769MD);
    }

    public static PR0 frameOf(long j) {
        return (PR0) new PR0().set(C8579Yi1.f14471d, Long.valueOf(j));
    }

    public static PR0 noAnimation() {
        if (noAnimationOptions == null) {
            noAnimationOptions = (PR0) ((PR0) new PR0().set(AbstractC10466o10.f38688b, Boolean.TRUE)).autoClone();
        }
        return noAnimationOptions;
    }

    public static PR0 noTransformation() {
        if (noTransformOptions == null) {
            noTransformOptions = (PR0) ((PR0) new PR0().dontTransform()).autoClone();
        }
        return noTransformOptions;
    }

    public static <T> PR0 option(C11864yy0 c11864yy0, T t) {
        return (PR0) new PR0().set(c11864yy0, t);
    }

    public static PR0 overrideOf(int i, int i2) {
        return (PR0) new PR0().override(i, i2);
    }

    public static PR0 placeholderOf(Drawable drawable) {
        return (PR0) new PR0().placeholder(drawable);
    }

    public static PR0 priorityOf(EnumC11389vD0 enumC11389vD0) {
        return (PR0) new PR0().priority(enumC11389vD0);
    }

    public static PR0 signatureOf(InterfaceC7740If0 interfaceC7740If0) {
        return (PR0) new PR0().signature(interfaceC7740If0);
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
        return (PR0) new PR0().set(C11371v40.f44134b, Integer.valueOf(i));
    }

    @Override // p000.AbstractC0106Bg
    public boolean equals(Object obj) {
        return (obj instanceof PR0) && super.equals(obj);
    }

    @Override // p000.AbstractC0106Bg
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
