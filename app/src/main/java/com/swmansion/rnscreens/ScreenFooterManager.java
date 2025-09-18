package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.C6340l4;
import p000.C9251eW0;
import p000.C9379fW0;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.S91;

@InterfaceC9101dL0(name = ScreenFooterManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m22267d2 = {"Lcom/swmansion/rnscreens/ScreenFooterManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LeW0;", "", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LS91;", "context", "createViewInstance", "(LS91;)LeW0;", "LEk1;", "getDelegate", "()LEk1;", "delegate", "LEk1;", "Companion", "fW0", "react-native-screens_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ScreenFooterManager extends ViewGroupManager<C9251eW0> {
    public static final C9379fW0 Companion = new C9379fW0();
    public static final String REACT_CLASS = "RNSScreenFooter";
    private final InterfaceC7543Ek1 delegate = new C6340l4(this, 10);

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC7543Ek1 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C9251eW0 createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        return new C9251eW0(context);
    }
}
