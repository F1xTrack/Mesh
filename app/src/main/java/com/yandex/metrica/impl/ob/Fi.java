package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C2881kh;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Fi {
    private final Zm<String, Li> a = new Zm<>();
    private final HashMap<String, Si> b = new HashMap<>();
    private Qi c = null;
    private final Pi d = new a();

    public class a implements Pi {
        public a() {
        }
    }

    public static final class b {
        static final Fi a = new Fi();
    }

    public static final Fi a() {
        return b.a;
    }

    public Si a(Context context, C2669c4 c2669c4, C2881kh.b bVar) {
        Si si = this.b.get(c2669c4.b());
        boolean z = true;
        if (si == null) {
            synchronized (this.b) {
                try {
                    si = this.b.get(c2669c4.b());
                    if (si == null) {
                        si = new Si(context, c2669c4.b(), bVar, this.d);
                        this.b.put(c2669c4.b(), si);
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            si.a(bVar);
        }
        return si;
    }

    public void a(C2669c4 c2669c4, Li li) {
        synchronized (this.b) {
            try {
                this.a.a(c2669c4.b(), li);
                Qi qi = this.c;
                if (qi != null) {
                    li.a(qi);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
