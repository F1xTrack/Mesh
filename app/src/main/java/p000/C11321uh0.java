package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: uh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11321uh0 implements L20 {

    /* renamed from: b */
    public final Map f43793b;

    /* renamed from: c */
    public volatile Map f43794c;

    public C11321uh0(Map map) {
        this.f43793b = Collections.unmodifiableMap(map);
    }

    @Override // p000.L20
    /* renamed from: a */
    public final Map mo4869a() {
        if (this.f43794c == null) {
            synchronized (this) {
                try {
                    if (this.f43794c == null) {
                        this.f43794c = Collections.unmodifiableMap(m25219b());
                    }
                } finally {
                }
            }
        }
        return this.f43794c;
    }

    /* renamed from: b */
    public final HashMap m25219b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f43793b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C11193th0) list.get(i)).f43221a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11321uh0) {
            return this.f43793b.equals(((C11321uh0) obj).f43793b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43793b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f43793b + '}';
    }
}
