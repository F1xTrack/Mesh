package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: b7 */
/* loaded from: classes.dex */
public final class C2264b7 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2264b7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        switch (this.a) {
            case 0:
                C3330d7 c3330d7 = (C3330d7) this.b;
                c3330d7.H.setSelection(i);
                C3902g7 c3902g7 = c3330d7.H;
                if (c3902g7.getOnItemClickListener() != null) {
                    c3902g7.performItemClick(view, i, c3330d7.E.getItemId(i));
                }
                c3330d7.dismiss();
                break;
            case 1:
                C1385Rn0 c1385Rn0 = (C1385Rn0) this.b;
                if (i < 0) {
                    C0594Hj0 c0594Hj0 = c1385Rn0.e;
                    item = !c0594Hj0.z.isShowing() ? null : c0594Hj0.c.getSelectedItem();
                } else {
                    item = c1385Rn0.getAdapter().getItem(i);
                }
                C1385Rn0.a(c1385Rn0, item);
                AdapterView.OnItemClickListener onItemClickListener = c1385Rn0.getOnItemClickListener();
                C0594Hj0 c0594Hj02 = c1385Rn0.e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = c0594Hj02.z.isShowing() ? c0594Hj02.c.getSelectedView() : null;
                        i = !c0594Hj02.z.isShowing() ? -1 : c0594Hj02.c.getSelectedItemPosition();
                        j = !c0594Hj02.z.isShowing() ? Long.MIN_VALUE : c0594Hj02.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c0594Hj02.c, view, i, j);
                }
                c0594Hj02.dismiss();
                break;
            default:
                ((NB) this.b).p(i);
                break;
        }
    }
}
