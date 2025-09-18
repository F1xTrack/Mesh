package com.yandex.mapkit.layers;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public final class LayerOptions implements Serializable {
    private boolean active;
    private boolean animateOnActivation;
    private boolean cacheable;
    private boolean nightModeAvailable;
    private OverzoomMode overzoomMode;
    private long tileAppearingAnimationDuration;
    private boolean transparent;
    private boolean versionSupport;

    public LayerOptions(boolean z, boolean z2, boolean z3, boolean z4, long j, OverzoomMode overzoomMode, boolean z5, boolean z6) {
        this.active = true;
        this.nightModeAvailable = true;
        this.cacheable = false;
        this.animateOnActivation = false;
        this.tileAppearingAnimationDuration = 400L;
        this.overzoomMode = OverzoomMode.DISABLED;
        this.transparent = false;
        this.versionSupport = true;
        if (overzoomMode == null) {
            throw new IllegalArgumentException("Required field \"overzoomMode\" cannot be null");
        }
        this.active = z;
        this.nightModeAvailable = z2;
        this.cacheable = z3;
        this.animateOnActivation = z4;
        this.tileAppearingAnimationDuration = j;
        this.overzoomMode = overzoomMode;
        this.transparent = z5;
        this.versionSupport = z6;
    }

    public boolean getActive() {
        return this.active;
    }

    public boolean getAnimateOnActivation() {
        return this.animateOnActivation;
    }

    public boolean getCacheable() {
        return this.cacheable;
    }

    public boolean getNightModeAvailable() {
        return this.nightModeAvailable;
    }

    public OverzoomMode getOverzoomMode() {
        return this.overzoomMode;
    }

    public long getTileAppearingAnimationDuration() {
        return this.tileAppearingAnimationDuration;
    }

    public boolean getTransparent() {
        return this.transparent;
    }

    public boolean getVersionSupport() {
        return this.versionSupport;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.active = archive.add(this.active);
        this.nightModeAvailable = archive.add(this.nightModeAvailable);
        this.cacheable = archive.add(this.cacheable);
        this.animateOnActivation = archive.add(this.animateOnActivation);
        this.tileAppearingAnimationDuration = archive.add(this.tileAppearingAnimationDuration);
        this.overzoomMode = (OverzoomMode) archive.add((Archive) this.overzoomMode, false, (Class<Archive>) OverzoomMode.class);
        this.transparent = archive.add(this.transparent);
        this.versionSupport = archive.add(this.versionSupport);
    }

    public LayerOptions setActive(boolean z) {
        this.active = z;
        return this;
    }

    public LayerOptions setAnimateOnActivation(boolean z) {
        this.animateOnActivation = z;
        return this;
    }

    public LayerOptions setCacheable(boolean z) {
        this.cacheable = z;
        return this;
    }

    public LayerOptions setNightModeAvailable(boolean z) {
        this.nightModeAvailable = z;
        return this;
    }

    public LayerOptions setOverzoomMode(OverzoomMode overzoomMode) {
        if (overzoomMode == null) {
            throw new IllegalArgumentException("Required field \"overzoomMode\" cannot be null");
        }
        this.overzoomMode = overzoomMode;
        return this;
    }

    public LayerOptions setTileAppearingAnimationDuration(long j) {
        this.tileAppearingAnimationDuration = j;
        return this;
    }

    public LayerOptions setTransparent(boolean z) {
        this.transparent = z;
        return this;
    }

    public LayerOptions setVersionSupport(boolean z) {
        this.versionSupport = z;
        return this;
    }

    public LayerOptions() {
        this.active = true;
        this.nightModeAvailable = true;
        this.cacheable = false;
        this.animateOnActivation = false;
        this.tileAppearingAnimationDuration = 400L;
        this.overzoomMode = OverzoomMode.DISABLED;
        this.transparent = false;
        this.versionSupport = true;
    }
}
