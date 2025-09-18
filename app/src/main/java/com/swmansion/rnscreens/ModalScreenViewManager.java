package com.swmansion.rnscreens;

import android.view.View;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.C10447ns0;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = ModalScreenViewManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m22267d2 = {"Lcom/swmansion/rnscreens/ModalScreenViewManager;", "Lcom/swmansion/rnscreens/ScreenViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Companion", "ns0", "react-native-screens_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ModalScreenViewManager extends ScreenViewManager {
    public static final C10447ns0 Companion = new C10447ns0();
    public static final String REACT_CLASS = "RNSModalScreen";

    @Override // com.swmansion.rnscreens.ScreenViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.swmansion.rnscreens.ScreenViewManager, com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }
}
