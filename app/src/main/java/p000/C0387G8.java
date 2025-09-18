package p000;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: G8 */
/* loaded from: classes.dex */
public final class C0387G8 extends AbstractC11058sd1 {

    /* renamed from: c */
    public static final C0261E8 f3595c = new C0261E8(0);

    /* renamed from: a */
    public final /* synthetic */ int f3596a = 0;

    /* renamed from: b */
    public final C11569wd1 f3597b;

    public C0387G8(C9189e20 c9189e20, AbstractC11058sd1 abstractC11058sd1, Class cls) {
        this.f3597b = new C11569wd1(c9189e20, abstractC11058sd1, cls);
    }

    @Override // p000.AbstractC11058sd1
    /* renamed from: a */
    public final void mo246a(C7890Lc0 c7890Lc0, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        switch (this.f3596a) {
            case 0:
                if (obj == null) {
                    c7890Lc0.m5034J();
                    break;
                } else {
                    c7890Lc0.m5044n();
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.f3597b.mo246a(c7890Lc0, Array.get(obj, i));
                    }
                    c7890Lc0.m5047w();
                    break;
                }
            default:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    c7890Lc0.m5034J();
                    break;
                } else {
                    c7890Lc0.m5044n();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        this.f3597b.mo246a(c7890Lc0, it.next());
                    }
                    c7890Lc0.m5047w();
                    break;
                }
        }
    }

    public C0387G8(C9189e20 c9189e20, AbstractC11058sd1 abstractC11058sd1, Type type) {
        this.f3597b = new C11569wd1(c9189e20, abstractC11058sd1, type);
    }
}
