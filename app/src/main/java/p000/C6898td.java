package p000;

import android.content.Context;

/* renamed from: td */
/* loaded from: classes.dex */
public final class C6898td extends AbstractC3912dB {

    /* renamed from: a */
    public final Context f43174a;

    /* renamed from: b */
    public final InterfaceC6645pt f43175b;

    /* renamed from: c */
    public final InterfaceC6645pt f43176c;

    /* renamed from: d */
    public final String f43177d;

    public C6898td(Context context, InterfaceC6645pt interfaceC6645pt, InterfaceC6645pt interfaceC6645pt2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f43174a = context;
        if (interfaceC6645pt == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f43175b = interfaceC6645pt;
        if (interfaceC6645pt2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f43176c = interfaceC6645pt2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f43177d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3912dB)) {
            return false;
        }
        AbstractC3912dB abstractC3912dB = (AbstractC3912dB) obj;
        if (this.f43174a.equals(((C6898td) abstractC3912dB).f43174a)) {
            C6898td c6898td = (C6898td) abstractC3912dB;
            if (this.f43175b.equals(c6898td.f43175b) && this.f43176c.equals(c6898td.f43176c) && this.f43177d.equals(c6898td.f43177d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f43174a.hashCode() ^ 1000003) * 1000003) ^ this.f43175b.hashCode()) * 1000003) ^ this.f43176c.hashCode()) * 1000003) ^ this.f43177d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f43174a);
        sb.append(", wallClock=");
        sb.append(this.f43175b);
        sb.append(", monotonicClock=");
        sb.append(this.f43176c);
        sb.append(", backendName=");
        return AbstractC1374Vq.m8593l(sb, this.f43177d, "}");
    }
}
