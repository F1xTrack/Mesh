package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class J31 implements InterfaceC6952uU {

    /* renamed from: a */
    public final int f5296a;

    /* renamed from: b */
    public final int f5297b;

    /* renamed from: c */
    public final int f5298c;

    /* renamed from: d */
    public final boolean f5299d;

    /* renamed from: e */
    public final H31 f5300e;

    /* renamed from: f */
    public final I31[] f5301f;

    /* renamed from: g */
    public final long f5302g;

    /* renamed from: h */
    public final long f5303h;

    public J31(int i, int i2, long j, long j2, int i3, boolean z, H31 h31, I31[] i31Arr) {
        this.f5296a = i;
        this.f5297b = i2;
        this.f5302g = j;
        this.f5303h = j2;
        this.f5298c = i3;
        this.f5299d = z;
        this.f5300e = h31;
        this.f5301f = i31Arr;
    }

    @Override // p000.InterfaceC6952uU
    /* renamed from: a */
    public final Object mo4151a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        I31 i31 = null;
        int i = 0;
        while (i < arrayList.size()) {
            C9198e51 c9198e51 = (C9198e51) arrayList.get(i);
            I31 i312 = this.f5301f[c9198e51.f26538b];
            if (i312 != i31 && i31 != null) {
                arrayList2.add(i31.m3740b((C6686qX[]) arrayList3.toArray(new C6686qX[0])));
                arrayList3.clear();
            }
            arrayList3.add(i312.f4683j[c9198e51.f26539c]);
            i++;
            i31 = i312;
        }
        if (i31 != null) {
            arrayList2.add(i31.m3740b((C6686qX[]) arrayList3.toArray(new C6686qX[0])));
        }
        return new J31(this.f5296a, this.f5297b, this.f5302g, this.f5303h, this.f5298c, this.f5299d, this.f5300e, (I31[]) arrayList2.toArray(new I31[0]));
    }
}
