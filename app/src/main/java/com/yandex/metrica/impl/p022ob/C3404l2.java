package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.yandex.metrica.C3802u;
import com.yandex.metrica.C3806y;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.l2 */
/* loaded from: classes2.dex */
public class C3404l2 implements InterfaceC3041X0 {

    /* renamed from: a */
    private Context f24154a;

    /* renamed from: b */
    private C2969U3 f24155b;

    /* renamed from: c */
    private C3456n2 f24156c;

    /* renamed from: d */
    private Handler f24157d;

    /* renamed from: e */
    private C2685Ii f24158e;

    /* renamed from: f */
    private Map<String, InterfaceC3016W0> f24159f;

    /* renamed from: g */
    private final InterfaceC3660uo<String> f24160g;

    /* renamed from: h */
    private final List<String> f24161h;

    public C3404l2(Context context, C2969U3 c2969u3, C3456n2 c3456n2, Handler handler, C2685Ii c2685Ii) {
        HashMap map = new HashMap();
        this.f24159f = map;
        this.f24160g = new C3582ro(new C3712wo(map));
        this.f24161h = Arrays.asList("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
        this.f24154a = context;
        this.f24155b = c2969u3;
        this.f24156c = c3456n2;
        this.f24157d = handler;
        this.f24158e = c2685Ii;
    }

    /* renamed from: a */
    public C3585s1 m16346a(C3806y c3806y, boolean z, C2601F9 c2601f9) {
        this.f24160g.mo14391a(c3806y.apiKey);
        Context context = this.f24154a;
        C2969U3 c2969u3 = this.f24155b;
        C3585s1 c3585s1 = new C3585s1(context, c2969u3, c3806y, this.f24156c, new C2898R7(context, c2969u3), this.f24158e, new C2918S2(this, "20799a27-fa80-4b36-b2db-0f8141f24180"), new C2918S2(this, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), c2601f9, new C2533Cg(), C3065Y.m15442g(), new C2717K0(context));
        m16345a(c3585s1);
        if (z) {
            c3585s1.f21468i.m16469c(c3585s1.f21461b);
        }
        Map map = c3806y.f25546f;
        if (!C2968U2.m15250b(map)) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str)) {
                    c3585s1.f21468i.m16458a(str, str2, c3585s1.f21461b);
                } else if (c3585s1.f21462c.m17370c()) {
                    c3585s1.f21462c.m17369c("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
                }
            }
        }
        c3585s1.m14380a(c3806y.errorEnvironment);
        c3585s1.m14390f();
        this.f24156c.m16454a(c3585s1);
        this.f24159f.put(c3806y.apiKey, c3585s1);
        return c3585s1;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3066Y0
    /* renamed from: b */
    public InterfaceC3041X0 mo14670b() {
        return this;
    }

    /* renamed from: c */
    public synchronized void m16347c(C3802u c3802u) {
        try {
            if (this.f24159f.containsKey(c3802u.apiKey)) {
                C2689Im c2689ImM17346b = AbstractC3788zm.m17346b(c3802u.apiKey);
                if (c2689ImM17346b.m17370c()) {
                    c2689ImM17346b.m17369c("Reporter with apiKey=%s already exists.", c3802u.apiKey);
                }
            } else {
                mo14669b(c3802u);
                C2968U2.m15231a(c3802u.apiKey);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.metrica.impl.ob.W0] */
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3041X0
    /* renamed from: b */
    public synchronized InterfaceC3016W0 mo14669b(C3802u c3802u) {
        C3637u1 c3637u1;
        try {
            InterfaceC3016W0 interfaceC3016W0 = this.f24159f.get(c3802u.apiKey);
            c3637u1 = interfaceC3016W0;
            if (interfaceC3016W0 == 0) {
                if (!this.f24161h.contains(c3802u.apiKey)) {
                    this.f24158e.m14365g();
                }
                C3637u1 c3637u12 = new C3637u1(this.f24154a, this.f24155b, c3802u, this.f24156c);
                m16345a(c3637u12);
                c3637u12.m14390f();
                this.f24159f.put(c3802u.apiKey, c3637u12);
                c3637u1 = c3637u12;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3637u1;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3041X0
    /* renamed from: a */
    public synchronized InterfaceC3143b1 mo14668a(C3806y c3806y) {
        InterfaceC3143b1 interfaceC3143b1;
        InterfaceC3143b1 interfaceC3143b12 = (InterfaceC3016W0) this.f24159f.get(c3806y.apiKey);
        interfaceC3143b1 = interfaceC3143b12;
        if (interfaceC3143b12 == null) {
            C3402l0 c3402l0 = new C3402l0(this.f24154a, this.f24155b, c3806y, this.f24156c);
            m16345a(c3402l0);
            c3402l0.m14380a(c3806y.errorEnvironment);
            c3402l0.m14390f();
            interfaceC3143b1 = c3402l0;
        }
        return interfaceC3143b1;
    }

    /* renamed from: a */
    private void m16345a(AbstractC2691J abstractC2691J) {
        abstractC2691J.m14376a(new C3403l1(this.f24157d, abstractC2691J));
        abstractC2691J.f21461b.m16251a(this.f24158e);
    }
}
