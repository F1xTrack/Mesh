package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: t21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7145t21 implements Iterator {
    public final /* synthetic */ int a;
    public int b = -1;
    public boolean c;
    public Iterator d;
    public final /* synthetic */ AbstractMap e;

    public /* synthetic */ C7145t21(AbstractMap abstractMap, int i) {
        this.a = i;
        this.e = abstractMap;
    }

    public Iterator a() {
        switch (this.a) {
            case 0:
                if (this.d == null) {
                    this.d = ((C5809m21) this.e).c.entrySet().iterator();
                }
                break;
            case 1:
                if (this.d == null) {
                    this.d = ((C6000n21) this.e).c.entrySet().iterator();
                }
                break;
            default:
                if (this.d == null) {
                    this.d = ((C6191o21) this.e).c.entrySet().iterator();
                }
                break;
        }
        return this.d;
    }

    public Iterator b() {
        if (this.d == null) {
            this.d = ((C5677lL1) this.e).c.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                int i = this.b + 1;
                C5809m21 c5809m21 = (C5809m21) this.e;
                if (i >= c5809m21.b.size()) {
                    return !c5809m21.c.isEmpty() && a().hasNext();
                }
                return true;
            case 1:
                return this.b + 1 < ((C6000n21) this.e).b.size() || a().hasNext();
            case 2:
                int i2 = this.b + 1;
                C6191o21 c6191o21 = (C6191o21) this.e;
                if (i2 >= c6191o21.b.size()) {
                    return !c6191o21.c.isEmpty() && a().hasNext();
                }
                return true;
            default:
                boolean z = true;
                int i3 = this.b + 1;
                C5677lL1 c5677lL1 = (C5677lL1) this.e;
                if (i3 >= c5677lL1.b) {
                    if (c5677lL1.c.isEmpty()) {
                        z = false;
                    } else if (!b().hasNext()) {
                        return false;
                    }
                }
                return z;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                this.c = true;
                int i = this.b + 1;
                this.b = i;
                C5809m21 c5809m21 = (C5809m21) this.e;
                return i < c5809m21.b.size() ? (Map.Entry) c5809m21.b.get(this.b) : (Map.Entry) a().next();
            case 1:
                this.c = true;
                int i2 = this.b + 1;
                this.b = i2;
                C6000n21 c6000n21 = (C6000n21) this.e;
                return i2 < c6000n21.b.size() ? (Map.Entry) c6000n21.b.get(this.b) : (Map.Entry) a().next();
            case 2:
                this.c = true;
                int i3 = this.b + 1;
                this.b = i3;
                C6191o21 c6191o21 = (C6191o21) this.e;
                return i3 < c6191o21.b.size() ? (Map.Entry) c6191o21.b.get(this.b) : (Map.Entry) a().next();
            default:
                this.c = true;
                int i4 = this.b + 1;
                this.b = i4;
                C5677lL1 c5677lL1 = (C5677lL1) this.e;
                return i4 < c5677lL1.b ? (C6822rL1) c5677lL1.a[i4] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.e;
        switch (this.a) {
            case 0:
                if (!this.c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.c = false;
                int i = C5809m21.g;
                C5809m21 c5809m21 = (C5809m21) abstractMap;
                c5809m21.b();
                if (this.b >= c5809m21.b.size()) {
                    a().remove();
                    return;
                }
                int i2 = this.b;
                this.b = i2 - 1;
                c5809m21.g(i2);
                return;
            case 1:
                if (!this.c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.c = false;
                int i3 = C6000n21.f;
                C6000n21 c6000n21 = (C6000n21) abstractMap;
                c6000n21.b();
                if (this.b >= c6000n21.b.size()) {
                    a().remove();
                    return;
                }
                int i4 = this.b;
                this.b = i4 - 1;
                c6000n21.f(i4);
                return;
            case 2:
                if (!this.c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.c = false;
                int i5 = C6191o21.g;
                C6191o21 c6191o21 = (C6191o21) abstractMap;
                c6191o21.b();
                if (this.b >= c6191o21.b.size()) {
                    a().remove();
                    return;
                }
                int i6 = this.b;
                this.b = i6 - 1;
                c6191o21.g(i6);
                return;
            default:
                if (!this.c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.c = false;
                int i7 = C5677lL1.g;
                C5677lL1 c5677lL1 = (C5677lL1) abstractMap;
                c5677lL1.i();
                int i8 = this.b;
                if (i8 >= c5677lL1.b) {
                    b().remove();
                    return;
                } else {
                    this.b = i8 - 1;
                    c5677lL1.f(i8);
                    return;
                }
        }
    }
}
