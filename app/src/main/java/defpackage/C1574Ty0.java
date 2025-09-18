package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: Ty0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1574Ty0 implements DisplayManager.DisplayListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1574Ty0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        int i2 = this.a;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        switch (this.a) {
            case 0:
                C8157yM c8157yM = (C8157yM) this.b;
                Display display = ((DisplayManager) c8157yM.g).getDisplay(i);
                if (display != null) {
                    c8157yM.a = display.getRotation();
                    C8157yM.a(c8157yM);
                    break;
                }
                break;
            default:
                C5843mD0 c5843mD0 = (C5843mD0) this.b;
                Display display2 = c5843mD0.getDisplay();
                if (display2 != null && display2.getDisplayId() == i) {
                    c5843mD0.a();
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        int i2 = this.a;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }
}
