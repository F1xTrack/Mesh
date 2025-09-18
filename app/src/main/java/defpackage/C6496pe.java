package defpackage;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: pe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6496pe {
    public static final C6496pe d;
    public static final C6496pe e;
    public static final C6496pe f;
    public static final C6496pe g;
    public static final C6496pe h;
    public static final C6496pe i;
    public static final C6496pe j;
    public static final HashSet k;
    public static final List l;
    public final int a;
    public final String b;
    public final List c;

    static {
        C6496pe c6496pe = new C6496pe(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        d = c6496pe;
        C6496pe c6496pe2 = new C6496pe(5, "HD", Collections.singletonList(new Size(1280, 720)));
        e = c6496pe2;
        C6496pe c6496pe3 = new C6496pe(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f = c6496pe3;
        C6496pe c6496pe4 = new C6496pe(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        g = c6496pe4;
        C6496pe c6496pe5 = new C6496pe(0, "LOWEST", Collections.emptyList());
        h = c6496pe5;
        C6496pe c6496pe6 = new C6496pe(1, "HIGHEST", Collections.emptyList());
        i = c6496pe6;
        j = new C6496pe(-1, "NONE", Collections.emptyList());
        k = new HashSet(Arrays.asList(c6496pe5, c6496pe6, c6496pe, c6496pe2, c6496pe3, c6496pe4));
        l = Arrays.asList(c6496pe4, c6496pe3, c6496pe2, c6496pe);
    }

    public C6496pe(int i2, String str, List list) {
        this.a = i2;
        this.b = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6496pe)) {
            return false;
        }
        C6496pe c6496pe = (C6496pe) obj;
        return this.a == c6496pe.a && this.b.equals(c6496pe.b) && this.c.equals(c6496pe.c);
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConstantQuality{value=" + this.a + ", name=" + this.b + ", typicalSizes=" + this.c + "}";
    }
}
