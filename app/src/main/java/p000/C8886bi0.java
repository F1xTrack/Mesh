package p000;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bi0 */
/* loaded from: classes2.dex */
public final class C8886bi0 extends AbstractList implements RandomAccess, InterfaceC9275ei0 {

    /* renamed from: b */
    public static final C10680pg1 f17124b = new C10680pg1(new C8886bi0());

    /* renamed from: a */
    public final ArrayList f17125a;

    public C8886bi0() {
        this.f17125a = new ArrayList();
    }

    @Override // p000.InterfaceC9275ei0
    /* renamed from: X */
    public final AbstractC0488Hk mo10485X(int i) {
        AbstractC0488Hk c8580Yj0;
        ArrayList arrayList = this.f17125a;
        Object obj = arrayList.get(i);
        if (obj instanceof AbstractC0488Hk) {
            c8580Yj0 = (AbstractC0488Hk) obj;
        } else if (obj instanceof String) {
            try {
                c8580Yj0 = new C8580Yj0(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c8580Yj0 = new C8580Yj0(bArr2);
        }
        if (c8580Yj0 != obj) {
            arrayList.set(i, c8580Yj0);
        }
        return c8580Yj0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f17125a.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f17125a.size(), collection);
    }

    @Override // p000.InterfaceC9275ei0
    /* renamed from: b0 */
    public final void mo10486b0(C8580Yj0 c8580Yj0) {
        this.f17125a.add(c8580Yj0);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f17125a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f17125a;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0488Hk) {
            AbstractC0488Hk abstractC0488Hk = (AbstractC0488Hk) obj;
            str = abstractC0488Hk.m3583z();
            if (abstractC0488Hk.mo3578r()) {
                arrayList.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = AbstractC11762y90.f46105a;
            try {
                str = new String(bArr, "UTF-8");
                if (AbstractC8924c02.m10557e(bArr, 0, bArr.length) == 0) {
                    arrayList.set(i, str);
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        }
        return str;
    }

    @Override // p000.InterfaceC9275ei0
    /* renamed from: n */
    public final List mo10487n() {
        return Collections.unmodifiableList(this.f17125a);
    }

    @Override // p000.InterfaceC9275ei0
    /* renamed from: o */
    public final C10680pg1 mo10488o() {
        return new C10680pg1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.f17125a.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof AbstractC0488Hk) {
            return ((AbstractC0488Hk) objRemove).m3583z();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = AbstractC11762y90.f46105a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.f17125a.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC0488Hk) {
            return ((AbstractC0488Hk) obj2).m3583z();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = AbstractC11762y90.f46105a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17125a.size();
    }

    public C8886bi0(InterfaceC9275ei0 interfaceC9275ei0) {
        this.f17125a = new ArrayList(interfaceC9275ei0.size());
        addAll(interfaceC9275ei0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC9275ei0) {
            collection = ((InterfaceC9275ei0) collection).mo10487n();
        }
        boolean zAddAll = this.f17125a.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
