package p000;

import com.huawei.hms.actions.SearchIntents;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: qT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10781qT0 implements F61, E61 {

    /* renamed from: i */
    public static final TreeMap f40882i = new TreeMap();

    /* renamed from: a */
    public final int f40883a;

    /* renamed from: b */
    public volatile String f40884b;

    /* renamed from: c */
    public final long[] f40885c;

    /* renamed from: d */
    public final double[] f40886d;

    /* renamed from: e */
    public final String[] f40887e;

    /* renamed from: f */
    public final byte[][] f40888f;

    /* renamed from: g */
    public final int[] f40889g;

    /* renamed from: h */
    public int f40890h;

    public C10781qT0(int i) {
        this.f40883a = i;
        int i2 = i + 1;
        this.f40889g = new int[i2];
        this.f40885c = new long[i2];
        this.f40886d = new double[i2];
        this.f40887e = new String[i2];
        this.f40888f = new byte[i2][];
    }

    /* renamed from: a */
    public static final C10781qT0 m24005a(int i, String str) {
        O90.m5968f(str, SearchIntents.EXTRA_QUERY);
        TreeMap treeMap = f40882i;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                C10781qT0 c10781qT0 = new C10781qT0(i);
                c10781qT0.f40884b = str;
                c10781qT0.f40890h = i;
                return c10781qT0;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            C10781qT0 c10781qT02 = (C10781qT0) entryCeilingEntry.getValue();
            c10781qT02.getClass();
            c10781qT02.f40884b = str;
            c10781qT02.f40890h = i;
            return c10781qT02;
        }
    }

    @Override // p000.E61
    /* renamed from: E */
    public final void mo2030E(int i, long j) {
        this.f40889g[i] = 2;
        this.f40885c[i] = j;
    }

    @Override // p000.E61
    /* renamed from: I */
    public final void mo2031I(int i, byte[] bArr) {
        this.f40889g[i] = 5;
        this.f40888f[i] = bArr;
    }

    @Override // p000.E61
    /* renamed from: V */
    public final void mo2032V(int i) {
        this.f40889g[i] = 1;
    }

    @Override // p000.E61
    /* renamed from: d */
    public final void mo2033d(int i, String str) {
        O90.m5968f(str, "value");
        this.f40889g[i] = 4;
        this.f40887e[i] = str;
    }

    @Override // p000.E61
    /* renamed from: h */
    public final void mo2034h(int i, double d) {
        this.f40889g[i] = 3;
        this.f40886d[i] = d;
    }

    @Override // p000.F61
    /* renamed from: m */
    public final String mo2492m() {
        String str = this.f40884b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p000.F61
    /* renamed from: n */
    public final void mo2493n(E61 e61) {
        int i = this.f40890h;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.f40889g[i2];
            if (i3 == 1) {
                e61.mo2032V(i2);
            } else if (i3 == 2) {
                e61.mo2030E(i2, this.f40885c[i2]);
            } else if (i3 == 3) {
                e61.mo2034h(i2, this.f40886d[i2]);
            } else if (i3 == 4) {
                String str = this.f40887e[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                e61.mo2033d(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.f40888f[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                e61.mo2031I(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void release() {
        TreeMap treeMap = f40882i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f40883a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                O90.m5967e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
