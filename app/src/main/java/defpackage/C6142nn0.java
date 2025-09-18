package defpackage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: nn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6142nn0 extends AbstractC7067sd1 {
    public final C7830wd1 a;
    public final /* synthetic */ C7879wu b;

    public C6142nn0(C7879wu c7879wu, C3504e20 c3504e20, Type type, AbstractC7067sd1 abstractC7067sd1, Type type2, AbstractC7067sd1 abstractC7067sd12) {
        this.b = c7879wu;
        new C7830wd1(c3504e20, abstractC7067sd1, type);
        this.a = new C7830wd1(c3504e20, abstractC7067sd12, type2);
    }

    @Override // defpackage.AbstractC7067sd1
    public final void a(C0885Lc0 c0885Lc0, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            c0885Lc0.J();
            return;
        }
        this.b.getClass();
        C7830wd1 c7830wd1 = this.a;
        c0885Lc0.o();
        for (Map.Entry entry : map.entrySet()) {
            c0885Lc0.A(String.valueOf(entry.getKey()));
            c7830wd1.a(c0885Lc0, entry.getValue());
        }
        c0885Lc0.x();
    }
}
