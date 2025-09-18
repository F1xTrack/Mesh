package p000;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class ZV0 extends View {

    /* renamed from: a */
    public Window f14951a;

    /* renamed from: b */
    public YV0 f14952b;

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f14951a;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        AbstractC7806Jm0.m4412f("ScreenFlashView");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.f14951a == null) {
            AbstractC7806Jm0.m4412f("ScreenFlashView");
            return;
        }
        if (Float.isNaN(f)) {
            AbstractC7806Jm0.m4412f("ScreenFlashView");
            return;
        }
        WindowManager.LayoutParams attributes = this.f14951a.getAttributes();
        attributes.screenBrightness = f;
        this.f14951a.setAttributes(attributes);
        AbstractC7806Jm0.m4412f("ScreenFlashView");
    }

    private void setScreenFlashUiInfo(InterfaceC11119t60 interfaceC11119t60) {
        AbstractC7806Jm0.m4412f("ScreenFlashView");
    }

    public InterfaceC11119t60 getScreenFlash() {
        return this.f14952b;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(AbstractC1623Zn abstractC1623Zn) {
        DV1.m1716a();
    }

    public void setScreenFlashWindow(Window window) {
        DV1.m1716a();
        if (this.f14951a != window) {
            this.f14952b = window == null ? null : new YV0(this);
        }
        this.f14951a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
