package com.facebook.react;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC10639pM0;
import p000.AbstractC3929dS;
import p000.C7418Ca0;
import p000.C7730Ia0;
import p000.C8810b60;
import p000.HJ0;
import p000.InterfaceC10255mM0;
import p000.InterfaceC10511oM0;
import p000.InterfaceC11293uT0;
import p000.InterfaceC6947uP;
import p000.MT1;
import p000.OZ1;
import p000.QK0;
import p000.UN1;
import p000.ViewTreeObserverOnGlobalLayoutListenerC10383nM0;
import p000.YQ1;

/* loaded from: classes.dex */
public class ReactRootView extends FrameLayout implements InterfaceC11293uT0, InterfaceC10255mM0 {

    /* renamed from: a */
    public QK0 f17860a;

    /* renamed from: b */
    public String f17861b;

    /* renamed from: c */
    public Bundle f17862c;

    /* renamed from: d */
    public ViewTreeObserverOnGlobalLayoutListenerC10383nM0 f17863d;

    /* renamed from: e */
    public int f17864e;

    /* renamed from: f */
    public boolean f17865f;

    /* renamed from: g */
    public boolean f17866g;

    /* renamed from: h */
    public C7730Ia0 f17867h;

    /* renamed from: i */
    public C7418Ca0 f17868i;

    /* renamed from: j */
    public final HJ0 f17869j;

    /* renamed from: k */
    public boolean f17870k;

    /* renamed from: l */
    public int f17871l;

    /* renamed from: m */
    public int f17872m;

    /* renamed from: n */
    public int f17873n;

    /* renamed from: o */
    public int f17874o;

    /* renamed from: p */
    public int f17875p;

    /* renamed from: q */
    public int f17876q;

    /* renamed from: r */
    public int f17877r;

    /* renamed from: s */
    public final AtomicInteger f17878s;

    public ReactRootView(Context context) {
        super(context);
        this.f17864e = 0;
        this.f17869j = new HJ0(this);
        this.f17870k = false;
        this.f17871l = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f17872m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f17873n = 0;
        this.f17874o = 0;
        this.f17875p = Integer.MIN_VALUE;
        this.f17876q = Integer.MIN_VALUE;
        this.f17877r = 1;
        this.f17878s = new AtomicInteger(0);
        setRootViewTag(AbstractC10639pM0.m23746b());
        setClipChildren(false);
    }

    private ViewTreeObserverOnGlobalLayoutListenerC10383nM0 getCustomGlobalLayoutListener() {
        if (this.f17863d == null) {
            this.f17863d = new ViewTreeObserverOnGlobalLayoutListenerC10383nM0(this);
        }
        return this.f17863d;
    }

    /* renamed from: a */
    public void mo6036a(ViewGroup viewGroup, MotionEvent motionEvent) {
        if (m10914i() && OZ1.m6090a(getCurrentReactContext(), getUIManagerType()) != null) {
            this.f17867h.f5017c = false;
            C7418Ca0 c7418Ca0 = this.f17868i;
            if (c7418Ca0 != null) {
                c7418Ca0.f1461e = -1;
            }
        }
    }

    /* renamed from: b */
    public void mo6037b(Throwable th) {
        if (!mo6041g()) {
            throw new RuntimeException(th);
        }
        getCurrentReactContext().handleException(new C8810b60(th.getMessage(), this, th));
    }

    /* renamed from: c */
    public void mo6038c(ViewGroup viewGroup, MotionEvent motionEvent) {
        InterfaceC6947uP interfaceC6947uPM6090a;
        C7418Ca0 c7418Ca0;
        if (m10914i() && (interfaceC6947uPM6090a = OZ1.m6090a(getCurrentReactContext(), getUIManagerType())) != null) {
            this.f17867h.m3945c(motionEvent, interfaceC6947uPM6090a);
            if (viewGroup == null || (c7418Ca0 = this.f17868i) == null) {
                return;
            }
            c7418Ca0.m1242f(viewGroup, motionEvent, interfaceC6947uPM6090a);
        }
    }

    /* renamed from: d */
    public final void m10913d() {
        MT1.m5371b("attachToReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_START);
        if (getId() != -1) {
            ReactSoftExceptionLogger.logSoftException("ReactRootView", new C8810b60("Trying to attach a ReactRootView with an explicit id already set to [" + getId() + "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID."));
        }
        try {
            if (this.f17865f) {
                return;
            }
            this.f17865f = true;
            QK0 qk0 = this.f17860a;
            UN1.m7999c(qk0);
            UiThreadUtil.assertOnUiThread();
            if (qk0.f9565a.add(this)) {
                UiThreadUtil.assertOnUiThread();
                getState().compareAndSet(1, 0);
                ViewGroup rootViewGroup = getRootViewGroup();
                rootViewGroup.removeAllViews();
                rootViewGroup.setId(-1);
            } else {
                AbstractC3929dS.m17672e("ReactNative");
            }
            ReactContext reactContextM6636f = qk0.m6636f();
            if (qk0.f9568d == null && reactContextM6636f != null) {
                qk0.m6633b(this);
            }
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            mo6037b(e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!mo6041g() || !mo6043j()) {
            AbstractC3929dS.m17683p("ReactRootView");
            return super.dispatchKeyEvent(keyEvent);
        }
        HJ0 hj0 = this.f17869j;
        hj0.getClass();
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (action == 1 || action == 0) {
            HashMap map = HJ0.f4227c;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                hj0.m3344a(hj0.f4228a, action, (String) map.get(Integer.valueOf(keyCode)));
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e */
    public void mo6039e(MotionEvent motionEvent, boolean z) {
        if (!mo6041g() || !mo6043j()) {
            AbstractC3929dS.m17683p("ReactRootView");
            return;
        }
        if (this.f17868i == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                AbstractC3929dS.m17683p("ReactRootView");
            }
        } else {
            InterfaceC6947uP interfaceC6947uPM6090a = OZ1.m6090a(getCurrentReactContext(), getUIManagerType());
            if (interfaceC6947uPM6090a != null) {
                this.f17868i.m1241d(motionEvent, interfaceC6947uPM6090a, z);
            }
        }
    }

    /* renamed from: f */
    public void mo6040f(MotionEvent motionEvent) {
        if (!mo6041g() || !mo6043j()) {
            AbstractC3929dS.m17683p("ReactRootView");
            return;
        }
        if (this.f17867h == null) {
            AbstractC3929dS.m17683p("ReactRootView");
            return;
        }
        InterfaceC6947uP interfaceC6947uPM6090a = OZ1.m6090a(getCurrentReactContext(), getUIManagerType());
        if (interfaceC6947uPM6090a != null) {
            this.f17867h.m3944b(motionEvent, interfaceC6947uPM6090a);
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        UN1.m7998b(!this.f17865f, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    /* renamed from: g */
    public boolean mo6041g() {
        QK0 qk0 = this.f17860a;
        return (qk0 == null || qk0.m6636f() == null) ? false : true;
    }

    @Override // p000.InterfaceC10255mM0
    public Bundle getAppProperties() {
        return this.f17862c;
    }

    public ReactContext getCurrentReactContext() {
        return this.f17860a.m6636f();
    }

    @Override // p000.InterfaceC10255mM0
    public int getHeightMeasureSpec() {
        return this.f17872m;
    }

    public String getJSModuleName() {
        String str = this.f17861b;
        UN1.m7999c(str);
        return str;
    }

    public QK0 getReactInstanceManager() {
        return this.f17860a;
    }

    @Override // p000.InterfaceC10255mM0
    public ViewGroup getRootViewGroup() {
        return this;
    }

    @Override // p000.InterfaceC10255mM0
    public int getRootViewTag() {
        return this.f17864e;
    }

    @Override // p000.InterfaceC10255mM0
    public AtomicInteger getState() {
        return this.f17878s;
    }

    @Override // p000.InterfaceC10255mM0
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    public int getUIManagerType() {
        return this.f17877r;
    }

    @Override // p000.InterfaceC10255mM0
    public int getWidthMeasureSpec() {
        return this.f17871l;
    }

    /* renamed from: h */
    public boolean mo6042h() {
        return this.f17860a != null;
    }

    /* renamed from: i */
    public final boolean m10914i() {
        if (!mo6041g() || !mo6043j()) {
            AbstractC3929dS.m17683p("ReactRootView");
            return false;
        }
        if (this.f17867h == null) {
            AbstractC3929dS.m17683p("ReactRootView");
            return false;
        }
        if (!ReactFeatureFlags.dispatchPointerEvents || this.f17868i != null) {
            return true;
        }
        AbstractC3929dS.m17683p("ReactRootView");
        return false;
    }

    /* renamed from: j */
    public boolean mo6043j() {
        return this.f17865f;
    }

    /* renamed from: k */
    public final void m10915k() {
        MT1.m5371b("ReactRootView.runApplication");
        try {
            if (mo6042h() && mo6043j()) {
                ReactContext currentReactContext = getCurrentReactContext();
                if (currentReactContext == null) {
                    Trace.endSection();
                    return;
                }
                CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (this.f17870k) {
                    m10917m(this.f17871l, this.f17872m, true);
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rootTag", getRootViewTag());
                Bundle appProperties = getAppProperties();
                if (appProperties != null) {
                    writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                }
                this.f17866g = true;
                ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
                Trace.endSection();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: l */
    public final void m10916l(String str, WritableMap writableMap) {
        if (mo6042h()) {
            getCurrentReactContext().emitDeviceEvent(str, writableMap);
        }
    }

    /* renamed from: m */
    public final void m10917m(int i, int i2, boolean z) {
        UIManager uIManagerM6095f;
        int i3;
        int i4;
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_START);
        if (!mo6042h()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            AbstractC3929dS.m17683p("ReactRootView");
            return;
        }
        int i5 = 0;
        boolean z2 = getUIManagerType() == 2;
        if (z2 && ((i4 = this.f17864e) == 0 || i4 == -1)) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            AbstractC3929dS.m17672e("ReactRootView");
            return;
        }
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (uIManagerM6095f = OZ1.m6095f(currentReactContext, getUIManagerType(), true)) != null) {
            if (z2) {
                Point pointM9299c = YQ1.m9299c(this);
                i5 = pointM9299c.x;
                i3 = pointM9299c.y;
            } else {
                i3 = 0;
            }
            if (z || i5 != this.f17875p || i3 != this.f17876q) {
                uIManagerM6095f.updateRootLayoutSpecs(getRootViewTag(), i, i2, i5, i3);
            }
            this.f17875p = i5;
            this.f17876q = i3;
        }
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (mo6043j()) {
            getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (mo6043j()) {
            getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!mo6041g() || !mo6043j()) {
            AbstractC3929dS.m17683p("ReactRootView");
            super.onFocusChanged(z, i, rect);
            return;
        }
        HJ0 hj0 = this.f17869j;
        int i2 = hj0.f4228a;
        if (i2 != -1) {
            hj0.m3344a(i2, -1, "blur");
        }
        hj0.f4228a = -1;
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        mo6039e(motionEvent, false);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        mo6039e(motionEvent, true);
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mo6040f(motionEvent);
        mo6039e(motionEvent, true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f17870k && getUIManagerType() == 2) {
            m10917m(this.f17871l, this.f17872m, false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        int iMax2;
        MT1.m5371b("ReactRootView.onMeasure");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_START);
        try {
            boolean z = (i == this.f17871l && i2 == this.f17872m) ? false : true;
            this.f17871l = i;
            this.f17872m = i2;
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 0) {
                iMax = 0;
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
                }
            } else {
                iMax = View.MeasureSpec.getSize(i);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                iMax2 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt2 = getChildAt(i4);
                    iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
                }
            } else {
                iMax2 = View.MeasureSpec.getSize(i2);
            }
            setMeasuredDimension(iMax, iMax2);
            this.f17870k = true;
            if (mo6042h() && !mo6043j()) {
                m10913d();
            } else if (z || this.f17873n != iMax || this.f17874o != iMax2) {
                m10917m(this.f17871l, this.f17872m, true);
            }
            this.f17873n = iMax;
            this.f17874o = iMax2;
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
            Trace.endSection();
        } catch (Throwable th) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        mo6040f(motionEvent);
        mo6039e(motionEvent, false);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.f17866g) {
            this.f17866g = false;
            ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, getJSModuleName(), this.f17864e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!mo6041g() || !mo6043j()) {
            AbstractC3929dS.m17683p("ReactRootView");
            super.requestChildFocus(view, view2);
            return;
        }
        HJ0 hj0 = this.f17869j;
        if (hj0.f4228a != view2.getId()) {
            int i = hj0.f4228a;
            if (i != -1) {
                hj0.m3344a(i, -1, "blur");
            }
            hj0.f4228a = view2.getId();
            hj0.m3344a(view2.getId(), -1, "focus");
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.f17862c = bundle;
        int i = this.f17864e;
        if (i == 0 || i == -1) {
            return;
        }
        m10915k();
    }

    public void setIsFabric(boolean z) {
        this.f17877r = z ? 2 : 1;
    }

    @Override // p000.InterfaceC10255mM0
    public void setRootViewTag(int i) {
        this.f17864e = i;
    }

    @Override // p000.InterfaceC10255mM0
    public void setShouldLogContentAppeared(boolean z) {
        this.f17866g = z;
    }

    public void setEventListener(InterfaceC10511oM0 interfaceC10511oM0) {
    }
}
