package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NV0 {
    public static final NV0 a;
    public static final NV0 b;
    public static final NV0 c;
    public static final NV0 d;
    public static final NV0 e;
    public static final NV0 f;
    public static final NV0 g;
    public static final NV0 h;
    public static final NV0 i;
    public static final /* synthetic */ NV0[] j;

    static {
        NV0 nv0 = new NV0("DEFAULT", 0);
        a = nv0;
        NV0 nv02 = new NV0("NONE", 1);
        b = nv02;
        NV0 nv03 = new NV0("FADE", 2);
        c = nv03;
        NV0 nv04 = new NV0("SLIDE_FROM_BOTTOM", 3);
        d = nv04;
        NV0 nv05 = new NV0("SLIDE_FROM_RIGHT", 4);
        e = nv05;
        NV0 nv06 = new NV0("SLIDE_FROM_LEFT", 5);
        f = nv06;
        NV0 nv07 = new NV0("FADE_FROM_BOTTOM", 6);
        g = nv07;
        NV0 nv08 = new NV0("IOS_FROM_RIGHT", 7);
        h = nv08;
        NV0 nv09 = new NV0("IOS_FROM_LEFT", 8);
        i = nv09;
        NV0[] nv0Arr = {nv0, nv02, nv03, nv04, nv05, nv06, nv07, nv08, nv09};
        j = nv0Arr;
        F02.c(nv0Arr);
    }

    public static NV0 valueOf(String str) {
        return (NV0) Enum.valueOf(NV0.class, str);
    }

    public static NV0[] values() {
        return (NV0[]) j.clone();
    }
}
