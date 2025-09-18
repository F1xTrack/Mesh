package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class CA0 {
    public static final ArrayList d = new ArrayList();
    public Object a;
    public Q51 b;
    public CA0 c;

    public static CA0 a(Q51 q51, Object obj) {
        ArrayList arrayList = d;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                if (size <= 0) {
                    CA0 ca0 = new CA0();
                    ca0.a = obj;
                    ca0.b = q51;
                    return ca0;
                }
                CA0 ca02 = (CA0) arrayList.remove(size - 1);
                ca02.a = obj;
                ca02.b = q51;
                ca02.c = null;
                return ca02;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
