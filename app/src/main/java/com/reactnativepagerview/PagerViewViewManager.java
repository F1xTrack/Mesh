package com.reactnativepagerview;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC10889rJ0;
import p000.AbstractC10899rO0;
import p000.AbstractC11406vL1;
import p000.C0400GL;
import p000.C0804Mm;
import p000.C10050kl1;
import p000.C10178ll1;
import p000.C7562Eu0;
import p000.C8196Qz0;
import p000.C8300Sz0;
import p000.InterfaceC6947uP;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.RunnableC0204DE;
import p000.RunnableC8176Qp0;
import p000.RunnableC8352Tz0;
import p000.S91;

@Metadata(m22266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020 H\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u000fH\u0007¢\u0006\u0004\b&\u0010\u001fJ\u001f\u0010'\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0005H\u0007¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u000fH\u0087\u0002¢\u0006\u0004\b)\u0010\u001fJ\u001f\u0010*\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0005H\u0007¢\u0006\u0004\b*\u0010(J\u001f\u0010+\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0005H\u0007¢\u0006\u0004\b+\u0010(J'\u0010.\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050-0,H\u0016¢\u0006\u0004\b.\u0010/J+\u00104\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u00052\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u000fH\u0007¢\u0006\u0004\b7\u0010\u001fR\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, m22267d2 = {"Lcom/reactnativepagerview/PagerViewViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LEu0;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LS91;", "reactContext", "createViewInstance", "(LS91;)LEu0;", "host", "Landroid/view/View;", "child", "", "index", "LTf1;", "addView", "(LEu0;Landroid/view/View;I)V", "parent", "getChildCount", "(LEu0;)I", "getChildAt", "(LEu0;I)Landroid/view/View;", "view", "removeView", "(LEu0;Landroid/view/View;)V", "removeAllViews", "(LEu0;)V", "removeViewAt", "(LEu0;I)V", "", "needsCustomLayoutForChildren", "()Z", "value", "setScrollEnabled", "(LEu0;Z)V", "setInitialPage", "setOrientation", "(LEu0;Ljava/lang/String;)V", "set", "setOverScrollMode", "setLayoutDirection", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(LEu0;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "margin", "setPageMargin", "LuP;", "eventDispatcher", "LuP;", "Companion", "Sz0", "react-native-pager-view_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PagerViewViewManager extends ViewGroupManager<C7562Eu0> {
    private static final String COMMAND_SET_PAGE = "setPage";
    private static final String COMMAND_SET_PAGE_WITHOUT_ANIMATION = "setPageWithoutAnimation";
    private static final String COMMAND_SET_SCROLL_ENABLED = "setScrollEnabledImperatively";
    public static final C8300Sz0 Companion = new C8300Sz0();
    private InterfaceC6947uP eventDispatcher;

    public static final void createViewInstance$lambda$0(C10050kl1 c10050kl1, PagerViewViewManager pagerViewViewManager, C7562Eu0 c7562Eu0) {
        O90.m5968f(c10050kl1, "$vp");
        O90.m5968f(pagerViewViewManager, "this$0");
        O90.m5968f(c7562Eu0, "$host");
        ((ArrayList) c10050kl1.f36663c.f17733b).add(new C8196Qz0(pagerViewViewManager, c7562Eu0));
        InterfaceC6947uP interfaceC6947uP = pagerViewViewManager.eventDispatcher;
        if (interfaceC6947uP != null) {
            interfaceC6947uP.mo11046g(new C0400GL(c7562Eu0.getId(), c10050kl1.getCurrentItem()));
        } else {
            O90.m5977o("eventDispatcher");
            throw null;
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C7562Eu0 host, View child, int index) throws ClassNotFoundException {
        Integer initialIndex;
        O90.m5968f(host, "host");
        O90.m5968f(child, "child");
        if (!(host.getChildAt(0) instanceof C10050kl1)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = host.getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        C10050kl1 c10050kl1 = (C10050kl1) childAt;
        C10178ll1 c10178ll1 = (C10178ll1) c10050kl1.getAdapter();
        if (c10178ll1 != null) {
            c10178ll1.f37283d.add(index, child);
            c10178ll1.f41641a.m24731c(index);
        }
        if (c10050kl1.getCurrentItem() == index) {
            c10050kl1.post(new RunnableC0204DE(29, c10050kl1));
        }
        if (host.getDidSetInitialIndex() || (initialIndex = host.getInitialIndex()) == null || initialIndex.intValue() != index) {
            return;
        }
        host.setDidSetInitialIndex(true);
        c10050kl1.post(new RunnableC0204DE(29, c10050kl1));
        c10050kl1.m22262b(index, false);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(C7562Eu0 parent, int index) throws ClassNotFoundException {
        O90.m5968f(parent, "parent");
        if (!(parent.getChildAt(0) instanceof C10050kl1)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = parent.getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        C10178ll1 c10178ll1 = (C10178ll1) ((C10050kl1) childAt).getAdapter();
        O90.m5965c(c10178ll1);
        Object obj = c10178ll1.f37283d.get(index);
        O90.m5967e(obj, "get(...)");
        return (View) obj;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(C7562Eu0 parent) throws ClassNotFoundException {
        O90.m5968f(parent, "parent");
        if (!(parent.getChildAt(0) instanceof C10050kl1)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = parent.getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        AbstractC10899rO0 adapter = ((C10050kl1) childAt).getAdapter();
        if (adapter != null) {
            return adapter.mo3173a();
        }
        return 0;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return AbstractC10889rJ0.m24258e("topPageScroll", AbstractC10889rJ0.m24256c("registrationName", "onPageScroll"), "topPageScrollStateChanged", AbstractC10889rJ0.m24256c("registrationName", "onPageScrollStateChanged"), "topPageSelected", AbstractC10889rJ0.m24256c("registrationName", "onPageSelected"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCViewPager";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.J50
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public void removeAllViews(C7562Eu0 parent) throws ClassNotFoundException {
        O90.m5968f(parent, "parent");
        if (!(parent.getChildAt(0) instanceof C10050kl1)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = parent.getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        C10050kl1 c10050kl1 = (C10050kl1) childAt;
        c10050kl1.setUserInputEnabled(false);
        C10178ll1 c10178ll1 = (C10178ll1) c10050kl1.getAdapter();
        if (c10178ll1 != null) {
            ArrayList arrayList = c10178ll1.f37283d;
            int size = arrayList.size();
            int i = 1;
            if (1 <= size) {
                while (true) {
                    Object obj = arrayList.get(i - 1);
                    O90.m5967e(obj, "get(...)");
                    View view = (View) obj;
                    ViewParent parent2 = view.getParent();
                    if ((parent2 != null ? parent2.getParent() : null) != null) {
                        ViewParent parent3 = view.getParent().getParent();
                        O90.m5966d(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
                        Object parent4 = view.getParent();
                        O90.m5966d(parent4, "null cannot be cast to non-null type android.view.View");
                        ((ViewGroup) parent3).removeView((View) parent4);
                    }
                    if (i == size) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            int size2 = arrayList.size();
            arrayList.clear();
            c10178ll1.f41641a.m24732d(0, size2);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(C7562Eu0 parent, View view) throws ClassNotFoundException {
        ArrayList arrayList;
        int iIndexOf;
        O90.m5968f(parent, "parent");
        O90.m5968f(view, "view");
        if (!(parent.getChildAt(0) instanceof C10050kl1)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = parent.getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        C10050kl1 c10050kl1 = (C10050kl1) childAt;
        C10178ll1 c10178ll1 = (C10178ll1) c10050kl1.getAdapter();
        if (c10178ll1 != null && (iIndexOf = (arrayList = c10178ll1.f37283d).indexOf(view)) > -1 && iIndexOf >= 0 && iIndexOf < arrayList.size()) {
            arrayList.remove(iIndexOf);
            c10178ll1.f41641a.m24732d(iIndexOf, 1);
        }
        c10050kl1.post(new RunnableC0204DE(29, c10050kl1));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(C7562Eu0 parent, int index) throws ClassNotFoundException {
        View view;
        O90.m5968f(parent, "parent");
        if (!(parent.getChildAt(0) instanceof C10050kl1)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = parent.getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        C10050kl1 c10050kl1 = (C10050kl1) childAt;
        C10178ll1 c10178ll1 = (C10178ll1) c10050kl1.getAdapter();
        if (c10178ll1 != null) {
            Object obj = c10178ll1.f37283d.get(index);
            O90.m5967e(obj, "get(...)");
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null && view.getParent() != null) {
            ViewParent parent2 = view.getParent();
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        if (c10178ll1 != null && index >= 0) {
            ArrayList arrayList = c10178ll1.f37283d;
            if (index < arrayList.size()) {
                arrayList.remove(index);
                c10178ll1.f41641a.m24732d(index, 1);
            }
        }
        c10050kl1.post(new RunnableC0204DE(29, c10050kl1));
    }

    @InterfaceC9871jM0(defaultInt = -1, name = "offscreenPageLimit")
    public final void set(C7562Eu0 host, int value) throws ClassNotFoundException {
        O90.m5968f(host, "host");
        if (!(host.getChildAt(0) instanceof C10050kl1)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = host.getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        ((C10050kl1) childAt).setOffscreenPageLimit(value);
    }

    @InterfaceC9871jM0(defaultInt = 0, name = "initialPage")
    public final void setInitialPage(C7562Eu0 host, int value) throws ClassNotFoundException {
        O90.m5968f(host, "host");
        if (!(host.getChildAt(0) instanceof C10050kl1)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = host.getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        C10050kl1 c10050kl1 = (C10050kl1) childAt;
        if (host.getInitialIndex() == null) {
            host.setInitialIndex(Integer.valueOf(value));
            c10050kl1.post(new RunnableC8352Tz0(0, host));
        }
    }

    @InterfaceC9871jM0(name = "layoutDirection")
    public final void setLayoutDirection(C7562Eu0 host, String value) throws ClassNotFoundException {
        O90.m5968f(host, "host");
        O90.m5968f(value, "value");
        if (!(host.getChildAt(0) instanceof C10050kl1)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = host.getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        C10050kl1 c10050kl1 = (C10050kl1) childAt;
        if (value.equals("rtl")) {
            c10050kl1.setLayoutDirection(1);
        } else {
            c10050kl1.setLayoutDirection(0);
        }
    }

    @InterfaceC9871jM0(name = "orientation")
    public final void setOrientation(C7562Eu0 host, String value) throws ClassNotFoundException {
        O90.m5968f(host, "host");
        O90.m5968f(value, "value");
        if (!(host.getChildAt(0) instanceof C10050kl1)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = host.getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        ((C10050kl1) childAt).setOrientation(value.equals("vertical") ? 1 : 0);
    }

    @InterfaceC9871jM0(name = "overScrollMode")
    public final void setOverScrollMode(C7562Eu0 host, String value) throws ClassNotFoundException {
        O90.m5968f(host, "host");
        O90.m5968f(value, "value");
        if (!(host.getChildAt(0) instanceof C10050kl1)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = host.getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        View childAt2 = ((C10050kl1) childAt).getChildAt(0);
        if (value.equals("never")) {
            childAt2.setOverScrollMode(2);
        } else if (value.equals("always")) {
            childAt2.setOverScrollMode(0);
        } else {
            childAt2.setOverScrollMode(1);
        }
    }

    @InterfaceC9871jM0(defaultInt = 0, name = "pageMargin")
    public final void setPageMargin(C7562Eu0 host, int margin) throws ClassNotFoundException {
        O90.m5968f(host, "host");
        if (!(host.getChildAt(0) instanceof C10050kl1)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = host.getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        C10050kl1 c10050kl1 = (C10050kl1) childAt;
        c10050kl1.setPageTransformer(new C0804Mm((int) AbstractC11406vL1.m25403b(margin), c10050kl1, 5));
    }

    @InterfaceC9871jM0(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(C7562Eu0 host, boolean value) throws ClassNotFoundException {
        O90.m5968f(host, "host");
        if (!(host.getChildAt(0) instanceof C10050kl1)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = host.getChildAt(0);
        O90.m5966d(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        ((C10050kl1) childAt).setUserInputEnabled(value);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C7562Eu0 createViewInstance(S91 reactContext) {
        O90.m5968f(reactContext, "reactContext");
        C7562Eu0 c7562Eu0 = new C7562Eu0(reactContext);
        c7562Eu0.f2950c = ViewConfiguration.get(c7562Eu0.getContext()).getScaledTouchSlop();
        c7562Eu0.setId(View.generateViewId());
        c7562Eu0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c7562Eu0.setSaveEnabled(false);
        C10050kl1 c10050kl1 = new C10050kl1(reactContext);
        c10050kl1.setAdapter(new C10178ll1());
        c10050kl1.setSaveEnabled(false);
        NativeModule nativeModule = reactContext.f10602a.getNativeModule((Class<NativeModule>) UIManagerModule.class);
        O90.m5965c(nativeModule);
        InterfaceC6947uP eventDispatcher = ((UIManagerModule) nativeModule).getEventDispatcher();
        O90.m5967e(eventDispatcher, "getEventDispatcher(...)");
        this.eventDispatcher = eventDispatcher;
        c10050kl1.post(new RunnableC8176Qp0(c10050kl1, this, c7562Eu0, 1));
        c7562Eu0.addView(c10050kl1);
        return c7562Eu0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x004b, code lost:
    
        if (r8.equals(com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0064, code lost:
    
        if (r8.equals(com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE_WITHOUT_ANIMATION) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0066, code lost:
    
        r9 = r9.getInt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x006a, code lost:
    
        if (r2 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0070, code lost:
    
        if (r2.intValue() <= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0072, code lost:
    
        if (r9 < 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0078, code lost:
    
        if (r9 >= r2.intValue()) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x007a, code lost:
    
        r8 = r8.equals(com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE);
        r7.post(new p000.RunnableC0204DE(29, r7));
        r7.m22262b(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x008b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return;
     */
    @Override // com.facebook.react.uimanager.ViewManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void receiveCommand(p000.C7562Eu0 r7, java.lang.String r8, com.facebook.react.bridge.ReadableArray r9) throws java.lang.ClassNotFoundException {
        /*
            r6 = this;
            r0 = 2
            r1 = 0
            java.lang.String r2 = "root"
            p000.O90.m5968f(r7, r2)
            super.receiveCommand(r7, r8, r9)
            android.view.View r2 = r7.getChildAt(r1)
            boolean r2 = r2 instanceof p000.C10050kl1
            if (r2 == 0) goto La5
            android.view.View r7 = r7.getChildAt(r1)
            java.lang.String r2 = "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2"
            p000.O90.m5966d(r7, r2)
            kl1 r7 = (p000.C10050kl1) r7
            p000.UN1.m7999c(r9)
            rO0 r2 = r7.getAdapter()
            if (r2 == 0) goto L2f
            int r2 = r2.mo3173a()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L30
        L2f:
            r2 = 0
        L30:
            if (r8 == 0) goto L8c
            int r3 = r8.hashCode()
            r4 = -445763635(0xffffffffe56e2fcd, float:-7.030031E22)
            java.lang.String r5 = "setPage"
            if (r3 == r4) goto L5e
            r4 = 1747675147(0x682b680b, float:3.2377757E24)
            if (r3 == r4) goto L4e
            r4 = 1984860689(0x764e9211, float:1.0474372E33)
            if (r3 != r4) goto L8c
            boolean r3 = r8.equals(r5)
            if (r3 == 0) goto L8c
            goto L66
        L4e:
            java.lang.String r2 = "setScrollEnabledImperatively"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L8c
            boolean r8 = r9.getBoolean(r1)
            r7.setUserInputEnabled(r8)
            goto L8b
        L5e:
            java.lang.String r3 = "setPageWithoutAnimation"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L8c
        L66:
            int r9 = r9.getInt(r1)
            if (r2 == 0) goto L8b
            int r0 = r2.intValue()
            if (r0 <= 0) goto L8b
            if (r9 < 0) goto L8b
            int r0 = r2.intValue()
            if (r9 >= r0) goto L8b
            boolean r8 = r8.equals(r5)
            DE r0 = new DE
            r1 = 29
            r0.<init>(r1, r7)
            r7.post(r0)
            r7.m22262b(r9, r8)
        L8b:
            return
        L8c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r9[r1] = r8
            java.lang.String r8 = "PagerViewViewManager"
            r1 = 1
            r9[r1] = r8
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r9, r0)
            java.lang.String r9 = "Unsupported command %d received by %s."
            java.lang.String r8 = java.lang.String.format(r9, r8)
            r7.<init>(r8)
            throw r7
        La5:
            java.lang.ClassNotFoundException r7 = new java.lang.ClassNotFoundException
            java.lang.String r8 = "Could not retrieve ViewPager2 instance"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativepagerview.PagerViewViewManager.receiveCommand(Eu0, java.lang.String, com.facebook.react.bridge.ReadableArray):void");
    }
}
