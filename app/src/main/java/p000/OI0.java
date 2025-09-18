package p000;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.killserver.screenshotprev.RNScreenshotPreventModule;

/* loaded from: classes2.dex */
public final class OI0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8346a;

    /* renamed from: b */
    public final /* synthetic */ Activity f8347b;

    /* renamed from: c */
    public final /* synthetic */ RNScreenshotPreventModule f8348c;

    public /* synthetic */ OI0(RNScreenshotPreventModule rNScreenshotPreventModule, Activity activity, int i) {
        this.f8346a = i;
        this.f8348c = rNScreenshotPreventModule;
        this.f8347b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8346a) {
            case 0:
                RNScreenshotPreventModule rNScreenshotPreventModule = this.f8348c;
                RelativeLayout relativeLayout = rNScreenshotPreventModule.overlayLayout;
                Activity activity = this.f8347b;
                if (relativeLayout != null) {
                    ((ViewGroup) activity.getWindow().getDecorView().getRootView()).removeView(rNScreenshotPreventModule.overlayLayout);
                    rNScreenshotPreventModule.overlayLayout = null;
                }
                activity.getWindow().clearFlags(8192);
                break;
            default:
                Activity activity2 = this.f8347b;
                ViewGroup viewGroup = (ViewGroup) activity2.getWindow().getDecorView().getRootView();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                RNScreenshotPreventModule rNScreenshotPreventModule2 = this.f8348c;
                viewGroup.addView(rNScreenshotPreventModule2.overlayLayout, layoutParams);
                if ((activity2.getWindow().getAttributes().flags & 8192) == 0) {
                    rNScreenshotPreventModule2.secureFlagWasSet = false;
                    break;
                } else {
                    activity2.getWindow().clearFlags(8192);
                    rNScreenshotPreventModule2.secureFlagWasSet = true;
                    break;
                }
        }
    }
}
