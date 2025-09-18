package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.view.a;
import java.lang.ref.WeakReference;

/* renamed from: Mm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992Mm0 implements UIManagerListener {
    public final FrameLayout a;
    public final boolean b;
    public C0915Lm0 c;
    public WeakReference d = null;
    public Rect e = null;
    public boolean f = false;

    public C0992Mm0(FrameLayout frameLayout, boolean z) {
        this.a = frameLayout;
        this.b = z;
    }

    public final void a() {
        float y;
        int height;
        if (this.c == null) {
            return;
        }
        FrameLayout frameLayout = this.a;
        a aVar = (a) frameLayout.getChildAt(0);
        if (aVar == null) {
            return;
        }
        boolean z = this.b;
        int scrollX = z ? frameLayout.getScrollX() : frameLayout.getScrollY();
        for (int i = this.c.a; i < aVar.getChildCount(); i++) {
            View childAt = aVar.getChildAt(i);
            if (z) {
                y = childAt.getX();
                height = childAt.getWidth();
            } else {
                y = childAt.getY();
                height = childAt.getHeight();
            }
            if (y + height > scrollX || i == aVar.getChildCount() - 1) {
                this.d = new WeakReference(childAt);
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                this.e = rect;
                return;
            }
        }
    }

    public final void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        FrameLayout frameLayout = this.a;
        UIManager uIManagerF = OZ1.f((ReactContext) frameLayout.getContext(), R02.b(frameLayout.getId()), true);
        UN1.c(uIManagerF);
        uIManagerF.addUIManagerEventListener(this);
    }

    public final void c() {
        if (this.f) {
            this.f = false;
            FrameLayout frameLayout = this.a;
            UIManager uIManagerF = OZ1.f((ReactContext) frameLayout.getContext(), R02.b(frameLayout.getId()), true);
            UN1.c(uIManagerF);
            uIManagerF.removeUIManagerEventListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        WeakReference weakReference;
        View view;
        if (this.c == null || (weakReference = this.d) == null || this.e == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        FrameLayout frameLayout = this.a;
        if (this.b) {
            int i = rect.left - this.e.left;
            if (i != 0) {
                int scrollX = frameLayout.getScrollX();
                InterfaceC8158yM0 interfaceC8158yM0 = (InterfaceC8158yM0) frameLayout;
                interfaceC8158yM0.b(i + scrollX, frameLayout.getScrollY());
                this.e = rect;
                Integer num = this.c.b;
                if (num == null || scrollX > num.intValue()) {
                    return;
                }
                interfaceC8158yM0.c(0, frameLayout.getScrollY());
                return;
            }
            return;
        }
        int i2 = rect.top - this.e.top;
        if (i2 != 0) {
            int scrollY = frameLayout.getScrollY();
            InterfaceC8158yM0 interfaceC8158yM02 = (InterfaceC8158yM0) frameLayout;
            interfaceC8158yM02.b(frameLayout.getScrollX(), i2 + scrollY);
            this.e = rect;
            Integer num2 = this.c.b;
            if (num2 == null || scrollY > num2.intValue()) {
                return;
            }
            interfaceC8158yM02.c(frameLayout.getScrollX(), 0);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didMountItems(UIManager uIManager) {
        d();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void willDispatchViewUpdates(UIManager uIManager) {
        UiThreadUtil.runOnUiThread(new RunnableC6133nk0(1, this));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void willMountItems(UIManager uIManager) {
        a();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didDispatchMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didScheduleMountItems(UIManager uIManager) {
    }
}
