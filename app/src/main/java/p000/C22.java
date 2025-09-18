package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class C22 {

    /* renamed from: e */
    public static C22 f1148e;

    /* renamed from: a */
    public int f1149a;

    /* renamed from: b */
    public final Object f1150b;

    /* renamed from: c */
    public final Object f1151c;

    /* renamed from: d */
    public Object f1152d;

    public C22(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f1152d = new FY1(this);
        this.f1149a = 1;
        this.f1151c = scheduledExecutorService;
        this.f1150b = context.getApplicationContext();
    }

    /* renamed from: e */
    public static synchronized C22 m952e(Context context) {
        try {
            if (f1148e == null) {
                f1148e = new C22(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1148e;
    }

    /* renamed from: a */
    public Object m953a() {
        Object objRemoveLast;
        synchronized (this.f1151c) {
            objRemoveLast = ((ArrayDeque) this.f1150b).removeLast();
        }
        return objRemoveLast;
    }

    /* renamed from: b */
    public void mo954b(Object obj) {
        Object objM953a;
        synchronized (this.f1151c) {
            try {
                objM953a = ((ArrayDeque) this.f1150b).size() >= this.f1149a ? m953a() : null;
                ((ArrayDeque) this.f1150b).addFirst(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C1686an) this.f1152d) == null || objM953a == null) {
            return;
        }
        ((InterfaceC9457g70) objM953a).close();
    }

    /* renamed from: c */
    public int m955c() {
        int i = this.f1149a;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    /* renamed from: d */
    public boolean m956d() {
        boolean zIsEmpty;
        synchronized (this.f1151c) {
            zIsEmpty = ((ArrayDeque) this.f1150b).isEmpty();
        }
        return zIsEmpty;
    }

    /* renamed from: f */
    public synchronized C9450g32 m957f(C10209m02 c10209m02) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(c10209m02.toString());
            }
            if (!((FY1) this.f1152d).m2671d(c10209m02)) {
                FY1 fy1 = new FY1(this);
                this.f1152d = fy1;
                fy1.m2671d(c10209m02);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c10209m02.f37389b.f10598a;
    }

    public C22(int i, C1686an c1686an) {
        this.f1151c = new Object();
        this.f1149a = i;
        this.f1150b = new ArrayDeque(i);
        this.f1152d = c1686an;
    }

    public C22(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f1150b = str;
        this.f1149a = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f1151c = listUnmodifiableList;
        this.f1152d = bArr;
    }

    public C22(String str, String str2, QQ0 qq0, int i) {
        boolean z = true;
        YN1.m9278c(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z = false;
        }
        YN1.m9278c(z);
        this.f1150b = str;
        this.f1151c = str2;
        this.f1152d = qq0;
        this.f1149a = i;
    }
}
