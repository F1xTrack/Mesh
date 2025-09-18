package p000;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.view.C1932a;
import java.lang.ref.WeakReference;

/* renamed from: Mm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7962Mm0 implements UIManagerListener {

    /* renamed from: a */
    public final FrameLayout f7331a;

    /* renamed from: b */
    public final boolean f7332b;

    /* renamed from: c */
    public C7910Lm0 f7333c;

    /* renamed from: d */
    public WeakReference f7334d = null;

    /* renamed from: e */
    public Rect f7335e = null;

    /* renamed from: f */
    public boolean f7336f = false;

    public C7962Mm0(FrameLayout frameLayout, boolean z) {
        this.f7331a = frameLayout;
        this.f7332b = z;
    }

    /* renamed from: a */
    public final void m5431a() {
        float y;
        int height;
        if (this.f7333c == null) {
            return;
        }
        FrameLayout frameLayout = this.f7331a;
        C1932a c1932a = (C1932a) frameLayout.getChildAt(0);
        if (c1932a == null) {
            return;
        }
        boolean z = this.f7332b;
        int scrollX = z ? frameLayout.getScrollX() : frameLayout.getScrollY();
        for (int i = this.f7333c.f6850a; i < c1932a.getChildCount(); i++) {
            View childAt = c1932a.getChildAt(i);
            if (z) {
                y = childAt.getX();
                height = childAt.getWidth();
            } else {
                y = childAt.getY();
                height = childAt.getHeight();
            }
            if (y + height > scrollX || i == c1932a.getChildCount() - 1) {
                this.f7334d = new WeakReference(childAt);
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                this.f7335e = rect;
                return;
            }
        }
    }

    /* renamed from: b */
    public final void m5432b() {
        if (this.f7336f) {
            return;
        }
        this.f7336f = true;
        FrameLayout frameLayout = this.f7331a;
        UIManager uIManagerM6095f = OZ1.m6095f((ReactContext) frameLayout.getContext(), R02.m6874b(frameLayout.getId()), true);
        UN1.m7999c(uIManagerM6095f);
        uIManagerM6095f.addUIManagerEventListener(this);
    }

    /* renamed from: c */
    public final void m5433c() {
        if (this.f7336f) {
            this.f7336f = false;
            FrameLayout frameLayout = this.f7331a;
            UIManager uIManagerM6095f = OZ1.m6095f((ReactContext) frameLayout.getContext(), R02.m6874b(frameLayout.getId()), true);
            UN1.m7999c(uIManagerM6095f);
            uIManagerM6095f.removeUIManagerEventListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final void m5434d() {
        WeakReference weakReference;
        View view;
        if (this.f7333c == null || (weakReference = this.f7334d) == null || this.f7335e == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        FrameLayout frameLayout = this.f7331a;
        if (this.f7332b) {
            int i = rect.left - this.f7335e.left;
            if (i != 0) {
                int scrollX = frameLayout.getScrollX();
                InterfaceC11788yM0 interfaceC11788yM0 = (InterfaceC11788yM0) frameLayout;
                interfaceC11788yM0.mo604b(i + scrollX, frameLayout.getScrollY());
                this.f7335e = rect;
                Integer num = this.f7333c.f6851b;
                if (num == null || scrollX > num.intValue()) {
                    return;
                }
                interfaceC11788yM0.mo605c(0, frameLayout.getScrollY());
                return;
            }
            return;
        }
        int i2 = rect.top - this.f7335e.top;
        if (i2 != 0) {
            int scrollY = frameLayout.getScrollY();
            InterfaceC11788yM0 interfaceC11788yM02 = (InterfaceC11788yM0) frameLayout;
            interfaceC11788yM02.mo604b(frameLayout.getScrollX(), i2 + scrollY);
            this.f7335e = rect;
            Integer num2 = this.f7333c.f6851b;
            if (num2 == null || scrollY > num2.intValue()) {
                return;
            }
            interfaceC11788yM02.mo605c(frameLayout.getScrollX(), 0);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didMountItems(UIManager uIManager) {
        m5434d();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void willDispatchViewUpdates(UIManager uIManager) {
        UiThreadUtil.runOnUiThread(new RunnableC10431nk0(1, this));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void willMountItems(UIManager uIManager) {
        m5431a();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didDispatchMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didScheduleMountItems(UIManager uIManager) {
    }
}
