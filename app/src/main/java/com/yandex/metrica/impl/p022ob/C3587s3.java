package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3184cg;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C8905br1;

/* renamed from: com.yandex.metrica.impl.ob.s3 */
/* loaded from: classes2.dex */
public class C3587s3 implements InterfaceC3230ea<C3561r3, C3184cg> {

    /* renamed from: a */
    private final C3639u3 f24648a;

    public C3587s3() {
        this(new C3639u3());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C3561r3 mo13846a(C3184cg c3184cg) {
        C3184cg c3184cg2 = c3184cg;
        ArrayList arrayList = new ArrayList(c3184cg2.f23181b.length);
        for (C3184cg.a aVar : c3184cg2.f23181b) {
            arrayList.add(this.f24648a.mo13846a(aVar));
        }
        return new C3561r3(arrayList, c3184cg2.f23182c);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public C3184cg mo13847b(C3561r3 c3561r3) {
        C3561r3 c3561r32 = c3561r3;
        C3184cg c3184cg = new C3184cg();
        c3184cg.f23181b = new C3184cg.a[c3561r32.f24574a.size()];
        Iterator<C8905br1> it = c3561r32.f24574a.iterator();
        int i = 0;
        while (it.hasNext()) {
            c3184cg.f23181b[i] = this.f24648a.mo13847b(it.next());
            i++;
        }
        c3184cg.f23182c = c3561r32.f24575b;
        return c3184cg;
    }

    public C3587s3(C3639u3 c3639u3) {
        this.f24648a = c3639u3;
    }
}
