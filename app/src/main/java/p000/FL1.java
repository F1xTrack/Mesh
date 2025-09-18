package p000;

import android.view.View;
import java.util.ArrayList;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public abstract class FL1 {
    /* renamed from: a */
    public static final void m2582a(View view) {
        O90.m5968f(view, "<this>");
        C7439Ck1 c7439Ck1 = new C7439Ck1(view, null);
        C9255eY0 c9255eY0 = new C9255eY0();
        c9255eY0.f26747d = AbstractC10599p22.m23594a(c9255eY0, c9255eY0, c7439Ck1);
        while (c9255eY0.hasNext()) {
            View view2 = (View) c9255eY0.next();
            C9851jC0 c9851jC0 = (C9851jC0) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (c9851jC0 == null) {
                c9851jC0 = new C9851jC0();
                view2.setTag(R.id.pooling_container_listener_holder_tag, c9851jC0);
            }
            ArrayList arrayList = c9851jC0.f34971a;
            int iM26273d = AbstractC7230yu.m26273d(arrayList);
            if (-1 < iM26273d) {
                AbstractC1374Vq.m8597p(arrayList.get(iM26273d));
                throw null;
            }
        }
    }

    /* renamed from: b */
    public static void m2583b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }
}
