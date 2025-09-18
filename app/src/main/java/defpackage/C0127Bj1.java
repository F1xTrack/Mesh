package defpackage;

import android.hardware.display.DisplayManager;

/* renamed from: Bj1 */
/* loaded from: classes.dex */
public final class C0127Bj1 implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    public final /* synthetic */ C0283Dj1 b;

    public C0127Bj1(C0283Dj1 c0283Dj1, DisplayManager displayManager) {
        this.b = c0283Dj1;
        this.a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            C0283Dj1.a(this.b, this.a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
