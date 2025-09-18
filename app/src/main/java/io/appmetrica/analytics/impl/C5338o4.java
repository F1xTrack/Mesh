package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o4 */
/* loaded from: classes2.dex */
public final class C5338o4 {

    /* renamed from: a */
    public final String f32315a;

    /* renamed from: b */
    public final Integer f32316b;

    /* renamed from: c */
    public final String f32317c;

    public C5338o4(String str, Integer num, String str2) {
        this.f32315a = str;
        this.f32316b = num;
        this.f32317c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5338o4.class != obj.getClass()) {
            return false;
        }
        C5338o4 c5338o4 = (C5338o4) obj;
        if (!this.f32315a.equals(c5338o4.f32315a)) {
            return false;
        }
        Integer num = this.f32316b;
        if (num == null ? c5338o4.f32316b != null : !num.equals(c5338o4.f32316b)) {
            return false;
        }
        String str = this.f32317c;
        String str2 = c5338o4.f32317c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f32315a.hashCode() * 31;
        Integer num = this.f32316b;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f32317c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
