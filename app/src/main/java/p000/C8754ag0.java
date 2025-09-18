package p000;

import android.content.res.Configuration;
import android.view.WindowInsets;
import com.facebook.react.views.view.C1932a;

/* renamed from: ag0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8754ag0 extends C1932a {

    /* renamed from: a */
    public final S91 f15612a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8754ag0(S91 s91) {
        super(s91);
        O90.m5968f(s91, "reactContext");
        this.f15612a = s91;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        super.setBackgroundColor(AbstractC9446g21.m18383a(this.f15612a));
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        O90.m5967e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        super.setBackgroundColor(AbstractC9446g21.m18383a(this.f15612a));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        super.setBackgroundColor(AbstractC9446g21.m18383a(this.f15612a));
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.View
    public void setBackgroundColor(int i) {
    }
}
