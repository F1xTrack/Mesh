package io.sentry.react.replay;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import p000.AbstractC0852NX;
import p000.InterfaceC9101dL0;
import p000.S91;

@InterfaceC9101dL0(name = "RNSentryReplayUnmask")
/* loaded from: classes2.dex */
public class RNSentryReplayUnmaskManager extends ViewGroupManager<C6129b> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSentryReplayUnmask";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C6129b createViewInstance(S91 s91) {
        return new C6129b(s91);
    }
}
