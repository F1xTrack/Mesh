package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.ViewGroupManager;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.AbstractC7222ym;
import p000.C11427vW0;
import p000.C11554wW0;
import p000.C6340l4;
import p000.EnumC11299uW0;
import p000.G41;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9735iI0;
import p000.InterfaceC9871jM0;
import p000.NM0;
import p000.O90;
import p000.S91;

@InterfaceC9101dL0(name = ScreenStackHeaderSubviewManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m22267d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LvW0;", "LiI0;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LS91;", "context", "createViewInstance", "(LS91;)LvW0;", "view", "type", "LTf1;", "setType", "(LvW0;Ljava/lang/String;)V", "LNM0;", "props", "LG41;", "stateWrapper", "", "updateState", "(LvW0;LNM0;LG41;)Ljava/lang/Object;", "LEk1;", "getDelegate", "()LEk1;", "delegate", "LEk1;", "Companion", "wW0", "react-native-screens_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ScreenStackHeaderSubviewManager extends ViewGroupManager<C11427vW0> implements InterfaceC9735iI0 {
    public static final C11554wW0 Companion = new C11554wW0();
    public static final String REACT_CLASS = "RNSScreenStackHeaderSubview";
    private final InterfaceC7543Ek1 delegate = new C6340l4(this, 13);

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
    public C11427vW0 createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        C11427vW0 c11427vW0 = new C11427vW0(context);
        c11427vW0.f44399c = EnumC11299uW0.f43714c;
        return c11427vW0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // p000.InterfaceC9735iI0
    @InterfaceC9871jM0(name = "type")
    public void setType(C11427vW0 view, String type) {
        EnumC11299uW0 enumC11299uW0;
        O90.m5968f(view, "view");
        if (type != null) {
            switch (type.hashCode()) {
                case -1364013995:
                    if (type.equals("center")) {
                        enumC11299uW0 = EnumC11299uW0.f43713b;
                        view.setType(enumC11299uW0);
                        return;
                    }
                    break;
                case 3015911:
                    if (type.equals("back")) {
                        enumC11299uW0 = EnumC11299uW0.f43715d;
                        view.setType(enumC11299uW0);
                        return;
                    }
                    break;
                case 3317767:
                    if (type.equals("left")) {
                        enumC11299uW0 = EnumC11299uW0.f43712a;
                        view.setType(enumC11299uW0);
                        return;
                    }
                    break;
                case 108511772:
                    if (type.equals("right")) {
                        enumC11299uW0 = EnumC11299uW0.f43714c;
                        view.setType(enumC11299uW0);
                        return;
                    }
                    break;
                case 1778179403:
                    if (type.equals("searchBar")) {
                        enumC11299uW0 = EnumC11299uW0.f43716e;
                        view.setType(enumC11299uW0);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26245v("Unknown type ", type));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(C11427vW0 view, NM0 props, G41 stateWrapper) {
        O90.m5968f(view, "view");
        return super.updateState((ScreenStackHeaderSubviewManager) view, props, stateWrapper);
    }
}
