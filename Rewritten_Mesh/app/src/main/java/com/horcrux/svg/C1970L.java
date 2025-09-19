package com.horcrux.svg;

import com.horcrux.svg.RenderableViewManager;
import javax.inject.Provider;

/* renamed from: com.horcrux.svg.L */
/* loaded from: classes.dex */
public final class C1970L implements Provider {
    @Override // javax.inject.Provider
    public final Object get() {
        return new RenderableViewManager.PathViewManager();
    }
}
