package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.L6;
import com.yandex.metrica.impl.ob.Qi;

/* loaded from: classes2.dex */
public class N6 {
    private final Context a;
    private final L6 b;
    private final M6 c;
    private final b d;
    private final I6 e;

    public class a implements L6.b {
        final /* synthetic */ O6 a;

        public a(O6 o6) {
            this.a = o6;
        }
    }

    public static class b {
    }

    public N6(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn, H6 h6) {
        this(context, interfaceExecutorC3086sn, h6, new M6(context));
    }

    private N6(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn, H6 h6, M6 m6) {
        this(context, new L6(interfaceExecutorC3086sn, h6), m6, new b(), new I6());
    }

    public void a() {
        b bVar = this.d;
        Context context = this.a;
        bVar.getClass();
        a(new Qi.b(context).a());
    }

    public N6(Context context, L6 l6, M6 m6, b bVar, I6 i6) {
        this.a = context;
        this.b = l6;
        this.c = m6;
        this.d = bVar;
        this.e = i6;
    }

    private void a(Qi qi) {
        if (qi.W() != null) {
            boolean z = qi.W().b;
            Long lA = this.e.a(qi.W().c);
            if (qi.f().i && lA != null && lA.longValue() > 0) {
                this.b.a(lA.longValue(), z);
            } else {
                this.b.a();
            }
        }
    }

    public void a(O6 o6) {
        b bVar = this.d;
        Context context = this.a;
        bVar.getClass();
        Qi qiA = new Qi.b(context).a();
        if (qiA.W() != null) {
            long j = qiA.W().a;
            if (j > 0) {
                this.c.a(this.a.getPackageName());
                this.b.a(j, new a(o6));
            } else if (o6 != null) {
                o6.a();
            }
        } else if (o6 != null) {
            o6.a();
        }
        a(qiA);
    }
}
