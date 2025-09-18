package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.g;

/* loaded from: classes.dex */
public final class CJ implements DialogInterface.OnCancelListener {
    public final /* synthetic */ g a;

    public CJ(g gVar) {
        this.a = gVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        g gVar = this.a;
        if (gVar.mDialog != null) {
            gVar.onCancel(gVar.mDialog);
        }
    }
}
