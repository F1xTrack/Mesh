package io.sentry.rrweb;

import java.util.Arrays;

/* renamed from: io.sentry.rrweb.b */
/* loaded from: classes2.dex */
public abstract class AbstractC6131b {

    /* renamed from: a */
    public EnumC6132c f34560a;

    /* renamed from: b */
    public long f34561b = System.currentTimeMillis();

    public AbstractC6131b(EnumC6132c enumC6132c) {
        this.f34560a = enumC6132c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6131b)) {
            return false;
        }
        AbstractC6131b abstractC6131b = (AbstractC6131b) obj;
        return this.f34561b == abstractC6131b.f34561b && this.f34560a == abstractC6131b.f34560a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34560a, Long.valueOf(this.f34561b)});
    }
}
