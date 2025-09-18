package p000;

import java.util.HashMap;

/* renamed from: sU */
/* loaded from: classes.dex */
public enum EnumC6826sU {
    /* JADX INFO: Fake field, exist only in values array */
    MATRIX("matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    SATURATE("saturate"),
    /* JADX INFO: Fake field, exist only in values array */
    HUE_ROTATE("hueRotate"),
    /* JADX INFO: Fake field, exist only in values array */
    LUMINANCE_TO_ALPHA("luminanceToAlpha");


    /* renamed from: b */
    public static final HashMap f42454b = new HashMap();

    /* renamed from: a */
    public final String f42456a;

    static {
        for (EnumC6826sU enumC6826sU : values()) {
            f42454b.put(enumC6826sU.f42456a, enumC6826sU);
        }
    }

    EnumC6826sU(String str) {
        this.f42456a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f42456a;
    }
}
