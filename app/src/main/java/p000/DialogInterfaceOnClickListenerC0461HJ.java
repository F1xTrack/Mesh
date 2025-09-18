package p000;

import android.content.DialogInterface;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: HJ */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0461HJ implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final Callback f4224a;

    /* renamed from: b */
    public boolean f4225b = false;

    /* renamed from: c */
    public final /* synthetic */ DialogModule f4226c;

    public DialogInterfaceOnClickListenerC0461HJ(DialogModule dialogModule, Callback callback) {
        this.f4226c = dialogModule;
        this.f4224a = callback;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f4225b || !this.f4226c.getReactApplicationContext().hasActiveReactInstance()) {
            return;
        }
        this.f4224a.invoke("buttonClicked", Integer.valueOf(i));
        this.f4225b = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f4225b || !this.f4226c.getReactApplicationContext().hasActiveReactInstance()) {
            return;
        }
        this.f4224a.invoke("dismissed");
        this.f4225b = true;
    }
}
