package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: Bj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126Bj0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0126Bj0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C2118aM c2118aM;
        switch (this.a) {
            case 0:
                if (i != -1 && (c2118aM = ((C0594Hj0) this.b).c) != null) {
                    c2118aM.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((NB) this.b).q(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
