package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.InterfaceC2777Ma;
import java.util.List;
import p000.C8905br1;

/* renamed from: com.yandex.metrica.impl.ob.w3 */
/* loaded from: classes2.dex */
public class C3691w3 implements InterfaceC3635u {

    /* renamed from: a */
    private final C2876Q9 f25156a;

    /* renamed from: b */
    private C3561r3 f25157b;

    public C3691w3(Context context) {
        this(InterfaceC2777Ma.b.m14608a(C3561r3.class).mo14606a(context));
    }

    /* renamed from: a */
    public void m17114a(List<C8905br1> list, boolean z) {
        for (C8905br1 c8905br1 : list) {
        }
        C3561r3 c3561r3 = new C3561r3(list, z);
        this.f25157b = c3561r3;
        this.f25156a.m14813a(c3561r3);
    }

    /* renamed from: b */
    public boolean m17115b() {
        return this.f25157b.f24575b;
    }

    public C3691w3(C2876Q9 c2876q9) {
        this.f25156a = c2876q9;
        this.f25157b = (C3561r3) c2876q9.m14814b();
    }

    /* renamed from: a */
    public List<C8905br1> m17113a() {
        return this.f25157b.f24574a;
    }
}
