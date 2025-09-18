package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: Io1 */
/* loaded from: classes.dex */
public abstract class AbstractC0688Io1 {
    public final void a(C5793ly0 c5793ly0) {
        List listSingletonList = Collections.singletonList(c5793ly0);
        C0844Ko1 c0844Ko1 = (C0844Ko1) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        new C8243yo1(c0844Ko1, null, 2, listSingletonList).b();
    }

    public abstract ES1 b(String str, int i, NA0 na0);
}
