package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: Dq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC7502Dq0 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC8490Wq0 {

    /* renamed from: a */
    public I51 f2268a;

    /* renamed from: b */
    public DialogInterfaceC0571J3 f2269b;

    /* renamed from: c */
    public C7332Aj0 f2270c;

    @Override // p000.InterfaceC8490Wq0
    /* renamed from: f */
    public final void mo1906f(MenuC7450Cq0 menuC7450Cq0, boolean z) {
        DialogInterfaceC0571J3 dialogInterfaceC0571J3;
        if ((z || menuC7450Cq0 == this.f2268a) && (dialogInterfaceC0571J3 = this.f2269b) != null) {
            dialogInterfaceC0571J3.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C7332Aj0 c7332Aj0 = this.f2270c;
        if (c7332Aj0.f343f == null) {
            c7332Aj0.f343f = new C11961zj0(c7332Aj0);
        }
        this.f2268a.m1418q(c7332Aj0.f343f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2270c.mo304f(this.f2268a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        I51 i51 = this.f2268a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2269b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2269b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                i51.m1404c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return i51.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.InterfaceC8490Wq0
    /* renamed from: q0 */
    public final boolean mo1907q0(MenuC7450Cq0 menuC7450Cq0) {
        return false;
    }
}
