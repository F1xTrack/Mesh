package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: hk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9663hk0 {

    /* renamed from: a */
    public final C8539Xo1 f28558a;

    /* renamed from: b */
    public final List f28559b;

    /* renamed from: c */
    public final String f28560c;

    public C9663hk0(Class cls, Class cls2, Class cls3, List list, C8539Xo1 c8539Xo1) {
        this.f28558a = c8539Xo1;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f28559b = list;
        this.f28560c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public final InterfaceC10011kS0 m18870a(int i, int i2, InterfaceC1208TC interfaceC1208TC, C7830Jy0 c7830Jy0, ES1 es1) {
        C8539Xo1 c8539Xo1 = this.f28558a;
        List list = (List) c8539Xo1.mo4581i();
        try {
            List list2 = this.f28559b;
            int size = list2.size();
            InterfaceC10011kS0 interfaceC10011kS0M6255a = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC10011kS0M6255a = ((C0958PD) list2.get(i3)).m6255a(i, i2, interfaceC1208TC, c7830Jy0, es1);
                } catch (C11871z10 e) {
                    list.add(e);
                }
                if (interfaceC10011kS0M6255a != null) {
                    break;
                }
            }
            if (interfaceC10011kS0M6255a != null) {
                return interfaceC10011kS0M6255a;
            }
            throw new C11871z10(this.f28560c, new ArrayList(list));
        } finally {
            c8539Xo1.mo4580d(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f28559b.toArray()) + '}';
    }
}
