package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C3393kh;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.Fi */
/* loaded from: classes2.dex */
public class C2610Fi {

    /* renamed from: a */
    private final C3113Zm<String, InterfaceC2760Li> f21225a = new C3113Zm<>();

    /* renamed from: b */
    private final HashMap<String, C2934Si> f21226b = new HashMap<>();

    /* renamed from: c */
    private C2885Qi f21227c = null;

    /* renamed from: d */
    private final InterfaceC2860Pi f21228d = new a();

    /* renamed from: com.yandex.metrica.impl.ob.Fi$a */
    public class a implements InterfaceC2860Pi {
        public a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Fi$b */
    public static final class b {

        /* renamed from: a */
        static final C2610Fi f21230a = new C2610Fi();
    }

    /* renamed from: a */
    public static final C2610Fi m14135a() {
        return b.f21230a;
    }

    /* renamed from: a */
    public C2934Si m14139a(Context context, C3172c4 c3172c4, C3393kh.b bVar) {
        C2934Si c2934Si = this.f21226b.get(c3172c4.m15701b());
        boolean z = true;
        if (c2934Si == null) {
            synchronized (this.f21226b) {
                try {
                    c2934Si = this.f21226b.get(c3172c4.m15701b());
                    if (c2934Si == null) {
                        c2934Si = new C2934Si(context, c3172c4.m15701b(), bVar, this.f21228d);
                        this.f21226b.put(c3172c4.m15701b(), c2934Si);
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            c2934Si.m15131a(bVar);
        }
        return c2934Si;
    }

    /* renamed from: a */
    public void m14140a(C3172c4 c3172c4, InterfaceC2760Li interfaceC2760Li) {
        synchronized (this.f21226b) {
            try {
                this.f21225a.m15567a(c3172c4.m15701b(), interfaceC2760Li);
                C2885Qi c2885Qi = this.f21227c;
                if (c2885Qi != null) {
                    interfaceC2760Li.mo14544a(c2885Qi);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
