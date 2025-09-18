package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: Io1 */
/* loaded from: classes.dex */
public abstract class AbstractC7759Io1 {
    /* renamed from: a */
    public final void m4021a(C10203ly0 c10203ly0) {
        List listSingletonList = Collections.singletonList(c10203ly0);
        C7863Ko1 c7863Ko1 = (C7863Ko1) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        new C11845yo1(c7863Ko1, null, 2, listSingletonList).m26263b();
    }

    /* renamed from: b */
    public abstract ES1 mo4022b(String str, int i, NA0 na0);
}
