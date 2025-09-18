package com.yandex.mapkit.map;

import com.yandex.mapkit.ZoomRange;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.images.ImageUrlProvider;
import com.yandex.mapkit.layers.TileFormat;
import com.yandex.mapkit.tiles.TileProvider;
import com.yandex.mapkit.tiles.UrlProvider;
import java.util.List;

/* loaded from: classes2.dex */
public interface BaseTileDataSourceBuilder {
    boolean isValid();

    void setImageUrlProvider(ImageUrlProvider imageUrlProvider);

    void setProjection(Projection projection);

    void setTileFormat(TileFormat tileFormat);

    void setTileProvider(TileProvider tileProvider);

    void setTileUrlProvider(UrlProvider urlProvider);

    void setZoomRanges(List<ZoomRange> list);
}
