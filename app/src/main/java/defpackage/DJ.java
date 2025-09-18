package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.g;

/* loaded from: classes.dex */
public final class DJ implements DialogInterface.OnDismissListener {
    public final /* synthetic */ g a;

    public DJ(g gVar) {
        this.a = gVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        g gVar = this.a;
        if (gVar.mDialog != null) {
            gVar.onDismiss(gVar.mDialog);
        }
    }
}
