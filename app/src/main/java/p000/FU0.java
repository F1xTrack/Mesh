package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.C1932a;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class FU0 extends C1932a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public KU0 f3277a;

    /* renamed from: b */
    public C1407WM f3278b;

    /* renamed from: c */
    public HU0 f3279c;

    /* renamed from: d */
    public View f3280d;

    /* renamed from: e */
    public G41 f3281e;

    public final G41 getStateWrapper() {
        return this.f3281e;
    }

    /* renamed from: l */
    public final void m2667l() {
        C1407WM c1407wm = this.f3278b;
        if (c1407wm != null) {
            HU0 hu0 = this.f3279c;
            if (hu0 == null) {
                GU0 gu0 = GU0.f3760b;
                hu0 = new HU0(gu0, gu0, gu0, gu0);
            }
            G41 stateWrapper = getStateWrapper();
            if (stateWrapper != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap("insets", LR1.m5001a(c1407wm));
                stateWrapper.updateState(writableMapCreateMap);
                return;
            }
            IU0 iu0 = new IU0(c1407wm, this.f3277a, hu0);
            ReactContext reactContextM6728a = QZ1.m6728a(this);
            UIManagerModule uIManagerModule = (UIManagerModule) reactContextM6728a.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), iu0);
                reactContextM6728a.runOnNativeModulesQueueThread(new RunnableC8352Tz0(19, uIManagerModule));
                SO0 so0 = new SO0();
                ReentrantLock reentrantLock = new ReentrantLock();
                Condition conditionNewCondition = reentrantLock.newCondition();
                long jNanoTime = System.nanoTime();
                QZ1.m6728a(this).runOnNativeModulesQueueThread(new RunnableC8176Qp0(reentrantLock, so0, conditionNewCondition, 7));
                reentrantLock.lock();
                for (long jNanoTime2 = 0; !so0.f10713a && jNanoTime2 < 500000000; jNanoTime2 += System.nanoTime() - jNanoTime) {
                    try {
                        try {
                            conditionNewCondition.awaitNanos(500000000L);
                        } catch (InterruptedException unused) {
                            so0.f10713a = true;
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View view;
        C1407WM c1407wmM19039c;
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
        this.f3280d = view;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        View view2 = this.f3280d;
        if (view2 == null || (c1407wmM19039c = AbstractC9754iR1.m19039c(view2)) == null || O90.m5963a(this.f3278b, c1407wmM19039c)) {
            return;
        }
        this.f3278b = c1407wmM19039c;
        m2667l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.f3280d;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f3280d = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C1407WM c1407wmM19039c;
        View view = this.f3280d;
        boolean z = false;
        if (view != null && (c1407wmM19039c = AbstractC9754iR1.m19039c(view)) != null && !O90.m5963a(this.f3278b, c1407wmM19039c)) {
            this.f3278b = c1407wmM19039c;
            m2667l();
            z = true;
        }
        if (z) {
            requestLayout();
        }
        return !z;
    }

    public final void setEdges(HU0 hu0) {
        O90.m5968f(hu0, "edges");
        this.f3279c = hu0;
        m2667l();
    }

    public final void setMode(KU0 ku0) {
        O90.m5968f(ku0, "mode");
        this.f3277a = ku0;
        m2667l();
    }

    public final void setStateWrapper(G41 g41) {
        this.f3281e = g41;
    }
}
