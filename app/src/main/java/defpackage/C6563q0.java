package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.common.mapbuffer.WritableMapBuffer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: q0 */
/* loaded from: classes2.dex */
public class C6563q0 implements Iterator, InterfaceC7451ue0 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ C6563q0(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((AbstractC7135t0) this.c).b()) {
                }
                break;
            case 1:
                if (this.b < ((Object[]) this.c).length) {
                }
                break;
            case 2:
                if (this.b < ((L00) this.c).getLength()) {
                }
                break;
            case 3:
                if (this.b < ((ViewGroup) this.c).getChildCount()) {
                }
                break;
            default:
                if (this.b < ((WritableMapBuffer) this.c).a.size()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.b;
                this.b = i + 1;
                return ((AbstractC7135t0) this.c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                int i3 = this.b;
                this.b = i3 + 1;
                return ((L00) this.c).get(i3);
            case 3:
                int i4 = this.b;
                this.b = i4 + 1;
                View childAt = ((ViewGroup) this.c).getChildAt(i4);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            default:
                int i5 = this.b;
                this.b = i5 + 1;
                return new C5767lp1((WritableMapBuffer) this.c, i5);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                int i = this.b - 1;
                this.b = i;
                ((ViewGroup) this.c).removeViewAt(i);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6563q0(L00 l00) {
        this.a = 2;
        O90.f(l00, "typedArray");
        this.c = l00;
    }

    public C6563q0(Object[] objArr) {
        this.a = 1;
        O90.f(objArr, "array");
        this.c = objArr;
    }
}
