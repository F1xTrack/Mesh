package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: Bj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7384Bj0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public final /* synthetic */ int f992a;

    /* renamed from: b */
    public final /* synthetic */ Object f993b;

    public /* synthetic */ C7384Bj0(int i, Object obj) {
        this.f992a = i;
        this.f993b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C1659aM c1659aM;
        switch (this.f992a) {
            case 0:
                if (i != -1 && (c1659aM = ((C7696Hj0) this.f993b).f4457c) != null) {
                    c1659aM.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((C0830NB) this.f993b).m22059q(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f992a;
    }

    /* renamed from: a */
    private final void m841a(AdapterView adapterView) {
    }

    /* renamed from: b */
    private final void m842b(AdapterView adapterView) {
    }
}
