package com.facebook.react.views.scroll;

import android.view.View;
import android.widget.OverScroller;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.uimanager.ViewGroupManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p000.AbstractC0852NX;
import p000.AbstractC10889rJ0;
import p000.AbstractC10944rk1;
import p000.AbstractC11406vL1;
import p000.AbstractC11619x12;
import p000.AbstractC9536gk1;
import p000.C0926Oi;
import p000.C11151tM0;
import p000.C11279uM0;
import p000.C1210TE;
import p000.C7910Lm0;
import p000.CM0;
import p000.G41;
import p000.HO1;
import p000.InterfaceC0538IX;
import p000.InterfaceC11023sM0;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.InterfaceC9999kM0;
import p000.MW0;
import p000.NM0;
import p000.S91;
import p000.ViewGroupOnHierarchyChangeListenerC10767qM0;
import p000.XB0;
import p000.XZ1;

@InterfaceC9101dL0(name = ReactScrollViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactScrollViewManager extends ViewGroupManager<ViewGroupOnHierarchyChangeListenerC10767qM0> implements InterfaceC11023sM0 {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private InterfaceC0538IX mFpsListener;

    public ReactScrollViewManager() {
        this(null);
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        MW0 mw0 = MW0.f7205d;
        MW0.f7202a.getClass();
        c0926OiM24254a.m6125k(C1210TE.m7635J(mw0), AbstractC10889rJ0.m24256c("registrationName", "onScroll"));
        c0926OiM24254a.m6125k(C1210TE.m7635J(MW0.f7203b), AbstractC10889rJ0.m24256c("registrationName", "onScrollBeginDrag"));
        c0926OiM24254a.m6125k(C1210TE.m7635J(MW0.f7204c), AbstractC10889rJ0.m24256c("registrationName", "onScrollEndDrag"));
        c0926OiM24254a.m6125k(C1210TE.m7635J(MW0.f7206e), AbstractC10889rJ0.m24256c("registrationName", "onMomentumScrollBegin"));
        c0926OiM24254a.m6125k(C1210TE.m7635J(MW0.f7207f), AbstractC10889rJ0.m24256c("registrationName", "onMomentumScrollEnd"));
        return c0926OiM24254a.m6122h();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return AbstractC10889rJ0.m24258e("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(createExportedCustomDirectEventTypeConstants());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @InterfaceC9999kM0(customType = RemoteMessageAttributes.COLOR, names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, int i, Integer num) {
        viewGroupOnHierarchyChangeListenerC10767qM0.f40834z.m8469G().m7441i(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @InterfaceC9999kM0(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, int i, float f) {
        if (!AbstractC11619x12.m25735a(f)) {
            f = AbstractC11406vL1.m25403b(f);
        }
        if (i == 0) {
            viewGroupOnHierarchyChangeListenerC10767qM0.setBorderRadius(f);
        } else {
            viewGroupOnHierarchyChangeListenerC10767qM0.f40834z.m8469G().m7445m(f, i - 1);
        }
    }

    @InterfaceC9871jM0(name = "borderStyle")
    public void setBorderStyle(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, String str) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setBorderStyle(str);
    }

    @InterfaceC9999kM0(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, int i, float f) {
        if (!AbstractC11619x12.m25735a(f)) {
            f = AbstractC11406vL1.m25403b(f);
        }
        viewGroupOnHierarchyChangeListenerC10767qM0.f40834z.m8469G().m7443k(SPACING_TYPES[i], f);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, int i) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setEndFillColor(i);
    }

    @InterfaceC9871jM0(customType = "Point", name = "contentOffset")
    public void setContentOffset(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, ReadableMap readableMap) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setContentOffset(readableMap);
    }

    @InterfaceC9871jM0(name = "decelerationRate")
    public void setDecelerationRate(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, float f) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setDecelerationRate(f);
    }

    @InterfaceC9871jM0(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, boolean z) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setDisableIntervalMomentum(z);
    }

    @InterfaceC9871jM0(name = "enableSyncOnScroll")
    public void setEnableSyncOnScroll(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, boolean z) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setEnableSyncOnScroll(z);
    }

    @InterfaceC9871jM0(name = "fadingEdgeLength")
    public void setFadingEdgeLength(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, int i) {
        if (i > 0) {
            viewGroupOnHierarchyChangeListenerC10767qM0.setVerticalFadingEdgeEnabled(true);
            viewGroupOnHierarchyChangeListenerC10767qM0.setFadingEdgeLength(i);
        } else {
            viewGroupOnHierarchyChangeListenerC10767qM0.setVerticalFadingEdgeEnabled(false);
            viewGroupOnHierarchyChangeListenerC10767qM0.setFadingEdgeLength(0);
        }
    }

    @InterfaceC9871jM0(name = "isInvertedVirtualizedList")
    public void setIsInvertedVirtualizedList(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, boolean z) {
        if (z) {
            viewGroupOnHierarchyChangeListenerC10767qM0.setVerticalScrollbarPosition(1);
        } else {
            viewGroupOnHierarchyChangeListenerC10767qM0.setVerticalScrollbarPosition(0);
        }
    }

    @InterfaceC9871jM0(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, ReadableMap readableMap) {
        if (readableMap != null) {
            viewGroupOnHierarchyChangeListenerC10767qM0.setMaintainVisibleContentPosition(new C7910Lm0(readableMap.getInt("minIndexForVisible"), readableMap.hasKey("autoscrollToTopThreshold") ? Integer.valueOf(readableMap.getInt("autoscrollToTopThreshold")) : null));
        } else {
            viewGroupOnHierarchyChangeListenerC10767qM0.setMaintainVisibleContentPosition(null);
        }
    }

    @InterfaceC9871jM0(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, boolean z) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        AbstractC9536gk1.m18625t(viewGroupOnHierarchyChangeListenerC10767qM0, z);
    }

    @InterfaceC9871jM0(name = "overScrollMode")
    public void setOverScrollMode(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, String str) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setOverScrollMode(CM0.m1152e(str));
    }

    @InterfaceC9871jM0(name = "overflow")
    public void setOverflow(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, String str) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setOverflow(str);
    }

    @InterfaceC9871jM0(name = "pagingEnabled")
    public void setPagingEnabled(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, boolean z) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setPagingEnabled(z);
    }

    @InterfaceC9871jM0(name = "persistentScrollbar")
    public void setPersistentScrollbar(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, boolean z) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setScrollbarFadingEnabled(!z);
    }

    @InterfaceC9871jM0(name = "pointerEvents")
    public void setPointerEvents(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, String str) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setPointerEvents(XB0.m8951c(str));
    }

    @InterfaceC9871jM0(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, boolean z) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setRemoveClippedSubviews(z);
    }

    @InterfaceC9871jM0(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, boolean z) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setScrollEnabled(z);
        viewGroupOnHierarchyChangeListenerC10767qM0.setFocusable(z);
    }

    @InterfaceC9871jM0(name = "scrollEventThrottle")
    public void setScrollEventThrottle(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, int i) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setScrollEventThrottle(i);
    }

    @InterfaceC9871jM0(name = "scrollPerfTag")
    public void setScrollPerfTag(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, String str) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setScrollPerfTag(str);
    }

    @InterfaceC9871jM0(name = "sendMomentumEvents")
    public void setSendMomentumEvents(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, boolean z) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setSendMomentumEvents(z);
    }

    @InterfaceC9871jM0(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, boolean z) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setVerticalScrollBarEnabled(z);
    }

    @InterfaceC9871jM0(name = "snapToAlignment")
    public void setSnapToAlignment(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, String str) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setSnapToAlignment(CM0.m1153f(str));
    }

    @InterfaceC9871jM0(name = "snapToEnd")
    public void setSnapToEnd(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, boolean z) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setSnapToEnd(z);
    }

    @InterfaceC9871jM0(name = "snapToInterval")
    public void setSnapToInterval(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, float f) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setSnapInterval((int) (f * XZ1.m9088d().density));
    }

    @InterfaceC9871jM0(name = "snapToOffsets")
    public void setSnapToOffsets(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            viewGroupOnHierarchyChangeListenerC10767qM0.setSnapOffsets(null);
            return;
        }
        float f = XZ1.m9088d().density;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * f)));
        }
        viewGroupOnHierarchyChangeListenerC10767qM0.setSnapOffsets(arrayList);
    }

    @InterfaceC9871jM0(name = "snapToStart")
    public void setSnapToStart(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, boolean z) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setSnapToStart(z);
    }

    public ReactScrollViewManager(InterfaceC0538IX interfaceC0538IX) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroupOnHierarchyChangeListenerC10767qM0 createViewInstance(S91 s91) {
        return new ViewGroupOnHierarchyChangeListenerC10767qM0(s91);
    }

    @Override // p000.InterfaceC11023sM0
    public void flashScrollIndicators(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0) {
        viewGroupOnHierarchyChangeListenerC10767qM0.m23986d();
    }

    @Override // p000.InterfaceC11023sM0
    public void scrollTo(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, C11151tM0 c11151tM0) {
        OverScroller overScroller = viewGroupOnHierarchyChangeListenerC10767qM0.f40810b;
        if (overScroller != null && !overScroller.isFinished()) {
            overScroller.abortAnimation();
        }
        boolean z = c11151tM0.f43038c;
        int i = c11151tM0.f43037b;
        int i2 = c11151tM0.f43036a;
        if (z) {
            viewGroupOnHierarchyChangeListenerC10767qM0.mo605c(i2, i);
        } else {
            viewGroupOnHierarchyChangeListenerC10767qM0.scrollTo(i2, i);
        }
    }

    @Override // p000.InterfaceC11023sM0
    public void scrollToEnd(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, C11279uM0 c11279uM0) {
        View childAt = viewGroupOnHierarchyChangeListenerC10767qM0.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
        int paddingBottom = viewGroupOnHierarchyChangeListenerC10767qM0.getPaddingBottom() + childAt.getHeight();
        OverScroller overScroller = viewGroupOnHierarchyChangeListenerC10767qM0.f40810b;
        if (overScroller != null && !overScroller.isFinished()) {
            overScroller.abortAnimation();
        }
        if (c11279uM0.f43683a) {
            viewGroupOnHierarchyChangeListenerC10767qM0.mo605c(viewGroupOnHierarchyChangeListenerC10767qM0.getScrollX(), paddingBottom);
        } else {
            viewGroupOnHierarchyChangeListenerC10767qM0.scrollTo(viewGroupOnHierarchyChangeListenerC10767qM0.getScrollX(), paddingBottom);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, NM0 nm0, G41 g41) {
        viewGroupOnHierarchyChangeListenerC10767qM0.setStateWrapper(g41);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, int i, ReadableArray readableArray) {
        HO1.m3404b(this, viewGroupOnHierarchyChangeListenerC10767qM0, i, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, String str, ReadableArray readableArray) {
        HO1.m3405c(this, viewGroupOnHierarchyChangeListenerC10767qM0, str, readableArray);
    }

    @InterfaceC9871jM0(name = "horizontal")
    public void setHorizontal(ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0, boolean z) {
    }
}
