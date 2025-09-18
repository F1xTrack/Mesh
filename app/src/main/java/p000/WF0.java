package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class WF0 {

    /* renamed from: a */
    public static final WF0 f13096a;

    /* renamed from: b */
    public static final /* synthetic */ WF0[] f13097b;

    static {
        WF0 wf0 = new WF0("DEFAULT", 0);
        f13096a = wf0;
        f13097b = new WF0[]{wf0, new WF0("SIGNED", 1), new WF0("FIXED", 2)};
    }

    public static WF0 valueOf(String str) {
        return (WF0) Enum.valueOf(WF0.class, str);
    }

    public static WF0[] values() {
        return (WF0[]) f13097b.clone();
    }
}
