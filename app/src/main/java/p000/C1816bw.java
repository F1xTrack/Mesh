package p000;

import android.util.Base64;
import java.lang.reflect.InvocationTargetException;

/* renamed from: bw */
/* loaded from: classes.dex */
public final /* synthetic */ class C1816bw implements InterfaceC10736q61 {

    /* renamed from: a */
    public final /* synthetic */ int f17236a;

    @Override // p000.InterfaceC10736q61
    public final Object get() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        switch (this.f17236a) {
            case 0:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    objInvoke.getClass();
                    return (InterfaceC11835yj1) objInvoke;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                byte[] bArr = new byte[12];
                C6875tG.f42974i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                return new C3917dG(new C6224jE(), 50000, 50000, 2500, 5000, false, 0);
            default:
                throw new IllegalStateException();
        }
    }
}
