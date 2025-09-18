package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class D3 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ H3 a;
    public final /* synthetic */ E3 b;

    public D3(E3 e3, H3 h3) {
        this.b = e3;
        this.a = h3;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        E3 e3 = this.b;
        DialogInterface.OnClickListener onClickListener = e3.q;
        H3 h3 = this.a;
        onClickListener.onClick(h3.b, i);
        if (e3.s) {
            return;
        }
        h3.b.dismiss();
    }
}
