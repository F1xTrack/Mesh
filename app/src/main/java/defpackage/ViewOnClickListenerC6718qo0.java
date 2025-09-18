package defpackage;

import android.view.View;
import com.google.android.material.timepicker.e;
import java.util.Iterator;

/* renamed from: qo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC6718qo0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ ViewOnClickListenerC6718qo0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                e eVar = this.b;
                Iterator it = eVar.a.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                eVar.dismiss();
                break;
            case 1:
                e eVar2 = this.b;
                Iterator it2 = eVar2.b.iterator();
                while (it2.hasNext()) {
                    ((View.OnClickListener) it2.next()).onClick(view);
                }
                eVar2.dismiss();
                break;
            default:
                e eVar3 = this.b;
                eVar3.t = eVar3.t == 0 ? 1 : 0;
                eVar3.s(eVar3.r);
                break;
        }
    }
}
