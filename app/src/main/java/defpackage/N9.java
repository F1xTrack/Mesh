package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class N9 implements Iterable, InterfaceC7451ue0 {
    public AbstractC7735w8 a;

    public final boolean isEmpty() {
        return this.a.b() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
