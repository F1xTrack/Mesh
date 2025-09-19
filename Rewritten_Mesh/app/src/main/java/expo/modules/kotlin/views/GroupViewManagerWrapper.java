package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.AbstractC10889rJ0;
import p000.AbstractC7907Lk1;
import p000.InterfaceC7701Hl1;
import p000.NM0;
import p000.O90;
import p000.S91;

@Metadata(m22266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ'\u0010$\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020 H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m22267d2 = {"Lexpo/modules/kotlin/views/GroupViewManagerWrapper;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/view/ViewGroup;", "LHl1;", "LLk1;", "viewWrapperDelegate", "<init>", "(LLk1;)V", "", "getName", "()Ljava/lang/String;", "LS91;", "reactContext", "createViewInstance", "(LS91;)Landroid/view/ViewGroup;", "viewToUpdate", "LNM0;", "props", "LTf1;", "updateProperties", "(Landroid/view/ViewGroup;LNM0;)V", "view", "onAfterUpdateTransaction", "(Landroid/view/ViewGroup;)V", "", "getNativeProps", "()Ljava/util/Map;", "onDropViewInstance", "", "", "getExportedCustomDirectEventTypeConstants", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "getChildCount", "(Landroid/view/ViewGroup;)I", "getChildAt", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "removeViewAt", "(Landroid/view/ViewGroup;I)V", "removeView", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "LLk1;", "getViewWrapperDelegate", "()LLk1;", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class GroupViewManagerWrapper extends ViewGroupManager<ViewGroup> implements InterfaceC7701Hl1 {
    private final AbstractC7907Lk1 viewWrapperDelegate;

    public GroupViewManagerWrapper(AbstractC7907Lk1 abstractC7907Lk1) {
        O90.m5968f(abstractC7907Lk1, "viewWrapperDelegate");
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        AbstractC7907Lk1 viewWrapperDelegate = getViewWrapperDelegate();
        viewWrapperDelegate.getClass();
        AbstractC10889rJ0.m24254a();
        viewWrapperDelegate.m5097a();
        throw null;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ViewManagerAdapter_".concat(getViewWrapperDelegate().f6826a.f2934b.f454a);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, String> getNativeProps() {
        super.getNativeProps();
        getViewWrapperDelegate().m5097a();
        throw null;
    }

    @Override // p000.InterfaceC7701Hl1
    public AbstractC7907Lk1 getViewWrapperDelegate() {
        return this.viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(ViewGroup parent, View view) {
        O90.m5968f(parent, "parent");
        O90.m5968f(view, "view");
        getViewWrapperDelegate().m5097a();
        throw null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateProperties(ViewGroup viewToUpdate, NM0 props) {
        O90.m5968f(viewToUpdate, "viewToUpdate");
        O90.m5968f(props, "props");
        O90.m5967e(props.f7734a, "mBackingMap");
        AbstractC7907Lk1 viewWrapperDelegate = getViewWrapperDelegate();
        viewWrapperDelegate.getClass();
        viewWrapperDelegate.m5097a();
        throw null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public void addView(ViewGroup parent, View child, int index) {
        O90.m5968f(parent, "parent");
        O90.m5968f(child, "child");
        getViewWrapperDelegate().m5097a();
        throw null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(S91 reactContext) {
        O90.m5968f(reactContext, "reactContext");
        AbstractC7907Lk1 viewWrapperDelegate = getViewWrapperDelegate();
        viewWrapperDelegate.getClass();
        viewWrapperDelegate.m5097a();
        throw null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public View getChildAt(ViewGroup parent, int index) {
        O90.m5968f(parent, "parent");
        getViewWrapperDelegate().m5097a();
        throw null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public int getChildCount(ViewGroup parent) {
        O90.m5968f(parent, "parent");
        getViewWrapperDelegate().m5097a();
        throw null;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ViewGroup view) {
        O90.m5968f(view, "view");
        super.onAfterUpdateTransaction((GroupViewManagerWrapper) view);
        AbstractC7907Lk1 viewWrapperDelegate = getViewWrapperDelegate();
        viewWrapperDelegate.getClass();
        viewWrapperDelegate.m5097a();
        throw null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ViewGroup view) {
        O90.m5968f(view, "view");
        super.onDropViewInstance((GroupViewManagerWrapper) view);
        getViewWrapperDelegate().m5098b(view);
        throw null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public void removeViewAt(ViewGroup parent, int index) {
        O90.m5968f(parent, "parent");
        getViewWrapperDelegate().m5097a();
        throw null;
    }
}
