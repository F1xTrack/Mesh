package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class C00 implements Iterator, InterfaceC7451ue0 {
    public Object a;
    public int b = -2;
    public final /* synthetic */ C3780fU c;

    public C00(C3780fU c3780fU) {
        this.c = c3780fU;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nZ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Vg0, mZ] */
    public final void a() {
        Object objInvoke;
        int i = this.b;
        C3780fU c3780fU = this.c;
        if (i == -2) {
            objInvoke = ((AbstractC1676Vg0) c3780fU.b).invoke();
        } else {
            ?? r0 = c3780fU.c;
            Object obj = this.a;
            O90.c(obj);
            objInvoke = r0.invoke(obj);
        }
        this.a = objInvoke;
        this.b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < 0) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b < 0) {
            a();
        }
        if (this.b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.a;
        O90.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
