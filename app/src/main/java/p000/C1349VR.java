package p000;

import java.util.zip.ZipEntry;

/* renamed from: VR */
/* loaded from: classes.dex */
public final class C1349VR extends AbstractC0259E6 implements Comparable {

    /* renamed from: c */
    public final ZipEntry f12563c;

    /* renamed from: d */
    public final int f12564d;

    public C1349VR(String str, ZipEntry zipEntry, int i) {
        super(str, String.valueOf(zipEntry.getCrc()));
        this.f12563c = zipEntry;
        this.f12564d = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((String) this.f2473a).compareTo((String) ((C1349VR) obj).f2473a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1349VR.class != obj.getClass()) {
            return false;
        }
        C1349VR c1349vr = (C1349VR) obj;
        return this.f12563c.equals(c1349vr.f12563c) && this.f12564d == c1349vr.f12564d;
    }

    public final int hashCode() {
        return this.f12563c.hashCode() + (this.f12564d * 31);
    }
}
