package com.dylanvann.fastimage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import p000.AbstractC0106Bg;
import p000.AbstractC10466o10;
import p000.AbstractC1841cL;
import p000.AbstractC4046fK;
import p000.C0536IV;
import p000.C10833qt0;
import p000.C11371v40;
import p000.C11864yy0;
import p000.C1437Wq;
import p000.C1500Xq;
import p000.C1554Yh;
import p000.C3984eL;
import p000.C4143gs;
import p000.C8579Yi1;
import p000.EnumC0769MD;
import p000.EnumC11389vD0;
import p000.IL1;
import p000.InterfaceC11312uc1;
import p000.InterfaceC7740If0;
import p000.PR0;

/* loaded from: classes.dex */
public final class GlideOptions extends PR0 implements Cloneable {
    private static GlideOptions centerCropTransform2;
    private static GlideOptions centerInsideTransform1;
    private static GlideOptions circleCropTransform3;
    private static GlideOptions fitCenterTransform0;
    private static GlideOptions noAnimation5;
    private static GlideOptions noTransformation4;

    public static GlideOptions bitmapTransform(InterfaceC11312uc1 interfaceC11312uc1) {
        return new GlideOptions().transform(interfaceC11312uc1);
    }

    public static GlideOptions centerCropTransform() {
        if (centerCropTransform2 == null) {
            centerCropTransform2 = new GlideOptions().centerCrop().autoClone();
        }
        return centerCropTransform2;
    }

    public static GlideOptions centerInsideTransform() {
        if (centerInsideTransform1 == null) {
            centerInsideTransform1 = new GlideOptions().centerInside().autoClone();
        }
        return centerInsideTransform1;
    }

    public static GlideOptions circleCropTransform() {
        if (circleCropTransform3 == null) {
            circleCropTransform3 = new GlideOptions().circleCrop().autoClone();
        }
        return circleCropTransform3;
    }

    public static GlideOptions decodeTypeOf(Class<?> cls) {
        return new GlideOptions().decode(cls);
    }

    public static GlideOptions diskCacheStrategyOf(AbstractC4046fK abstractC4046fK) {
        return new GlideOptions().diskCacheStrategy(abstractC4046fK);
    }

    public static GlideOptions downsampleOf(AbstractC1841cL abstractC1841cL) {
        return new GlideOptions().downsample(abstractC1841cL);
    }

    public static GlideOptions encodeFormatOf(Bitmap.CompressFormat compressFormat) {
        return new GlideOptions().encodeFormat(compressFormat);
    }

    public static GlideOptions encodeQualityOf(int i) {
        return new GlideOptions().encodeQuality(i);
    }

    public static GlideOptions errorOf(Drawable drawable) {
        return new GlideOptions().error(drawable);
    }

    public static GlideOptions fitCenterTransform() {
        if (fitCenterTransform0 == null) {
            fitCenterTransform0 = new GlideOptions().fitCenter().autoClone();
        }
        return fitCenterTransform0;
    }

    public static GlideOptions formatOf(EnumC0769MD enumC0769MD) {
        return new GlideOptions().format(enumC0769MD);
    }

    public static GlideOptions frameOf(long j) {
        return new GlideOptions().frame(j);
    }

    public static GlideOptions noAnimation() {
        if (noAnimation5 == null) {
            noAnimation5 = new GlideOptions().dontAnimate().autoClone();
        }
        return noAnimation5;
    }

    public static GlideOptions noTransformation() {
        if (noTransformation4 == null) {
            noTransformation4 = new GlideOptions().dontTransform().autoClone();
        }
        return noTransformation4;
    }

    public static <T> GlideOptions option(C11864yy0 c11864yy0, T t) {
        return new GlideOptions().set(c11864yy0, (C11864yy0) t);
    }

    public static GlideOptions overrideOf(int i, int i2) {
        return new GlideOptions().override(i, i2);
    }

    public static GlideOptions placeholderOf(Drawable drawable) {
        return new GlideOptions().placeholder(drawable);
    }

    public static GlideOptions priorityOf(EnumC11389vD0 enumC11389vD0) {
        return new GlideOptions().priority(enumC11389vD0);
    }

    public static GlideOptions signatureOf(InterfaceC7740If0 interfaceC7740If0) {
        return new GlideOptions().signature(interfaceC7740If0);
    }

    public static GlideOptions sizeMultiplierOf(float f) {
        return new GlideOptions().sizeMultiplier(f);
    }

    public static GlideOptions skipMemoryCacheOf(boolean z) {
        return new GlideOptions().skipMemoryCache(z);
    }

    public static GlideOptions timeoutOf(int i) {
        return new GlideOptions().timeout(i);
    }

    @Override // p000.AbstractC0106Bg
    public /* bridge */ /* synthetic */ AbstractC0106Bg decode(Class cls) {
        return decode((Class<?>) cls);
    }

    @Override // p000.AbstractC0106Bg
    public /* bridge */ /* synthetic */ AbstractC0106Bg set(C11864yy0 c11864yy0, Object obj) {
        return set(c11864yy0, (C11864yy0) obj);
    }

    public static GlideOptions errorOf(int i) {
        return new GlideOptions().error(i);
    }

    public static GlideOptions overrideOf(int i) {
        return new GlideOptions().override(i);
    }

    public static GlideOptions placeholderOf(int i) {
        return new GlideOptions().placeholder(i);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions apply(AbstractC0106Bg abstractC0106Bg) {
        return (GlideOptions) super.apply(abstractC0106Bg);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions autoClone() {
        return (GlideOptions) super.autoClone();
    }

    public GlideOptions centerCrop() {
        return (GlideOptions) transform(AbstractC1841cL.f17434c, new C1437Wq());
    }

    public GlideOptions centerInside() {
        return (GlideOptions) m797b(AbstractC1841cL.f17433b, new C1500Xq(), true);
    }

    public GlideOptions circleCrop() {
        return (GlideOptions) transform(AbstractC1841cL.f17433b, new C4143gs());
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions decode(Class<?> cls) {
        return (GlideOptions) super.decode((Class) cls);
    }

    public GlideOptions disallowHardwareConfig() {
        return (GlideOptions) set(C3984eL.f26667j, (Object) Boolean.FALSE);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions diskCacheStrategy(AbstractC4046fK abstractC4046fK) {
        return (GlideOptions) super.diskCacheStrategy(abstractC4046fK);
    }

    public GlideOptions dontAnimate() {
        return (GlideOptions) set(AbstractC10466o10.f38688b, (Object) Boolean.TRUE);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions dontTransform() {
        return (GlideOptions) super.dontTransform();
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions downsample(AbstractC1841cL abstractC1841cL) {
        return (GlideOptions) super.downsample(abstractC1841cL);
    }

    public GlideOptions encodeFormat(Bitmap.CompressFormat compressFormat) {
        C11864yy0 c11864yy0 = C1554Yh.f14453c;
        IL1.m3830d(compressFormat, "Argument must not be null");
        return (GlideOptions) set(c11864yy0, (Object) compressFormat);
    }

    public GlideOptions encodeQuality(int i) {
        return (GlideOptions) set(C1554Yh.f14452b, (Object) Integer.valueOf(i));
    }

    public GlideOptions fitCenter() {
        return (GlideOptions) m797b(AbstractC1841cL.f17432a, new C0536IV(), true);
    }

    public GlideOptions format(EnumC0769MD enumC0769MD) {
        IL1.m3829c(enumC0769MD);
        return (GlideOptions) set(C3984eL.f26663f, (Object) enumC0769MD).set(AbstractC10466o10.f38687a, enumC0769MD);
    }

    public GlideOptions frame(long j) {
        return (GlideOptions) set(C8579Yi1.f14471d, (Object) Long.valueOf(j));
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions lock() {
        super.lock();
        return this;
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions onlyRetrieveFromCache(boolean z) {
        return (GlideOptions) super.onlyRetrieveFromCache(z);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions optionalCenterCrop() {
        return (GlideOptions) super.optionalCenterCrop();
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions optionalCenterInside() {
        return (GlideOptions) super.optionalCenterInside();
    }

    public GlideOptions optionalCircleCrop() {
        return (GlideOptions) optionalTransform(AbstractC1841cL.f17434c, new C4143gs());
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions optionalFitCenter() {
        return (GlideOptions) super.optionalFitCenter();
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions priority(EnumC11389vD0 enumC11389vD0) {
        return (GlideOptions) super.priority(enumC11389vD0);
    }

    @Override // p000.AbstractC0106Bg
    public <Y> GlideOptions set(C11864yy0 c11864yy0, Y y) {
        return (GlideOptions) super.set(c11864yy0, (Object) y);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions signature(InterfaceC7740If0 interfaceC7740If0) {
        return (GlideOptions) super.signature(interfaceC7740If0);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions sizeMultiplier(float f) {
        return (GlideOptions) super.sizeMultiplier(f);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions skipMemoryCache(boolean z) {
        return (GlideOptions) super.skipMemoryCache(z);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions theme(Resources.Theme theme) {
        return (GlideOptions) super.theme(theme);
    }

    public GlideOptions timeout(int i) {
        return (GlideOptions) set(C11371v40.f44134b, (Object) Integer.valueOf(i));
    }

    @SafeVarargs
    @Deprecated
    public final GlideOptions transforms(InterfaceC11312uc1... interfaceC11312uc1Arr) {
        return (GlideOptions) transform((InterfaceC11312uc1) new C10833qt0(interfaceC11312uc1Arr), true);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions useAnimationPool(boolean z) {
        return (GlideOptions) super.useAnimationPool(z);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions useUnlimitedSourceGeneratorsPool(boolean z) {
        return (GlideOptions) super.useUnlimitedSourceGeneratorsPool(z);
    }

    @Override // p000.AbstractC0106Bg
    /* renamed from: clone */
    public GlideOptions mo26596clone() {
        return (GlideOptions) super.mo26596clone();
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions error(Drawable drawable) {
        return (GlideOptions) super.error(drawable);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions fallback(Drawable drawable) {
        return (GlideOptions) super.fallback(drawable);
    }

    public GlideOptions optionalTransform(InterfaceC11312uc1 interfaceC11312uc1) {
        return (GlideOptions) transform(interfaceC11312uc1, false);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions override(int i, int i2) {
        return (GlideOptions) super.override(i, i2);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions placeholder(Drawable drawable) {
        return (GlideOptions) super.placeholder(drawable);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions error(int i) {
        return (GlideOptions) super.error(i);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions fallback(int i) {
        return (GlideOptions) super.fallback(i);
    }

    public GlideOptions override(int i) {
        return (GlideOptions) override(i, i);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions placeholder(int i) {
        return (GlideOptions) super.placeholder(i);
    }

    @Override // p000.AbstractC0106Bg
    public GlideOptions transform(InterfaceC11312uc1 interfaceC11312uc1) {
        return (GlideOptions) transform(interfaceC11312uc1, true);
    }

    public <Y> GlideOptions optionalTransform(Class<Y> cls, InterfaceC11312uc1 interfaceC11312uc1) {
        return (GlideOptions) transform(cls, interfaceC11312uc1, false);
    }

    @SafeVarargs
    public final GlideOptions transform(InterfaceC11312uc1... interfaceC11312uc1Arr) {
        AbstractC0106Bg abstractC0106BgSelfOrThrowIfLocked;
        if (interfaceC11312uc1Arr.length > 1) {
            abstractC0106BgSelfOrThrowIfLocked = transform((InterfaceC11312uc1) new C10833qt0(interfaceC11312uc1Arr), true);
        } else if (interfaceC11312uc1Arr.length == 1) {
            abstractC0106BgSelfOrThrowIfLocked = transform(interfaceC11312uc1Arr[0]);
        } else {
            abstractC0106BgSelfOrThrowIfLocked = selfOrThrowIfLocked();
        }
        return (GlideOptions) abstractC0106BgSelfOrThrowIfLocked;
    }

    public <Y> GlideOptions transform(Class<Y> cls, InterfaceC11312uc1 interfaceC11312uc1) {
        return (GlideOptions) transform(cls, interfaceC11312uc1, true);
    }
}
