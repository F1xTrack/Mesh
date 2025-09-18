package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class R71 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public R71(Handler handler) {
        this.a = handler;
    }

    public static Q71 b() {
        Q71 q71;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                q71 = arrayList.isEmpty() ? new Q71() : (Q71) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return q71;
    }

    public final Q71 a(int i, Object obj) {
        Q71 q71B = b();
        q71B.a = this.a.obtainMessage(i, obj);
        return q71B;
    }

    public final boolean c(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final void d(int i) {
        YN1.c(i != 0);
        this.a.removeMessages(i);
    }

    public final boolean e(int i) {
        return this.a.sendEmptyMessage(i);
    }
}
