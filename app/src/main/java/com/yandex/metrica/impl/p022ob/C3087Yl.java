package com.yandex.metrica.impl.p022ob;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.Yl */
/* loaded from: classes2.dex */
public class C3087Yl {

    /* renamed from: a */
    private final b f22903a;

    /* renamed from: b */
    private final a f22904b;

    /* renamed from: com.yandex.metrica.impl.ob.Yl$a */
    public static class a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.Yl$b */
    public static class b {
    }

    public C3087Yl() {
        this(new b(), new a());
    }

    /* renamed from: a */
    public C2638Gl m15518a(Activity activity, InterfaceC3345il interfaceC3345il, C3164bm c3164bm, C3163bl c3163bl, C3216dm c3216dm, C3062Xl c3062Xl) {
        ViewGroup viewGroup;
        C2638Gl c2638Gl = new C2638Gl();
        try {
            viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        } catch (Throwable th) {
            c3216dm.m15805a("ui_parsing_root", th);
            viewGroup = null;
        }
        if (viewGroup != null) {
            this.f22903a.getClass();
            C3631tl c3631tl = new C3631tl(c3164bm, new C3398km(c3216dm), new C2961Tk(c3164bm.f23150c), c3163bl, Collections.singletonList(new C3501ol()), Arrays.asList(new C2563Dl(c3164bm.f23149b)), c3216dm, c3062Xl, new C3450mm());
            c2638Gl.m14209a(c3631tl, viewGroup, interfaceC3345il);
            if (c3164bm.f23152e) {
                this.f22904b.getClass();
                C2936Sk c2936Sk = new C2936Sk(c3631tl.m16878a());
                Iterator<C2588El> it = c3631tl.m16880b().iterator();
                while (it.hasNext()) {
                    c2936Sk.m15138a(it.next());
                }
            }
        }
        return c2638Gl;
    }

    public C3087Yl(b bVar, a aVar) {
        this.f22903a = bVar;
        this.f22904b = aVar;
    }
}
