package defpackage;

import androidx.core.util.Pools$SimplePool;

/* renamed from: Bk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130Bk1 {
    public static final Pools$SimplePool d = new Pools$SimplePool(20);
    public int a;
    public C7950xG0 b;
    public C7950xG0 c;

    public static C0130Bk1 a() {
        C0130Bk1 c0130Bk1 = (C0130Bk1) d.i();
        return c0130Bk1 == null ? new C0130Bk1() : c0130Bk1;
    }
}
