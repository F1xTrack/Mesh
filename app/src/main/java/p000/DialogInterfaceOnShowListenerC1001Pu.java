package p000;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import androidx.fragment.app.AbstractActivityC1730l;

/* renamed from: Pu */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC1001Pu implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f9340a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC1730l f9341b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f9342c;

    /* renamed from: d */
    public final /* synthetic */ boolean f9343d;

    public /* synthetic */ DialogInterfaceOnShowListenerC1001Pu(AlertDialog alertDialog, AbstractActivityC1730l abstractActivityC1730l, Bundle bundle, boolean z) {
        this.f9340a = alertDialog;
        this.f9341b = abstractActivityC1730l;
        this.f9342c = bundle;
        this.f9343d = z;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        AlertDialog alertDialog = this.f9340a;
        Button button = alertDialog.getButton(-1);
        Button button2 = alertDialog.getButton(-2);
        Button button3 = alertDialog.getButton(-3);
        TypedValue typedValue = new TypedValue();
        AbstractActivityC1730l abstractActivityC1730l = this.f9341b;
        abstractActivityC1730l.getTheme().resolveAttribute(R.attr.textColorPrimary, typedValue, true);
        int i = typedValue.resourceId;
        int iM4783a = i != 0 ? AbstractC0691Ky.m4783a(abstractActivityC1730l, i) : typedValue.data;
        Bundle bundle = this.f9342c;
        boolean z = this.f9343d;
        AbstractC9886jT1.m22044j(button, "positive", bundle, z, iM4783a);
        AbstractC9886jT1.m22044j(button2, "negative", bundle, z, iM4783a);
        AbstractC9886jT1.m22044j(button3, "neutral", bundle, z, iM4783a);
    }
}
