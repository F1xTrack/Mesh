package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import com.yandex.metrica.impl.p022ob.C2662Hk;
import java.util.Collections;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.zl */
/* loaded from: classes2.dex */
class C3787zl {

    /* renamed from: a */
    private final InterfaceC3449ml f25441a;

    /* renamed from: b */
    private final C2762Lk f25442b;

    /* renamed from: c */
    private final C2601F9 f25443c;

    /* renamed from: d */
    private volatile C2688Il f25444d;

    /* renamed from: e */
    private final C3294gm f25445e;

    /* renamed from: f */
    private final C2662Hk.b f25446f;

    /* renamed from: g */
    private final C2687Ik f25447g;

    /* renamed from: com.yandex.metrica.impl.ob.zl$a */
    public class a implements InterfaceC3449ml {
        public a(C3787zl c3787zl) {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3449ml
        public void onError(String str) {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3449ml
        public void onResult(JSONObject jSONObject) {
        }
    }

    public C3787zl(C2688Il c2688Il, C2762Lk c2762Lk, C2601F9 c2601f9, C3294gm c3294gm, C2687Ik c2687Ik) {
        this(c2688Il, c2762Lk, c2601f9, c3294gm, c2687Ik, new C2662Hk.b());
    }

    /* renamed from: a */
    public void m17342a(C2688Il c2688Il) {
        this.f25444d = c2688Il;
    }

    /* renamed from: b */
    public void m17343b(Activity activity) {
        C2688Il c2688Il = this.f25444d;
        if (this.f25447g.m14367a(activity, c2688Il) == EnumC3761yl.OK) {
            m17340a(activity, 0L, c2688Il, c2688Il.f21452e);
        }
    }

    public C3787zl(C2688Il c2688Il, C2762Lk c2762Lk, C2601F9 c2601f9, C3294gm c3294gm, C2687Ik c2687Ik, C2662Hk.b bVar) {
        this.f25441a = new a(this);
        this.f25444d = c2688Il;
        this.f25442b = c2762Lk;
        this.f25443c = c2601f9;
        this.f25445e = c3294gm;
        this.f25446f = bVar;
        this.f25447g = c2687Ik;
    }

    /* renamed from: a */
    public void m17341a(Activity activity) {
        C2688Il c2688Il = this.f25444d;
        if (this.f25447g.m14367a(activity, c2688Il) == EnumC3761yl.OK) {
            C3164bm c3164bm = c2688Il.f21452e;
            m17340a(activity, c3164bm.f23151d, c2688Il, c3164bm);
        }
    }

    /* renamed from: a */
    private void m17340a(Activity activity, long j, C2688Il c2688Il, C3164bm c3164bm) {
        C3294gm c3294gm = this.f25445e;
        C2662Hk.b bVar = this.f25446f;
        C2762Lk c2762Lk = this.f25442b;
        C2601F9 c2601f9 = this.f25443c;
        InterfaceC3449ml interfaceC3449ml = this.f25441a;
        bVar.getClass();
        c3294gm.m16014a(activity, j, c2688Il, c3164bm, Collections.singletonList(new C2662Hk(c2762Lk, c2601f9, false, interfaceC3449ml, new C2662Hk.a())));
    }
}
