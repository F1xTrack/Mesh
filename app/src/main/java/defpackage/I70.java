package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class I70 {
    public Object[] a;
    public int b;
    public boolean c;

    public I70(int i) {
        AbstractC3588eT1.b(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public static int f(int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        g(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void b(Object... objArr) {
        int length = objArr.length;
        AbstractC3353dE1.a(length, objArr);
        g(this.b + length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public abstract I70 c(Object obj);

    public void d(Object obj) {
        a(obj);
    }

    public final void e(List list) {
        if (list instanceof Collection) {
            List list2 = list;
            g(list2.size() + this.b);
            if (list2 instanceof J70) {
                this.b = ((J70) list2).d(this.b, this.a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void g(int i) {
        Object[] objArr = this.a;
        if (objArr.length < i) {
            this.a = Arrays.copyOf(objArr, f(objArr.length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }
}
