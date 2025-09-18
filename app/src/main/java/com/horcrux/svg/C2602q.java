package com.horcrux.svg;

import com.horcrux.svg.RenderableViewManager;
import javax.inject.Provider;

/* renamed from: com.horcrux.svg.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2602q implements Provider {
    @Override // javax.inject.Provider
    public final Object get() {
        return new RenderableViewManager.ImageViewManager();
    }
}
