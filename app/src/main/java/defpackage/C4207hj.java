package defpackage;

import java.util.LinkedList;

/* renamed from: hj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4207hj {
    public final int a;
    public final int b;
    public final LinkedList c;
    public int d;

    public C4207hj(int i, int i2, int i3) {
        ML1.e(i > 0);
        ML1.e(i2 >= 0);
        ML1.e(i3 >= 0);
        this.a = i;
        this.b = i2;
        this.c = new LinkedList();
        this.d = i3;
    }

    public Object a() {
        return this.c.poll();
    }
}
