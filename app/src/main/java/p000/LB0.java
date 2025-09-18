package p000;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class LB0 implements Handler.Callback {

    /* renamed from: a */
    public final C6224jE f6535a;

    /* renamed from: b */
    public final QQ0 f6536b;

    /* renamed from: f */
    public C6602pC f6540f;

    /* renamed from: g */
    public boolean f6541g;

    /* renamed from: h */
    public boolean f6542h;

    /* renamed from: i */
    public boolean f6543i;

    /* renamed from: e */
    public final TreeMap f6539e = new TreeMap();

    /* renamed from: d */
    public final Handler f6538d = AbstractC7485Dh1.m1829n(this);

    /* renamed from: c */
    public final C0449H7 f6537c = new C0449H7(1);

    public LB0(C6602pC c6602pC, QQ0 qq0, C6224jE c6224jE) {
        this.f6540f = c6602pC;
        this.f6536b = qq0;
        this.f6535a = c6224jE;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f6543i) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        JB0 jb0 = (JB0) message.obj;
        long j = jb0.f5374a;
        TreeMap treeMap = this.f6539e;
        long j2 = jb0.f5375b;
        Long l = (Long) treeMap.get(Long.valueOf(j2));
        if (l == null || l.longValue() > j) {
            treeMap.put(Long.valueOf(j2), Long.valueOf(j));
        }
        return true;
    }
}
