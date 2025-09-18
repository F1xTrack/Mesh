package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: pC */
/* loaded from: classes.dex */
public final class C6412pC implements InterfaceC7420uU {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final N8 i;
    public final C5575kp0 j;
    public final Uri k;
    public final C3352dE0 l;
    public final List m;

    public C6412pC(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C3352dE0 c3352dE0, N8 n8, C5575kp0 c5575kp0, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = c3352dE0;
        this.i = n8;
        this.k = uri;
        this.j = c5575kp0;
        this.m = arrayList;
    }

    @Override // defpackage.InterfaceC7420uU
    public final Object a(List list) {
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C3516e51());
        ArrayList arrayList3 = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (i < this.m.size()) {
            if (((C3516e51) linkedList.peek()).a != i) {
                long jC = c(i);
                if (jC != -9223372036854775807L) {
                    j2 += jC;
                }
                arrayList2 = arrayList3;
            } else {
                MA0 ma0B = b(i);
                List list2 = ma0B.c;
                C3516e51 c3516e51 = (C3516e51) linkedList.poll();
                int i2 = c3516e51.a;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i3 = c3516e51.b;
                    C3889g3 c3889g3 = (C3889g3) list2.get(i3);
                    List list3 = c3889g3.c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((AbstractC6458pR0) list3.get(c3516e51.c));
                        c3516e51 = (C3516e51) linkedList.poll();
                        if (c3516e51.a != i2) {
                            break;
                        }
                    } while (c3516e51.b == i3);
                    arrayList = arrayList3;
                    j = j2;
                    arrayList4.add(new C3889g3(c3889g3.a, c3889g3.b, arrayList5, c3889g3.d, c3889g3.e, c3889g3.f));
                    if (c3516e51.a != i2) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j2 = j;
                }
                linkedList.addFirst(c3516e51);
                arrayList2 = arrayList;
                arrayList2.add(new MA0(ma0B.a, ma0B.b - j, arrayList4, ma0B.d));
                j2 = j;
            }
            i++;
            arrayList3 = arrayList2;
        }
        ArrayList arrayList6 = arrayList3;
        long j3 = j2;
        long j4 = this.b;
        return new C6412pC(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList6);
    }

    public final MA0 b(int i) {
        return (MA0) this.m.get(i);
    }

    public final long c(int i) {
        long j;
        long j2;
        List list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((MA0) list.get(i)).b;
        } else {
            j = ((MA0) list.get(i + 1)).b;
            j2 = ((MA0) list.get(i)).b;
        }
        return j - j2;
    }

    public final long d(int i) {
        return AbstractC0277Dh1.Q(c(i));
    }
}
