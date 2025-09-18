package p000;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class CA0 {

    /* renamed from: d */
    public static final ArrayList f1232d = new ArrayList();

    /* renamed from: a */
    public Object f1233a;

    /* renamed from: b */
    public Q51 f1234b;

    /* renamed from: c */
    public CA0 f1235c;

    /* renamed from: a */
    public static CA0 m1000a(Q51 q51, Object obj) {
        ArrayList arrayList = f1232d;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                if (size <= 0) {
                    CA0 ca0 = new CA0();
                    ca0.f1233a = obj;
                    ca0.f1234b = q51;
                    return ca0;
                }
                CA0 ca02 = (CA0) arrayList.remove(size - 1);
                ca02.f1233a = obj;
                ca02.f1234b = q51;
                ca02.f1235c = null;
                return ca02;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
