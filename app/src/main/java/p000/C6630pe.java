package p000;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: pe */
/* loaded from: classes.dex */
public final class C6630pe {

    /* renamed from: d */
    public static final C6630pe f40248d;

    /* renamed from: e */
    public static final C6630pe f40249e;

    /* renamed from: f */
    public static final C6630pe f40250f;

    /* renamed from: g */
    public static final C6630pe f40251g;

    /* renamed from: h */
    public static final C6630pe f40252h;

    /* renamed from: i */
    public static final C6630pe f40253i;

    /* renamed from: j */
    public static final C6630pe f40254j;

    /* renamed from: k */
    public static final HashSet f40255k;

    /* renamed from: l */
    public static final List f40256l;

    /* renamed from: a */
    public final int f40257a;

    /* renamed from: b */
    public final String f40258b;

    /* renamed from: c */
    public final List f40259c;

    static {
        C6630pe c6630pe = new C6630pe(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f40248d = c6630pe;
        C6630pe c6630pe2 = new C6630pe(5, "HD", Collections.singletonList(new Size(1280, 720)));
        f40249e = c6630pe2;
        C6630pe c6630pe3 = new C6630pe(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f40250f = c6630pe3;
        C6630pe c6630pe4 = new C6630pe(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f40251g = c6630pe4;
        C6630pe c6630pe5 = new C6630pe(0, "LOWEST", Collections.emptyList());
        f40252h = c6630pe5;
        C6630pe c6630pe6 = new C6630pe(1, "HIGHEST", Collections.emptyList());
        f40253i = c6630pe6;
        f40254j = new C6630pe(-1, "NONE", Collections.emptyList());
        f40255k = new HashSet(Arrays.asList(c6630pe5, c6630pe6, c6630pe, c6630pe2, c6630pe3, c6630pe4));
        f40256l = Arrays.asList(c6630pe4, c6630pe3, c6630pe2, c6630pe);
    }

    public C6630pe(int i, String str, List list) {
        this.f40257a = i;
        this.f40258b = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f40259c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6630pe)) {
            return false;
        }
        C6630pe c6630pe = (C6630pe) obj;
        return this.f40257a == c6630pe.f40257a && this.f40258b.equals(c6630pe.f40258b) && this.f40259c.equals(c6630pe.f40259c);
    }

    public final int hashCode() {
        return ((((this.f40257a ^ 1000003) * 1000003) ^ this.f40258b.hashCode()) * 1000003) ^ this.f40259c.hashCode();
    }

    public final String toString() {
        return "ConstantQuality{value=" + this.f40257a + ", name=" + this.f40258b + ", typicalSizes=" + this.f40259c + "}";
    }
}
