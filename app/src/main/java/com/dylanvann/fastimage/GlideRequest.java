package com.dylanvann.fastimage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC0106Bg;
import p000.AbstractC10466o10;
import p000.AbstractC1841cL;
import p000.AbstractC4046fK;
import p000.AbstractC7839Kc1;
import p000.C0536IV;
import p000.C10833qt0;
import p000.C11371v40;
import p000.C11671xR0;
import p000.C11864yy0;
import p000.C1437Wq;
import p000.C1500Xq;
import p000.C1554Yh;
import p000.C3984eL;
import p000.C4143gs;
import p000.C8579Yi1;
import p000.EnumC0769MD;
import p000.EnumC11389vD0;
import p000.FR0;
import p000.IL1;
import p000.InterfaceC11312uc1;
import p000.InterfaceC7740If0;
import p000.JR0;

/* loaded from: classes.dex */
public class GlideRequest<TranscodeType> extends C11671xR0 implements Cloneable {
    public GlideRequest(Class<TranscodeType> cls, C11671xR0 c11671xR0) {
        super(cls, c11671xR0);
    }

    @Override // p000.AbstractC0106Bg
    public /* bridge */ /* synthetic */ AbstractC0106Bg decode(Class cls) {
        return decode((Class<?>) cls);
    }

    @Override // p000.AbstractC0106Bg
    public /* bridge */ /* synthetic */ AbstractC0106Bg set(C11864yy0 c11864yy0, Object obj) {
        return set(c11864yy0, (C11864yy0) obj);
    }

    public GlideRequest(ComponentCallbacks2C1874a componentCallbacks2C1874a, JR0 jr0, Class<TranscodeType> cls, Context context) {
        super(componentCallbacks2C1874a, jr0, cls, context);
    }

    @Override // p000.C11671xR0
    public GlideRequest<TranscodeType> addListener(FR0 fr0) {
        return (GlideRequest) super.addListener(fr0);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> autoClone() {
        return (GlideRequest) super.autoClone();
    }

    public GlideRequest<TranscodeType> centerCrop() {
        return (GlideRequest) transform(AbstractC1841cL.f17434c, new C1437Wq());
    }

    public GlideRequest<TranscodeType> centerInside() {
        return (GlideRequest) m797b(AbstractC1841cL.f17433b, new C1500Xq(), true);
    }

    public GlideRequest<TranscodeType> circleCrop() {
        return (GlideRequest) transform(AbstractC1841cL.f17433b, new C4143gs());
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> decode(Class<?> cls) {
        return (GlideRequest) super.decode((Class) cls);
    }

    public GlideRequest<TranscodeType> disallowHardwareConfig() {
        return (GlideRequest) set(C3984eL.f26667j, (Object) Boolean.FALSE);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> diskCacheStrategy(AbstractC4046fK abstractC4046fK) {
        return (GlideRequest) super.diskCacheStrategy(abstractC4046fK);
    }

    public GlideRequest<TranscodeType> dontAnimate() {
        return (GlideRequest) set(AbstractC10466o10.f38688b, (Object) Boolean.TRUE);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> dontTransform() {
        return (GlideRequest) super.dontTransform();
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> downsample(AbstractC1841cL abstractC1841cL) {
        return (GlideRequest) super.downsample(abstractC1841cL);
    }

    public GlideRequest<TranscodeType> encodeFormat(Bitmap.CompressFormat compressFormat) {
        C11864yy0 c11864yy0 = C1554Yh.f14453c;
        IL1.m3830d(compressFormat, "Argument must not be null");
        return (GlideRequest) set(c11864yy0, (Object) compressFormat);
    }

    public GlideRequest<TranscodeType> encodeQuality(int i) {
        return (GlideRequest) set(C1554Yh.f14452b, (Object) Integer.valueOf(i));
    }

    public GlideRequest<TranscodeType> fitCenter() {
        return (GlideRequest) m797b(AbstractC1841cL.f17432a, new C0536IV(), true);
    }

    public GlideRequest<TranscodeType> format(EnumC0769MD enumC0769MD) {
        IL1.m3829c(enumC0769MD);
        return (GlideRequest) set(C3984eL.f26663f, (Object) enumC0769MD).set(AbstractC10466o10.f38687a, enumC0769MD);
    }

    public GlideRequest<TranscodeType> frame(long j) {
        return (GlideRequest) set(C8579Yi1.f14471d, (Object) Long.valueOf(j));
    }

    @Override // p000.C11671xR0
    public GlideRequest<File> getDownloadOnlyRequest() {
        return new GlideRequest(File.class, this).apply((AbstractC0106Bg) C11671xR0.DOWNLOAD_ONLY_OPTIONS);
    }

    @Override // p000.C11671xR0
    public GlideRequest<TranscodeType> listener(FR0 fr0) {
        return (GlideRequest) super.listener(fr0);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> lock() {
        super.lock();
        return this;
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> onlyRetrieveFromCache(boolean z) {
        return (GlideRequest) super.onlyRetrieveFromCache(z);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> optionalCenterCrop() {
        return (GlideRequest) super.optionalCenterCrop();
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> optionalCenterInside() {
        return (GlideRequest) super.optionalCenterInside();
    }

    public GlideRequest<TranscodeType> optionalCircleCrop() {
        return (GlideRequest) optionalTransform(AbstractC1841cL.f17434c, new C4143gs());
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> optionalFitCenter() {
        return (GlideRequest) super.optionalFitCenter();
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> priority(EnumC11389vD0 enumC11389vD0) {
        return (GlideRequest) super.priority(enumC11389vD0);
    }

    @Override // p000.AbstractC0106Bg
    public <Y> GlideRequest<TranscodeType> set(C11864yy0 c11864yy0, Y y) {
        return (GlideRequest) super.set(c11864yy0, (Object) y);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> signature(InterfaceC7740If0 interfaceC7740If0) {
        return (GlideRequest) super.signature(interfaceC7740If0);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> sizeMultiplier(float f) {
        return (GlideRequest) super.sizeMultiplier(f);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> skipMemoryCache(boolean z) {
        return (GlideRequest) super.skipMemoryCache(z);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> theme(Resources.Theme theme) {
        return (GlideRequest) super.theme(theme);
    }

    public GlideRequest<TranscodeType> timeout(int i) {
        return (GlideRequest) set(C11371v40.f44134b, (Object) Integer.valueOf(i));
    }

    @Deprecated
    public GlideRequest<TranscodeType> transforms(InterfaceC11312uc1... interfaceC11312uc1Arr) {
        return (GlideRequest) transform((InterfaceC11312uc1) new C10833qt0(interfaceC11312uc1Arr), true);
    }

    @Override // p000.C11671xR0
    public GlideRequest<TranscodeType> transition(AbstractC7839Kc1 abstractC7839Kc1) {
        return (GlideRequest) super.transition(abstractC7839Kc1);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> useAnimationPool(boolean z) {
        return (GlideRequest) super.useAnimationPool(z);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> useUnlimitedSourceGeneratorsPool(boolean z) {
        return (GlideRequest) super.useUnlimitedSourceGeneratorsPool(z);
    }

    @Override // p000.C11671xR0, p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> apply(AbstractC0106Bg abstractC0106Bg) {
        return (GlideRequest) super.apply(abstractC0106Bg);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> fallback(Drawable drawable) {
        return (GlideRequest) super.fallback(drawable);
    }

    public GlideRequest<TranscodeType> optionalTransform(InterfaceC11312uc1 interfaceC11312uc1) {
        return (GlideRequest) transform(interfaceC11312uc1, false);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> override(int i, int i2) {
        return (GlideRequest) super.override(i, i2);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> placeholder(Drawable drawable) {
        return (GlideRequest) super.placeholder(drawable);
    }

    /* renamed from: thumbnail, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ C11671xR0 m26640thumbnail(List list) {
        return thumbnail((List<C11671xR0>) list);
    }

    @Override // p000.C11671xR0, p000.AbstractC0106Bg
    /* renamed from: clone */
    public GlideRequest<TranscodeType> mo26596clone() {
        return (GlideRequest) super.mo26596clone();
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> fallback(int i) {
        return (GlideRequest) super.fallback(i);
    }

    public GlideRequest<TranscodeType> override(int i) {
        return (GlideRequest) override(i, i);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> placeholder(int i) {
        return (GlideRequest) super.placeholder(i);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> transform(InterfaceC11312uc1 interfaceC11312uc1) {
        return (GlideRequest) transform(interfaceC11312uc1, true);
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> error(Drawable drawable) {
        return (GlideRequest) super.error(drawable);
    }

    public <Y> GlideRequest<TranscodeType> optionalTransform(Class<Y> cls, InterfaceC11312uc1 interfaceC11312uc1) {
        return (GlideRequest) transform(cls, interfaceC11312uc1, false);
    }

    @SafeVarargs
    /* renamed from: thumbnail, reason: merged with bridge method [inline-methods] */
    public final GlideRequest<TranscodeType> m26641thumbnail(C11671xR0... c11671xR0Arr) {
        C11671xR0 c11671xR0Thumbnail;
        if (c11671xR0Arr != null && c11671xR0Arr.length != 0) {
            c11671xR0Thumbnail = m26640thumbnail(Arrays.asList(c11671xR0Arr));
        } else {
            c11671xR0Thumbnail = thumbnail((C11671xR0) null);
        }
        return (GlideRequest) c11671xR0Thumbnail;
    }

    @Override // p000.AbstractC0106Bg
    public GlideRequest<TranscodeType> error(int i) {
        return (GlideRequest) super.error(i);
    }

    public GlideRequest<TranscodeType> transform(InterfaceC11312uc1... interfaceC11312uc1Arr) {
        AbstractC0106Bg abstractC0106BgSelfOrThrowIfLocked;
        if (interfaceC11312uc1Arr.length > 1) {
            abstractC0106BgSelfOrThrowIfLocked = transform((InterfaceC11312uc1) new C10833qt0(interfaceC11312uc1Arr), true);
        } else if (interfaceC11312uc1Arr.length == 1) {
            abstractC0106BgSelfOrThrowIfLocked = transform(interfaceC11312uc1Arr[0]);
        } else {
            abstractC0106BgSelfOrThrowIfLocked = selfOrThrowIfLocked();
        }
        return (GlideRequest) abstractC0106BgSelfOrThrowIfLocked;
    }

    /* renamed from: error, reason: merged with bridge method [inline-methods] */
    public GlideRequest<TranscodeType> m26623error(Object obj) {
        C11671xR0 c11671xR0Error;
        if (obj == null) {
            c11671xR0Error = error((C11671xR0) null);
        } else {
            c11671xR0Error = error(mo26596clone().error((C11671xR0) null).thumbnail((C11671xR0) null).m26632load(obj));
        }
        return (GlideRequest) c11671xR0Error;
    }

    public GlideRequest<TranscodeType> thumbnail(List<C11671xR0> list) {
        C11671xR0 c11671xR0Thumbnail;
        C11671xR0 c11671xR0Thumbnail2 = null;
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C11671xR0 c11671xR0 = list.get(size);
                if (c11671xR0 != null) {
                    c11671xR0Thumbnail2 = c11671xR0Thumbnail2 == null ? c11671xR0 : c11671xR0.thumbnail(c11671xR0Thumbnail2);
                }
            }
            c11671xR0Thumbnail = thumbnail(c11671xR0Thumbnail2);
        } else {
            c11671xR0Thumbnail = thumbnail((C11671xR0) null);
        }
        return (GlideRequest) c11671xR0Thumbnail;
    }

    public <Y> GlideRequest<TranscodeType> transform(Class<Y> cls, InterfaceC11312uc1 interfaceC11312uc1) {
        return (GlideRequest) transform(cls, interfaceC11312uc1, true);
    }

    @Override // p000.C11671xR0
    public GlideRequest<TranscodeType> error(C11671xR0 c11671xR0) {
        return (GlideRequest) super.error(c11671xR0);
    }

    @Override // p000.C11671xR0
    public GlideRequest<TranscodeType> thumbnail(C11671xR0 c11671xR0) {
        return (GlideRequest) super.thumbnail(c11671xR0);
    }

    @Override // p000.C11671xR0
    @Deprecated
    public GlideRequest<TranscodeType> thumbnail(float f) {
        return (GlideRequest) super.thumbnail(f);
    }

    @Override // p000.C11671xR0
    /* renamed from: load, reason: merged with bridge method [inline-methods] */
    public GlideRequest<TranscodeType> m26632load(Object obj) {
        return (GlideRequest) m25892f(obj);
    }

    @Override // p000.C11671xR0
    /* renamed from: load, reason: merged with bridge method [inline-methods] */
    public GlideRequest<TranscodeType> m26627load(Bitmap bitmap) {
        return (GlideRequest) super.m26627load(bitmap);
    }

    @Override // p000.C11671xR0
    /* renamed from: load, reason: merged with bridge method [inline-methods] */
    public GlideRequest<TranscodeType> m26628load(Drawable drawable) {
        return (GlideRequest) super.m26628load(drawable);
    }

    @Override // p000.C11671xR0
    /* renamed from: load, reason: merged with bridge method [inline-methods] */
    public GlideRequest<TranscodeType> m26631load(Integer num) {
        return (GlideRequest) super.m26631load(num);
    }

    @Override // p000.C11671xR0
    /* renamed from: load, reason: merged with bridge method [inline-methods] */
    public GlideRequest<TranscodeType> m26635load(byte[] bArr) {
        return (GlideRequest) super.m26635load(bArr);
    }

    @Override // p000.C11671xR0
    /* renamed from: load, reason: merged with bridge method [inline-methods] */
    public GlideRequest<TranscodeType> m26633load(String str) {
        return (GlideRequest) m25892f(str);
    }

    @Override // p000.C11671xR0
    /* renamed from: load, reason: merged with bridge method [inline-methods] */
    public GlideRequest<TranscodeType> m26629load(Uri uri) {
        return (GlideRequest) m25892f(uri);
    }

    @Override // p000.C11671xR0
    /* renamed from: load, reason: merged with bridge method [inline-methods] */
    public GlideRequest<TranscodeType> m26630load(File file) {
        return (GlideRequest) m25892f(file);
    }

    @Override // p000.C11671xR0
    @Deprecated
    /* renamed from: load, reason: merged with bridge method [inline-methods] */
    public GlideRequest<TranscodeType> m26634load(URL url) {
        return (GlideRequest) m25892f(url);
    }
}
