package com.yandex.mapkit.map;

import android.graphics.PointF;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public final class IconStyle implements Serializable {
    private PointF anchor;
    private Boolean flat;
    private RotationType rotationType;
    private Float scale;
    private Rect tappableArea;
    private Boolean visible;
    private Float zIndex;

    public IconStyle(PointF pointF, RotationType rotationType, Float f, Boolean bool, Boolean bool2, Float f2, Rect rect) {
        this.anchor = pointF;
        this.rotationType = rotationType;
        this.zIndex = f;
        this.flat = bool;
        this.visible = bool2;
        this.scale = f2;
        this.tappableArea = rect;
    }

    public PointF getAnchor() {
        return this.anchor;
    }

    public Boolean getFlat() {
        return this.flat;
    }

    public RotationType getRotationType() {
        return this.rotationType;
    }

    public Float getScale() {
        return this.scale;
    }

    public Rect getTappableArea() {
        return this.tappableArea;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public Float getZIndex() {
        return this.zIndex;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.anchor = archive.add(this.anchor, true);
        this.rotationType = (RotationType) archive.add((Archive) this.rotationType, true, (Class<Archive>) RotationType.class);
        this.zIndex = archive.add(this.zIndex, true);
        this.flat = archive.add(this.flat, true);
        this.visible = archive.add(this.visible, true);
        this.scale = archive.add(this.scale, true);
        this.tappableArea = (Rect) archive.add((Archive) this.tappableArea, true, (Class<Archive>) Rect.class);
    }

    public IconStyle setAnchor(PointF pointF) {
        this.anchor = pointF;
        return this;
    }

    public IconStyle setFlat(Boolean bool) {
        this.flat = bool;
        return this;
    }

    public IconStyle setRotationType(RotationType rotationType) {
        this.rotationType = rotationType;
        return this;
    }

    public IconStyle setScale(Float f) {
        this.scale = f;
        return this;
    }

    public IconStyle setTappableArea(Rect rect) {
        this.tappableArea = rect;
        return this;
    }

    public IconStyle setVisible(Boolean bool) {
        this.visible = bool;
        return this;
    }

    public IconStyle setZIndex(Float f) {
        this.zIndex = f;
        return this;
    }

    public IconStyle() {
    }
}
