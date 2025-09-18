package p000;

import android.hardware.display.DisplayManager;

/* renamed from: Bj1 */
/* loaded from: classes.dex */
public final class C7385Bj1 implements DisplayManager.DisplayListener {

    /* renamed from: a */
    public final DisplayManager f994a;

    /* renamed from: b */
    public final /* synthetic */ C7489Dj1 f995b;

    public C7385Bj1(C7489Dj1 c7489Dj1, DisplayManager displayManager) {
        this.f995b = c7489Dj1;
        this.f994a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            C7489Dj1.m1860a(this.f995b, this.f994a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
