package p000;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: Ty0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8350Ty0 implements DisplayManager.DisplayListener {

    /* renamed from: a */
    public final /* synthetic */ int f11605a;

    /* renamed from: b */
    public final /* synthetic */ Object f11606b;

    public /* synthetic */ C8350Ty0(int i, Object obj) {
        this.f11605a = i;
        this.f11606b = obj;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        int i2 = this.f11605a;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        switch (this.f11605a) {
            case 0:
                C7196yM c7196yM = (C7196yM) this.f11606b;
                Display display = ((DisplayManager) c7196yM.f46227g).getDisplay(i);
                if (display != null) {
                    c7196yM.f46221a = display.getRotation();
                    C7196yM.m26140a(c7196yM);
                    break;
                }
                break;
            default:
                C10237mD0 c10237mD0 = (C10237mD0) this.f11606b;
                Display display2 = c10237mD0.getDisplay();
                if (display2 != null && display2.getDisplayId() == i) {
                    c10237mD0.m22704a();
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        int i2 = this.f11605a;
    }

    /* renamed from: a */
    private final void m7828a(int i) {
    }

    /* renamed from: b */
    private final void m7829b(int i) {
    }

    /* renamed from: c */
    private final void m7830c(int i) {
    }

    /* renamed from: d */
    private final void m7831d(int i) {
    }
}
