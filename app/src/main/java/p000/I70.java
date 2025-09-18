package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class I70 {

    /* renamed from: a */
    public Object[] f4700a;

    /* renamed from: b */
    public int f4701b;

    /* renamed from: c */
    public boolean f4702c;

    public I70(int i) {
        AbstractC9246eT1.m17997b(i, "initialCapacity");
        this.f4700a = new Object[i];
        this.f4701b = 0;
    }

    /* renamed from: f */
    public static int m3754f(int i, int i2) {
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

    /* renamed from: a */
    public final void m3755a(Object obj) {
        obj.getClass();
        m3760g(this.f4701b + 1);
        Object[] objArr = this.f4700a;
        int i = this.f4701b;
        this.f4701b = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: b */
    public final void m3756b(Object... objArr) {
        int length = objArr.length;
        AbstractC9088dE1.m17509a(length, objArr);
        m3760g(this.f4701b + length);
        System.arraycopy(objArr, 0, this.f4700a, this.f4701b, length);
        this.f4701b += length;
    }

    /* renamed from: c */
    public abstract I70 mo3757c(Object obj);

    /* renamed from: d */
    public void m3758d(Object obj) {
        m3755a(obj);
    }

    /* renamed from: e */
    public final void m3759e(List list) {
        if (list instanceof Collection) {
            List list2 = list;
            m3760g(list2.size() + this.f4701b);
            if (list2 instanceof J70) {
                this.f4701b = ((J70) list2).mo4160d(this.f4701b, this.f4700a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo3757c(it.next());
        }
    }

    /* renamed from: g */
    public final void m3760g(int i) {
        Object[] objArr = this.f4700a;
        if (objArr.length < i) {
            this.f4700a = Arrays.copyOf(objArr, m3754f(objArr.length, i));
            this.f4702c = false;
        } else if (this.f4702c) {
            this.f4700a = (Object[]) objArr.clone();
            this.f4702c = false;
        }
    }
}
