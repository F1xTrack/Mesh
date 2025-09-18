package defpackage;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: u8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7354u8 implements Iterator, Map.Entry {
    public int a;
    public int b = -1;
    public boolean c;
    public final /* synthetic */ C7925x8 d;

    public C7354u8(C7925x8 c7925x8) {
        this.d = c7925x8;
        this.a = c7925x8.c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.b;
        C7925x8 c7925x8 = this.d;
        Object objI = c7925x8.i(i);
        if (key != objI && (key == null || !key.equals(objI))) {
            return false;
        }
        Object value = entry.getValue();
        Object objM = c7925x8.m(this.b);
        return value == objM || (value != null && value.equals(objM));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.c) {
            return this.d.i(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.c) {
            return this.d.m(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.b;
        C7925x8 c7925x8 = this.d;
        Object objI = c7925x8.i(i);
        Object objM = c7925x8.m(this.b);
        return (objI == null ? 0 : objI.hashCode()) ^ (objM != null ? objM.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b++;
        this.c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        this.d.k(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.l(this.b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + ContainerUtils.KEY_VALUE_DELIMITER + getValue();
    }
}
