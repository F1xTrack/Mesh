package com.facebook.react.bridge;

import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes.dex */
public interface NativeModule {
    boolean canOverrideExistingModule();

    String getName();

    void initialize();

    void invalidate();

    @Deprecated(forRemoval = true, since = "Use invalidate method instead")
    void onCatalystInstanceDestroy();
}
