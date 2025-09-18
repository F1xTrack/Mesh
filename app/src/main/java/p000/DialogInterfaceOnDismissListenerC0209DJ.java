package p000;

import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g;

/* renamed from: DJ */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0209DJ implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1725g f1967a;

    public DialogInterfaceOnDismissListenerC0209DJ(DialogInterfaceOnCancelListenerC1725g dialogInterfaceOnCancelListenerC1725g) {
        this.f1967a = dialogInterfaceOnCancelListenerC1725g;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC1725g dialogInterfaceOnCancelListenerC1725g = this.f1967a;
        if (dialogInterfaceOnCancelListenerC1725g.mDialog != null) {
            dialogInterfaceOnCancelListenerC1725g.onDismiss(dialogInterfaceOnCancelListenerC1725g.mDialog);
        }
    }
}
