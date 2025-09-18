package defpackage;

import java.util.zip.ZipEntry;

/* loaded from: classes.dex */
public final class VR extends E6 implements Comparable {
    public final ZipEntry c;
    public final int d;

    public VR(String str, ZipEntry zipEntry, int i) {
        super(str, String.valueOf(zipEntry.getCrc()));
        this.c = zipEntry;
        this.d = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((String) this.a).compareTo((String) ((VR) obj).a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VR.class != obj.getClass()) {
            return false;
        }
        VR vr = (VR) obj;
        return this.c.equals(vr.c) && this.d == vr.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.d * 31);
    }
}
