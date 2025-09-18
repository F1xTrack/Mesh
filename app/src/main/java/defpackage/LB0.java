package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class LB0 implements Handler.Callback {
    public final C5272jE a;
    public final QQ0 b;
    public C6412pC f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final TreeMap e = new TreeMap();
    public final Handler d = AbstractC0277Dh1.n(this);
    public final H7 c = new H7(1);

    public LB0(C6412pC c6412pC, QQ0 qq0, C5272jE c5272jE) {
        this.f = c6412pC;
        this.b = qq0;
        this.a = c5272jE;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.i) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        JB0 jb0 = (JB0) message.obj;
        long j = jb0.a;
        TreeMap treeMap = this.e;
        long j2 = jb0.b;
        Long l = (Long) treeMap.get(Long.valueOf(j2));
        if (l == null || l.longValue() > j) {
            treeMap.put(Long.valueOf(j2), Long.valueOf(j));
        }
        return true;
    }
}
