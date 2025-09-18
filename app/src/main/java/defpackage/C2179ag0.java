package defpackage;

import android.content.res.Configuration;
import android.view.WindowInsets;
import com.facebook.react.views.view.a;

/* renamed from: ag0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2179ag0 extends a {
    public final S91 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2179ag0(S91 s91) {
        super(s91);
        O90.f(s91, "reactContext");
        this.a = s91;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        super.setBackgroundColor(AbstractC3887g21.a(this.a));
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        O90.e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        super.setBackgroundColor(AbstractC3887g21.a(this.a));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        super.setBackgroundColor(AbstractC3887g21.a(this.a));
    }

    @Override // com.facebook.react.views.view.a, android.view.View
    public void setBackgroundColor(int i) {
    }
}
