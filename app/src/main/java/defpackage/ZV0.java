package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class ZV0 extends View {
    public Window a;
    public YV0 b;

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.a;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        AbstractC0759Jm0.f("ScreenFlashView");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.a == null) {
            AbstractC0759Jm0.f("ScreenFlashView");
            return;
        }
        if (Float.isNaN(f)) {
            AbstractC0759Jm0.f("ScreenFlashView");
            return;
        }
        WindowManager.LayoutParams attributes = this.a.getAttributes();
        attributes.screenBrightness = f;
        this.a.setAttributes(attributes);
        AbstractC0759Jm0.f("ScreenFlashView");
    }

    private void setScreenFlashUiInfo(InterfaceC7158t60 interfaceC7158t60) {
        AbstractC0759Jm0.f("ScreenFlashView");
    }

    public InterfaceC7158t60 getScreenFlash() {
        return this.b;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(AbstractC2008Zn abstractC2008Zn) {
        DV1.a();
    }

    public void setScreenFlashWindow(Window window) {
        DV1.a();
        if (this.a != window) {
            this.b = window == null ? null : new YV0(this);
        }
        this.a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
