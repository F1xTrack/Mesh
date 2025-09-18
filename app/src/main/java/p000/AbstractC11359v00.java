package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: v00, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11359v00 extends AbstractC10847r00 implements InterfaceC10957rr0 {

    /* renamed from: b */
    public C4118gT f44070b = C4118gT.f27807c;

    /* renamed from: c */
    public boolean f44071c;

    /* renamed from: k */
    public final void m25292k(AbstractC11487w00 abstractC11487w00) {
        C10342n21 c10342n21;
        if (!this.f44071c) {
            this.f44070b = this.f44070b.clone();
            this.f44071c = true;
        }
        C4118gT c4118gT = this.f44070b;
        C4118gT c4118gT2 = abstractC11487w00.f44633a;
        c4118gT.getClass();
        int i = 0;
        while (true) {
            int size = c4118gT2.f27808a.f38058b.size();
            c10342n21 = c4118gT2.f27808a;
            if (i >= size) {
                break;
            }
            c4118gT.m18569g((Map.Entry) c10342n21.f38058b.get(i));
            i++;
        }
        Iterator it = c10342n21.m23063c().iterator();
        while (it.hasNext()) {
            c4118gT.m18569g((Map.Entry) it.next());
        }
    }
}
