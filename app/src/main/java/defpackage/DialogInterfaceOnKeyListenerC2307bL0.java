package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.modal.ReactModalHostManager;

/* renamed from: bL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC2307bL0 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ C2497cL0 a;

    public DialogInterfaceOnKeyListenerC2307bL0(C2497cL0 c2497cL0) {
        this.a = c2497cL0;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        O90.f(dialogInterface, "dialog");
        O90.f(keyEvent, "event");
        if (keyEvent.getAction() != 1) {
            return false;
        }
        C2497cL0 c2497cL0 = this.a;
        if (i == 4 || i == 111) {
            InterfaceC2116aL0 onRequestCloseListener = c2497cL0.getOnRequestCloseListener();
            if (onRequestCloseListener == null) {
                throw new IllegalStateException("onRequestClose callback must be set if back key is expected to close the modal");
            }
            C4290i9 c4290i9 = (C4290i9) onRequestCloseListener;
            ReactModalHostManager.addEventEmitters$lambda$0((InterfaceC7405uP) c4290i9.b, (S91) c4290i9.c, (C2497cL0) c4290i9.d, dialogInterface);
            return true;
        }
        Context context = c2497cL0.getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        Activity currentActivity = ((ReactContext) context).getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity.onKeyUp(i, keyEvent);
        }
        return false;
    }
}
