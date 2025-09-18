package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.a;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class FU0 extends a implements ViewTreeObserver.OnPreDrawListener {
    public KU0 a;
    public WM b;
    public HU0 c;
    public View d;
    public G41 e;

    public final G41 getStateWrapper() {
        return this.e;
    }

    public final void l() {
        WM wm = this.b;
        if (wm != null) {
            HU0 hu0 = this.c;
            if (hu0 == null) {
                GU0 gu0 = GU0.b;
                hu0 = new HU0(gu0, gu0, gu0, gu0);
            }
            G41 stateWrapper = getStateWrapper();
            if (stateWrapper != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap("insets", LR1.a(wm));
                stateWrapper.updateState(writableMapCreateMap);
                return;
            }
            IU0 iu0 = new IU0(wm, this.a, hu0);
            ReactContext reactContextA = QZ1.a(this);
            UIManagerModule uIManagerModule = (UIManagerModule) reactContextA.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), iu0);
                reactContextA.runOnNativeModulesQueueThread(new RunnableC1577Tz0(19, uIManagerModule));
                SO0 so0 = new SO0();
                ReentrantLock reentrantLock = new ReentrantLock();
                Condition conditionNewCondition = reentrantLock.newCondition();
                long jNanoTime = System.nanoTime();
                QZ1.a(this).runOnNativeModulesQueueThread(new RunnableC1313Qp0(reentrantLock, so0, conditionNewCondition, 7));
                reentrantLock.lock();
                for (long jNanoTime2 = 0; !so0.a && jNanoTime2 < 500000000; jNanoTime2 += System.nanoTime() - jNanoTime) {
                    try {
                        try {
                            conditionNewCondition.awaitNanos(500000000L);
                        } catch (InterruptedException unused) {
                            so0.a = true;
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View view;
        WM wmC;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (parent == 0) {
                view = this;
                break;
            } else {
                if (parent instanceof BU0) {
                    view = (View) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        this.d = view;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        View view2 = this.d;
        if (view2 == null || (wmC = AbstractC4346iR1.c(view2)) == null || O90.a(this.b, wmC)) {
            return;
        }
        this.b = wmC;
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.d;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.d = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        WM wmC;
        View view = this.d;
        boolean z = false;
        if (view != null && (wmC = AbstractC4346iR1.c(view)) != null && !O90.a(this.b, wmC)) {
            this.b = wmC;
            l();
            z = true;
        }
        if (z) {
            requestLayout();
        }
        return !z;
    }

    public final void setEdges(HU0 hu0) {
        O90.f(hu0, "edges");
        this.c = hu0;
        l();
    }

    public final void setMode(KU0 ku0) {
        O90.f(ku0, "mode");
        this.a = ku0;
        l();
    }

    public final void setStateWrapper(G41 g41) {
        this.e = g41;
    }
}
