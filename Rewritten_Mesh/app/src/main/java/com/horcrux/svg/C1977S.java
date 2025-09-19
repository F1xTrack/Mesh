package com.horcrux.svg;

import com.horcrux.svg.RenderableViewManager;
import javax.inject.Provider;

/* renamed from: com.horcrux.svg.S */
/* loaded from: classes.dex */
public final class C1977S implements Provider {
    @Override // javax.inject.Provider
    public final Object get() {
        return new RenderableViewManager.TSpanViewManager();
    }
}
