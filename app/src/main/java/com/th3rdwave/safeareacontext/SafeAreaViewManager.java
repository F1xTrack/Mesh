package com.th3rdwave.safeareacontext;

import com.facebook.react.views.view.C1932a;
import com.facebook.react.views.view.ReactViewManager;
import kotlin.Metadata;
import p000.FU0;
import p000.G41;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.JU0;
import p000.KU0;
import p000.LU0;
import p000.NM0;
import p000.O90;
import p000.S91;

@InterfaceC9101dL0(name = SafeAreaViewManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010\"¨\u0006%"}, m22267d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LS91;", "context", "LFU0;", "createViewInstance", "(LS91;)LFU0;", "LLU0;", "createShadowNodeInstance", "()LLU0;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "mode", "LTf1;", "setMode", "(LFU0;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "propList", "setEdges", "(LFU0;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/views/view/a;", "LNM0;", "props", "LG41;", "stateWrapper", "", "updateState", "(Lcom/facebook/react/views/view/a;LNM0;LG41;)Ljava/lang/Object;", "Companion", "JU0", "react-native-safe-area-context_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SafeAreaViewManager extends ReactViewManager {
    public static final JU0 Companion = new JU0();
    public static final String REACT_CLASS = "RNCSafeAreaView";

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<LU0> getShadowNodeClass() {
        return LU0.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @p000.InterfaceC9871jM0(name = "edges")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setEdges(p000.FU0 r6, com.facebook.react.bridge.ReadableMap r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            p000.O90.m5968f(r6, r0)
            if (r7 == 0) goto L75
            java.lang.String r0 = "top"
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "toUpperCase(...)"
            if (r0 == 0) goto L20
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r2)
            p000.O90.m5967e(r0, r1)
            GU0 r0 = p000.GU0.valueOf(r0)
            if (r0 != 0) goto L22
        L20:
            GU0 r0 = p000.GU0.f3759a
        L22:
            java.lang.String r2 = "right"
            java.lang.String r2 = r7.getString(r2)
            if (r2 == 0) goto L39
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r3)
            p000.O90.m5967e(r2, r1)
            GU0 r2 = p000.GU0.valueOf(r2)
            if (r2 != 0) goto L3b
        L39:
            GU0 r2 = p000.GU0.f3759a
        L3b:
            java.lang.String r3 = "bottom"
            java.lang.String r3 = r7.getString(r3)
            if (r3 == 0) goto L52
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r4)
            p000.O90.m5967e(r3, r1)
            GU0 r3 = p000.GU0.valueOf(r3)
            if (r3 != 0) goto L54
        L52:
            GU0 r3 = p000.GU0.f3759a
        L54:
            java.lang.String r4 = "left"
            java.lang.String r7 = r7.getString(r4)
            if (r7 == 0) goto L6b
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toUpperCase(r4)
            p000.O90.m5967e(r7, r1)
            GU0 r7 = p000.GU0.valueOf(r7)
            if (r7 != 0) goto L6d
        L6b:
            GU0 r7 = p000.GU0.f3759a
        L6d:
            HU0 r1 = new HU0
            r1.<init>(r0, r2, r3, r7)
            r6.setEdges(r1)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.th3rdwave.safeareacontext.SafeAreaViewManager.setEdges(FU0, com.facebook.react.bridge.ReadableMap):void");
    }

    @InterfaceC9871jM0(name = "mode")
    public final void setMode(FU0 view, String mode) {
        O90.m5968f(view, "view");
        if (O90.m5963a(mode, "padding")) {
            view.setMode(KU0.f6125a);
        } else if (O90.m5963a(mode, "margin")) {
            view.setMode(KU0.f6126b);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(C1932a view, NM0 props, G41 stateWrapper) {
        O90.m5968f(view, "view");
        ((FU0) view).setStateWrapper(stateWrapper);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LU0 createShadowNodeInstance() {
        return new LU0();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public FU0 createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        FU0 fu0 = new FU0(context);
        fu0.f3277a = KU0.f6125a;
        return fu0;
    }
}
