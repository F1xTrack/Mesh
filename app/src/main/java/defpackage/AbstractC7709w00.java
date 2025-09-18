package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: w00 */
/* loaded from: classes2.dex */
public abstract class AbstractC7709w00 extends A00 {
    public final C3968gT a;

    public AbstractC7709w00() {
        this.a = new C3968gT();
    }

    public final boolean i() {
        int i = 0;
        while (true) {
            C6000n21 c6000n21 = this.a.a;
            if (i >= c6000n21.b.size()) {
                Iterator it = c6000n21.c().iterator();
                while (it.hasNext()) {
                    if (!C3968gT.e((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!C3968gT.e((Map.Entry) c6000n21.b.get(i))) {
                return false;
            }
            i++;
        }
    }

    public final int j() {
        C6000n21 c6000n21;
        int i = 0;
        int iD = 0;
        while (true) {
            c6000n21 = this.a.a;
            if (i >= c6000n21.b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c6000n21.b.get(i);
            iD += C3968gT.d((C7899x00) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : c6000n21.c()) {
            iD += C3968gT.d((C7899x00) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object k(C8089y00 c8089y00) {
        o(c8089y00);
        C6000n21 c6000n21 = this.a.a;
        C7899x00 c7899x00 = c8089y00.d;
        Object obj = c6000n21.get(c7899x00);
        if (obj == null) {
            return c8089y00.b;
        }
        if (!c7899x00.c) {
            return c8089y00.a(obj);
        }
        if (c7899x00.b.a != EnumC6909ro1.i) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c8089y00.a(it.next()));
        }
        return arrayList;
    }

    public final boolean l(C8089y00 c8089y00) {
        o(c8089y00);
        C3968gT c3968gT = this.a;
        c3968gT.getClass();
        C7899x00 c7899x00 = c8089y00.d;
        if (c7899x00.c) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return c3968gT.a.get(c7899x00) != null;
    }

    public final void m() {
        this.a.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(defpackage.C5780lu r9, defpackage.J9 r10, defpackage.DR r11, int r12) throws defpackage.Y90 {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7709w00.n(lu, J9, DR, int):boolean");
    }

    public final void o(C8089y00 c8089y00) {
        if (c8089y00.a != a()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public AbstractC7709w00(AbstractC7518v00 abstractC7518v00) {
        abstractC7518v00.b.f();
        abstractC7518v00.c = false;
        this.a = abstractC7518v00.b;
    }
}
