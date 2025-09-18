package defpackage;

import android.content.DialogInterface;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.dialog.DialogModule;

/* loaded from: classes.dex */
public final class HJ implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
    public final Callback a;
    public boolean b = false;
    public final /* synthetic */ DialogModule c;

    public HJ(DialogModule dialogModule, Callback callback) {
        this.c = dialogModule;
        this.a = callback;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b || !this.c.getReactApplicationContext().hasActiveReactInstance()) {
            return;
        }
        this.a.invoke("buttonClicked", Integer.valueOf(i));
        this.b = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.b || !this.c.getReactApplicationContext().hasActiveReactInstance()) {
            return;
        }
        this.a.invoke("dismissed");
        this.b = true;
    }
}
