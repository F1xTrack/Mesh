package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: Dq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0303Dq0 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1784Wq0 {
    public I51 a;
    public J3 b;
    public C0048Aj0 c;

    @Override // defpackage.InterfaceC1784Wq0
    public final void f(MenuC0225Cq0 menuC0225Cq0, boolean z) {
        J3 j3;
        if ((z || menuC0225Cq0 == this.a) && (j3 = this.b) != null) {
            j3.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0048Aj0 c0048Aj0 = this.c;
        if (c0048Aj0.f == null) {
            c0048Aj0.f = new C8417zj0(c0048Aj0);
        }
        this.a.q(c0048Aj0.f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.f(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        I51 i51 = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                i51.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return i51.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.InterfaceC1784Wq0
    public final boolean q0(MenuC0225Cq0 menuC0225Cq0) {
        return false;
    }
}
