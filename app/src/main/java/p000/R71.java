package p000;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class R71 {

    /* renamed from: b */
    public static final ArrayList f10019b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f10020a;

    public R71(Handler handler) {
        this.f10020a = handler;
    }

    /* renamed from: b */
    public static Q71 m6903b() {
        Q71 q71;
        ArrayList arrayList = f10019b;
        synchronized (arrayList) {
            try {
                q71 = arrayList.isEmpty() ? new Q71() : (Q71) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return q71;
    }

    /* renamed from: a */
    public final Q71 m6904a(int i, Object obj) {
        Q71 q71M6903b = m6903b();
        q71M6903b.f9486a = this.f10020a.obtainMessage(i, obj);
        return q71M6903b;
    }

    /* renamed from: c */
    public final boolean m6905c(Runnable runnable) {
        return this.f10020a.post(runnable);
    }

    /* renamed from: d */
    public final void m6906d(int i) {
        YN1.m9278c(i != 0);
        this.f10020a.removeMessages(i);
    }

    /* renamed from: e */
    public final boolean m6907e(int i) {
        return this.f10020a.sendEmptyMessage(i);
    }
}
