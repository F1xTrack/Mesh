package p000;

import android.view.View;
import com.google.android.material.timepicker.C1949e;
import java.util.Iterator;

/* renamed from: qo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC10823qo0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f41168a;

    /* renamed from: b */
    public final /* synthetic */ C1949e f41169b;

    public /* synthetic */ ViewOnClickListenerC10823qo0(C1949e c1949e, int i) {
        this.f41168a = i;
        this.f41169b = c1949e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41168a) {
            case 0:
                C1949e c1949e = this.f41169b;
                Iterator it = c1949e.f18395a.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                c1949e.dismiss();
                break;
            case 1:
                C1949e c1949e2 = this.f41169b;
                Iterator it2 = c1949e2.f18396b.iterator();
                while (it2.hasNext()) {
                    ((View.OnClickListener) it2.next()).onClick(view);
                }
                c1949e2.dismiss();
                break;
            default:
                C1949e c1949e3 = this.f41169b;
                c1949e3.f18414t = c1949e3.f18414t == 0 ? 1 : 0;
                c1949e3.m11284s(c1949e3.f18412r);
                break;
        }
    }
}
