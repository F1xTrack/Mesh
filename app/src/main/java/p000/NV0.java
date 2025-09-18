package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NV0 {

    /* renamed from: a */
    public static final NV0 f7826a;

    /* renamed from: b */
    public static final NV0 f7827b;

    /* renamed from: c */
    public static final NV0 f7828c;

    /* renamed from: d */
    public static final NV0 f7829d;

    /* renamed from: e */
    public static final NV0 f7830e;

    /* renamed from: f */
    public static final NV0 f7831f;

    /* renamed from: g */
    public static final NV0 f7832g;

    /* renamed from: h */
    public static final NV0 f7833h;

    /* renamed from: i */
    public static final NV0 f7834i;

    /* renamed from: j */
    public static final /* synthetic */ NV0[] f7835j;

    static {
        NV0 nv0 = new NV0("DEFAULT", 0);
        f7826a = nv0;
        NV0 nv02 = new NV0("NONE", 1);
        f7827b = nv02;
        NV0 nv03 = new NV0("FADE", 2);
        f7828c = nv03;
        NV0 nv04 = new NV0("SLIDE_FROM_BOTTOM", 3);
        f7829d = nv04;
        NV0 nv05 = new NV0("SLIDE_FROM_RIGHT", 4);
        f7830e = nv05;
        NV0 nv06 = new NV0("SLIDE_FROM_LEFT", 5);
        f7831f = nv06;
        NV0 nv07 = new NV0("FADE_FROM_BOTTOM", 6);
        f7832g = nv07;
        NV0 nv08 = new NV0("IOS_FROM_RIGHT", 7);
        f7833h = nv08;
        NV0 nv09 = new NV0("IOS_FROM_LEFT", 8);
        f7834i = nv09;
        NV0[] nv0Arr = {nv0, nv02, nv03, nv04, nv05, nv06, nv07, nv08, nv09};
        f7835j = nv0Arr;
        F02.m2482c(nv0Arr);
    }

    public static NV0 valueOf(String str) {
        return (NV0) Enum.valueOf(NV0.class, str);
    }

    public static NV0[] values() {
        return (NV0[]) f7835j.clone();
    }
}
