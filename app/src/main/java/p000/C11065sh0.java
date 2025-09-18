package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: sh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11065sh0 {

    /* renamed from: d */
    public static final Map f42549d;

    /* renamed from: a */
    public boolean f42550a = true;

    /* renamed from: b */
    public Map f42551b = f42549d;

    /* renamed from: c */
    public boolean f42552c = true;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            property = sb.toString();
        }
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            map.put("User-Agent", Collections.singletonList(new C11193th0(property)));
        }
        f42549d = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final void m24769a(String str, String str2) {
        C11193th0 c11193th0 = new C11193th0(str2);
        if (!this.f42552c || !"User-Agent".equalsIgnoreCase(str)) {
            m24770b();
            List arrayList = (List) this.f42551b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f42551b.put(str, arrayList);
            }
            arrayList.add(c11193th0);
            return;
        }
        m24770b();
        List arrayList2 = (List) this.f42551b.get(str);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            this.f42551b.put(str, arrayList2);
        }
        arrayList2.clear();
        arrayList2.add(c11193th0);
        if (this.f42552c && "User-Agent".equalsIgnoreCase(str)) {
            this.f42552c = false;
        }
    }

    /* renamed from: b */
    public final void m24770b() {
        if (this.f42550a) {
            this.f42550a = false;
            HashMap map = new HashMap(this.f42551b.size());
            for (Map.Entry entry : this.f42551b.entrySet()) {
                map.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            this.f42551b = map;
        }
    }
}
