package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class J31 implements InterfaceC7420uU {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final H31 e;
    public final I31[] f;
    public final long g;
    public final long h;

    public J31(int i, int i2, long j, long j2, int i3, boolean z, H31 h31, I31[] i31Arr) {
        this.a = i;
        this.b = i2;
        this.g = j;
        this.h = j2;
        this.c = i3;
        this.d = z;
        this.e = h31;
        this.f = i31Arr;
    }

    @Override // defpackage.InterfaceC7420uU
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        I31 i31 = null;
        int i = 0;
        while (i < arrayList.size()) {
            C3516e51 c3516e51 = (C3516e51) arrayList.get(i);
            I31 i312 = this.f[c3516e51.b];
            if (i312 != i31 && i31 != null) {
                arrayList2.add(i31.b((C6666qX[]) arrayList3.toArray(new C6666qX[0])));
                arrayList3.clear();
            }
            arrayList3.add(i312.j[c3516e51.c]);
            i++;
            i31 = i312;
        }
        if (i31 != null) {
            arrayList2.add(i31.b((C6666qX[]) arrayList3.toArray(new C6666qX[0])));
        }
        return new J31(this.a, this.b, this.g, this.h, this.c, this.d, this.e, (I31[]) arrayList2.toArray(new I31[0]));
    }
}
