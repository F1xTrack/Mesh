package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* renamed from: vY1 */
/* loaded from: classes.dex */
public abstract class AbstractC7625vY1 {
    public static final C1339Qy a(InterfaceC0173Bz interfaceC0173Bz) {
        if (interfaceC0173Bz.g(C0396Ev0.e) == null) {
            interfaceC0173Bz = interfaceC0173Bz.f(new C1271Qb0(null));
        }
        return new C1339Qy(interfaceC0173Bz);
    }

    public static final void b(InterfaceC0952Lz interfaceC0952Lz, CancellationException cancellationException) {
        InterfaceC1115Ob0 interfaceC1115Ob0 = (InterfaceC1115Ob0) interfaceC0952Lz.b().g(C0396Ev0.e);
        if (interfaceC1115Ob0 != null) {
            ((C2548cc0) interfaceC1115Ob0).l(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0952Lz).toString());
        }
    }

    public static final Object c(Function2 function2, AbstractC4286i71 abstractC4286i71) throws Throwable {
        JV0 jv0 = new JV0(abstractC4286i71, abstractC4286i71.getContext());
        Object objG = XZ1.g(jv0, jv0, function2);
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        return objG;
    }

    public static final boolean d(InterfaceC0952Lz interfaceC0952Lz) {
        InterfaceC1115Ob0 interfaceC1115Ob0 = (InterfaceC1115Ob0) interfaceC0952Lz.b().g(C0396Ev0.e);
        if (interfaceC1115Ob0 != null) {
            return interfaceC1115Ob0.isActive();
        }
        return true;
    }

    public static final boolean e(int i, int i2, C3394dS0 c3394dS0) {
        if (c3394dS0 == null) {
            if (((int) (i * 1.3333334f)) < 2048.0f || ((int) (i2 * 1.3333334f)) < 2048) {
                return false;
            }
        } else if (((int) (i * 1.3333334f)) < c3394dS0.a || ((int) (i2 * 1.3333334f)) < c3394dS0.b) {
            return false;
        }
        return true;
    }

    public static final boolean f(EncodedImage encodedImage, C3394dS0 c3394dS0) throws Throwable {
        if (encodedImage == null) {
            return false;
        }
        int rotationAngle = encodedImage.getRotationAngle();
        return (rotationAngle == 90 || rotationAngle == 270) ? e(encodedImage.getHeight(), encodedImage.getWidth(), c3394dS0) : e(encodedImage.getWidth(), encodedImage.getHeight(), c3394dS0);
    }
}
