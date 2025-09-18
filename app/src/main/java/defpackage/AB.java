package defpackage;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class AB extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ AB(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.a) {
            case 0:
                ViewOnClickListenerC5823m61 viewOnClickListenerC5823m61 = (ViewOnClickListenerC5823m61) this.b;
                viewOnClickListenerC5823m61.a = true;
                viewOnClickListenerC5823m61.notifyDataSetChanged();
                break;
            default:
                C0594Hj0 c0594Hj0 = (C0594Hj0) this.b;
                if (c0594Hj0.z.isShowing()) {
                    c0594Hj0.b();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.a) {
            case 0:
                ViewOnClickListenerC5823m61 viewOnClickListenerC5823m61 = (ViewOnClickListenerC5823m61) this.b;
                viewOnClickListenerC5823m61.a = false;
                viewOnClickListenerC5823m61.notifyDataSetInvalidated();
                break;
            default:
                ((C0594Hj0) this.b).dismiss();
                break;
        }
    }
}
