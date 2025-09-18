package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class OV0 {
    public static final OV0 a;
    public static final OV0 b;
    public static final OV0 c;
    public static final OV0 d;
    public static final /* synthetic */ OV0[] e;

    static {
        OV0 ov0 = new OV0("PUSH", 0);
        a = ov0;
        OV0 ov02 = new OV0("MODAL", 1);
        b = ov02;
        OV0 ov03 = new OV0("TRANSPARENT_MODAL", 2);
        c = ov03;
        OV0 ov04 = new OV0("FORM_SHEET", 3);
        d = ov04;
        OV0[] ov0Arr = {ov0, ov02, ov03, ov04};
        e = ov0Arr;
        F02.c(ov0Arr);
    }

    public static OV0 valueOf(String str) {
        return (OV0) Enum.valueOf(OV0.class, str);
    }

    public static OV0[] values() {
        return (OV0[]) e.clone();
    }
}
