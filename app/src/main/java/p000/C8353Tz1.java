package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: Tz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8353Tz1 extends AbstractC10974rz1 {

    /* renamed from: c */
    public final transient AbstractC10078kz1 f11610c;

    /* renamed from: d */
    public final transient Object[] f11611d;

    /* renamed from: e */
    public final transient int f11612e;

    public C8353Tz1(AbstractC10078kz1 abstractC10078kz1, Object[] objArr, int i) {
        this.f11610c = abstractC10078kz1;
        this.f11611d = objArr;
        this.f11612e = i;
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: b */
    public final int mo3657b(Object[] objArr) {
        return mo6191i().mo3657b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f11610c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo6191i().listIterator(0);
    }

    @Override // p000.AbstractC10974rz1
    /* renamed from: r */
    public final AbstractC8091Oy1 mo7835r() {
        return new C8093Oz1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11612e;
    }
}
