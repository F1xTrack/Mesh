package defpackage;

import java.util.Map;

/* renamed from: lj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5748lj0 implements Map.Entry {
    public final /* synthetic */ int a;
    public final Object b;
    public final boolean c;
    public Object d;
    public int e;
    public Map.Entry f;
    public Map.Entry g;
    public Map.Entry h;
    public Map.Entry i;
    public Map.Entry j;

    public /* synthetic */ C5748lj0(boolean z, int i) {
        this.a = i;
        this.b = null;
        this.c = z;
        this.j = this;
        this.i = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = this.b;
                    if (obj2 == null) {
                        if (entry.getKey() != null) {
                        }
                    } else if (!obj2.equals(entry.getKey())) {
                    }
                    Object obj3 = this.d;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                        }
                    } else if (obj3.equals(entry.getValue())) {
                    }
                }
                break;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    Object obj4 = this.b;
                    if (obj4 == null) {
                        if (entry2.getKey() != null) {
                        }
                    } else if (!obj4.equals(entry2.getKey())) {
                    }
                    Object obj5 = this.d;
                    if (obj5 == null) {
                        if (entry2.getValue() == null) {
                        }
                    } else if (obj5.equals(entry2.getValue())) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        switch (this.a) {
        }
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        switch (this.a) {
            case 0:
                Object obj = this.b;
                int iHashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.d;
                return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
            default:
                Object obj3 = this.b;
                int iHashCode2 = obj3 == null ? 0 : obj3.hashCode();
                Object obj4 = this.d;
                return (obj4 != null ? obj4.hashCode() : 0) ^ iHashCode2;
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        switch (this.a) {
            case 0:
                if (obj == null && !this.c) {
                    throw new NullPointerException("value == null");
                }
                Object obj2 = this.d;
                this.d = obj;
                return obj2;
            default:
                if (obj == null && !this.c) {
                    throw new NullPointerException("value == null");
                }
                Object obj3 = this.d;
                this.d = obj;
                return obj3;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return this.b + ContainerUtils.KEY_VALUE_DELIMITER + this.d;
            default:
                return this.b + ContainerUtils.KEY_VALUE_DELIMITER + this.d;
        }
    }

    public C5748lj0(boolean z, C5748lj0 c5748lj0, Object obj, C5748lj0 c5748lj02, C5748lj0 c5748lj03) {
        this.a = 0;
        this.f = c5748lj0;
        this.b = obj;
        this.c = z;
        this.e = 1;
        this.i = c5748lj02;
        this.j = c5748lj03;
        c5748lj03.i = this;
        c5748lj02.j = this;
    }

    public C5748lj0(boolean z, C5748lj0 c5748lj0, Object obj, C5748lj0 c5748lj02, C5748lj0 c5748lj03, byte b) {
        this.a = 1;
        this.f = c5748lj0;
        this.b = obj;
        this.c = z;
        this.e = 1;
        this.i = c5748lj02;
        this.j = c5748lj03;
        c5748lj03.i = this;
        c5748lj02.j = this;
    }
}
