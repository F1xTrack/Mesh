package defpackage;

import android.util.Base64;
import java.lang.reflect.InvocationTargetException;

/* renamed from: bw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2417bw implements InterfaceC6587q61 {
    public final /* synthetic */ int a;

    @Override // defpackage.InterfaceC6587q61
    public final Object get() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    objInvoke.getClass();
                    return (InterfaceC8228yj1) objInvoke;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                byte[] bArr = new byte[12];
                C7187tG.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                return new C3357dG(new C5272jE(), 50000, 50000, 2500, 5000, false, 0);
            default:
                throw new IllegalStateException();
        }
    }
}
