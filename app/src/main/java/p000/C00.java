package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class C00 implements Iterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public Object f1138a;

    /* renamed from: b */
    public int f1139b = -2;

    /* renamed from: c */
    public final /* synthetic */ C4056fU f1140c;

    public C00(C4056fU c4056fU) {
        this.f1140c = c4056fU;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nZ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Vg0, mZ] */
    /* renamed from: a */
    public final void m945a() {
        Object objInvoke;
        int i = this.f1139b;
        C4056fU c4056fU = this.f1140c;
        if (i == -2) {
            objInvoke = ((AbstractC8418Vg0) c4056fU.f27215b).invoke();
        } else {
            ?? r0 = c4056fU.f27216c;
            Object obj = this.f1138a;
            O90.m5965c(obj);
            objInvoke = r0.invoke(obj);
        }
        this.f1138a = objInvoke;
        this.f1139b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1139b < 0) {
            m945a();
        }
        return this.f1139b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1139b < 0) {
            m945a();
        }
        if (this.f1139b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f1138a;
        O90.m5966d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f1139b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
