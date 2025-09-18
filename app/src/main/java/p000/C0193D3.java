package p000;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: D3 */
/* loaded from: classes.dex */
public final class C0193D3 implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0445H3 f1807a;

    /* renamed from: b */
    public final /* synthetic */ C0256E3 f1808b;

    public C0193D3(C0256E3 c0256e3, C0445H3 c0445h3) {
        this.f1808b = c0256e3;
        this.f1807a = c0445h3;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0256E3 c0256e3 = this.f1808b;
        DialogInterface.OnClickListener onClickListener = c0256e3.f2388q;
        C0445H3 c0445h3 = this.f1807a;
        onClickListener.onClick(c0445h3.f4004b, i);
        if (c0256e3.f2390s) {
            return;
        }
        c0445h3.f4004b.dismiss();
    }
}
