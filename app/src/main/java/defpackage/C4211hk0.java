package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: hk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4211hk0 {
    public final C1857Xo1 a;
    public final List b;
    public final String c;

    public C4211hk0(Class cls, Class cls2, Class cls3, List list, C1857Xo1 c1857Xo1) {
        this.a = c1857Xo1;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final InterfaceC5506kS0 a(int i, int i2, TC tc, C0795Jy0 c0795Jy0, ES1 es1) {
        C1857Xo1 c1857Xo1 = this.a;
        List list = (List) c1857Xo1.i();
        try {
            List list2 = this.b;
            int size = list2.size();
            InterfaceC5506kS0 interfaceC5506kS0A = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC5506kS0A = ((PD) list2.get(i3)).a(i, i2, tc, c0795Jy0, es1);
                } catch (C8283z10 e) {
                    list.add(e);
                }
                if (interfaceC5506kS0A != null) {
                    break;
                }
            }
            if (interfaceC5506kS0A != null) {
                return interfaceC5506kS0A;
            }
            throw new C8283z10(this.c, new ArrayList(list));
        } finally {
            c1857Xo1.d(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
