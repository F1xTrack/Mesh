package p000;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: nn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10437nn0 extends AbstractC11058sd1 {

    /* renamed from: a */
    public final C11569wd1 f38506a;

    /* renamed from: b */
    public final /* synthetic */ C7104wu f38507b;

    public C10437nn0(C7104wu c7104wu, C9189e20 c9189e20, Type type, AbstractC11058sd1 abstractC11058sd1, Type type2, AbstractC11058sd1 abstractC11058sd12) {
        this.f38507b = c7104wu;
        new C11569wd1(c9189e20, abstractC11058sd1, type);
        this.f38506a = new C11569wd1(c9189e20, abstractC11058sd12, type2);
    }

    @Override // p000.AbstractC11058sd1
    /* renamed from: a */
    public final void mo246a(C7890Lc0 c7890Lc0, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            c7890Lc0.m5034J();
            return;
        }
        this.f38507b.getClass();
        C11569wd1 c11569wd1 = this.f38506a;
        c7890Lc0.m5045o();
        for (Map.Entry entry : map.entrySet()) {
            c7890Lc0.m5032A(String.valueOf(entry.getKey()));
            c11569wd1.mo246a(c7890Lc0, entry.getValue());
        }
        c7890Lc0.m5048x();
    }
}
