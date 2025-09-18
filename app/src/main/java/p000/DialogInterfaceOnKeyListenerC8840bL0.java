package p000;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.modal.ReactModalHostManager;

/* renamed from: bL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC8840bL0 implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C8968cL0 f16984a;

    public DialogInterfaceOnKeyListenerC8840bL0(C8968cL0 c8968cL0) {
        this.f16984a = c8968cL0;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        O90.m5968f(dialogInterface, "dialog");
        O90.m5968f(keyEvent, "event");
        if (keyEvent.getAction() != 1) {
            return false;
        }
        C8968cL0 c8968cL0 = this.f16984a;
        if (i == 4 || i == 111) {
            InterfaceC8712aL0 onRequestCloseListener = c8968cL0.getOnRequestCloseListener();
            if (onRequestCloseListener == null) {
                throw new IllegalStateException("onRequestClose callback must be set if back key is expected to close the modal");
            }
            C4224i9 c4224i9 = (C4224i9) onRequestCloseListener;
            ReactModalHostManager.addEventEmitters$lambda$0((InterfaceC6947uP) c4224i9.f28837b, (S91) c4224i9.f28838c, (C8968cL0) c4224i9.f28839d, dialogInterface);
            return true;
        }
        Context context = c8968cL0.getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        Activity currentActivity = ((ReactContext) context).getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity.onKeyUp(i, keyEvent);
        }
        return false;
    }
}
