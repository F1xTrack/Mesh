package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: v00, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7518v00 extends AbstractC6754r00 implements InterfaceC6917rr0 {
    public C3968gT b = C3968gT.c;
    public boolean c;

    public final void k(AbstractC7709w00 abstractC7709w00) {
        C6000n21 c6000n21;
        if (!this.c) {
            this.b = this.b.clone();
            this.c = true;
        }
        C3968gT c3968gT = this.b;
        C3968gT c3968gT2 = abstractC7709w00.a;
        c3968gT.getClass();
        int i = 0;
        while (true) {
            int size = c3968gT2.a.b.size();
            c6000n21 = c3968gT2.a;
            if (i >= size) {
                break;
            }
            c3968gT.g((Map.Entry) c6000n21.b.get(i));
            i++;
        }
        Iterator it = c6000n21.c().iterator();
        while (it.hasNext()) {
            c3968gT.g((Map.Entry) it.next());
        }
    }
}
