package defpackage;

import android.content.Context;

/* renamed from: td, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7256td extends AbstractC3342dB {
    public final Context a;
    public final InterfaceC6541pt b;
    public final InterfaceC6541pt c;
    public final String d;

    public C7256td(Context context, InterfaceC6541pt interfaceC6541pt, InterfaceC6541pt interfaceC6541pt2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (interfaceC6541pt == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = interfaceC6541pt;
        if (interfaceC6541pt2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = interfaceC6541pt2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3342dB)) {
            return false;
        }
        AbstractC3342dB abstractC3342dB = (AbstractC3342dB) obj;
        if (this.a.equals(((C7256td) abstractC3342dB).a)) {
            C7256td c7256td = (C7256td) abstractC3342dB;
            if (this.b.equals(c7256td.b) && this.c.equals(c7256td.c) && this.d.equals(c7256td.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return AbstractC1705Vq.l(sb, this.d, "}");
    }
}
