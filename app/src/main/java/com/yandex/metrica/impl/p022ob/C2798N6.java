package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C2748L6;
import com.yandex.metrica.impl.p022ob.C2885Qi;

/* renamed from: com.yandex.metrica.impl.ob.N6 */
/* loaded from: classes2.dex */
public class C2798N6 {

    /* renamed from: a */
    private final Context f21763a;

    /* renamed from: b */
    private final C2748L6 f21764b;

    /* renamed from: c */
    private final C2773M6 f21765c;

    /* renamed from: d */
    private final b f21766d;

    /* renamed from: e */
    private final C2673I6 f21767e;

    /* renamed from: com.yandex.metrica.impl.ob.N6$a */
    public class a implements C2748L6.b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2823O6 f21768a;

        public a(InterfaceC2823O6 interfaceC2823O6) {
            this.f21768a = interfaceC2823O6;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.N6$b */
    public static class b {
    }

    public C2798N6(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn, InterfaceC2648H6 interfaceC2648H6) {
        this(context, interfaceExecutorC3607sn, interfaceC2648H6, new C2773M6(context));
    }

    private C2798N6(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn, InterfaceC2648H6 interfaceC2648H6, C2773M6 c2773m6) {
        this(context, new C2748L6(interfaceExecutorC3607sn, interfaceC2648H6), c2773m6, new b(), new C2673I6());
    }

    /* renamed from: a */
    public void m14639a() {
        b bVar = this.f21766d;
        Context context = this.f21763a;
        bVar.getClass();
        m14638a(new C2885Qi.b(context).m14950a());
    }

    public C2798N6(Context context, C2748L6 c2748l6, C2773M6 c2773m6, b bVar, C2673I6 c2673i6) {
        this.f21763a = context;
        this.f21764b = c2748l6;
        this.f21765c = c2773m6;
        this.f21766d = bVar;
        this.f21767e = c2673i6;
    }

    /* renamed from: a */
    private void m14638a(C2885Qi c2885Qi) {
        if (c2885Qi.m14874W() != null) {
            boolean z = c2885Qi.m14874W().f21114b;
            Long lM14281a = this.f21767e.m14281a(c2885Qi.m14874W().f21115c);
            if (c2885Qi.m14880f().f24716i && lM14281a != null && lM14281a.longValue() > 0) {
                this.f21764b.m14509a(lM14281a.longValue(), z);
            } else {
                this.f21764b.m14507a();
            }
        }
    }

    /* renamed from: a */
    public void m14640a(InterfaceC2823O6 interfaceC2823O6) {
        b bVar = this.f21766d;
        Context context = this.f21763a;
        bVar.getClass();
        C2885Qi c2885QiM14950a = new C2885Qi.b(context).m14950a();
        if (c2885QiM14950a.m14874W() != null) {
            long j = c2885QiM14950a.m14874W().f21113a;
            if (j > 0) {
                this.f21765c.m14603a(this.f21763a.getPackageName());
                this.f21764b.m14508a(j, new a(interfaceC2823O6));
            } else if (interfaceC2823O6 != null) {
                interfaceC2823O6.mo14694a();
            }
        } else if (interfaceC2823O6 != null) {
            interfaceC2823O6.mo14694a();
        }
        m14638a(c2885QiM14950a);
    }
}
