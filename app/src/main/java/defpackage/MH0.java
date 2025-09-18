package defpackage;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class MH0 {
    public final SparseArray a = new SparseArray();
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();

    public final synchronized boolean a(int i, int i2, int i3) {
        boolean z;
        R00 r00 = (R00) this.a.get(i);
        if (r00 != null) {
            b(r00);
            r00.k = i3;
            i(i2, r00);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void b(R00 r00) {
        try {
            Integer num = (Integer) this.b.get(r00.d);
            if (num != null) {
                this.b.remove(r00.d);
                ArrayList arrayList = (ArrayList) this.c.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(r00);
                    }
                    if (arrayList.size() == 0) {
                        this.c.remove(num.intValue());
                    }
                }
            }
            if (r00.e != null) {
                UiThreadUtil.runOnUiThread(new O00(1, r00));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
    }

    public final synchronized void d(int i) {
        R00 r00 = (R00) this.a.get(i);
        if (r00 != null) {
            b(r00);
            this.a.remove(i);
        }
    }

    public final synchronized R00 e(int i) {
        return (R00) this.a.get(i);
    }

    public final synchronized ArrayList f(View view) {
        return g(view.getId());
    }

    public final synchronized ArrayList g(int i) {
        return (ArrayList) this.c.get(i);
    }

    public final synchronized void h(R00 r00) {
        this.a.put(r00.d, r00);
    }

    public final synchronized void i(int i, R00 r00) {
        try {
            if (this.b.get(r00.d) != null) {
                throw new IllegalStateException(("Handler " + r00 + " already attached").toString());
            }
            this.b.put(r00.d, Integer.valueOf(i));
            Object obj = this.c.get(i);
            if (obj == null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(r00);
                this.c.put(i, arrayList);
            } else {
                synchronized (obj) {
                    ((ArrayList) obj).add(r00);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
