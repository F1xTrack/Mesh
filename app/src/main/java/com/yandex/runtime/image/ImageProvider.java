package com.yandex.runtime.image;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import p000.AbstractC11153tN0;
import p000.AbstractC7222ym;

/* loaded from: classes2.dex */
public abstract class ImageProvider {
    private final boolean cacheable;

    public static abstract class ImageProviderImpl extends ImageProvider {

        /* renamed from: id */
        private final String f25550id;

        public ImageProviderImpl(String str, boolean z) {
            super(z);
            this.f25550id = str;
        }

        @Override // com.yandex.runtime.image.ImageProvider
        public String getId() {
            return this.f25550id;
        }

        @Override // com.yandex.runtime.image.ImageProvider
        public Bitmap getImage() {
            return loadBitmap();
        }

        public abstract Bitmap loadBitmap();
    }

    public ImageProvider() {
        this(true);
    }

    public static ImageProvider fromAsset(Context context, String str) {
        return fromAsset(context, str, true);
    }

    public static ImageProvider fromBitmap(Bitmap bitmap) {
        return fromBitmap(bitmap, true, "bitmap:" + UUID.randomUUID().toString());
    }

    public static ImageProvider fromFile(String str) {
        return fromFile(str, true);
    }

    public static ImageProvider fromResource(Context context, int i) {
        return fromResource(context, i, true);
    }

    public abstract String getId();

    public abstract Bitmap getImage();

    public boolean isCacheable() {
        return this.cacheable;
    }

    public ImageProvider(boolean z) {
        this.cacheable = z;
    }

    public static ImageProvider fromAsset(Context context, final String str, boolean z) {
        final AssetManager assets = context.getAssets();
        return new ImageProviderImpl(AbstractC7222ym.m26245v("asset:", str), z) { // from class: com.yandex.runtime.image.ImageProvider.2
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            public Bitmap loadBitmap() throws IOException {
                Bitmap bitmapDecodeStream = null;
                try {
                    InputStream inputStreamOpen = assets.open(str);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                        inputStreamOpen.close();
                    } catch (Throwable th) {
                        inputStreamOpen.close();
                        throw th;
                    }
                } catch (IOException unused) {
                }
                return bitmapDecodeStream;
            }
        };
    }

    public static ImageProvider fromBitmap(final Bitmap bitmap, boolean z, final String str) {
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return new ImageProvider(z) { // from class: com.yandex.runtime.image.ImageProvider.1
                @Override // com.yandex.runtime.image.ImageProvider
                public String getId() {
                    return str;
                }

                @Override // com.yandex.runtime.image.ImageProvider
                public Bitmap getImage() {
                    return bitmap;
                }
            };
        }
        throw new IllegalArgumentException("Bitmap config value should be ARGB_8888");
    }

    public static ImageProvider fromFile(final String str, boolean z) {
        return new ImageProviderImpl(AbstractC7222ym.m26245v("file:", str), z) { // from class: com.yandex.runtime.image.ImageProvider.4
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            public Bitmap loadBitmap() {
                return BitmapFactory.decodeFile(str);
            }
        };
    }

    public static ImageProvider fromResource(Context context, final int i, boolean z) {
        final Resources resources = context.getResources();
        return new ImageProviderImpl(AbstractC11153tN0.m24909u(i, "resource:"), z) { // from class: com.yandex.runtime.image.ImageProvider.3
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            public Bitmap loadBitmap() {
                return BitmapFactory.decodeResource(resources, i);
            }
        };
    }
}
