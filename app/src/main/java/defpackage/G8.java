package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class G8 extends AbstractC7067sd1 {
    public static final E8 c = new E8(0);
    public final /* synthetic */ int a = 0;
    public final C7830wd1 b;

    public G8(C3504e20 c3504e20, AbstractC7067sd1 abstractC7067sd1, Class cls) {
        this.b = new C7830wd1(c3504e20, abstractC7067sd1, cls);
    }

    @Override // defpackage.AbstractC7067sd1
    public final void a(C0885Lc0 c0885Lc0, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        switch (this.a) {
            case 0:
                if (obj == null) {
                    c0885Lc0.J();
                    break;
                } else {
                    c0885Lc0.n();
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.b.a(c0885Lc0, Array.get(obj, i));
                    }
                    c0885Lc0.w();
                    break;
                }
            default:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    c0885Lc0.J();
                    break;
                } else {
                    c0885Lc0.n();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        this.b.a(c0885Lc0, it.next());
                    }
                    c0885Lc0.w();
                    break;
                }
        }
    }

    public G8(C3504e20 c3504e20, AbstractC7067sd1 abstractC7067sd1, Type type) {
        this.b = new C7830wd1(c3504e20, abstractC7067sd1, type);
    }
}
