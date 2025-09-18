package com.yandex.metrica.impl.ob;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class Yl {
    private final b a;
    private final a b;

    public static class a {
    }

    public static class b {
    }

    public Yl() {
        this(new b(), new a());
    }

    public Gl a(Activity activity, InterfaceC2835il interfaceC2835il, C2662bm c2662bm, C2661bl c2661bl, C2712dm c2712dm, Xl xl) {
        ViewGroup viewGroup;
        Gl gl = new Gl();
        try {
            viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        } catch (Throwable th) {
            c2712dm.a("ui_parsing_root", th);
            viewGroup = null;
        }
        if (viewGroup != null) {
            this.a.getClass();
            C3109tl c3109tl = new C3109tl(c2662bm, new C2886km(c2712dm), new Tk(c2662bm.c), c2661bl, Collections.singletonList(new C2985ol()), Arrays.asList(new Dl(c2662bm.b)), c2712dm, xl, new C2936mm());
            gl.a(c3109tl, viewGroup, interfaceC2835il);
            if (c2662bm.e) {
                this.b.getClass();
                Sk sk = new Sk(c3109tl.a());
                Iterator<El> it = c3109tl.b().iterator();
                while (it.hasNext()) {
                    sk.a(it.next());
                }
            }
        }
        return gl;
    }

    public Yl(b bVar, a aVar) {
        this.a = bVar;
        this.b = aVar;
    }
}
