package com.facebook.react.views.modal;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.AbstractC10063ks0;
import p000.AbstractC10889rJ0;
import p000.C0926Oi;
import p000.C10169lh0;
import p000.C10191ls0;
import p000.C4224i9;
import p000.C6340l4;
import p000.C6846so;
import p000.C8968cL0;
import p000.G41;
import p000.InterfaceC10319ms0;
import p000.InterfaceC6947uP;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.NM0;
import p000.O90;
import p000.OZ1;
import p000.S91;
import p000.XK0;
import p000.ZK0;

@InterfaceC9101dL0(name = ReactModalHostManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001@B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001f\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001aH\u0017¢\u0006\u0004\b!\u0010\u001dJ\u001f\u0010#\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001aH\u0017¢\u0006\u0004\b#\u0010\u001dJ!\u0010%\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b%\u0010\u0019J\u001f\u0010&\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u001aH\u0017¢\u0006\u0004\b&\u0010\u001dJ!\u0010(\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010'H\u0017¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010$\u001a\u00020*H\u0017¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0002H\u0014¢\u0006\u0004\b-\u0010.J\u001b\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002000/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0014¢\u0006\u0004\b3\u0010\u0016J)\u00108\u001a\u0004\u0018\u0001002\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020:H\u0016¢\u0006\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, m22267d2 = {"Lcom/facebook/react/views/modal/ReactModalHostManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LcL0;", "Lms0;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LS91;", "reactContext", "createViewInstance", "(LS91;)LcL0;", "Llh0;", "createShadowNodeInstance", "()Llh0;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "LTf1;", "onDropViewInstance", "(LcL0;)V", "animationType", "setAnimationType", "(LcL0;Ljava/lang/String;)V", "", "transparent", "setTransparent", "(LcL0;Z)V", "statusBarTranslucent", "setStatusBarTranslucent", "hardwareAccelerated", "setHardwareAccelerated", "visible", "setVisible", "value", "setPresentationStyle", "setAnimated", "Lcom/facebook/react/bridge/ReadableArray;", "setSupportedOrientations", "(LcL0;Lcom/facebook/react/bridge/ReadableArray;)V", "", "setIdentifier", "(LcL0;I)V", "addEventEmitters", "(LS91;LcL0;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "onAfterUpdateTransaction", "LNM0;", "props", "LG41;", "stateWrapper", "updateState", "(LcL0;LNM0;LG41;)Ljava/lang/Object;", "LEk1;", "getDelegate", "()LEk1;", "delegate", "LEk1;", "Companion", "XK0", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ReactModalHostManager extends ViewGroupManager<C8968cL0> implements InterfaceC10319ms0 {
    public static final XK0 Companion = new XK0();
    public static final String REACT_CLASS = "RCTModalHostView";
    private final InterfaceC7543Ek1 delegate = new C6340l4(this, 4);

    public static final void addEventEmitters$lambda$0(InterfaceC6947uP interfaceC6947uP, S91 s91, C8968cL0 c8968cL0, DialogInterface dialogInterface) {
        O90.m5968f(s91, "$reactContext");
        O90.m5968f(c8968cL0, "$view");
        interfaceC6947uP.mo11046g(new C6846so(OZ1.m6093d(s91), c8968cL0.getId(), 15));
    }

    public static final void addEventEmitters$lambda$1(InterfaceC6947uP interfaceC6947uP, S91 s91, C8968cL0 c8968cL0, DialogInterface dialogInterface) {
        O90.m5968f(s91, "$reactContext");
        O90.m5968f(c8968cL0, "$view");
        interfaceC6947uP.mo11046g(new C6846so(OZ1.m6093d(s91), c8968cL0.getId(), 25));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC7543Ek1 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k("topRequestClose", AbstractC10889rJ0.m24256c("registrationName", "onRequestClose"));
        c0926OiM24254a.m6125k("topShow", AbstractC10889rJ0.m24256c("registrationName", "onShow"));
        c0926OiM24254a.m6125k("topDismiss", AbstractC10889rJ0.m24256c("registrationName", "onDismiss"));
        c0926OiM24254a.m6125k("topOrientationChange", AbstractC10889rJ0.m24256c("registrationName", "onOrientationChange"));
        HashMap mapM6122h = c0926OiM24254a.m6122h();
        O90.m5967e(mapM6122h, "build(...)");
        exportedCustomDirectEventTypeConstants.putAll(mapM6122h);
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends C10169lh0> getShadowNodeClass() {
        return C10191ls0.class;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @Override // p000.InterfaceC10319ms0
    @InterfaceC9871jM0(name = "animated")
    public void setAnimated(C8968cL0 view, boolean value) {
        O90.m5968f(view, "view");
    }

    @Override // p000.InterfaceC10319ms0
    @InterfaceC9871jM0(name = "identifier")
    public void setIdentifier(C8968cL0 view, int value) {
        O90.m5968f(view, "view");
    }

    @Override // p000.InterfaceC10319ms0
    @InterfaceC9871jM0(name = "presentationStyle")
    public void setPresentationStyle(C8968cL0 view, String value) {
        O90.m5968f(view, "view");
    }

    @Override // p000.InterfaceC10319ms0
    @InterfaceC9871jM0(name = "supportedOrientations")
    public void setSupportedOrientations(C8968cL0 view, ReadableArray value) {
        O90.m5968f(view, "view");
    }

    @Override // p000.InterfaceC10319ms0
    @InterfaceC9871jM0(name = "visible")
    public void setVisible(C8968cL0 view, boolean visible) {
        O90.m5968f(view, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final S91 reactContext, final C8968cL0 view) {
        O90.m5968f(reactContext, "reactContext");
        O90.m5968f(view, "view");
        final InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(reactContext, view.getId());
        if (interfaceC6947uPM6091b != null) {
            view.setOnRequestCloseListener(new C4224i9(interfaceC6947uPM6091b, reactContext, view, 15));
            view.setOnShowListener(new DialogInterface.OnShowListener() { // from class: WK0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ReactModalHostManager.addEventEmitters$lambda$1(interfaceC6947uPM6091b, reactContext, view, dialogInterface);
                }
            });
            view.setEventDispatcher(interfaceC6947uPM6091b);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public C10169lh0 createShadowNodeInstance() {
        return new C10191ls0();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C8968cL0 createViewInstance(S91 reactContext) {
        O90.m5968f(reactContext, "reactContext");
        C8968cL0 c8968cL0 = new C8968cL0(reactContext);
        reactContext.addLifecycleEventListener(c8968cL0);
        c8968cL0.f17446h = new ZK0(reactContext);
        return c8968cL0;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C8968cL0 view) {
        O90.m5968f(view, "view");
        super.onAfterUpdateTransaction((ReactModalHostManager) view);
        view.m10669b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(C8968cL0 view) {
        O90.m5968f(view, "view");
        super.onDropViewInstance((ReactModalHostManager) view);
        Context context = view.getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((S91) context).removeLifecycleEventListener(view);
        view.m10668a();
    }

    @Override // p000.InterfaceC10319ms0
    @InterfaceC9871jM0(name = "animationType")
    public void setAnimationType(C8968cL0 view, String animationType) {
        O90.m5968f(view, "view");
        if (animationType != null) {
            view.setAnimationType(animationType);
        }
    }

    @Override // p000.InterfaceC10319ms0
    @InterfaceC9871jM0(name = "hardwareAccelerated")
    public void setHardwareAccelerated(C8968cL0 view, boolean hardwareAccelerated) {
        O90.m5968f(view, "view");
        view.setHardwareAccelerated(hardwareAccelerated);
    }

    @Override // p000.InterfaceC10319ms0
    @InterfaceC9871jM0(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(C8968cL0 view, boolean statusBarTranslucent) {
        O90.m5968f(view, "view");
        view.setStatusBarTranslucent(statusBarTranslucent);
    }

    @Override // p000.InterfaceC10319ms0
    @InterfaceC9871jM0(name = "transparent")
    public void setTransparent(C8968cL0 view, boolean transparent) {
        O90.m5968f(view, "view");
        view.setTransparent(transparent);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(C8968cL0 view, NM0 props, G41 stateWrapper) {
        O90.m5968f(view, "view");
        O90.m5968f(props, "props");
        O90.m5968f(stateWrapper, "stateWrapper");
        view.setStateWrapper(stateWrapper);
        Context context = view.getContext();
        O90.m5967e(context, "getContext(...)");
        Point pointM22278a = AbstractC10063ks0.m22278a(context);
        view.f17446h.m9524n(pointM22278a.x, pointM22278a.y);
        return null;
    }
}
