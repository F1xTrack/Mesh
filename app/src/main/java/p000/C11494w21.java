package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: w21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11494w21 extends AbstractList implements RandomAccess {

    /* renamed from: a */
    public int f44659a;

    /* renamed from: b */
    public Object f44660b;

    /* renamed from: b */
    public static /* synthetic */ void m25547b(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.f44659a;
        if (i == 0) {
            this.f44660b = obj;
        } else if (i == 1) {
            this.f44660b = new Object[]{this.f44660b, obj};
        } else {
            Object[] objArr = (Object[]) this.f44660b;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.f44660b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f44659a] = obj;
        }
        this.f44659a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f44660b = null;
        this.f44659a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f44659a)) {
            return i2 == 1 ? this.f44660b : ((Object[]) this.f44660b)[i];
        }
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Index: ", ", Size: ");
        sbM26237n.append(this.f44659a);
        throw new IndexOutOfBoundsException(sbM26237n.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i = this.f44659a;
        if (i == 0) {
            return C11238u21.f43453b;
        }
        if (i == 1) {
            return new C11366v21(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        m25547b(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        Object obj;
        if (i < 0 || i >= (i2 = this.f44659a)) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Index: ", ", Size: ");
            sbM26237n.append(this.f44659a);
            throw new IndexOutOfBoundsException(sbM26237n.toString());
        }
        if (i2 == 1) {
            obj = this.f44660b;
            this.f44660b = null;
        } else {
            Object[] objArr = (Object[]) this.f44660b;
            Object obj2 = objArr[i];
            if (i2 == 2) {
                this.f44660b = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.f44659a - 1] = null;
            }
            obj = obj2;
        }
        this.f44659a--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        if (i < 0 || i >= (i2 = this.f44659a)) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Index: ", ", Size: ");
            sbM26237n.append(this.f44659a);
            throw new IndexOutOfBoundsException(sbM26237n.toString());
        }
        if (i2 == 1) {
            Object obj2 = this.f44660b;
            this.f44660b = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f44660b;
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44659a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i = this.f44659a;
        if (i >= 2) {
            Arrays.sort((Object[]) this.f44660b, 0, i, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            m25547b(4);
            throw null;
        }
        int length = objArr.length;
        int i = this.f44659a;
        if (i == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f44660b;
                return objArr2;
            }
            objArr[0] = this.f44660b;
        } else {
            if (length < i) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f44660b, i, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                m25547b(6);
                throw null;
            }
            if (i != 0) {
                System.arraycopy(this.f44660b, 0, objArr, 0, i);
            }
        }
        int i2 = this.f44659a;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f44659a)) {
            if (i2 == 0) {
                this.f44660b = obj;
            } else if (i2 == 1 && i == 0) {
                this.f44660b = new Object[]{obj, this.f44660b};
            } else {
                Object[] objArr = new Object[i2 + 1];
                if (i2 == 1) {
                    objArr[0] = this.f44660b;
                } else {
                    Object[] objArr2 = (Object[]) this.f44660b;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.f44659a - i);
                }
                objArr[i] = obj;
                this.f44660b = objArr;
            }
            this.f44659a++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Index: ", ", Size: ");
        sbM26237n.append(this.f44659a);
        throw new IndexOutOfBoundsException(sbM26237n.toString());
    }
}
