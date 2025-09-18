package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: pC */
/* loaded from: classes.dex */
public final class C6602pC implements InterfaceC6952uU {

    /* renamed from: a */
    public final long f39897a;

    /* renamed from: b */
    public final long f39898b;

    /* renamed from: c */
    public final long f39899c;

    /* renamed from: d */
    public final boolean f39900d;

    /* renamed from: e */
    public final long f39901e;

    /* renamed from: f */
    public final long f39902f;

    /* renamed from: g */
    public final long f39903g;

    /* renamed from: h */
    public final long f39904h;

    /* renamed from: i */
    public final C0827N8 f39905i;

    /* renamed from: j */
    public final C10057kp0 f39906j;

    /* renamed from: k */
    public final Uri f39907k;

    /* renamed from: l */
    public final C9087dE0 f39908l;

    /* renamed from: m */
    public final List f39909m;

    public C6602pC(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C9087dE0 c9087dE0, C0827N8 c0827n8, C10057kp0 c10057kp0, Uri uri, ArrayList arrayList) {
        this.f39897a = j;
        this.f39898b = j2;
        this.f39899c = j3;
        this.f39900d = z;
        this.f39901e = j4;
        this.f39902f = j5;
        this.f39903g = j6;
        this.f39904h = j7;
        this.f39908l = c9087dE0;
        this.f39905i = c0827n8;
        this.f39907k = uri;
        this.f39906j = c10057kp0;
        this.f39909m = arrayList;
    }

    @Override // p000.InterfaceC6952uU
    /* renamed from: a */
    public final Object mo4151a(List list) {
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C9198e51());
        ArrayList arrayList3 = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (i < this.f39909m.size()) {
            if (((C9198e51) linkedList.peek()).f26537a != i) {
                long jM23641c = m23641c(i);
                if (jM23641c != -9223372036854775807L) {
                    j2 += jM23641c;
                }
                arrayList2 = arrayList3;
            } else {
                MA0 ma0M23640b = m23640b(i);
                List list2 = ma0M23640b.f7015c;
                C9198e51 c9198e51 = (C9198e51) linkedList.poll();
                int i2 = c9198e51.f26537a;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i3 = c9198e51.f26538b;
                    C4092g3 c4092g3 = (C4092g3) list2.get(i3);
                    List list3 = c4092g3.f27535c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((AbstractC10649pR0) list3.get(c9198e51.f26539c));
                        c9198e51 = (C9198e51) linkedList.poll();
                        if (c9198e51.f26537a != i2) {
                            break;
                        }
                    } while (c9198e51.f26538b == i3);
                    arrayList = arrayList3;
                    j = j2;
                    arrayList4.add(new C4092g3(c4092g3.f27533a, c4092g3.f27534b, arrayList5, c4092g3.f27536d, c4092g3.f27537e, c4092g3.f27538f));
                    if (c9198e51.f26537a != i2) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j2 = j;
                }
                linkedList.addFirst(c9198e51);
                arrayList2 = arrayList;
                arrayList2.add(new MA0(ma0M23640b.f7013a, ma0M23640b.f7014b - j, arrayList4, ma0M23640b.f7016d));
                j2 = j;
            }
            i++;
            arrayList3 = arrayList2;
        }
        ArrayList arrayList6 = arrayList3;
        long j3 = j2;
        long j4 = this.f39898b;
        return new C6602pC(this.f39897a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.f39899c, this.f39900d, this.f39901e, this.f39902f, this.f39903g, this.f39904h, this.f39908l, this.f39905i, this.f39906j, this.f39907k, arrayList6);
    }

    /* renamed from: b */
    public final MA0 m23640b(int i) {
        return (MA0) this.f39909m.get(i);
    }

    /* renamed from: c */
    public final long m23641c(int i) {
        long j;
        long j2;
        List list = this.f39909m;
        if (i == list.size() - 1) {
            j = this.f39898b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((MA0) list.get(i)).f7014b;
        } else {
            j = ((MA0) list.get(i + 1)).f7014b;
            j2 = ((MA0) list.get(i)).f7014b;
        }
        return j - j2;
    }

    /* renamed from: d */
    public final long m23642d(int i) {
        return AbstractC7485Dh1.m1802Q(m23641c(i));
    }
}
