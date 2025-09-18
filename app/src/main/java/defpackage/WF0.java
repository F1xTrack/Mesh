package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class WF0 {
    public static final WF0 a;
    public static final /* synthetic */ WF0[] b;

    static {
        WF0 wf0 = new WF0("DEFAULT", 0);
        a = wf0;
        b = new WF0[]{wf0, new WF0("SIGNED", 1), new WF0("FIXED", 2)};
    }

    public static WF0 valueOf(String str) {
        return (WF0) Enum.valueOf(WF0.class, str);
    }

    public static WF0[] values() {
        return (WF0[]) b.clone();
    }
}
