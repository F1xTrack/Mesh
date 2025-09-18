package p000;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.common.mapbuffer.WritableMapBuffer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: q0 */
/* loaded from: classes2.dex */
public class C6653q0 implements Iterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public final /* synthetic */ int f40479a;

    /* renamed from: b */
    public int f40480b;

    /* renamed from: c */
    public final Object f40481c;

    public /* synthetic */ C6653q0(int i, Object obj) {
        this.f40479a = i;
        this.f40481c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f40479a) {
            case 0:
                if (this.f40480b < ((AbstractC6859t0) this.f40481c).mo4090b()) {
                }
                break;
            case 1:
                if (this.f40480b < ((Object[]) this.f40481c).length) {
                }
                break;
            case 2:
                if (this.f40480b < ((L00) this.f40481c).getLength()) {
                }
                break;
            case 3:
                if (this.f40480b < ((ViewGroup) this.f40481c).getChildCount()) {
                }
                break;
            default:
                if (this.f40480b < ((WritableMapBuffer) this.f40481c).f17902a.size()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f40479a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f40480b;
                this.f40480b = i + 1;
                return ((AbstractC6859t0) this.f40481c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f40481c;
                    int i2 = this.f40480b;
                    this.f40480b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f40480b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                int i3 = this.f40480b;
                this.f40480b = i3 + 1;
                return ((L00) this.f40481c).get(i3);
            case 3:
                int i4 = this.f40480b;
                this.f40480b = i4 + 1;
                View childAt = ((ViewGroup) this.f40481c).getChildAt(i4);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            default:
                int i5 = this.f40480b;
                this.f40480b = i5 + 1;
                return new C10186lp1((WritableMapBuffer) this.f40481c, i5);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f40479a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                int i = this.f40480b - 1;
                this.f40480b = i;
                ((ViewGroup) this.f40481c).removeViewAt(i);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6653q0(L00 l00) {
        this.f40479a = 2;
        O90.m5968f(l00, "typedArray");
        this.f40481c = l00;
    }

    public C6653q0(Object[] objArr) {
        this.f40479a = 1;
        O90.m5968f(objArr, "array");
        this.f40481c = objArr;
    }
}
