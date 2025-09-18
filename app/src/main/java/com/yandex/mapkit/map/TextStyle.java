package com.yandex.mapkit.map;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public final class TextStyle implements Serializable {
    private Integer color;
    private float offset;
    private boolean offsetFromIcon;
    private Integer outlineColor;
    private float outlineWidth;
    private Placement placement;
    private float size;
    private boolean textOptional;

    public enum Placement {
        CENTER,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public TextStyle(float f, Integer num, float f2, Integer num2, Placement placement, float f3, boolean z, boolean z2) {
        this.size = 8.0f;
        this.outlineWidth = 1.0f;
        this.placement = Placement.CENTER;
        this.offset = 0.0f;
        this.offsetFromIcon = true;
        this.textOptional = false;
        if (placement == null) {
            throw new IllegalArgumentException("Required field \"placement\" cannot be null");
        }
        this.size = f;
        this.color = num;
        this.outlineWidth = f2;
        this.outlineColor = num2;
        this.placement = placement;
        this.offset = f3;
        this.offsetFromIcon = z;
        this.textOptional = z2;
    }

    public Integer getColor() {
        return this.color;
    }

    public float getOffset() {
        return this.offset;
    }

    public boolean getOffsetFromIcon() {
        return this.offsetFromIcon;
    }

    public Integer getOutlineColor() {
        return this.outlineColor;
    }

    public float getOutlineWidth() {
        return this.outlineWidth;
    }

    public Placement getPlacement() {
        return this.placement;
    }

    public float getSize() {
        return this.size;
    }

    public boolean getTextOptional() {
        return this.textOptional;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.size = archive.add(this.size);
        this.color = archive.add(this.color, true);
        this.outlineWidth = archive.add(this.outlineWidth);
        this.outlineColor = archive.add(this.outlineColor, true);
        this.placement = (Placement) archive.add((Archive) this.placement, false, (Class<Archive>) Placement.class);
        this.offset = archive.add(this.offset);
        this.offsetFromIcon = archive.add(this.offsetFromIcon);
        this.textOptional = archive.add(this.textOptional);
    }

    public TextStyle setColor(Integer num) {
        this.color = num;
        return this;
    }

    public TextStyle setOffset(float f) {
        this.offset = f;
        return this;
    }

    public TextStyle setOffsetFromIcon(boolean z) {
        this.offsetFromIcon = z;
        return this;
    }

    public TextStyle setOutlineColor(Integer num) {
        this.outlineColor = num;
        return this;
    }

    public TextStyle setOutlineWidth(float f) {
        this.outlineWidth = f;
        return this;
    }

    public TextStyle setPlacement(Placement placement) {
        if (placement == null) {
            throw new IllegalArgumentException("Required field \"placement\" cannot be null");
        }
        this.placement = placement;
        return this;
    }

    public TextStyle setSize(float f) {
        this.size = f;
        return this;
    }

    public TextStyle setTextOptional(boolean z) {
        this.textOptional = z;
        return this;
    }

    public TextStyle() {
        this.size = 8.0f;
        this.outlineWidth = 1.0f;
        this.placement = Placement.CENTER;
        this.offset = 0.0f;
        this.offsetFromIcon = true;
        this.textOptional = false;
    }
}
