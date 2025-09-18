package defpackage;

import com.facebook.react.modules.dialog.DialogModule;

/* loaded from: classes.dex */
public final class IJ {
    public final C5332jY a;
    public K3 b;
    public final /* synthetic */ DialogModule c;

    public IJ(DialogModule dialogModule, C5332jY c5332jY) {
        this.c = dialogModule;
        this.a = c5332jY;
    }

    public final void a() {
        K3 k3;
        if (this.c.mIsInForeground && (k3 = (K3) this.a.B("com.facebook.catalyst.react.dialog.DialogModule")) != null && k3.isResumed()) {
            k3.dismiss();
        }
    }
}
