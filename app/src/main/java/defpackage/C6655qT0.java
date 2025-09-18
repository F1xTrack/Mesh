package defpackage;

import com.huawei.hms.actions.SearchIntents;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: qT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6655qT0 implements F61, E61 {
    public static final TreeMap i = new TreeMap();
    public final int a;
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    public final int[] g;
    public int h;

    public C6655qT0(int i2) {
        this.a = i2;
        int i3 = i2 + 1;
        this.g = new int[i3];
        this.c = new long[i3];
        this.d = new double[i3];
        this.e = new String[i3];
        this.f = new byte[i3][];
    }

    public static final C6655qT0 a(int i2, String str) {
        O90.f(str, SearchIntents.EXTRA_QUERY);
        TreeMap treeMap = i;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (entryCeilingEntry == null) {
                C6655qT0 c6655qT0 = new C6655qT0(i2);
                c6655qT0.b = str;
                c6655qT0.h = i2;
                return c6655qT0;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            C6655qT0 c6655qT02 = (C6655qT0) entryCeilingEntry.getValue();
            c6655qT02.getClass();
            c6655qT02.b = str;
            c6655qT02.h = i2;
            return c6655qT02;
        }
    }

    @Override // defpackage.E61
    public final void E(int i2, long j) {
        this.g[i2] = 2;
        this.c[i2] = j;
    }

    @Override // defpackage.E61
    public final void I(int i2, byte[] bArr) {
        this.g[i2] = 5;
        this.f[i2] = bArr;
    }

    @Override // defpackage.E61
    public final void V(int i2) {
        this.g[i2] = 1;
    }

    @Override // defpackage.E61
    public final void d(int i2, String str) {
        O90.f(str, "value");
        this.g[i2] = 4;
        this.e[i2] = str;
    }

    @Override // defpackage.E61
    public final void h(int i2, double d) {
        this.g[i2] = 3;
        this.d[i2] = d;
    }

    @Override // defpackage.F61
    public final String m() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.F61
    public final void n(E61 e61) {
        int i2 = this.h;
        if (1 > i2) {
            return;
        }
        int i3 = 1;
        while (true) {
            int i4 = this.g[i3];
            if (i4 == 1) {
                e61.V(i3);
            } else if (i4 == 2) {
                e61.E(i3, this.c[i3]);
            } else if (i4 == 3) {
                e61.h(i3, this.d[i3]);
            } else if (i4 == 4) {
                String str = this.e[i3];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                e61.d(i3, str);
            } else if (i4 == 5) {
                byte[] bArr = this.f[i3];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                e61.I(i3, bArr);
            }
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void release() {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                O90.e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
