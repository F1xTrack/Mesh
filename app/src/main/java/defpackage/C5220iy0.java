package defpackage;

import java.util.Iterator;

/* renamed from: iy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5220iy0 extends AbstractC7735w8 {
    public final L5 a;
    public final int b;

    public C5220iy0(int i, L5 l5) {
        this.a = l5;
        this.b = i;
    }

    @Override // defpackage.AbstractC7735w8
    public final int b() {
        return 1;
    }

    @Override // defpackage.AbstractC7735w8
    public final void d(int i, L5 l5) {
        throw new IllegalStateException();
    }

    @Override // defpackage.AbstractC7735w8
    public final Object get(int i) {
        if (i == this.b) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.AbstractC7735w8, java.lang.Iterable
    public final Iterator iterator() {
        return new C4253hy0(0, this);
    }
}
