package com.swmansion.reanimated.layoutReanimation;

import p000.C11856yu0;
import p000.ComponentCallbacks2C7803Jk1;

/* loaded from: classes2.dex */
public abstract class ReanimatedNativeHierarchyManagerBase extends C11856yu0 {
    public ReanimatedNativeHierarchyManagerBase(ComponentCallbacks2C7803Jk1 componentCallbacks2C7803Jk1) {
        super(componentCallbacks2C7803Jk1);
    }

    @Override // p000.C11856yu0
    public synchronized void updateLayout(int i, int i2, int i3, int i4, int i5, int i6) {
        super.updateLayout(i, i2, i3, i4, i5, i6);
        updateLayoutCommon(i, i2, i3, i4, i5, i6);
    }

    public abstract void updateLayoutCommon(int i, int i2, int i3, int i4, int i5, int i6);
}
