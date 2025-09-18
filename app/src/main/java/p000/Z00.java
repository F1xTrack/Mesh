package p000;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.bridge.Promise;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class Z00 extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ int f14638a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object f14639b;

    /* renamed from: c */
    public final /* synthetic */ Object f14640c;

    public Z00(C8669a10 c8669a10, Promise promise) {
        this.f14640c = c8669a10;
        this.f14639b = promise;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f14638a) {
            case 0:
                C8669a10 c8669a10 = (C8669a10) this.f14640c;
                try {
                    ((Promise) this.f14639b).reject("TIMEOUT", "Location timed out");
                    c8669a10.m9661a();
                    c8669a10.f15287d = null;
                    c8669a10.f15285b = null;
                    c8669a10.f15286c = null;
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                ((AccessibilityManager) this.f14639b).sendAccessibilityEvent((AccessibilityEvent) this.f14640c);
                break;
        }
    }

    public Z00(AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
        this.f14639b = accessibilityManager;
        this.f14640c = accessibilityEvent;
    }
}
