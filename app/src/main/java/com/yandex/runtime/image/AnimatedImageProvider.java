package com.yandex.runtime.image;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.yandex.runtime.ByteBufferUtils;
import java.io.IOException;
import java.util.UUID;
import p000.AbstractC7222ym;

/* loaded from: classes2.dex */
public abstract class AnimatedImageProvider {

    public static abstract class AnimatedImageProviderImpl extends AnimatedImageProvider {

        /* renamed from: id */
        private final String f25549id;
        private Object image;

        public AnimatedImageProviderImpl(String str) {
            this.f25549id = str;
        }

        @Override // com.yandex.runtime.image.AnimatedImageProvider
        public String getId() {
            return this.f25549id;
        }

        @Override // com.yandex.runtime.image.AnimatedImageProvider
        public Object getImage() {
            if (this.image == null) {
                this.image = loadImage();
            }
            return this.image;
        }

        public abstract Object loadImage();
    }

    public static AnimatedImageProvider fromAnimatedImage(final AnimatedImage animatedImage) {
        final String str = "animation/image:" + UUID.randomUUID().toString();
        return new AnimatedImageProvider() { // from class: com.yandex.runtime.image.AnimatedImageProvider.5
            @Override // com.yandex.runtime.image.AnimatedImageProvider
            public String getId() {
                return str;
            }

            @Override // com.yandex.runtime.image.AnimatedImageProvider
            public Object getImage() {
                return animatedImage;
            }
        };
    }

    public static AnimatedImageProvider fromAsset(Context context, final String str) {
        final AssetManager assets = context.getAssets();
        return new AnimatedImageProviderImpl(AbstractC7222ym.m26245v("animation/asset:", str)) { // from class: com.yandex.runtime.image.AnimatedImageProvider.3
            @Override // com.yandex.runtime.image.AnimatedImageProvider.AnimatedImageProviderImpl
            public Object loadImage() {
                try {
                    return ByteBufferUtils.fromAsset(assets, str);
                } catch (IOException unused) {
                    return null;
                }
            }
        };
    }

    public static AnimatedImageProvider fromByteArray(final byte[] bArr) {
        final String str = "animation/bytes:" + UUID.randomUUID().toString();
        return new AnimatedImageProvider() { // from class: com.yandex.runtime.image.AnimatedImageProvider.1
            @Override // com.yandex.runtime.image.AnimatedImageProvider
            public String getId() {
                return str;
            }

            @Override // com.yandex.runtime.image.AnimatedImageProvider
            public Object getImage() {
                return ByteBufferUtils.fromByteArray(bArr);
            }
        };
    }

    public static AnimatedImageProvider fromFile(final String str) {
        return new AnimatedImageProviderImpl(AbstractC7222ym.m26245v("animation/file:", str)) { // from class: com.yandex.runtime.image.AnimatedImageProvider.4
            @Override // com.yandex.runtime.image.AnimatedImageProvider.AnimatedImageProviderImpl
            public Object loadImage() {
                try {
                    return ByteBufferUtils.fromFile(str);
                } catch (IOException unused) {
                    return null;
                }
            }
        };
    }

    public static AnimatedImageProvider fromResource(Context context, final int i) {
        final Resources resources = context.getResources();
        return new AnimatedImageProviderImpl("animation/resource:" + String.valueOf(i)) { // from class: com.yandex.runtime.image.AnimatedImageProvider.2
            @Override // com.yandex.runtime.image.AnimatedImageProvider.AnimatedImageProviderImpl
            public Object loadImage() {
                try {
                    return ByteBufferUtils.fromResource(resources, i);
                } catch (IOException unused) {
                    String.valueOf(i);
                    return null;
                }
            }
        };
    }

    public abstract String getId();

    public abstract Object getImage();
}
