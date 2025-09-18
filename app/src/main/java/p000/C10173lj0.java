package p000;

import java.util.Map;

/* renamed from: lj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10173lj0 implements Map.Entry {

    /* renamed from: a */
    public final /* synthetic */ int f37263a;

    /* renamed from: b */
    public final Object f37264b;

    /* renamed from: c */
    public final boolean f37265c;

    /* renamed from: d */
    public Object f37266d;

    /* renamed from: e */
    public int f37267e;

    /* renamed from: f */
    public Map.Entry f37268f;

    /* renamed from: g */
    public Map.Entry f37269g;

    /* renamed from: h */
    public Map.Entry f37270h;

    /* renamed from: i */
    public Map.Entry f37271i;

    /* renamed from: j */
    public Map.Entry f37272j;

    public /* synthetic */ C10173lj0(boolean z, int i) {
        this.f37263a = i;
        this.f37264b = null;
        this.f37265c = z;
        this.f37272j = this;
        this.f37271i = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.f37263a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = this.f37264b;
                    if (obj2 == null) {
                        if (entry.getKey() != null) {
                        }
                    } else if (!obj2.equals(entry.getKey())) {
                    }
                    Object obj3 = this.f37266d;
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
                    Object obj4 = this.f37264b;
                    if (obj4 == null) {
                        if (entry2.getKey() != null) {
                        }
                    } else if (!obj4.equals(entry2.getKey())) {
                    }
                    Object obj5 = this.f37266d;
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
        switch (this.f37263a) {
        }
        return this.f37264b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        switch (this.f37263a) {
        }
        return this.f37266d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        switch (this.f37263a) {
            case 0:
                Object obj = this.f37264b;
                int iHashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.f37266d;
                return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
            default:
                Object obj3 = this.f37264b;
                int iHashCode2 = obj3 == null ? 0 : obj3.hashCode();
                Object obj4 = this.f37266d;
                return (obj4 != null ? obj4.hashCode() : 0) ^ iHashCode2;
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        switch (this.f37263a) {
            case 0:
                if (obj == null && !this.f37265c) {
                    throw new NullPointerException("value == null");
                }
                Object obj2 = this.f37266d;
                this.f37266d = obj;
                return obj2;
            default:
                if (obj == null && !this.f37265c) {
                    throw new NullPointerException("value == null");
                }
                Object obj3 = this.f37266d;
                this.f37266d = obj;
                return obj3;
        }
    }

    public final String toString() {
        switch (this.f37263a) {
            case 0:
                return this.f37264b + ContainerUtils.KEY_VALUE_DELIMITER + this.f37266d;
            default:
                return this.f37264b + ContainerUtils.KEY_VALUE_DELIMITER + this.f37266d;
        }
    }

    public C10173lj0(boolean z, C10173lj0 c10173lj0, Object obj, C10173lj0 c10173lj02, C10173lj0 c10173lj03) {
        this.f37263a = 0;
        this.f37268f = c10173lj0;
        this.f37264b = obj;
        this.f37265c = z;
        this.f37267e = 1;
        this.f37271i = c10173lj02;
        this.f37272j = c10173lj03;
        c10173lj03.f37271i = this;
        c10173lj02.f37272j = this;
    }

    public C10173lj0(boolean z, C10173lj0 c10173lj0, Object obj, C10173lj0 c10173lj02, C10173lj0 c10173lj03, byte b) {
        this.f37263a = 1;
        this.f37268f = c10173lj0;
        this.f37264b = obj;
        this.f37265c = z;
        this.f37267e = 1;
        this.f37271i = c10173lj02;
        this.f37272j = c10173lj03;
        c10173lj03.f37271i = this;
        c10173lj02.f37272j = this;
    }
}
