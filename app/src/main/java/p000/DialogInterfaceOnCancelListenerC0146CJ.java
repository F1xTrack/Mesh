package p000;

import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g;

/* renamed from: CJ */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0146CJ implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1725g f1311a;

    public DialogInterfaceOnCancelListenerC0146CJ(DialogInterfaceOnCancelListenerC1725g dialogInterfaceOnCancelListenerC1725g) {
        this.f1311a = dialogInterfaceOnCancelListenerC1725g;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC1725g dialogInterfaceOnCancelListenerC1725g = this.f1311a;
        if (dialogInterfaceOnCancelListenerC1725g.mDialog != null) {
            dialogInterfaceOnCancelListenerC1725g.onCancel(dialogInterfaceOnCancelListenerC1725g.mDialog);
        }
    }
}
