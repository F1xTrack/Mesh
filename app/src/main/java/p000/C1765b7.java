package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: b7 */
/* loaded from: classes.dex */
public final class C1765b7 implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f16783a;

    /* renamed from: b */
    public final /* synthetic */ Object f16784b;

    public /* synthetic */ C1765b7(int i, Object obj) {
        this.f16783a = i;
        this.f16784b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        switch (this.f16783a) {
            case 0:
                C3908d7 c3908d7 = (C3908d7) this.f16784b;
                c3908d7.f25822H.setSelection(i);
                C4096g7 c4096g7 = c3908d7.f25822H;
                if (c4096g7.getOnItemClickListener() != null) {
                    c4096g7.performItemClick(view, i, c3908d7.f25819E.getItemId(i));
                }
                c3908d7.dismiss();
                break;
            case 1:
                C8224Rn0 c8224Rn0 = (C8224Rn0) this.f16784b;
                if (i < 0) {
                    C7696Hj0 c7696Hj0 = c8224Rn0.f10415e;
                    item = !c7696Hj0.f4480z.isShowing() ? null : c7696Hj0.f4457c.getSelectedItem();
                } else {
                    item = c8224Rn0.getAdapter().getItem(i);
                }
                C8224Rn0.m7116a(c8224Rn0, item);
                AdapterView.OnItemClickListener onItemClickListener = c8224Rn0.getOnItemClickListener();
                C7696Hj0 c7696Hj02 = c8224Rn0.f10415e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = c7696Hj02.f4480z.isShowing() ? c7696Hj02.f4457c.getSelectedView() : null;
                        i = !c7696Hj02.f4480z.isShowing() ? -1 : c7696Hj02.f4457c.getSelectedItemPosition();
                        j = !c7696Hj02.f4480z.isShowing() ? Long.MIN_VALUE : c7696Hj02.f4457c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c7696Hj02.f4457c, view, i, j);
                }
                c7696Hj02.dismiss();
                break;
            default:
                ((C0830NB) this.f16784b).m22058p(i);
                break;
        }
    }
}
