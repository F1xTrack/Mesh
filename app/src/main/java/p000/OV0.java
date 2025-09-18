package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class OV0 {

    /* renamed from: a */
    public static final OV0 f8460a;

    /* renamed from: b */
    public static final OV0 f8461b;

    /* renamed from: c */
    public static final OV0 f8462c;

    /* renamed from: d */
    public static final OV0 f8463d;

    /* renamed from: e */
    public static final /* synthetic */ OV0[] f8464e;

    static {
        OV0 ov0 = new OV0("PUSH", 0);
        f8460a = ov0;
        OV0 ov02 = new OV0("MODAL", 1);
        f8461b = ov02;
        OV0 ov03 = new OV0("TRANSPARENT_MODAL", 2);
        f8462c = ov03;
        OV0 ov04 = new OV0("FORM_SHEET", 3);
        f8463d = ov04;
        OV0[] ov0Arr = {ov0, ov02, ov03, ov04};
        f8464e = ov0Arr;
        F02.m2482c(ov0Arr);
    }

    public static OV0 valueOf(String str) {
        return (OV0) Enum.valueOf(OV0.class, str);
    }

    public static OV0[] values() {
        return (OV0[]) f8464e.clone();
    }
}
