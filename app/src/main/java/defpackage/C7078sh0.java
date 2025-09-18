package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: sh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7078sh0 {
    public static final Map d;
    public boolean a = true;
    public Map b = d;
    public boolean c = true;

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
            map.put("User-Agent", Collections.singletonList(new C7269th0(property)));
        }
        d = Collections.unmodifiableMap(map);
    }

    public final void a(String str, String str2) {
        C7269th0 c7269th0 = new C7269th0(str2);
        if (!this.c || !"User-Agent".equalsIgnoreCase(str)) {
            b();
            List arrayList = (List) this.b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.b.put(str, arrayList);
            }
            arrayList.add(c7269th0);
            return;
        }
        b();
        List arrayList2 = (List) this.b.get(str);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            this.b.put(str, arrayList2);
        }
        arrayList2.clear();
        arrayList2.add(c7269th0);
        if (this.c && "User-Agent".equalsIgnoreCase(str)) {
            this.c = false;
        }
    }

    public final void b() {
        if (this.a) {
            this.a = false;
            HashMap map = new HashMap(this.b.size());
            for (Map.Entry entry : this.b.entrySet()) {
                map.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            this.b = map;
        }
    }
}
