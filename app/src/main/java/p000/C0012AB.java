package p000;

import android.database.DataSetObserver;

/* renamed from: AB */
/* loaded from: classes.dex */
public final class C0012AB extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ int f102a;

    /* renamed from: b */
    public final /* synthetic */ Object f103b;

    public /* synthetic */ C0012AB(int i, Object obj) {
        this.f102a = i;
        this.f103b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f102a) {
            case 0:
                ViewOnClickListenerC10224m61 viewOnClickListenerC10224m61 = (ViewOnClickListenerC10224m61) this.f103b;
                viewOnClickListenerC10224m61.f615a = true;
                viewOnClickListenerC10224m61.notifyDataSetChanged();
                break;
            default:
                C7696Hj0 c7696Hj0 = (C7696Hj0) this.f103b;
                if (c7696Hj0.f4480z.isShowing()) {
                    c7696Hj0.mo335b();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f102a) {
            case 0:
                ViewOnClickListenerC10224m61 viewOnClickListenerC10224m61 = (ViewOnClickListenerC10224m61) this.f103b;
                viewOnClickListenerC10224m61.f615a = false;
                viewOnClickListenerC10224m61.notifyDataSetInvalidated();
                break;
            default:
                ((C7696Hj0) this.f103b).dismiss();
                break;
        }
    }
}
