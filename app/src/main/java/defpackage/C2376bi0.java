package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bi0 */
/* loaded from: classes2.dex */
public final class C2376bi0 extends AbstractList implements RandomAccess, InterfaceC3632ei0 {
    public static final C6504pg1 b = new C6504pg1(new C2376bi0());
    public final ArrayList a;

    public C2376bi0() {
        this.a = new ArrayList();
    }

    @Override // defpackage.InterfaceC3632ei0
    public final AbstractC0596Hk X(int i) {
        AbstractC0596Hk c1919Yj0;
        ArrayList arrayList = this.a;
        Object obj = arrayList.get(i);
        if (obj instanceof AbstractC0596Hk) {
            c1919Yj0 = (AbstractC0596Hk) obj;
        } else if (obj instanceof String) {
            try {
                c1919Yj0 = new C1919Yj0(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c1919Yj0 = new C1919Yj0(bArr2);
        }
        if (c1919Yj0 != obj) {
            arrayList.set(i, c1919Yj0);
        }
        return c1919Yj0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.a.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.a.size(), collection);
    }

    @Override // defpackage.InterfaceC3632ei0
    public final void b0(C1919Yj0 c1919Yj0) {
        this.a.add(c1919Yj0);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.a;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0596Hk) {
            AbstractC0596Hk abstractC0596Hk = (AbstractC0596Hk) obj;
            str = abstractC0596Hk.z();
            if (abstractC0596Hk.r()) {
                arrayList.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = AbstractC8119y90.a;
            try {
                str = new String(bArr, "UTF-8");
                if (AbstractC2432c02.e(bArr, 0, bArr.length) == 0) {
                    arrayList.set(i, str);
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        }
        return str;
    }

    @Override // defpackage.InterfaceC3632ei0
    public final List n() {
        return Collections.unmodifiableList(this.a);
    }

    @Override // defpackage.InterfaceC3632ei0
    public final C6504pg1 o() {
        return new C6504pg1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.a.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof AbstractC0596Hk) {
            return ((AbstractC0596Hk) objRemove).z();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = AbstractC8119y90.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.a.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC0596Hk) {
            return ((AbstractC0596Hk) obj2).z();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = AbstractC8119y90.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    public C2376bi0(InterfaceC3632ei0 interfaceC3632ei0) {
        this.a = new ArrayList(interfaceC3632ei0.size());
        addAll(interfaceC3632ei0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC3632ei0) {
            collection = ((InterfaceC3632ei0) collection).n();
        }
        boolean zAddAll = this.a.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
