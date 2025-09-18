package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CM0 {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());
    public static int b = 250;
    public static boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ViewGroup viewGroup, MW0 mw0, float f, float f2, boolean z) {
        View childAt;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (r3.getScrollEventThrottle() < Math.max(17L, jCurrentTimeMillis - ((InterfaceC7778wM0) viewGroup).getLastScrollDispatchTime()) && (childAt = viewGroup.getChildAt(0)) != null) {
            Iterator it = a.iterator();
            if (it.hasNext()) {
                throw AbstractC8235ym.d(it);
            }
            Context context = viewGroup.getContext();
            O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ReactContext reactContext = (ReactContext) context;
            int iD = OZ1.d(reactContext);
            InterfaceC7405uP interfaceC7405uPB = OZ1.b(reactContext, viewGroup.getId());
            if (interfaceC7405uPB != null) {
                C5649lC0 c5649lC0 = JW0.k;
                interfaceC7405uPB.g(AbstractC8364zR1.a(iD, viewGroup.getId(), mw0, viewGroup.getScrollX(), viewGroup.getScrollY(), f, f2, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight(), z));
                ((InterfaceC7778wM0) viewGroup).setLastScrollDispatchTime(jCurrentTimeMillis);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ViewGroup viewGroup) {
        BM0 reactScrollViewScrollState = ((InterfaceC7968xM0) viewGroup).getReactScrollViewScrollState();
        int i = reactScrollViewScrollState.c;
        Point point = reactScrollViewScrollState.d;
        int i2 = point.x;
        int i3 = point.y;
        if (reactScrollViewScrollState.a == 1) {
            View childAt = viewGroup.getChildAt(0);
            if (childAt != null) {
                childAt.getWidth();
            }
            viewGroup.getWidth();
        }
        G41 stateWrapper = ((InterfaceC8348zM0) viewGroup).getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", AbstractC7586vL1.a(i2));
            writableNativeMap.putDouble("contentOffsetTop", AbstractC7586vL1.a(i3));
            writableNativeMap.putDouble("scrollAwayPaddingTop", AbstractC7586vL1.a(i));
            stateWrapper.updateState(writableNativeMap);
        }
    }

    public static final int c(Context context) {
        if (!c) {
            c = true;
            try {
                AM0 am0 = new AM0(context);
                am0.a = 250;
                am0.startScroll(0, 0, 0, 0);
                b = am0.a;
            } catch (Throwable unused) {
            }
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int d(FrameLayout frameLayout, int i, int i2, int i3) {
        BM0 reactScrollViewScrollState = ((InterfaceC7968xM0) frameLayout).getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.f || (reactScrollViewScrollState.e && ((i2 - i) * (i3 != 0 ? i3 / Math.abs(i3) : 0) > 0))) ? i2 : i;
    }

    public static final int e(String str) {
        if (str == null) {
            return 1;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1414557169) {
            if (iHashCode != 3005871) {
                if (iHashCode == 104712844 && str.equals("never")) {
                    return 2;
                }
            } else if (str.equals("auto")) {
                return 1;
            }
        } else if (str.equals("always")) {
            return 0;
        }
        "wrong overScrollMode: ".concat(str);
        AbstractC3393dS.p("ReactNative");
        return 1;
    }

    public static final int f(String str) {
        if (str == null) {
            return 0;
        }
        if ("start".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("center".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("end".equals(str)) {
            return 3;
        }
        "wrong snap alignment value: ".concat(str);
        AbstractC3393dS.p("ReactNative");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Point g(FrameLayout frameLayout, int i, int i2, int i3, int i4) {
        BM0 reactScrollViewScrollState = ((InterfaceC7968xM0) frameLayout).getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(frameLayout.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.g);
        int width = frameLayout.getWidth();
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        int paddingStart = (width - frameLayout.getPaddingStart()) - frameLayout.getPaddingEnd();
        int height = (frameLayout.getHeight() - frameLayout.getPaddingBottom()) - frameLayout.getPaddingTop();
        Point point = reactScrollViewScrollState.b;
        overScroller.fling(d(frameLayout, frameLayout.getScrollX(), point.x, i), d(frameLayout, frameLayout.getScrollY(), point.y, i2), i, i2, 0, i3, 0, i4, paddingStart / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(FrameLayout frameLayout, int i, int i2) {
        InterfaceC7588vM0 interfaceC7588vM0 = (InterfaceC7588vM0) frameLayout;
        ValueAnimator flingAnimator = interfaceC7588vM0.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            interfaceC7588vM0.getFlingAnimator().addListener(new C1379Rl0(1, frameLayout));
        }
        ((InterfaceC7968xM0) frameLayout).getReactScrollViewScrollState().b.set(i, i2);
        int scrollX = frameLayout.getScrollX();
        int scrollY = frameLayout.getScrollY();
        if (scrollX != i) {
            interfaceC7588vM0.a(scrollX, i);
        }
        if (scrollY != i2) {
            interfaceC7588vM0.a(scrollY, i2);
        }
        j(frameLayout, i, i2);
    }

    public static final void i(ViewGroup viewGroup) {
        j(viewGroup, viewGroup.getScrollX(), viewGroup.getScrollY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(ViewGroup viewGroup, int i, int i2) {
        if (R02.b(viewGroup.getId()) == 1) {
            return;
        }
        BM0 reactScrollViewScrollState = ((InterfaceC7968xM0) viewGroup).getReactScrollViewScrollState();
        if (reactScrollViewScrollState.d.equals(i, i2)) {
            return;
        }
        reactScrollViewScrollState.d.set(i, i2);
        b(viewGroup);
    }
}
