package p000;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: u8 */
/* loaded from: classes.dex */
public final class C6930u8 implements Iterator, Map.Entry {

    /* renamed from: a */
    public int f43531a;

    /* renamed from: b */
    public int f43532b = -1;

    /* renamed from: c */
    public boolean f43533c;

    /* renamed from: d */
    public final /* synthetic */ C7119x8 f43534d;

    public C6930u8(C7119x8 c7119x8) {
        this.f43534d = c7119x8;
        this.f43531a = c7119x8.f6450c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f43533c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f43532b;
        C7119x8 c7119x8 = this.f43534d;
        Object objM4827i = c7119x8.m4827i(i);
        if (key != objM4827i && (key == null || !key.equals(objM4827i))) {
            return false;
        }
        Object value = entry.getValue();
        Object objM4831m = c7119x8.m4831m(this.f43532b);
        return value == objM4831m || (value != null && value.equals(objM4831m));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f43533c) {
            return this.f43534d.m4827i(this.f43532b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f43533c) {
            return this.f43534d.m4831m(this.f43532b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43532b < this.f43531a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f43533c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f43532b;
        C7119x8 c7119x8 = this.f43534d;
        Object objM4827i = c7119x8.m4827i(i);
        Object objM4831m = c7119x8.m4831m(this.f43532b);
        return (objM4827i == null ? 0 : objM4827i.hashCode()) ^ (objM4831m != null ? objM4831m.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f43532b++;
        this.f43533c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f43533c) {
            throw new IllegalStateException();
        }
        this.f43534d.mo4829k(this.f43532b);
        this.f43532b--;
        this.f43531a--;
        this.f43533c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f43533c) {
            return this.f43534d.mo4830l(this.f43532b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + ContainerUtils.KEY_VALUE_DELIMITER + getValue();
    }
}
