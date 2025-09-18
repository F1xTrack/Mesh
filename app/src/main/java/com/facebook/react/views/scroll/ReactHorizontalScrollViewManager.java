package com.facebook.react.views.scroll;

import android.view.View;
import android.widget.OverScroller;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.uimanager.ViewGroupManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.AbstractC0852NX;
import p000.AbstractC10944rk1;
import p000.AbstractC11406vL1;
import p000.AbstractC11619x12;
import p000.AbstractC9536gk1;
import p000.BK0;
import p000.C11151tM0;
import p000.C11279uM0;
import p000.C7910Lm0;
import p000.CM0;
import p000.G41;
import p000.HO1;
import p000.InterfaceC0538IX;
import p000.InterfaceC11023sM0;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.InterfaceC9999kM0;
import p000.NM0;
import p000.S91;
import p000.XB0;
import p000.XZ1;

@InterfaceC9101dL0(name = ReactHorizontalScrollViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactHorizontalScrollViewManager extends ViewGroupManager<BK0> implements InterfaceC11023sM0 {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private InterfaceC0538IX mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this(null);
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
    public void setBorderColor(BK0 bk0, int i, Integer num) {
        bk0.f754y.m8469G().m7441i(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @InterfaceC9999kM0(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(BK0 bk0, int i, float f) {
        if (!AbstractC11619x12.m25735a(f)) {
            f = AbstractC11406vL1.m25403b(f);
        }
        if (i == 0) {
            bk0.setBorderRadius(f);
        } else {
            bk0.f754y.m8469G().m7445m(f, i - 1);
        }
    }

    @InterfaceC9871jM0(name = "borderStyle")
    public void setBorderStyle(BK0 bk0, String str) {
        bk0.setBorderStyle(str);
    }

    @InterfaceC9999kM0(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(BK0 bk0, int i, float f) {
        if (!AbstractC11619x12.m25735a(f)) {
            f = AbstractC11406vL1.m25403b(f);
        }
        bk0.f754y.m8469G().m7443k(SPACING_TYPES[i], f);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(BK0 bk0, int i) {
        bk0.setEndFillColor(i);
    }

    @InterfaceC9871jM0(name = "contentOffset")
    public void setContentOffset(BK0 bk0, ReadableMap readableMap) {
        if (readableMap == null) {
            bk0.scrollTo(0, 0);
            return;
        }
        boolean zHasKey = readableMap.hasKey("x");
        double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
        double d2 = zHasKey ? readableMap.getDouble("x") : 0.0d;
        if (readableMap.hasKey("y")) {
            d = readableMap.getDouble("y");
        }
        bk0.scrollTo((int) AbstractC11406vL1.m25403b((float) d2), (int) AbstractC11406vL1.m25403b((float) d));
    }

    @InterfaceC9871jM0(name = "decelerationRate")
    public void setDecelerationRate(BK0 bk0, float f) {
        bk0.setDecelerationRate(f);
    }

    @InterfaceC9871jM0(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(BK0 bk0, boolean z) {
        bk0.setDisableIntervalMomentum(z);
    }

    @InterfaceC9871jM0(name = "enableSyncOnScroll")
    public void setEnableSyncOnScroll(BK0 bk0, boolean z) {
        bk0.setEnableSyncOnScroll(z);
    }

    @InterfaceC9871jM0(name = "fadingEdgeLength")
    public void setFadingEdgeLength(BK0 bk0, int i) {
        if (i > 0) {
            bk0.setHorizontalFadingEdgeEnabled(true);
            bk0.setFadingEdgeLength(i);
        } else {
            bk0.setHorizontalFadingEdgeEnabled(false);
            bk0.setFadingEdgeLength(0);
        }
    }

    @InterfaceC9871jM0(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(BK0 bk0, ReadableMap readableMap) {
        if (readableMap != null) {
            bk0.setMaintainVisibleContentPosition(new C7910Lm0(readableMap.getInt("minIndexForVisible"), readableMap.hasKey("autoscrollToTopThreshold") ? Integer.valueOf(readableMap.getInt("autoscrollToTopThreshold")) : null));
        } else {
            bk0.setMaintainVisibleContentPosition(null);
        }
    }

    @InterfaceC9871jM0(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(BK0 bk0, boolean z) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        AbstractC9536gk1.m18625t(bk0, z);
    }

    @InterfaceC9871jM0(name = "overScrollMode")
    public void setOverScrollMode(BK0 bk0, String str) {
        bk0.setOverScrollMode(CM0.m1152e(str));
    }

    @InterfaceC9871jM0(name = "overflow")
    public void setOverflow(BK0 bk0, String str) {
        bk0.setOverflow(str);
    }

    @InterfaceC9871jM0(name = "pagingEnabled")
    public void setPagingEnabled(BK0 bk0, boolean z) {
        bk0.setPagingEnabled(z);
    }

    @InterfaceC9871jM0(name = "persistentScrollbar")
    public void setPersistentScrollbar(BK0 bk0, boolean z) {
        bk0.setScrollbarFadingEnabled(!z);
    }

    @InterfaceC9871jM0(name = "pointerEvents")
    public void setPointerEvents(BK0 bk0, String str) {
        bk0.setPointerEvents(XB0.m8951c(str));
    }

    @InterfaceC9871jM0(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(BK0 bk0, boolean z) {
        bk0.setRemoveClippedSubviews(z);
    }

    @InterfaceC9871jM0(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(BK0 bk0, boolean z) {
        bk0.setScrollEnabled(z);
    }

    @InterfaceC9871jM0(name = "scrollEventThrottle")
    public void setScrollEventThrottle(BK0 bk0, int i) {
        bk0.setScrollEventThrottle(i);
    }

    @InterfaceC9871jM0(name = "scrollPerfTag")
    public void setScrollPerfTag(BK0 bk0, String str) {
        bk0.setScrollPerfTag(str);
    }

    @InterfaceC9871jM0(name = "sendMomentumEvents")
    public void setSendMomentumEvents(BK0 bk0, boolean z) {
        bk0.setSendMomentumEvents(z);
    }

    @InterfaceC9871jM0(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(BK0 bk0, boolean z) {
        bk0.setHorizontalScrollBarEnabled(z);
    }

    @InterfaceC9871jM0(name = "snapToAlignment")
    public void setSnapToAlignment(BK0 bk0, String str) {
        bk0.setSnapToAlignment(CM0.m1153f(str));
    }

    @InterfaceC9871jM0(name = "snapToEnd")
    public void setSnapToEnd(BK0 bk0, boolean z) {
        bk0.setSnapToEnd(z);
    }

    @InterfaceC9871jM0(name = "snapToInterval")
    public void setSnapToInterval(BK0 bk0, float f) {
        bk0.setSnapInterval((int) (f * XZ1.m9088d().density));
    }

    @InterfaceC9871jM0(name = "snapToOffsets")
    public void setSnapToOffsets(BK0 bk0, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            bk0.setSnapOffsets(null);
            return;
        }
        float f = XZ1.m9088d().density;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * f)));
        }
        bk0.setSnapOffsets(arrayList);
    }

    @InterfaceC9871jM0(name = "snapToStart")
    public void setSnapToStart(BK0 bk0, boolean z) {
        bk0.setSnapToStart(z);
    }

    public ReactHorizontalScrollViewManager(InterfaceC0538IX interfaceC0538IX) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public BK0 createViewInstance(S91 s91) {
        return new BK0(s91);
    }

    @Override // p000.InterfaceC11023sM0
    public void flashScrollIndicators(BK0 bk0) {
        bk0.m606e();
    }

    @Override // p000.InterfaceC11023sM0
    public void scrollTo(BK0 bk0, C11151tM0 c11151tM0) {
        OverScroller overScroller = bk0.f732c;
        if (overScroller != null && !overScroller.isFinished()) {
            overScroller.abortAnimation();
        }
        boolean z = c11151tM0.f43038c;
        int i = c11151tM0.f43037b;
        int i2 = c11151tM0.f43036a;
        if (z) {
            bk0.mo605c(i2, i);
        } else {
            bk0.scrollTo(i2, i);
        }
    }

    @Override // p000.InterfaceC11023sM0
    public void scrollToEnd(BK0 bk0, C11279uM0 c11279uM0) {
        View childAt = bk0.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on HorizontalScrollView without child");
        }
        int paddingRight = bk0.getPaddingRight() + childAt.getWidth();
        OverScroller overScroller = bk0.f732c;
        if (overScroller != null && !overScroller.isFinished()) {
            overScroller.abortAnimation();
        }
        if (c11279uM0.f43683a) {
            bk0.mo605c(paddingRight, bk0.getScrollY());
        } else {
            bk0.scrollTo(paddingRight, bk0.getScrollY());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(BK0 bk0, NM0 nm0, G41 g41) {
        bk0.setStateWrapper(g41);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(BK0 bk0, int i, ReadableArray readableArray) {
        HO1.m3404b(this, bk0, i, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(BK0 bk0, String str, ReadableArray readableArray) {
        HO1.m3405c(this, bk0, str, readableArray);
    }

    @InterfaceC9871jM0(name = "horizontal")
    public void setHorizontal(BK0 bk0, boolean z) {
    }
}
