package defpackage;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import androidx.fragment.app.l;

/* renamed from: Pu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC1249Pu implements DialogInterface.OnShowListener {
    public final /* synthetic */ AlertDialog a;
    public final /* synthetic */ l b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ DialogInterfaceOnShowListenerC1249Pu(AlertDialog alertDialog, l lVar, Bundle bundle, boolean z) {
        this.a = alertDialog;
        this.b = lVar;
        this.c = bundle;
        this.d = z;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        AlertDialog alertDialog = this.a;
        Button button = alertDialog.getButton(-1);
        Button button2 = alertDialog.getButton(-2);
        Button button3 = alertDialog.getButton(-3);
        TypedValue typedValue = new TypedValue();
        l lVar = this.b;
        lVar.getTheme().resolveAttribute(R.attr.textColorPrimary, typedValue, true);
        int i = typedValue.resourceId;
        int iA = i != 0 ? AbstractC0872Ky.a(lVar, i) : typedValue.data;
        Bundle bundle = this.c;
        boolean z = this.d;
        AbstractC5319jT1.j(button, "positive", bundle, z, iA);
        AbstractC5319jT1.j(button2, "negative", bundle, z, iA);
        AbstractC5319jT1.j(button3, "neutral", bundle, z, iA);
    }
}
