package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.runtime.ReactHostImpl;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class OM0 extends ReactRootView {

    /* renamed from: t */
    public final T71 f8396t;

    /* renamed from: u */
    public final C7730Ia0 f8397u;

    /* renamed from: v */
    public final C7418Ca0 f8398v;

    /* renamed from: w */
    public boolean f8399w;

    /* renamed from: x */
    public int f8400x;

    /* renamed from: y */
    public int f8401y;

    public OM0(Context context, T71 t71) {
        super(context);
        this.f8396t = t71;
        this.f8397u = new C7730Ia0(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f8398v = new C7418Ca0(this);
        }
    }

    private final Point getViewportOffset() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }

    @Override // com.facebook.react.ReactRootView, p000.InterfaceC11293uT0
    /* renamed from: a */
    public final void mo6036a(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "ev");
        if (this.f8396t.m7558D() == null) {
            return;
        }
        this.f8397u.f5017c = false;
        C7418Ca0 c7418Ca0 = this.f8398v;
        if (c7418Ca0 != null) {
            c7418Ca0.f1461e = -1;
        }
    }

    @Override // com.facebook.react.ReactRootView, p000.InterfaceC11293uT0
    /* renamed from: b */
    public final void mo6037b(Throwable th) {
        O90.m5967e((ReactHostImpl) ((AtomicReference) this.f8396t.f11174b).get(), "getReactHost(...)");
        String string = Objects.toString(th.getMessage(), "");
        O90.m5965c(string);
        C8810b60 c8810b60 = new C8810b60(string, this, th);
        int i = ReactHostImpl.f17939a;
        c8810b60.getMessage();
        throw null;
    }

    @Override // com.facebook.react.ReactRootView, p000.InterfaceC11293uT0
    /* renamed from: c */
    public final void mo6038c(ViewGroup viewGroup, MotionEvent motionEvent) {
        C7418Ca0 c7418Ca0;
        O90.m5968f(motionEvent, "ev");
        C6840si c6840siM7558D = this.f8396t.m7558D();
        if (c6840siM7558D == null) {
            return;
        }
        this.f8397u.m3945c(motionEvent, c6840siM7558D);
        if (viewGroup == null || (c7418Ca0 = this.f8398v) == null) {
            return;
        }
        c7418Ca0.m1242f(viewGroup, motionEvent, c6840siM7558D);
    }

    @Override // com.facebook.react.ReactRootView
    /* renamed from: e */
    public final void mo6039e(MotionEvent motionEvent, boolean z) {
        O90.m5968f(motionEvent, "event");
        C7418Ca0 c7418Ca0 = this.f8398v;
        if (c7418Ca0 == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                AbstractC3929dS.m17683p("ReactSurfaceView");
            }
        } else {
            C6840si c6840siM7558D = this.f8396t.m7558D();
            if (c6840siM7558D != null) {
                c7418Ca0.m1241d(motionEvent, c6840siM7558D, z);
            } else {
                AbstractC3929dS.m17683p("ReactSurfaceView");
            }
        }
    }

    @Override // com.facebook.react.ReactRootView
    /* renamed from: f */
    public final void mo6040f(MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "event");
        C6840si c6840siM7558D = this.f8396t.m7558D();
        if (c6840siM7558D != null) {
            this.f8397u.m3944b(motionEvent, c6840siM7558D);
        } else {
            AbstractC3929dS.m17683p("ReactSurfaceView");
        }
    }

    @Override // com.facebook.react.ReactRootView
    /* renamed from: g */
    public final boolean mo6041g() {
        T71 t71 = this.f8396t;
        if (((AtomicReference) t71.f11174b).get() == null) {
            return false;
        }
        ((ReactHostImpl) ((AtomicReference) t71.f11174b).get()).getClass();
        throw null;
    }

    @Override // com.facebook.react.ReactRootView
    public ReactContext getCurrentReactContext() {
        T71 t71 = this.f8396t;
        if (!(((AtomicReference) t71.f11174b).get() != null)) {
            return null;
        }
        ((ReactHostImpl) ((AtomicReference) t71.f11174b).get()).getClass();
        throw null;
    }

    @Override // com.facebook.react.ReactRootView, p000.InterfaceC10255mM0
    public String getJSModuleName() {
        String moduleName = ((SurfaceHandlerBinding) this.f8396t.f11175c).getModuleName();
        O90.m5967e(moduleName, "<get-moduleName>(...)");
        return moduleName;
    }

    @Override // com.facebook.react.ReactRootView, p000.InterfaceC10255mM0
    public int getUIManagerType() {
        return 2;
    }

    @Override // com.facebook.react.ReactRootView
    /* renamed from: h */
    public final boolean mo6042h() {
        T71 t71 = this.f8396t;
        if (((AtomicReference) t71.f11174b).get() == null) {
            return false;
        }
        ((ReactHostImpl) ((AtomicReference) t71.f11174b).get()).getClass();
        return false;
    }

    @Override // com.facebook.react.ReactRootView
    /* renamed from: j */
    public final boolean mo6043j() {
        return ((AtomicReference) this.f8396t.f11174b).get() != null;
    }

    @Override // com.facebook.react.ReactRootView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f8399w && z) {
            Point viewportOffset = getViewportOffset();
            this.f8396t.m7568T(this.f8400x, this.f8401y, viewportOffset.x, viewportOffset.y);
        }
    }

    @Override // com.facebook.react.ReactRootView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int size2;
        MT1.m5371b("ReactSurfaceView.onMeasure");
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                iMax = Math.max(iMax, childAt.getPaddingRight() + childAt.getPaddingLeft() + childAt.getMeasuredWidth() + childAt.getLeft());
            }
            size = iMax;
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int childCount2 = getChildCount();
            int iMax2 = 0;
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = getChildAt(i4);
                iMax2 = Math.max(iMax2, childAt2.getPaddingBottom() + childAt2.getPaddingTop() + childAt2.getMeasuredHeight() + childAt2.getTop());
            }
            size2 = iMax2;
        } else {
            size2 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, size2);
        this.f8399w = true;
        this.f8400x = i;
        this.f8401y = i2;
        Point viewportOffset = getViewportOffset();
        this.f8396t.m7568T(i, i2, viewportOffset.x, viewportOffset.y);
        Trace.endSection();
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // com.facebook.react.ReactRootView
    public void setIsFabric(boolean z) {
        super.setIsFabric(true);
    }
}
