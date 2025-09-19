package com.horcrux.svg;

import com.horcrux.svg.RenderableViewManager;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class G implements Provider {
    @Override // javax.inject.Provider
    public final Object get() {
        return new RenderableViewManager.FeOffsetManager();
    }
}
