package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.l2 */
/* loaded from: classes2.dex */
public class C2891l2 implements X0 {
    private Context a;
    private U3 b;
    private C2941n2 c;
    private Handler d;
    private Ii e;
    private Map<String, W0> f;
    private final uo<String> g;
    private final List<String> h;

    public C2891l2(Context context, U3 u3, C2941n2 c2941n2, Handler handler, Ii ii) {
        HashMap map = new HashMap();
        this.f = map;
        this.g = new ro(new wo(map));
        this.h = Arrays.asList("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
        this.a = context;
        this.b = u3;
        this.c = c2941n2;
        this.d = handler;
        this.e = ii;
    }

    public C3064s1 a(com.yandex.metrica.y yVar, boolean z, F9 f9) {
        this.g.a(yVar.apiKey);
        Context context = this.a;
        U3 u3 = this.b;
        C3064s1 c3064s1 = new C3064s1(context, u3, yVar, this.c, new R7(context, u3), this.e, new S2(this, "20799a27-fa80-4b36-b2db-0f8141f24180"), new S2(this, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), f9, new Cg(), Y.g(), new K0(context));
        a(c3064s1);
        if (z) {
            c3064s1.i.c(c3064s1.b);
        }
        Map map = yVar.f;
        if (!U2.b(map)) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str)) {
                    c3064s1.i.a(str, str2, c3064s1.b);
                } else if (c3064s1.c.c()) {
                    c3064s1.c.c("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
                }
            }
        }
        c3064s1.a(yVar.errorEnvironment);
        c3064s1.f();
        this.c.a(c3064s1);
        this.f.put(yVar.apiKey, c3064s1);
        return c3064s1;
    }

    @Override // com.yandex.metrica.impl.ob.Y0
    public X0 b() {
        return this;
    }

    public synchronized void c(com.yandex.metrica.u uVar) {
        try {
            if (this.f.containsKey(uVar.apiKey)) {
                Im imB = AbstractC3265zm.b(uVar.apiKey);
                if (imB.c()) {
                    imB.c("Reporter with apiKey=%s already exists.", uVar.apiKey);
                }
            } else {
                b(uVar);
                U2.a(uVar.apiKey);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.metrica.impl.ob.W0] */
    @Override // com.yandex.metrica.impl.ob.X0
    public synchronized W0 b(com.yandex.metrica.u uVar) {
        C3114u1 c3114u1;
        try {
            W0 w0 = this.f.get(uVar.apiKey);
            c3114u1 = w0;
            if (w0 == 0) {
                if (!this.h.contains(uVar.apiKey)) {
                    this.e.g();
                }
                C3114u1 c3114u12 = new C3114u1(this.a, this.b, uVar, this.c);
                a(c3114u12);
                c3114u12.f();
                this.f.put(uVar.apiKey, c3114u12);
                c3114u1 = c3114u12;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3114u1;
    }

    @Override // com.yandex.metrica.impl.ob.X0
    public synchronized InterfaceC2641b1 a(com.yandex.metrica.y yVar) {
        InterfaceC2641b1 interfaceC2641b1;
        InterfaceC2641b1 interfaceC2641b12 = (W0) this.f.get(yVar.apiKey);
        interfaceC2641b1 = interfaceC2641b12;
        if (interfaceC2641b12 == null) {
            C2889l0 c2889l0 = new C2889l0(this.a, this.b, yVar, this.c);
            a(c2889l0);
            c2889l0.a(yVar.errorEnvironment);
            c2889l0.f();
            interfaceC2641b1 = c2889l0;
        }
        return interfaceC2641b1;
    }

    private void a(J j) {
        j.a(new C2890l1(this.d, j));
        j.b.a(this.e);
    }
}
