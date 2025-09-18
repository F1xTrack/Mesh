package p000;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: il1 */
/* loaded from: classes.dex */
public final class C9794il1 extends RecyclerView {

    /* renamed from: V1 */
    public final /* synthetic */ C10050kl1 f29441V1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9794il1(C10050kl1 c10050kl1, S91 s91) {
        super(s91, null);
        this.f29441V1 = c10050kl1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f29441V1.f36680t.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        C10050kl1 c10050kl1 = this.f29441V1;
        accessibilityEvent.setFromIndex(c10050kl1.f36664d);
        accessibilityEvent.setToIndex(c10050kl1.f36664d);
        accessibilityEvent.setSource((C10050kl1) c10050kl1.f36680t.f8630d);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f29441V1.f36678r && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f29441V1.f36678r && super.onTouchEvent(motionEvent);
    }
}
