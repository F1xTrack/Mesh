package defpackage;

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
    public static C22 e;
    public int a;
    public final Object b;
    public final Object c;
    public Object d;

    public C22(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new FY1(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public static synchronized C22 e(Context context) {
        try {
            if (e == null) {
                e = new C22(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public Object a() {
        Object objRemoveLast;
        synchronized (this.c) {
            objRemoveLast = ((ArrayDeque) this.b).removeLast();
        }
        return objRemoveLast;
    }

    public void b(Object obj) {
        Object objA;
        synchronized (this.c) {
            try {
                objA = ((ArrayDeque) this.b).size() >= this.a ? a() : null;
                ((ArrayDeque) this.b).addFirst(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C2199an) this.d) == null || objA == null) {
            return;
        }
        ((InterfaceC3903g70) objA).close();
    }

    public int c() {
        int i = this.a;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public boolean d() {
        boolean zIsEmpty;
        synchronized (this.c) {
            zIsEmpty = ((ArrayDeque) this.b).isEmpty();
        }
        return zIsEmpty;
    }

    public synchronized C3892g32 f(C5802m02 c5802m02) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(c5802m02.toString());
            }
            if (!((FY1) this.d).d(c5802m02)) {
                FY1 fy1 = new FY1(this);
                this.d = fy1;
                fy1.d(c5802m02);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c5802m02.b.a;
    }

    public C22(int i, C2199an c2199an) {
        this.c = new Object();
        this.a = i;
        this.b = new ArrayDeque(i);
        this.d = c2199an;
    }

    public C22(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.b = str;
        this.a = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = listUnmodifiableList;
        this.d = bArr;
    }

    public C22(String str, String str2, QQ0 qq0, int i) {
        boolean z = true;
        YN1.c(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z = false;
        }
        YN1.c(z);
        this.b = str;
        this.c = str2;
        this.d = qq0;
        this.a = i;
    }
}
