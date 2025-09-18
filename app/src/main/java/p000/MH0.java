package p000;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class MH0 {

    /* renamed from: a */
    public final SparseArray f7078a = new SparseArray();

    /* renamed from: b */
    public final SparseArray f7079b = new SparseArray();

    /* renamed from: c */
    public final SparseArray f7080c = new SparseArray();

    /* renamed from: a */
    public final synchronized boolean m5288a(int i, int i2, int i3) {
        boolean z;
        R00 r00 = (R00) this.f7078a.get(i);
        if (r00 != null) {
            m5289b(r00);
            r00.f9910k = i3;
            m5296i(i2, r00);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized void m5289b(R00 r00) {
        try {
            Integer num = (Integer) this.f7079b.get(r00.f9903d);
            if (num != null) {
                this.f7079b.remove(r00.f9903d);
                ArrayList arrayList = (ArrayList) this.f7080c.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(r00);
                    }
                    if (arrayList.size() == 0) {
                        this.f7080c.remove(num.intValue());
                    }
                }
            }
            if (r00.f9904e != null) {
                UiThreadUtil.runOnUiThread(new O00(1, r00));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m5290c() {
        this.f7078a.clear();
        this.f7079b.clear();
        this.f7080c.clear();
    }

    /* renamed from: d */
    public final synchronized void m5291d(int i) {
        R00 r00 = (R00) this.f7078a.get(i);
        if (r00 != null) {
            m5289b(r00);
            this.f7078a.remove(i);
        }
    }

    /* renamed from: e */
    public final synchronized R00 m5292e(int i) {
        return (R00) this.f7078a.get(i);
    }

    /* renamed from: f */
    public final synchronized ArrayList m5293f(View view) {
        return m5294g(view.getId());
    }

    /* renamed from: g */
    public final synchronized ArrayList m5294g(int i) {
        return (ArrayList) this.f7080c.get(i);
    }

    /* renamed from: h */
    public final synchronized void m5295h(R00 r00) {
        this.f7078a.put(r00.f9903d, r00);
    }

    /* renamed from: i */
    public final synchronized void m5296i(int i, R00 r00) {
        try {
            if (this.f7079b.get(r00.f9903d) != null) {
                throw new IllegalStateException(("Handler " + r00 + " already attached").toString());
            }
            this.f7079b.put(r00.f9903d, Integer.valueOf(i));
            Object obj = this.f7080c.get(i);
            if (obj == null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(r00);
                this.f7080c.put(i, arrayList);
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
