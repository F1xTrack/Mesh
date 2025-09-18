package p000;

import java.util.LinkedList;

/* renamed from: hj */
/* loaded from: classes.dex */
public class C4197hj {

    /* renamed from: a */
    public final int f28545a;

    /* renamed from: b */
    public final int f28546b;

    /* renamed from: c */
    public final LinkedList f28547c;

    /* renamed from: d */
    public int f28548d;

    public C4197hj(int i, int i2, int i3) {
        ML1.m5338e(i > 0);
        ML1.m5338e(i2 >= 0);
        ML1.m5338e(i3 >= 0);
        this.f28545a = i;
        this.f28546b = i2;
        this.f28547c = new LinkedList();
        this.f28548d = i3;
    }

    /* renamed from: a */
    public Object m18851a() {
        return this.f28547c.poll();
    }
}
