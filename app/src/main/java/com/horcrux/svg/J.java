package com.horcrux.svg;

import javax.inject.Provider;

/* loaded from: classes.dex */
public final class J implements Provider {
    @Override // javax.inject.Provider
    public final Object get() {
        return new SvgViewManager();
    }
}
