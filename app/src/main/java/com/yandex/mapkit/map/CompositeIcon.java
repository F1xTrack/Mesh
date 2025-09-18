package com.yandex.mapkit.map;

import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes2.dex */
public interface CompositeIcon {
    boolean isValid();

    void removeAll();

    void removeIcon(String str);

    void setIcon(String str, ImageProvider imageProvider, IconStyle iconStyle);

    void setIcon(String str, ImageProvider imageProvider, IconStyle iconStyle, Callback callback);

    void setIconStyle(String str, IconStyle iconStyle);
}
