package defpackage;

/* loaded from: classes.dex */
public interface M60 extends InterfaceC7400uN0 {
    public static final C0572Hc x0;
    public static final C0572Hc y0;
    public static final C0572Hc z0;

    static {
        Class cls = Integer.TYPE;
        x0 = new C0572Hc("camerax.core.imageInput.inputFormat", cls, null);
        y0 = new C0572Hc("camerax.core.imageInput.secondaryInputFormat", cls, null);
        z0 = new C0572Hc("camerax.core.imageInput.inputDynamicRange", CM.class, null);
    }

    int Y();

    CM k();

    int p();

    boolean t();
}
