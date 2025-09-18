package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: s8 */
/* loaded from: classes.dex */
public final class C6972s8 implements Iterator {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public C6972s8(int i) {
        this.a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objI;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        switch (this.d) {
            case 0:
                objI = ((C7925x8) this.e).i(i);
                break;
            case 1:
                objI = ((C7925x8) this.e).m(i);
                break;
            default:
                objI = ((C8) this.e).b[i];
                break;
        }
        this.b++;
        this.c = true;
        return objI;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        int i = this.b - 1;
        this.b = i;
        switch (this.d) {
            case 0:
                ((C7925x8) this.e).k(i);
                break;
            case 1:
                ((C7925x8) this.e).k(i);
                break;
            default:
                ((C8) this.e).k(i);
                break;
        }
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6972s8(C7925x8 c7925x8, int i) {
        this(c7925x8.c);
        this.d = i;
        switch (i) {
            case 1:
                this.e = c7925x8;
                this(c7925x8.c);
                break;
            default:
                this.e = c7925x8;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6972s8(C8 c8) {
        this(c8.c);
        this.d = 2;
        this.e = c8;
    }
}
