package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.ZoomRange;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.images.ImageUrlProvider;
import com.yandex.mapkit.layers.TileFormat;
import com.yandex.mapkit.map.BaseTileDataSourceBuilder;
import com.yandex.mapkit.tiles.TileProvider;
import com.yandex.mapkit.tiles.UrlProvider;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes2.dex */
public class BaseTileDataSourceBuilderBinding implements BaseTileDataSourceBuilder {
    private final NativeObject nativeObject;
    protected Subscription<ImageUrlProvider> imageUrlProviderSubscription = new Subscription<ImageUrlProvider>() { // from class: com.yandex.mapkit.map.internal.BaseTileDataSourceBuilderBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(ImageUrlProvider imageUrlProvider) {
            return BaseTileDataSourceBuilderBinding.createImageUrlProvider(imageUrlProvider);
        }
    };
    protected Subscription<TileProvider> tileProviderSubscription = new Subscription<TileProvider>() { // from class: com.yandex.mapkit.map.internal.BaseTileDataSourceBuilderBinding.2
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(TileProvider tileProvider) {
            return BaseTileDataSourceBuilderBinding.createTileProvider(tileProvider);
        }
    };
    protected Subscription<UrlProvider> urlProviderSubscription = new Subscription<UrlProvider>() { // from class: com.yandex.mapkit.map.internal.BaseTileDataSourceBuilderBinding.3
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(UrlProvider urlProvider) {
            return BaseTileDataSourceBuilderBinding.createUrlProvider(urlProvider);
        }
    };

    public BaseTileDataSourceBuilderBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createImageUrlProvider(ImageUrlProvider imageUrlProvider);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createTileProvider(TileProvider tileProvider);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createUrlProvider(UrlProvider urlProvider);

    @Override // com.yandex.mapkit.map.BaseTileDataSourceBuilder
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.BaseTileDataSourceBuilder
    public native void setImageUrlProvider(ImageUrlProvider imageUrlProvider);

    @Override // com.yandex.mapkit.map.BaseTileDataSourceBuilder
    public native void setProjection(Projection projection);

    @Override // com.yandex.mapkit.map.BaseTileDataSourceBuilder
    public native void setTileFormat(TileFormat tileFormat);

    @Override // com.yandex.mapkit.map.BaseTileDataSourceBuilder
    public native void setTileProvider(TileProvider tileProvider);

    @Override // com.yandex.mapkit.map.BaseTileDataSourceBuilder
    public native void setTileUrlProvider(UrlProvider urlProvider);

    @Override // com.yandex.mapkit.map.BaseTileDataSourceBuilder
    public native void setZoomRanges(List<ZoomRange> list);
}
