package defpackage;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: il1 */
/* loaded from: classes.dex */
public final class C4405il1 extends RecyclerView {
    public final /* synthetic */ C5564kl1 V1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4405il1(C5564kl1 c5564kl1, S91 s91) {
        super(s91, null);
        this.V1 = c5564kl1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.V1.t.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        C5564kl1 c5564kl1 = this.V1;
        accessibilityEvent.setFromIndex(c5564kl1.d);
        accessibilityEvent.setToIndex(c5564kl1.d);
        accessibilityEvent.setSource((C5564kl1) c5564kl1.t.d);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.V1.r && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.V1.r && super.onTouchEvent(motionEvent);
    }
}
