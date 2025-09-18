package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.sa */
/* loaded from: classes2.dex */
public final class C5444sa extends AbstractC4579J2 {

    /* renamed from: b */
    public final C5369pa f32563b;

    /* renamed from: c */
    public final C5369pa f32564c;

    /* renamed from: d */
    public final C5419ra f32565d;

    public C5444sa(int i, int i2, int i3) {
        this(i, new C5369pa(i2), new C5369pa(i3));
    }

    public C5444sa(int i, C5369pa c5369pa, C5369pa c5369pa2) {
        super(i);
        this.f32565d = new C5419ra();
        this.f32563b = c5369pa;
        this.f32564c = c5369pa2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4579J2, io.appmetrica.analytics.impl.InterfaceC5394qa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4575Im mo19520a(Map<String, String> map) {
        HashMap map2;
        int bytesTruncated;
        int i = 0;
        if (map != null) {
            map2 = new HashMap();
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(new Map.Entry[setEntrySet.size()]);
            Arrays.sort(entryArr, this.f32565d);
            int length = entryArr.length;
            bytesTruncated = 0;
            int i2 = 0;
            boolean z = false;
            int i3 = 0;
            while (i < length) {
                Map.Entry entry = entryArr[i];
                C4575Im c4575ImMo19520a = this.f32563b.mo19520a((String) entry.getKey());
                C4575Im c4575ImMo19520a2 = this.f32564c.mo19520a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) c4575ImMo19520a2.f30323a) + StringUtils.getUtf8BytesLength((String) c4575ImMo19520a.f30323a);
                if (z || utf8BytesLength2 + i3 > this.f30329a) {
                    i2++;
                    bytesTruncated += utf8BytesLength;
                    z = true;
                } else {
                    bytesTruncated = c4575ImMo19520a2.f30324b.getBytesTruncated() + c4575ImMo19520a.f30324b.getBytesTruncated() + bytesTruncated;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) c4575ImMo19520a2.f30323a) + StringUtils.getUtf8BytesLength((String) c4575ImMo19520a.f30323a) + i3;
                    map2.put((String) c4575ImMo19520a.f30323a, (String) c4575ImMo19520a2.f30323a);
                    i3 = utf8BytesLength3;
                }
                i++;
            }
            i = i2;
        } else {
            map2 = null;
            bytesTruncated = 0;
        }
        return new C4575Im(map2, new C4386B4(i, bytesTruncated));
    }
}
