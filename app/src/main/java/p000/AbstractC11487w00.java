package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: w00 */
/* loaded from: classes2.dex */
public abstract class AbstractC11487w00 extends A00 {

    /* renamed from: a */
    public final C4118gT f44633a;

    public AbstractC11487w00() {
        this.f44633a = new C4118gT();
    }

    /* renamed from: i */
    public final boolean m25535i() {
        int i = 0;
        while (true) {
            C10342n21 c10342n21 = this.f44633a.f27808a;
            if (i >= c10342n21.f38058b.size()) {
                Iterator it = c10342n21.m23063c().iterator();
                while (it.hasNext()) {
                    if (!C4118gT.m18562e((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!C4118gT.m18562e((Map.Entry) c10342n21.f38058b.get(i))) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: j */
    public final int m25536j() {
        C10342n21 c10342n21;
        int i = 0;
        int iM18561d = 0;
        while (true) {
            c10342n21 = this.f44633a.f27808a;
            if (i >= c10342n21.f38058b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c10342n21.f38058b.get(i);
            iM18561d += C4118gT.m18561d((C11614x00) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : c10342n21.m23063c()) {
            iM18561d += C4118gT.m18561d((C11614x00) entry2.getKey(), entry2.getValue());
        }
        return iM18561d;
    }

    /* renamed from: k */
    public final Object m25537k(C11741y00 c11741y00) {
        m25541o(c11741y00);
        C10342n21 c10342n21 = this.f44633a.f27808a;
        C11614x00 c11614x00 = c11741y00.f46006d;
        Object obj = c10342n21.get(c11614x00);
        if (obj == null) {
            return c11741y00.f46004b;
        }
        if (!c11614x00.f45253c) {
            return c11741y00.m26030a(obj);
        }
        if (c11614x00.f45252b.f39281a != EnumC10952ro1.f41915i) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c11741y00.m26030a(it.next()));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final boolean m25538l(C11741y00 c11741y00) {
        m25541o(c11741y00);
        C4118gT c4118gT = this.f44633a;
        c4118gT.getClass();
        C11614x00 c11614x00 = c11741y00.f46006d;
        if (c11614x00.f45253c) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return c4118gT.f27808a.get(c11614x00) != null;
    }

    /* renamed from: m */
    public final void m25539m() {
        this.f44633a.m18568f();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x001d  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m25540n(p000.C6392lu r9, p000.C0577J9 r10, p000.C0217DR r11, int r12) throws p000.Y90 {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11487w00.m25540n(lu, J9, DR, int):boolean");
    }

    /* renamed from: o */
    public final void m25541o(C11741y00 c11741y00) {
        if (c11741y00.f46003a != mo127a()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public AbstractC11487w00(AbstractC11359v00 abstractC11359v00) {
        abstractC11359v00.f44070b.m18568f();
        abstractC11359v00.f44071c = false;
        this.f44633a = abstractC11359v00.f44070b;
    }
}
