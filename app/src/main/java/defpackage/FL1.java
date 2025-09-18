package defpackage;

import android.view.View;
import java.util.ArrayList;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public abstract class FL1 {
    public static final void a(View view) {
        O90.f(view, "<this>");
        C0208Ck1 c0208Ck1 = new C0208Ck1(view, null);
        C3602eY0 c3602eY0 = new C3602eY0();
        c3602eY0.d = AbstractC6383p22.a(c3602eY0, c3602eY0, c0208Ck1);
        while (c3602eY0.hasNext()) {
            View view2 = (View) c3602eY0.next();
            C5267jC0 c5267jC0 = (C5267jC0) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (c5267jC0 == null) {
                c5267jC0 = new C5267jC0();
                view2.setTag(R.id.pooling_container_listener_holder_tag, c5267jC0);
            }
            ArrayList arrayList = c5267jC0.a;
            int iD = AbstractC8259yu.d(arrayList);
            if (-1 < iD) {
                AbstractC1705Vq.p(arrayList.get(iD));
                throw null;
            }
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }
}
